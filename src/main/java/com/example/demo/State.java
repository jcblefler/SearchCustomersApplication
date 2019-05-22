package com.example.demo;


import javax.persistence.*;

@Entity
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long stateID;

    @Column(name = "State")
    private String state;

    public long getStateID() {
        return stateID;
    }

    public void setStateID(long stateID) {
        this.stateID = stateID;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public State() {
    }
}
