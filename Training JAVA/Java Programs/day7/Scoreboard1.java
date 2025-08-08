package day7;

//import java.util.HashMap;
//import java.util.ArrayList;
import java.util.*;
public class Scoreboard1 {
    public static void main(String[] args) {

        HashMap<String, Integer> scoreboard = new HashMap<>();

        scoreboard.put("A", Integer.valueOf(85));
        scoreboard.put("B", Integer.valueOf(100));
        scoreboard.put("C", Integer.valueOf(95));

        ArrayList<String> players = new ArrayList<>(scoreboard.keySet());        
        String topPlayer = "";
        int highestScore = Integer.MIN_VALUE;
        
        System.out.println("Scoreboard is:");

        for (int i = 0; i < players.size(); i++) {
            String player = players.get(i);
            int score = scoreboard.get(player);  
            System.out.println(player + ": " + score);

            if (score > highestScore) {
                highestScore = score;
                topPlayer = player;
            }
        }

        System.out.println("\nTop Scorer " + topPlayer + " with score " + highestScore);
    }
}
