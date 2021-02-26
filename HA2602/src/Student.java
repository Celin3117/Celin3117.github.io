

public class Student {
    public int studentId;
    public String name;
    public float theoryPoint;
    public float practicePoint;

    public Student(){};

    public Student(String name, int studentId, float practicePoint, float theoryPoint){
        this.name = name;
        this.studentId = studentId;
        this.theoryPoint = theoryPoint;
        this.practicePoint = practicePoint;
    }

    public void display(){
        System.out.println("name: " +name);
        System.out.println("StudentID: " +studentId);
        System.out.println("theoryPoint: " +theoryPoint);
        System.out.println("practicePoint: " +practicePoint);
    }
    public void mediumScore (){
        float mediumScore = (practicePoint + theoryPoint) / 2;
        System.out.println("mediumScore: " +mediumScore);

    }
}
