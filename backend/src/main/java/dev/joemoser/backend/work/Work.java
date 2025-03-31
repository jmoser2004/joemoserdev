package dev.joemoser.backend.work;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "work")
public class Work
{
    @Id
    private int id;
    @Column
    private String title;
    @Column
    private String startdate;
    @Column
    private String enddate;
    @Column
    private String descr;
    @Column
    private String notes_for_chatgpt;

    public void setId(int id){this.id = id;}
    public void setTitle(String title){this.title = title;}
    public void setStartdate(String startdate){this.startdate = startdate;}
    public void setEnddate(String enddate){this.enddate = enddate;}
    public void setDescr(String descr){this.descr = descr;}
    public void setNotes_for_chatgpt(String notes_for_chatgpt){this.notes_for_chatgpt = notes_for_chatgpt;}

    public int getId(){return this.id;}
    public String getTitle(){return this.title;}
    public String getStartdate(){return this.startdate;}
    public String getEnddate(){return this.enddate;}
    public String getDescr(){return this.descr;}
    public String getNotes_for_chatgpt(){return this.notes_for_chatgpt;}

    @Override
    public String toString()
    {
        return "Title: " + title + "\n" +
               "Start date: " + startdate + "\n" +
               "End date: " + enddate + "\n" +
               "Description: " + descr + "\n" +
               "Notes for ChatGPT: " + notes_for_chatgpt;
    }
}
