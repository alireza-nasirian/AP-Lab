import ir.huri.jcal.JalaliCalendar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


/**
 * @author alireza nasirian
 * @version 1
 */
public class Voting {

    JalaliCalendar jalaliCalendar = new JalaliCalendar(1400,1,21);

    private int type;
    private String question;
    private ArrayList<Person> voters = new ArrayList<>();
    private HashMap<String, HashSet<Vote>> polls = new HashMap<>();

    /**
     * constructor of voting class
     * @param type is type of voting
     * @param question is the question of voting
     */
    public Voting(int type, String question){
        this.type = type;
        this.question = question;
    }

    /**
     * @return the question of voting
     */
    public String getQuestion() {
        return question;
    }

    /**
     * add an option to voting
     * @param choice is a option to add
     */
    public void creatChoice(String choice){
        HashSet<Vote> votes = new HashSet<>();
        polls.put(choice,votes);
    }

    /**
     *
     * @param person is who want to vote
     * @param choices is choices of prson
     */
    public void vote(Person person, ArrayList<String> choices){
            if (voters.contains(person)){
                System.out.println("you can not vote again");
                return;
        }
            if (type == 0){
                if (choices.size() > 1){
                    System.out.println("you can choose one of options");
                    return;
                }
            }
        for (String s : choices){
            Vote vote = new Vote(person,jalaliCalendar.toString());
            polls.get(s).add(vote);
        }
        voters.add(person);
    }

    /**
     *
     * @return list of voters
     */
    public ArrayList<Person> getVoters() {
        return voters;
    }

    /**
     * print options of voting
     */
    public void printVotes(){
        System.out.println(polls.values());
    }

    /**
     *
     * @return the choicec of voting
     */
    public ArrayList<String> getPolls(){
        ArrayList<String> pollList = new ArrayList<>();
        polls.forEach((k,v)->{
            pollList.add(k);
        });
        return pollList;
    }

    /**
     *
     * @return the result of voting
     */
    public HashMap<String, HashSet<Vote>> getPolls2() {
        return polls;
    }
}
