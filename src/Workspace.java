import javax.xml.crypto.Data;
import java.io.FileNotFoundException;

public class Workspace{
    public static void main(String[] args) throws FileNotFoundException {
        DataSet data = new DataSet("Prob20.txt");
        System.out.println(data);

        VoteCounter counter = new VoteCounter();
        counter.addVote("A");
        counter.addVote("A");
        counter.addVote("A");
        counter.addVote("B");
        counter.addVote("B");
        counter.addVote("C");
        counter.addVote("C");
        counter.addVote("D");
        System.out.println(counter.getHighestVote());
        System.out.println(counter.isTied());
        System.out.println("done");


    }
}