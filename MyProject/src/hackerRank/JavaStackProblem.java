package hackerRank;
import java.util.*;
public class JavaStackProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Give Your String Input=> ");
		String s=sc.nextLine();
		Stack<Character> st=new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') {
				st.push(s.charAt(i));
			}else {
				switch(s.charAt(i)) {
				case ')':
					if('('==st.peek()) {
						st.pop();
					}break;
				case '}':
					if('{'==st.peek()) {
						st.pop();
					}break;
				case ']':
					if('['==st.peek()) {
						st.pop();
					}break;
				}
			}
		}
		System.out.println(st.isEmpty());
	}
}
