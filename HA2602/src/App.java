public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        student.name = "A";
        student.studentId = 16042446;
        student.theoryPoint = 75;
        student.practicePoint = 85;
        student.display();
        student.mediumScore();
        
        Student student2 = new Student();
         student2.name = "B";
         student2.studentId = 14256114;
         student2.theoryPoint = 65;
         student2.practicePoint = 70;
         
        student2.display();
        student2.mediumScore();

        Student student3 = new Student();
        student3.name = "C";
        student3.studentId = 123456;
        student3.theoryPoint = 70;
        student3.practicePoint = 91;
        
        student3.display();
        student3.mediumScore();

        Student student4 = new Student("D", 172568, 81, 82);

        student4.display();
        student4.mediumScore();
    }
}
