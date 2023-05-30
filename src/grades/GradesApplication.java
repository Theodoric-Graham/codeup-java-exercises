package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static Scanner sc = new Scanner(System.in);
    public static HashMap<String, Student> students = new HashMap<>();


    public static void main(String[] args) {
        createStudents();
        System.out.println("Welcome!");
        allGradesPrompt();
        classAveragePrompt();
        csvPrompt();
        createGithubList();
        selectStudent();
        System.out.println("Goodbye and have a good day!");
    }

    private static void createStudents() {
        Student theo = new Student("theo");
        theo.addGrade(100);
        theo.addGrade(90);
        theo.addGrade(80);
        Student paige = new Student("paige");
        paige.addGrade(90);
        paige.addGrade(80);
        paige.addGrade(70);
        Student cody = new Student("cody");
        cody.addGrade(70);
        cody.addGrade(90);
        cody.addGrade(65);
        Student cali = new Student("cali");
        cali.addGrade(100);
        cali.addGrade(67);
        cali.addGrade(84);
        students.put("Theodoric-Graham", theo );
        students.put("paige-rackley", paige);
        students.put("cody-the-cat", cody);
        students.put("cali-is-old", cali);
    }

    private static void allGradesPrompt() {
        System.out.println("Would you like to view all the grades for all the students? [y/n]");
        boolean allGrades = sc.nextLine().equalsIgnoreCase("y");
        if(allGrades) {
            for (Student student: students.values()) {
                System.out.println(student.getName() + student.getGrades());
            }
        }
    }

    private static void classAveragePrompt() {

        int classAverageSum = 0;

        System.out.println("Would you like to view the class average? [y/n]");
        boolean classAverage = sc.nextLine().equalsIgnoreCase("y");

        if(classAverage) {
            for (Student student: students.values()) {
                classAverageSum += student.getGradeAverage();
            }
            System.out.println(classAverageSum / students.size());
        }
    }

    private static void csvPrompt() {
        System.out.println("Would you like to view a csv report of all the students? [y/n]");
        boolean csvReport = sc.nextLine().equalsIgnoreCase("y");
        if(csvReport) {
            System.out.println("name, github_username, average");
            for (String student : students.keySet()) {
                System.out.printf("%s, %s, %.2f \n", students.get(student).getName(), student, students.get(student).getGradeAverage());
            }
        }
    }

    private static void createGithubList() {
        System.out.println("Here are the GitHub usernames of our students:");
        String githubUsers = "";
        for (String student : students.keySet()) {
            githubUsers += "|" + student + "| ";
        }

        System.out.println(githubUsers);
    }

    private static void selectStudent() {
        boolean confirm;
        do {
            System.out.println("What student would you like to see more information on?");
            String choice = sc.nextLine();
            if(students.containsKey(choice)) {
                System.out.printf("Name: %s - GitHub Username: %s \n", students.get(choice).getName(), choice );
                System.out.println("Student average: " + students.get(choice).getGradeAverage());
//                System.out.println(students.get(choice));
                System.out.println("All grades: " + students.get(choice).getGrades());
                System.out.println("Would you like to see another student? [y/n]");
                boolean input = sc.nextLine().equalsIgnoreCase("y");
                confirm = input;

            } else {
                System.out.printf("Sorry, no student found with the name of %s \n", choice);
                System.out.println("Would you like to see another student? [y/n]");
                boolean input = sc.nextLine().equalsIgnoreCase("y");
                confirm = input;

            }
        } while (confirm);
    }












}
