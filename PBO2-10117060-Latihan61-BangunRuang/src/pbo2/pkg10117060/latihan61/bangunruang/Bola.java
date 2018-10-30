/**
 *NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 */
package pbo2.pkg10117060.latihan61.bangunruang;


public class Bola extends BangunRuang {
     private double r;

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public double hitungVolume() {
        return (4 * 3.14 * r * r * r) / 3;
    }
}
