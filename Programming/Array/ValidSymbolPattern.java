/**
 * Checking for balance of Symbols.
 * 
 */
package String;

import java.util.*;

public class ValidSymbolPattern {

	public boolean isValidSymbolPattern(String str) {
		Stack<Character> stk = new Stack<Character>();
		if (str == null || str.length() == 0)
			return true;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ')') {
				if (!stk.isEmpty() && stk.peek() == '(')
					stk.pop();
				else
					return false;
			}

			else if (str.charAt(i) == '}') {
				if (!stk.isEmpty() && stk.peek() == '{')
					stk.pop();
				else
					return false;
			}

			else if (str.charAt(i) == ']') {
				if (!stk.isEmpty() && stk.peek() == '[')
					stk.pop();
				else
					return false;
			} else if(str.charAt(i) ==  '(' || str.charAt(i) =='{' || str.charAt(i) == '['){
				stk.push(str.charAt(i));
			}
		}
		if (stk.isEmpty())
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		String str = "(a+(k*k)+d)";
		ValidSymbolPattern vp = new ValidSymbolPattern();

		System.out.println(vp.isValidSymbolPattern(str));

		str = "{a+b}]+[(c+d)";
		System.out.println(vp.isValidSymbolPattern(str));
	}
}
