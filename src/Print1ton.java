import java.util.Scanner;

public class Print1ton {
    public static  void Print1toN(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        Print1toN(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to print n numbers:");
        int n = sc.nextInt();
       Print1toN(n);
    }
}
