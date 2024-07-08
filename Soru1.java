import java.util.Scanner;
public class Soru1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        int onlukSayi = scanner.nextInt();
        int[] kalanlar = sayiCevirme(onlukSayi);
        tersCevir(kalanlar);
    }
    public static int[] sayiCevirme(int onlukSayi) {
        int adim = 0;
        int sayi = onlukSayi;
        while (sayi > 0){
            sayi = sayi / 2;
            adim++;
        }
        int[] kalanlar = new int[adim];
        int index = 0;
        while (onlukSayi > 0) {
            int kalan = onlukSayi % 2;
            kalanlar[index++] = kalan;
            onlukSayi = onlukSayi / 2;
        }
        return kalanlar;
    }
    public static void tersCevir(int [] kalanlar){
        System.out.println("Verilen sayının ikilik sistemdeki değeri : ");
        for (int i = kalanlar.length-1 ; i>=0 ; i--){
            System.out.print(kalanlar[i]);
        }
    }
}
