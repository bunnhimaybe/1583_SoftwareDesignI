public class HugeIntegerTest{
	public static void main (String[] args){

		// public static HugeInteger parse(String);
		// converts String signed integer to a new HugeInteger object
		HugeInteger newHuge = HugeInteger.parse("666");
		System.out.print("Parsed \"666\" HugeInteger is: ");
		newHuge.print();
		
		// public HugeInteger(String);
		// String signed integer stored as HugeInteger
		HugeInteger huge = new HugeInteger("-999");
		System.out.printf("String \"-999\" stored as HugeInteger.\n");

		// public void print();
		// testing: display HugeInteger
		System.out.print("HugeInteger is: ");
		huge.print();

		// public boolean isNegative();
		// testing: check if negative
		System.out.print("HugeInteger is negative: ");
		System.out.println( huge.isNegative() );

		// public String toString();
		System.out.print("HugeInteger as a string: ");
		System.out.println(huge.toString());

		/*
		public void add(int);
		public void add(HugeInteger);
		public void subtract(int);
		public void subtract(HugeInteger);
		public boolean isEqualTo(int);
		public boolean isEqualTo(HugeInteger);
		public boolean isGreaterThan(int);
		public boolean isGreaterThan(HugeInteger);
		public boolean isGreaterThanOrEqualTo(int);
		public boolean isGreaterThanOrEqualTo(HugeInteger);
		public boolean isLessThan(int);
		public boolean isLessThan(HugeInteger);
		public boolean isLessTHanOrEqualTo(int);
		public boolean isLessTHanOrEqualTo(HugeInteger);
		public boolean isZero();
		*/

		return;
	}
}