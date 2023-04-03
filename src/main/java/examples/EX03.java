package examples;

import java.lang.reflect.Constructor;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        System.out.println(3 + 4.5 * 2 + 27 / 8);   // 15.0
        System.out.println(true || false && 3 < 4 || !(5 == 7)); // true
        System.out.println(true || (3 < 5 && 6 >= 2)); //   true
//        System.out.println(!true > 'A');
        System.out.println(7 % 4 + 3 - 2 / 6 * 'Z');    //     6
        System.out.println('D' + 1 + 'M' % 2 / 3);     // 69
        System.out.println(5.0 / 3 + 3 / 3);        //  2.666666666666667
        System.out.println(53 % 21 < 45 / 18);    // false
        System.out.println((4 < 6) || true && false || false && (2 > 3));//    true
        System.out.println(7 - (3 + 8 * 6 + 3) - (2 + 5 * 2));  // -59

        System.out.print(" May 13, 1988 fell on day number ");     //  May 13, 1988 fell on day number
        System.out.println(((13 + (13 * 3 - 1) / 5 + 1988 % 100 + 1988
                % 100 / 4 + 1988 / 400 - 2 * (1988 / 100)) % 7 + 7) % 7); // 5
        System.out.print(" Check out this line  ");        //  Check out this line
        System.out.println(" //hello there " + '9' + 7);  // //hello there 97
        System.out.print('H' + 'I' + " is " + 1 + "more example");    // 145 is 1more example
        System.out.print('H' + 6.5 + 'I' + " is " + 1 + "more example");  // 151.5 is 1more example
        System.out.print( "Print both of us" + "Me too" );
        System.out.print("Reverse " + 'I' + 'T');     // Reverse IT
        System.out.print("No! Here is" + 1 + "more example");     // No! Here is1more example
        System.out.println("Here is " + 10 * 10); // that’s 100 ;      // Here is 100
        System.out.println("Not x is " + true); // that’s true.       // Not x is true
//        System.out.print(  );
//        System.out.println;
        System.out.print( "How about this one" + '?' + "Huh?" );

        // 요일 계산
        System.out.print("\n Dec 25, 2023 fell on day number ");
        System.out.println(((25 + (25 * 5 - 2) / 12 + 2023 % 100 + 2023
                % 100 / 4 + 2023 / 400 - 3 * (2023 / 100)) % 7 + 7) % 7);

        System.out.println(true && false && true || true);   // true
        System.out.println(true || true && true && false);   // true
        System.out.println((true && false) || (true && !false) || (false && !false));    // true
        System.out.println((2 < 3) || (5 > 2) && !(4 == 4) || 9 != 4);   // true
        System.out.println(6 == 9 || 5 < 6 && 8 < 4 || 4 > 3);   // true

    }
}
