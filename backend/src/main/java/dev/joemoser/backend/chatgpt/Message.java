package dev.joemoser.backend.chatgpt;

public class Message
{
    private String role;
    private String content;

    public Message(){}

    public Message(String role, String content)
    {
        this.role = role;
        this.content = content;
    }

    public void setRole(String role){this.role = role;}
    public void setContent(String content){this.content = content;}

    public String getRole(){return this.role;}
    public String getContent(){return this.content;}
}
