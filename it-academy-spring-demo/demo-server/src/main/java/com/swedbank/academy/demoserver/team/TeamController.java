package com.swedbank.academy.demoserver.team;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/teams")
public class TeamController {
    private static Logger log = LoggerFactory.getLogger(TeamController.class);


    private TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService){this.teamService = teamService;}


    @GetMapping
    public ResponseEntity<List<Team>> getPersons(){
        List<Team> list = teamService.getAll();
        return new ResponseEntity<List<Team>>(list, HttpStatus.OK);
    }

}
