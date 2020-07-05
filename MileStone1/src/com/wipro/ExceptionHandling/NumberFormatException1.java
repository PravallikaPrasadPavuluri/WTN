package com.wipro.ExceptionHandling;
import java.util.Scanner;
public class NumberFormatException1 {
	


	 public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  for (int i = 0; i < 2; i++) {
	   String name = "";
	   int subject_1 = 0;
	   int subject_2 = 0;
	   int subject_3 = 0;
	   
	   try {    
	    name = sc.nextLine();
	    
	    if (sc.hasNextInt())
	     subject_1 = sc.nextInt();
	    else
	     throw new NumberFormatException();
	    
	    if (sc.hasNextInt())
	     subject_2 = sc.nextInt();
	    else
	     throw new NumberFormatException();
	    
	    if (sc.hasNextInt())
	     subject_3 = sc.nextInt();
	    else
	     throw new NumberFormatException();
	    
	    if (subject_1 < 0) throw new NegativeArraySizeException();
	    if (subject_1 > 100) throw new Exception();
	    
	    if (subject_2 < 0) throw new NegativeArraySizeException();
	    if (subject_2 > 100) throw new Exception();
	    
	    if (subject_3 < 0) throw new NegativeArraySizeException();
	    if (subject_3 > 100) throw new Exception();
	    
	    
	   } catch (ArithmeticException e) {
	    System.out.println(e.getMessage());
	   } catch (NegativeArraySizeException e) {
	    System.out.println(e.getMessage());
	   } catch (Exception e) {
	    System.out.println(e.getMessage());
	   }
	   
	   System.out.println("Name: " + name);
	   System.out.println("Marks of subject A: " + subject_1);
	   System.out.println("Marks of subject B: " + subject_2);
	   System.out.println("Marks of subject C: " + subject_3);
	  }
	  
	  sc.close();

	 }

	}
