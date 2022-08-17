import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string:");
		String sentence = input.nextLine();
		sentence = sentence.replaceAll(" ","");
		System.out.println("After removing white spaces: " +sentence);
	}
}