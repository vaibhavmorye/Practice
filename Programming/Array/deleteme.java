/*
Write a function in the language of your choice, which will take two inputs - a string and an integer. 
The function will return a string which is similar to the original string, but with certain characters removed. 
It will remove those characters whose consecutive length is exactly equal to the input number given.
E.g.

"aaabbbc", 3 => "c"
"abbbcddfg", 1 => "bbbdd"
"abcd", 2 => "abcd"
"abcd", 1 => ""
"aaabaaa", 3 => "b"
"aaaab", 3 => "aaaab"
*/
class DeleteMe{
static String deleteMe(String str, int a)
{
	int arr[] = new int[26];
	for(int i = 0; i < str.length(); i++)
	{
		if(str.charAt(i)>='a' && str.charAt(i)<='z')
			arr[str.charAt(i)-'a']++;
	}
	String res = "";
	for(int i =0; i < 26; i++)
	{
		if(arr[i]!= a)
		{
		    int c = arr[i];
			while(c != 0){
				res+=(char)('a'+ i);
			    c--;
			}
		}
	}
	return res;
}

     public static void main(String[] args)
	{
		String str = deleteMe("aaabbbc", 3);
        System.out.println("aaabbbc, 3");
        System.out.println(str);

        str = deleteMe("abbbcddfg", 1);
        System.out.println("abbbcddfg, 1");
        System.out.println(str);

        str = deleteMe("abcd", 1);
        System.out.println("abcd, 1");
        System.out.println(str);

         str = deleteMe("aaaab", 3);
        System.out.println("aaaab, 4");
        System.out.println(str);
	}
}
