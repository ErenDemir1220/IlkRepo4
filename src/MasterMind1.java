import java.util.*;
public class MasterMind1{
	public static void main(String[] args) {

		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		int min = 1000;
		int maksimum = 9999;
		int randomsayi = random.nextInt((maksimum - min) + 1) + min;
		int randomsayi_binler = randomsayi / 1000;
		int randomsayi_yuzler = randomsayi / 100 % 10;
		int randomsayi_onlar = randomsayi / 10 % 10;
		int randomsayi_birler = randomsayi % 10;
		if (!(randomsayi_binler == randomsayi_yuzler || randomsayi_binler == randomsayi_onlar || randomsayi_binler == randomsayi_birler || randomsayi_yuzler == randomsayi_onlar || randomsayi_yuzler == randomsayi_birler || randomsayi_onlar == randomsayi_birler))
			;
		else {
			boolean x = true;
			while (x) {
				randomsayi = random.nextInt((maksimum - min) + 1) + min;
				randomsayi_binler = randomsayi / 1000;
				randomsayi_yuzler = randomsayi / 100 % 10;
				randomsayi_onlar = randomsayi / 10 % 10;
				randomsayi_birler = randomsayi % 10;
				if (!(randomsayi_binler == randomsayi_yuzler || randomsayi_binler == randomsayi_onlar || randomsayi_binler == randomsayi_birler || randomsayi_yuzler == randomsayi_onlar || randomsayi_yuzler == randomsayi_birler || randomsayi_onlar == randomsayi_birler)) {
					x = false;
				}
			}
		}
		System.out.println(randomsayi);
		System.out.println("Mastermind programına hoşgeldiniz.");
		System.out.println("Lütfen tahmininizi giriniz.");
		boolean Dongu = true;
		int tahmin_sayisi = 0;
		int pozitifDegerler = 0;
		int negatifDegerler = 0;
		while (pozitifDegerler != 4) {
			int sayi = scan.nextInt();
			int sayi_binler = sayi / 1000;
			int sayi_yuzler = sayi / 100 % 10;
			int sayi_onlar = sayi / 10 % 10;
			int sayi_birler = sayi % 10;
			if (sayi <= 999 || sayi >= 10000 || sayi_binler == sayi_yuzler || sayi_binler == sayi_onlar || sayi_binler == sayi_birler || sayi_yuzler == sayi_onlar || sayi_yuzler == sayi_birler || sayi_onlar == sayi_birler) {
				boolean a = true;
				while (a) {
					System.out.println("Lütfen uyarıları dikkate alarak bir sayı giriniz");
					sayi = scan.nextInt();
					sayi_binler = sayi / 1000;
					sayi_yuzler = sayi / 100 % 10;
					sayi_onlar = sayi / 10 % 10;
					sayi_birler = sayi % 10;
					if (!(sayi <= 999 || sayi >= 10000 || sayi_binler == sayi_yuzler || sayi_binler == sayi_onlar || sayi_binler == sayi_birler || sayi_yuzler == sayi_onlar || sayi_yuzler == sayi_birler || sayi_onlar == sayi_birler)) {
						a = false;
					}
				}
			}

			pozitifDegerler = 0;
			negatifDegerler = 0;
			if (randomsayi_binler == sayi_binler) {
				pozitifDegerler++;
			} else if (randomsayi_binler == sayi_yuzler) {
				negatifDegerler--;
			} else if (randomsayi_binler == sayi_onlar) {
				negatifDegerler--;
			} else if (randomsayi_binler == sayi_birler) {
				negatifDegerler--;
			}

			if (randomsayi_yuzler == sayi_yuzler) {
				pozitifDegerler++;
			} else if (randomsayi_yuzler == sayi_binler) {
				negatifDegerler--;
			} else if (randomsayi_yuzler == sayi_onlar) {
				negatifDegerler--;
			} else if (randomsayi_yuzler == sayi_birler) {
				negatifDegerler--;
			}

			if (randomsayi_onlar == sayi_onlar) {
				pozitifDegerler++;
			} else if (randomsayi_onlar == sayi_binler) {
				negatifDegerler--;
			} else if (randomsayi_onlar == sayi_yuzler) {
				negatifDegerler--;
			} else if (randomsayi_onlar == sayi_birler) {
				negatifDegerler--;
			}

			if (randomsayi_birler == sayi_birler) {
				pozitifDegerler++;
			} else if (randomsayi_birler == sayi_binler) {
				negatifDegerler--;
			} else if (randomsayi_birler == sayi_yuzler) {
				negatifDegerler--;
			} else if (randomsayi_birler == sayi_onlar) {
				negatifDegerler--;
			}

			if (pozitifDegerler > 0) {
				System.out.println("+" + pozitifDegerler + "  " + negatifDegerler);
				tahmin_sayisi++;

			} else {
				System.out.println(pozitifDegerler + "  " + negatifDegerler);
				tahmin_sayisi++;
			}
		}
		if (tahmin_sayisi == 1) {
			System.out.println("Tebrikler tekde bildiniz");
		} else {
			System.out.println("Sayıyı " + tahmin_sayisi + ". denemenizde doğru bildiniz:");
		}
	}
	}
