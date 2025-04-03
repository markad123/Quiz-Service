package com.Irctc.services;

import com.Irctc.client.TicketClient;
import com.Irctc.entities.Ticket;
import com.Irctc.entities.User;
import com.Irctc.exception.UserNotFoundException;
import com.Irctc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TicketClient ticketClient;

    public User createUser(User user){
        return userRepository.save(user);
    }

    public Map<String, Object> getUserWithTickets(Long userId) {
        // Step 1: Fetch User Details
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        // Step 2: Fetch User's Tickets from TicketService
        List<Ticket> tickets = ticketClient.getTicketsByUserId(userId);

        // Step 3: Create Response
        Map<String, Object> response = new HashMap<>();
        response.put("user", user);
        response.put("tickets", tickets);

        return response;
    }

    public User getUserById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException("User not found with ID: " + userId));
    }
}
