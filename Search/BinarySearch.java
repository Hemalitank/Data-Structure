import java.util.Scanner;

public class BinarySearch {
    public static int search(int a,int s,int e,int[] arr){
        
        if(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==a){
                return mid;
            }else 
            if(arr[mid]>a){
                return search(a, s, mid-1, arr);
            }else {
                return search(a, mid+1, e, arr);
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
        int ans=search(a,0,arr.length-1,arr);
        if(ans==-1){
            System.out.println("Your element is not in array");
        }else{
            System.out.println("Your element is at "+ans+"index in array");
        }
    }
}
