// Homework 6
// Nhi Pham
// due Wed 10/24

public class HugeInteger{

	private int[] data;
	private int SIZE = 6;
	private boolean isNegative = false;

	// constructor creates array
	public HugeInteger(){
		this.data = new int[SIZE];
	}

	// String signed integer stored as HugeInteger
	public HugeInteger(String input){
		this.data = new int[SIZE];
		int index = input.length() - 1;

		// check if input is signed
		if (input.charAt(0) == '-'){
			isNegative = true;
		} else if (input.charAt(0) != '+'){
			// ignore positive sign
			data[index] = Character.getNumericValue( input.charAt(0) ) ;
		}
		
		for (int i = index - 1; i >= 0; i--){
			for (int j = 1; j < input.length(); j++){
				data[i] = Character.getNumericValue( input.charAt(j) );
			}
		}
	}

	// testing: display HugeInteger
	public void print(){
		int index = SIZE - 1;

		// negative HugeInteger
		if (isNegative == true)
			System.out.print("-");

		// leading zeros not printed
		while (data[index] == 0 && index != 0)
			index--;
		
		for (int i = index; i >= 0; i--){
			System.out.print(data[i]);
		}
	}
}
/*
	public static HugeInteger parse(String input){
		return new HugeInteger(input);
	}

	public String toString(){
		for (int i = 0; i < 60; i++){
			System.out.println();
		}
	}

	public void add(int){

	}

	public void add(HugeInteger){

	}

	public void subtract(int){

	}

	public void subtract(HugeInteger){

	}

	public boolean isEqualTo(int){

	}

	public boolean isEqualTo(HugeInteger){

	}

	public boolean isGreaterThan(int){

	}

	public boolean isGreaterThan(HugeInteger){

	} 

	public boolean isGreaterThanOrEqualTo(int){

	}

	public boolean isGreaterThanOrEqualTo(HugeInteger){

	}

	public boolean isLessThan(int){

	}

	public boolean isLessThan(HugeInteger){

	}

	public boolean isLessTHanOrEqualTo(int){

	}

	public boolean isLessTHanOrEqualTo(HugeInteger){

	}

	public boolean isZero(){

	}

	// BONUS

	public void multiply(int){

	}

	public void multiply(HugeInteger){

	}

	public void divide(int){

	}

	public void divide(HugeInteger){

	}

	public void remainder(int){

	}

	public void remainder(HugeInteger){

	}
*/