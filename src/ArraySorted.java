import java.util.Scanner;

public class ArraySorted {
    public static boolean isSorted(int arr[],int idx){
        if(idx==arr.length-1) return  true;
        if(arr[idx]>arr[idx+1]) return false;

        return isSorted(arr,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int  n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr,0));
    }
}
