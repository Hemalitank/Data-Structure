import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter arr[" + i + "]");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int minindex=i;
                if(arr[j]<=arr[i]){
                   minindex=j;
                }
                int temp=arr[minindex];
                arr[minindex]=arr[i];
                arr[i]=temp;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);           
        }
    }
}
