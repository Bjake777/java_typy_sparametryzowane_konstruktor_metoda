import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Person> people = new ArrayList<>();

        Person person1 = new Person(1234L, "Marian", "Wisniewski", 34);
        System.out.println(person1);
        people.add(person1);
        Person person2 = new Person(12, "Jan", "Kaminski", 44);
        System.out.println(person2);
        people.add(person2);

        System.out.println(person1.compareTO(person1, person2));
    }
}
