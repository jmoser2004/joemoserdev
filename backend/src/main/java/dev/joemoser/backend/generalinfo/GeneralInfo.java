package dev.joemoser.backend.generalinfo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "general_info")
public class GeneralInfo
{
    @Id
    private int id;
    @Column
    private String descr;
    @Column
    private String notes_for_chatgpt;

    public void setId(int id){this.id = id;}
    public void setDescr(String descr){this.descr = descr;}
    public void setNotes_for_chatgpt(String notes_for_chatgpt){this.notes_for_chatgpt = notes_for_chatgpt;}

    public int getId(){return this.id;}
    public String getDescr(){return this.descr;}
    public String getNotes_for_chatgpt(){return this.notes_for_chatgpt;}

    @Override
    public String toString()
    {
        return "Description: " + descr + "\n" +
               "Notes for ChatGPT: " + notes_for_chatgpt;
    }
}
