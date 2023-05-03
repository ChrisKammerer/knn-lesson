import java.util.ArrayList;

public class Bird {
    private String classification;
    private double length;
    private double width;
    private double wingspan;
    private double wingAngle;

    public Bird(String classification, double length, double width, double wingspan, double wingAngle) {
        this.classification = classification;
        this.length = length;
        this.width = width;
        this.wingspan = wingspan;
        this.wingAngle = wingAngle;
    }

    public Bird(double length, double width, double wingspan, double wingAngle){
        this.classification = "unclassified";
        this.length = length;
        this.width = width;
        this.wingspan = wingspan;
        this.wingAngle = wingAngle;
    }

    public void setClassification(String classification){
        this.classification = classification;
    }

    public ArrayList<Double> getDataPoints(){
        return new ArrayList<>();
    }

    public String toString(){
        return "\n" + "(" + classification + ")" + length + " " + width + " " + wingspan + " " + wingAngle;
    }
}
