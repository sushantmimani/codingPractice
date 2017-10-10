package preparation.StacksAndQueues;

import java.util.*;

class BalancedBrackets {

    static String isBalanced(String s) {
        // Complete this function
        java.util.Stack st =new java.util.Stack ();
        char[] arr = s.toCharArray();
        for(char c: arr){
            if(c=='[' || c=='{' || c=='(')
                st.push(c);
            if(c==']' || c=='}' || c==')'){
                if(st.empty())
                    return "NO";
                char x = (char)st.pop();
                if(x=='['&&c==']' || x=='{'&&c=='}' || x=='('&&c==')')
                    continue;
                else
                    return "NO";
            }
        }
        return st.isEmpty()?"YES":"NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}

