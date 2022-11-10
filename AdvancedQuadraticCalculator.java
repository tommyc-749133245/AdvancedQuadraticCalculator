import java.util.Scanner;
public class AdvancedQuadraticCalculator 
{
	public static void main(String[] args) 
	{
		//create a scanner object
		Scanner sc = new Scanner(System.in);
		
		//ask user to input value of a
		System.out.print("Enter coefficient a: ");
		
		//Use the Scanner class's methods to read value a
		double  ValueA= sc.nextDouble();
		
		if(ValueA == 0){
			System.out.println("Invalid input");
			System.exit(0);
		}
		//ask user to input value of b
		System.out.print("Enter coefficient b: ");
		
		//Use the Scanner class's methods to read value b
		double  ValueB= sc.nextDouble();
		
		//ask user to input value of c
		System.out.print("Enter coefficient c: ");
		
		//Use the Scanner class's methods to read value c
		double  ValueC= sc.nextDouble();
		
		
		double temp =Math.sqrt(ValueB * ValueB - 4 * ValueA * ValueC);
		
		//calculate the root1
		double root1 = (- ValueB + temp ) / ( 2 * ValueA );
		
		//calculate the root 2
		double root2 = (- ValueB - temp ) / ( 2 * ValueA );
		
		System.out.println("Solving "+ ValueA + "x^2 + "+ ValueB +"x + "+ ValueC + " = 0");
		
		//checking if there are roots or not
		if(temp>0)
		{

			System.out.println("Two distinct solutions:");
			
			//display the result of root1
			System.out.println("x = " + root1 + " & ");
			
			//display the result of root2
			System.out.println("x = " + root2);
		}
		
		//In cases of one root
		else if(temp==0)
		{
			
			//display the result of root
			System.out.println("Repeated solution: x = " + ( - ValueB / 2 * ValueA ));
		}
		
		//In case of no real root
		else 
		{
			//display the result
			System.out.println("There is no real solution");
		}
	}

}
