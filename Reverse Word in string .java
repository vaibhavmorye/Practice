// package whatever; // don't place package name!

import java.io.*;
import java.util.Arrays;
class myCode
{


//http://www.geeksforgeeks.org/flattening-a-linked-list/
public static void reverse(char arr[], int start, int end)
{
    for(int j = start, p = end ; j < p ; j++, p-- )
    {
                    char temp = arr[j];
                    arr[j] = arr[p];
                    arr[p] = temp;
    }
}


public static char[] reverseSentence(char arr[])
{
    int end = arr.length-1;
    int start = 0;
    int p =0;
    for(int i = 0; i <= end; i++ )
    {
        if(arr[i] == ' ' ||  i == end)
        {
            if(i == end)
            {
                reverse(arr, start, end);
                /*for(int j = start, p = end ; j < p ; j++, p-- )
                {
                    char temp = arr[j];
                    arr[j] = arr[p];
                    arr[p] = temp;
                }*/
            }
            else
            {
                reverse(arr, start, i-1);
                /*for(int j = start, p = i-1 ; j < p ; j++, p-- )
                {
                    char temp = arr[j];
                    arr[j] = arr[p];
                    arr[p] = temp;
                }*/
            }
            start = i+1;
        }
    }
    for(int i = 0; i <= end; i++ )
    System.out.print(arr[i]);
    
    reverse(arr, 0 , end);
    System.out.println();
    
    return arr;
    
    
    
}
 public static void main (String[] args) throws java.lang.Exception
    {
        String sentense = "Hello Java";
        char[] arr = sentense.toCharArray();
         arr = reverseSentence(arr);
        
        sentense = Arrays.toString(arr);
        System.out.print(sentense);
    }

}
