package com.Irctc.entities;


import java.util.Date;

public class Ticket {

    private Long ticketId;
    private Long userId;
    private String source;
    private Train train;
    private int seatNumber;
    private String status; // BOOKED, CANCELLED
    private Date dateOfTravel;

    public Ticket(Long ticketId, Long userId, String source, Train train, int seatNumber, String status, Date dateOfTravel) {
        this.ticketId = ticketId;
        this.userId = userId;
        this.source = source;
        this.train = train;
        this.seatNumber = seatNumber;
        this.status = status;
        this.dateOfTravel = dateOfTravel;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDateOfTravel() {
        return dateOfTravel;
    }

    public void setDateOfTravel(Date dateOfTravel) {
        this.dateOfTravel = dateOfTravel;
    }
}
