package com.example.demo.Repository;

import com.example.demo.Models.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.LongSummaryStatistics;

public interface Repository extends JpaRepository<Animal, Long> {
}
