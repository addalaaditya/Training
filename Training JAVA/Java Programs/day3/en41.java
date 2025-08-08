package day3;
//Voting app: encapsulate user voting rights and identity.
public class en41 {
    private String name;
    private int age;
    private boolean hasVoted;

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public void vote() {
        if (age < 18) {
            System.out.println("You are not eligible to vote.");
        } 
        else {
            hasVoted = true;
            System.out.println("Vote successful.");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getHasVoted() {
        return hasVoted;
    }
}
