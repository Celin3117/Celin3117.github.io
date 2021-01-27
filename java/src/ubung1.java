import java.util.Scanner;

public class ubung1 {
     public static void main(String[] args) throws Exception {
    /*double a = 3;
    double b = 4;
    double c = Math.sqrt(Math.pow (a, 2) + Math.pow (b,2));
    System.out.println(c);
    System.out.printf("%f", c);*/
    
    /*int day, month, year;
    day = 31;
    month = 01;
    year = 1997;
    System.out.printf("%d/%d/%d", day, month, year);*/
   

   /* Scanner scanner = new Scanner(System.in);
    int a;
    System.out.println("Nhap a: ");
    a = scanner.nextInt();

    System.out.println(a);
    scanner.close()
    }
    */
  /*Scanner scanner = new Scanner(System.in);
    String name;
    System.out.println("enter name: ");
    name = scanner.nextLine();
    System.out.println(name);

    int old;
    System.out.println("enter old: ");
    old = Integer.valueOf(scanner.nextLine());


    String homeTown;
    System.out.println("enter homeTown: ");
    homeTown = scanner.nextLine();
    scanner.close();  
      System.out.println("Xin chao, toi ten la " +name +", toi "+age+" tuoi, toi den tu "+village);*/

 Scanner scanner = new Scanner(System.in);
 
   
    double weight;
    System.out.println("enter weight (in kilogram): ");
    weight = scanner.nextDouble();
    
    double height;
    System.out.println("enter height (in meter): ");
    height = scanner.nextDouble();
    
    double soBMI = weight / (height *height);
    System.out.println("Chi so BMI: ");
    System.out.println(soBMI);
    
    scanner.close();

  }
  
}






