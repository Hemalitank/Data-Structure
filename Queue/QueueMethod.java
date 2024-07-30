class Queue{
    int n;
    int f=-1,r=-1;
    int[] arr;
    public Queue(int n){
        this.n=n;
        arr=new int[n];
    }
    public  void Enqueue(int data){
        if(r>=n-1){
            System.out.println("Queue is overflow");
            return;
        }
        if(f==-1){
            f=0;
        }
        r++;
        arr[r]=data;
       
    }

    public int Dequeue(){
        if(f==-1){
            System.out.println("Your queue is underflow");
            return -1;
        }
        int y=arr[f];
        if(f==r){
            f=-1;
            r=-1;
        }else{
            
            f=f+1;
        }
        
        return y;
    }

    public void display(){
        if(f==-1){
            System.out.println("Your Queue is Empty!!");
            return;
        }
        for(int i=f;i<=r;i++){
            System.out.println(arr[i]);
        }
    }
}
public class QueueMethod{
    public static void main(String[] args) {
        Queue a=new Queue(5);
        a.Enqueue(10);
        a.Enqueue(20);
        a.Enqueue(30);
        a.Enqueue(40);
        a.Enqueue(50);
        a.Dequeue();
        a.Dequeue();
        a.Enqueue(60);
        a.display();
    }
}