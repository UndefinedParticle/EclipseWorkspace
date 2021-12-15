package hackerRank;
import java.util.*;
public class JavaStack {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		while(sc.hasNext()) {
			s=sc.next();
			
			while(s.length() != (s= s.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length())
				System.out.println(s.isEmpty());
			
		}
	}

}
