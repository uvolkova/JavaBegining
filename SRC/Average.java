package SRC;

public class Average {
    public static void main(String[] args) {

        int sumChet = 0;
        int sum = 0;
        int j = 0;
        int n = 0;

        for (int i = 5; i <= 20; i++) {
            sum = sum + i;
            j++;
            if (i % 2 == 0) {
                sumChet = sumChet + i;
                n++;
            }
        }
        System.out.println("Сумма всех чисел = " + sum);
        System.out.println("Среднее арифметическое всех чисел = " + ((double) sum / j));
        System.out.println("Сумма четных чисел = " + sumChet);
        System.out.println("Среднее арифметическое четных чисел = " + ((double) sumChet / n));

    }
}

