import java.util.Stack;

public class infixToprefix {
    public static int Precedence(char ch) {
        if (ch == '+' || ch == '-')
            return 2;
        else if (ch == '*' || ch == '/')
            return 4;
        else if (ch == '^')
            return 5;
        else if (ch == '(')
            return 0;
        else if ((ch>='a' && ch<='z') || (ch>='a' && ch<='z'))
            return 8;
        else
            return -1;

    }

    public static void main(String[] args) {
        String input="a+b*c/d-e+f/g/(h+i)";
        StringBuilder sb=new StringBuilder(input);
        sb.reverse();
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='('){
                sb.setCharAt(i,')');
            }
            else if(sb.charAt(i)==')'){
                sb.setCharAt(i,'(');
            }
        }
        String infix=sb.toString();
        infix+=")";
        // System.out.println(infix);
       
        Stack<Character> stack=new Stack<Character>();
        stack.push('(');
        String ans="";
        for(int i=0;i<infix.length();i++){
            char ch=infix.charAt(i);
            if(ch=='('){
                stack.push(ch);
            }
            else if(ch==')'){
                while( stack.peek()!='('){
                    ans+=stack.pop();
                }
                stack.pop();
            }
            else if(ch>='A' && ch<='z' || ch>='a' && ch<='z'){
                ans+=ch;
            }else{
                
                if(ch=='^'){
                    while(  Precedence(ch)<=Precedence(stack.peek())){
                        ans+=stack.pop();
                    }
                }else{
                   
                    while( Precedence(ch)<Precedence(stack.peek())){
                        ans+=stack.pop();
                    }
                }
                stack.push(ch);
            }
        }
        while (!stack.empty()) {
            ans+=stack.pop();
        }
        StringBuilder sb2=new StringBuilder(ans);
        sb2.reverse();
        ans=sb2.toString();
        System.out.println(ans);

    }
}
