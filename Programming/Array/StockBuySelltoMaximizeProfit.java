/*
http://www.geeksforgeeks.org/must-do-coding-questions-for-companies-like-amazon-microsoft-adobe/
Stock buy and sell
The cost of a stock on each day is given in an array, find the max profit that you can make by buying and selling in those days. 

Input:
First line contains number of test cases T.
Each test case contain the integer value 'N' denoting days followed by an array of stock prices in N days.
Output:
The maximum profit is displayed as shown below. And if there is no profit then print "No Profit".


Constraints:
1 <=T<= 100
2 <=N<= 100
1 <=arr[i]<= 10000


Example

Input:
2
7
100 180 260 310 40 535 695
10
23 13 25 29 33 19 34 45 65 67

Output:

(0 3) (4 6) 
(1 4) (5 9) 
Notice: Output format is as follows - (buy_day sell_day) (buy_day sell_day)
For each input, output should be in a single line.
*/

import java.util.*;
import java.lang.*;
import java.io.*;
class Stock
{	
    int buy, sell;
}
class GFG {

public static void maximumProfit(int arr[], int n)
{
	int i, count;
	i = 0;
	count = 0;
	if(n < 1)
		return ;
	ArrayList<Object> a = new ArrayList<Object>();
	while(i < n -1)
	{
		Stock stock = new Stock();
		
		while((i < n-1 ) && arr[i+1] <= arr[i])
			i++;
		
		if(i == n-1)
			break;
		
		/** buy at lowest possible value*/
		stock.buy = i++;
		
		while((i < n )&& arr[i] >= arr[i-1])
		i++;
		
		stock.sell = i-1;
		
		a.add(stock);
		count++;
 	}
 	
 	if(count == 0)
 	System.out.println("No Profit");
 	else
 	    for(int j =0; j< count; j++)
 	    {
 	        Stock stock =(Stock) a.get(j);
 	        System.out.print("("+stock.buy+" "+stock.sell+") ");
 	    }
}
	public static void main (String[] args) {
		int arr[] = {100, 180, 260, 310, 40, 535, 695}; 
		GFG.maximumProfit(arr, arr.length);
	}
}
