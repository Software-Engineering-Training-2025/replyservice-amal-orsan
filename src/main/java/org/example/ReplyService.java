package org.example;

public class ReplyService {
    
    public String reply(String message, ReplyType type) {

        if (message == null || message.trim().isEmpty()) {
            return "Please say something.";
        }

        String normalizedMessage = message.trim().toLowerCase();

        return switch (normalizedMessage) {
            case "hi" -> getResponseForHi(type);
            case "hello" -> getResponseForHello(type);
            case "how are you" -> getResponseForHowAreYou(type);
            case "i need help" -> getResponseForNeedHelp(type);
            case "can you help me with my account" -> getResponseForAccountHelp(type);
            case "thanks" -> getResponseForThanks(type);
            case "bye" -> getResponseForBye(type);
            case "what is your name" -> getResponseForName(type);
            default -> getResponseForOther(type);
        };
    }
    private String getResponseForHi(ReplyType type) {
        return switch (type) {
            case FORMAL -> "Hello. How may I assist you today?";
            case FRIENDLY -> "Hey there! 😊 How can I help?";
            case CONCISE -> "Hello. How can I help?";
        };
    }
    private String getResponseForHello(ReplyType type) {
        return switch (type) {
            case FORMAL -> "Hello. How may I assist you today?";
            case FRIENDLY -> "Hi! 👋 What’s up?";
            case CONCISE -> "Hello. How can I help?";
        };
    }

    private String getResponseForHowAreYou(ReplyType type) {
        return switch (type) {
            case FORMAL -> "I am functioning properly. How may I assist you?";
            case FRIENDLY -> "Doing great! 😄 How can I help?";
            case CONCISE -> "I’m good. How can I help?";
        };
    }

    private String getResponseForNeedHelp(ReplyType type) {
        return switch (type) {
            case FORMAL -> "I can assist with that. Please provide more details.";
            case FRIENDLY -> "I’ve got you! 🙂 Tell me a bit more.";
            case CONCISE -> "Share details; I’ll help.";
        };
    }

    private String getResponseForAccountHelp(ReplyType type) {
        return switch (type) {
            case FORMAL -> "Certainly. Please describe the account issue.";
            case FRIENDLY -> "Sure thing! 😊 What’s wrong with the account?";
            case CONCISE -> "Describe the account issue…";
        };
    }

    private String getResponseForThanks(ReplyType type) {
       return switch (type) {
            case FORMAL ->  "You are welcome.";
            case FRIENDLY -> "Anytime! 🙌";
            case CONCISE -> "You’re welcome.";
        };
    }

    private String getResponseForBye(ReplyType type) {
        return switch (type) {
            case FORMAL -> "Goodbye.";
            case FRIENDLY -> "See you later! 👋";
            case CONCISE ->"Goodbye.";
        };
    }

    private String getResponseForName(ReplyType type) {
       return  switch (type) {
            case FORMAL -> "I am your virtual assistant.";
            case FRIENDLY -> "I’m your helper bot 🤖";
            case CONCISE -> "I’m your assistant.";
        };
    }

    private String getResponseForOther(ReplyType type) {
       return switch (type) {
            case FORMAL -> "Could you clarify your request?";
            case FRIENDLY -> "Could you tell me more?";
            case CONCISE ->"Please clarify.";
        };
    }
}
