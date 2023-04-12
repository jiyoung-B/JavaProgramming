package jy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class J19Package {
    public static void main(String[] args) {
        // Math 클래스
        int a = 4, b = 10, c = 1;
        double d = 4.51, e = 5.41;

        System.out.println(Math.max(a, b) +"/"+ Math.max(b, c));
        System.out.println(Math.min(b, c) +"/"+ Math.min(a, b));

        System.out.println(Math.round(d) +"/"+ Math.round(e));
        System.out.println(Math.ceil(d) +"/"+ Math.floor(d));
        System.out.println(Math.ceil(e) +"/"+ Math.floor(e));

        double r = Math.random();
        System.out.println(r);
        System.out.println((int)(r * 5));   // 0 ~ 4 난수
        System.out.println((int)(r * 10));  // 0 ~ 9 난수
        System.out.println(((int)(r * 5)) + 1);   // 1 ~ 5 난수
        System.out.println(((int)(r * 10)) + 1);  // 1 ~ 10 난수

        // 1 ~ 45 사이 임의의 난수 6개 생성
        for (int i = 1; i <= 6; i++) {
            r = Math.random();
            System.out.print(((int)(r * 45)) + 1 + " ");
        }
        System.out.println("");

        // String 클래스
        // ex) 파일명이 abc123.png라 할때
        // 파일명과 확장자를 분리해서 출력
        //String filename = "abc123.png";
        String filename = "abc123xyz.jpeg";

        //String fname = filename.substring(0, 6);
        String fname = filename.substring(0, filename.indexOf('.'));
        //String ext = filename.substring(7, 10);
        String ext = filename.substring(filename.indexOf('.')+1);

        System.out.println(fname +"/"+ ext);

        // split로 파일명/확장자 분리
        String[] names = filename.split("[.]");
        System.out.println(names[0] +"/"+ names[1]);

        // 문자열 합치기 : +, concat(비추), StringBuilder, StringBuffer
        // + : 내부적으로 StringBuilder를 이용해서 처리
        // StringBuilder (동기화x) > StringBuffer (동기화o)
        // 하지만, 실무에서는 StringBuffer를 주로 사용

        // Date 클래스
        Date today = new Date();
        System.out.println(today);

        // Calrendar 클래스
        Calendar cal = Calendar.getInstance();

        System.out.println(cal.getTime());

        System.out.println(cal.get(Calendar.YEAR) + "-" +
                (cal.get(Calendar.MONTH)+1) +"-"+
                cal.get(Calendar.DAY_OF_MONTH));

        System.out.println(cal.get(Calendar.HOUR) + ":" +
                (cal.get(Calendar.MINUTE)+1) +":"+
                cal.get(Calendar.SECOND) +" "+
                cal.get(Calendar.AM_PM));

        // SimpleDateFormat 클래스
        // 날짜나 시간 표시를 좀 더 편하게 다루기 위해 사용
        String dfmt = "yyyy-MM-dd";     // 년월일
        String tfmt = "HH:mm:ss E";     // 시분초요일

        SimpleDateFormat sdf = new SimpleDateFormat(dfmt);
        System.out.println(sdf.format(today));

        sdf = new SimpleDateFormat(tfmt);
        System.out.println(sdf.format(today));

        // 래퍼클래스
        // 기본자료형 데이터를 클래스형 데이터로 취급할때 사용하는 클래스
        int f = 1;
        System.out.println(f);

        Integer g = new Integer(f);   // 박싱 : 기본형 -> 클래스형
        System.out.println( g.toString() );

        int h = g.intValue();         // 언박싱 : 클래스형 -> 기본형
        System.out.println( h );

        // 문자열값을 기본자료형/클래스형으로 변환 : parseXxx
        int i = Integer.parseInt("12345");
        Integer j = Integer.parseInt("12345");

    }
}