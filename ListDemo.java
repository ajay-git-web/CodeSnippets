import java.util.*;
public class ListDemo {

	public static void main(String[] args) {
		String[] str= {"Ajay","Raj","Vikram","Digvijay","Pratap"};
		List ls=new ArrayList(Arrays.asList(str));
		
		System.out.println(ls);
		ls.add("Sushant");
		ls.add("Sanjay");
		System.out.println(ls);
		
		ListIterator ltr=ls.listIterator();
		
		while(ltr.hasNext()) {
			String s=(String) ltr.next();
			if(s.equals("Pratap")) {
				ltr.remove();
			}
			if(s.equals("Raj")) {
				ltr.set("Shobhit");
			}
		}
		System.out.println(ls);

	}

}
