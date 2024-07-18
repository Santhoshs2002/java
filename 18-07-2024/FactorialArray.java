public class FactorialArray {
    // Method to calculate factorial of a number
    public static long factoriall(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
  }

    // Method to print factorial of each element in the array
    public static void printFactorials(int[] arr) {
        System.out.println("Factorials of elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            long factorial = factoriall(arr[i]);
            System.out.println("Factorial of " + arr[i] + " = " + factorial);
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 7, 2};
        printFactorials(array);
    }
}