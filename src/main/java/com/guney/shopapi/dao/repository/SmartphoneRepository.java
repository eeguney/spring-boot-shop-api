package com.guney.shopapi.dao.repository;

import com.guney.shopapi.entity.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmartphoneRepository extends JpaRepository<Smartphone, Integer> {
}
