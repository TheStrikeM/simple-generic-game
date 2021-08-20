package com.thestrikem;

import com.thestrikem.participant.*;

public class Main {
    public static void main(String[] args) {
        Team<Scholar> scholarTeam1 = new Team<>("Бабочки");
        scholarTeam1.addParticipant(new Scholar("Генадий", 10));
        scholarTeam1.addParticipant(new Scholar("Горнослав", 12));

        Team<Scholar> scholarTeam2 = new Team<>("Бегемоты");
        scholarTeam2.addParticipant(new Scholar("Лавретний", 11));
        scholarTeam2.addParticipant(new Scholar("Иосиф", 10));

        scholarTeam1.playWithLog(scholarTeam2);
    }
}
