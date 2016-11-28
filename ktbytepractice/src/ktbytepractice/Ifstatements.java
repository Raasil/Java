package ktbytepractice;

//If statements 
public class Ifstatements {
	/*public static void main(String args[]) {
		int speedMph = 40;
		if (speedMph > 55){
			System.out.println("you are speeding rip plz stop");
		} else if (speedMph < 0) {
			System.out.println("buddy r u going the speed of light");
		} else if (speedMph > 30) {
			System.out.println("good job buddy ol pal");
		} else	{
			System.out.println("the bear eats you");
		}
	}
	
*/ 

//Switch statements
/*	public static void main(String args[]) {
		int month = 8;
		String monthString;
		switch (month) {
		case 1: monthString = "January";
			break;
		case 2: monthString = "feb";
			break;
		case 3: monthString = "mar";
			break;
		case 4: monthString = "apr";
			break;
		case 5: monthString = "may";
			break;
		case 6: monthString = "jun";
			break;
		case 7: monthString = "jul";
			break;
		case 8: monthString = "aug";
			break;
		case 9: monthString = "sep";
			break;
		case 10: monthString = "oct";
			break;
		case 11: monthString = "nov";
			break;
		case 12: monthString = "dec";
			break;
		default: monthString = "Invalid month";
			break;
		}
		System.out.println(monthString);
		
	}*/
// a switch statement will a different case based off the value of a variable. Thus, the previous switch has statements similar to if(month ==1) {monthString = "January";} The default case is run if none of the prior cases match. You need a break keyword.

//The ternary operator

/*	public static void main(String[] args) {
			int month = 3;
			System.out.println(month <= 6 ? "Spring" : "fall");
	}
}
	//The ternary operator has the syntax ( BOOLEAN ? VAL1 : VAL 2, If boolean is true, then the expression equals val1. Otherwise, its val2
	*/
	
//Ordering variables using if statements. a common algorithm: sorting two variables
	// to sort two variables first and second in incr. order, swap them if they are out of order
	
/*	public static void main(String[] args) {
		int first = 5;
		int second = 0;
		if (first > second) {
			int tmp = first;
			first = second;
			second = tmp;
		}
		System.out.println(first);
		System.out.println(second);
		}
		}
*/
//finding the smallest of two variables minimization can be done with an if statement:

/*	public static void main(String[] args) {
		int first = 5;
		int second = 2;
		int smallest = 0;
		if(first < second ) smallest = first;
		else smallest = second;
		System.out.println(smallest);
	}
}*/
	
//finding the largest of three variables
	public static void main(String[] args) {
		int first = 5;
		int second = 0;
		int third = 3;
		int largest = 0;
		if (first > second && first > third) largest = first;
		else if( second > first && second > third) largest = second;
		else if( third > first && third > second) largest = third;
		System.out.println(largest);
	}
}