import java.util.Scanner;

public class Eliza {
    public static void main (String[] args){

        Scanner chat = new Scanner(System.in);
        System.out.println("Welcome to ElizaChats! My name is Eliza, What's your name?");
        String chat1 = chat.nextLine();
        System.out.println("Nice to meet you," + chat1 + ", How has your day been?");
        String chat2 = chat.nextLine();
        System.out.println("okey, Anything in particular that makes you feel that It has been a splendid day! ?");
        String chat3 = chat.nextLine();

        System.out.println(chat3 + "Well it has been my pleasure to speak with you. Have a nice day!");

        System.out.println("Here are your responses:" + chat1  +  chat2 +  chat3);


    }
}
