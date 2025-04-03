package com.TicketService.entities;
import jakarta.persistence.*;
import java.util.Date;


@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketId;
    private Long userId;
    private Long trainId;

    private String source;
    private int seatNumber;
    private String status; // BOOKED, CANCELLED
    private Date dateOfTravel;

    public Ticket() {
    }

    public Ticket(Long ticketId, Long userId, Long trainId, String source, int seatNumber, String status, Date dateOfTravel) {
        this.ticketId = ticketId;
        this.userId = userId;
        this.trainId = trainId;
        this.source = source;
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

    public Long getTrainId() {
        return trainId;
    }

    public void setTrainId(Long trainId) {
        this.trainId = trainId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
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
