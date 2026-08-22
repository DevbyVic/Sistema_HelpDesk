package Vicorp.helpDiskSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import Vicorp.helpDiskSystem.Service.userService;
import Vicorp.helpDiskSystem.Entity.users;
import java.util.List;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/users")
public class userController {
    private final userService UserService;

    public userController(userService userService) {
        UserService = userService;
    }

    @GetMapping
    public List<users> listar() {
        return UserService.listarTodos();
    }

    @GetMapping("/{id}")
    public users buscarUsuarioId(@PathVariable Long id) {
        return UserService.buscarUsuarioId(id);
    }

    @PostMapping
    public users criarUsuario(@RequestBody users usuario){
        return UserService.criarUsuario(usuario);
    }

    @DeleteMapping("/{id}")
    public void deletarUsuarioId(@PathVariable Long id) {
        UserService.deletarUsuarioId(id);
    }

    @PutMapping("/{id}")
    public users atualizarUsuario(
        @PathVariable Long id,
        @RequestBody users usuarioAtualizado) {
    return UserService.atualizarUsuario(id, usuarioAtualizado);
}
}
