package first;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("team2");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("id :");
		String st = sc.nextLine();
		
		System.out.println("password : ");
		String pw = sc.nextLine();
		
		System.out.println("id : " + st + "pw : " + pw);
		
	}

}
