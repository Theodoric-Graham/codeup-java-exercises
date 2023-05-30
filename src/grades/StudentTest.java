package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student theo = new Student("Theo");
        theo.addGrade(100);
        theo.addGrade(90);
        theo.addGrade(80);
        System.out.println(theo);
        theo.getGradeAverage();
    }
}
