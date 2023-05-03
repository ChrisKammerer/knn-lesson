import java.util.HashMap;

public class VoteCounter {
    private class Vote{
        String name;
        int count;

        Vote(String name){
            this.name = name;
            count = 1;
        }
        Vote(String name, int count){
            this.name = name;
            this.count = count;
        }
    }

    HashMap<String, Vote> votes;

    public VoteCounter(){
        this.votes = new HashMap<>();
    }

    public void addVote(String name){
        if(votes.containsKey(name)){
            votes.get(name).count++;
        }
        else{
            votes.put(name, new Vote(name));
        }
    }

    public String getHighestVote(){
        Vote top = new Vote(null, 0);
        for(Vote vote : votes.values()){
            if(vote.count>=top.count) top = vote;
        }
        return top.name;
    }

    public boolean isTied(){
        Vote top = votes.get(getHighestVote());
        for(Vote vote : votes.values()){
            if(vote.count==top.count && !vote.name.equals(top.name)) return true;
        }
        return false;
    }
}
