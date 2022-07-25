package husband;

public class Testwife {
    public static void main(String[] args) {
        Wife one = new Wife();
        Husband two = new Husband();
        one.name = "ee";
        one.age = 32;
        two.age = 54;
        two.name = "da";
        one.husband = two.name;
        two.wife = one.name;
        one.getInfo();
        two.getInfo();
    }
}
