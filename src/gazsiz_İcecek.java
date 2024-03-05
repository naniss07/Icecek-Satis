import java.util.InputMismatchException;
import java.util.Scanner;

public class gazsiz_İcecek extends icecek{
    Scanner gir=new Scanner(System.in);
    public double hesap;
    public double litre;
    public int secim;
    public int sec2;
    public int adet;
    public String marka;

    public String name;
    public String surname;
    public long telNo;
    public  String adres;

    public String[] gazsizİcecek= new String[]{"Dimes MeyveSuyu", "Cappy MeyveSuyu", "Fuse Tea","Lipton Ice Tea",
            "Uludağ Limonata","Nescafe Xpress","Doğanay Şalgam Suyu"};

    double[] litree ={1.0,1.5,2.5,0.33,0.25,0.30,0.50,0.20};



    public gazsiz_İcecek(String name, String surName, long telNo, String adres) {
        this.name = name;
        this.surname = surName;
        this.telNo = telNo;
        this.adres = adres;
    }

    public int gazsiz_İcecek(){
        System.out.println("Hangi İcecekden alıcaksınız.");
        for (int x = 0; x < gazsizİcecek.length; x++) {
            System.out.println(x + 1 + "-->" + gazsizİcecek[x]);
        }
        try {

        sec2 = gir.nextInt();
        }catch (InputMismatchException e){
            System.out.println("**Gazsız İcecek secimini String veri türünden giremezsiniz.");
            gazsiz_İcecek();
        }

        return sec2;
    }



public double gazsiz_İcecekSecim(int deger) {

    this.secim=deger;

    switch (secim){
        case 1:
            System.out.println("Kaç litrelik alıcaksınız.?");
            System.out.println(" 1 L , 0,20 L vardır.");
            setLitre(litree[0]);
            System.out.println("Kaç adet alıcaksınız?");
            adet = gir.nextInt();
            setAdetSayisi(adet);
            litreBULL(1,1,1,1,1);

            marka = "Dimes Meyve Suyu";
            setMarka(marka);

            break;
        case 2:
            System.out.println("Kaç litrelik alıcaksınız.?");
            System.out.println(" 1 L , 0,50 L , 0,20 L vardır.");
            setLitre(litree[0]);
            System.out.println("Kaç adet alıcaksınız?");
            adet = gir.nextInt();
            setAdetSayisi(adet);
            litreBULL(2,2,2,2);

            marka = "Cappy Meyve Suyu";
            setMarka(marka);

            break;
        case 3:
            System.out.println("Kaç litrelik alıcaksınız.?");
            System.out.println(" 1 L , 1,5 L ve 0,33 L vardır.");
            litre = gir.nextDouble();
            System.out.println("Kaç adet alıcaksınız?");
            adet = gir.nextInt();
            setAdetSayisi(adet);
            litreBULL(3);

            marka = "Fuse Tea";
            setMarka(marka);
            break;
        case 4:
            System.out.println("Kaç litrelik alıcaksınız.?");
            System.out.println(" 1 L, 1,5 L , 2,5 L ve 0,33 L vardır.");
            litre = gir.nextDouble();
            System.out.println("Kaç adet alıcaksınız?");
            adet = gir.nextInt();
            setAdetSayisi(adet);
            litreBULL(4,4);

            marka = "Lipton Ice Tea";
            setMarka(marka);
            break;
        case 5:
            System.out.println("Sadece 1 L vardır.");
            setLitre(litree[0]);
            System.out.println("Kaç adet alıcaksınız?");
            adet = gir.nextInt();
            setAdetSayisi(adet);
            marka = "Uludağ Limonata";
            setMarka(marka);

            hesap = getAdetSayisi() * 19;
            break;
        case 6:
            System.out.println("Sadece 0.25 L  vardır.");
            setLitre(litree[4]);
            System.out.println("Kaç adet alıcaksınız?");
            adet = gir.nextInt();
            setAdetSayisi(adet);
            marka = "Nescafe Xpress";
            setMarka(marka);

            hesap = getAdetSayisi() * 15;
            break;
        case 7:
            System.out.println("Kaç litrelik alıcaksınız.?");
            System.out.println(" 1 L ve 0,30 L vardır.");
            litre = gir.nextDouble();
            System.out.println("Kaç adet alıcaksınız?");
            adet = gir.nextInt();
            setAdetSayisi(adet);
            litreBULL(7,7,7);

            marka = " Doğanay Şalgam Suyu";
            setMarka(marka);
            break;
        default:{
            System.out.println("YANLIŞ SECİM YAPTINIZ...");
            System.out.println("TEKRAR DENEYİN.");
            gazsiz_İcecekSecim(gazsiz_İcecek());

        }
    }
return secim;
}

public double litreBULL(int a){
    if (litre == litree[0]) {
        setLitre(litree[0]);
        hesap = getAdetSayisi() * 14;
    } else if (litre == litree[1]) {
        setLitre(litree[1]);
        hesap = getAdetSayisi() * 21;
    } else if (litre == litree[3]) {
        setLitre(litree[3]);
        hesap = getAdetSayisi() * 8;
    } else {
        System.out.println("YANLIŞ SECİM YAPTINIZ...");
        System.out.println("Lütfen verilen Litre çeşitlerinden secin");
        return gazsiz_İcecekSecim(secim);
    }
    return hesap;
}
    public double litreBULL(int a,int b){
        if (litre == litree[0]) {
            setLitre(litree[0]);
            hesap = getAdetSayisi() * 11;
        } else if (litre == litree[1]) {
            setLitre(litree[1]);
            hesap = getAdetSayisi() * 17;
        } else if (litre == litree[2]) {
            setLitre(litree[2]);
            hesap = getAdetSayisi() * 25;
        }else if (litre == litree[3]) {
            setLitre(litree[3]);
            hesap = getAdetSayisi() * 6;
        } else {
            System.out.println("YANLIŞ SECİM YAPTINIZ...");
            System.out.println("Lütfen verilen Litre çeşitlerinden secin");
            return gazsiz_İcecekSecim(secim);
        }
        return hesap;
    }
    public double litreBULL(int a,int b,int c){
        if (litre == litree[0]) {
            setLitre(litree[0]);
            hesap = getAdetSayisi() * 12.5;
        } else if (litre == litree[5]) {
            setLitre(litree[5]);
            hesap = getAdetSayisi() * 7;
        }
        else {
            System.out.println("YANLIŞ SECİM YAPTINIZ...");
            System.out.println("Lütfen verilen Litre çeşitlerinden secin");
            return gazsiz_İcecekSecim(secim);
        }
        return hesap;
    }
    public double litreBULL(int a, int b,int c,int d){
        if (litre == litree[0]) {
            setLitre(litree[0]);
            hesap = getAdetSayisi() * 14;
        } else if (litre == litree[6]) {
            setLitre(litree[6]);
            hesap = getAdetSayisi() * 21;
        } else if (litre == litree[7]) {
            setLitre(litree[7]);
            hesap = getAdetSayisi() * 8;
        } else {
            System.out.println("YANLIŞ SECİM YAPTINIZ...");
            System.out.println("Lütfen verilen Litre çeşitlerinden secin");
            return gazsiz_İcecekSecim(secim);
        }
        return hesap;
    }
    public double litreBULL(int a, int b,int c,int d,int e){
        if (litre == litree[0]) {
            setLitre(litree[0]);
            hesap = getAdetSayisi() * 11;
        } else if (litre == litree[7]) {
            setLitre(litree[7]);
            hesap = getAdetSayisi() * 7;
        }
        else {
            System.out.println("YANLIŞ SECİM YAPTINIZ...");
            System.out.println("Lütfen verilen Litre çeşitlerinden secin");
            return gazsiz_İcecekSecim(secim);
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
