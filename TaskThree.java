// Реализовать простой калькулятор
import java.util.Scanner;

class TaskThree {
    int a;
    int b;
    int d;

    public TaskThree () {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a:");
        a = in.nextInt();
        System.out.println("Введите число b:");
        b = in.nextInt();
        System.out.println("Выберите действие:\n 1 - сложение,\n 2 - вычитание,\n 3 - умножение,\n 4 - деление");
        d = in.nextInt();
        in.close();

    }

    public void calculatorAB() {
        if (d == 1) {
            System.out.println(a + b); 
        } else if (d == 2) {
            System.out.println(a - b);
        } else if (d == 3) {
            System.out.println(a * b);
        } else if (d == 4) {
            System.out.println(a / b);
        } else {
            System.out.println("нет значений");
        }
    }

    // public void additionAB() {
    //     System.out.println(a + b);
    // }

    // public void subtractionAB() {
    //     System.out.println(a - b);
    // }

    // public void multiplicationAB() {
    //     System.out.println(a * b);
    // }

    // public void divisionAB() {
    //     System.out.println(a / b);
    // }

}
