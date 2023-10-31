package com.example.experislottery.controller;

import com.example.experislottery.models.Lottery;
import com.example.experislottery.service.LotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lottery")
public class LotteryController {

    @Autowired
    LotteryService lotteryService;

    @GetMapping("/{id}")
    public ResponseEntity<Lottery> getLotteryById(@PathVariable("id") Long id) {
        Lottery lottery = lotteryService.getLotteryById(id);
        if (lottery != null) {
            return ResponseEntity.ok(lottery);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<Lottery>> getAllLotteries() {
        return new ResponseEntity<>(lotteryService.getAllLotteries(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Lottery> createLottery(@RequestParam String name) {
        Lottery lottery = lotteryService.createLottery(name);
        return new ResponseEntity<>(lottery, HttpStatus.CREATED);
    }

}
