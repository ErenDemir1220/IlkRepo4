import java.util.Random;

public class Program6 {
    public static void main(String[] args) {
        Random random = new Random();
        String[] SifreDizisi = new String[100];

        for (int i = 0; i < 100; i++) {
            String SifreTutucu = "";
            String BuyukHarfTutucu = "";
            String KucukHarfTutucu = "";
            String RakamTutucu = "";
            String SembolTutucu = "";
            int karakterSayisi = 0;
            int toplamAdim = 15;

            int adim1 = Math.max(Math.min(random.nextInt(4) + 3, toplamAdim - 9), 3);
            toplamAdim -= adim1;
            int adim2 = Math.max(Math.min(random.nextInt(4) + 3, toplamAdim - 6), 3);
            toplamAdim -= adim2;
            int adim3 = Math.max(Math.min(random.nextInt(4) + 3, toplamAdim - 3), 3);
            toplamAdim -= adim3;
            int adim4 = toplamAdim;
            BuyukHarfTutucu = BuyukHarUretici(adim1);
            KucukHarfTutucu = KucukHarfUretici(adim2);
            RakamTutucu = RakamUretici(adim3);
            SembolTutucu = SembolOlusturucu(adim4);
            karakterSayisi = SembolTutucu.length();
            SifreTutucu =BuyukHarfTutucu+KucukHarfTutucu+RakamTutucu+SembolTutucu;
            SifreDizisi[i]=SifreTutucu;

            char[] sifreDizi = SifreTutucu.toCharArray();

            for (int a = 0; a < 15; a++) {
                // c ve c1 karakterlerinin değil, indislerinin değerlerini değiştir
                int e = random.nextInt(14);
                int d = random.nextInt(14);
                char temp = sifreDizi[e];
                sifreDizi[e] = sifreDizi[d];
                sifreDizi[d] = temp;
            }

            // sifreDizi'ni tekrar bir String'e dönüştür
            SifreTutucu = new String(sifreDizi);

            SifreDizisi[i] = SifreTutucu;

            // Şifre ve karakter sayılarını yazdırır
            System.out.println("Sifre " + (i + 1) + " : " + SifreTutucu + " - " +
                    adim1 + " (" + BuyukHarfTutucu + ") - " + adim2 + " (" + KucukHarfTutucu + ") - "
                    + adim3 + " (" + RakamTutucu + ") - " + karakterSayisi + " (" +
                    SembolTutucu + ")");
        }
    }
    public static String BuyukHarUretici (int adim1) {
        Random random = new Random();
        String BuyukHarf = "ABCÇDEFGĞHİIJKLMNOÖPRSŞTUÜVYZ";
        String SifreTutucu = "";
        for (int a = 0; a < adim1; a++) {
            int b = random.nextInt(BuyukHarf.length());
            char d = BuyukHarf.charAt(b);
            SifreTutucu += d;
        }
        return SifreTutucu;
    }
    public static String KucukHarfUretici (int adim2){
        String KucukHarf = "abcçdefgğhiıjklmnoöprsştuüvyz";
        Random random = new Random();
        String SifreTutucu = "";
        for (int a = 0; a < adim2; a++) {
            int b = random.nextInt(KucukHarf.length());
            char c = KucukHarf.charAt(b);
            SifreTutucu += c;
        }
        return SifreTutucu;
    }
    public static String RakamUretici (int adim3){
        Random random = new Random();
        String SifreTutucu = "";
        for (int a = 0; a < adim3; a++) {
            int b = random.nextInt(10);
            SifreTutucu += b;
        }
        return SifreTutucu;
    }
    public static String SembolOlusturucu(int adim4){
        Random random = new Random();
        String SifreTutucu = "";
        for (int a = 0; a < adim4; a++) {
            boolean Dongu = true;
            int b = random.nextInt(94) + 33;
            if (b >= 48 && b <= 57 || b >= 65 && b <= 90 || b >= 97 && b <= 122) {
                while (Dongu) {
                    b = random.nextInt(94) + 33;
                    if (!(b >= 48 && b <= 57 || b >= 65 && b <= 90 || b >= 97 && b <= 122)) {
                        Dongu = false;
                    }
                }
            }
            SifreTutucu += (char) b;
        }
        return SifreTutucu ;
}
}
