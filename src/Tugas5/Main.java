package Tugas5;

public class Main {

    public static void main(String[] args) {
        // membuat objek dari class User
        User prasetya = new User();

        // menggunakan method setter
        prasetya.setUsername("Prasetya");
        prasetya.setKelas("X TKJ 2");
        prasetya.setSekolah("SMK Bina Nusantara");
        prasetya.setAlamat("Wonosari Rt.02/Rw.04, Semarang, Jawa Tengah");
        prasetya.setUmur(16);
        prasetya.setTtl("Semarang 9 Juni 2005");

        // menggunakan method getter
        System.out.println("--------------------------------------------------------");
        System.out.println("Nama: " + prasetya.getUsername());
        System.out.println("Kelas: " + prasetya.getKelas());
        System.out.println("Sekolah: " + prasetya.getSekolah());
        System.out.println("Alamat: " + prasetya.getAlamat());
        System.out.println("Umur: " + prasetya.getUmur());
        System.out.println("Tempat tanggal lahir: " + prasetya.getTtl());
        System.out.println("--------------------------------------------------------");
    }
}
