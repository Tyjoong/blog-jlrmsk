
package important2;

import java.util.Scanner;

/**
 *
 * @author MOKLET GAMING
 */
public class Important2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String jalma,golpen;
        
        System.out.println("SELAMAT DATANG..");
        System.out.println("SILAHKAN PILIH JALUR MASUK");
        
        System.out.println("1. SBMPTN");
        System.out.println("2. SNMPTN");
        System.out.println("3. Mandiri");
        System.out.print("MASUKKAN JALUR MASUK ANDA: ");
        jalma=input.next();
        
        if(jalma.equalsIgnoreCase("SBMPTN")){
            System.out.println("A");
            System.out.println("B");
            System.out.println("C");
            System.out.println("=================================");
            System.out.print("Pilih Golongan Pendapatan: ");
            golpen=input.next();
            
            if(golpen.equalsIgnoreCase("A")){
                System.out.println("DSP = 5 Juta");
                System.out.println("SPP = 500 Ribu");
            }else if(golpen.equalsIgnoreCase("B")){
                System.out.println("DSP = 15 Juta");
                System.out.println("SPP = 1 Juta");
            }else if(golpen.equalsIgnoreCase("C")){
                System.out.println("DSP = 30 Juta");
                System.out.println("SPP = 2 Juta");
            }else{
                System.out.println("ERROR..");
                System.out.println("Maaf, Mungkin Anda Salah Memasukkan..");
            }
            
        }else if(jalma.equalsIgnoreCase("SNMPTN")){
            System.out.println("A");
            System.out.println("B");
            System.out.println("C");
            System.out.println("=================================");
            System.out.print("Pilih Golongan Pendapatan");
            golpen=input.next();
            
            if(golpen.equalsIgnoreCase("A")){
                System.out.println("DSP = 7 Juta");
                System.out.println("SPP = 500 Ribu");
            }else if(golpen.equalsIgnoreCase("B")){
                System.out.println("DSP = 17 Juta");
                System.out.println("SPP = 1 Juta");
            }else if(golpen.equalsIgnoreCase("C")){
                System.out.println("DSP = 35 Juta");
                System.out.println("SPP = 1 Juta");
            }else{
                System.out.println("ERROR..");
                System.out.println("Maaf, Mungkin Anda Salah Memasukkan..");
            }
            
        }else if(jalma.equalsIgnoreCase("Mandiri")){
            System.out.println("A");
            System.out.println("B");
            System.out.println("C");
            System.out.println("=================================");
            System.out.print("Pilih Golongan Pendapatan: ");
            golpen=input.next();
            
            if(golpen.equalsIgnoreCase("A")){
                System.out.println("DSP = 10 Juta");
                System.out.println("SPP = 1 Juta");
            }else if(golpen.equalsIgnoreCase("B")){
                System.out.println("DSP = 25 Juta");
                System.out.println("SPP = 2 Juta");
            }else if(golpen.equalsIgnoreCase("C")){
                System.out.println("DSP = 50 Juta");
                System.out.println("SPP = 3 Juta");
            }else{
                System.out.println("ERROR..");
                System.out.println("Maaf, Mungkin Anda Salah Memasukkan..");
            }
        }else{
            System.out.println("ERROR");
            System.out.println("Maaf, Mungkin Anda Salah Memasukkan..");
        }
    }
    
}
