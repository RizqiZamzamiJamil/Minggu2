// Rizqi Zamzami Jamil 20 2141762089 SIB-2E
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Piramida {
    public static void main(String[] args){
        int nim[]= {2,1,4,1,7,6,2,0,8,9};
        int index = 0; 
        int i = 0;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("=-=-= PEMROGRAMAN BERBASIS OBJEK  2 =-=-=");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("|   Nama    : Rizqi Zamzami Jamil       |");
        System.out.println("|   NIM     : 2141762089                |");
        System.out.println("|   Kelas   : SIB-2E                    |");
        System.out.println("|   Absen   : 20                        |");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("|                                       |");
        //lokasi upload
        File up = new File("D:\\Kuliah\\Semester 3\\Praktikum Pemrograman Berbasis Objek\\Minggu 2\\Minggu2\\src\\nim.txt");
        
        //tulis dan cetak
        try(BufferedWriter tulis = new BufferedWriter(new FileWriter(up))){
            while(i<4){      
                //spasi setiap array tampil
                int s=i;
                while(s<20){//memakai batas 20 karena agar hasil sedikit ketengah
                    System.out.print(" ");
                    tulis.write(" ");//tulis di file text
                    s++;
                }
                
                //nim array
                int n=0; 
                while(n<=i){
                    System.out.print(nim[index]+" ");
                    tulis.write(nim[index]+" ");//tulis di file text
                    index++;
                    n++;
                }
                
                //baris baru
                System.out.println();
                tulis.newLine();//tulis di file text
                i++;
            }

        //pesan jika error saat run
        }catch(FileNotFoundException ex){
            System.out.println("File tidak dapat ditemukan atau belum ada"); 
        }catch(IOException ex){
            System.out.println("File tidak dapat dibaca oleh sistem");
        }
        System.out.println("|                                       |");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}