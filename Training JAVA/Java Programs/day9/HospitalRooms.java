package day9;
import java.util.TreeSet;
public class HospitalRooms
{
    public static void main(String[] args)
    {
        TreeSet<String> rooms = new TreeSet<>();  

        rooms.add("203");
        rooms.add("101");
        rooms.add("305");
        rooms.add("102");
        rooms.add("201");

        System.out.println("Available Rooms (Sorted) :");
        for (String room : rooms.descendingSet())
        {
            System.out.println("Rooms:: " + room);
        }

        System.out.println("\n First Available Room: " + rooms.first());
        System.out.println(" Last Available Room: " + rooms.last());
    }
}
