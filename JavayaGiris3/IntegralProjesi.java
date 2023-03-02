package JavayaGiris3;
import java.util.Scanner;
public class IntegralProjesi {
    public static void main(String[] args) {

        //Soru: y=x^2 fonksiyonunun x1 ile x2 arasında olan kısmın integralini(Alanı) bulunuz...

        Scanner input= new Scanner(System.in);

        double adimMiktari=0.001; //ne kadar çok başına 0 koyarsam hesaplama daha da doğru olmaya başlar fakat işlem süresi uzar. Biz burada yaklaşık değerini bulduk...
        double toplamAlan=0;
        int baslangic=0,son=0;


        System.out.print("\nİntegral Alma Projesi\n\nX1 değerini giriniz: ");
            int x1_degeri= input.nextInt();
        System.out.print("X2 degerini giriniz: ");
            int x2_degeri= input.nextInt();

            if(x1_degeri >= x2_degeri){
                baslangic=x2_degeri;
                son=x1_degeri;
            }
            else{
                baslangic=x1_degeri;
                son=x2_degeri;
            }
        System.out.println("\ny=x^2 fonksiyonunda " + baslangic + " ile " + son + " arası olan integral hesaplanıyor...\n");

        for(double x=baslangic; x<=son ; x+=adimMiktari){

            double y= x * x;

            toplamAlan += y * adimMiktari;

        }
        System.out.println("Toplam alan: "+ toplamAlan);








    }



}
