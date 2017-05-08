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
 
public ArrayList<Integer> repeatedNumber(final List<Integer> a)
{
		 Collections.sort(a);
		 int n = a.size();
		  int first = 0;
		  int second = 0;
		  for(int i =0; i <= a.size()-2 ; i++ )
		  {
			  first = a.get(i);
			  second = a.get(i+1);
			  if(first == second)
			  {
				  break;
			  }
		  }
		  int total =0;
		  for(int i =0; i < a.size() ; i++ )
		  {
			  total +=a.get(i); 
		  }
			
			ArrayList <Integer> ans = new ArrayList <Integer>();
			ans.add(second);
			int sum = n*(n+1)/2;
			int diff= total - second;
			sum = sum -diff;
			ans.add(sum);
		 
		return ans;
}
}