class swap{
    public void d(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("Updated a is:"+a);
        System.out.println("Updated a is:"+b);
    }
    
}
public class p33{
    public static void main(String[]args){
        swap s=new swap();
        s.d(10,20);
    }
}