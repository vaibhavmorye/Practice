package String;

public class ReverseSentence {
	public static void reverse(StringBuilder str, int begin, int end) {
		while (begin < end) {
			char temp = str.charAt(begin);
			str.setCharAt(begin, str.charAt(end));
			str.setCharAt(end, temp);
			end++;
			begin++;
		}
		System.out.println(str);
	}

	public static void reverseSentence(String inp) {
		StringBuilder str = new StringBuilder(inp);
		int begin = str.length();
		
		int lastPos = 0;
		
		for (int i = 0; i < str.length()-1; i++) {
			System.out.println(i);
			if (str.charAt(i) == str.charAt(str.length() - 1))
				reverse(str, lastPos, (str.length() - 1));
			else {
				if (str.charAt(i) == ' ') {
					reverse(str, lastPos, i - 1);
					lastPos = i + 1;
				}
			}
		}
	}

	public static void main(String[] args) {
		String str = "i liked this program very much";
		reverseSentence(str);
		System.out.println(str);

	}
}
