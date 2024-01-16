package arraysExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysExample {

	public static void main(String[] args) {
		
		ArraysExample obj = new ArraysExample();
		obj.fetchArray();
		obj.fetchArrayList();	
	}
	
	
	//In arrays we use length
	public void fetchArray() {
		int[] array = {1,2,3,4,5,6};
		
		//for each
		for(int i : array) {
			System.out.println(i);
		}
		
		
		//tradional for loop
		for(int i = 0; i <= array.length; i++) {
			System.out.println(array[i]);			
		}
	}
	
	
	
	
	
	//In list we use size, no length
	public void fetchArrayList() {
		
		List<String> arrayList = new ArrayList<>();
		arrayList.add("q");
		arrayList.add("a");
		arrayList.add("z");
		
		for(String name : arrayList) {
			System.out.println(name);
		}
		
		
		
		
		
		//add array in arrayList
		String[] names = {"w", "e", "r"};
		List<String> nameArrayList = Arrays.asList(names);
 		nameArrayList.contains("e");
		
		
		
	}

}
