package methodsExample;

public class MethodsDemo {

	public static void main(String[] args) {
		
		//Call non static method with object
		MethodsDemo obj = new MethodsDemo();
		obj.myData();
		obj.getData();
		
		
		
		GetUserData obj2 = new GetUserData();
		obj2.myData1();
		
		
		//Call static method without object
		GetUserData.getData();
		
	}
	
	
	public void myData() {
		System.out.println("test");
	}
	
	public String getData() {
		return "test";
		
	}

}





	class GetUserData{		
		public void myData1(){
			System.out.println("test1");
		}	
		
		
		
		public static String getData() {
			return "test";
		}
	}
	
	 
