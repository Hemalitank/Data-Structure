import java.util.Scanner;
class stackDemo{
    int Top=-1;
    int s[];

    public  stackDemo(int n){
        s=new int[n];
    }
    public void push(int x){
        if(Top>=s.length-1){
            System.out.println("Stack is overflow");
            return;
        }
        else{
            System.out.println("Push");
            Top++;
            s[Top]=x;   
        }
    }
    public int pop(){
        if(Top<=-1){
        System.out.println("Stack is underflow");
        return 0;
      }
        else{
            
            Top--;
            return s[Top+1];
        }
    }
    public void display(){
        if(Top<=0){
            System.out.println("Stack is underflow");
        }
        else{
        for(int j=0;j<=Top;j++){
            System.out.println(s[j]);
            }
        }
      }
      public int peep(int i){
            if(Top-i+1<=0){
                System.out.println("Stack underflow");
                return 0;
            }
            else{
                return (s[Top-i+1]);
            }
      }
      public void change(int a ,int b){
        if(Top-a+1<=0){
            System.out.println("Stack underflow");
        }
        else{
            s[Top-a+1]=b;
        }
      }
    } 
    public class p38{
    
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        stackDemo s=new stackDemo(n);
      
        System.out.println("press 1 for push,2 for pop,3 for Display,4 for peep,5 for change");
        int ch=sc.nextInt();
        while(ch!=6){
            switch(ch){
                case 1:
                System.out.println("Enter the element for push :");
                int x=sc.nextInt();
                s.push(x);
                break;
                case 2:
               int y= s.pop();
               System.out.println(y+"is deleted");
                break;
                case 3:
                s.display();
                break;
                case 4:
                     System.out.println("enter the index of element you want to peep");
                     int i=sc.nextInt();
               int c= s.peep(i);
               System.out.println(c);
                break;
                case 5:
                System.out.println("enter the index of element you want to change");
                int a=sc.nextInt();
                System.out.println("enter the new value");
                int b=sc.nextInt();
                s.change(a,b);
                break;
              }
              System.out.println("press 1 for push,2 for pop,3 for Display,4 for peep,5 for change");
             ch=sc.nextInt();

            }
    }
}
    