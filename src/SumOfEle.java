import java.util.Scanner;

public class SumOfEle {
    public static int sum(int arr[],int idx){
        if(idx== arr.length-1) return arr[idx];
        return arr[idx] + sum(arr,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int  n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sum(arr,0));
    }
}
