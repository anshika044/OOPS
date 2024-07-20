package OPPSinJAVA1;
import OPPSinJAVA1.student;
public class constructor {
    
    //refer student file for constructor
    public static void main(String[] args) {
        //directly class se uthaya
        // student.noofstudents=100;
        // System.out.println(student.noofstudents);
         System.out.println(student.getnoofstudent());
        //constructor
        student x=new student("anshika", 37, 99.0);
        // System.out.println(x.noofstudents);
        System.out.println(x.getnoofstudent());

        //  System.out.println(x.name);
        //  x.name="mohit";//additional bhi de sakte h
        //  System.out.println(x.name);
        //  System.out.println(x.rno);
        //  System.out.println(x.percentage); 
        // //final keyword output
        // System.out.println(x.schoolname);

        //one more object
        //static keyword output
        student z=new student("mohit", 43, 98.0);
         //System.out.println(z.noofstudents);
         
         //default constructor
         student y= new student();
         y.name="sahil";
         y.rno=98;
         y.percentage=90.0;
         
        //  System.out.println(y.name);
        //  System.out.println(y.rno);
        //  System.out.println(y.percentage);
        // //final keyword output
        // System.out.println(y.schoolname);
    }
    
}
