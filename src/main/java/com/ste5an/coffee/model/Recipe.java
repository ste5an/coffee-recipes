package com.ste5an.coffee.model;

public class Recipe {

    private int id;
    private int grinderSettings;
    private int gramsOfCoffee;
    private int timeOfExtraction;
    private int gramsOfLiquid;
    private String comments;

    public Recipe() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrinderSettings() {
        return grinderSettings;
    }

    public void setGrinderSettings(int grinderSettings) {
        this.grinderSettings = grinderSettings;
    }

    public int getGramsOfCoffee() {
        return gramsOfCoffee;
    }

    public void setGramsOfCoffee(int gramsOfCoffee) {
        this.gramsOfCoffee = gramsOfCoffee;
    }

    public int getTimeOfExtraction() {
        return timeOfExtraction;
    }

    public void setTimeOfExtraction(int timeOfExtraction) {
        this.timeOfExtraction = timeOfExtraction;
    }

    public int getGramsOfLiquid() {
        return gramsOfLiquid;
    }

    public void setGramsOfLiquid(int gramsOfLiquid) {
        this.gramsOfLiquid = gramsOfLiquid;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
