/*
 * This class contains the methods to various math related tasks.
 * Bryan Tam
 * 09/12/201S8
 * Version #1
 */
public class Calculate
{
	//returns a square of an integer
	public static int square(int number)
	{
		return number*number;
	}
	//returns a cube of an integer
	public static int cube(int number)
	{
		return number*number*number;
	}
	//returns an average of two doubles
	public static double average(double num1, double num2)
	{
		return (num1+num2)/2.0;
	}
	//returns an average of three doubles
	public static double average (double num1, double num2, double num3)
	{
		return (num1+num2+num3)/3.0;
	}
	//returns the radian of a degree
	public static double toDegrees(double degree)
	{
		return (degree*(3.14159/180));
	}
	//returns the degree of a radian
	public static double toRadians(double rad)
	{
		return (rad*(180/3.14159));
	}
	//returns the value of the discriminate
	public static double discriminate(double a, double b, double c)
	{
		return ((b*b)-(4*a*c));
	}
	//returns the improper fraction of a mixed number
	public static String toImproperFrac (int num1, int num2, int num3)
	{
		int numerator= ((num1*num3)+num2);
		return (numerator + "/" + num3);
	}
	//returns a mixed number of a fraction
	public static String toMixedNum(int num1,int num2)
	{
		int wholenumber= (num1/num2);
		int numerator = (num1%num2);
		return (wholenumber +"_"+ numerator + "/" + num2);
	}
	//returns the expanded version of two polynomials multiplied together
	public static String foil(int a1, int a2, int b1, int b2, String var)
	{
		int ax = a1*b1;
		int bx = a1*b2 + a2*b1;
		int cx = a2*b2;
		return ax + var + "^2" + "+" + bx + var + "+" + cx;
	}
	//returns true or false if the num1 is divisible by num2
	public static boolean isDivisibleBy(int num1, int num2)
	{
		if (num2 == 0) throw new IllegalArgumentException("Cannot not divide by 0.");
		if (num1%num2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//returns the absolute value of the number
	public static double absValue(double num)
	{
		if (num<0)
		{
			return (num * -1);
		}
		else
		{
			return  num;
		}
	}
	//returns the larger of the 2 doubles
	public static double max(double num1, double num2)
	{
		if (num1 < num2)
		{
			return num2;
		}
		else
		{
			return num1;
		}
	}
	//returns the larger of the three doubles
	public static double max(double num1, double num2, double num3)
	{
		return max (num1, max(num2, num3));
	}
	//returns the smaller of the two integers
	public static double min(int num1, int num2)
	{
		if (num1 < num2)
		{
			return num1;
		}
		else 
		{
			return num2;
		}
	}
	//returns a inputed double into a number rounded to the hundredth's place
	public static double round2 (double num1)
	{
		double rounded = (int) (num1*1000);
		if (rounded%10 >=5)
		{
			rounded=((int)(rounded+10)/10);
			double round = rounded/100;
			return (round);
		}
		else
		{
			return (rounded/10)/100.0;
		}
	}
	//returns a double of a value to a positive integer power
	public static double exponent (double num, int power)
	{
		if (power<0) throw new IllegalArgumentException("Invalid #, only positives for exponent");
		double answer = num;
		if (power < 0)
		{
			System.out.println ("Not a positive exponent");
		}
		for ( int i = 0; i < power - 1; i++)
		{
			answer *= num;
		}
		return answer;
	}
	//returns an integer of the factorial of the value passed
	public static int factorial(int num1)
	{
		if (num1<0) throw new IllegalArgumentException("Invalid #, only postives for factorials");
		if (num1 == 1) 
		{
			return 1;
		} 
		else if (num1 <0)
		{
			System.out.println("Can not calculate");
		}
		int output = num1 * factorial(num1 - 1);
		return output;
	}
	//returns true or false that the integer was a prime number or not
	public static boolean isPrime (int num1)
	{
		int divide = 2 ;
		while (divide <= num1)
		{
			if (num1%divide != 0)
			{
				return false;
			}
			else 
			{
				return true;
			}
				divide++;
		}
	}
	//finds the greatest common factor of two integers
	public static int gcf(int num1, int num2)
	{
		int output = 1;
		for(int i = 1; i <=num1; i+=1)
		{
			if(isDivisibleBy(num1, i) && isDivisibleBy (num2,i)) 
			{
				output = i;
			}
		}
		return output;
	}
	//This returns a double of the square root of a number
	public static double sqrt (double d)
	{
		if (d < 0) throw new IllegalArgumentException("Cannot square root a negative number.");
		double t = 1;
		double squareroot = d/2;
		do 
		{
			t = squareroot;
			squareroot = ((t+ (d/t))/2);
		}
		while ((t-squareroot) != 0);
		{
			return round2(squareroot);
		}
	}
	// (-b+-sqrt of b^2 - 4ac )/ 2a, gives you two roots for the given a,b,c values
	public static String quadForm(int a , int b , int c )
	{
		double plus = ((-b + (sqrt(discriminate(a,b,c))))/(2*a));
		double minus = ((-b - (sqrt(discriminate(a,b,c))))/(2*a));
		return (plus +" & " + minus);
	}
}









