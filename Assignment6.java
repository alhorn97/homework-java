/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

/**
 *
 * @author ahorn
 */
import java.util.Scanner;


public class Assignment6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        
       
           
        int num1,num2;
        System.out.println("Enter integers from 1 to 10.");
        num1=getAnInteger("Enter first integer: ");
        num2=getAnInteger("Enter second integer: ");
        
        if ((num1==0) | (num2==0))
        {System.out.println("Error: Entered bad values. Re-run program!");
        };
        
        if ((num1 > 0) && (num2 >0))
        {
       // System.out.println(num1);
        //System.out.println(num2);
           
 
        int f1= getFactorial(num1);
        System.out.println(num1 + "! is " + f1);
        int f2= getFactorial(num2);
        System.out.println(num2 + "! is " + f2);
       
        int fib1, fib2;

        fib1= fib(num1); 
        fib2=fib(num2);
        
        System.out.println("fib of " + num1 + " is " +fib1);
        System.out.println("fib of " + num2 + " is " +fib2);
        
        // Question4.
        if (num2 > num1)
        {
        int y;
        y=getFactorial(num2)/getFactorial(num2-num1);
        System.out.println("There are "+ y + " ways of choosing " + num1 + " from " + num2 + " where order counts.");
        System.out.println("There are " + getFactorial(num2)/getFactorial(num1) + " ways of choosing " + num1 + " from " + num2 + " where order does not count.");
        }
        
        else if  (num1 > num2)
        {
        int y1;
        y1=getFactorial(num1)/getFactorial(num1-num2);
        System.out.println("There are "+ y1 + " ways of choosing " + num2 + " from " + num1 + " where order counts.");
        //System.out.println("There are " + getFactorial(num1)/getFactorial(num2) + " from " + num1 + " where order does not count.");
                System.out.println("There are " + getFactorial(num1)/getFactorial(num2) + " ways of choosing " + num2 + " from " + num1 + " where order does not count.");
        };
     
        
        //Question 5. Greatest Common Denominator
        
        int gcd;
        gcd=gcf(num1,num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcf(num1,num2));
        
        }
        
        //Question 6. Check for prime number
        boolean l,m;
        l=isPrime(num1);
        m=isPrime(num2);
        //System.out.println(l);
        //System.out.println(m);
        if (l==true)
             System.out.println(num1 + " is prime.");
        
        if (m==true)
             System.out.println(num2 + " is prime.");
        
        
        if (l==false)
                
                System.out.println(num1 + " is not prime.");
                
                
         if (m==false)
        
        System.out.println(num2 + " is not prime.");
        
               
       
        
        
        
    
    
    }

    public static int getAnInteger(String prompt) 
    {
               //Boolean goodInput= true;
		int input;
		System.out.print (prompt);
                
                Scanner scan = new Scanner (System.in);
                String input1= scan.next();               
                
		do{
			try 
                            {

				input = Integer.parseInt(input1);
				return Math.abs(input);
                                
                              //  goodInput = true;
                                
                            }
			catch (NumberFormatException e) 
                        {
				//System.out.print ("Please enter an integer> ");
                               return (0);
                                
                                //goodInput=false;      
                                
			}}
                
		while (true);
   
            


    
    }

    public static int getFactorial (int f)
            {
                int c;
                c=f;
         for(int i =(f - 1); i > 1; i--) 
         {
         c = c * i;
         //return c;
         }
            return c;
    
            }
    public static int fib(int n)
	{
		/* Declare an array to store Fibonacci numbers. */
	int f[] = new int[n+1];
	int i;
	
	/* 0th and 1st number of the series are 0 and 1*/
	f[0] = 0;
	f[1] = 1;
	
	for (i = 2; i <= n; i++)
	{
	/* Add the previous 2 numbers in the series
		and store it */
		f[i] = f[i-1] + f[i-2];
	}
	
	return f[n];
	}
	
	public static int gcf(int a, int b) {
    if (b == 0) return a;
    else return (gcf (b, a % b));
}
    
        
 public static boolean isPrime(int n) {
     //check if n is a multiple of 2
    if (n==2) return true;
    if (n%2==0) return false;
    //if not, then just check the odds
    for(int i=3;i*i<=n;i+=2) {
        if(n%i==0)
            return false;
        
    }
    return true; 
    
 }
        
        
}
