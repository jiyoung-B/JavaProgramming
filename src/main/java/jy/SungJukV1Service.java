package jy;

import java.util.Scanner;

public class SungJukV1Service {

    private Scanner sc = null;
   // private SungJukVO sj = null;
    private SungJukVO[] sjs = null;
    private int count = 0;
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
            case "1": break; //registerSungJuk()
            case "2": ;break; //showSungJuks()
            case "3": break;
            case "4": break;
            case "5": break;
            case "0": System.exit(0);break; // 정상 종료
            default:
                System.out.println("\n잘못 입력햐셨습니다!\n");
        }

    }
//    public SungJukVO[] showSungJuks(){
//        System.out.println("성적 리스트 조회");
//        for (int i = 0; i < count; i++) {
//            System.out.println(sjs[i]);
//        }
//
//        return sjs;
//
//
//    }
//    public boolean registerSungJuk(){
//        System.out.print("이름은?");
//        String name = sc.next();
//        System.out.print("국어?");
//        int kor = sc.nextInt();
//        System.out.print("영어?");
//        int eng = sc.nextInt();
//        System.out.print("수학?");
//        int mat = sc.nextInt();
//
//        sj = new SungJukVO(name, kor, eng, mat); // lazy initialization
//        sj.setTot( sj.getKor() + sj.getEng() + sj.getMat() );
//        sj.setAvg( (double) sj.getTot() / 3 );
//        switch ((int)(sj.getAvg()/10)) {
//            case 10: case 9: sj.setGrd('수'); break;
//            case 8: sj.setGrd('우'); break;
//            case 7: sj.setGrd('미'); break;
//            case 6: sj.setGrd('양'); break;
//            default: sj.setGrd('가'); break;
//        }
//        System.out.println("성적 생성"+sj);
//
//        return false;
//
//    }



}
