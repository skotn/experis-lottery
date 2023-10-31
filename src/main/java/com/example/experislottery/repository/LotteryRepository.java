package com.example.experislottery.repository;

import com.example.experislottery.models.Lottery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LotteryRepository extends JpaRepository<Lottery, Long> { }