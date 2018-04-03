package vinova.henry.com.lib;

import static vinova.henry.com.lib.Hanh.HOA;
import static vinova.henry.com.lib.Hanh.KIM;
import static vinova.henry.com.lib.Hanh.MOC;
import static vinova.henry.com.lib.Hanh.THO;
import static vinova.henry.com.lib.Hanh.THUY;

public class MonPhai extends SatThuong{

    public static final String NGAMI = "NGAMI";
    public static final String THIEULAM = "THIEULAM";
    public static final String THIENVUONGBANG = "THIENVUONGBANG";
    public static final String NGUDOCGIAO = "NGUDOCGIAO";
    public static final String DUONGMON = "DUONGMON";
    public static final String THUYYENMON = "THUYYENMON";
    public static final String CAIBANG = "CAIBANG";
    public static final String THIENNHAN = "THIENNHAN";
    public static final String CONLON = "CONLON";
    public static final String VODANG = "VODANG";
    public static final String QUAIVAT_THONGTHUONG = "QVTT";
    public static final String QUAIVAT_DAULINH = "QVDL";

    String TenMonPhai;

    public MonPhai(String tenMonPhai, int capDo) {
        super(capDo);
        super.setSatThuong(super.getSatThuong(tenMonPhai, capDo));
        getTenHanhH(tenMonPhai);
        super.setTenHanh(getTenHanhH(tenMonPhai));
        this.TenMonPhai = tenMonPhai;
    }

    public String getTenMonPhai() {
        return TenMonPhai;
    }

    public void setTenMonPhai(String tenMonPhai) {
        TenMonPhai = tenMonPhai;
    }

    private String getTenHanhH(String monPhai){
        switch (monPhai){
            case CAIBANG:
                return HOA;
            case CONLON:
                return THO;
            case DUONGMON:
                return MOC;
            case NGAMI:
                return THUY;
            case NGUDOCGIAO:
                return MOC;
            case THIENVUONGBANG:
                return KIM;
            case THIEULAM:
                return KIM;
            case THUYYENMON:
                return THUY;
            case VODANG:
                return THO;
            case THIENNHAN:
                return HOA;
            default:
                return Hanh.KHONG;
        }
    }
}
