/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package votingsystem;
import java.util.*;
/**
 *
 * @author Vinit Rao
 */
public class Winner {
    private List<Candidate> winners;

    public Winner(List<Candidate> candidates) {
        this.winners = new ArrayList<>();
        int maxVotes = Integer.MIN_VALUE;
        for (Candidate candidate : candidates) {
            if (candidate.getVotes() > maxVotes) {
                this.winners.clear();
                this.winners.add(candidate);
                maxVotes = candidate.getVotes();
            } else if (candidate.getVotes() == maxVotes) {
                this.winners.add(candidate);
            }
        }
    }

    public List<Candidate> getWinners() {
        return winners;
    }
}
