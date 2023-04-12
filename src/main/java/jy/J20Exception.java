package jy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class J20Exception {
    // 오류 : 예외exception와 에러
    // 자바프로그램 작성시 문법에 맞지 않게 코드를 작성하면
    // 컴파일 에러가 발생함
    // 또한, 코드가 제대로 작성되었다 하더라도 실행중에
    // 예상치 못한 상황으로 실행 에러가 발생할 수 있음
    // 이처럼 프로그램 실행중에 예상치 못한 상황으로
    // 프로그램이 영향을 받는 것을 오류라 하고 에러와 예외로 구분

    // 일반적으로 에러error는 시스템 단계에서 프로그램에 심각한 문제를
    // 야기해서 실행중인 프로그램을 강제 중단시킴
    // -> 네트워크 상 접속 오류, 메모리 부족
    // 이러한 에러는 개발자가 처리할 수 없음

    // 반면, 예외는 에러와 마찬가지로 실행중인 프로그램을 중단시키지만
    // 발생할 수 있는 상황을 미리 예측하여 코드를 통해
    // 프로그램 실행 중단을 방지할수 있음

    public static void main(String[] args) {
        // 예외처리전 1
        System.out.println("프로그램 시작1");
        System.out.println("프로그램 끝1");
        System.out.println("--------------");

        // 예외처리전 2
        System.out.println("프로그램 시작2");
        int a = 10, b = 20;
        int c = a + b;
        System.out.println(c);
        System.out.println("프로그램 끝2");
        System.out.println("--------------");

        // 예외처리전 3
        /*System.out.println("프로그램 시작3");
        int d = 10, e = 0;
        int f = d / e;    // 예외발생! - 실행중단!
        System.out.println(f);
        System.out.println("프로그램 끝3");
        System.out.println("--------------");*/

        // 예외처리 구문1
        // try
        //     예외발생 가능성이 있는 코드
        // catch (예외종류)
        //     예외처리 핸들러

        // 예외처리전 4a
        System.out.println("프로그램 시작4a");
        int d = 10, e = 0;
        try {
            int f = d / e;    // 예외발생! - 실행중단!
            System.out.println(f);
        } catch (Exception ex) { // 모든 예외상황을 감지해서 처리
            System.out.println(">> 예외발생!! <<");
            System.out.println(ex.getMessage());
        }
        System.out.println("프로그램 끝4a");
        System.out.println("--------------");

        // ex) 1~9사이 정수만 입력받아 화면에 출력하는
        // 코드를 작성하세요
        // 단, 예외처리코드를 이용해서 문자를 입력했을때에는
        // "1~9사이 정수만 입력가능합니다"라고 출력하세요
        // => Scanner, nextInt 사용
        Scanner sc = new Scanner(System.in);
        System.out.print("정수는(1~9)? ");

        try {
            int num = sc.nextInt();
            System.out.println("입력한 정수 : " + num);
        } catch (Exception ex) {
            System.out.println("1~9까지만 입력가능!!");
        }


        // 예외처리전 4b
        System.out.println("프로그램 시작4b");
        try {
            int f = d / e;    // 예외발생! - 실행중단!
            System.out.println(f);
        } catch (ArithmeticException ex) { // 특정 상황에 맞는 구체적 예외
            System.out.println(">> 나누기 연산시 0은 사용불가! <<");
        }
        System.out.println("프로그램 끝4b");
        System.out.println("--------------");

        // ex) 1~9사이 정수만 입력받아 화면에 출력하는
        // 코드를 작성하세요 (구체적 예외지정)
        System.out.print("정수는(1~9)? ");

        try {
            int num = sc.nextInt();
            System.out.println("입력한 정수 : " + num);
        } catch (InputMismatchException ex) {
            System.out.println("숫자만 입력가능!!");
        }

        // ex) 학생3명의 이름을 입력받아 화면에 출력하는 코드를 작성하세요
        // 단, 학생수를 초과해서 입력했을때 발생하는 예외도 처리함!
        String[] names = new String[3];
        try {
            for (int i = 0; i <= names.length; i++) {
                System.out.print("학생 이름을 입력하세요");
                names[i] = sc.next();
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("초과입력 금지!");
        }

        // 예외종류
        // 비검사형 예외 : unchecked exception (런타임 예외)
        // 검사형 예외 : checked exception (컴파일타임 예외)

        // 비검사형 예외
        // 명시적인 예외처리를 강제하지 않음 - 개발자에 맡김
        // 예외발생 확인 시점은 실행시임
        // ArithmeticException
        // ArrayIndexOutOfBoundsException
        // InputMismatchException

        // 검사형 예외
        // 명시적인 예외처리를 강제함 (반드시!)
        // 예외발생 확인 시점은 컴파일시임
        // IOException
        // ClassNotFoundException
        // 단, 검사형 예외를 피하고 싶으면
        // throws를 이용해서 예외처리를 외부로 떠넘기면 됨 (비추!)

        // sungjuk.data 파일을 읽어서 화면에 출력
        File f = new File("c:/Java/sungjuk.data");
        try {
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException ex) {
            System.out.println("읽어드릴 파일이 존재하지 않습니다!");
        }

        System.out.println("");

        // 사용자 정의 예외 - 개발자 입맛에 맞는 예외메세지 출력 가능
        // 사용자 정의 예외는 Exception 클래스를 상속해서 만들어야 함
        // 예외처리 5
        System.out.println("프로그램 시작5");
        try {
            try {
                int g = d / e;    // 예외발생! - 실행중단!
                System.out.println(g);
            } catch (Exception ex) {
                throw new ZeroDivideException("0으로 나눌수 없습니다!");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("프로그램 끝5");
        System.out.println("--------------");
    }
}
// 사용자 정의 예외 - 0으로 나누려고 할 때 발생하는 예외에 대한 예외클래스
class ZeroDivideException extends Exception {
    public ZeroDivideException(String message) {
        super(message);
    }
}