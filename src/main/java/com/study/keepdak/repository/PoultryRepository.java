package com.study.keepdak.repository;

import com.study.keepdak.domain.Poultry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PoultryRepository extends JpaRepository<Poultry, Long> {
}
