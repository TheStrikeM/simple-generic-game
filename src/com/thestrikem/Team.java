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

    private void getParticipantCongratulations(ArrayList<T> participants) {
        for (T participant : participants) {
            System.out.println(participant.getCongratulation());
        }
    }

    public Team<T> play(Team<T> team) {
        Team<T> winner = team;
        if (new Random().nextInt(2) == 0) { winner = this; }
        return winner;
    }

    public void playWithLog(Team<T> team) {
        Team<T> winner = this.play(team);
        System.out.println(String.format("Происходит игра... Выигрывает команда: %s", winner.getName()));
        this.getParticipantCongratulations(winner.getParticipants());
    }

    public String getName() {
        return name;
    }

    public ArrayList<T> getParticipants() {
        return participants;
    }
}
