import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChatBot {
    private Map<String, String> knowledgeBase;

    public ChatBot() {
        knowledgeBase = new HashMap<>();
        loadKnowledgeBase();
    }

    private void loadKnowledgeBase() {
        // Basic responses for demonstration purposes
        knowledgeBase.put("hello", "Hello! How can I assist you today?");
        knowledgeBase.put("how are you", "I'm just a bot, but I'm doing great! How about you?");
        knowledgeBase.put("what is your name", "I am a chatbot created by OpenAI.");
        knowledgeBase.put("what can you do", "I can answer your questions and chat with you!");
        knowledgeBase.put("bye", "Goodbye! Have a nice day!");
    }

    public String getResponse(String input) {
        String normalizedInput = input.toLowerCase().trim();
        return knowledgeBase.getOrDefault(normalizedInput, "I'm not sure how to respond to that.");
    }

    public static void main(String[] args) {
        ChatBot chatBot = new ChatBot();
        Scanner scanner = new Scanner(System.in);

        System.out.println("ChatBot: Hello! Type 'bye' to exit.");
        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("bye")) {
                System.out.println("ChatBot: " + chatBot.getResponse(userInput));
                break;
            }
            System.out.println("ChatBot: " + chatBot.getResponse(userInput));
        }
        scanner.close();
    }
}
