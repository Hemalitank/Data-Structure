import java.util.Scanner;
public class Lab18A_2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the size of array :");
       int n = sc.nextInt();
       int [] arr = new int[n];
       for(int i = 0;i<n;i++){
           System.err.println("enter element at index "+i);
           arr[i] = sc.nextInt();
       }
       Lab18A_2 l= new Lab18A_2();
       int ans = l.BinarySearch(arr, 0, n-1);
       System.out.println(ans);
      
   }
   
   public  int BinarySearch(int arr[],int left,int right){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the element you want to search :");
    int k = sc.nextInt();

    while(left<=right){
        int middle = (left+right)/2;
        if(arr[middle]==k){
            return middle;
        }
        else if(k<arr[middle]){
            right = middle-1;
        }
        else{
            left = middle+1;
        }
       
        }
        return -1;
    }
}
 



