import java.util.Scanner;

public class Calc {

    //метод сложения
    public int plus(int num1, int num2) {
        return num1+num2;
    }

    //метод вычитания
    public int minus(int num1, int num2) {
        return num1-num2;
    }

    //метод умножения
    public int multi(int num1, int num2) {
        return num1*num2;
    }

    //метод деления
    public int division(int num1, int num2) {
        return num1/num2;
    }



    public static void  main (String [] args) {
        int num1;
        int num2;

        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число");
        num1 = console.nextInt();
        System.out.println("Введите первое число");
        num2 = console.nextInt();

        Calc calulate = new Calc();
        System.out.println("Сумма введенных чисел: " + calulate.plus(num1, num2));
        System.out.println("Результат вычитания введенных чисел: " + calulate.minus(num1, num2));
        System.out.println("Результат умножения введенных чисел: " + calulate.multi(num1, num2));
        System.out.println(String.format("Результат деления введенных чисел (без остатка, ну его нахрен): " + calulate.division(num1, num2)));
    }
}
//или я хрень какую то сделал или я не понял пока, для чего такие сложности. надеюсь это для того, чтобы просто набить руку