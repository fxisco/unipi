import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Lesson0 {
	public static int DEFAULT_INTS_QTY = 3;

	static void helloWorld() {
		System.out.println("::HELLO WORLD");
	}

	static List<Integer> scanInts(String message) {
		System.out.println(message + ": ");

		List<Integer> numbers = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			try {
				int integer = scanner.nextInt();

				numbers.add(integer);
			} catch (InputMismatchException e) {
				System.out.println("Invalid value!");
				scanner.next();
			}

			if (numbers.size() == Lesson0.DEFAULT_INTS_QTY) {
				break;
			}
		}

		scanner.close();

		return numbers;
	}

	static int[] convertIntListToIntArray(List<Integer> list) {
		int[] ret = new int[list.size()];

		for (int i = 0; i < ret.length; i++)
			ret[i] = list.get(i);

		return ret;
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
		System.out.println("Ex. 1: Find max number");

		List<Integer> integers = Lesson0.scanInts("Enter numbers");

		int greatestNumber = greatest(Lesson0.convertIntListToIntArray(integers));

		System.out.println("MAX: " + greatestNumber);

		System.out.println("::FINISH");

		return;
	}

}
