import java.util.Scanner;

public class ArmstrongCheck {
	
	 static void checkArmstrong(int no)
	{
		int temp=no;
		int noOfDigits=String.valueOf(no).length();
		int sum=0;
		while(temp!=0)
		{
			int r=temp%10;
			int power=1;
			for(int i=0;i<noOfDigits;i++)
			{
				power=power*r;
			}
			sum=sum+power;
			temp=temp/10;
		}
		if(sum==no)
		{
			System.out.println("It's armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		checkArmstrong(no);

	}

}
