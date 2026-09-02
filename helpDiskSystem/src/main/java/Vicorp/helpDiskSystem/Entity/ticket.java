package Vicorp.helpDiskSystem.Entity;

import Vicorp.helpDiskSystem.Entity.users;
import Vicorp.helpDiskSystem.Enums.*;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "ticket")
public class ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
private users customer;

    @ManyToOne
    @JoinColumn(name = "agent_id", nullable = false)
private users agent;

    private String titulo;
    private String descrição;
    private Status status;
    private Prioridade prioridade;
    private LocalDateTime creadAt;

    public ticket(LocalDateTime creadAt, Prioridade prioridade, Status status, String descrição, String titulo, users agent, users customer, Long id) {
        this.creadAt = creadAt;
        this.prioridade = prioridade;
        this.status = status;
        this.descrição = descrição;
        this.titulo = titulo;
        this.agent = agent;
        this.customer = customer;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public users getCustomer() {
        return customer;
    }

    public void setCustomer(users customer) {
        this.customer = customer;
    }

    public users getAgent() {
        return agent;
    }

    public void setAgent(users agent) {
        this.agent = agent;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public LocalDateTime getCreadAt() {
        return creadAt;
    }

    public void setCreadAt(LocalDateTime creadAt) {
        this.creadAt = creadAt;
    }
}
