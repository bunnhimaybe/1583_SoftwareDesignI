// Lab 4
// Problem 3: Cooking
// Nhi Pham
// due 10/4 Wed

class Cooking{
	static double teaspoonsToTablespoons(double teaspoons){
		return teaspoons / 3;
	}

	static double tablespoonsToTeaspoons(double tablespoons){
		return tablespoons * 3;
	}

	static double tablespoonsToCups(double tablespoons){
		return tablespoons / 16;	
	}

	static double cupsToTablespoons(double cups){
		return cups * 16;
	}

	static double ouncesToCups(double ounces){
		return ounces / 8;
	}

	static double cupsToOunces(double cups){
		return cups * 8;
	}

	static double cupsToPints(double cups){
		return cups / 2;
	}

	static double pintsToCups(double pints){
		return pints * 2;
	}
}