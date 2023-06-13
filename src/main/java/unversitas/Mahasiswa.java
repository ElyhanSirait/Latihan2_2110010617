
package unversitas;

public class Mahasiswa {
   Private int npm;
   Private String nama;
   Private String prodi;

public int getnpm(){
    return npm;
}
public void setnpm(int n) {
    this.npm = n;
}
public string getnama(){
    return nama;
}
public void setnama(string nm) {
    this.nama = nm;
}
public int getprodi(){
    return prodi;
}
public void setprodi(String p) {
    this.prodi = p;
}
  public void  Show(){
      System.out.println("NPM : "+ npm);
      System.out.println("Nama : "+ nama);
      System.out.println("Program Studi : "+ prodi);
  }
}

