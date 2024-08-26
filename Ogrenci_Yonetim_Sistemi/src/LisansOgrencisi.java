public class LisansOgrencisi extends Ogrenci{
    private String part;
    private int year;
    private int credit;

    public LisansOgrencisi(String firstName, String lastName, int id,
                           String part,int year,int credit) {

        super(firstName, lastName, id);
        this.credit=credit;
        this.part=part;
        this.year=year;
    }

    public boolean isFirstYear(){

        return year == 1;
    }
    public int getRemainingCredits(){
        int creditsNeededForGraduation = 120;
        return creditsNeededForGraduation - credit;
    }
    public void updateYear() {

        year++;
    }
    public void ogrenciBilgileriniYazdir() {
        System.out.println("Lisans Öğrencisi Bilgileri:");
        System.out.println("Ad: " + getFirstName());
        System.out.println("Soyad: " + getLastName());
        System.out.println("ID: " + getId());
        System.out.println("Ortalama: " + getAverage());
        System.out.println("Bölüm: " + part);
        System.out.println("Yıl: " + year);
        System.out.println("Kredisi: "+credit);
    }

    public String getPart() {

        return part;
    }

    public void setPart(String part) {

        this.part = part;
    }

    public int getYear() {

        return year;
    }

    public void setYear(int year) {

        this.year = year;
    }

    public int getCredit() {

        return credit;
    }

    public void setCredit(int credit) {

        this.credit = credit;
    }
}
