package stringsExample;

public class StringExample {

	public static void main(String[] args) {

		// in backend Java will create same object as value is same
		//String literal
		//String is an object in Java for representing sequence of characters
		String s = "test";
		String s1 = "test";
		
		
		//new operator will create new object in Java memory space
		String s3 = new String("test");
		String s4 = new String("test");
		
		
		
		String s5 = "test my code";
		
		//split with space, means array of character
		String[] splittedString = s.split(" ");
		for(String n : splittedString) {
			System.out.println(n);
		}
		
		
		
		//With String array we use length
		for(int i = 0; i< splittedString.length; i ++) {
			System.out.println(splittedString[i]);
		}
		
		
		
		//With String we use length()
		for(int i=0; i < s5.length(); i ++) {
			System.out.println(s5.charAt(i));
		}
		
		
		
		//print in reverse order
		for(int i = s.length()-1; i >=0; i --) {
			System.out.println(s.charAt(i));
		}
		
		
	}

}
