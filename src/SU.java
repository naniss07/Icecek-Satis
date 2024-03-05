import java.util.InputMismatchException;
import java.util.Scanner;



public class SU extends icecek {
    Scanner input=new Scanner(System.in);
   public String[] su= new String[]{"Kaynak Suyu","Damacana Su","Arıtılmış Su"};

    public double[] litree =new double[]{0.5,1,1.5,5,10,19};
    public double[] kaynak_fiyat ={5,8,12,15,25,0};
    public double[] damacana_fiyat ={0,0,0,25,33,45};
    public double[] arıtılmis_fiyat ={4,7,11,18,0,0};
    public String name;
    public String surname;
    public long telNo;
    public  String adres;
public double hesap;

public int adet;
    protected int sec1;
public double litre;
public int sec;
    public String marka;
    public boolean durum=true;

    public SU(String name, String surName, long telNo, String adres) {
        this.name = name;
        this.surname = surName;
        this.telNo = telNo;
        this.adres = adres;
    }


    public int SUU() {
        System.out.println("Hangi ceşit Su alıcaksınız?");
        for (int x = 0; x < su.length; x++) {
            System.out.println(x + 1 + "-->" + su[x]);
        }
        try {
            sec1 = input.nextInt();
        }catch (InputMismatchException e){
            System.out.println("**Su secimini String veri türünden giremezsiniz.");
            SUU();
        }
        return sec1;

    }


  public double Su_secim(int deger){
      this.sec = deger;


          switch (sec){
              case 1:

                  System.out.println("Kaç litrelik alıcaksınız.(0,5 litre,1  litre,1,5 litre, 5 litre,10 litre)");
                      litre=input.nextDouble();
                  System.out.println("Kaç adet alıcaksınız?");
                      adet=input.nextInt();
                  setAdetSayisi(adet);

                  litreBul(1);
                  break;

              case 2:

                  System.out.println("Kaç litrelik alıcaksınız.( 5 litre,10 litre,19 Litre)");
                  litre=input.nextDouble();
                  System.out.println("Kaç adet alıcaksınız?");
                  adet=input.nextInt();
                  setAdetSayisi(adet);

                  litreBul(2,2);

                  break;
              case 3:

                  System.out.println("Kaç litrelik alıcaksınız.(0,5 litre,1  litre,1,5 litre, 5 litre)");
                  litre=input.nextDouble();
                  System.out.println("Kaç adet alıcaksınız?");
                  adet=input.nextInt();
                  setAdetSayisi(adet);

                  litreBul(3,3,3);
                   break;

              default:{
                  System.out.println("YANLIŞ SECİM YAPTINIZ...");
                  System.out.println("TEKRAR DENEYİN.");
                  Su_secim(SUU());
              }


          }
          return sec;
      }








    public double litreBul(int a,int b,int c){
        if (litre == litree[0]) {
            setLitre(litree[0]);
            hesap=getAdetSayisi()*arıtılmis_fiyat[0];

        }
        else if (litre==litree[1]){
            setLitre(litree[1]);
            hesap=getAdetSayisi()*arıtılmis_fiyat[1];

        }
        else if (litre==litree[2]){
            setLitre(litree[2]);
            hesap=getAdetSayisi()*arıtılmis_fiyat[2];

        }
        else if (litre==litree[3]){
            setLitre(litree[3]);
            hesap=getAdetSayisi()*arıtılmis_fiyat[3];

        }
        else {
            System.out.println("YANLIŞ SECİM YAPTINIZ...");
            System.out.println("Lütfen verilen Litre çeşitlerinden secin");
            return Su_secim(sec);
        }
        return hesap;

    }
    public double litreBul(int a,int b){

         if (litre==litree[3]){
            setLitre(litree[3]);
            hesap=getAdetSayisi()*damacana_fiyat[3];
        }
        else if (litre==litree[4]){
            setLitre(litree[4]);
            hesap=getAdetSayisi()*damacana_fiyat[4];
        }
        else if (litre==litree[5]){
            setLitre(litree[5]);
            hesap=getAdetSayisi()*damacana_fiyat[5];
        }
        else {
            System.out.println("YANLIŞ SECİM YAPTINIZ....");
            System.out.println("Lütfen verilen Litre çeşitlerinden secin");
            return Su_secim(sec);
        }
        return hesap;
    }

    public double litreBul(int a){

        if (litre == litree[0]) {
            setLitre(litree[0]);
            hesap=getAdetSayisi()*kaynak_fiyat[0];

        }
        else if (litre==litree[1]){
            setLitre(litree[1]);
            hesap=getAdetSayisi()*kaynak_fiyat[1];

        }
        else if (litre==litree[2]){
            setLitre(litree[2]);
            hesap=getAdetSayisi()*kaynak_fiyat[2];

        }
        else if (litre==litree[3]){
            setLitre(litree[3]);
            hesap=getAdetSayisi()*kaynak_fiyat[3];

        } else if (litre==litree[4]) {
            setLitre(litree[4]);
            hesap=getAdetSayisi()*kaynak_fiyat[4];
        }else {
            System.out.println("YANLIŞ SECİM YAPTINIZ....");
            System.out.println("Lütfen verilen Litre çeşitlerinden secin");
            return Su_secim(sec);
        }

        return hesap;


    }

    /*public double bulLitre(double litre,double nmb)
    {
            setLitre(litre);
            hesap=getAdetSayisi()*nmb;
            return hesap;
    }*/

    /*for(int i=0;i< arıtılmis_fiyat.length;i++){
                      if(litre==litree[i])
                      {
                          bulLitre(litre,arıtılmis_fiyat[i]);
                      }

                  }*/



    @Override
    public void FIS() {
        System.out.println("FİŞİNİZ:\n");
        System.out.println(name+" "+surname+"\nTelefon No:"+telNo+"\nAdres:"+adres);
        System.out.println(+getLitre()+" Litre Su "+getAdetSayisi()+" Adet");
        System.out.println("Hesap tutarı: "+hesap);
    }


    public static class girisBilgisi {
        Scanner input=new Scanner(System.in);
        private  long telNo;
        private String adres;
        private String name;
        private String surName;

        public void setAdres(String adres) {
            this.adres = adres;
        }

        public String getAdres() {
            return adres;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setSurName(String surName) {
            this.surName = surName;
        }

        public String getSurName() {
            return surName;
        }

        public void setTelNo(long telNo) {
            this.telNo = telNo;
        }

        public long getTelNo() {
            return telNo;
        }


        public  girisBilgisi() {

             String adres;
             String name;
            String surName;

            System.out.println("Lütfen adınızı ve soyadınızı giriniz");
            name=input.next();
            setName(name);
            surName=input.next();
            setSurName(surName);
            System.out.println("adresinizi giriniz.");
            adres=input.next();
            setAdres(adres);
             telNogir();

        }
        public long telNogir(){
            Scanner input=new Scanner(System.in);

            try {
                System.out.println("telefon  numaranızı giriniz.");
                telNo = (input.nextLong());
                setTelNo(telNo);
                return telNo;
            }catch (InputMismatchException e){
                System.out.println(e+"\n");
                System.out.println("**Telefon numaranızı String veri türünden giremezsiniz.");
                return telNogir();

            }

        }

    }
}
