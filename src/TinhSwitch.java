public class TinhSwitch {
    void tinhswitch (int thang){
        switch (thang){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng "+thang+" có 31 ngày");
                break;
            case 2:
                System.out.println("Tháng "+thang+" có 28 hoặc 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng "+thang+" có 30 ngày");
            default:
                System.out.println("Tháng "+thang+" không tồn tại");
        }
    }
    }
