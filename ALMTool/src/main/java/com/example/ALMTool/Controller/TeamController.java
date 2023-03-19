package com.example.ALMTool.Controller;


import com.example.ALMTool.Entity.TeamEntity;
import com.example.ALMTool.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {

    @Autowired
    TeamService teamService;

    @GetMapping
    List<TeamEntity> getTeams(){
        return teamService.getteams();
    }


//    @GetMapping("/students/{id}")
//    Optional<StudentEnity> getStudents(@RequestParam Integer id){
//        return studentService.getStudentsById(id);
//    }




    @PostMapping
    void addteams(@RequestBody TeamEntity teamEntity){
        teamService.addteams(teamEntity);
    }
}
