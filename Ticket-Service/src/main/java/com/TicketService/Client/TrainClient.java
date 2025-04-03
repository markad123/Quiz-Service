package com.TicketService.Client;

import com.TicketService.entities.Train;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name ="train-service")
public interface TrainClient {

    @GetMapping("trains/{id}")
    Train getTrainById(@PathVariable Long id);

}
