import java.util.Scanner;

public class LinearSearch {
    public static boolean search(int arr[],int idx,int tar){
        if(idx==arr.length) return false;
        if(arr[idx]== tar) return true;
        return search(arr,idx+1,tar);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int  n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter target ele:");
        int tar = sc.nextInt();
        System.out.println(search(arr,0,tar));
    }
}
