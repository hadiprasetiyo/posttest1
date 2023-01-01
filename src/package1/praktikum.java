package package1;

import package2.ruangan;
import package2.mahasiswa;

// main class
public class praktikum {

    public static void main(String args[]) {
        System.out.println("LABORATORY BUILDING \n");
        // object ruangan
        ruangan a = new ruangan("D303","Lab Web Engineering","2 jam");
        a.tampilkan();
        
        System.out.println("Daftar Mahasiswa Yang Mengikuti Praktikum :\n");
        // object mahasiswa
        mahasiswa satu = new mahasiswa(35,"cede");
        satu.tampilkan();
        mahasiswa dua = new mahasiswa(70,"io");
        dua.tampilkan();
    }
}