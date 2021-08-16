package _02_gotta_catchem_all;

public class ExceptionMethods {
	static double divide(double dividend, double divisor) throws IllegalArgumentException {
		
		if(divisor==0) {
			throw new IllegalArgumentException();
		}
		double quotient = dividend/divisor;
		return quotient;
	}
	static String reverseString(String s)throws IllegalStateException{
		if(s.equals("")) {
			throw new IllegalArgumentException();
		}
		String Ƨ = "";
		for(int i = s.length()-1; i >= 0; i--) {
			Ƨ += s.charAt(i);
		}
		
		return Ƨ;
	}
}