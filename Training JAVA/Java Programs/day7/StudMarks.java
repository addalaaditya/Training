package day7;

import java.util.ArrayList;

public class StudMarks {
    public static void main(String[] args) {
        
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(85);   
        marks.add(90);   
        marks.add(78);   

        int total = 0;

        for (int i = 0; i < marks.size(); i++) {
            total += marks.get(i);  
        }

        int average = total / (int) marks.size();

        System.out.println("Student Marks: " + marks);
        System.out.println("Tot Marks: " + total);
        System.out.println("Avg Marks: " + average);
    }
}
