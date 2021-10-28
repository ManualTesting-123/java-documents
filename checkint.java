package session2;

import java.util.Scanner;

public class checkint {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
int no; 
		Scanner sc=new Scanner(System.in);

System.out.println("enter the value");
no=sc.nextInt();
if(no>0)
{
	System.out.println("positive");
}
else if(no<0)
{
	System.out.println("negitive");

}
else
{
	System.out.println("zero");
	
}

	}

}
