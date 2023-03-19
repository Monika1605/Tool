package com.example.ALMTool.Entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "teamtable")
public class TeamEntity {

    @Id
    @Column(name = "team_id")
    private int team_id;
    @Column(name = "team_name")
    private String team_name;

    public TeamEntity() {
    }

    public TeamEntity(int team_id,String team_name) {
        this.team_id=team_id;
        this.team_name=team_name;
    }

    public int getteam_id() {
        return team_id;
    }

    public void setteam_id(int team_id) {
        this.team_id = team_id;
    }

    public String getteam_name() {
        return team_name;
    }

    public void setteam_name(String team_name) {
        this.team_name=team_name;
    }


    @Override
    public String toString() {
        return "TeamEntity{" +
                "team_id=" + team_id +
                ", team_name='" + team_name +

                '}';
    }
}

