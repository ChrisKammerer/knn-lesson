import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.FileReader;
import java.util.Scanner;
public class DataSet {
    ArrayList<Record> recordList = new ArrayList<>();
    ArrayList<Record> testList = new ArrayList<>();

    public DataSet(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner s = new Scanner(new FileReader(file));
        //skip line 1
        //TODO: make outer loop that can run multiple tests, or make another data set constructor
        s.nextLine();
        String[] lengths = s.nextLine().split(" ");
        int dataLength = Integer.parseInt(lengths[0]);
        int testLength = Integer.parseInt(lengths[1]);
        for(int i=0; i<dataLength; i++){
            String[] point = s.nextLine().split(" ");
            ArrayList<Double> values = new ArrayList<>();
            for(int j=1; j<point.length; j++){
                values.add(Double.parseDouble(point[j]));
            }
            Record r = new Record(point[0], values);
            recordList.add(r);
        }

        for(int i=0; i<testLength; i++){
            String[] point = s.nextLine().split(" ");
            ArrayList<Double> values = new ArrayList<>();
            for(int j=0; j<point.length; j++){
                values.add(Double.parseDouble(point[j]));
            }
            Record r = new Record("Unclassified", values);
            testList.add(r);
        }

    }

    public String toString(){
        return recordList.toString() + testList.toString();
    }
}
