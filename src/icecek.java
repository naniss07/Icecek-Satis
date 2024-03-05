public abstract class icecek {

    public icecek(){

    }
    private String marka;

    private int adetSayisi;
    private double litre;









    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }

    public void setAdetSayisi(int adetSayisi) {
        this.adetSayisi = adetSayisi;
    }

    public int getAdetSayisi() {
        return adetSayisi;
    }

    public void setLitre(double litre) {
        this.litre = litre;
    }

    public double getLitre() {
        return litre;
    }

    public abstract void FIS();

}


