class Parent {
    interface AbstractMethod {
        void Print(String s);
    }

    void displayFromInterface(String name, AbstractMethod am) {
        String result = am.Print(name);
        System.out.println(result);
    }
}

public class FunctionalInterface {
    public static void main(String[] args) {
        new AbstractMethod().displayFromInterface("Sudheshna", (String s) -> "Hello" + s);
    }
}
