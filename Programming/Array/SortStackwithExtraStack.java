//sort Stack With extra Stack 


import java.util.*;

class myCode
{
static Stack<Integer> sortStack(Stack<Integer> st)
{
    Stack <Integer> tempst = new Stack<Integer>();
    while(!st.isEmpty())
    {
        int x = st.pop();
        
        while(!tempst.isEmpty() && tempst.peek() > x  )
        {
           // System.out.println(tempst.peek());
            st.push(tempst.peek());  
            tempst.pop();
        }
        
        tempst.push(x);
    }
    return tempst;
}
   

    public static void main (String[] args) throws java.lang.Exception
    {
        Stack<Integer> st = new Stack<Integer>();
        st.push(6);
        st.push(2);
        st.push(9);
        st.push(12);
        st.push(0);

        st = sortStack(st);
        while(!st.isEmpty())
        {
            int s =st.pop();
            System.out.println(s);
            
        }
    }
}

