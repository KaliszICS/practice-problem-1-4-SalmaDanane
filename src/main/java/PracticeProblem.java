	import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		String word;
		System.out.print("What is your name: ");
		word = input.nextLine();
		System.out.println(word);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("Input a whole number: ");
		num = input.nextInt();
		System.out.println(num * 2 + 2);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		double num1;
		System.out.print("Input a radius: ");
		num1 = input.nextDouble();
		System.out.println(2 * 3.14 * num1);
		System.out.println(3.14 * num1 * num1);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		String name;
		System.out.print("Input a first name: ");
		name = input.nextLine();
		String lastname;
		System.out.print("Input a last name: ");
		lastname = input.nextLine();
		int age;
		System.out.print("Input an age: ");
		age = input.nextInt();
		System.out.println(lastname + ", " + name + " - " + age);
	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		String name1;
		System.out.print("Input a name: ");
		name1 = input.nextLine();
		int age1;
		System.out.print("Input an age: ");
		age1 = input.nextInt();
		int iq;
		iq = age1;
		age1 = age1 + 3;
		System.out.print(name1);
		System.out.println(age1);
		System.out.println(iq);
	}

}

