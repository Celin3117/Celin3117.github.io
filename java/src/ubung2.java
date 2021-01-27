import java.util.Scanner;

public class ubung2 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter circle radius: ");
        
        Double r = scanner.nextDouble(); 
        double PI = Math.PI;
        Double dt = 2*PI*r;
        System.out.format("dien tich hinh tron: %f", dt);
        
        
        double cv = PI*r*r;
        System.out.format("Chu vi hinh tron: %f", cv);
        scanner.close(); 
          
}
}
