import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] arg) {
		// swapping two numbers:
//		System.out.println("hello world");
//		
//		int n1 = 12;
//		int n2 = 10;
//		
//		System.out.println("n1 = " + n1 + "\nn2 = " + n2);
//		
//		int tmp = n1;
//		n1 = n2; n2 = tmp;
//		
//		System.out.println("n1 = " + n1 + "\nn2 = " + n2);
		
		
		
		// user input:
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("What's today?");
//		String name = scan.nextLine();
//		
//		System.out.println("What's your age?");
//		int age = scan.nextInt();
//		scan.nextLine();
//		
//		System.out.println("What do you like?");
//		String liking = scan.nextLine();
//		
//		
//		System.out.println(name + " is a pretty good day!");
//		System.out.println("You're " + age + " years old?!");
//		System.out.println("Oh! come on, you definately don't like " + liking);
		
//		scan.close();
		
		
		
		// GUI:
//		String name = JOptionPane.showInputDialog("Enter your name:");
//		JOptionPane.showMessageDialog(null, "Hello, " + name);
//		
//		float n1 = Float.parseFloat(JOptionPane.showInputDialog("Enter a number: "));
//		float n2 = Float.parseFloat(JOptionPane.showInputDialog("Enter another number: "));
//		JOptionPane.showMessageDialog(null, n1 + " + " + n2 + " = " + (n1 + n2));
		
		
		
		// Math class:
//		Scanner scan = new Scanner(System.in);
//		double x1, x2, x3;
//		
//		System.out.println("Enter the value of x1: ");
//		x1 = scan.nextDouble();
//		
//		System.out.println("Enter the value of x2: ");
//		x2 = scan.nextDouble();
//		
//		x3 = Math.sqrt(Math.pow(x1, 2) + Math.pow(x2, 2));
//		System.out.println("The hypotenuse: " + x3);
//		
//		scan.close();
		
		
		
		// nested loops:
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of rows: ");
		int rows = scan.nextInt();
		
		System.out.println("Enter the number of columns: ");
		int cols = scan.nextInt();
		
		System.out.println("Enter the symbol to use: ");
		String symbol = scan.next();
		
		for (int ikr = 0; ikr < rows; ikr++) {
			for (int idk = 0; idk < cols; idk++) {
				System.out.print(symbol);
			}
			System.out.println();
		}
		
		scan.close();
		
		
		
		
	}

}
