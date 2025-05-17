package test;

import java.util.Scanner;

public class CustomOddSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        int count = (a % 2 == 0) ? a - 1 : a;

        System.out.print("Output: ");
        for (int i = 1; i <= count; i++) {
            int odd = 2 * i - 1;
            System.out.print(odd);
            if (i < count) {
                System.out.print(", ");
            }
        }
    }
}


