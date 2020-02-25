package com.swedbank.academy.demoserver.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {
    private TeamRepository personTeamRepository;

    @Autowired
    public TeamServiceImpl(TeamRepository personTeamRepository){this.personTeamRepository = personTeamRepository;}

    @Override
    public List<Team> getAll() {
        List<Team> list = new ArrayList<>();
        personTeamRepository.findAll().forEach(e -> list.add(e));
        return list;
    }


}
