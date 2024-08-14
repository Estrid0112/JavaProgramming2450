package lectorial03;

class GenMultiple<KEY, VALUE>{
	private KEY key;
	private VALUE value;
	
	public GenMultiple(KEY key, VALUE value) {
		this.key = key;
		this.value = value;
	}
	
	public KEY getKey() {
		return this.key;
	}
	
	public VALUE getValue() {
		return this.value;
	}
	
	
	
	public static void main(String[] args) {
		
		GenMultiple<String, Integer> score = new GenMultiple<String, Integer>("Further programming", 90);
		System.out.println(score.getKey() + "|" +  score.getValue());
	}
}
	
	
