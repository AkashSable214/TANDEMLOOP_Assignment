package test;

import java.util.Scanner;

public class OddNumberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.print("Output: ");
        for (int i = 1; i <= a; i++) {
            int odd = 2 * i - 1;
            System.out.print(odd);
            if (i < a) {
                System.out.print(", ");
            }
        }
    }
}

