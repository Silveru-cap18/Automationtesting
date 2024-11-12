package cap;
import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //sum of even numbers
		System.out.println("Sum of Even Numbers from 1-100");
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				sum+=i;
			}
		}
		System.out.println("Sum :: "+sum);
		System.out.println();

		// Count of even numbers
		System.out.println("Count of Even Numbers from 1-100");
		int count=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				count++;
			}
		}
		System.out.println("Count :: "+count);
		System.out.println();

		//Sum of Digits of a Number
				System.out.println("Sum of Digits of a Number");
				System.out.print("Enter a number : ");
				Scanner sc = new Scanner(System.in); 
				int N=sc.nextInt();
				int sumOfDigits=0;
				while(N>0)
				{
					int lastNum = N%10;
					sumOfDigits += lastNum;
					N = N/10;
				}
				System.out.println("Sum of Digits  :: "+sumOfDigits);
				System.out.println();
				sc.close();
	}

}
