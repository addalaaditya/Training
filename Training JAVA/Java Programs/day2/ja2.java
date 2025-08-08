package day2;

public class ja2 {
	    public static void main(String[] args) {
	        int[][] studentMarks = new int[3][];
	        
	        studentMarks[0] = new int[2]; 
	        studentMarks[1] = new int[4]; 
	        studentMarks[2] = new int[3]; 

	        studentMarks[0][0] = 85;
	        studentMarks[0][1] = 90;

	        studentMarks[1][0] = 78;
	        studentMarks[1][1] = 88;
	        studentMarks[1][2] = 92;
	        studentMarks[1][3] = 75;

	        studentMarks[2][0] = 89;
	        studentMarks[2][1] = 91;
	        studentMarks[2][2] = 87;

	        for (int i = 0; i < studentMarks.length; i++) {
	            System.out.println("Class " + (i + 1) + " Student Marks:");
	            for (int j = 0; j < studentMarks[i].length; j++) {
	                System.out.println("  Student " + (j + 1) + ": " + studentMarks[i][j]);
	            }
	        }
	    }
	


}
