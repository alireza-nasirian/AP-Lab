import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        ArrayList<String> polls1 = new ArrayList<>();
        polls1.add("real");
        polls1.add("real");
        votingSystem.creatVoting("which team will win? 1)real 2)barca",0,polls1);
        Person p1 = new Person("Alireza","Nasirian");
        Person p2 = new Person("Ali","Nasirian");
        ArrayList<String> choice1 = new ArrayList<>();
        ArrayList<String> choice2 = new ArrayList<>();
        choice1.add("real");
        choice1.add("barca");
        choice2.add("real");
        votingSystem.vote(0,p1,choice1);
        votingSystem.vote(0,p2,choice2);

        votingSystem.printResult(0);


        ArrayList<String> polls2= new ArrayList<>();
        polls2.add("1");
        polls2.add("2");
        polls2.add("3");
        votingSystem.creatVoting("which one?",1,polls2);
        ArrayList<String> choice3 = new ArrayList<>();
        ArrayList<String> choice4 = new ArrayList<>();
        choice3.add("1");
        choice3.add("2");
        choice4.add("3");
        choice4.add("2");
        votingSystem.vote(1,p1,choice3);
        votingSystem.vote(1,p2,choice4);
        votingSystem.printResult(1);
        votingSystem.vote(1,p1,choice4);


    }
}
