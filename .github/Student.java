import javax.swing.text.GapContent;

// Starting memory diagram 
a = 8
b = 3
c = Star

// Ending memory diagram 
a = *9
b = /3
c = sun

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

        newGPA = (grade0 + grade1 + grade2 + grade3) / 4;
        System.out.print("The new GPA is");
        System.out.print1n(newGPA);
    }

    public static voide newLine() {   
        System.out.println();

    }

    public static void threeLine() {
        newLine();
        newline();
        newline();
    }

    public static main(String[] args) {
        Student student0 = new Students ();
        Student student1 = new Students(87654321,9,10.4,"Bingo");

        System.out.println("Hello there!");
        threeLine();
        System.out.println("General Kenobi")
    }

    public static void threeline() {
        new line();
        new line();
        new line();
    }



    // Parameters and  Arugments 
    public static void assignLunch(int gradeLevel){
        String lunchPeriod;

        if (gradeLevel == 9) {
            lunchPeriod = "Third Lunch";
            System.out.print("This student has ");
            System.out.println(lunchperiod);
        } else if (gradeLevel == 10) {
            lunchPeriod = "First Lunch"
            System.out.print("This studnet has ");
            System.out.println("lunchPeriod");
        } else if (gradeLevel == 11)  {
            lunchPeriod = "Second Lunch";
            System.out.print("This student has");
            System.out.println(lunchPeriod);
        } else {
            lunchPeriod = "Outside lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
