import java.sql.SQLOutput;

public class MidnightExperiment {

	public static void main(String[] args)

	{
		System.out.println("It's after 1 am");
		System.out.println("And now I'm experimenting with Intellij");

	
	}
}

public class OperatorsExamples {
	public static void main(String[] args) {

		// ARITHMETIC OPERATORS
		int addition = 1 + 2;
		System.out.println(addition); // 3 will print
		int subtraction = 6 - 3;
		System.out.println(subtraction); // 3 will print
		int division = 9 / 3;
		System.out.println(division); // 3 will print
		int multiply = 2 * 3;
		System.out.println(multiply); // 6 will print
		int mod = 10 % 3;
		System.out.println(mod); // 1 will print


		// RELATIONAL OPERATORS
		int val1 = 10;
		int val2 = 20;

		if (val1 < val2){
			System.out.println("This will print - #1");
		}
		if (val1 > val2){
			System.out.println("This will not print - #2");
		}
		if (val1 == val2){
			System.out.println("This will not print - #3");
		}


		// LOGICAL OPERATORS
		boolean trueVal = true;
		boolean falseVal = false;
		if (trueVal){
			System.out.println("This will print - #4");
		}
		if (falseVal){
			System.out.println("This will not print - #5");
		}
		if (trueVal && falseVal){
			System.out.println("This will not print - #6");
		}
		if (trueVal ^ falseVal){
			System.out.println("This will print - #7");
		}
		if (!falseVal){
			System.out.println("This will print - #8");
		}
	}
}