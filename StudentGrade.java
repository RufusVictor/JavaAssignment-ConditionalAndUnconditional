import java.util.Scanner;
public class StudentGrade {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        int score = scanner.nextInt();  
        scanner.close();  
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";  
        System.out.println("Grade: " + grade);  
    }  
}
