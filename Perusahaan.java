class karyawan{
    String namaKaryawan;
    int usiaKaryawan;
    String emailKaryawan;

    public karyawan(String nama, int usia){
        namaKaryawan = nama;
        usiaKaryawan = usia;
    }

    public void setEmail(String email){
        this.emailKaryawan = email;
    }

    public String getEmail(){
        return this.emailKaryawan;
    }

}

class divisi{
    String namaDivisi;
    int jumlahKaryawan;
    String tugasDivisi;

    public divisi(String nama, int jumlah, String tugas){
        namaDivisi = nama;
        jumlahKaryawan = jumlah;
        tugasDivisi = tugas;
    }

    public String getNamaDivisi(){
        return this.namaDivisi;
    }
}


public class Perusahaan{
    public static void main(String[] args) {
        karyawan karyawan1 = new karyawan("Ardeya Windy", 19);
        karyawan1.setEmail("ardeya.windy02@gmail.com");
        divisi divisi1 = new divisi("Administrasi", 5, "Mengatur keuangan");
           
        System.out.println("===Biodata Karyawan===");
        System.out.println("Nama Karyawan: " + karyawan1.namaKaryawan);
        System.out.println("Usia Karyawan: " + karyawan1.usiaKaryawan);
        System.out.println("Email Karyawan: " + karyawan1.getEmail());
        System.out.println("Divisi Karyawan: " + divisi1.getNamaDivisi());
     
    }
}