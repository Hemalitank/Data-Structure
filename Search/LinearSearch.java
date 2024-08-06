import java.util.Scanner;

public class LinearSearch{
    public static int search(int a,int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter arr["+i+"]");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Search element");
        int a =sc.nextInt();
        int ans=search(a,arr);
        if(ans==-1){
            System.out.println("Your element is not in array");
        }else{
            System.out.println("Your element is at "+ans+"index in array");
        }
    }
}