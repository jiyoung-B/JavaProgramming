package jy;

public class J05Condition {
    public static void main(String[] args) {
        // ex) 짝수, 홀수 구분
        int num = 5;
        if (num % 2 == 0) {
            System.out.println("짝수입니다!");
        }
        if (num % 2 != 0) {
            System.out.println("홀수입니다!");
        }

        // ex) 오전, 오후 구분
        String time = "09:47:15";

        // 문자추출 : charAt(위치)
        System.out.println(time.charAt(0));



    }
}
