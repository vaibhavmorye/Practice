/*
Ramesh loves mathematics a lot. He always spends his time by playing with arrays.
Suddenly,He stuck with the hard problem. The problem is listed below.
Help, Ramesh to solve this magical problem of mathematics.
Given an array of integers, rearrange the array in such a way that the 
first element is first maximum and second element is first minimum and so on. 
You will be given a function which will take integer array as an argument.
Return the each element of the array after alternate sorting from the function in the form of integer array.

Sample Input :
7
1
2
3
4
5
6
7

Sample Output :
7
1
6
2
5
3
4
*/
import java.io.*;
import java.util.*;

class Main
{
    public static void alter(int arr[])
    {
            int n = arr.length;
            Arrays.sort(arr);
            Set <Integer> x = new HashSet<>();
            for(int i = 0 ; i < n; i++)
            {
                x.add(arr[i]);
            }
            arr = new int[x.size()];
            int c = 0;
            for(int p :x) {
                arr[c++] = p;
             //   System.out.println(p);
            }
			int res[] = new int[arr.length];
			Boolean flag = true;
			int k = arr.length-1;
			int g = 0;
			for(int i = 0; i < arr.length; i++)
			{
				if(flag)
				res[i] = arr[k--];
				else
				res[i] = arr[g++];
				
				flag = !flag;
			}
			/*for(int o: res)
			{	
				System.out.println(o);
			}*/
			return res;
    }
    
    public static void main (String[] args) throws java.lang.Exception
    {
        int arr[] = {7,1,2,3,4,5,6,7};
        alter(arr);
    }
}