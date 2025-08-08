package day3;

public class en42 {

    public static void main(String[] args) {

        en41 v = new en41();
        v.setName("Rahul");
        v.setAge(23);

        System.out.println("Name: " + v.getName());
        System.out.println("Age: " + v.getAge());
        v.vote();  
        System.out.println("Has Voted: " + v.getHasVoted());
    }
}
