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
public class Candidate {
    private int id;
    private String name;
    private int votes;

    public Candidate(int id, String name) {
        this.id = id;
        this.name = name;
        this.votes = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getVotes() {
        return votes;
    }

    public void incrementVotes() {
        this.votes++;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Votes: " + votes;
    }
}
