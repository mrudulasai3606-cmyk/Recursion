import java.util.Scanner;

public class Palindrome {
    public static boolean palin(String s,int i,int j){
        if(i>=j) return true;
        if(s.charAt(i)!=s.charAt(j)) return false;
        palin(s,i+1,j-1);
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        System.out.println(palin(s,0,s.length()-1));
    }
}
