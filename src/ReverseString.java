import java.util.Scanner;

public class ReverseString {
    public  static String reverse(String s, int idx){
        if(idx==s.length()) return "";
        String ans = reverse(s,idx+1);
        return ans + s.charAt(idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        String rev = reverse(s,0);
        System.out.println(rev);
    }
}
