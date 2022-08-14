import java.util.Scanner;

public class vkiHesap {
    public static void main(String[] args) {
        double boy, kilo;

        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz :");
        boy = input.nextDouble();
        System.out.print("Kilonuzu giriniz :");
        kilo = input.nextDouble();
        double vki = (kilo / (boy * boy));
        System.out.print("Vucut Kitle Indeksiniz :" + vki);
        System.out.println(vki >= 30 || vki < 18.5  ? "  Bir Diyetisyene basvurmalisin" : "  Sagligin icin dengeli beslenmeyi unutma");
    }
}
