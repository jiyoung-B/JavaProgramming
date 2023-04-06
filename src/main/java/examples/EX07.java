package examples;
public class EX07 {
    public static void main(String[] args) {
        // Q51 - 구구단 BigGugudan
        // v1
        System.out.println("           Multiplication Table ");
        System.out.println("       1   2   3   4   5   6   7   8   9");
        System.out.println("----------------------------------------");
        System.out.println("1 |    1   2   3   4   5   6   7   8   9");
        System.out.println("2 |    2   4   6   8  10  12  14  16  18");
        System.out.println("3 |    3   6   9  12  15  18  21  24  27");
        System.out.println("4 |    4   2   3   4   5   6   7   8   9");
        System.out.println("5 |    5   2   3   4   5   6   7   8   9");
        System.out.println("6 |    6   2   3   4   5   6   7   8   9");
        System.out.println("7 |    6   2   3   4   5   6   7   8   9");
        System.out.println("8 |    6   2   3   4   5   6   7   8   9");
        System.out.println("9 |    6   2   3   4   5   6   7   8   9");

        // v2
        System.out.println("           Multiplication Table ");
        System.out.println("       1   2   3   4   5   6   7   8   9");
        System.out.println("----------------------------------------");
        String fmt = "%d |   %2d  %2d  %2d  %2d  %2d  %2d  %2d  %2d  %2d\n";
        for (int i = 1; i <= 9 ; i++) {
            System.out.printf(fmt,
                    i, i * 1, i * 2,  i * 3, i * 4, i * 5, i * 6, i * 7, i * 8, i * 9);
        }

        // v3
        System.out.println("           Multiplication Table ");
        System.out.println("       1   2   3   4   5   6   7   8   9");
        System.out.println("----------------------------------------");

        //fmt = "%d |   %2d  %2d  %2d  %2d  %2d  %2d  %2d  %2d  %2d\n";
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d |   %2d", i, i);  // 앞 2부분
            for (int j = 2; j <= 9; j++) {
                System.out.printf("  %2d", i * j); // 나머지 뒷 8부분
            }
            System.out.println("");
        }


        // Q53 - 1월 달력 CalrendarV1


        // Q55 - 주민번호 유효성 검사 JuminCode
        //int[] jumin = {1,2,3,4,5,6, 1,2,3,4,5,6,7};
        int[] jumin = {1,2,3,4,5,6, 1,2,2,2,3,3,1};
        int sum = 0;

        // 1) 2,3,4,5,6,7,8,9,2,3,4,5 가중치 곱합
        sum += jumin[0] * 2;
        sum += jumin[1] * 3;
        sum += jumin[2] * 4;
        sum += jumin[3] * 5;
        sum += jumin[4] * 6;
        sum += jumin[5] * 7;
        sum += jumin[6] * 8;
        sum += jumin[7] * 9;
        sum += jumin[8] * 2;
        sum += jumin[9] * 3;
        sum += jumin[10] * 4;
        sum += jumin[11] * 5;

        // 2) 누적합을 11로 나눈 나머지 구함
        int mod = sum % 11;

        // 3) 나머지에서 11을 뺀 값을 비교
        mod = 11 - mod;

        // 4) 주민번호 끝자리와 비교
        if (jumin[12] == (mod % 10))
            System.out.println("주민번호 일치!");
        else
            System.out.println("주민번호 불일치!");

        System.out.println("나머지 : " + mod);

        // v2
        int[] weight = {2,3,4,5,6,7,8,9,2,3,4,5};  // 가중치
        sum = 0;

        // 누적합 구함
        for (int i = 0; i < weight.length; i++) {
            sum += jumin[i] * weight[i];
        }

        // 나머지 구함
        mod = (11 - sum % 11) % 10;

        // 결과 확인
        String result = "주민번호 불일치!";
        if (jumin[12] == (mod % 10)) result = "주민번호 일치!";

        System.out.println(result + "/" + mod);
    }
}