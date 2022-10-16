import java.util.Scanner;

/**
 * Класс, подсчитывающий пробелы в тексте
 */

public class Spaces {

    String text;
    Spaces (String text) {
        this.text = text;
    }

    //метод (статичный) считывания текста из консоли
    static String getInputText () {
        String text;
        Scanner console = new Scanner(System.in);
        text = console.nextLine();
        return text;

    }

    //метод класса перевода текста в массив
   /*public char[] convertToArray (String text) {
        return text.toCharArray();
    }*/

    //метод класса подсчета количества пробелов
    /*int doCountSpaces(char[] chArray) {
        int count = 0;
        for (int i=0; i<chArray.length; i++) {
            if (chArray[i] == ' ') {
                count ++;
            }
        }
        return count;
    }*/
    /*int doCountSpaces(char[] chArray) {
        int count = 0;
        for (char symbol : chArray) {
            if (symbol == ' ') {
                count++;
            }
        }
        return count;
    }*/

    //метод подсчета количества пробелов в строке
    int doCountSpaces (String text) {
        int count = 0;
        for (char symbol : text.toCharArray()) {
            if (symbol == ' ') {
                count++;
            }
        }
        return count;
    }



    public static void main(String[] args) {
        System.out.println("Введите текст");
        Spaces newSpaces = new Spaces(getInputText());
        System.out.println("Количество пробелов: " + newSpaces.doCountSpaces(newSpaces.text));

    }


}
