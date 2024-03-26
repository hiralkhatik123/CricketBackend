package com.example.CricketBackend.repositary;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CricketBackend.entities.Match;

public interface MatchRepo extends JpaRepository<Match,Integer>{
    //fetch match with team name

    Optional<Match> findByTeamHeading(String teamHeading);
}
