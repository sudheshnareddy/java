package Assignment8;

class ExceptionHandling {
    int array[] = new int[8];

    ExceptionHandling() {
        try {
            System.out.println(array[8]);
            int number = 10 / 0;
            ExceptionHandling object = null;
            object = new ExceptionHandling();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally block");
        }
    }
}

class Exceptions {
    public static void main(String[] args) {
        new ExceptionHandling();
    }
}