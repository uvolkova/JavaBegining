package src;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        int sumChet = 0;
        int sum = 0;
        int j = 0;
        int n = 0;

        System.out.println("Введите начальное значение: ");
        int start = new Scanner(System.in).nextInt();
        System.out.println("Введите конечное значение: ");
        int finish = new Scanner(System.in).nextInt();

        if (start < finish) {
            for (int i = start; i <= finish; i++) {
                sum = sum + i;
                j++;
                if (i % 2 == 0) {
                    sumChet = sumChet + i;
                    n++;
                }
            }
        } else {
            for (int i = finish; i <= start; i++) {
                sum = sum + i;
                j++;
                if (i % 2 == 0) {
                    sumChet = sumChet + i;
                    n++;
                }
            }
        }
        System.out.println("Сумма чисел = " + sum);
        System.out.println("Среднее арифметическое чисел = " + ((double) sum / j));
        System.out.println("Сумма четных чисел = " + sumChet);
        System.out.println("Среднее арифметическое четных чисел = " + ((double) sumChet / n));

    }
}