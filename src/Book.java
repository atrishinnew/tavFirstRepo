public class Book {
    String name;
    int pageCount;
    int year;
    String creator;

    //пустой конструктор
    Book() {
    }


    //конструктор с полями
    Book(String name, int pageCount, int year, String creator) {
        this.name = name;
        this.pageCount = pageCount;
        this.year = year;
        this.creator = creator;
    }

    //метод get
    String getName() {
        return name;
    }

    //метод set
    void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Book firstBook = new Book("Три мушкетера", 672, 1844, "Дюма");
        System.out.println(firstBook.getName());
        System.out.println(firstBook.creator);

        Book secondBook = new Book();
        secondBook.setName("новая книга");
        System.out.println(secondBook.getName());


    }
}


