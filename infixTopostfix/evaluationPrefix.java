import java.util.Scanner;
import java.util.Stack;

public class evaluationPrefix {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inp=sc.next();
        String[] s=inp.split(",");
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=s.length-1;i>=0;i--){
            if(Character.isDigit(s[i].charAt(0))){
                int n=Integer.parseInt(s[i]);
                stack.push(n);
            }else{
                if(stack.size()<2){
                    System.out.println("Invalid Input");
                    return;
                }
                int val=0;
                int arg1=stack.pop();
                int arg2=stack.pop();
                
                switch (s[i].charAt(0)) {
                    case '+':
                        val=arg1+arg2;
                        break;
                    case '-':
                        val=arg1-arg2;
                        break;
                    case '*':
                        val=arg1*arg2;
                        break;
                    case '/':
                        val=arg1/arg2;
                        break;
                    case '^':
                        val=(int)Math.pow(arg1, arg2);
                    default:
                        break;
                }
                stack.push(val);
            }
        }
        System.out.println("Your ans is " + stack.pop());
    }
}
