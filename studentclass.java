package OPPSinJAVA1;

public class studentclass {
    // public static class student{//student class 
    //     String name;
    //     int rno;
    //     double percentage;
    // }
    
    
    static void fun(student x){
        System.out.println(x.name);
        return;
    }

    
    public static void change(int c){//passby value
        c=8;
     }
 

    
     public static void change(student c){//passby value
       c.name="rony";
    }

    public static void main(String[] args) {
        student x=new student();//declare
        x.name="anshika";//objects
        // x.rno=89;
        x.percentage=56.3;
        //getter
        System.out.println(x.getrno());//we can acess function with . too
        //setter
        x.setrno(76);
        System.out.println(x.getrno());
        
        //  System.out.println(x.percentage);
        // student y=new student();
        // y.name="anshi";
        // y.rno=9;
        // y.percentage=90.3;
        //  System.out.println(y.name);
        // fun(x);

         
        
        // int b =5;//this pass by value
        // System.out.println(b);
        // change(b);
        // System.out.println(b);

        
        
        // //pass by reference
        // System.out.println(x.name);
        // change(x);
        // System.out.println(x.name);
       

        
    }
    
}
