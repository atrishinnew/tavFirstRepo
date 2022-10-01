import java.util.Arrays;
import java.util.Scanner;

public class Matrix02 {
    static int n,m;
    int [][] array = new int[n][m];

    Matrix02(int n, int m) {
        this.array = new int[n][m];
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

        Matrix02 firstMatrix = new Matrix02(n,m);
        //заполняем матрицу мусором
        firstMatrix.setMatrix();

        System.out.println("Привет");
        System.out.println(Arrays.deepToString(firstMatrix.array));
    }

}
