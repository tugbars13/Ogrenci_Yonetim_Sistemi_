public class Ogretmen extends Egitimci implements IGorevli{

    public Ogretmen(String name, String part) {
        super(name, part);
    }

    @Override
    public void takeLesson() {
        System.out.println("Eğitmen : "+getName());
        System.out.println("Bölüm : "+getPart());
    }

    @Override
    public void makeTask() {
        System.out.println(getName()+" "+getPart()+" bölümünde görev yapmaktadır");
    }
}
