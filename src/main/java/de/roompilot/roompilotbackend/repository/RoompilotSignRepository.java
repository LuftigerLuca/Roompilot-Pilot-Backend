package de.roompilot.roompilotbackend.repository;

import de.roompilot.roompilotbackend.model.RoompilotSign;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Table(name = "roompilot_signs")
public interface RoompilotSignRepository extends JpaRepository<RoompilotSign, Integer> {
}
