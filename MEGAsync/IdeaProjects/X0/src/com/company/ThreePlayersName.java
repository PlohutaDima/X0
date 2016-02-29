package com.company;


public class ThreePlayersName extends TwoPlayersName {

    private final String player3Name;

    public ThreePlayersName(final String player1Name, final String player2Name, final String player3Name) {
        super(player1Name,player2Name);
        this.player3Name = player3Name;
    }

    public void printPlayer3Name(){
        System.out.println(this.player3Name);
    }
}
