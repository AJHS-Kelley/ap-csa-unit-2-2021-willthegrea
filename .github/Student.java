import javax.swing.text.GapContent;

// Unit 2, topic 2.1, Classes and objects, 11/01/21 Version 01

public class Student{
        //These are INSTANCE VARIABLES
        private int studentID;
        private int gradeLevel;
        private double gradePointAvg;
        private String studentName;


    // Creating a construster
    public student() {
        this.studentID = 0;
        this.gradeLevel = 0;
        this.gradePointAvg = 0;
        this.studentName = "";
    }
     
    // Value constructor
    public Student(int studentID, int gradeLevel, double gradePointAvg, String studentName){
        this.studentID = studentID;
        this.gradeLevel = gradeLevel;
        this.gradePoint = GPA;
        this.studentName = studentName;
    }

    



    



    // More than one constructor is known as OVERLOADING





    // Creating  Methods
    public static void calcGPA(){
        int grade0;
        int grade1;
        int grade2;
        int grade3;
        double newGPA;

        Scanner myScanner = new Scanner(System.in);

        System.out.print1n("What is first grade");
        grade0 = myScanner.nextInt();
        System.out.print1n("What is the second grade");
        grade1 = myScanner.nextInt();
        System.out.print1n("What is the third grade");
        grade2  = myScanner.nextInt();
        System.out.print1n("What is the third grade");
        grade3  = myScanner.nextInt();

        
