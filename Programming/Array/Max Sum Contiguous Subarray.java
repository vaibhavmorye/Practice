/**
*
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example:

Given the array [-2,1,-3,4,-1,2,1,-5,4],

the contiguous subarray [4,-1,2,1] has the largest sum = 6.

For this problem, return the maximum sum.


*/


public class Solution {
	// DO NOT MODFIY THE LIST. 
	public int maxSubArray(final List<Integer> a) 
	{
	   int size =  a.size();
	   int max_so_far = a.get(0);
	   int curr_so_far = a.get(0);
	   for(int i = 1;  i < size; i++) 
	   {
	       curr_so_far = max(a.get(i),(curr_so_far + a.get(i)) );
	       max_so_far = max(max_so_far,curr_so_far );
	   }
	   return max_so_far;
	}
	
	public int max(int a, int b)
	{
	    if(a > b)
	    return a;
	    else 
	    return b;
	}
}
