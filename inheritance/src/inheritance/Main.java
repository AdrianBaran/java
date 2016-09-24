package inheritance;

public class Main {

	public static void main(String[] args) {

		int sum = MathUtil.addNumbersStatic(7, new Integer(8));
		System.out.println("sum:" + sum);
		
		MathUtil util = new MathUtil();
		MathUtil util2=util;
		
		int addNumbers = util.addNumbers(0, -2);
		
		
		
		System.out.println("sum2" + new MathUtil().addNumbers(9, 9));
		
		
		

	}

}
