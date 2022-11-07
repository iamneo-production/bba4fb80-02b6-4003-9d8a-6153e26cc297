package com.examly.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comments {
    @Id
    private int id;
	private String comment;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }

}
