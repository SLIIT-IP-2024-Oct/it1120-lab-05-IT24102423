import java.util.Scanner;

public class IT24102423Lab5Q1{
	public static void main(String args[]){

		int num1,num2,num3,smallest_num,largest_num;
	
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the First Integer :");
		num1=input.nextInt();

		System.out.println("Enter the Second Integer :");
		num2=input.nextInt();
	
		System.out.println("Enter the Third Integer :");
		num3=input.nextInt();
		
		smallest_num=Math.min(num1,Math.min(num2,num3));
		largest_num=Math.max(num1,Math.max(num2,num3));

		System.out.println("User entered numbers are : "+num1+" "+num2+" "+num3);
		System.out.println("the smallest number is : "+smallest_num);
		System.out.println("the largest number is : "+largest_num);

		input.close();
	}
} 