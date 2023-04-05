package examples;

public class EX01 {
    public static void main(String[] args) {
        System.out.println("*   *    **    ****    ****    *   *      /////    ");
        System.out.println("*   *   *  *   *   *   *   *   *   *     | o o |   ");
        System.out.println("*****  *    *  ****    ****     * *     (|  ^  |)  ");
        System.out.println("*   *  ******  *   *   *   *     *       | [_] |   ");
        System.out.println("*   *  *    *  *    *  *    *    *        _____    ");

        System.out.println("  ");
        System.out.println("            +---+ ");
        System.out.println("            |   | ");
        System.out.println("        +---+---+ ");
        System.out.println("        |   |   | ");
        System.out.println("    +---+---+---+      /\\_/\\       -----     ");
        System.out.println("    |   |   |   |     ( ' ' )    / Hello \\   ");
        System.out.println("+---+---+---+---+     (  -  )   <  Junior |  ");
        System.out.println("|   |   |   |   |      | | |     \\ Coder /   ");
        System.out.println("+---+---+---+---+     (__|__)      -----     ");


        int soju = 3000;
        int sj_qty = 2;
        int chicken = 12000;
        int chck_qty = 1;

        int total = (soju * sj_qty) + (chicken * chck_qty);
        double vat = total * 0.1;

        int money = 50000;
        int charge = money - total;

        System.out.println("  ");
        System.out.println(" [ 음식나라 ] ");
        System.out.print(" ------------------------ ");
        System.out.printf("\n 소주\t\t%2d\t\t%5d", sj_qty, soju*sj_qty);
        System.out.printf("\n 너나치킨\t %d\t\t%5d", chck_qty, chicken*chck_qty);
        System.out.print("\n ------------------------ ");
        System.out.printf("\n 과세합계\t\t\t%5d", total);
        System.out.printf("\n 부가세\t\t\t\t%5.0f", vat);
        System.out.print("\n ------------------------ ");
        System.out.printf("\n 총합계\t\t\t\t%d", total);
        System.out.printf("\n 받은금액\t\t\t%d", money);
        System.out.printf("\n 잔돈\t\t\t\t%d", charge);
        System.out.print("\n ------------------------ ");
        System.out.println(" 2023. 04. 03\t 10:06:24 ");
    }
}