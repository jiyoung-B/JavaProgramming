package jy;

import java.util.Arrays;
import java.util.Scanner;

import static examples.EX10.computeSungJuk;

public class SungJukV1Service {

    private Scanner sc = null;
    private SungJukVO[] sjs = null;
    private int idx = 0;
    public SungJukV1Service(){
        sc = new Scanner(System.in);
        sjs = new SungJukVO[10]; // sjs 배열 초기화
    }

    public String displayMenu(){

        StringBuilder sb = new StringBuilder();
        sb.append("---------------------------\n")
          .append(" 성적 처리 프로그램 v1 \n")
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
        String menu = sc.next(); // 작업할 메뉴 입력받기

        return menu;

    }
    public void processMenu(String menu){

        switch (menu) {
            case "1": newSungJuk(); break;
            case "2": readSungJuk(); break;
            case "3": readOneSungJuk(); break;
            case "4": modifySungJuk(); break;
            case "5": removeSungJuk(); break;
            case "0": System.exit(0);break;
            default:
                System.out.println("\n잘못 입력햐셨습니다!\n");
        }

    }




    private void readOneSungJuk() {
    }
    private void modifySungJuk() {

    }
    private void removeSungJuk() {
    }
    public SungJukVO[] readSungJuk(){
        String fmt = "%s %d %d %d\n";
        for (SungJukVO sj : sjs) {

            if(sj != null)
                System.out.printf(fmt, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat());
        } // sjs 배열에 저장된 모든 성적데이터 출력

        return sjs;


    }

    public boolean newSungJuk(){
        System.out.print("이름은?");
        String name = sc.next();
        System.out.print("국어?");
        int kor = sc.nextInt();
        System.out.print("영어?");
        int eng = sc.nextInt();
        System.out.print("수학?");
        int mat = sc.nextInt();

       SungJukVO sj = new SungJukVO(name, kor, eng, mat);
       computeSungJuk(sj); // 성적 처리
        sjs[idx++] = sj; // 처리된 성적데이터 배열에 저장 후 +1
        System.out.println("성적 생성"+ Arrays.toString(sjs));
        System.out.println(Arrays.toString(new SungJukVO[] {sjs[0]}));
        return false;

    }

    private void computeSungJuk(SungJukVO sj) {
        sj.setTot( sj.getKor() + sj.getEng() + sj.getMat() );
        sj.setAvg( (double) sj.getTot() / 3 );
        switch ((int)(sj.getAvg()/10)) {
            case 10: case 9: sj.setGrd('수'); break;
            case 8: sj.setGrd('우'); break;
            case 7: sj.setGrd('미'); break;
            case 6: sj.setGrd('양'); break;
            default: sj.setGrd('가'); break;
        }
    }





}
