package com.Irctc.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trainId;

    private Long trainName;

    private List<Integer> seats;

    private Map<String, Time> stationTimes;

    private List<String> stations;

    public Train(Long trainId, Long trainName, List<Integer> seats, Map<String, Time> stationTimes, List<String> stations) {
        this.trainId = trainId;
        this.trainName = trainName;
        this.seats = seats;
        this.stationTimes = stationTimes;
        this.stations = stations;
    }

    public Long getTrainId() {
        return trainId;
    }

    public void setTrainId(Long trainId) {
        this.trainId = trainId;
    }

    public Long getTrainNumber() {
        return trainName;
    }

    public void setTrainNumber(Long trainNumber) {
        this.trainName = trainNumber;
    }

    public List<Integer> getSeats() {
        return seats;
    }

    public void setSeats(List<Integer> seats) {
        this.seats = seats;
    }

    public Map<String, Time> getStationTimes() {
        return stationTimes;
    }

    public void setStationTimes(Map<String, Time> stationTimes) {
        this.stationTimes = stationTimes;
    }

    public List<String> getStations() {
        return stations;
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }
}
