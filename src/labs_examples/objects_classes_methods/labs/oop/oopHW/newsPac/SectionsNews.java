package labs_examples.objects_classes_methods.labs.oop.oopHW;

public class SectionsNews {
    String Politics;
    String Economy;
    String Entertainment;

    public SectionsNews(String politics, String economy, String entertainment) {
        Politics = politics;
        Economy = economy;
        Entertainment = entertainment;
    }

    public String getPolitics() {
        return Politics;
    }

    public void setPolitics(String politics) {
        Politics = politics;
    }

    public String getEconomy() {
        return Economy;
    }

    public void setEconomy(String economy) {
        Economy = economy;
    }

    public String getEntertainment() {
        return Entertainment;
    }

    public void setEntertainment(String entertainment) {
        Entertainment = entertainment;
    }

    @Override
    public String toString() {
        return "SectionsNews{" +
                "Politics='" + Politics + '\'' +
                ", Economy='" + Economy + '\'' +
                ", Entertainment='" + Entertainment + '\'' +
                '}';
    }
}
