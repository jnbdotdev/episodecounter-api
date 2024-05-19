package com.jnb.dev.episodecounterapi.controller;

import org.springframework.web.bind.annotation.RestController;

import com.jnb.dev.episodecounterapi.model.Content;
import com.jnb.dev.episodecounterapi.repository.ContentRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/content")
public class ContentController {

    @Autowired // Vai instanciar a implementação ContentRepository automaticamente
    private ContentRepository contentRepository;

    @GetMapping()    
    public List<Content> list() {
        return contentRepository.findAll();
    }

    @PostMapping    
    @ResponseStatus(HttpStatus.CREATED)
    public Content addContent(@RequestBody Content content){
        return contentRepository.save(content);
    }
    
}
