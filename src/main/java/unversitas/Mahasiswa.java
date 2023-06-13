
package Universitas;

public class mahasiswa {
    private String nama;
    private String npm;
    private String prodi;
    
public mahasiswa(String nama, String npm, String prodi) {
    this.nama = nama;
    this.npm = npm;
    this.prodi = prodi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    public String getDetail(){
        return "Nama : "+nama +"\nNPM:" +npm +"\nProgram Studi :" +prodi;
    }

}


