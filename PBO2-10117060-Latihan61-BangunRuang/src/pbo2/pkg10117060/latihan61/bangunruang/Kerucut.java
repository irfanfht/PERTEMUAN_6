/**
 *NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 */
package pbo2.pkg10117060.latihan61.bangunruang;


public class Kerucut extends BangunRuang {
    private double t;
    private double r;

    public void setT(double t) {
        this.t = t;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getT() {
        return t;
    }

    public double getR() {
        return r;
    }

    @Override
    public double hitungVolume() {
        return (1 * 3.14 * r * r * t) / 3;
    }
    
}
