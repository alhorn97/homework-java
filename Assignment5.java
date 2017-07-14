/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

/**
 *
 * @author ahorn
 */
import java.util.Scanner;

public class Assignment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int myIVALUE =0 ;
        String strVALUE;
                
        int base,base2;
        boolean goodInput= false;
       
        System.out.print("What is the starting BASEx {2, 4, 8, 10 or 16} :  ");
        Scanner input1 = new Scanner(System.in);
        base=input1.nextInt();
        
        
        
       do 
        {
            System.out.println("Enter a valid BASE" + base + " value to convert: ");
            Scanner input2 = new Scanner(System.in);
            strVALUE = input2.nextLine();
            
            System.out.print("Select the NEW BASEx {2, 4, 8, 10 or 16} :  ");
            Scanner input3= new Scanner(System.in);
            base2=input3.nextInt();
     
            try
            {
            myIVALUE=Integer.valueOf(strVALUE, (base));
          //  System.out.println("Your Base10 integer is: " + myIVALUE);
            goodInput=true;
            }
            catch ( NumberFormatException nfe )
            {
                System.out.println("Sorry you entered a bad value.");
                System.out.println();
            }
            
                }   while (!goodInput);
            //Final result
            System.out.println("Your BASE" + base2 +" result is: "+ (Integer.toString(myIVALUE,base2)));
          
        
    }
        
    
}
