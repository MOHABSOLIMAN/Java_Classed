package Main;

public class pyramid {
    String pharoh;
    String modern_name;
    String site;
    double height;
    public pyramid(String pharoh,String modern_name,String site,double height){
        this.modern_name=modern_name;
        this.height=height;
        this.site=site;
        this.pharoh=pharoh;

    }
    public String tostring(){
        return "Pharoh name :" + pharoh + "Modern Name :" + modern_name + "Site :" + site + "Height :" + height ;
    }
    public void setPharoh(String pharoh) {
        this.pharoh = pharoh;
    }

    public String getPharoh() {
        return pharoh;
    }

    public void setModern_name(String modern_name) {
        this.modern_name = modern_name;
    }

    public String getModern_name() {
        return modern_name;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getSite() {
        return site;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}