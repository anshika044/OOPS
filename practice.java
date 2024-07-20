package OPPSinJAVA1;

public class practice {

    public static Frac add(Frac x, Frac y){
        int numerator = x.num*y.den+y.num*x.den;
        int denominator=x.den*y.den;
        Frac z= new Frac(numerator, denominator);
        return z;
    }

    public static int gcd(int num , int den){
        while(num%den!=0){
            int rem=num%den;
            num=den;
            den=rem;
        }
        return den;
    }

    public static class Frac{
        int num;
        int den;

        //constructor
        public Frac(int num, int den){
            this.num=num;
            this.den=den;
            simplify();
        }
        public void simplify(){
            int hcf=gcd(num, den);
            num/=hcf;
            den/=hcf;
        }
    }

    public static void main(String[] args) {
       Frac x=new Frac(7, 21);
        System.out.println(x.num+"/"+x.den);
        Frac y=new Frac(2, 16);
        System.out.println(y.num+"/"+y.den);
        Frac z= add(x, y);
        System.out.println(z.num+"/"+z.den);
    }
    
}
