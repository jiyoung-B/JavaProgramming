package jy.project.sungjuk.service;

import jy.project.sungjuk.dao.SungJukV3DAO;
import jy.project.sungjuk.dao.SungJukV3DAOImpl;
import jy.project.sungjuk.model.SungJukVO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SungJukV3ServiceImpl implements SungJukV1cService {

    private Scanner sc = null;
    private List<SungJukVO> sjs = null;
    private SungJukV3DAO sjdao = null;


    public SungJukV3ServiceImpl() {
        sc = new Scanner(System.in);
        sjdao = new SungJukV3DAOImpl();

        // 프로그램 시작시 미리 파일에 저장된 데이터를 모두 읽어서 arraylist 객체에 저장
        sjs = sjdao.loadSungJuk();
    }

    // 성적 프로그램 메뉴
    public int displayMenu() {
        int menu = -1;

        StringBuilder sb = new StringBuilder();
        sb.append("---------------------------\n")
                .append(" 성적 처리 프로그램 v3 \n")
                .append("---------------------------\n")
                .append("1. 성적데이터 입력\n")
                .append("2. 성적데이터 전체 조회 \n")
                .append("3. 성적데이터 상세 조회 \n")
                .append("4. 성적데이터 수정\n")
                .append("5. 성적데이터 삭제 \n")
                .append("0. 프로그램 종료\n")
                .append("---------------------------\n")
                .append("작업을 선택하세요 : \n");
        System.out.print(sb);
        try {
            menu = sc.nextInt();  // a\n 뒤에 문자가 붙어 처리된다. next()로 받을 때는 문제 없어.
        } catch (InputMismatchException ex) { // 숫자가 아닌 그 이외 문자 입력시 menu에 -1 대입
            // nextInt 시 문자를 입력했을때 입력 버퍼에 남은 문자 찌꺼기를 제거
            sc.nextLine(); // 오류 시 무한루프에 빠지므로 입력시키므로써 글자 하나 소진시킨다.
            menu = -1;

        }

        return menu;

    }

    public void processMenu(int menu) {
        switch (menu) {
            case 1:
                newSungJuk();
                break;
            case 2:
                readSungJuk();
                break;
            case 3:
                readOneSungJuk();
                break;
            case 4:
                modifySungJuk();
                break;
            case 5:
                removeSungJuk();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("\n>> 잘못 입력햐셨습니다! <<\n");
        }
    }

    public void readOneSungJuk() {
        // 이름입력 -> 대상검색 -> 대상출력
        System.out.print("조회할 학생이름은? ");
        String name = sc.next();

        SungJukVO one = null;
        try {
            for (SungJukVO sj : sjs) {
                if (sj.getName().equals(name)) {
                    one = sj;
                    break;
                }
            }
        } catch (NullPointerException ex) {
        }

        if (one != null) {
            System.out.printf("\n%s\n", one);
        } else {
            System.out.println("\n찾는 데이터가 없습니다!\n");
        }
    }

    public void modifySungJuk() {
        // 이름입력 -> 대상검색 -> 새로운데이터입력 -> 성적처리
        System.out.print("수정할 학생이름은?");
        String name = sc.next();

        for (int i = 0; i < sjs.size(); i++) {
            try {
                if (sjs.get(i).getName().equals(name)) {
                    System.out.print("국어는? ");
                    int kor = sc.nextInt();
                    System.out.print("영어은? ");
                    int eng = sc.nextInt();
                    System.out.print("수학은? ");
                    int mat = sc.nextInt();

                    SungJukVO newOne = new SungJukVO(name, kor, eng, mat);
                    computeSungJuk(newOne);
                    sjs.set(i, newOne); // 기존 성적데이터 위치에 새롭게 생성한 객체 대입
                    System.out.println("\n수정완료!!\n");
                    System.out.println(sjs);
                    break;
                }
            } catch (InputMismatchException ex) {
                System.out.println("\n잘못 입력하셨습니다... 다시 시도하세요!\n");
                sc.nextLine();
                return;
            }
        }


        // ArrayList에 저장된 모든 성적데이터를 파일에 기록 후 종료하도록..!
        sjdao.writeSungJuk(sjs);

    }

    public void removeSungJuk() {
        // 이름입력 -> 대상검색 -> 대상출력
        System.out.println("삭제할 학생이름?");
        String name = sc.next();


        for (SungJukVO sj : sjs) {
            if (sj.getName().equals(name)) {
                sjs.remove(sj); // 대상을 list에서 삭제
                System.out.println("\n삭제되었습니다!\n");
                System.out.println(sjs.get(sjs.size() - 1));
                break;
            }
        }

        // ArrayList에 저장된 모든 성적데이터를 파일에 기록 후 종료하도록..!
        sjdao.writeSungJuk(sjs);

    }

    public void readSungJuk() {
        String fmt = "%s %d %d %d\n";

        try {
            for (SungJukVO sj : sjs) {
                // if(sj != null)
                System.out.printf(fmt, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat());
            } // sjs 배열에 저장된 모든 성적데이터 출력
        } catch (NullPointerException ex) {
            //System.out.println("조회할 정보가 없습니다!");
        }
        //return sjs;
    }




    public void newSungJuk() {

        String name = "";
        int kor = 0, eng = 0, mat = 0;
        try {
            System.out.print("이름은?");
            name = sc.next();
            System.out.print("국어?");
            kor = sc.nextInt();
            System.out.print("영어?");
            eng = sc.nextInt();
            System.out.print("수학?");
            mat = sc.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("\n잘못 입력하셨습니다... 다시 시도하세요!\n");
            sc.nextLine();
            return;
        }


        SungJukVO sj = new SungJukVO(name, kor, eng, mat);
        computeSungJuk(sj);  // 성적 처리
        // sjs.add(sj);        // 처리된 성적데이터 list에 저장

        // 성적데이터 파일에 저장
        if (sjdao.saveSungJuk(sj))
            System.out.println("\n저장 성공!!\n");

        // 방금 추가된 성적 데이터를 sjs에도 반영
        sjs.add(sj);


    }





    public void computeSungJuk(SungJukVO sj) {
        sj.setTot(sj.getKor() + sj.getEng() + sj.getMat());
        sj.setAvg((double) sj.getTot() / 3);
        switch ((int) (sj.getAvg() / 10)) {
            case 10:
            case 9:
                sj.setGrd('수');
                break;
            case 8:
                sj.setGrd('우');
                break;
            case 7:
                sj.setGrd('미');
                break;
            case 6:
                sj.setGrd('양');
                break;
            default:
                sj.setGrd('가');
                break;
        }
    }


}
