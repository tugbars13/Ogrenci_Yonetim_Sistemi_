public abstract class Egitimci {
    private String name;
    private String part;

    public Egitimci(String name, String part) {
        this.name = name;
        this.part = part;
    }
    public abstract void takeLesson();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }


}
