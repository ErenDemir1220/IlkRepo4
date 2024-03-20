import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean Dongu = true;
        while (Dongu) {
            System.out.println("Şifre Üreticiye hoş geldiniz. Şifrenizin Kaç Karakterden oluşmasını istediğinizi yazınız.");
            int KarakterSayisi = scanner.nextInt();
            if (KarakterSayisi>0);
            else {
                boolean Dongu1 = true;
                while (Dongu1){
                    System.out.println("Lütfen geçerli bir değer giriniz");
                    KarakterSayisi = scanner.nextInt();
                    if (KarakterSayisi>0)Dongu1=false;
                }
            }
            System.out.println("Şifrenizde kaç tane büyük harf istiyorsunuz lütfen yazınız.");
            int BuyukHarfSayisi = scanner.nextInt();
            if (BuyukHarfSayisi>=0);
            else {
                boolean Dongu1 = true;
                while (Dongu1){
                    System.out.println("Lütfen pozitif bir değer giriniz");
                    BuyukHarfSayisi = scanner.nextInt();
                    if (BuyukHarfSayisi>=0)Dongu1=false;
                }
            }
            System.out.println("Şifrenizde kaç tane küçük harf istiyorsunuz lütfen yazınız");
            int KucukHarfSayisi = scanner.nextInt();
            if (KucukHarfSayisi>=0);
            else {
                boolean Dongu1 = true;
                while (Dongu1){
                    System.out.println("Lütfen pozitif bir değer giriniz");
                    KucukHarfSayisi = scanner.nextInt();
                    if (KucukHarfSayisi>=0)Dongu1=false;
                }
            }
            System.out.println("Şifrenizde kaç tane rakam istiyorsunuz lütfen yazınız");
            int RakamSayisi = scanner.nextInt();
            if (RakamSayisi>=0);
            else {
                boolean Dongu1 = true;
                while (Dongu1){
                    System.out.println("Lütfen pozitif bir değer giriniz");
                    RakamSayisi = scanner.nextInt();
                    if (RakamSayisi>=0)Dongu1=false;
                }
            }
            System.out.println("Şifrenizde kaç tane sembol istiyorsunuz lütfen yazınız");
            int SembolSayisi = scanner.nextInt();
            if (SembolSayisi>=0);
            else {
                boolean Dongu1 = true;
                while (Dongu1){
                    System.out.println("Lütfen pozitif bir değer giriniz");
                    SembolSayisi = scanner.nextInt();
                    if (SembolSayisi>=0)Dongu1=false;
                }
            }
            if (KarakterSayisi >= BuyukHarfSayisi+KucukHarfSayisi+RakamSayisi+SembolSayisi){
                System.out.println("Girilen değerler hata çıkarmadı.\nPrograma devam ediliyor");
            }else {
                System.out.println("Girilen değerler birbirleri eşleşmiyor.Lütfen tekrar giriniz");
                boolean Dongu1= true;
                while (Dongu1){
                    System.out.println("Şifrenizin Kaç Karakterden oluşmasını istediğinizi yazınız.");
                    KarakterSayisi = scanner.nextInt();
                    if (KarakterSayisi>0);
                    else {
                        boolean Dongu2 = true;
                        while (Dongu2){
                            System.out.println("Lütfen geçerli bir değer giriniz");
                            KarakterSayisi = scanner.nextInt();
                            if (KarakterSayisi>0)Dongu2=false;
                        }
                    }
                    System.out.println("Şifrenizde kaç tane büyük harf istiyorsunuz lütfen yazınız.");
                    BuyukHarfSayisi = scanner.nextInt();
                        if (BuyukHarfSayisi>=0);
                        else {
                            boolean Dongu2 = true;
                            while (Dongu2){
                                System.out.println("Lütfen pozitif bir değer giriniz");
                                BuyukHarfSayisi = scanner.nextInt();
                                if (BuyukHarfSayisi>=0)Dongu2=false;
                            }
                        }
                    System.out.println("Şifrenizde kaç tane küçük harf istiyorsunuz lütfen yazınız");
                    KucukHarfSayisi = scanner.nextInt();
                    if (KucukHarfSayisi>=0);
                    else {
                        boolean Dongu2 = true;
                        while (Dongu2){
                            System.out.println("Lütfen pozitif bir değer giriniz");
                            KucukHarfSayisi = scanner.nextInt();
                            if (KucukHarfSayisi>=0)Dongu2=false;
                        }
                    }
                    System.out.println("Şifrenizde kaç tane rakam istiyorsunuz lütfen yazınız");
                    RakamSayisi = scanner.nextInt();
                    if (RakamSayisi>=0);
                    else {
                        boolean Dongu2 = true;
                        while (Dongu2){
                            System.out.println("Lütfen pozitif bir değer giriniz");
                            RakamSayisi = scanner.nextInt();
                            if (RakamSayisi>=0)Dongu2=false;
                        }
                    }
                    System.out.println("Şifrenizde kaç tane sembol istiyorsunuz lütfen yazınız");
                    SembolSayisi = scanner.nextInt();
                    if (SembolSayisi>=0);
                    else {
                        boolean Dongu2 = true;
                        while (Dongu2){
                            System.out.println("Lütfen pozitif bir değer giriniz");
                            SembolSayisi = scanner.nextInt();
                            if (SembolSayisi>=0)Dongu2=false;
                        }
                    }
                    if (KarakterSayisi >= BuyukHarfSayisi+KucukHarfSayisi+RakamSayisi+SembolSayisi){
                        System.out.println("Girilen değerler birbirleri ile eşleşiyor.\nPrograma devam ediliyor");
                        Dongu1=false;
                    }else {
                        System.out.println("Girilen değerler birbirleri eşleşmiyor.Lütfen tekrar giriniz");
                    }
                }

            }String BuyukHarf = "ABCÇDEFGĞHİIJKLMNOÖPRSŞTUÜVYZ";
            String KucukHarf = "abcçdefgğhiıjklmnoöprsştuüvyz";
            Random random = new Random();
            String[] SifreDizisi = new String[100];

            for (int i = 0; i <1; i++) {
                String SifreTutucu = "";
                String BuyukHarfTutucu = "";
                String KucukHarfTutucu = "";
                String RakamTutucu = "";
                String SembolTutucu = "";
                int toplamAdim = KarakterSayisi;

                // İlk döngü (büyük harf)
                int adim1 = BuyukHarfSayisi;
                for (int a = 0; a < adim1; a++) {
                    int b = random.nextInt(BuyukHarf.length());
                    char d = BuyukHarf.charAt(b);
                    SifreTutucu += d;
                    BuyukHarfTutucu +=d;
                    toplamAdim--;
                }

                // İkinci döngü (küçük harf)
                int adim2 = KucukHarfSayisi;
                for (int a = 0; a < adim2; a++) {
                    int b = random.nextInt(KucukHarf.length());
                    char c = KucukHarf.charAt(b);
                    SifreTutucu += c;
                    KucukHarfTutucu += c;
                    toplamAdim--;
                }

                // Üçüncü döngü (rakam)
                int adim3 =RakamSayisi;
                for (int a = 0; a < adim3; a++) {
                    int b = random.nextInt(10);
                    SifreTutucu += b;
                    RakamTutucu += b;
                    toplamAdim--;
                }

                // Dördüncü döngü (sembol)
                int adim4 = SembolSayisi;
                int karakterSayisi = 0; // Kaç tane sembol eklediğimizi tutmak için
                for (int a = 0; a < adim4; a++) {
                    boolean Dongu2 = true;
                    int b = random.nextInt(94) + 33;
                    if (b >= 48 && b <= 57 || b >= 65 && b <= 90 || b >= 97 && b <= 122) {
                        while (Dongu2) {
                            b = random.nextInt(94) + 33;
                            if (!(b >= 48 && b <= 57 || b >= 65 && b <= 90 || b >= 97 && b <= 122)) {
                                Dongu2 = false;
                            }
                        }
                    }
                    SifreTutucu += (char) b;
                    SembolTutucu += (char) b;
                    toplamAdim--;
                    karakterSayisi++;
                }
                if (KarakterSayisi-(BuyukHarfSayisi+KucukHarfSayisi+RakamSayisi+SembolSayisi)>0){
                    boolean Dongu6=true;
                    int KalanDeger=toplamAdim;
                    while (Dongu6){
                        int FazlalikIcinRandom = random.nextInt(4);
                        if (FazlalikIcinRandom == 0) {
                            int b = random.nextInt(BuyukHarf.length());
                            char d = BuyukHarf.charAt(b);
                            SifreTutucu += d;
                            BuyukHarfTutucu += d;
                            KalanDeger--;
                        } else if (FazlalikIcinRandom == 1) {
                        int b = random.nextInt(KucukHarf.length());
                            char c = KucukHarf.charAt(b);
                            SifreTutucu += c;
                            KucukHarfTutucu += c;
                            KalanDeger--;
                        } else if (FazlalikIcinRandom == 2) {
                            int p = random.nextInt(10);
                            SifreTutucu += p;
                            RakamTutucu += p;
                            KalanDeger--;
                        }else {
                            for (int a = 0; a < adim4; a++) {
                                boolean Dongu2 = true;
                                int b = random.nextInt(94) + 33;
                                if (b >= 48 && b <= 57 || b >= 65 && b <= 90 || b >= 97 && b <= 122) {
                                    while (Dongu2) {
                                        b = random.nextInt(94) + 33;
                                        if (!(b >= 48 && b <= 57 || b >= 65 && b <= 90 || b >= 97 && b <= 122)) {
                                            Dongu2 = false;
                                        }
                                    }
                                }
                                SifreTutucu += (char) b;
                                SembolTutucu += (char) b;
                                karakterSayisi++;
                                KalanDeger--;

                    }

                }if (KalanDeger==0){
                            Dongu6=false;
                        }
        }
    }
                System.out.println("Şifrenizin kendi içerisinde rastgele karıştırılmasını istiyorsanız evet yazınız");
                String Randomizer = scanner.next();
                Randomizer=Randomizer.toLowerCase(Locale.ROOT);
                if (Randomizer.equals("evet")){
                    char[] sifreDizi = SifreTutucu.toCharArray();

                    for (int a = 0; a < SifreTutucu.length(); a++) {
                        int e = random.nextInt(SifreTutucu.length());
                        int d = random.nextInt(SifreTutucu.length());
                        char temp = sifreDizi[e];
                        sifreDizi[e] = sifreDizi[d];
                        sifreDizi[d] = temp;
                    }

                    // sifreDizi'ni tekrar bir String'e dönüştür
                    SifreTutucu = new String(sifreDizi);
                    SifreDizisi[i] = SifreTutucu;
                } SifreDizisi[i] = SifreTutucu;
                System.out.println("Sifre " +  " : " + SifreTutucu + " - " +
                        BuyukHarfTutucu.length() + " (" + BuyukHarfTutucu + ") - " + KucukHarfTutucu.length() + " (" + KucukHarfTutucu + ") - "
                        + RakamTutucu.length() + " (" + RakamTutucu + ") - " + karakterSayisi + " (" +
                        SembolTutucu + ")");
                System.out.println("Sistemden çıkış yapmak için lütfen q ya basınız. \nDevam etmek istiyorsanız herhangi bir harf ile girdi yollayınız");
                String Cikis = scanner.next();
                if (Cikis.equals("q")){
                    Dongu=false;
}
}

}
        System.out.println("Sistemden çıkış yapılıyor");
}
}