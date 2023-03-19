package com.example.ALMTool.Repository;

import com.example.ALMTool.Entity.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<TeamEntity,Integer> {
}
