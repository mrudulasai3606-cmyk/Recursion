import java.util.Scanner;

public class PowerOfPQ {
    public static int pow(int p,int q){
        if(q==1) return p*q;
        return p *pow(p,q-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter p:");
        int p = sc.nextInt();
        System.out.println("Enter q");
        int q = sc.nextInt();
        System.out.println(pow(p,q));
    }
}
