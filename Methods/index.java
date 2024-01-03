public class index {

    // Method to add two numbers
    static int add(int a, int b) {
        return a + b;
    }

    // Method to multiply two numbers
    static int multiply(int a, int b) {
        return a * b;
    }

    // Method to greet a person
    static void greet(String name) {
        System.out.println("Hello, " + name + "! Welcome to the KDU.");
    }

    public static void main(String[] args) {
        // Calling the add method
        int sum = add(5, 3);
        System.out.println("Sum: " + sum);

        // Calling the multiply method
        int product = multiply(4, 6);
        System.out.println("Product: " + product);

        // Calling the greet method
        greet("Gayani");
    }
}
