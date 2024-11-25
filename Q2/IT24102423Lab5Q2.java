import java.util.Scanner;

public class IT24102423Lab5Q2{
	public static void main(String args[]){

		int number;

		Scanner input=new Scanner(System.in);
	
		System.out.println("Enter the number of new members introduced: ");
		number=input.nextInt();

		if(number>=0){
			switch(number){
				case 0:
					System.out.println();
					System.out.println("No Prize");
					break;
				
				case 1:
					System.out.println();
					System.out.println("Pen");
					break;
				
				case 2:
					System.out.println();
					System.out.println("Umbrella");
					break;
		
				case 3:
					System.out.println();
					System.out.println("Bag");
					break;

				case 4:
					System.out.println();
					System.out.println("Travelling Chair");
					break;
				default:
					System.out.println();
					System.out.println("Headphone");
					break;
			}
		}
		else{
			System.out.println("Input must be a number 0 or greater ");
		}

	}
}