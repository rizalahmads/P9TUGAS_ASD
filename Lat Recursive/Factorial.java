public class Factorial {
    public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException(); // argument tidak boleh negatif
        }
        else if(n == 0) {
            return 1; // base case
        }
        else {
            return n * factorial(n - 1); // recursive case
        }   
    }
}
