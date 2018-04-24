package CATS;
import java.util.Scanner;
public class CATStest {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter the name and breed of 3 cats." );

		CATS cat1=new CATS(scanner.nextLine(),scanner.nextLine());
		
		CATS cat2=new CATS(scanner.nextLine(),scanner.nextLine());
		
		CATS cat3=new CATS(scanner.nextLine(),scanner.nextLine());

		CATS[]cats={cat1,cat2,cat3};
	
		System.out.println(cats[1].name);
		System.out.println(cats[1].breed);
		
	}
}
