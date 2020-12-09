
public class FinalTest {
    public final int obje_sayısı ;//DEĞERİ YA BURADA VERİRİRİZ
    private static int say = 0 ;
    private final String isim ;
    //eğer biz değeri başlatmasssak java bize değeri bir an önce başlat şeklinde bir hata sunuyor
    public FinalTest(String isim) {
        this.isim = isim ;
        //YADA BURADA DEĞER VERME İŞLEMİNİ GERÇEKLEŞTİRİRİZ
        say++ ;
        obje_sayısı = say ;
    }

    public static int getSay() {
        return say;
    }

    public static void setSay(int say) {
        FinalTest.say = say;
    }
  
}
