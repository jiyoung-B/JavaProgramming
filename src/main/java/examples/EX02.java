package examples;

// p.79 3 ~ 6 번
public class EX02 {

    public static void main(String[] args) {
        int colorPen = 5 * 12;
        int studentCount = 27;
        int divColorPen = colorPen / studentCount;
        System.out.println("학생당 나눠가지는 색연필수 : " +divColorPen);

        int remainColorPen = colorPen % studentCount;
        System.out.println("똑같이 나눠가지고 남은 볼펜수 : " +remainColorPen);


        int age = 6;
        int height = 120;
        String hearchDease = "심장";
        System.out.printf("\n%d세 이상 탑승 가능(단, 키가 %dcm 이상이면 보호자 동반하에 탑승 가능", age, height);
        System.out.printf("\n키 %dcm 이상 탑승 가능", height);
        System.out.printf("\n%s 관련 질환자 탑승 불가", hearchDease);


        int year = 2020;
        boolean leapYear = true;
        if (year % 4 == 0 && year % 100 == 0) leapYear = false;
        if (year % 400 == 0) leapYear = true;


        // 윤년이면 true, 윤년이 아니면 false
        System.out.println(leapYear);


        int price = 187000;
        int oman = 187000 / 50000;
        int ilman = (187000 - 50000 * oman) / 10000;
        int ochun = (187000 - (50000 * oman + 10000 * ilman)) / 5000;
        int ilchun = (187000 - (50000 * oman + 10000 * ilman + 5000 * ochun)) / 1000;

        System.out.println("5만원권 : " +oman+"장");
        System.out.println("1만원권 : " +ilman+"장");
        System.out.println("5천원권 : " +ochun+"장");
        System.out.println("1천원권 : " +ilchun+"장");



    }


}
