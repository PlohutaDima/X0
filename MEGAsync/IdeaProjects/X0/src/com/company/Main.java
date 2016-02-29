package com.company;

public class Main {

    public static void main(String[] args) {

        final Game game = new Game();
        Game.printGameName();
        final TwoPlayersName twoPlayersName = new TwoPlayersName("Oleg","Dima");
        twoPlayersName.printPlayer1Name();
        twoPlayersName.printPlayer2Name();
        Game.printGameName();

        final ThreePlayersName threePlayersName = new ThreePlayersName("Oleg","Dima","Nestor");
        twoPlayersName.printPlayer1Name();
        twoPlayersName.printPlayer2Name();
        threePlayersName.printPlayer3Name();
        Game.printGameName();

    }
    public static void printGameNameAndBoard()
    {
        final Board board = new Board();
        Game.printGameName();
        board.printBoard();
    }
}
