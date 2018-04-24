package GAMES;

import java.util.Scanner;

public class GAMEStest {

	public static void main(String[]args){


		Scanner scanner=new Scanner(System.in);

		GAMES game1=new GAMES("COD","FPS",3.5);

		GAMES game2=new GAMES("GOW","Action Storytelling",5.0);
		
		GAMES game3=new GAMES("Fortnite","Battle Royale",4.0);
	
		GAMES game4=new GAMES("Mortal Kombat","2D Figher",4.5);

		GAMES game5=new GAMES("NFS", "Racer",3.7);

		
		GAMES[]games={game1,game2,game3,game4,game5};



		System.out.println("Enter the name of one of five games.");
		String answer=scanner.next();

		for(int i=0; i<games.length; i++){
			
			if(answer.equals(games[i].name)){

				System.out.println(games[i].name);
				System.out.println(games[i].genre);
				System.out.println(games[i].rating);
			}
			
			else
			{
				System.out.println("Game not found.");
			}
		}
	}
}
