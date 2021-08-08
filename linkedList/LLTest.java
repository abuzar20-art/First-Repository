package linkedList;

import java.util.LinkedList;

public class LLTest {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("B");
		l.addFirst("Z");
		l.add(3, "G");
		
		System.out.println(l);
	}

}
