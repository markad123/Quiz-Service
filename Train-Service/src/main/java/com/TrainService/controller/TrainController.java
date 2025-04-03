package com.TrainService.controller;
import com.TrainService.entities.Train;
import com.TrainService.services.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trains")
public class TrainController {

    @Autowired
    private TrainService trainService;

    @GetMapping
    public List<Train> getAllTrains() {
        return trainService.getAllTrains();
    }

    @GetMapping("/{id}")
    public Train getTrainById(@PathVariable Long id) {
        return trainService.getTrainById(id);
    }

    @PostMapping
    public Train createTrain(@RequestBody Train train) {
        return trainService.createTrain(train);
    }
}
