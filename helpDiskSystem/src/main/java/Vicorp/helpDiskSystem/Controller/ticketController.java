package Vicorp.helpDiskSystem.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Vicorp.helpDiskSystem.Service.ticketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import Vicorp.helpDiskSystem.Entity.ticket;
import Vicorp.helpDiskSystem.Entity.users;
import Vicorp.helpDiskSystem.Enums.Status;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/tickets")
public class ticketController {
    private final ticketService TicketService;

    public ticketController(ticketService TicketService) {
        this.TicketService = TicketService;
    }

    @GetMapping()
    public List<ticket> listarTickets() {
        return TicketService.listarTodos();
    }

    @GetMapping("/{id}")
    public ticket buscarTicketId(@PathVariable Long id) {
        return TicketService.buscarTicketId(id);
    }

    @PostMapping
    public ticket criarTicket(@RequestBody ticket Ticket){
        return TicketService.criarTicket(Ticket);
    }

    @PutMapping("/{id}")
    public ticket atualizarStatusTicket(
        @PathVariable Long id,
        @RequestParam("status") Status statusAtualizado) {
        return TicketService.atualizarStatusTicket(id, statusAtualizado);
    }
}
