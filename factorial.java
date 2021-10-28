package session2;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int no, f=1;
		System.out.println("enter the number");
		no=sc.nextInt();
		int i=1;
		//for(;i<=no;i++)
	while(i<=no)	
		{
			f=f*i;
			i++;
		}
		System.out.println("the factorial of the given number is "+f);
		}
	}


