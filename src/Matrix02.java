import java.util.Arrays;

public class Matrix02 {
    int[][] array;

    //пустой конструктор
    Matrix02 () {

    }

    //конструктор с безразмерным массивом array
    Matrix02 (int[][] array) {
        this.array = array;
    }

    //конструктор с возможностью указать размер массива
    Matrix02 (int n, int m) {
        this.array = new int [n][m];
    }

    //просто метод, на случай, если хочу заполнить чем-то массив
    static int[][] setArray(int n, int m) {
        int [][] array = new int[n][m];
        for (int i=0; i < n; i++) {
            for (int j=0; j<m; j++) {
                array[i][j]= i + j;
            }
        }
        return array;
    }

    // метод для получения матрицы
    // (считаю, что под получением здесь имеется в виду создание нового объекта "матрица")
    // например, я создал объект с пустым конструктором и уже этим методом задал ей размерность
    // иначе пока не понятно, зачем такое придумывать, если можно воспользоваться "размерным" конструктором
    int[][] getArray(int n, int m) {
        this.array = new int[n][m];
        return this.array;
    }

    // метод получения  количество строк
    int getN(int[][] matrix) {
        return matrix.length;

    }

    //получить количество столбцов
    int getM(int[][] matrix) {
        return matrix[0].length;
    }

    //получить выбранный элемент
    int getValue(int n, int m) {
        return array[n][m];
    }

    //задать значение определенному элементу
    void setValue(int n, int m, int value) {
        this.array[n][m] = value;
    }

    //сложение массивов
    int[][] sumMatrix (int[][] matrix1, int[][] matrix2) {
        for (int i=0; i < getN(matrix1); i++){
            for (int j=0; j < getM(matrix1); j++) {
                this.array[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return this.array;

    }

    //перемножение массивов
    int [][] multiMatrix (int[][] matrix1, int[][] matrix2) {

        for (int coll = 0; coll < getM(matrix2); coll++) {

            for (int i = 0; i < getN(matrix1); i++) {
                int tempVar = 0;
                for (int j = 0; j < getM(matrix2); j++) {
                    tempVar += (matrix1[i][j] * matrix2[j][coll]);
                }
                this.array[i][coll] = tempVar;
            }
        }
        return this.array;
    }


public static void main (String[] args) {


        //int[][] localArray = new int [][] {{1,2,3},{5,6,7}};

        /*int[][] localArray = new int [n][m];
        localArray = setArray(5,6);*/

        // ===== первый вариант создания матрицы
        int[][] firstArray = setArray(3,3);
        int[][] secondArray;

        Matrix02 firstM = new Matrix02(firstArray);

        // ===== второй вариант создания матрицы
        Matrix02 secondM = new Matrix02(new int [][] {{1,2,3},{5,6,7},{5,6,7}});

        // ===== третий вариант создания матрицы

        Matrix02 thirdM = new Matrix02(5,7);

        // ==== четвертый вариант создания матрицы
        Matrix02 fourthM = new Matrix02();
        fourthM.getArray(3,2);

        Matrix02 fifthM = new Matrix02(3,3);

        // ==== вывод в консоль содержимого матриц разных объектов
        System.out.println(Arrays.deepToString(firstM.array));

        System.out.println(Arrays.deepToString(secondM.array));

        System.out.println(Arrays.deepToString(thirdM.array));

        System.out.println(Arrays.deepToString(fourthM.array));

        // ==== получить количество строк N матрицы и вывод на печать
        System.out.println(firstM.getN(secondM.array));

        // ==== получить количество столбцов M матрицы и вывод на печать
        System.out.println(firstM.getM(secondM.array));

        // ==== получить определенный элемент матрицы
        System.out.println(firstM.getValue(1,1));
        System.out.println(secondM.getValue(1,1));

        // ==== задать значение определенному элементу матрицы
        firstM.setValue(1,1, 5);
        firstM.setValue(2,2, 3);
        System.out.println(firstM.array[1][1]);
        System.out.println(secondM.array[1][1]);
        System.out.println("=====");

        // ==== сложить матрицы

        fifthM.sumMatrix(secondM.array,secondM.array);
        System.out.println("=====");
        System.out.println(Arrays.deepToString(fifthM.array));

        // ==== перемножить матрицы

        fifthM.multiMatrix(secondM.array,secondM.array);
        System.out.println("=====");
        System.out.println(Arrays.deepToString(fifthM.array));

}




}


