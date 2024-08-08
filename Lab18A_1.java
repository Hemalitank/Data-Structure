import java.util.Scanner;
class Searching{
    public int linearSearch(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to search:");
        int k = sc.nextInt();
        for(int i = 0;i<=arr.length;i++){
            if(i==k){
                System.out.println("element found at index "+i);
                return i;
            }  
        }
            return -1;   
    }
}


public class Lab18A_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            System.err.println("enter element at index "+i);
            arr[i] = sc.nextInt();
        }
        Searching s1 = new Searching();
        s1.linearSearch(arr);
    }
    
}
