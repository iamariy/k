import java.util.Stack;

public class Prat {
    public static void main(String[] args)
    {
        String str1="((a+b)*(c-d))";
         boolean m = checkSt(str1);
        System.out.println(m);
    }
    public static boolean checkSt(String str)
    {
        Stack<Character> st=new Stack<>();
        char[] str2=str.toCharArray();
        for(char ch : str2)
        {
            if(ch=='(') st.push(ch);
            else if (ch==')') {
             if (st.isEmpty()) return false;
             else st.pop();
            }
        }
        return st.isEmpty();
    }
}
