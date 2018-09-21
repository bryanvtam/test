/*
 * This class contains the methods to various math related tasks.
 * Bryan Tam
 * 09/12/2018
 * Version #1
 */
public class Calculate
{
	//returns a square of an integer
	public static int square(int number)
	{
		return number*number;
	}
	public static int cube(int number)
	{
		return number*number*number;
	}
	public static double average(double num1, double num2)
	{
		return (num1+num2)/2.0;
	}
	public static double average (double num1, double num2, double num3)
	{
		return (num1+num2+num3)/3.0;
	}
	public static double toDegrees(double degree)
	{
		return (degree*(3.14159/180));
	}
	public static double toRadians(double rad)
	{
		return (rad*(180/3.14159));
	}
	public static double discriminant(double a, double b, double c)
	{
		return ((b*b)-(4*a*c));
	}
	public static String toImproperFrac (int num1, int num2, int num3)
	{
		int numerator= ((num1*num3)+num2);
		return (numerator + "/" + num3);
	}
	public static String toMixedNum(int num1,int num2)
	{
		int wholenumber= (num1/num2);
		int numerator = (num1%num2);
		return (wholenumber +"_"+ numerator + "/" + num2);
	}
}









