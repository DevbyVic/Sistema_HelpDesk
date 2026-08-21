package Vicorp.helpDiskSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import Vicorp.helpDiskSystem.Service.userService;
import Vicorp.helpDiskSystem.Entity.users;
import java.util.List;

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

    @PostMapping
    public users criarUsuario(@RequestBody users usuario){
        return UserService.criarUsuario(usuario);
    }
}
