
public class CentrelinkCalculator {
	
	public static int mymethod(double maxPayment, int income, int payment) {
		
		
		if (income < 300) {
			
			System.out.println("You will receive the max payment");}
			
		else {
			
			payment = (int) ((int) ((int) maxPayment - ((income - maxPayment) * 0.6)) - 43.50);
			
		}
			
		System.out.println(payment);
		
		return payment;}
		
	}

