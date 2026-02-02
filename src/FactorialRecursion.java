import java.util.Scanner;

public class FactorialRecursion {
    public static int fact(int n) {
        if(n==1) return n; // Base condition
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        // Factorial Program using Recursion
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find factorial");
        int  n = sc.nextInt();
        System.out.println(fact(n));
    }
}
