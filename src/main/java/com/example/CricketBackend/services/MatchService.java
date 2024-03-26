package com.example.CricketBackend.services;

import java.util.List;

import com.example.CricketBackend.entities.Match;

public interface MatchService {
    //get all matches , live matches,cricket world cup

    List<Match> getAllMatches();

    // List<Match> getAllLiveMatches();

    List<List<String>> getPointTable();

    List<Match> getLiveMatches();
}
