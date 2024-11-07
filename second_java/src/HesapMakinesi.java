
import java.util.Scanner;

public class HesapMakinesi {
    public void calistir() {
        Scanner scanner = new Scanner(System.in);
        boolean devam = true;

        while (devam) {
            try {
                System.out.print("İlk sayıyı giriniz: ");
                double sayi1 = scanner.nextDouble();

                System.out.print("İkinci sayıyı giriniz: ");
                double sayi2 = scanner.nextDouble();

                System.out.print("Yapmak istediğiniz işlemi seçin (+, -, *, /): ");
                char islem = scanner.next().charAt(0);

                double sonuc;

                switch (islem) {
                    case '+':
                        sonuc = sayi1 + sayi2;
                        System.out.println("Sonuç: " + sonuc);
                        break;
                    case '-':
                        sonuc = sayi1 - sayi2;
                        System.out.println("Sonuç: " + sonuc);
                        break;
                    case '*':
                        sonuc = sayi1 * sayi2;
                        System.out.println("Sonuç: " + sonuc);
                        break;
                    case '/':
                        if (sayi2 != 0) {
                            sonuc = sayi1 / sayi2;
                            System.out.println("Sonuç: " + sonuc);
                        } else {
                            System.out.println("Hata: Sıfıra bölme işlemi yapılamaz.");
                        }
                        break;
                    default:
                        System.out.println("Hatalı işlem girdiniz. Lütfen geçerli bir işlem seçin.");
                        continue; // Döngüye baştan başlaması için
                }

                System.out.print("Başka bir işlem yapmak istiyor musunuz? (Evet için 'e', Hayır için 'h' giriniz): ");
                char devamMi = scanner.next().charAt(0);
                devam = (devamMi == 'e' || devamMi == 'E');

            } catch (Exception e) {
                System.out.println("Hatalı giriş yaptınız. Lütfen sayıları ve işlemi doğru formatta girin.");
                scanner.next(); // Hatalı girdiyi temizlemek için
            }
        }

        System.out.println("Hesap makinesi programı sonlandırıldı.");
        scanner.close();
    }
}

