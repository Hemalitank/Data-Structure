import java.util.Scanner;
public class Selection_sort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            System.err.println("enter element at index "+i);
            arr[i] = sc.nextInt();
        }
        Selection_sorting(arr,n);    
    }
    public static void Selection_sorting(int[]arr,int n){
        for(int i=0;i<arr.length-1;i++){
            int min_index = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            if(min_index!=i){
                int temp=arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp; 
            }
            }
            System.out.println("the sorted array is :");
            for(int i = 0;i<n;i++){
             System.out.println(arr[i]);
            }
        }
    }