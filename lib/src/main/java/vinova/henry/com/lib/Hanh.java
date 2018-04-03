package vinova.henry.com.lib;

import sun.security.provider.PolicySpiFile;

public class Hanh {
    public static final String KIM = "KIM";
    public static final String MOC = "MOC";
    public static final String THUY = "THUY";
    public static final String HOA = "HOA";
    public static final String THO = "THO";
    public static final String KHONG = "KHONG";

    String TenHanh;

    public Hanh() {
    }

    public String getTenHanh() {
        return TenHanh;
    }

    public int getHanh(){
        switch (TenHanh){
            case KIM:
                return 1;
            case THUY:
                return 2;
            case MOC:
                return 3;
            case HOA:
                return 4;
            case THO:
                return 5;
            default:
                return 10;
        }
    }

    public void setTenHanh(String tenHanh) {
        TenHanh = tenHanh;
    }
}
