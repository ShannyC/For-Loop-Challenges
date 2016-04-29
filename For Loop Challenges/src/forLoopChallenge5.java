import java.util.Scanner;

public class forLoopChallenge5 {

	private static Scanner userInput;
	private static Scanner userInput2;

	public static void main(String[] args) {
		System.out.println("What number do you want to start with?");
		userInput = new Scanner (System.in);
		int lowerBound = userInput.nextInt();
		System.out.println("What number do you want to end with?");
		userInput2 = new Scanner(System.in);
		int upperBound = userInput.nextInt();
		int sum = 0;
		for (int i = lowerBound;i <= upperBound; i++)
		{
			System.out.println(i);
			sum = sum +i;
		}
		System.out.println(sum);
		
	}

}
