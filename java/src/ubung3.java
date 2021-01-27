import java.util.Scanner;

public class ubung3 {
    /**
     *
     */
    private static final Scanner SCANNER2 = new Scanner(System.in);

    public static void main(String[] args) throws Exception {


         int n; 
         Scanner scanner = SCANNER2;
         System.out.println("enter nummer n: ");
         n = scanner.nextInt();
         if ( n % 2 == 0){
             System.out.println(n + " is even nummer");
         }
         else{
             System.out.println(n + "  is odd nummer");
         }
        
}
}
