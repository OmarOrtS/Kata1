package software.ulpgc.es;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Person("Pepe", LocalDate.of(2000, 10, 23)));
    }
}
