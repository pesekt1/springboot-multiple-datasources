package com.multisource.db2.controller;

import com.multisource.db2.domain.Tutorial_db2;
import com.multisource.db2.repo.TutorialRepository_db2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bar")
public class TutorialController_Db2 {

    TutorialRepository_db2 barTutorialRepository;

    @Autowired
    public TutorialController_Db2(TutorialRepository_db2 barTutorialRepository){
        this.barTutorialRepository = barTutorialRepository;
    }

    @GetMapping("/tutorials")
    public ResponseEntity<List<Tutorial_db2>> getAllTutorials() {
        List<Tutorial_db2> tutorials = barTutorialRepository.findAll();
        return new ResponseEntity<>(tutorials, HttpStatus.OK);
    }
}


