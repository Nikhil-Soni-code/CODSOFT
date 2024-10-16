package CodSoft;

import java.util.Scanner;
class StudentData{
    String name;
    float marks1;
    float marks2;
    float marks3;
    float marks4;
    float marks5;
}
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentData student = new StudentData();
        System.out.println("Enter the name of student");
        student.name = sc.nextLine();
        System.out.println("Enter Marks of 1st Subject");
        student.marks1 = sc.nextFloat();
        System.out.println("Enter Marks of 2nd Subject");
        student.marks2 = sc.nextFloat();
        System.out.println("Enter Marks of 3rd Subject");
        student.marks3 = sc.nextFloat();
        System.out.println("Enter Marks of 4th Subject");
        student.marks4 = sc.nextFloat();
        System.out.println("Enter Marks of 5th Subject");
        student.marks5 = sc.nextFloat();
        float total = student.marks1+ student.marks2+ student.marks3+ student.marks4+ student.marks5;
        float average_percentage = total/5;
        String grade;
        if(average_percentage>90){
            grade = "Excellent";
        }
        else if(average_percentage>80){
            grade = "A";
        }
        else if(average_percentage>70){
            grade = "B";
        }
        else if (average_percentage>60) {
            grade = "C";
        }
        else if(average_percentage>50){
            grade = "D";
        }
        else if (average_percentage>30) {
            grade = "Pass";
        }
        else {
            grade = "Fail !";
        }
        System.out.println(student.name+", You had achieved "+(int)total+"/500");
        System.out.println("Percentage: "+average_percentage);
        System.out.println("Your Grade: "+grade);
    }
}
