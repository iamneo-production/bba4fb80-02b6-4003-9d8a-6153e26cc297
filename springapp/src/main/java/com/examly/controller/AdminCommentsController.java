package com.examly.controller;

import java.util.List;

import javax.xml.stream.events.Comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.dao.IComments;
import com.examly.model.Comments;
@RestController
public class AdminCommentsController {
    @Autowired
	IComments comment;
	@GetMapping("admin/comment")
	public String findAll() {
		comment.findAll(); 
        return "Array of Comments";
	}
}
