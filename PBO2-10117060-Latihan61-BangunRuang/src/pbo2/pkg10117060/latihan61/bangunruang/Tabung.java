/**
 *NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 */
package pbo2.pkg10117060.latihan61.bangunruang;


public class Tabung extends BangunRuang{
    private double r;
    private double h;

    public void setR(double r) {
        this.r = r;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public double getH() {
        return h;
    }

    @Override
    public double hitungVolume() {
        return 3.14 * r * r * h;
    }
    
}
