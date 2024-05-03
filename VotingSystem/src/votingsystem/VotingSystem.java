/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package votingsystem;
import java.util.*;
/**
 *
 * @author Vinit Rao
 */
public class VotingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of candidates: ");
        int numCandidates = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        List<Candidate> candidates = new ArrayList<>();
        for (int i = 1; i <= numCandidates; i++) {
            System.out.print("Enter the name of candidate " + i + ": ");
            String name = scanner.nextLine();
            candidates.add(new Candidate(i, name));
        }

        System.out.println("\nCandidates:");
        for (Candidate candidate : candidates) {
            System.out.println(candidate.getId() + ". " + candidate.getName());
        }

        List<Vote> votes = new ArrayList<>();
        int voteId;
        do {
            System.out.print("Enter the ID of the candidate you want to vote for (or enter 0 to stop): ");
            voteId = scanner.nextInt();
            if (voteId != 0) {
                votes.add(new Vote(voteId));
                candidates.get(voteId - 1).incrementVotes();
                System.out.println("Vote registered for Candidate " + voteId);
            }
        } while (voteId != 0);

        System.out.println("\nWinners:");
        Winner winner = new Winner(candidates);
        for (Candidate winningCandidate : winner.getWinners()) {
            System.out.println(winningCandidate);
        }

        scanner.close();
    }
    
}
