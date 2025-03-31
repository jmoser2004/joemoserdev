package dev.joemoser.backend.chatgpt;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_messages")
public class UserMessages
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column
    private String usermsg;
    @Column
    private String gptmsg;

    public void setId(int id){this.id = id;}
    public void setUsermsg(String usermsg){this.usermsg = usermsg;}
    public void setGptmsg(String gptmsg){this.gptmsg = gptmsg;}

    public int getId(){return this.id;}
    public String getUsermsg(){return this.usermsg;}
    public String getGptmsg(){return this.gptmsg;}
}
