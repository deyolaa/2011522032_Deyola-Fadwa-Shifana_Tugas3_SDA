import java.util.LinkedList;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=========== Tugas 2 ===========");
        System.out.println("Nama\t : Deyola Fadwa Shifana");
        System.out.println("Nim\t : 2011522032");
        System.out.println("===============================\n");

        LinkedList <Integer> bp = new LinkedList<>();
        bp.add(2011522032);
        bp.add(2011522026);
        bp.add(2011521018);
        System.out.println("No BP\t:"+bp+" -> Ukuran :" +bp.size());

        LinkedList <String> nama = new LinkedList<>();
        nama.add("Cipa");
        nama.add("Cupa");
        nama.add("Aisyah");
        System.out.println("Nama\t:"+nama+" -> Ukuran :" +nama.size());
        
        LinkedList <String> alamat = new LinkedList<>();
        alamat.add("50 Kota");
        alamat.add("Payakumbuh");
        alamat.add("Pasaman");
        System.out.println("Alamat\t:"+alamat+" -> Ukuran :" +alamat.size());

       //Tambah karakter
       System.out.println("\n=== ADD KARAKTER ===");

       bp.addFirst(2011523014);   
       nama.addFirst("Erga");
       alamat.addFirst("Palembang");

       System.out.println("\tNo BP\t:"+bp+" -> Ukuran :" +bp.size());
       System.out.println("\tNama\t: "+nama+" -> Ukuran :" +nama.size());
       System.out.println("\tAlamat\t:"+alamat+" -> Ukuran :" +alamat.size());

       //sisipkan karakter
       System.out.println("\n=== SISIPKAN KARAKTER ===");
       System.out.println("Data awal nama : "+nama+" Ukuran : "+nama.size());
       nama.add(0, "Erlangga");
       nama.add(2, "Sri");
       
       System.out.println("Data akhir nama : "+nama+" Ukuran : "+nama.size());

       //hapus karakter
       System.out.println("\n=== HAPUS KARAKTER ===");
       nama.removeFirst();
       
       //hapus karakter berdasarkan index
       System.out.println("\nData awal nama : "+nama+" Ukuran : "+nama.size());
       nama.remove(0);
       nama.remove(2);
       
       System.out.println("Data akhir nama : "+nama+" Ukuran : "+nama.size());

       //Menambah data
       System.out.println("\n=== MENAMBAH DATA ===");  
           Scanner input = new Scanner(System.in);

           System.out.printf("Masukan nama : ");
           String temp = input.nextLine();
           
           System.out.printf("Tambahkan nama pada index ke : ");
           int index = input.nextInt();
       
           nama.add(index, temp);
           System.out.println("Data akhir nama : "+nama+" Ukuran : "+nama.size());
    }
}
