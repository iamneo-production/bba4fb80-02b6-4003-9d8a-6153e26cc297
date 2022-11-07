package com.examly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.dao.ILikeModel;
import com.examly.model.LikeModel;
@RestController
public class UserLikeModelController {
    @Autowired
	ILikeModel lik;
    @PostMapping("like/{id}")
	public String add(@RequestBody LikeModel li) {
        lik.saveAndFlush(li);
            return "like added to Songs";
	}
    @DeleteMapping("like/{id}")
	public String delete(@PathVariable("id")String id) {
		lik.deleteById(id);
		return "Like removed";
	}
}
