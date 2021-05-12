public class tamgiac {
    void kttamgiac(double c1,double c2,double c3){
        double t3= c1+c2;
        double t1 = c2+c3;
        double t2 = c3+c1;
        if ((t1>c1) && (t2>c2) && (t3>c3)){
            System.out.println("Đây là hình tam giác");
        } else {
            System.out.println("Đây không phải là hình tam giác");
        }
    }

}
