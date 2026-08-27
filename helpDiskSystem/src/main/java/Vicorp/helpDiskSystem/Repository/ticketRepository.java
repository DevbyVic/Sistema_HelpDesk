package Vicorp.helpDiskSystem.Repository;

import Vicorp.helpDiskSystem.Entity.ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ticketRepository extends JpaRepository<ticket, Long> {
}
