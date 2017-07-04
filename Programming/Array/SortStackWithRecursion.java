/* sort Stack with recursion */
// package whatever; // don't place package name!

import java.util.*;

class myCode
{


    public static void SortStack(Stack<Integer> st)
    {
        if(!st.isEmpty())
        {
            int x = st.pop();
            SortStack(st);

            insertSort(st, x);
        }
    }

    public static void insertSort(Stack<Integer> st, int x )
    {
        if(st.isEmpty() || x > st.peek())
        {
            st.push(x);
            return;
        }

        int k = st.pop();
        insertSort(st, x);

        st.push(k);
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Stack<Integer> st = new Stack<Integer>();
        st.push(6);
        st.push(2);
        st.push(9);
        st.push(12);
        st.push(0);

        SortStack(st);
        while(!st.isEmpty())
        {
            int s =st.pop();
            System.out.println(s);
            
        }
    }
}


