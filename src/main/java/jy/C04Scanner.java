package jy;

import java.util.Scanner;    // 1

public class C04Scanner {
    public static void main(String[] args) {
        // 데이터 입력 : Scanner
        Scanner sc = new Scanner(System.in);   // 2

        // 이름을 입력받음
        //System.out.println("이름은?");
        //String name = sc.next();               // 3
        //System.out.printf("이름은 %s 입니다", name);


        // ex) 성적 처리프로그램 v2
        // 이름, 국어, 영어, 수학을 키보드로 입력받아
        // 총점, 평균, 학점을 계산한 뒤 결과 출력
        System.out.print("이름은? ");
        String name = sc.next();
        System.out.print("국어는? ");
        int kor = sc.nextInt();
        System.out.print("영어는? ");
        int eng = sc.nextInt();
        System.out.print("수학은? ");
        int mat = sc.nextInt();

        int tot = kor + eng + mat;
        double avg = (double) tot / 3;
        char grd = avg >= 90 ? '수' :
                avg >= 80 ? '우' :
                        avg >= 70 ? '미' :
                                avg >= 60 ? '양' : '가';

        System.out.printf("이름 : %s\n", name);
        System.out.printf("국어 : %d\n", kor);
        System.out.printf("영어 : %d\n", eng);
        System.out.printf("수학 : %d\n", mat);
        System.out.printf("총점 : %d\n", tot);
        System.out.printf("평균 : %.1f\n", avg);
        System.out.printf("학점 : %c\n", grd);


        // 종료시 sc 객체 제거
        sc.close();                           // 4
    }
}