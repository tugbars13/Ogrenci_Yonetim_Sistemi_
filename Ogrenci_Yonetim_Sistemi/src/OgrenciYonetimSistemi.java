import java.util.List;

public class OgrenciYonetimSistemi {
    private List<Ogrenci> ogrenciListesi;

    public OgrenciYonetimSistemi() {

        this.ogrenciListesi = ogrenciListesi;
    }
    public void addStudent(Ogrenci ogrenci){
        ogrenciListesi.add(ogrenci);
    }
    public void deleteStudent(int id){

        ogrenciListesi.removeIf(ogrenci -> ogrenci.getId() == id);
    }
    public void updateStudent(int id, String yeniIsim, String yeniSoyisim) {
        for (Ogrenci ogrenci : ogrenciListesi) {
            if (ogrenci.getId() == id) {
                ogrenci.setFirstName(yeniIsim);
                ogrenci.setLastName(yeniSoyisim);
                break;
            }
        }
    }
    public Ogrenci bringStudent(int id) {
        for (Ogrenci ogrenci : ogrenciListesi) {
            if (ogrenci.getId() == id) {
                return ogrenci;
            }
        }
        return null;
    }
    public void showStudent(int id) {
        Ogrenci ogrenci = bringStudent(id);
        if (ogrenci != null) {
            ogrenci.ogrenciBilgileriniYazdir();
        } else {
            System.out.println("Öğrenci bulunamadı.");
        }
    }
    public void showNotes(int id) {
        Ogrenci ogrenci = bringStudent(id);
        if (ogrenci != null) {
            System.out.println("Öğrenci notları: " + ogrenci.getNote());
        } else {
            System.out.println("Öğrenci bulunamadı.");
        }
    }
    public void average(int id) {
        Ogrenci ogrenci = bringStudent(id);
        if (ogrenci != null) {
            System.out.println("Öğrenci ortalaması: " + ogrenci.getAverage());
        } else {
            System.out.println("Öğrenci bulunamadı.");
        }
    }
}
