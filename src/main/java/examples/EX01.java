package examples;

public class EX01 {
    public static void main(String[] args) {
        System.out.println("*   *    **    ****     ****    *   *          /////");
        System.out.println("*   *   *  *   *   *    *   *   *   *        | o  o |");
        System.out.println("*****  *    *  ****     ****     * *        (|  ^   |)");
        System.out.println("*   *  ******  *   *    *   *     *          | [__] |");
        System.out.println("*   *  *    *  *    *   *    *    *           -----  ");


        System.out.println("            +---+                                      ");
        System.out.println("            |   |                                      ");
        System.out.println("        +---+---+                                      ");
        System.out.println("        |   |   |                                      ");
        System.out.println("    +---+---+---+      /\\_/\\         -------         ");
        System.out.println("    |   |   |   |     ( ` ` )      / Hello   \\        ");
        System.out.println("+---+---+---+---+     (  -  )     <  Junior   |        ");
        System.out.println("|   |   |   |   |      | | |       \\ Coder!  /        ");
        System.out.println("+---+---+---+---+    (___|___)       -------           ");



        //물품
        String soju = "소주";
        String chicken = "너나치킨";
        //양
        int sojuAmount = 2;
        int chickenAmount = 1;
        //가격
        int sojuPrice = 3000;
        int chickenPrice = 12000;
        //품목별 합계 가격
        int sojusPrice = sojuPrice * sojuAmount;
        int chickensPrice = chickenPrice * chickenAmount;
        //합계
        int total = sojuPrice*sojuAmount + chickenPrice*chickenAmount;
        //부가세
        double vat = total * 10 / 100;
        //받은금액
        int takedMoney = 50000;
        //잔돈
        int change = takedMoney - total;
        //과세합계
        double taxTotal = total - vat;
//        //날짜
//        let date = new Date();
//        let year = date.getFullYear();
//        let month = date.getMonth()+1;
//        let ndate = date.getDate();
//        let hours = date.getHours();
//        let minutes = date.getMinutes();
//        let seconds = date.getSeconds();
        
        

        System.out.println("[ 음식나라 ]");
        System.out.print("\n -----------------------------");
        System.out.printf("\n 소주\t\t%2d\t\t%5d", sojuAmount, sojusPrice);
        System.out.printf("\n 너나치킨\t %d\t\t%5d", chickenAmount, chickensPrice);
        System.out.print("\n -----------------------------");
        System.out.printf("\n 과세합계\t\t\t%5.0f", taxTotal);
        System.out.printf("\n 부가세\t\t\t\t%5.0f", vat);
        System.out.print("\n -----------------------------");
        System.out.printf("\n 총합계\t\t\t\t%5d", total);
        System.out.printf("\n 받은금액\t\t\t%d", takedMoney);
        System.out.printf("\n 잔돈\t\t\t\t%d", change);
        System.out.print("\n -----------------------------");
        System.out.println(" 2023 .0 4. 03 \t 10:06:24");
//        System.out.printf(\n year.month.ndate hours:minutes:seconds);
        
    }
}
