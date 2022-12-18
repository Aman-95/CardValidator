import java.util.Scanner;

public class Validator {

	//Luhn Algorigthm to validate a credit card number
	public static boolean validate(String creditCardNumber){
		int n = creditCardNumber.length();
		int num,evenSum=0,oddSum=0;
		char ch;
		for(int i=n-1;i>=0;i-=2) {
			ch=creditCardNumber.charAt(i);
			num = ch-'0';
			oddSum+=num;
		}
		for(int i=n-2;i>=0;i-=2) {
			ch=creditCardNumber.charAt(i);
			num = ch-'0';
			num*=2;
			evenSum+=(num/10)+(num%10);
		}
		num=evenSum+oddSum;
		if(num%10==0) {return true;}
		else {return false;}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String creditCardNumber;
		System.out.print("Enter the Credit Card Numer: ");
		creditCardNumber = input.nextLine();
		boolean isValid = validate(creditCardNumber);
		if(isValid==true) {System.out.println("This Credit Card is VALID");}
		else{System.out.println("This Credit Card is NOT VALID");}	
		input.close();
	}
}
