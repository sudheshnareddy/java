package sudheshna.assignment5;

public class Main {
    public static void main(String[] args) {
        Data d = new Data();
        d.print();
        d.anotherPrint();
        Singeton s = new Singeton();
        s.staticMethod("sudheshna");
        s.display();
    }
}
