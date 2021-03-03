package Tugas5;

public class User {
    private String username;
    private String kelas;
    private String sekolah;
    private String alamat;
    private Integer umur;
    private String ttl;

    // ini method setter
    public void setUsername(String username){
        this.username = username;
    }

    public void setKelas(String kelas){
        this.kelas = kelas;
    }

    public void setSekolah(String sekolah){
        this.sekolah = sekolah;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void setUmur(Integer umur){
        this.umur = umur;
    }

    public void setTtl(String ttl){
        this.ttl = ttl;
    }

    // ini method getter
    public String getUsername(){
        return this.username;
    }

    public String getKelas(){
        return this.kelas;
    }

    public String getSekolah(){
        return this.sekolah;
    }

    public String getAlamat(){
        return this.alamat;
    }

    public Integer getUmur(){
        return this.umur;
    }

    public String getTtl(){
        return this.ttl;
    }
}
