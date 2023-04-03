package examples;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class EX04 {

    public static void main(String[] args) {

        // 11. 이름과 몸무게, 나이를 변수로 선언하고 자신의 것을 값으로 초기화하는 프로그램을 작성하여라 (MyInfo)
        String name = "";
        String weight = "";
        int age = 20;

//                String Myinfo(name, weight, age){
//                    this.name = "";
//                    this.weight = "";
//                    this.age = 20;
//                }

        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight + "kg");
        System.out.println("Age: " + age + " years");

        // 12. 생년월일을 이용해서 나이를 계산하는 프로그램을 작성하여라. (MyAge)
        String birthDateStr = "2000-01-01"; // 생년월일을 yyyy-MM-dd 형식의 문자열로 입력
        LocalDate birthDate = LocalDate.parse(birthDateStr);
        LocalDate currentDate = LocalDate.now();
        int age2 = Period.between(birthDate, currentDate).getYears();

        System.out.println("Birth date: " + birthDate);
        System.out.println("Current date: " + currentDate);
        System.out.println("Age: " + age2 + " years");


        // 13. 구구단 중 7단을 출력하는 프로그램을 작성하여라. (GuGu7Dan)
        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();
//        int dan = 7;
        System.out.println("*** " + dan + "단 ***");
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " x " + i + " = " + dan * i);
        }

        // 14. 다음 조건을 만족하는 프로그램을 작성하여라 (TimeTime)
            /*  하루는 86400초이다. 입력값이 1234567890일 경우 며칠인지 계산하여라
                한 시간은 3600초이다. 입력값이 98765일 경우 몇 시간인지 계산하여라
                일 분은 60초이다. 입력값이 12345일 경우 몇 분인지 계산하여라. * */

        int input = 1234567890; // 입력값
        int secondsPerDay = 86400;
        int days = input / secondsPerDay; // 일 수 계산
        System.out.println(input + "초는 " + days + "일입니다.");

        input = 98765;
        int secondsPerHour = 3600;
        int hours = input / secondsPerHour; // 시간 계산
        System.out.println(input + "초는 " + hours + "시간입니다.");

        input = 12345;
        int secondsPerMinute = 60;
        int minutes = input / secondsPerMinute; // 분 계산
        System.out.println(input + "초는 " + minutes + "분입니다.");

    }
}
