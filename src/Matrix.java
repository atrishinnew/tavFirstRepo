import java.util.Arrays;

public class Matrix {
    int[][] massiv = new int[4][4];

    //получить массив
    void getMassiv(int[][] massiv) {
        System.out.println(Arrays.deepToString(massiv));
        //не очень наглядный пример для понимания надо или не надо ставить this
        //работает и так и так. отдали методу массив на вход и он его и вывел в консоль
        //похоже потому, что методу не требуется ничего возвращать
    }

    //получить количество строк
    void getN(int[][] massiv) {
        System.out.println("Количество строк массива: " + massiv.length);
        //здесь также не понятно пока, что плохого, если поставить this
    }

    //получить количество столбцов
    void getM(int[][] massiv) {
        System.out.println("Количество столбцов массива: " + massiv[0].length);
    }

    //получить элемент массива
    void getElement(int n, int m) {
        System.out.println("Значение элемента массива в строке " + n + " в столбце " + m + " равно: " + massiv[n][m]);
    }

    //задать значение элементу массива
    void setElement(int n, int m, int value) {
        this.massiv[n][m] = value;
        System.out.println("Теперь значение элемента первого массива в строке " + n + " в столбце " + m + " равно: " + massiv[n][m]);
    }

    //сложение массивов
     int[][] sumMatrix (int[][] massiv1, int[][] massiv2) {
        int [][] massiv3 = new int[4][4];
        for (int i=0; i < massiv1.length; i++){
            for (int j=0; j<massiv1[0].length; j++) {
                //massiv3[i][j] = massiv1[i][j] + massiv2[i][j];
                this.massiv[i][j] = massiv1[i][j] + massiv2[i][j];
            }
        }
        //return massiv3;
        return this.massiv;
        //вот тут похоже раскурил для чего this, но до конца не уверен.
    }

    //перемножение массивов
    int [][] multiMatrix (int[][] massiv1, int[][] massiv2) {
        int[][] massiv3 = new int[4][4];

        for (int coll = 0; coll < massiv2[0].length; coll++) {

            for (int i = 0; i < massiv1.length; i++) {
                int tempVar = 0;
                for (int j = 0; j < massiv1[0].length; j++) {
                    tempVar += (massiv1[i][j] * massiv2[j][coll]);
                 }
                this.massiv[i][coll] = tempVar;
                //System.out.println(tempVar);
        }
    }
        return this.massiv;
    }


    public static void main (String [] args) {

        Matrix firstMassiv = new Matrix();

        //заполнил массивы
        for (int i = 0; i < firstMassiv.massiv.length; i++) {
            for (int j = 0; j < firstMassiv.massiv[0].length; j++) {
                firstMassiv.massiv[i][j] = j;
            }
        }

        Matrix secondMassiv = new Matrix();
        for (int i = 0; i < secondMassiv.massiv.length; i++) {
            for (int j = 0; j < secondMassiv.massiv[0].length; j++) {
                secondMassiv.massiv[i][j] = i;
            }
        }

        Matrix thirdMassiv = new Matrix();
        Matrix fourthMassiv = new Matrix();

        //System.out.println(Arrays.deepToString(firstMassiv.massiv));
        //вызов метода получения первого массива
        System.out.println("===Содержимое первого массива");
        firstMassiv.getMassiv(firstMassiv.massiv);

        //вызов метода получения второго массива
        System.out.println("===Содержимое второго массива");
        secondMassiv.getMassiv(secondMassiv.massiv);

        //вызов метода получения размера n
        firstMassiv.getN(firstMassiv.massiv);
        //System.out.println(firstMassiv.massiv.length);

        //вызов метода получения размера n
        firstMassiv.getM(firstMassiv.massiv);
        //System.out.println(firstMassiv.massiv[0].length);

        //вызов метода получения элемента массива
        firstMassiv.getElement(3,3);

        //вызов метода задать элемента массива
        firstMassiv.setElement(3,3, 10);
        System.out.println("===Новое содержимое первого массива");
        firstMassiv.getMassiv(firstMassiv.massiv);

        //вызов метода сложения массивов
        thirdMassiv.massiv = thirdMassiv.sumMatrix(firstMassiv.massiv, secondMassiv.massiv);
        //вызов метода получения третьего массива (сумма)
        System.out.println("===Содержимое третьего массива (сумма двух первых)");

        thirdMassiv.getMassiv(thirdMassiv.massiv);

        fourthMassiv.multiMatrix(firstMassiv.massiv, thirdMassiv.massiv);
        System.out.println("===Содержимое четвертого массива (перемножение первого и третьего)");

        fourthMassiv.getMassiv(fourthMassiv.massiv);

    }

}
