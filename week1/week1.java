import java.util.*;
public class week1 

{
	public static void pairNumber(int num)
	{
		int pair[];
		int count=0;
		pair = new int[num];
		
		for(int i=1; i<=num; i++)
		{
			
			if(i % 2 == 0)
			{
				
				pair[count] = i;
				count++;
			}
		}
		
		for(int i=0; i<count; i++)
		{
			System.out.printf("%d ",pair[i]);
		}

	}
	public static void multiOfFive(int num)
	{
		int multi[] = new int[num+1];
		
		for(int i=0; i <= num; i++)
		{
			multi[i] = 5 * i;
		}
		
		for(int i=0; i <= num; i++)
		{
			System.out.printf("5 * %d = %d\n",i,multi[i]);
		}
	
	}
	 
	public static void primeNumber(int n)
	{
	      int i =0;
	      int num =0;
	      //Empty String
	      String  primeNumbers = "";
	      for (i = 1; i <= n; i++)  	   
	      { 		 		  
	         int counter=0; 		  
	         for(num =i; num>=1; num--)
	         {
		    if(i%num==0)
		    {
			counter = counter + 1;
		    }
		 }
		 if (counter ==2)
		 {
		    //Appended the Prime number to the String
		    primeNumbers = primeNumbers + i + " ";
		 }	
	      }	
	      System.out.println(primeNumbers);
		
	}
	
	public static void main(String args[])
	{
		int num=0,select=0;
		Scanner input = new Scanner(System.in);
		System.out.printf("Select what you want to do: \n");
		System.out.printf("1 Generate pair numbers\n2 multiple of 5\n3 Prime Numbers\n");
		select = input.nextInt();
		System.out.printf("enter the value: ");
		num = input.nextInt();
		switch(select)
		{
			case 1:
				pairNumber(num);
				break;
			case 2:
				multiOfFive(num);
				break;
			case 3:
				primeNumber(num);
				break;
				
		}
	}
}

