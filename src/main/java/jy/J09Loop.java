package jy;

public class J09Loop {
    public static void main(String[] args) {
        // 중첩 반복문
        // 2개 이상의 반복문을 겹쳐 사용하는 반복문
        // 복잡한 작업을 반복 실행할때 유용하게 사용

        // *를 5개씩 5행 출력 v1
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("");

        // *를 5개씩 5행 출력 v2
        for (int i = 0; i < 5; i++) {
            System.out.println("*****");
        }
        System.out.println("");

        // *를 5개씩 5행 출력 v3
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // 5층짜리 피라미드 출력 v1
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
        System.out.println("");

        for (int i = 1; i <= 5; i++) {  // 행
            for (int j = 1; j <= i; j++) {  // 열
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");

        // 5층짜리 역피라미드 출력 v1
        System.out.println("*****");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
        System.out.println("");

        for (int i = 1; i <= 5 ; i++) {  // 행
            for (int j = i; j <= 5 ; j++) {  // 열
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");

        for (int i = 1; i <= 5 ; i++) {  // 행
            for (int j = 5; j <= i ; j--) {  // 열
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}