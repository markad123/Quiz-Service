package com.TicketService.entities;

public class Train {
    private Long trainId;

    public Train(Long trainId) {
        this.trainId = trainId;
    }

    public Long getTrainId() {
        return trainId;
    }

    public void setTrainId(Long trainId) {
        this.trainId = trainId;
    }
}
