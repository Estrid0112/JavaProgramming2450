package lectorial03;

class ArrayPrinter<T>{
	private T[] array;
	
	
	public ArrayPrinter(T[] data) {
		this.array = data;
	}
	
	public void printData() {
		for(T item: this.array) {
			System.out.println(item);
		}
	}
	
    
    public static void main(String[] args) {
    	
    	Integer[] array  = {1, 2, 3, 4};
    	ArrayPrinter<Integer> myPrinter = new ArrayPrinter<Integer>(array);
    	myPrinter.printData();
		
	}
    
} 