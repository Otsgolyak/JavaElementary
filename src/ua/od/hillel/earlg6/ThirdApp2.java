package ua.od.hillel.earlg6;

import java.util.Scanner;

public class ThirdApp2 {
    public static void main(String args[]) {
        int n;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter num n : ");
            n = scan.nextInt();
            int result = 1;
            for (int i = 2; i <= n; i++)
                result *= i;
            System.out.println(result);
            if (n == 0 || n == 1)
                System.out.println(result);
            if(n < 0)
                System.out.println("u'r enter wrong");
        } while (n < 0);{System.out.println("End");}
    }
}
