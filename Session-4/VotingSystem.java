import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author alireza nasirian
 * @version 1
 */
public class VotingSystem {

    ArrayList<Voting> votingList = new ArrayList<>();

    /**
     * creat a voting with given details
     * @param question is a question of voting
     * @param type is a type of voting
     * @param polls is options of voting
     */
    public void creatVoting(String question, int type, ArrayList<String> polls){
        Voting voting1 = new Voting(type,question);
        for (String s : polls){
            voting1.creatChoice(s);
        }
        votingList.add(voting1);
    }

    /**
     * print all of votings
     */
    public void printListOfVotings(){
        for (Voting v : votingList){
            System.out.println(v.getQuestion());
        }
    }

    /**
     *
     * @param index is index of voting
     */
    public void printVoting(int index){
        System.out.println(votingList.get(index).getQuestion());
        ArrayList<String> polls = votingList.get(index).getPolls();
        for (String s : polls){
            System.out.println(s);
        }
    }

    /**
     *
     * @param num is numer of voting
     * @param person is person who want to vote
     * @param choices is choices of person
     */
    public void vote(int num, Person person, ArrayList<String> choices){
        votingList.get(num).vote(person,choices);
    }

    /**
     * print result of choosen voting
     * @param num is number of voting
     */
    public void printResult(int num){
        int cnt = 0;
        String choice = "";
        HashMap<String, HashSet<Vote>> hashMap = votingList.get(num).getPolls2();
        for (Map.Entry<String,HashSet<Vote>> entry : hashMap.entrySet()){
            if (entry.getValue().size() > cnt){
                cnt = entry.getValue().size();
                choice = entry.getKey();
            }
        }
        System.out.println(choice);

    }
}
