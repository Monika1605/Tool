package com.example.ALMTool.Service;


import com.example.ALMTool.Entity.TeamEntity;
import com.example.ALMTool.Repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }


    public List<TeamEntity> getteams() {
        return teamRepository.findAll();
    }

    public void addteams(TeamEntity teamEntity) {

        teamRepository.save(teamEntity);
    }
}
