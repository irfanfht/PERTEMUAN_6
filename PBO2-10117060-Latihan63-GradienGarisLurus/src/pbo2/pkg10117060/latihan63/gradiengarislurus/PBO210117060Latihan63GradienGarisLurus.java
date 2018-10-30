/**
 *NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 */
package pbo2.pkg10117060.latihan63.gradiengarislurus;

public class PBO210117060Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat garis = new Koordinat(2, 10, 5, 7);
        System.out.println("Garis yang melalui titik" + "(" + garis.getY2() + "," + garis.getY1() + ")" + "dan" + "(" + garis.getX2() + "," + garis.getX1() + ")");
        System.out.println("memiliki gradien sebesar " + garis.hitungGradien());
        System.out.println("");
        Koordinat garis1 = new Koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik" + "(" + garis1.getY2() + "," + garis1.getY1() + ")" + "dan" + "(" + garis1.getX2() + "," + garis1.getX1() + ")");
        System.out.println("memiliki gradien sebesar " + garis.hitungGradien());
    }
    
}
