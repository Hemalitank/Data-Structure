import java.util.Stack;

public class java {
    public static int SPF(char ch) {
        if (ch == '+' || ch == '-')
            return 2;
        else if (ch == '*' || ch == '/')
            return 4;
        else if (ch == '^')
            return 5;
        else if (ch == '(')
            return 0;
        else
            return 8;

    }

    public static int IPF(char ch) {
        if (ch == '+' || ch == '-')
            return 1;
        else if (ch == '*' || ch == '/')
            return 3;
        else if (ch == '^')
            return 6;
        else if (ch == '(')
            return 9;
        else if (ch == ')')
            return 0;
        else
            return 7;

    }

    public static int Rank(char ch) {
        if (ch == '+' || ch == '-')
            return -1;
        else if (ch == '*' || ch == '/')
            return -1;
        else if (ch == '^')
            return -1;
        else if (ch == '(')
            return 0;
        else if (ch == ')')
            return 0;
        else
            return 1;

    }

    public static void main(String[] args) {
        String infix="a+b*c/d-e+f/g/(h+i))";
        Stack<Character> stack=new Stack<>();
        int rank=0;
        String ans="";
        stack.push('(');
        for(int i=0;i<infix.length();i++){
            char ch=infix.charAt(i);
            if(stack.get(0)==null){
               
                System.out.println("Invalid");
                return;
            }
            while (SPF(stack.peek())>IPF(ch)) {
               
                Character temp=stack.pop();
              
                    ans+=temp;
                    rank+=Rank(temp);
                    
                
                
                if(rank<1){
                 
                    System.out.println("Invalid");
                    return;
                }
            }
            if (SPF(stack.peek())!=IPF(ch)) {
                stack.push(ch);
            }else{
                stack.pop();
            }
        }
        if(rank!=1 || stack.empty()==false){
            System.out.println("Invalid");
        }else{
            System.out.println(ans);
        }
    }
}