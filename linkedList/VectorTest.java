package linkedList;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
	       Vector<String> v = new	Vector<String>();
	       
	        v.add("B");
			v.add("C");
			v.add("B");
		
			//iterator is not a legacy interface so it cant be used in vector as it is a legacy class
	         
			Enumeration<String>  e =  v.elements();
			while(e.hasMoreElements())
			{
				String p = e.nextElement();
				
				System.out.println(p);
				
			}
	      
			for( String q : v)
			{
				System.out.println(q);
				
			}
			
	}

}
