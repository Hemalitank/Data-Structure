import java.util.Stack;
public class infixtoprefix2 {
    


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
//a+b*c/d-e+f/g/(h+i)
    public static void main(String[] args) {
        String infix="(a+b^c^d)*(e+f/g))";
        Stack<Character> stack=new Stack<Character>();
        stack.push('(');
        String ans="";
        for(int i=0;i<infix.length();i++){
            char ch=infix.charAt(i);
            if(stack.empty()){
                System.out.println("error");
                return;
            }
            if(ch=='('){
                stack.push(ch);
            }
            else if(ch==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    ans+=stack.pop();
                }
                stack.pop();
            }
            else if(ch>='A' && ch<='z' || ch>='a' && ch<='z'){
                ans+=ch;
            }else{
                if(ch=='^'){
                    while(!stack.isEmpty() && Precedence(ch)<Precedence(stack.peek())){
                        ans+=stack.pop();
                    }
                }else{
                    while(!stack.isEmpty() && Precedence(ch)<=Precedence(stack.peek())){
                        ans+=stack.pop();
                    }
                }
                stack.push(ch);
            }
        }
        System.out.println(ans);

    }
}


