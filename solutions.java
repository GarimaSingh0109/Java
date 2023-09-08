import java.util.*;


public class solutions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int n = scan.nextInt(); 
        int n = solutions.main(String[]);
        scan.close();

        //System.out.println( ((n & 1) == 1 || (6 <= n && n <= 20)) ? "Weird" : "Not Weird");
        if (n%2<0 || n%2>0){
            System.out.println(" Weird");
        } else if (n%2==0 || 2<n<5){
            System.out.println("Not  Weird");
        }else if (n%2==0 || 6<n<20 ){
            System.out.println(" Weird");

        }else (n%2==0 || n>20){
            System.out.println("Not  Weird");
        }
    }
}
