package dev.joemoser.backend.chatgpt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ChatGPTService
{
    private final RestTemplate restTemplate = new RestTemplate();

    @Autowired
    public UserMessagesRepository repo;

    private final String url = "https://api.openai.com/v1/chat/completions";
    private final String apikey = "nice try :)";
    private final String model = "gpt-3.5-turbo";

    public String getType(String userInput)
    {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + apikey);
        headers.set("Content-Type","application/json");

        HttpEntity<ChatRequest> request = new HttpEntity<ChatRequest>(new ChatRequest(model, userInput), headers);

        ResponseEntity<ChatResponse> response = restTemplate.exchange(
            url,
            HttpMethod.POST,
            request,
            ChatResponse.class
        );

        String type = "Server Error";

        try
        {
            type = response.getBody().getChoices().get(0).getMessage().getContent();
        }
        catch(Exception e)
        {
            System.out.println("Error in getType()");
            return type;
        }

        return type;
    }

    public String getResult(String userInput, List<String> contexts)
    {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + apikey);
        headers.set("Content-Type", "application/json");

        HttpEntity<ChatRequest> request = new HttpEntity<ChatRequest>(new ChatRequest(model, userInput, contexts), headers);

        ResponseEntity<ChatResponse> response = restTemplate.exchange(
            url,
            HttpMethod.POST,
            request,
            ChatResponse.class
        );

        String result = "Server Error";

        try
        {
            result = response.getBody().getChoices().get(0).getMessage().getContent();
        }
        catch(Exception e)
        {
            System.out.println("Error in getResult()");
            return result;
        }
        
        UserMessages userMessage = new UserMessages();
        userMessage.setUsermsg(userInput);
        userMessage.setGptmsg(result);
        repo.save(userMessage);
        
        return result;
    }
}
