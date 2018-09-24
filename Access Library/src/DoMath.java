//This is the client code for the calculate library 
//call various methods in the Calculate library
//this class contains the methods to do various math related tasks
//@author Bryan Tam
//version 1 September 16,2018

public class DoMath 
{
	public static void main(String[]args) 
	{
		System.out.println(Calculate.square(-3));
		System.out.println(Calculate.cube(-3));
		System.out.println(Calculate.average(2.0, 4.0));
		System.out.println(Calculate.average(2.0, 2.0, 4.0));
		System.out.println(Calculate.toDegrees(4.0));
		System.out.println(Calculate.toRadians(4.0));
		System.out.println(Calculate.discriminant(2.0, 3.0, 4.0));
		System.out.println(Calculate.toImproperFrac(3,4,2));
		System.out.println(Calculate.toMixedNum(7, 3 ));
		System.out.println(Calculate.foil(3,4,5,6,"x"));
		System.out.println(Calculate.isDivisibleBy(3, 4));
		System.out.println(Calculate.absValue(-4));
		System.out.println(Calculate.max(2, 4));
	}

}