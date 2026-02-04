import java.util.Scanner;

public class RevArray {
    public static void rev(int arr[],int i,int j){
       if(i>=j) return ;
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
       rev(arr,i+1,j-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int  n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
       rev(arr,0, arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
