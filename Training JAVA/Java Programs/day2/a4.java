package day2;

public class a4 {
    public static void main(String[] args) {
        int[][] atm = {
            {500,  20},  
            {200,  30},  
            {100,  50}   
        };
        int totalCash = 0;
        for (int i = 0; i < atm.length; i++) {
            int de = atm[i][0];
            int count = atm[i][1];
            int total = de * count;
            totalCash += total;

            System.out.println("rupees:" + de + "\t\t" + count + "\t₹" + total);
        }

        System.out.println("Total Cash in ATM: ₹" + totalCash);
    }
}

