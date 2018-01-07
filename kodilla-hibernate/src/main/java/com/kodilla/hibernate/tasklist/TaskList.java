package com.kodilla.hibernate.tasklist;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TASKLISTS")
public class TaskList {
    private int id;
    private String ListName;
    private String description;

    public TaskList(){
    }

    public TaskList(String listName, String description) {
        ListName = listName;
        this.description = description;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }
    @Column(name="LISTNAME")
    public String getListName() {
        return ListName;
    }
    @Column(name="DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListName(String listName) {
        ListName = listName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
