package package2;

public class mahasiswa {
    int NIM;
    String Nama;
    
// constructor
    public mahasiswa(int nim,String nama){
        this.NIM = nim;
        this.Nama = nama;
    }
// method
    public void tampilkan(){
        System.out.println("NIM"+"\t"+":"+this.NIM);
        System.out.println("Nama"+"\t"+":"+this.Nama+"\n");
    }
}