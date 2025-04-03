package com.Irctc.client;

import com.Irctc.entities.Ticket;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="ticket-service")
public interface TicketClient {

    @GetMapping("/ticket/user/{userId}")
    List<Ticket> getTicketsByUserId(@PathVariable Long userId) ;

}
