import java.util.Scanner;

public class Lat {
    public static void main(String[] args) {
        // pengulangan do while 1 sampai 10
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        // factorial
        int n = 5;
        int factorial = 1;
        for (int j = 1; j <= n; j++) {
            factorial *= j;
        }

        System.out.println(factorial);

    }
}
