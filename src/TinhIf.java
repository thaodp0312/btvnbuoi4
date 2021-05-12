public class TinhIf {
    void tinhif(int i) {
        if ((i == 1) || (i==3) || (i==5) || (i==7)|| (i==8)|| (i==10)||(i==12)){
            System.out.println("Tháng " + i + " có 31 ngày");
        } else if (i == 2) {
            System.out.println("Tháng " + i + " có 28 hoặc 29 ngày");
        } else if ((i == 4) || (i==6)||(i==9)||(i==11))
            System.out.println("Tháng " + i + " có 30 ngày");
            else{
            System.out.println("Tháng " + i + " không tồn tại");
        }
    }
}
