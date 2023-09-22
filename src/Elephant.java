public class Elephant extends Animal{
    String name;
    int age;

    public Elephant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
