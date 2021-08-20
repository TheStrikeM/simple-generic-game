package com.thestrikem;

import com.thestrikem.participant.Participant;

import java.util.ArrayList;
import java.util.Random;

public class Team<T extends Participant> {
    private String name;
    private ArrayList<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addParticipant(T participant) {
        this.participants.add(participant);
    }

    public String play(Team<T> team) {
        String winner = team.getName();
        if (new Random().nextInt(2) == 0) { winner = this.name; }
        return winner;
    }

    public void playWithLog(Team<T> team) {
        System.out.println(String.format("Происходит игра... Выигрывает команда: %s", this.play(team)));
    }

    public String getName() {
        return name;
    }
}
