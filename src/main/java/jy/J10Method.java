package jy;

import jdk.nashorn.internal.runtime.OptimisticReturnFilters;

import java.util.Arrays;

public class J10Method {

    public static String computeLeapYear(int year){
        //String msg = "평년입니다";
    StringBuffer msg = new StringBuffer();
        msg.append("평년입니다");
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            msg.delete(0, msg.length());
            msg.append("윤년입니다");
        }

        return String.format("%d년은 %s", year, msg);
    };

    public static String showAMPM(int a) {
        String temp = Integer.toString(a);
        String time = "" + temp.charAt(0) + temp.charAt(1);

        String AMPM = "오전";
        if ( Integer.parseInt(time) >= 12){
            AMPM = "오후";
        }
        return AMPM;
    }

    public static String showStarPyramid(int floor) {
        String result = "";
        for(int i = 1; i <= floor; i++){
            for(int j = 1; j <= i; j++){
                result += "*";
            }
            result += "\n";
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(computeLeapYear(2023));
        System.out.println( showAMPM(171717));
        System.out.println(showStarPyramid(5));
    }
}
