package OPPSinJAVA1;



public class fraction {

    public static Fraction add(Fraction f1,Fraction f2){
    int numerator= f1.num*f2.den + f2.num*f1.den;
    int denominator= f1.den*f2.den;
    Fraction f3=new Fraction(numerator,denominator);
    return f3;
    }

    public static Fraction multiply(Fraction f1,Fraction f2){
        int numerator= f1.num*f2.den-f2.num*f1.den;
        int denominator= f1.den*f2.den;
        Fraction f3=new Fraction(numerator,denominator);
        return f3;
        }

        public static Fraction sub(Fraction f1,Fraction f2){
            int numerator= f1.num*f2.den + f2.num*f1.den;
            int denominator= f1.den*f2.den;
            Fraction f3=new Fraction(numerator,denominator);
            return f3;
            }

            public static Fraction div(Fraction f1, Fraction f2){
                int numerator= f1.num*f2.den;
                int denominator= f1.den*f2.num;
                Fraction f3=new Fraction(numerator, denominator);
                return f3;
            }

    public static int gcd(int num, int den){
        while(num%den!=0){
            int rem=num%den;
            num=den;
            den=rem;
        }
        return den;
    }

    

    public static class Fraction{
     int num;//numerator
     int den; //denominator

     //constructor
     public Fraction(int num, int den){
        this.num=num;
        this.den=den;
        simplify();
     }

     public void simplify(){
        int hcf= gcd(num,den);
        num/=hcf;
        den/=hcf;

     }
    
    
    }
    
    public static void main(String[] args) {
        Fraction f1=new Fraction(2, 16);
        System.out.println(f1.num+ "/" + f1.den);
        //f1.simplify();
        //System.out.println(f1.num+ "/" + f1.den);
        Fraction f2=new Fraction(8, 4);
        System.out.println(f2.num+"/"+f2.den);
        Fraction f3=div (f1,f2);
        System.out.println(f3.num+"/"+f3.den);
    }
    
}
