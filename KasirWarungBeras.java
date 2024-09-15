
package kasir.warung.beras;
import java.util.Scanner;
public class KasirWarungBeras {

    public static void main(String[] args) {
        // deklarasi 
        double harga_beras, total_harga, harga_setelah, potongan, jumlah, Rp, kembali = 0;
        Scanner input = new Scanner (System.in);
        
        //input jumlah beli
        System.out.println("Program Kasir Warung Beras");
        System.out.print("Masukkan jumlah beli (/kg) =");
        jumlah = input.nextDouble();
        
        //input harga beras
        System.out.print("Masukkan harga beras (/kg) =");
        harga_beras = input.nextDouble();
        
        //hitung harga
        total_harga = harga_beras * jumlah;
        potongan = total_harga * 5.0 /100;
        harga_setelah = total_harga - potongan;
        
        //
        System.out.println("Harga Awal       :Rp" +total_harga);
        System.out.println("Potongan Harga 5%:Rp" +potongan);
        System.out.println("Harga Akhir      :Rp" +harga_setelah);
        
        
        //pembayaran
        System.out.print("Uang Pembayar    :Rp" );
        Rp = input.nextDouble();
        
        //kembalian
        
        kembali = Rp - harga_setelah;
        System.out.println("Kembalian   :Rp" + kembali);
        
    }
    
}
