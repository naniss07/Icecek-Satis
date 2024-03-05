
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

         int sec ;
        boolean durum=false;

        int secc1;

        SU.girisBilgisi giris=new SU.girisBilgisi();

        do {


sec=secimYap();

            switch (sec) {
                case 1:
                    gazli_İcecek gazli_i̇cecek = new gazli_İcecek(giris.getName(), giris.getSurName(), giris.getTelNo(), giris.getAdres());
                    secc1 = gazli_i̇cecek.gazli_İcecek();
                    gazli_i̇cecek.gazli_İcecekSecim( secc1);

                    System.out.println("Siparişiniz alınmıştır.");
                  gazli_i̇cecek.FIS();
                    durum = false;
                    break;
                case 2:
                    gazsiz_İcecek gazsiz_i̇cecek = new gazsiz_İcecek(giris.getName(), giris.getSurName(), giris.getTelNo(), giris.getAdres());
                    secc1=gazsiz_i̇cecek.gazsiz_İcecek();
                    gazsiz_i̇cecek.gazsiz_İcecekSecim(secc1);

                    System.out.println("Siparişiniz alınmıştır.");
                    gazsiz_i̇cecek.FIS();
                    durum = false;
                    break;
                case 3:
                    SU Su1 = new SU(giris.getName(), giris.getSurName(), giris.getTelNo(), giris.getAdres());
                    secc1 = Su1.SUU();
                    Su1.Su_secim( secc1);

                    System.out.println("Siparişiniz alınmıştır.");
                    Su1.FIS();
                    durum = false;
                    break;
                default: {
                    System.out.println("YANLIŞ SECİM YAPTINIZ...");
                    System.out.println("TEKRAR DENEYİN.");
                    durum = true;


                }
            }
        }while (durum == true) ;





    }

    public static int secimYap() {
        int sec = 0;
        Scanner input=new Scanner(System.in);


            System.out.println("Ne tür iceck alıcaksınız.");
            try {


                System.out.println("1.Gazlı içecek\n2.Gaszsız içecek\n3.Su ");
                sec = input.nextInt();
                return sec;
            } catch (InputMismatchException e) {
                System.out.println("**İcecek secimini String veri türünden giremezsiniz.");
               return secimYap();

            }


    }

}