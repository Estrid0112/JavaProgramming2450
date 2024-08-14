package lectorial03;

class Calculator<T extends Number>{
	private T[] array;
	
	
	public Calculator(T[] data) {
		this.array = data;
	}
	
	public void printData() {
		for(T item: this.array) {
			System.out.println(item);
		}
	}
	
	public double getAverage() {
		double sum = 0.0;
		for(T item: this.array) {
			sum += item.doubleValue();
		}
		
		return sum / this.array.length;
	}
	
    
    public static void main(String[] args) {
    	
    	Integer[] array  = {1, 2, 3, 4};
    	Calculator<Integer> myPrinter = new Calculator<Integer>(array);
    	System.out.println(myPrinter.getAverage());
		
	}
    
} 