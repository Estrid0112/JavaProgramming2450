package lectorial03;

public class GenericMethodDemo{
	public <T> void printArray(T[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}		
	}
	
	public static void main(String[] args) {
		
		GenericMethodDemo demo = new GenericMethodDemo();
		
		String[] names = {"Alice", "Bob"};
//		System.out.println(names);
		demo.printArray(names);
//		GenericMethodDemo.printArray(names);
		Integer[] numbers = {1, 2, 3, 45};
		demo.printArray(numbers);
//		GenericMethodDemo.printArray(numbers);
		
	}

}
