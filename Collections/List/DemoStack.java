package List;

import java.util.Stack;

// Child class of Vector, specially designed for LIFO order
public class DemoStack {
@SuppressWarnings({"rawtypes" ,"unchecked"})
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(10);
		s.push("as");
		s.push(3.0);
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.search("as"));
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		System.out.println(s.firstElement());
		System.out.println(s.lastElement());
	}

}
