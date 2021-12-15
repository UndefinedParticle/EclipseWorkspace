package collections;
import java.util.*;
public class VectorAndStack {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector<Integer> v=new Vector<>();
		Stack<Integer> s=new Stack<>();
		v.add(1);
		v.add(2);
		v.add(3);
		System.out.println(v);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s);
		System.out.println("peek element is "+s.peek());
		System.out.println("Popped element is "+s.pop());
		System.out.println("New Peek element is "+s.peek());
	}

}
