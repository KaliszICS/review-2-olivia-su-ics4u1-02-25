import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		Scanner a = new Scanner(System.in);

		System.out.print("In: ");
		String word = a.nextLine();

		System.out.print(word);
		System.out.println();
	}

	public static void q2() {
		Scanner b = new Scanner(System.in);

		System.out.print("In: ");
		int num = b.nextInt();
		b.nextLine();

		System.out.print("In: ");
		int num2 = b.nextInt();
		b.nextLine();

		System.out.println(num/num2);
		System.out.println(num%num2);
	}

	public static void q3() {
		Scanner c = new Scanner(System.in);

		System.out.print("In: ");
		String text = c.nextLine();

		System.out.println(text + " was the text you wrote");
		
	}

	public static void q4() {
		Scanner d = new Scanner(System.in);

		System.out.print("In: ");

		int num3 = d.nextInt();
		d.nextLine();

		System.out.println(5*num3);
		
	}

	public static void q5() {
		Scanner e = new Scanner(System.in);
		
		System.out.print("In: ");
		boolean trueFalse = e.nextBoolean();
		e.nextLine();

		System.out.println(trueFalse + " is a boolean");


	}

	public static void q6() {
		Scanner f = new Scanner(System.in);

		System.out.print("In: ");
		double num4 = f.nextDouble();
		f.nextLine();

		System.out.println(num4 - 3.2);
		
	}

}


