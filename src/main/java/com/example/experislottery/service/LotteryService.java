package com.example.experislottery.service;

import com.example.experislottery.models.Lottery;
import com.example.experislottery.repository.LotteryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LotteryService {

    private final LotteryRepository lotteryRepository;

    @Autowired
    public LotteryService(LotteryRepository lotteryRepository) {
        this.lotteryRepository = lotteryRepository;
    }

    public Lottery createLottery(String name) {
        Lottery newLottery = new Lottery(name);
        return lotteryRepository.save(newLottery);
    }

    public List<Lottery> getAllLotteries() {
        return lotteryRepository.findAll();
    }

    public Lottery getLotteryById(Long id) {
        return lotteryRepository.findById(id).orElse(null);
    }
}
