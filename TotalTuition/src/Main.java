import java.util.Scanner;

public class Main {
	private double tuitionCost;
	private double tuitionIncreaseRate;
	private double repaymentAPR;
	private int repaymentTerm;
	
	public static void main(String[] args){
		Main m = new Main();
		m.calculateTuitionCost();
	}
	
	public void calculateTuitionCost(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Tuition cost: ");
		tuitionCost = scanner.nextDouble();
		System.out.print("Tuition increase rate as a decimal: ");
		tuitionIncreaseRate = scanner.nextDouble();
		System.out.print("Repayment APR as a decimal: ");
		repaymentAPR = scanner.nextDouble();
		System.out.print("Repayment term (years): ");
		repaymentTerm = scanner.nextInt();
		double totalTuitionCost = calculateTotalTuitionCost(tuitionCost, tuitionIncreaseRate);
		double monthlyPayment = calculateMonthlyPayment(repaymentAPR, totalTuitionCost, repaymentTerm);
		System.out.printf("Totatl cost of tuition: $%.2f\nMonthly payment: $%.2f\n", totalTuitionCost, monthlyPayment);
	}
	
	/**
	 * 
	 * @param initialCost
	 * 		  The cost of the tuition at time of enrollment.
	 * @param r
	 *        The yearly rate at which the tuition increases, expressed as a decimal.
	 * @return The total cost of tuition after four years.
	 */
	public double calculateTotalTuitionCost(double initialCost, double r){
		double result = 0;
		for(int i = 0; i < 4; i++){
			result += initialCost * Math.pow((1 + r), i);
		}
		return result;
	}
	
	/**
	 * 
	 * @param apr
	 * 		  The student loan's annual interest rate, expressed as a decimal.
	 * @param principal
	 *        How much was originally loaned.
	 * @param t
	 *        The term in years for the loan to be paid back.
	 * @return The monthly payment necessary to fully repay the loan during the specified term.
	 */
	public double calculateMonthlyPayment(double apr, double principal, int t){
		return principal * Math.pow(1 + apr, t) / (t * 12);
	}
}
