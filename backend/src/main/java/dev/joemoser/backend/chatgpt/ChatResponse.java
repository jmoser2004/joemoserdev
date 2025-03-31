package dev.joemoser.backend.chatgpt;

import java.util.List;

public class ChatResponse
{
    private List<Choice> choices;

    public ChatResponse(List<Choice> choices)
    {
        this.choices = choices;
    }

    public void setChoices(List<Choice> choices){this.choices = choices;}

    public List<Choice> getChoices(){return this.choices;}

    public static class Choice
    {
        private int index;
        private Message message;

        public Choice(int index, Message message)
        {
            this.index = index;
            this.message = message;
        }

        public void setIndex(int index){this.index = index;}
        public void setMessage(Message message){this.message = message;}

        public int getIndex(){return this.index;}
        public Message getMessage(){return this.message;}
    }
}
