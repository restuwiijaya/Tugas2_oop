
package oop.tgs.pkg2;

/**
 *
 * @author Restu Wijaya
 */
public class hitungvbalok {
    private double Panjang;
    private double Lebar;
    private double Tinggi;
    double Hasil;

    public void SetPanjang(double Pj){
        this.Panjang = Pj;
    }
    public void SetLebar(double Lb){
        this.Lebar = Lb;
    }
    public void SetTinggi(double Tg){
        this.Tinggi = Tg;
}
private double HitungHasil(){
    this.Hasil = 0.5 * this.Panjang * this.Lebar * this.Tinggi;
    return this.Hasil; 
}
public void CetakHasil(){
this.HitungHasil();
System.out.println("Hitung Luas Balok");
System.out.println("===================");
System.out.println("Nilai Alas          : "+this.Panjang+" cm");
System.out.println("Nilai Tinggi        : "+this.Lebar+" cm");
System.out.println("Nilai Tinggi        : "+this.Tinggi+" cm");
System.out.println("Jadi Volume Balok   : "+this.Hasil+"cm²");
}
}