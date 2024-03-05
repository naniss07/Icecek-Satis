import java.util.InputMismatchException;
import java.util.Scanner;

public class gazli_İcecek extends icecek {
public double hesap;
public int sec1;
   public double[] litree ={1.0,1.5,2.5};
    public String[] gazliİcecek= new String[]{"Coca Cola", "Pepsi", "Sprite","Uludağ Gazoz","Yedigün Fanta"};
    public double litre;

    public int adet;
    public  String marka;
    public String name;
    public String surname;
    public long telNo;
    public  String adres;


    Scanner input=new Scanner(System.in);

    public gazli_İcecek(String name, String surName, long telNo, String adres) {
        this.name = name;
        this.surname = surName;
        this.telNo = telNo;
        this.adres = adres;
    }

    public int gazli_İcecek(){
        System.out.println("Hangi icecekden alıcaksınız.");
        for (int x = 0; x < gazliİcecek.length; x++) {
            System.out.println(x + 1 + "-->" + gazliİcecek[x]);
        }
        try {
            sec1 = input.nextInt();
            return sec1;
        }catch (InputMismatchException e){
            System.out.println("**Gazlı İcecek secimini String veri türünden giremezsiniz.");
            return gazli_İcecek();
        }

    }


    public double gazli_İcecekSecim(int deger) {

        this.sec1=deger;

            switch (sec1) {
                case 1:

                    System.out.println("Kaç litrelik alıcaksınız.(1 litre,1,5 litre yada 2,5 litrelik)");
                    litre = input.nextDouble();
                    System.out.println("Kaç adet alıcaksınız.");
                    adet = input.nextInt();
                    setAdetSayisi(adet);
                    litreBulma(1);

                    marka = "Coca Cola";
                    setMarka(marka);
                    break;
                case 2:

                    System.out.println("kaç litrelik alıcaksınız.(1 litre,1.5 litre yada 2.5 litrelik)");
                    litre = input.nextDouble();
                    System.out.println("Kaç adet alıcaksınız.");
                    adet = input.nextInt();
                    setAdetSayisi(adet);
                    litreBulma(2,2);

                    marka = "Pepsi";
                    setMarka(marka);
                    break;
                case 3:

                    System.out.println("Kaç litrelik alıcaksınız.(1 litre,1,5 litre yada 2,5 litrelik)");
                    litre = input.nextDouble();
                    System.out.println("Kaç adet alıcaksınız.");
                    adet = input.nextInt();
                    setAdetSayisi(adet);
                    litreBulma(3,3,3);

                    marka = "Sprite";
                    setMarka(marka);
                    break;
                case 4:

                    System.out.println("Kaç litrelik alıcaksınız.(1 litre,1,5 litre yada 2,5 litrelik)");
                    litre = input.nextDouble();
                    System.out.println("Kaç adet alıcaksınız.");
                    adet = input.nextInt();
                    setAdetSayisi(adet);
                    litreBulma(4,4,4,4);

                    marka = "Uludağ Gazoz";
                    setMarka(marka);
                    break;
                case 5:

                    System.out.println("Kaç litrelik alıcaksınız.(1 litre,1,5 litre yada 2,5 litrelik)");
                    litre = input.nextDouble();
                    System.out.println("Kaç adet alıcaksınız.");
                    adet = input.nextInt();
                    setAdetSayisi(adet);
                    litreBulma(5,5,5,5,5);

                    marka = "Yedigün Fanta";
                    setMarka(marka);
                    break;
                default: {
                    System.out.println("YANLIŞ SEÇİM YAPTINIZ.....");
                    System.out.println("TEKRAR DENEYİN.");
                    gazli_İcecekSecim(gazli_İcecek());

                }
            }
            return sec1;


    }
    public double litreBulma(int a){
        if (litre == litree[0]) {
            setLitre(litree[0]);
            hesap = getAdetSayisi() * 15;

        } else if (litre == litree[1]) {
            setLitre(litree[1]);
            hesap = getAdetSayisi() * 19;

        } else if (litre == litree[2]) {
            setLitre(litree[2]);
            hesap = getAdetSayisi() * 25;

        } else {
            System.out.println("YANLIŞ SECİM YAPTINIZ...");
            System.out.println("Lütfen verilen Litre çeşitlerinden secin");
            return gazli_İcecekSecim(sec1);
        }
        return hesap;

    }
    public double litreBulma(int a,int b){
        if (litre == litree[0]) {
            setLitre(litree[0]);
            hesap = getAdetSayisi() * 14;

        } else if (litre == litree[1]) {
            setLitre(litree[1]);
            hesap = getAdetSayisi() * 17;

        } else if (litre == litree[2]) {
            setLitre(litree[2]);
            hesap = getAdetSayisi() * 23;
        } else {
            System.out.println("YANLIŞ SECİM YAPTINIZ...");
            System.out.println("Lütfen verilen Litre çeşitlerinden secin");
            return gazli_İcecekSecim(sec1);
        }
        return hesap;
    }
    public double litreBulma(int a,int b,int c){
        if (litre == litree[0]) {
            setLitre(litree[0]);
            hesap = getAdetSayisi() * 17;

        } else if (litre == litree[1]) {
            setLitre(litree[1]);
            hesap = getAdetSayisi() * 21;

        } else if (litre == litree[2]) {
            setLitre(litree[2]);
            hesap = getAdetSayisi() * 25;
        }else {
            System.out.println("YANLIŞ SECİM YAPTINIZ...");
            System.out.println("Lütfen verilen Litre çeşitlerinden secin");
            return gazli_İcecekSecim(sec1);
        }
        return hesap;
    }
    public double litreBulma(int a,int b,int c,int d){
        if (litre == litree[0]) {
            setLitre(litree[0]);
            hesap = getAdetSayisi() * 13;

        } else if (litre == litree[1]) {
            setLitre(litree[1]);
            hesap = getAdetSayisi() * 16;

        } else if (litre == litree[2]) {
            setLitre(litree[2]);
            hesap = getAdetSayisi() * 23;
        }else {
            System.out.println("YANLIŞ SECİM YAPTINIZ...");
            System.out.println("Lütfen verilen Litre çeşitlerinden secin");
            return gazli_İcecekSecim(sec1);
        }
        return hesap;
    }
    public double litreBulma(int a,int b,int c,int d,int e){
        if (litre == litree[0]) {
            setLitre(litree[0]);
            hesap = getAdetSayisi() * 12;

        } else if (litre == litree[1]) {
            setLitre(litree[1]);
            hesap = getAdetSayisi() * 14;

        } else if (litre == litree[2]) {
            setLitre(litree[2]);
            hesap = getAdetSayisi() * 18;
        }
        else {
            System.out.println("YANLIŞ SECİM YAPTINIZ...");
            System.out.println("Lütfen verilen Litre çeşitlerinden secin");
            return gazli_İcecekSecim(sec1);
        }
        return hesap;
    }





    @Override
    public void FIS() {
        System.out.println("FİŞİNİZ:\n");
        System.out.println(name+" "+surname+"\nTelefon No:"+telNo+"\nAdres:"+adres);
        System.out.println(getMarka()+" "+getLitre()+" L "+getAdetSayisi()+" Adet");
        System.out.println("Hesap tutarı: "+hesap);

    }
}
