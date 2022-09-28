public class Human {
    String surname;
    String name;
    String patronymic;
    int age;

    //конструктор с полями
    Human(String surname, String name, String patronymic, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.age = age;
    }

    //пустой конструктор ================
    Human() {
            }
    //набор методов set =================
    void setSurname(String surname) {
        this.surname = surname;
    }

    void setName(String name) {
        this.name = name;
    }

    void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    void setAge(int age) {
        this.age = age;
    }

    //набор методов get =================
    String getSurname() {
        return surname;
    }

    String getName() {
        return name;
    }
    String getPatronymic() {
        return patronymic;
    }

    int getAge() {
        return age;
    }

    //метод toString
    public String toString () {
        return "Фамилия: " + surname + '\n'+ "Имя: " + name+ '\n' + "Отчество: " + patronymic + '\n' + "Возраст: " + age;
    }


    public static void main(String [] args) {

        //создание объекта конструктором по умолчанию и вывод значения на экран
        Human pendos = new Human();
        pendos.age = 15;
        System.out.println(pendos.age);
        System.out.println(pendos.getAge());
        pendos.setName("Joe");
        System.out.format("%s" + "\n", pendos.name);
        pendos.setSurname("Biden");
        System.out.println(String.format("%s", pendos.surname));
        pendos.setPatronymic("Hren");
        System.out.println(pendos.getPatronymic());



        Human indeec = new Human("bolshoi", "chingachguk", "zmei", 14);
        System.out.println(indeec.age);

        System.out.println(pendos.toString());
        System.out.println("==========");
        System.out.println(indeec.toString());

    }
}
