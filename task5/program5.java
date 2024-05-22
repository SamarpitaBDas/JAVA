public class program5 {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        program5 calculator = new program5();

        int sum = calculator.add(5, 3);
        System.out.println("Sum: " + sum);

        int difference = calculator.subtract(10, 4);
        System.out.println("Difference: " + difference);

        int product = calculator.multiply(6, 7);
        System.out.println("Product: " + product);

        double quotient = calculator.divide(20, 4);
        System.out.println("Quotient: " + quotient);
    }
}

