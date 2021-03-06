package com.company.view;


import com.company.controller.Game;

public class ConsoleView {

    private final Game game;

    public ConsoleView(final Game game) {
        this.game = game;
    }

    public void showGameName()
    {
        System.out.println(game.getGameName());
    }

    public void showPlayerName()
    {
        System.out.println(game.getPlayers());
    }
}

