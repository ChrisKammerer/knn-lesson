import java.util.ArrayList;
public class Record {
    private String classification;
    private ArrayList<Double> values;

    public Record(String classification, ArrayList<Double> values){
        this.classification = classification;
        this.values = values;
    }

    public String getClassification(){return classification;}
    public ArrayList<Double> getValues(){return values;}

    public String toString(){
        return classification + " " + values;
    }
}
