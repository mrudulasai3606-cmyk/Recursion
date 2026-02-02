import java.util.Scanner;

public class PrintArrayRec {
    static void print(int arr[],int idx){
        if(idx== arr.length) return;
        System.out.print(arr[idx]+" ");
        print(arr,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int  n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        print(arr,0);
    }
}
