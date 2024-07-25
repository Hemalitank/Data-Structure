import java.util.Scanner;
 public class QueueDemo{
    int f=-1;
    int r=-1;
    int Q[];
    
    QueueDemo(int n){
        Q=new int[n];
    }
    
    public void enqeue(int x){
        if(r>=Q.length-1)
        {
            System.out.println("Queue is full");
        }
        else
        {
                r=r+1;
                Q[r]=x;
                f=0;
        }
        
    }
    public int dequeue(){
        int y=-1;
        if(f==-1){
            System.out.println("Queue is empty");
        }
        else{
             y=Q[f];
            if(f==r){
                f=-1;
                r=-1;
            }
            else{
                f=f+1;
            }
        }
        return y;
     }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of elements in the queue");
            int n=sc.nextInt();
            QueueDemo q=new QueueDemo(n);
            System.out.println("Enter 1 for queue,enter 2 for dequeue");
            int ch=sc.nextInt();
            while(ch!=3){
                if(ch==1){
                    System.out.println("Enter the element to be inserted");
                    int x=sc.nextInt();
                    q.enqeue(x);
                    int y=q.dequeue();
                 }
              }
           }
       }

