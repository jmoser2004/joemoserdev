package dev.joemoser.backend.chatgpt;

import java.util.ArrayList;
import java.util.List;

public class ChatRequest
{
    private static final String SELECTION_PROMPT = "You will be given a question about Joe Moser. Your options for responses are as follows: education, general_info, interests, projects, work, not_related. If the information is even tangentally related to Joe, respond with interests. Respond only with the selection. Do not include any further formatting.";
    private static final String CONTEXT_INFO = "You will be given some information about Joe Moser. Use this information to respond to the question given by the user. Be friendly, but if the question is not related to Joe, gently redirect the user.";

    private String model;
    private List<Message> messages;

    public ChatRequest(String model, String input)
    {
        this.model = model;

        this.messages = new ArrayList<>();
        messages.add(new Message("system", SELECTION_PROMPT));
        messages.add(new Message("user", input));

    }

    public ChatRequest(String model, String input, List<String> contexts)
    {
        this.model = model;
        
        this.messages = new ArrayList<>();
        messages.add(new Message("system", CONTEXT_INFO));

        for(String context:contexts) messages.add(new Message("system", context));

        messages.add(new Message("user", input));
    }

    public void setModel(String model){this.model = model;}
    public void setMessages(List<Message> messages){this.messages = messages;}

    public String getModel(){return this.model;}
    public List<Message> getMessages(){return this.messages;}
}
