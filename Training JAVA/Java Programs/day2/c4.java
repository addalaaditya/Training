package day2;
import java.util.*;

public class c4 {

    String userMessage;

    void getUserMessage() {
        Scanner sc = new Scanner(System.in);
        System.out.print("You: ");
        userMessage = sc.nextLine();
    }

    void respond() {
        if (userMessage.equals("hi")) {
            System.out.println("ChatBot: Hello!");
        } else if (userMessage.equals("how are you")) {
            System.out.println("ChatBot: I'm fine, thank you!");
        } else {
            System.out.println("ChatBot: Sorry, I don't understand.");
        }
    }

    public static void main(String[] args) {
        c4 bot = new c4();
        bot.getUserMessage();
        bot.respond();
    }
}
