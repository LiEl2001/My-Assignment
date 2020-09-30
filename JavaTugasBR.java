import java.io.*;

public class JavaTugasBR {
    public static void main(String[] args) throws IOException {

        int alas = 0;
        int tinggi = 0;
        double luas;
      

        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));

        
                System.out.println("Manghitung luas segitiga dengan buffered reader");

                System.out.println("Masukkan alas -->");
                //input data alas
                alas = Integer.parseInt(data.readLine());

                System.out.println("Masukkan tinggi -->");
                //input data tinggi
                tinggi = Integer.parseInt(data.readLine());

                //Menghitung Rumus
                luas = 0.5 * alas * tinggi;
              

                //mengoutputkan hasil
                System.out.println("Luas segitiga adalah : " + luas);
        
      

    }
}