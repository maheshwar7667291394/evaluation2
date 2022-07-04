package Question1;

import java.util.Scanner;

public class Student {
    int rollNumber;
    String studentName;
    int marks;
    Student(){
        this.studentName="mahesh";
        this.marks=30;
        this.rollNumber=1232;

    }
    void createStudentclass(String name,int rollNumber,int marks){
        this.studentName=name;
        this.rollNumber=rollNumber;
        this.marks=marks;

    }
    void printdetails(){
        System.out.println(studentName);
        System.out.println(rollNumber);
        System.out.println(marks);

    }
    public static void main(String[] args){
        Student newstudent=new Student();
        Scanner input=new Scanner(System.in);
        System.out.println("ENter the number of student");
        int n=input.nextInt();
        for(int i=1;i<=2;i++){
            Scanner inputa=new Scanner(System.in);
            System.out.println("Enter the name of student"+" "+i);
            String name1=inputa.nextLine();
            System.out.println("ENter the rollNumber of"+" "+i);
            int rollnum1=inputa.nextInt();
            System.out.println("Enter the marks of student"+" "+i);
            int marks1=inputa.nextInt();
            newstudent.createStudentclass(name1,rollnum1,marks1);
            newstudent.printdetails();

        }

    }
}
