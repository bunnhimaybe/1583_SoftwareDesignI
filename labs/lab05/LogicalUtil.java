// CSCI 1851 Fall 2023
// Lab 05 Problem 3
// Nhi Pham

public class LogicalUtil{
	static boolean thereExists(boolean p, boolean q, boolean r){
		return p || q || r;
	}

	static boolean forAll(boolean p, boolean q, boolean r){
		return p && q && r;
	}

	static boolean majority(boolean p, boolean q, boolean r){
		return (p && q) || (q && r) || (p && r);
	}

	static boolean minority(boolean p, boolean q, boolean r){
		return !(p && q) || !(q && r) || !(p && r);
	}

	static boolean implies(boolean p, boolean q){
		if (p && !q){
			return false;
		} else return true;
	}

	static boolean implies(boolean p, boolean q, boolean r){
		if (p && q && !r){
			return false;
		} else return true;
	}
}