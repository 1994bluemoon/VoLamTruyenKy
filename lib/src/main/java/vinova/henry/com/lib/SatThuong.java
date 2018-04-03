package vinova.henry.com.lib;

import static vinova.henry.com.lib.MonPhai.QUAIVAT_DAULINH;
import static vinova.henry.com.lib.MonPhai.QUAIVAT_THONGTHUONG;

public class SatThuong extends Hanh{
    int CapDo;
    int SatThuong;

    public SatThuong(int capDo) {
        super();
        CapDo = capDo;
    }

    public int getCapDo() {
        return CapDo;
    }

    public void setSatThuong(int satThuong) {
        SatThuong = satThuong;
    }

    public int getSatThuong(String tenMonPhai, int capdo){
        switch (tenMonPhai){
            case QUAIVAT_DAULINH:
                return capdo * 7;
            case QUAIVAT_THONGTHUONG:
                return capdo * 3;
            default:
                return capdo * 5;
        }
    }
    public int getSatThuong(){
        return this.SatThuong;
    }
}
