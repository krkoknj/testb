package com.testb.testb.controller;

import com.testb.testb.Board;
import com.testb.testb.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloWorldController {

    @Autowired
    BoardService boardService;

    @GetMapping("/api/hello")
    @CrossOrigin
    public List<Board> test() {
        System.out.println("1");



        return boardService.findAll();
    }


}
