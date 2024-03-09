package app;

import java.util.Scanner;

public class App {
	public static void scanPlayer(Player player)
	{
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter name");
			String name=scan.nextLine();
			System.out.println("Enter email");
			String email=scan.nextLine();
			System.out.println("Enter contactno");
			String contactno=scan.nextLine();
			System.out.println("Enter address");
			String address=scan.nextLine();
			System.out.println("Enter age");
			int age=scan.nextInt();
			player.setName(name);
			player.setAge(age);
			player.setAddress(address);
			player.setContactNo(contactno);
			player.setEmail(email);
		}
		
	}
	public static void main(String[] args) {
//		Player player1=new Player();
//		Player player2=new Player();
//		scanPlayer(player1);
//		scanPlayer(player2);
		Board board=new Board();
		for(int i=0;i<10;i++)
		{
			int val=Dice.rollDice();
			System.out.println(val);
		}
		board.printBoard();
	}
}
