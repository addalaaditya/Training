package day7;

import java.util.HashMap;
import java.util.ArrayList;

public class Scoreboard {
    public static void main(String[] args) {

        HashMap<String, Integer> scoreboard = new HashMap<>();

        scoreboard.put("A", 85);
        scoreboard.put("B", 90);
        scoreboard.put("C", 95);

        ArrayList<String> players = new ArrayList<>(scoreboard.keySet());

        System.out.println("Scoreboard is");
        
        for (int i = 0; i < players.size(); i++) {
            String player = players.get(i);
            int score = scoreboard.get(player);  
            System.out.println(player + ": " + score);
        }
    }
}
