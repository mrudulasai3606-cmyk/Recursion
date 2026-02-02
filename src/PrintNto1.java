import java.util.Scanner;

public class PrintNto1 {
    public static void Printnto1(int n){
        if(n==1){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        Printnto1(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n to print 1 numbers:");
        int n = sc.nextInt();
        Printnto1(n);
    }
}
