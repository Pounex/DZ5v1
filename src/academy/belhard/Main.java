package academy.belhard;

import academy.belhard.entity.Person;
import academy.belhard.entity.User;

public class Main {

    public static void main(String[] args) {

        User uz1 = new User("Felix", "Bondarev", "Felix@gmail.com", "1234");
        Person pe1 = new Person("Felix", "Bondarev");


        System.out.println(uz1.getFullInfo());
        System.out.println(uz1.isPasswordCorrect("1234"));
        System.out.println(pe1.getFullName());

    }
}
