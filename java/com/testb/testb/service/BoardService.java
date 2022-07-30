package com.testb.testb.service;

import com.testb.testb.Board;
import com.testb.testb.respository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class BoardService {
    @Autowired
    BoardRepository boardRepository;

    public List<Board> findAll() {
        return boardRepository.findAll();
    }

}
