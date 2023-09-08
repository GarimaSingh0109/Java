import java.util.Scanner;
import java.util.*;
public class CalOfNum{
	public static void main (String args[]){
		int x,y,sum,sub,mul,din,mod;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two number");
		x=sc.nextInt();
		y=sc.nextInt();
		sum = x+y;
	    System.out.println(sum);
		sub = x-y;
	    System.out.println(sub);
		mul = x*y;
	    System.out.println(mul);
		//div = x\y;
	    //System.out.println(div);
		mod = x+y;
	    System.out.println(mod);
	}
}