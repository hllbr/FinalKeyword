
public class Main {
    public static void main(String[] args) {
        /*
        Final anahtar kelimesi ile tanımlanan bir özelliğin değeri sadece ve sadece bir defa veriliyor(belirleniyor)
        başka bir noktada bu özelliğin değerini değiştiremiyoruz
        bu ifadelerin değeri ya tanımlanırken (tanımlandığı noktada) yada obje oluşturulurken (Constructor içersinide) veriliebilir
        bu noktalar dışında değer vermeye çalıştığımızda java bize otomatik olarak hata veriyor
        bu özellikler sayesinde özelliklerimizin durduk yere yada anlamsızca değer değişimine uğramasının önüne geçmiş oluyoruz
        Final anahtar kelimesi ile tanımlanmış yapıalrın getter ve setter olmaz
        
        */
        
        FinalTest finalTest = new FinalTest("hllbr");
        FinalTest finalTest1 = new FinalTest("@prince");
        FinalTest finalTest2 = new FinalTest("h2lbr");
        System.out.println("obje sayısı : " +finalTest2.obje_sayısı);
        System.out.println("obje sayısı 2. deneme : "+finalTest1.obje_sayısı);
        System.out.println("obje sayısı null deneme : "+finalTest.obje_sayısı);
        System.out.println("Umarım ince zeka hamlesini görür ve doğru bir fiyatlandırma ve uygun koşullar ile karşımıza çıkarsınız ....\n"
                + "	sign wizard = "
                + " @hllbr");
        
        System.out.println("Database ismi : " +DataBase.databaseismi);
        System.out.println("Kullanıcı adı : "+DataBase.userName);
        System.out.println("Password : " +DataBase.password);
        //buradaki değerleri değiştiremeyiz çünkü final anahtar kelimesiyle tanımladık 
        
        
        
    }
    
}
