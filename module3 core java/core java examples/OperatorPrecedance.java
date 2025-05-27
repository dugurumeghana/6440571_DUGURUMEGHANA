public class OperatorPrecedence {
    public static void main(String[] args) {
        int result = 10 + 5 * 2; // Multiplication happens before addition
        System.out.println("Result of 10 + 5 * 2 = " + result); // Output: 20

        int result2 = (10 + 5) * 2; // Parentheses change the order
        System.out.println("Result of (10 + 5) * 2 = " + result2); // Output: 30
    }
}
