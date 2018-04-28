import java.util.Scanner;

public class AustudyCalculatorCases {
	
	
	static Scanner situation = new Scanner(System.in);
	static Scanner myincome = new Scanner(System.in);

	
	public static void myaustudymethod() {
		
		System.out.println("Welcome to the CENTRELINK AUSTUDY CALCULATOR");
		System.out.println("What is your situation? Please read the below and enter the number which best reflects your situation and press 'Enter'");
		System.out.println("1. You are single, under 18 & living at home");
		System.out.println("2. You are single, under 18, living at home");
		System.out.println("3. You are single or in a couple, no children, living away from home");
		System.out.println("4. You are in a couple, with children");
		System.out.println("5. You are single, with children");


		
		int scenarios = situation.nextInt();
		int income = myincome.nextInt();
		double payment = 0; 				// Initial variable for payment that will be received
		double maxPayment = 445.80;			// The maximum payment available for cases 1,2 & 3
		double maxPayment2 = 489.60;		// The maximum payment available for case 4
		double maxPayment3 = 584.20;		// The maximum payment available for case 5
	

		
	switch (scenarios) {
	
	//single, under 18, living at home, max payment = 445.80
	case 1:	
				
		if ((income < 437)) {	
		System.out.println("You will receive the max payment of $445.80");
		
		}
		
		else if ((income > 437) && (income < 445.51)) {
		payment = (double) ((double) ((double) maxPayment - ((maxPayment - income) * 0.5)));
		System.out.println("You are single, under 18 & living at home. Your payment will be " + "$"+payment);
	
		}
		
		else if ((income > 445.50) && (income < 524)) {
		payment = (double) ((double) ((double) maxPayment - ((income - maxPayment) * 0.5)));
		System.out.println("You are single, under 18 & living at home. Your payment will be " + "$"+payment);
		
		}
		
		else if ((income > 524) && (income <= 864.83)) {
		payment = (double) ((double) ((double) maxPayment - ((income - maxPayment) * 0.6)) - 43.50);
		System.out.println("You are single, under 18 & living at home. Your payment will be " + "$"+payment);
			
		}
	
		else if (income >= 864.84) {
		System.out.println("your payment is reduced to 0");
		
		payment = 0;
		
		}
		
		break;

	//single, over 18, living at home, max payment = 445.50
	case 2:	
		
		if ((income < 437)) {	
		System.out.println("You will receive the max payment of 445.50");
		
		}
		
		else if ((income > 437) && (income < 445.51)) {
		payment = (double) ((double) ((double) maxPayment - ((maxPayment - income) * 0.5)));
		System.out.println("You are single, over 18 & living at home. Your payment will be " + "$"+payment);
	
		}
		
		else if ((income > 445.50) && (income < 524)) {
		payment = (double) ((double) ((double) maxPayment - ((income - maxPayment) * 0.5)));
		System.out.println("You are single, over 18 & living at home. Your payment will be " + "$"+payment);
		
		}
		
		else if ((income > 524) && (income <= 948.49)) {
		payment = (double) ((double) ((double) maxPayment - ((income - maxPayment) * 0.6)) - 43.50);
		System.out.println("You are single, over 18 & living at home. Your payment will be " + "$"+payment);
			
		}
	
		else if (income >= 948.50) {
		System.out.println("your payment is reduced to 0");
		
		payment = 0;
		
		}		
	
		break;
		
	//single or in a couple, no children, living away from home, max payment = 445.50
	case 3:	
	
		if ((income < 437)) {	
		System.out.println("You will receive the max payment of $445.50");
		
		}
		
		else if ((income > 437) && (income < 445.51)) {
		payment = (double) ((double) ((double) maxPayment - ((maxPayment - income) * 0.5)));
		System.out.println("You are single or in a couple, living away from home. Your payment will be " + "$"+payment);
	
		}
		
		else if ((income > 445.50) && (income < 524)) {
		payment = (double) ((double) ((double) maxPayment - ((income - maxPayment) * 0.5)));
		System.out.println("You are single or in a couple, living away from home. Your payment will be " + "$"+payment);
		
		}
		
		else if ((income > 524) && (income <= 1206.16)) {
		payment = (double) ((double) ((double) maxPayment - ((income - maxPayment) * 0.6)) - 43.50);
		System.out.println("You are single or in a couple, living away from home. Your payment will be " + "$"+payment);
			
		}
	
		else if (income >= 1206.17) {
		System.out.println("your payment is reduced to 0");
		
		payment = 0;
		
		}		
	
		break;
		
	//in a couple, with children, max payment 489.60
	case 4:	
	
		if ((income < 437)) {	
		System.out.println("You will receive the max payment of $489.60");
		
		}
		
		else if ((income > 437) && (income < 445.51)) {
		payment = (double) ((double) ((double) maxPayment2 - ((maxPayment2 - income) * 0.5)));
		System.out.println("You are in a couple, with children. Your payment will be " + "$"+payment);
	
		}
		
		else if ((income > 445.50) && (income < 524)) {
		payment = (double) ((double) ((double) maxPayment2 - ((income - maxPayment2) * 0.5)));
		System.out.println("You are in a couple, with children. Your payment will be " + "$"+payment);
		
		}
		
		else if ((income > 524) && (income <= 1280.33)) {
		payment = (double) ((double) ((double) maxPayment2 - ((income - maxPayment2) * 0.6)) - 43.50);
		System.out.println("You are in a couple, with children. Your payment will be " + "$"+payment);
			
		}
	
		else if (income >= 1280.34) {
		System.out.println("your payment is reduced to 0");
		
		payment = 0;

		}
		
		break;
		
	//single, with children, max payment 584.20
	case 5:	
		
		if ((income < 437)) {	
		System.out.println("You will receive the max payment of $584.20");
		
		}
		
		else if ((income > 437) && (income < 445.51)) {
		payment = (double) ((double) ((double) maxPayment3 - ((maxPayment3 - income) * 0.5)));
		System.out.println("You are single, with children. Your payment will be " + "$"+payment);
	
		}
		
		else if ((income > 445.50) && (income < 524)) {
		payment = (double) ((double) ((double) maxPayment3 - ((income - maxPayment3) * 0.5)));
		System.out.println("You are single, with children. Your payment will be " + "$"+payment);
		
		}
		
		else if ((income > 524) && (income <= 1440.49)) {
		payment = (double) ((double) ((double) maxPayment3 - ((income - maxPayment3) * 0.6)) - 43.50);
		System.out.println("You are single, with children. Your payment will be " + "$"+payment);
			
		}
	
		else if (income >= 1440.50) {
		System.out.println("your payment is reduced to 0");
		
		payment = 0;

		break;
		
		}	
		
	}
	
	}
	
}

		


	
