package com.aditech.ProblemSolving;
import java.util.Scanner;

/**
 * Nuclear reactor
 * 
 * @author Aditya Bhatnagar
 *
 */
class NuclearReactor {
	
	/**
	 * a -> total number of particles
	 * n -> limit of particles in a chamber
	 * k -> nuclear reactors
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int a,n,k;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		n = sc.nextInt();
		k = sc.nextInt();
		sc.close();
		
		int c[] = new int[k];
		for(int i=0;i<a;i++)
		{
		 c[0]++;
		 if(c[0]>n)
		 {
		     c[0]=0;
		     for(int j=1;j<k;j++)
		     {
		         c[j]=c[j]+1;
		         if(c[j]>n)
		         {
		            c[j]=0;
		         continue;
		         }
		         else
		         break;
		     }
		     
		 }
		}
		for(int i=0;i<k;i++)
		{
		    System.out.print(c[i]);
		    System.out.print(" ");
		}
	}
		
}
