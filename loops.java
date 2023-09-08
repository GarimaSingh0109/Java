public class loops {
    public static void main(String args[]) {
        for(int counter = 0; counter < 11; counter = counter + 1){
            System.out.println(counter);
        }
        int i = 0;
        while(i < 11) {
           System.out.println(i);
           i = i + 1; //i++
        }
        do{ 
           System.out.println(i);
           i = i + 1;
        } while(i < 11);
        int i = 12;
        while(i < 11){
        System.out.println("Dodo");
        }
        do {
           System.out.println("Dodo");

        } while(i < 11);
       int i = 0;
       i = i+1; 
       while(i%2 + 1 == 0){
           System.out.println(i);
          
       }
    } 


    
    
}
