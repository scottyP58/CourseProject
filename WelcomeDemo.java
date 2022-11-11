package ProtoTypeDemo;

import java.util.Scanner;

public class WelcomeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char action;
		
		ControllerDemo ctl1 = new ControllerDemo();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Welcome to the Virtual Key File Search and Creation Prototype. By S. Morrow v 1.0");
				
		do
		{
		System.out.println("\nAdd File[a], Delete File[d], Search File[s], Exit[x]");	
		action = s.next().charAt(0);
		
		ctl1.invokeseacrh(action);
		
		}while (action != 'x');
		
		System.out.println("\nGoodbye!");
		
	}

}

