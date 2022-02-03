package sudheshna.assignment5;

public class Singeton {
    String str;

    public static Singeton staticMethod(String parameter) {
        // str=parameter;
        Singeton s = new Singeton();
        return s;
    }

    public void display() {
        System.out.print(str);
    }
}
