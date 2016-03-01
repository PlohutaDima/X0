package com.company.model;

/**
 * Created by plohuta on 01.03.16.
 */
public class Player {

    private final String name;

    private final String figure;

    public Player(final String name, String figure) {
        this.name = name;
        this.figure = figure;
    }

    public String gatName() {
        return name;
    }

    public String getFigure() {
        return figure;
    }
}
