//our throw and default catch mechanism
class ExcepHand
{
	public static void main(String[] args)
	{
		int bal = 5000;
		int wa = 6000;
		
		if(bal<wa)
			throw new ArithmeticException("Insufficient balance");
		
		bal = bal - wa;
		System.out.println("Transaction completed successfully");
		System.out.println("Program Continue...");	
		
	}
}