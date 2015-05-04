package com.mycompany.ujian_123040109;

/**
 * Hello world!
 *
 */
public class Soal 
{
    public int pangkat(int bil, int pangkat){
        int hasil = 0;
        String h = "hallo2";
        int n = 1;
        while (n <= pangkat) {            
            n++;
            hasil *= bil;
        }
        return hasil;
        
    }
    public int faktorial(int bil){
        int hasil = 1;
        for (int i = 1; i <= bil; i++) {
            hasil *= i;
        }
        return hasil;
    }
 
    public int perkalian(int bilA, int bilB){
        return bilA * bilB;
        
        }
       public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
