// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class TaskOne {

    int n;
    int a = 0;
    int b = 1;

    public TaskOne() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число N:");
        n = in.nextInt();
        in.close();

    }

    public void triangularNumber() {
        for (int i = 0; i <= n; i++) {
            a += i;
        }
        System.out.println("Треугольное числа = " + a);
    }

    public void factorialNumber() {
        for (int j = 1; j <= n; j++) {
            b *= j;
        }
        System.out.println("Факториал число = " + b);
    }
}