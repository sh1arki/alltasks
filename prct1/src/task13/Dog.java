package task13;

public class Dog {
    private final String name;
    private final int age;

    public Dog(String n, int p) {
        name = n;
        age = p;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Jack", 3);
        Dog d2 = new Dog("Bob", 10);
        Dog d3 = new Dog("Cake", 1);
        System.out.println (d1);
        System.out.println (d2);
        System.out.println (d3);
    }
}

