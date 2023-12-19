package JAVAOOP2;
public class Class {
    String name;
    int age;

    public Class(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }

    public static void main(String[] args) {
        Class person1 = new Class("John", 25);
        System.out.println("Name: " + person1.name);
        System.out.println("Age: " + person1.age);
        person1.introduce();
    }
}
