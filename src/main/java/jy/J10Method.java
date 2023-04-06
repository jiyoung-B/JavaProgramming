package jy;
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

}