package labs_examples.objects_classes_methods.labs.oop.oopHW.newsPac;

public class Media {

    String tv;
    String radio;
    String web;
    String print;

    public Media(String tv, String radio, String web, String print) {
        this.tv = tv;
        this.radio = radio;
        this.web = web;
        this.print = print;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getPrint() {
        return print;
    }

    public void setPrint(String print) {
        this.print = print;
    }

    @Override
    public String toString() {
        return "Media{" +
                "tv='" + tv + '\'' +
                ", radio='" + radio + '\'' +
                ", web='" + web + '\'' +
                ", print='" + print + '\'' +
                '}';
    }
}
