// Rizqi Zamzami Jamil 20 2141762089 SIB-2E
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Penambahan {
    public static void main(String[] args){
        int nim[]= {2,1,4,1,7,6,2,0,8,9};
        int jumlah = 0;
        
        for( int numb : nim) {
            jumlah = jumlah+numb;
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("=-=-= PEMROGRAMAN BERBASIS OBJEK  2 =-=-=");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("|   Nama    : Rizqi Zamzami Jamil       |");
        System.out.println("|   NIM     : 2141762089                |");
        System.out.println("|   Kelas   : SIB-2E                    |");
        System.out.println("|   Absen   : 20                        |");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("|                                       |");
        System.out.println("   Hasil jumlah array nim adalah : "+jumlah+" ");
        System.out.println("|                                       |");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
