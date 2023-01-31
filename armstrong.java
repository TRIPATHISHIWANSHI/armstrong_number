
import java.util.*;

public class Q4 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("SHIWANSHI TRIPATHI\n1000015412");
	      int check, rem, sum = 0,n=0;
	      System.out.println("Enter the number:");
	       int number = sc.nextInt();
	       int copy=number;
	      check = number;
	      while(copy>0)    
	      {   
	      copy = copy/10;   
	      n++;   
	      }
	      while(check != 0) {
	         rem = check % 10;
	         sum = sum +(int) Math.pow(rem,n);
	         check = check / 10;
	      }
	      if(sum == number)
	         System.out.println("Given number is an armstrong number.");
	      else
	         System.out.println("Given number is not an armstrong number.");
	}

}
