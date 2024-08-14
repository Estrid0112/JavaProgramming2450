package lectorial03;

public class Stats<T extends Number> {
	T[] numbers;
	public Stats(T[] ob) {
		this.numbers = ob;
	}
	
	// add a method to compute Average
	public double computeAverage() {
		double sum = 0.0;
		for(int i=0; i<this.numbers.length; i++) {
			sum = sum + this.numbers[i].doubleValue();
		}
		return sum/this.numbers.length;
	}
	
	
	public static void main(String[] args) {
		Integer[] array = {1, 2, 3, 4, 5};
		Stats<Integer> myStats = new Stats<Integer>(array);
		System.out.println(myStats.computeAverage());
		
	}

}
