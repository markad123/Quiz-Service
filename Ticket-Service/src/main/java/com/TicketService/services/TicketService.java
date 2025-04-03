package com.TicketService.services;

import com.TicketService.Client.TrainClient;

import com.TicketService.Client.UserClient;
import com.TicketService.entities.Ticket;
import com.TicketService.entities.Train;
import com.TicketService.entities.User;
import com.TicketService.exception.ResourceNotFoundException;
import com.TicketService.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private TrainClient trainClient;
    @Autowired
    private UserClient userClient;

    public Ticket createTicket(Ticket ticket) {
        // Step 1: Check if the User exists
        User userId = userClient.getUserById(ticket.getUserId());
        if (userId == null) {
            throw new RuntimeException("User not found");
        }

        // Step 2: Check if the Train exists
        Train trainId = trainClient.getTrainById(ticket.getTrainId());
        if (trainId == null) {
            throw new RuntimeException("Train not found");
        }
        return ticketRepository.save(ticket);
    }



    public Ticket getTicketById(Long ticketId) {
        return ticketRepository.findById(ticketId).orElseThrow(()->new RuntimeException("ticket not found"));

    }


    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }


    public List<Ticket> getTicketsByUserId(Long userId) {
        List<Ticket> tickets = ticketRepository.findByUserId(userId);
        if(tickets.isEmpty()) {
            throw new ResourceNotFoundException("No tickets found for User ID: " + userId);
        }
        return tickets;
    }
}
