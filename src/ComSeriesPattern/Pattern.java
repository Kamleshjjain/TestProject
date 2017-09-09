package ComSeriesPattern;

import java.util.Scanner;

public class Pattern extends Abstract_Class_Ex implements inter {

	public static void main(String[] args) {

//		 Pattern1();
//		 Pattern2();
//		Pattern3();
		//Pattern4();
	}

	public static void Pattern1() {
//		Scanner sc = new Scanner(System.in);
//		int i = sc.nextInt();

		for (int k = 0; k < 5; k++) {
			System.out.println(" ");

			for (int j = 0; j <= k; j++) {
				System.out.print("*");
			}
		}

	}

	public static void Pattern2() {
		// Scanner sc = new Scanner(System.in);
		// int i = sc.nextInt();
		int i = 0;

		for (int k = 5; k >= i; k--) {
			System.out.println(" ");

			for (int j = 0; j <= k; j++) {
				System.out.print("*");
			}
		}

	}

	public static void Pattern3() {
		 Scanner sc = new Scanner(System.in);
		 int m = sc.nextInt();
	
		
		int i = 0;
		int t=0;

		for (int k=m; k > i; k--) 
		{
		for (int j = 0; j <= k; j++) 
			{
				System.out.print(" ");
				
				if(k==j)
				{
					//System.out.println("*");
					for(int l=0;l<=t;l++)
					{
						System.out.print("*");	
					}
					
				}
				//System.out.print(" ");
			}
			System.out.println("");
			t++;
		}

	}

	
//	public static void Pattern4() {
//		// Scanner sc = new Scanner(System.in);
//		// int i = sc.nextInt();
//		int i = 0;
//		int t = 0;
//
//		
//		for (int k = 5; k > i; k--) 
//		{
//			for(int j=0;j<k;j++)
//			{
//		
////				if()
////				System.out.print(" ");
////			
////			System.out.println("*");
//			}
//
//	}

	@Override
	public void abs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected int absmethod() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void inter11() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int inter1() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int meth() {
		// TODO Auto-generated method stub
		return 0;
	}
}









