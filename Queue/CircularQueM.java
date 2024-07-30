class CQueue{
    int[] arr;
    int n;
    int f=-1;
    int r=-1;
    public CQueue(int n){
        this.n=n;
        arr=new int[n];
    }
    public void CQinsert(int data){
        if(f==r+1 || (f==0 && r==n-1)){
            System.out.println("Your Queue is overflow");
            return;
        }
        r=(r+1)%n;
        arr[r]=data;
        if(f==-1){
            f=0;
        }
        return;
    }

    public void display(){
        if(f==-1){
            System.out.println("Your queue is Empty!!");
            return;
        }
       int i=f;
       for( i=f;i!=r;i=(i+1)%n){
        System.out.println(arr[i]);
       }
       System.out.println(arr[i]);
    }

    public int CQdelete(){
        if(f==-1){
            System.out.println("Your Queue is Empty!!");
            return -1;
        }
        int y=arr[f];
        if(f==n-1){
            f=-1;
            r=-1;
        }else{
            f=(f+1)%n;
        }
        return y;
    }
}
public class CircularQueM {
    public static void main(String[] args) {
        CQueue a=new CQueue(5);
        a.CQinsert(10);
        a.CQinsert(20);
        a.CQinsert(30);
        a.CQinsert(40);
        a.CQinsert(50);
        a.CQdelete();
        a.CQdelete();    
        a.CQinsert(60);
        a.CQinsert(70);
        a.CQdelete();
        a.display();
    }
}
