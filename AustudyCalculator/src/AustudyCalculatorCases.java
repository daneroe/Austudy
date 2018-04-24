public class AustudyCalculatorCases extends CalculatorGUI {
	
	public static void myaustudymethod(int scenarios, double income) {
		
		// int scenarios = 4; 
		double payment = 0; 				// Initial variable for payment that will be received
		double maxPayment = 445.80;			// The maximum payment available for cases 1,2 & 3
		double maxPayment2 = 489.60;		// The maximum payment available for case 4
		double maxPayment3 = 584.20;		// The maximum payment available for case 5

		
	switch (scenarios) {
	
	//single, under 18, living at home, max payment = 445.80
	case 1:	
				
		if ((income < 437)) {	
		System.out.println("You will receive the max payment");
		
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
		System.out.println("You will receive the max payment");
		
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
		System.out.println("You will receive the max payment");
		
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
		System.out.println("You will receive the max payment");
		
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
		System.out.println("You will receive the max payment");
		
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