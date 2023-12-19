package CODEJAVA.javaobject;
public class Object {
    String brand;

    public void start() {
        System.out.println(brand + " is starting.");
    }

    public static void main(String[] args) {
        Object myCar = new Object();
        myCar.brand = "Toyota";
        myCar.start();
    }
}
