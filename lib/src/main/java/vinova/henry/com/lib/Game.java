package vinova.henry.com.lib;

import java.util.ArrayList;
import java.util.List;

public class Game {

    public static void main(String[] args) {
        List<VoLam> voLamList = new ArrayList<>();
        voLamList.add(new VoLam(MonPhai.CAIBANG, "bang chu", 50));
        voLamList.add(new VoLam(MonPhai.QUAIVAT_DAULINH,"boss", 50));
        voLamList.add(new VoLam(MonPhai.QUAIVAT_THONGTHUONG,"crep", 10));
        voLamList.add(new VoLam(MonPhai.QUAIVAT_THONGTHUONG, "crep", 10));
        voLamList.add(new VoLam(MonPhai.QUAIVAT_THONGTHUONG, "crep", 10));
        voLamList.add(new VoLam(MonPhai.QUAIVAT_THONGTHUONG, "crep", 10));
        voLamList.add(new VoLam(MonPhai.QUAIVAT_THONGTHUONG, "crep", 10));
        voLamList.add(new VoLam(MonPhai.QUAIVAT_THONGTHUONG, "crep", 10));

        voLamList.add(new VoLam(MonPhai.NGAMI, "thuy kieu", 11));
        voLamList.add(new VoLam(MonPhai.VODANG, "tong vien kieu", 15));
        voLamList.add(new VoLam(MonPhai.NGAMI, "chu chi nhuoc", 11));
        voLamList.add(new VoLam(MonPhai.THIENNHAN, "lenh ho sung", 15));

        int stCaoNhat = 0;
        for (int i = 0; i < voLamList.size(); i ++){
            if (stCaoNhat <= voLamList.get(i).getSatThuong()){
                stCaoNhat = voLamList.get(i).getSatThuong();
            }
        }
        for (int i = 0; i < voLamList.size(); i ++){
            if (stCaoNhat == voLamList.get(i).getSatThuong()){
                System.out.println("Phan tu co sat thuong cao nhat la " + i);
            }
        }

        System.out.println("sat thuong A len B la " + tinhSatThuong(voLamList.get(5), voLamList.get(11)));

    }

    public static int tinhSatThuong(VoLam A, VoLam B){
        if (A.getHanh() == B.getHanh() && A.getHanh() != 10){
            return A.getSatThuong();
        } else if (A.getHanh() == 1){
            switch (B.getHanh()){
                case 2:
                    return A.getSatThuong() + A.getSatThuong() * 10 / 100;
                case 3:
                    return A.getSatThuong() + A.getSatThuong() * 20 / 100;
                case 4:
                    return A.getSatThuong() - A.getSatThuong() * 20 / 100;
                default:
                    return A.getSatThuong();
            }
        } else if (A.getHanh() == 2){
            switch (B.getHanh()) {
                case 3:
                    return A.getSatThuong() + A.getSatThuong() * 10 / 100;
                case 4:
                    return A.getSatThuong() + A.getSatThuong() * 20 / 100;
                case 5:
                    return A.getSatThuong() - A.getSatThuong() * 20 / 100;
                default:
                    return A.getSatThuong();
            }
        } else if (A.getHanh() == 3){
            switch (B.getHanh()) {
                case 4:
                    return A.getSatThuong() + A.getSatThuong() * 10 / 100;
                case 5:
                    return A.getSatThuong() + A.getSatThuong() * 20 / 100;
                case 1:
                    return A.getSatThuong() - A.getSatThuong() * 20 / 100;
                default:
                    return A.getSatThuong();
            }
        } else if (A.getHanh() == 4){
            switch (B.getHanh()) {
                case 5:
                    return A.getSatThuong() + A.getSatThuong() * 10 / 100;
                case 1:
                    return A.getSatThuong() + A.getSatThuong() * 20 / 100;
                case 2:
                    return A.getSatThuong() - A.getSatThuong() * 20 / 100;
                default:
                    return A.getSatThuong();
            }
        } else if (A.getHanh() == 5){
            switch (B.getHanh()) {
                case 1:
                    return A.getSatThuong() + A.getSatThuong() * 10 / 100;
                case 2:
                    return A.getSatThuong() + A.getSatThuong() * 20 / 100;
                case 3:
                    return A.getSatThuong() - A.getSatThuong() * 20 / 100;
                default:
                    return A.getSatThuong();
            }
        } else {
            switch (B.getHanh()){
                case 10:
                    return 0;
                default:
                    return A.getSatThuong();
            }
        }
    }

}
