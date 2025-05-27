public class TypeCastingExample {
    public static void main(String[] args) {
        double doubleVal = 45.67;
        int intVal = (int) doubleVal;  // Explicit casting

        int num = 100;
        double newDouble = num;  // Implicit casting

        System.out.println("Double to Int: " + intVal);
        System.out.println("Int to Double: " + newDouble);
    }
}
