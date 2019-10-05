import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson0 {
  public static int DEFAULT_INTS_QTY = 3;

  static void exercise0() {
    System.out.println("Ex. 0: Log message");
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
  
  static void exercise1() {
    System.out.println("Ex. 1: Find max number");

    List<Integer> integers = Lesson0.scanInts("Enter numbers");

    int greatestNumber = greatest(Lesson0.convertIntListToIntArray(integers));

    System.out.println("MAX: " + greatestNumber);

  }
  
  static int getLowercaseVowelscount(String text) {
    Pattern pattern = Pattern.compile("[aeiou]");
    Matcher vowelMatcher = pattern.matcher(text);
    int count = 0;
   
    if (text.length() > 0) {
      while (vowelMatcher.find())
        count++;
    }
    
    return count;

  }
  
  static void exercise2() {
    System.out.println("Ex. 2: Count all lowercase vowels in a string");
    
    System.out.println("Enter the string: ");
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
    
    scanner.close();
    
    System.out.println("Lowercase vowels count: " + Lesson0.getLowercaseVowelscount(text));
  }
  
  static void exercise3() {
    System.out.println("Ex. 3: Retrieve elements (at a specified index) from a given array list.");
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Write words separated by spaces");
    String words = scanner.nextLine();
    System.out.println("Write indexes separated by spaces");
    String indexes = scanner.nextLine();
    
    scanner.close();
    
    String[] wordsArray = words.split(" ");
    String[] indexesArray = indexes.split(" ");
    
    for(int i = 0; i < indexesArray.length; i++) {
      try {        
        int index = Integer.parseInt(indexesArray[i]);
        
        if (index < wordsArray.length) {
          System.out.println("Word[" + i + "]: " + wordsArray[i]);
        } else {
          System.out.println("word with index[" + i + "] does not exist");
        }
      } catch(NumberFormatException e) {
        System.out.println(indexesArray[i] + " is not a correct index");
      }
    }
  }

  public static void main(String[] args) {
    exercise0();
    exercise1();
    exercise2();
    exercise3();

    System.out.println("::FINISH");

    return;
  }

}
