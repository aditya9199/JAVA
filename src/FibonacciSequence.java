import java.util.*;
public class FibonacciSequence {
    public static void main(String[] args) {
        int a = 0, b = 1, c;
        System.out.print("Enter the no of terms: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}

