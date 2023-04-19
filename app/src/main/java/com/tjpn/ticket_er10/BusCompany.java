package com.tjpn.ticket_er10;

import java.io.Serializable;

public class BusCompany implements Serializable {
    private String name;
    private String route;
    private String time;
    private int seatNumber;
    private String destination;
    private String distance;
    private String station;
    private String fee;
    private int id;

    public BusCompany() {
    }

    public BusCompany(String name) {
        this.name = name;
    }

    public BusCompany(String route, String destination, String distance, String station, String fee) {
        this.route = route;
        this.destination = destination;
        this.distance = distance;
        this.station = station;
        this.fee = fee;
    }

    public BusCompany(String time, int id) {
        this.time = time;
        this.id = id;
    }

    public BusCompany(int seatNumber) {
        this.seatNumber = seatNumber;
    }


    public BusCompany(String name, String route, String time, int seatNumber, String destination, String distance, String station, String fee, int id) {
        this.name = name;
        this.route = route;
        this.time = time;
        this.seatNumber = seatNumber;
        this.destination = destination;
        this.distance = distance;
        this.station = station;
        this.fee = fee;
        this.id = id;
    }

    @Override
    public String toString() {
        return Integer.toString(seatNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
