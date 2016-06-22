package main.repository;

import main.domain.Hello;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloDao extends JpaRepository<Hello, Integer> {
}

