/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author ahorn
 * 
 */
import java.util.Scanner;



public class Assignment7 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        //String input1= scan.next();
        int numerator1,denominator1,numerator2,denominator2;
        int l;
        String result1,result2;
      //  public boolean status=false;
        
       // numerator1=-1;
        //denominator1=-1;
       // numerator1=getAnInteger("Enter numerator: ");
      do 
      {
          numerator1=getAnInteger("Enter numerator: ");
          if (numerator1==-0)
              System.out.println("0 is not a valid value.");
      } while (numerator1==-1 || numerator1==-0);
      
       
      
         do 
      {
          denominator1=getAnInteger("Enter denominator: ");
           if (denominator1==-0)
              System.out.println("0 is not a valid value.");
      } while (denominator1==-1 || denominator1==-0);
        
         l=gcf(numerator1,denominator1);
        
        Fraction f1 = new Fraction ((numerator1/l),(denominator1/l));
        result1=f1.toString();
        //System.out.println(f1.toString());
        
        do 
      {
          numerator2=getAnInteger("Enter second numerator: ");
          if (numerator2==-0)
              System.out.println("0 is not a valid value.");
      } while (numerator2==-1 || numerator2==-0);
        
             do 
      {
          denominator2=getAnInteger("Enter second denominator: ");
           if (denominator2==-0)
              System.out.println("0 is not a valid value.");
      } while (denominator2==-1 || denominator2==-0);
      
       
        
        l=gcf(numerator2,denominator2);
        
        Fraction f2 = new Fraction ((numerator2/l),(denominator2/l));
        result2=f2.toString();
        
        
      
        
 
        //System.out.println(result1 + " + " + result2 + " =");
        //System.out.println(f1+" - "+ f2);
        //System.out.println(f1+" * "+ f2);
        //System.out.println(f1+" / "+ f2);
     
        
    }
    
    public static int getAnInteger(String prompt) 
    {
               //Boolean goodInput= true;
		int input;
		System.out.print (prompt);
               
                
                Scanner scan = new Scanner (System.in);
                String input1= scan.next(); 
                if (input1.equals("0"))
                        input1="0 is not valid.";
                        
               
                
                
                String c;
                c=input1.substring(0,1);
                //System.out.println(c);
                //System.out.println(input1);
                
		do{
                      
			try 
                            {
                                //System.out.println(input1);
				input = Integer.parseInt(input1);
                                
                                return input;
                                
                          
                                
                            }
			catch (NumberFormatException e) 
                        {
			if (input1.equals("0 is not valid."))
                            return (-0);
                        
                         return (-1);
                                
                                   
                                
			}}
                
		while (true);
   
 
    }
    
    public static int gcf(int a, int b) {
    if (b == 0) return a;
    else return (gcf (b, a % b));
}
    
}
