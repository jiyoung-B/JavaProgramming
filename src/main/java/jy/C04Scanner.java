package jy;

import java.util.Scanner;   // 1

public class C04Scanner {

    public static void main(String[] args) {
        // 데이터 입력 : Scanner
        Scanner sc = new Scanner(System.in);    // 2

        // 이름을 입력받음
//        System.out.println("이름은?");
//        String name = sc.next();    // 3
//        System.out.println("실수는?");
//        float fl = sc.nextFloat();    // 3
//        System.out.printf("\n이름은 %s 입니다", name);
//        System.out.printf("\n이름은 %.3f 입니다", fl);


        // ex) 성적 처리프로그램 v2
        // 이름, 국어, 영어, 수학을 키보드로 입력받아
        // 총점, 평균, 학점을 계산한 뒤 결과 출력
        System.out.print("이름은? ");
        String fname = sc.next();
        System.out.print("국어점수? ");
        int kor = sc.nextInt();
        System.out.print("영어점수? ");
        int eng = sc.nextInt();
        System.out.print("수학점수? ");
        int math = sc.nextInt();

        int tot = kor + eng + math;
        double avg = (double)tot / 3;
        char grade = avg >= 90 ? '수' :
                     avg >= 80 ? '우' :
                     avg >= 70 ? '미' :
                     avg >= 60 ? '양' : '가';



        System.out.printf("\n %s, %d, %d, %d ", fname, kor, eng, math);
        System.out.printf("\n 총점: %d, 평균 : %.3f, 학점 : %s ", tot, avg, grade);






        // 종료시 sc 객체 제거
        sc.close();     // 4

    }
}
