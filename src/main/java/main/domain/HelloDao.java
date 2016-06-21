package main.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloDao extends JpaRepository<Hello, Integer> {
}