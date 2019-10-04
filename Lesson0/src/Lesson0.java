
public class Lesson0 {
	
	static void helloWorld() {
		System.out.println("::HELLO WORLD");
	}
	
	static int greatest(int[] numbers) {
		
		int greatest = Integer.MIN_VALUE;
		
		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i] > greatest) {
				greatest = numbers[i];
			}
		}
		
		return greatest;
	}
	
	public static void main(String[] args) {
		System.out.println("Ex. 0");
		
		helloWorld();
		
//		System.out.println("Ex. 1");
//		int[] test = {1,2,4};
//		System.out.println(greatest(test));	
	}
	
}
