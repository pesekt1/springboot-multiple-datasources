package com.multisource.db1.controller;

import com.multisource.db1.domain.Tutorial_db1;
import com.multisource.db1.repo.TutorialRepository_db1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foo")
public class TutorialController_Db1 {

    TutorialRepository_db1 tutorialRepository;

    @Autowired
    public TutorialController_Db1(TutorialRepository_db1 tutorialRepository){
        this.tutorialRepository = tutorialRepository;
    }

    @GetMapping("/tutorials")
    public ResponseEntity<List<Tutorial_db1>> getAllTutorials() {
        List<Tutorial_db1> tutorials = tutorialRepository.findAll();
        return new ResponseEntity<>(tutorials, HttpStatus.OK);
    }
}


