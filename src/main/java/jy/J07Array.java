package jy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class J07Array {

    public static void main(String[] args) {

        // 배열
        // 동일한 자료형의 자료를 여러개 저장하기 위한 자료구조
        // 데이터 입력 순서 기억, 중복자료 저장 가능

        // 점심메뉴 정의 v1
        String menu1 = "라면";
        String menu2 = "자장면";
        String menu3 = "탕수육";
        String menu4 = "민트초코";
        String menu5 = "떡복이";

        System.out.printf("%s %s %s %s %s \n",
                menu1, menu2, menu3, menu4, menu5);


        // 점심메뉴 정의 v2
        // 자료형 변수명[] = {값, 값, 값, ...}
        // 자료형[] 변수명 = {값, 값, 값, ...}  (!!!)
        //String menus[] = { "라면", "자장면", "탕수육",
        //            "민트초코", "떡복이" };

        String[] menus = {"라면", "자장면", "탕수육",
                "민트초코", "떡복이"};

        //System.out.printf("%s %s %s %s %s \n",
        //    menus[0], menus[1], menus[2], menus[3], menus[4]);

        for (int i = 0; i < 5; i++) {
            System.out.printf(menus[i] + " ");
        }
        System.out.println("");


        // 점심메뉴 정의 v3
        // 배열 정의시 한번 설정한 크기는 변경 불가 - 고정크기
        // 자료형[] 변수명 = new 자료형[크기]
        String[] menus2 = new String[5];

        menus2[0] = "라면";
        menus2[1] = "자장면";
        menus2[2] = "탕수육";
        menus2[3] = "민트초코";
        menus2[4] = "떡복이";
        // menus2[5] = "라뽁이";   // 오류발생!

        for (int i = 0; i < menus2.length; i++) {
            System.out.printf(menus2[i] + " ");
        }
        System.out.println("");


        // 점심메뉴 정의 v4
        // 동적배열 - ArrayList - collection 프레임워크의 한 요소
        // ArrayList<자료형> 변수명 = new ArrayList<>();
        ArrayList<String> menus3 = new ArrayList<>();

        menus3.add("라면");
        menus3.add("자장면");
        menus3.add("탕수육");
        menus3.add("민트초코");
        menus3.add("떡복이");

        for (int i = 0; i < menus3.size(); i++) {
            System.out.printf(menus3.get(i) + " ");
        }
        System.out.println("");


        // 5개의 정수를 입력받아 총합, 평균을 구하고 결과 출력 v3
        int[] nums = new int[5];
        int sum = 0;
        double avg = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nums.length; ++i) {
            System.out.print(i + "번째 숫자는? ");
            nums[i] = sc.nextInt();
            sum += nums[i];           // 누적합
        }
        avg = sum / nums.length;

        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%d ", nums[i]);
        }
        System.out.printf("\n%d %.1f", sum, avg);
        System.out.println("");


        // 5개의 정수를 입력받아 총합, 평균을 구하고 결과 출력 v3b
        // 배열에 저장된 값 출력할때 코드 개선
        // JDK 1.5부터 추가된 enhanced for loop
        // for (변수선언 : 대상객체) {
        //    변수출력
        // }
        for (int val : nums) {
            System.out.printf("%d ", val);
        }
        System.out.printf("\n%d %.1f", sum, avg);
        System.out.println("");


        // ex) 성적 처리프로그램 v3
        // 3명의 학생에 대해
        // 이름, 국어, 영어, 수학을 입력받아
        // 총점, 평균, 학점을 계산한 뒤 결과 출력
        // 단, 학점은 수우미양가 중 하나가 출력되어야 함
        String[] names = new String[3];
        int[] kors = new int[3];
        int[] engs = new int[3];
        int[] mats = new int[3];

        int[] tots = new int[3];
        double[] avgs = new double[3];
        char[] grds = new char[3];

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
        } // 성적처리

        String result = "";
        for (int i = 0; i < names.length; i++) {
            result += String.format("%s %d %d %d \n",
                    names[i], kors[i], engs[i], mats[i]);
            result += String.format("%d %.1f %c \n",
                    tots[i], avgs[i], grds[i]);
        } // 결과 출력 준비

        System.out.println(result);





        // Make a collection
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            if(i < 10) {
                it.remove();
            }
        }
        System.out.println(numbers);


        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        cars.get(0);
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        for (String i : cars) {
            System.out.println(i);
        }

        Collections.sort(cars);  // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }

        cars.remove(0);
        Collections.sort(cars);  // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }

        cars.clear();


        System.out.println(  cars.size());




    }


}

