public class PTbac2 {
    double n1;
    double n2;
    void ptbac2(double a,double b,double c){
        double delta;
        delta=b*b-4*a*c;
        if (delta<0){
            System.out.println("Phương trình vô nghiệm");
        } else if(delta==0){
            n1=b*(-1)/(2*a);
            System.out.println("Phương trình có một nghiệm kép "+ n1);
        }else {
            n1=(b*(-1)+Math.sqrt(delta))/(2*a);
            n2=(b*(-1)-Math.sqrt(delta))/(2*a);

            System.out.println("Phương trình có 2 nghiệm phân biệt "+ n1 +" và " +n2);}
    }
}
