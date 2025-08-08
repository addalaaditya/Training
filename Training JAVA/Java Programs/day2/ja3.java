package day2;

public class ja3 {
	    public static void main(String[] args) {
	        String[][] weeklyTasks = new String[3][];

	        weeklyTasks[0] = new String[]{"Meeting", "Emails", "Report"};       
	        weeklyTasks[1] = new String[]{"Code review", "Team call"};          
	        weeklyTasks[2] = new String[]{"Design", "Presentation", "Testing", "Documentation"}; 

	        String[] days = {"Monday", "Tuesday", "Wednesday"};

	        for (int i = 0; i < weeklyTasks.length; i++) {
	            System.out.println(days[i] + " Tasks:");
	            for (int j = 0; j < weeklyTasks[i].length; j++) {
	                System.out.println(" - " + weeklyTasks[i][j]);
	            }
	            System.out.println();
	        }
	    }
	


}
