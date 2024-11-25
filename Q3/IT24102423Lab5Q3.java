import java.util.Scanner;

public class IT24102423Lab5Q3{
	public static void main(String args[]){
		
		int days,s_date,e_date;
		double dis_amount,amount,total_amount;
		double discountRate=0;
		
		final double discount_rate1=0.1;
		final double discount_rate2=0.2;
		final double charges_per_day=48000.00;

		Scanner input=new Scanner(System.in);

		System.out.println("Enter Start date (1-31) : ");
		s_date=input.nextInt();

		System.out.println("Enter End date (1-31) : ");
		e_date=input.nextInt();

		if(s_date<1 || 31<s_date || e_date<1 || e_date>31){
			System.out.println("Error : Days must be between 1 and 31 ");

			return;
		}

		if(s_date>=e_date){
			System.out.println("Error : Start date must be less than end date");
			return;
		}

		days=e_date-s_date;

		if(days>=3 && days<=4){
			discountRate=discount_rate1;
			amount=days*charges_per_day;
			dis_amount=amount*discountRate;
			total_amount=amount-dis_amount;

		}
		else if(days>=5){
			discountRate=discount_rate2;
			amount=days*charges_per_day;
			dis_amount=amount*discountRate;
			total_amount=amount-dis_amount;

		}
		else{
			amount=days*charges_per_day;
			dis_amount=amount*discountRate;
			total_amount=amount-dis_amount;
		}
		
		System.out.println("Room Charges Per Day: "+charges_per_day);
		System.out.println("Number of Days Reserved: "+days);
		System.out.println("Total amount to be Paid :"+total_amount);

		input.close();
	}
}



		