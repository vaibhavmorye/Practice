/*
*Given a non-negative number represented as an array of digits,

add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

Example:

If the vector has [1, 2, 3]

the returned vector should be [1, 2, 4]

as 123 + 1 = 124.

 NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer.
For example, for this problem, following are some good questions to ask :
Q : Can the input have 0’s before the most significant digit. Or in other words, is 0 1 2 3 a valid input?
A : For the purpose of this question, YES
Q : Can the output have 0’s before the most significant digit? Or in other words, is 0 1 2 4 a valid output?
A : For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.
*

*/

public class Solution {
	public ArrayList<Integer> plusOne(ArrayList<Integer> a)
	{
	    ArrayList <Integer> res = new ArrayList <Integer>();
	    int size = a.size();
	    int carry = 1;
	    int num = 0;
	    Collections.reverse(a); 
	    for(int i =0; i < size ; i++)
	    {
	        num = (a.get(i)+carry)%10;
	        carry = (a.get(i)+carry)/10;
	        
	        res.add(i, num);
	    }
	    
	    if(carry >0)
	    {
	        res.add(carry);
	    }
	    Collections.reverse(res);
	    Iterator<Integer> ires = res.iterator();
	    while(ires.hasNext())
	    {
	        if(ires.next() != 0 )
	            break;
	       ires.remove();
	    }
 	   return res; 
	}
}
