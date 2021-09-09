public class Person<V extends Number> implements Comparable {
    private V identifier;
    private String name;
    private String surname;
    private int age;

    public Person(V identifier, String name, String surname, int age) {
        this.identifier = identifier;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "identifier=" + identifier +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTO(Object o, Object o2) {
        Person p1 = (Person) o;
        Person p2 = (Person) o2;

        if (p1.age == p2.age) {
            return 0;
        } else if (p1.age > p2.age) {
            return 1;
        }
        return -1;
    }
}
