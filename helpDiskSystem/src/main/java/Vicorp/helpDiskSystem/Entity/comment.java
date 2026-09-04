package Vicorp.helpDiskSystem.Entity;

import jakarta.annotation.Generated;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "comment")
public class comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "ticket_Id", nullable = false)
    private ticket Ticket;

    @ManyToOne
    @JoinColumn(name = "author_Id", nullable = false)
    private users user;

    private String message;
    private LocalDateTime createdAt;
}
