package lesson1;

public class Test {
    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        orangeBox.compare(appleBox);
        Box<Apple>appleBox1 = new Box<>();
        appleBox.dropTo(appleBox1);
        System.out.println(appleBox.fruits);
    }
}
