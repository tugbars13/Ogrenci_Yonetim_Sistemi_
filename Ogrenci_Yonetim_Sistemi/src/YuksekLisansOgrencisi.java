public class YuksekLisansOgrencisi extends Ogrenci{
    private String thesisTitle;
    private String advisor;
    private String researchProject;

    public YuksekLisansOgrencisi(String firstName, String lastName, int id,
                                 String thesisTitle,String advisor,String researchProject) {

        super(firstName, lastName, id);
        this.thesisTitle= thesisTitle;
        this.advisor=advisor;
        this.researchProject=researchProject;
    }
    public String getThesisStatus() {
        return thesisTitle.isEmpty() ? "Tez Başlığı Belirlenmedi" : "Tez Başlığı: " + thesisTitle;
    }
    public String getResearchProjectDetails() {
        return researchProject.isEmpty() ? "Araştırma Projesi Bilgisi Yok" : researchProject;
    }
    public void assignAdvisor(String danisman) {

        this.advisor = advisor;
    }
    public void ogrenciBilgileriniYazdir() {
        System.out.println("Lisans Öğrencisi Bilgileri:");
        System.out.println("Ad: " + getFirstName());
        System.out.println("Soyad: " + getLastName());
        System.out.println("ID: " + getId());
        System.out.println("Ortalama: " + getAverage());
        System.out.println("Tez başlığı: " + thesisTitle);
        System.out.println("Danışman: " + advisor);
        System.out.println("Araştırma Başlığı: "+researchProject);
    }

    public String getThesisTitle() {

        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {

        this.thesisTitle = thesisTitle;
    }

    public String getAdvisor() {

        return advisor;
    }

    public void setAdvisor(String advisor) {

        this.advisor = advisor;
    }

    public String getResearchProject() {

        return researchProject;
    }

    public void setResearchProject(String researchProject) {

        this.researchProject = researchProject;
    }
}
