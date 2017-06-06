/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone {
 static void boxer(String str) {
  int len = str.length();
  int count = 0;
  int maxs = 0;
  String maxString = "";
  for (int i = 0; i < len; i++) {
   if (str.charAt(i) != ' ') {
    maxString += str.charAt(i);
   } else {
    count = maxString.length();
    if (count > maxs)
     maxs = count;
   }
  }

  for (int i = 0; i <= maxs + 3; i++)
   System.out.print("*");
  maxString = "";
  
  for (int i = 0; i < len; i++) {System.out.println(i);
   if (str.charAt(i) != ' ' ) {
    maxString += str.charAt(i);
   } else {
   	System.out.println("start" + maxString);
    int k = maxString.length();
    System.out.println();
    System.out.print("*");
    for (int j = 0; j <= (maxs - k) / 2; j++)
     System.out.print(" ");
    System.out.print(maxString);
    for (int j = 0; j <= (maxs - k) / 2; j++)
     System.out.print(" ");
    System.out.print("*");
    maxString = "";
     System.out.println("End");
   }

  }
  for (int i = 0; i <= maxs + 3; i++)
   System.out.print("*");
 }
 public static void main(String[] args) {
  Ideone.boxer("Hellooo Worlds ");
  //System.out.println();
 }
}
