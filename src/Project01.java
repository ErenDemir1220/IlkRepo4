import java.util.Random;

public class Project01 {
    public static void main(String[] args) {
        double [][] Ogrenciler = new double[1000][30];
        for (int a = 0; a<Ogrenciler.length;a++){
            for (int b = 0; b<Ogrenciler[0].length;b++){
                String c = DogumGunuVerme();
                Ogrenciler[a][b] = Double.parseDouble(c);
            }
        }
        int AyniDogumGunu = 0;
        for (int a =0; a<Ogrenciler.length;a++){
            for (int b = 0; b<Ogrenciler[0].length;b++){
                for (int c =b+1;c<Ogrenciler[0].length;c++){
                        if (Ogrenciler[a][b] == Ogrenciler[a][c]){
                             AyniDogumGunu+=2;
                        }
                }
            }
        }
        double olasilik = (double) AyniDogumGunu /(300);
        System.out.println("30 Bin öğrencinin her sınıf kendi içerisinde karşılaştırılmak şartı ile kıyaslandığında birbirine eşit olma olasılığı = %" + olasilik);
    }

    public static String DogumGunuVerme(){
        Random random = new Random();
        String DogumGunu;
        String Ay = String.valueOf(random.nextInt(12)+1);
        String Gun;
        Gun = String.valueOf(random.nextInt(30)+1);
        if (Gun.length()<=1){
            DogumGunu=Ay + ".0" + Gun;
        }else DogumGunu=Ay + "." + Gun;
       return DogumGunu;
    }
}
