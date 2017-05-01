/*
You are given an array of N integers, A1, A2 ,…, AN. Return maximum value of f(i, j) for all 1 ≤ i, j ≤ N.
f(i, j) is defined as |A[i] - A[j]| + |i - j|, where |x| denotes absolute value of x.

For example,

A=[1, 3, -1]

f(1, 1) = f(2, 2) = f(3, 3) = 0
f(1, 2) = f(2, 1) = |1 - 3| + |1 - 2| = 3
f(1, 3) = f(3, 1) = |1 - (-1)| + |1 - 3| = 4
f(2, 3) = f(3, 2) = |3 - (-1)| + |2 - 3| = 5

So, we return 5.
***************
00 01 02 03 
10 11 12 13 
20 21 22 23
30 31 32 33
**************/
//O(N^2) solution
public class Solution {
    public int maxArr(ArrayList<Integer> A)
    {
        int size = A.size();
        int max = Integer.MIN_VALUE;
        for(int i =0; i < size; i++)
        {
            for(int j =i+1; i < size; j++)
            {
               int val = Math.abs(a.get(i) - a.get(j))+ Math.abs(i-j) ;
               if(max<val)
                    max = val;
            }
        }
        return val;
    }
}


//O(n) solution
 public class Solution {
    public int maxArr(ArrayList<Integer> A)
    {
        int max1 = Integer.MIN_VALUE,
        max2 = Integer.MIN_VALUE,
        max3 = Integer.MIN_VALUE,
        max4 = Integer.MIN_VALUE;
        
        assert(!(A.isEmpty()));
        
        int ans = Integer.MIN_VALUE;
        int size = A.size();
        
        for(int i = 0; i < size; i++)
        {
            max1 = max(max1, A.get(i)+i);
            max2 = max(max2, -A.get(i)+i);
            max3 = max(max3, A.get(i)-i);
            max4 = max(max4, -A.get(i)-i); 
        }
          for (int i = 0; i<size; ++i)
    {
        ans = max(ans, max1 - A.get(i) - i);
        ans = max(ans, max2 + A.get(i) - i);
        ans = max(ans, max3 - A.get(i) + i);
        ans = max(ans, max4 + A.get(i) + i);
    }
        
     return ans;   
        
    }
public int max(int a, int b)
    {
        if(a > b)
        return a;
        else 
        return b;
    }
}
