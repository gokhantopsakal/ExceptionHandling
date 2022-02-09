public class MainClass
{
    public static void main(String[] args) {
     /*   tryCatchOrnek();
        try {
            tryCatchMethod();
        }
        catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }*/
    badpracticeTryCatch();


    }

    private static double badpracticeTryCatch()
    {
        double sonuc = 0;
        try {

        }
        catch (Exception e)
        {
            System.out.println(e.getLocalizedMessage());
        }
        return sonuc;
    }

    private static void tryCatchMethod() {
        int sayi = 7/0;

    }

    private static void tryCatchOrnek() {
        try {
            //System.out.println("Sonuc:"+ (7/0));
            int [] sayilar = new  int[]{3,5,6};
            sayilar[20]=3;
        }
        catch (Exception e)
        {
            System.out.println("Hata var : "+e.getLocalizedMessage());

        }
    }
}
