import java.util.ArrayList;
import java.util.HashMap;

import static java.lang.System.*;

public class Ogrenci {
    //kullanıcı bilgileri
    private String firstName;
    private String lastName;
    private int id;
    private HashMap<String,Integer> note;
    private double average;

    public Ogrenci(String firstName, String lastName,
                   int id){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.note = new HashMap<>();
    }
    public void noteAdd(String lessonName,int notes){
        note.put(lessonName,notes);
        calculateAverage();
    }
    public void calculateAverage(){
        double sum = 0;
        for (int not : note.values()){
            sum += not;
        }
        average = (double) sum / note.size();
    }
    public boolean successStatus(){
        return average >= 50;
    }
    public void ogrenciBilgileriniYazdir() {
        System.out.println("Lisans Öğrencisi Bilgileri:");
        System.out.println("Ad: " + getFirstName());
        System.out.println("Soyad: " + getLastName());
        System.out.println("ID: " + getId());
        System.out.println("Ortalama: " + getAverage());
        System.out.println("Başarılı mı : " + (successStatus() ? "Evet" : "Hayır"));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<String, Integer> getNote() {
        return note;
    }

    public void setNote(HashMap<String, Integer> note) {
        this.note = note;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }






}
