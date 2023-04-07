package jy;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class J10Method {
    public static void main(String[] args) {
        // 메서드
        // 특정 작업(코드블록)을 여러 번 반복해야 하는 경우
        // 해당 작업을 재사용 가능한 구조로 만들때 사용
        // 즉, 어떤 작업을 수행하기 위해
        // 필요한 코드들의 집합을 의미하고,
        // 이것들을 재사용하기 위해 모듈형태로 작성한 것

        // 메서드 호출
        sayHello();

        sayHello2("Java");
        sayHello2("HTML");

        System.out.println( sayHello3("JavaScript") );

        int year = 2020;
        System.out.println( computeLeapYear(year) );

        String time = "17:17:17";
        System.out.println( showAMPM(time) );

        System.out.println( showStarPyramid(5) );
        System.out.println( showStarPyramid(7) );
        System.out.println( showStarPyramid(3) );

        // ex) 성적 처리프로그램 v4
        String[] names = new String[3];
        int[] kors = new int[3];
        int[] engs = new int[3];
        int[] mats = new int[3];

        int[] tots = new int[3];
        double[] avgs = new double[3];
        char[] grds = new char[3];

        readSungJuk(names,kors,engs,mats);
        computeSungJuk(kors,engs,mats, tots,avgs,grds);
        printSungJuk(names,kors,engs,mats, tots,avgs,grds);

        // 만일, 2 과목이 추가된다면?
        // 메소드 호출부 수정, 메서드 선언부 수정
        // 과목 입력 수정, 성적처리 수정, 성적 출력 수정

    }

    // 인삿말 v1 - 메서드 정의
    // 접근제한자 static 반환유형 메서드명(매개변수목록)
    public static void sayHello() {
        System.out.println("Hello, World!!");
    };

    // 인삿말 v2 - 메서드 매개변수 사용
    public static void sayHello2(String msg) {
        System.out.printf("Hello, %s!!\n", msg);
    };

    // 인삿말 v3 - 반환형 메서드 선언
    public static String sayHello3(String msg) {
        return String.format("Hello, %s!!\n", msg);
    };

    // 년도를 입력하면 윤년여부를 계산해서 출력
    // 윤년여부를 계산하는 반환형 메서드 : computeLeapYear
    public static String computeLeapYear(int year) {
        String result = "평년입니다";

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            result = "윤년입니다";

        return String.format("%d 년은 %s\n", year, result);
    }

    // 시분초(17:17:17)를 입력받아
    // 오전, 오후 구분하여 출력 : showAMPM
    public static String showAMPM(String time) {
        String result = "오전입니다";
        int hour = Integer.parseInt(time.charAt(0) + "" + time.charAt(1));

        if (hour >= 12) result = "오후입니다";

        return String.format("%d 시는 %s\n", hour, result);
    }


    // 층 수를 입력받아
    // 별* 피라미드 출력 : showStarPyramid
    public static String showStarPyramid(int floor) {
        String result = "";

        for (int i = 1; i <= floor; i++) {  // 행
            for (int j = 1; j <= i; j++) {  // 열
                result += "*";
            }
            result += "\n";
        }

        return result;
    }

    // ex) 성적 처리프로그램 v4
    // 3명의 학생에 대해 이름, 국어, 영어, 수학을 입력받아
    // 총점, 평균, 학점을 계산한 뒤 결과 출력
    // 학점은 수우미양가 중 하나가 출력되도록 함
    // 단, 메서드로 기능을 모듈화 시켜 작성

    public static void readSungJuk(
            String[] names, int[] kors, int[] engs, int[] mats) {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            System.out.print((i + 1) + "번 학생 이름은? ");
            names[i] = sc.next();
            System.out.print((i + 1) + "번 학생 국어는? ");
            kors[i] = sc.nextInt();
            System.out.print((i + 1) + "번 학생 영어는? ");
            engs[i] = sc.nextInt();
            System.out.print((i + 1) + "번 학생 수학은? ");
            mats[i] = sc.nextInt();
        } // 성적 데이터 입력
    }

    public static void computeSungJuk(
            int[] kors, int[] engs, int[] mats,
            int[] tots, double[] avgs, char[] grds) {

        for (int i = 0; i < kors.length; i++) {
            tots[i] = kors[i] + engs[i] + mats[i];
            avgs[i] = tots[i] / 3;

            switch ((int)(avgs[i]/10)) {
                case 10:
                case 9: grds[i] = '수'; break;
                case 8: grds[i] = '우'; break;
                case 7: grds[i] = '미'; break;
                case 6: grds[i] = '양'; break;
                default: grds[i] = '가'; break;
            }
        }
    }

    public static void printSungJuk(
            String[] names, int[] kors, int[] engs, int[] mats,
            int[] tots, double[] avgs, char[] grds) {

        String result = "";
        for (int i = 0; i < names.length; i++) {
            result += String.format("%s %d %d %d \n",
                    names[i], kors[i], engs[i], mats[i]);
            result += String.format("%d %.1f %c \n",
                    tots[i], avgs[i], grds[i]);
        } // 결과 출력 준비

        System.out.println(result);
    }


}