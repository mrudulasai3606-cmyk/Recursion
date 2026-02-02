import java.util.Scanner;

public class MaxEle {
    static int max(int arr[],int idx){
        if(idx==arr.length-1) return arr[idx];
         int smax = max(arr,idx+1);
         return Math.max(arr[idx],smax);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int  n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(max(arr,0));
    }
}
