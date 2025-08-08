package day1;
//count
public class fe3 {
	public static void main(String[] args) {
        String[] words = {"Java", "is", "fun"};
        int count = 0;

        for (String word : words) {
            count++;
        }

        System.out.println("Total words: " + count);
    }
}
