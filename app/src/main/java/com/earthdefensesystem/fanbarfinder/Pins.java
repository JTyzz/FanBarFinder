package com.earthdefensesystem.fanbarfinder;

public class Pins {
    private Double latitude, longitude;
    private String bar, team, sport;
    private int favorite;

    public Pins(Double latitude, Double longitude, String bar, String team, String sport, int favorite) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.bar = bar;
        this.team = team;
        this.sport = sport;
        this.favorite = favorite;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getFavorite() {
        return favorite;
    }

    public void setFavorite(int favorite) {
        this.favorite = favorite;
    }
}
