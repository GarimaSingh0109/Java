// Make a function to check if a number is prime or not.
import java.util.*;
public class function4{
	public static boolean isPrime(int number) {
       if (number <= 1) {
        return false;
       }
       for (int i = 2; i <= Math.sqrt(number); i++) {
          if (number % i == 0) {
           return false;
          }
        }
       return true;
    }
    public static void main(String args[]){
		Scanner  sc = new Scanner(System.in);
		int number = sc.nextInt();
        boolean isPrime = isPrime(number);
        if (isPrime) {
        System.out.println("The number is prime");
        } else {
        System.out.println("The number is not prime");
        }
	}
}