public class Movie {
    String name;
    int minute;
    String director;

    Movie (String name, int minute, String director) {
        this.name = name;
        this.minute = minute;
        this.director = director;
    }

    void setName (String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Название фильма: " + name + '\n' + "Длительность в минутах: " + minute + '\n' + "Режисеер: " + director + '\n';
    }

    public static void main (String[] args) {
        Movie firsMovie = new Movie("Терминатор", 120, "Джеймс Кэмерон");
        System.out.println(firsMovie.name);
        firsMovie.setName("Терминатор 2");
        System.out.println(firsMovie.toString());
    }

}
