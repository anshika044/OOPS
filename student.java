package OPPSinJAVA1;

public class student {
     public String name;
     int rno;
    double percentage;
    final String schoolname="dps";
    private static int noofstudents;

    public static int getnoofstudent(){
        return noofstudents;
    }

        public int getrno(){//getter and its also an attribute
            return rno;
        }

        public void setrno(int roll){//setter
            rno = roll;
        }

    public void setrno1(int rno){//this keyword
      this.rno=rno;
    }



    //default constructor
    public student(){
        
    }

    //constructor
    public student(String naam, int roll, double per){
        name=naam;
        rno=roll;
        percentage=per;
        noofstudents++;
    }
}



