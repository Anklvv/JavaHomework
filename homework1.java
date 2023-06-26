
// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение
// чисел от 1 до n)
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factor(n));
    }

    static int factor(int n) {
        if (n == 1)
            return 1;
        return n * factor(n - 1);
    }
}


// Реализовать простой калькулятор
import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите операцию - + / * ");
        String k = in.nextLine();
        calc(k);
    }

    static void calc(String k) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int n = in.nextInt();
        System.out.printf("Введите второе число: ");
        int m = in.nextInt();
        switch (k) {
            case "+":
                sum(n, m);
                break;
            case "-":
                dif(n, m);
                break;
            case "/":
                System.out.println(div(n, m));
                break;
            case "*":
                comp(n, m);
                break;
        }
    }

    static void sum(int n, int m) {
        System.out.println(n + m);
    }

    static void dif(int n, int m) {
        System.out.println(n - m);
    }

    static void comp(int n, int m) {
        System.out.println(n * m);
    }

    static double div(int n, int m) {
        return n / m;
    }

}


// Вывести все простые числа от 1 до 1000

public class task2 {
    public static void main(String[] args) {

        for (int i = 2; i <= 1000; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }
}