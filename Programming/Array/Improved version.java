/*
*
You are given a read only array of n integers from 1 to n.

Each integer appears exactly once except A which appears twice and B which is missing.

Return A and B.

Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Note that in your output A should precede B.

Example:

Input:[3 1 2 5 3] 

Output:[3, 4] 

A = 3, B = 4
*/
public class Solution {
 
public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
	    
	    ArrayList<Integer> res = new ArrayList<>();
	    
	    Collections.sort(A);
	    int n = A.size();
	    int rep = -1;
	    int miss = -1;
	    long sum = A.get(0);
	    
	    for (int i = 1; i < n; i++) {
	        if (A.get(i).intValue() == A.get(i - 1).intValue()) {
	            rep = A.get(i);
	        }
            sum += A.get(i);
	    }
	    
	    miss = (int) ((1L * n * (1L * n + 1)) / 2 - sum + rep);
	    
	    res.add(rep);
	    res.add(miss);
	    
	    return res;
	    
	}
}