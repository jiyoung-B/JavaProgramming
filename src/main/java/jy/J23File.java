package jy;

import sun.text.normalizer.CharTrie;

import java.io.*;
import java.util.Scanner;

public class J23File {
    // 스트림stream
    // 데이터를 비트등의 단위로 조각내어 일련의 연속성을
    // 갖도록 만든 데이터의 나열(sequence 데이터의 흐름)
    // 일반적으로 스트림이라하면 이러한 데이터의 열과
    // 이것을 활용하기 위해 사용하는 모듈을 합쳐 부르는 것
    // 즉, 스트림은 데이터를 읽고 쓰기 위한 공통된 방법 제공

    // 자바에서 스트림 처리방식은 모든 데이터를 '바이트'로
    // 보는 바이트 단위 스트림과 문자 데이터만을 위한
    // 문자 단위 스트림등이 있음

    // 데이터 영속성persistence
    // 데이터를 생성한 프로그램이 종료되더라도
    // 사라지지 않는 데이터의 특성을 의미
    // 이것을 위해 파일 시스템이나 관계형 데이터베이스 이용
    public static void main(String[] args){
        // 문자 스트림 다루기
        // ex) 자신의 이름, 키, 나이를 파일에 저장
        /*Scanner sc = new Scanner(System.in);
        System.out.print("이름은? ");
        String name = sc.next();
        System.out.print("키? ");
        int height = sc.nextInt();
        System.out.print("나이? ");
        int age = sc.nextInt();
*/
        String name = "abc123";
        int height = 123;
        int age = 465;

        // 입력받은 내용을 파일에 저장
        // 데이터를 저장할 위치와 파일명 지정
        String fname = "c:/Java/info.txt";

        // 파일쓰기(문자 출력스트림) 객체 생성
        FileWriter fw = null;
        try {
            fw = new FileWriter(fname);

            // 파일에 내용 쓰기 : write(내용)

            fw.write(name + "\n");
            fw.write(height + "\n");
            fw.write(age + "\n");

        } catch (Exception ex) {
            ex.getMessage();
        } finally {
            // 파일쓰기가 끝나면 작업 종료(해줘야 기록이 남아)
            if(fw!=null) {
                try {
                    fw.close();
                } catch (Exception ex) {
                    ex.getMessage();
                }
            }
        }

        // 파일에 저장된 데이터 화면에 출력1 - 문자 하나씩 읽음
        // 파일읽기(문자 입력스트림) 객체 생성
        FileReader fr = null;
        try {
            fr = new FileReader(fname);

            int ch = 0;
            // 파일에서 하나의 문자를 읽어옴
            // 읽어온 문자의 코드값이 -1이 아니라면
            while ((ch = fr.read()) != -1 ){
                // 문자로 변환해서 출력
                System.out.print((char)ch);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            if(fr != null){
                try {
                    fr.close();
                } catch (Exception ex) {
                    ex.getMessage();
                }
            }

        }

        // 파일에 저장된 데이터 화면에 출력2 - 한 행씩 읽음
        // BufferedReader를 이용하면 입력속도를 높일 수 있음
        BufferedReader br = null;
        try {
            fr = new FileReader(fname);
            br = new BufferedReader(fr);

            while(br.ready()){ // 읽어올 데이터가 있는지 확인
                // 만일, 있다면 한 행씩 읽어서 화면에 출력
                System.out.println(br.readLine());
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }finally {
            if( br != null){
                try {
                    br.close();
                    fr.close();
                } catch (Exception ex) {
                    ex.getMessage();
                }
            }
        }







    }
}
