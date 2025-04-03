package com.TrainService.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.sql.Time;
import java.util.List;
import java.util.Map;

@Entity
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trainId;

    private String trainName;

    @ElementCollection
    @CollectionTable(name = "train_seats", joinColumns = @JoinColumn(name = "train_id"))
    @Column(name = "seat_number")
    private List<Integer> seats;

    @ElementCollection
    @CollectionTable(name = "train_stations", joinColumns = @JoinColumn(name = "train_id"))
    @Column(name = "station_name")
    private List<String> stations;

    @ElementCollection
    @CollectionTable(name = "train_station_times", joinColumns = @JoinColumn(name = "train_id"))
    @MapKeyColumn(name = "station")
    @Column(name = "arrival_time")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss")
    private Map<String, Time> stationTimes;

    public Train() {
    }

    public Train(Long trainId, String trainName, List<Integer> seats, List<String> stations, Map<String, Time> stationTimes) {
        this.trainId = trainId;
        this.trainName = trainName;
        this.seats = seats;
        this.stations = stations;
        this.stationTimes = stationTimes;
    }

    public Long getTrainId() {
        return trainId;
    }

    public void setTrainId(Long trainId) {
        this.trainId = trainId;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public List<Integer> getSeats() {
        return seats;
    }

    public void setSeats(List<Integer> seats) {
        this.seats = seats;
    }

    public List<String> getStations() {
        return stations;
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }

    public Map<String, Time> getStationTimes() {
        return stationTimes;
    }

    public void setStationTimes(Map<String, Time> stationTimes) {
        this.stationTimes = stationTimes;
    }
}
