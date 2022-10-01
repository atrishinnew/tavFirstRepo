import java.util.Arrays;
import java.util.Scanner;

public class Matrix02 {
    static int n,m;
    int [][] array = new int[n][m];

    Matrix02(int[][] array) {
       this.array = array;
    }

    //метод, который установит размерность матрицы
    static void setDimension () {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите кол-во строк: ");
        n = console.nextInt();
        System.out.println("Введите кол-во столбцов: ");
        m = console.nextInt();
    }

    //метод заполнения матрицы мусором
    void setMatrix() {

        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[0].length; j++) {
                this.array[i][j] = j;
            }
        }
    }

    public static void main (String[] args) {

        //устанавливаем размерность матрицы
        setDimension();
        int [][] array1 = new int[n][m];
        //чтобы при создании объекта класса Матрица отдать на вход массив, его где-то надо взять
        //но до создания объекта, у меня еще нет массива (так как массив это поле класса)
        //поэтому выше в main я вынужден еще создать "локальный" массив
        Matrix02 firstMatrix = new Matrix02(array1);
        //заполняем матрицу мусором
        firstMatrix.setMatrix();

        //setDimension();
        //int [][] array2 = new int[n][m];
        //Matrix02 secondMatrix = new Matrix02(array2);
        //заполняем матрицу мусором
        //secondMatrix.setMatrix();

        System.out.println("=====");

        System.out.println(Arrays.deepToString(firstMatrix.array));
        //тут я не пойму, почему "локальный" массив array1 также заполняется, как и firstMatrix.array???
        System.out.println(Arrays.deepToString(array1));
        //System.out.println(Arrays.deepToString(secondMatrix.array));
        //System.out.println(Arrays.deepToString(firstMatrix.array));
    }

}
