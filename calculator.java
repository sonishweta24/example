package cal;

import java.util.Scanner;

public class calculator {public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the first number");
	int data1= sc.nextInt();
	System.out.println("enter the second number");
	int data2= sc.nextInt();
	
	
	
	while(true) {
		System.out.println("1.choose the oprater +");
		System.out.println("2.choose the oprater -");
		System.out.println("3.choose the oprater *");
		System.out.println("4.choose the oprater /");
		System.out.println("5. choose the exit");
	
		char oprater = sc.next().charAt(0);
	switch(oprater) {
	case '1':
		int sum =data1 + data2;
		System.out.println("result  sum ="+sum);
		break;
	case '2':
		int sub =data1 - data2;
		System.out.println("result is sub ="+sub);
		break;
		case '3':
			int mul =data1 * data2;
			System.out.println("result is mul ="+mul);
			break;
			case '4':
				int divi =data1 / data2;
				System.out.println("result is divi ="+divi);
			break;
			
				
			case '5':
				System.exit(0);
				
				default:
					System.out.println("invalid option");
			
					
	}

}
	

}
}

