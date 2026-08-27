package Vicorp.helpDiskSystem.Service;

import org.springframework.stereotype.Service;
import Vicorp.helpDiskSystem.Repository.ticketRepository;
import Vicorp.helpDiskSystem.Entity.ticket;
import java.util.List;
import Vicorp.helpDiskSystem.Enums.Status;

@Service
public class ticketService {

    private final ticketRepository TicketRepository;

    public ticketService(ticketRepository TicketRepository){
        this.TicketRepository = TicketRepository;
    }

    public void criarTicket(ticket Ticket){
        TicketRepository.save(Ticket);
    }

    public List<ticket> listarTodos() {
        return TicketRepository.findAll();
    }

    public ticket atualizarStatusTicket(Long id, Status statusAtualizado) {

        ticket ticketExistente = TicketRepository.findById(id).orElse(null);
        if(ticketExistente != null){
            ticketExistente.setStatus(statusAtualizado);
            TicketRepository.save(ticketExistente);
            return ticketExistente;
        }
        return null;
    }
}
