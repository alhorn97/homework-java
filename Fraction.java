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
//import java.util.Scanner;


     
 public class  Fraction { 
      private int x;
      private int y;
      
     public static void main(String[] args) {
        // Fraction(3,2);
     }
                       
      public Fraction(int a, int b) {
          //Fraction(3,2);
          //System.out.println(b);
         
           int x1,y1,r1,z1;
              x1=Math.abs(a);
              y1=Math.abs(b);
              z1=Math.abs(x1/y1);
              r1=x1%y1;
          
          String s,g;
          s=(a+"/"+b);
          g=Integer.toString(a).substring(0,1);
         int k=a*b;
         //System.out.println(k);
         if (k==0)
         {
             System.out.println("Invalid denominator.");
         
         }
         
         if ((a/b==1) && (a>0))
              System.out.println(Math.abs(1));
         
         else if ((b<0)&& (a>0) || ((a<0)&& (b>0)) )
          {
             //System.out.println("test");
             //System.out.println("-" +s); 
             System.out.println("test120");
              int x,y,r,z;
              x=Math.abs(a);
              y=Math.abs(b);
              z=Math.abs(x/y);
              r=x%y;
              //System.out.println(s);
              //System.out.println("Whole number result: " +z);
              //System.out.println("Remainder: " +r);
              if (z==0)
                  System.out.println ("-" + Integer.toString(r) + "/" + Integer.toString(y));
              if ((r>0) && (z!=0))
              System.out.println ("-" + Integer.toString(z) + " " + Integer.toString(r) + "/" + Integer.toString(y));
              if ((r==0)&& (z!=0))
                   System.out.println ("-"+Integer.toString(z));
              
                       
          }
          
          else if (a==0 || b==0)
                System.out.println("0 is not valid.");
          else if ((b<a) && (b>0))
              
          {
               System.out.println("test9");  
             // System.out.println("test1");
              int x,y,r,z;
              x=Math.abs(a);
              y=Math.abs(b);
              z=Math.abs(x/y);
              r=x%y;
              //System.out.println(s);
              //System.out.println("Whole number result: " +z);
              //System.out.println("Remainder: " +r);
              if (r>0)
              System.out.println (Integer.toString(z) + " " + Integer.toString(r) + "/" + Integer.toString(y));
              if (r==0)
                   System.out.println (Integer.toString(z));
          }
          else if ((b<0)|| (a<0))
          {
               System.out.println("test67");   
              int x,y,r,z;
              x=Math.abs(a);
              y=Math.abs(b);
              z=Math.abs(x/y);
              r=x%y;
              //System.out.println(s);
              //System.out.println("Whole number result: " +z);
              //System.out.println("Remainder: " +r);
              if (r>0)
              System.out.println ("-" + Integer.toString(z) + " " + Integer.toString(r) + "/" + Integer.toString(y));
              if (r==0)
                   System.out.println (Integer.toString(z));
              
          }
          
          else if ((b<0)|| (a>0))
          {
                System.out.println("test55");
                //System.out.println(b);
                
              int x,y,r,z;
              x=Math.abs(a);
              y=Math.abs(b);
              z=Math.abs(x/y);
              r=x%y;
              //System.out.println(s);
              //System.out.println("Whole number result: " +z);
              //System.out.println("Remainder: " +r);
              if (z==0)
              {
                  System.out.println(x+"/"+y);
                  //return (x+"/"+y);
              }
              
              
              //else if ((r>0)&& (z==0))
              //System.out.println ("-" + Integer.toString(z) + " " + Integer.toString(r) + "/" + Integer.toString(y));
              else if ((r==0) && (z==0))
              {
                 System.out.println (Integer.toString(z));
                 //return (Integer.toString(z));
              }
              
          }
          
          else if ((a<b)&& (a>0))
          {
              System.out.println("test2");
              int x,y,r,z;
              x=Math.abs(a);
              y=Math.abs(b);
              z=Math.abs(x/y);
              r=x%y;
              //System.out.println(s);
              //System.out.println("Whole number result: " +z);
              //System.out.println("Remainder: " +r);
              if (r>0)
              System.out.println (Integer.toString(z) + " " + Integer.toString(r) + "/" + Integer.toString(y));
              if (r==0)
                   System.out.println (Integer.toString(z));
              
          }
                else
              //System.out.println("test");
          {
               System.out.println("test3");
              System.out.println(s);
          }
         
         
          
      }
 }
       
        

               
    



