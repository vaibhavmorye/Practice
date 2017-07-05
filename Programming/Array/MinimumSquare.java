//Paper Cut into Minimum Number of Squares
//http://www.geeksforgeeks.org/paper-cut-minimum-number-squares/

import java.io.*;

class MinimumSquare
{
    public static void swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
    public static void minimumSquare(int a, int b)
    {
        int rem = 0;
        int square = 0;
        if(a < b);
            swap(a,b);
        while(b > 0)
        {
            square += a/b;

            rem = a%b;
            a = b;
            b = rem;
        }
        System.out.println("Minimum square possible :"+square);
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        int m = 13, n = 29;
         minimumSquare(m, n);
        
    }
}
