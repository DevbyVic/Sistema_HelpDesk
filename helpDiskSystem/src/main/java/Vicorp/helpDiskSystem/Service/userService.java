package Vicorp.helpDiskSystem.Service;
import Vicorp.helpDiskSystem.Repository.userRepository;
import Vicorp.helpDiskSystem.Entity.users;
import org.springframework.stereotype.Service;
import java.awt.*;
import java.util.List;

@Service
public class userService {

    private final userRepository UserRepository;

    public userService(userRepository UserRepository) {
        this.UserRepository = UserRepository;
    }

    public List<users> listarTodos() {
    return UserRepository.findAll();
    }

    public users criarUsuario(users usuario){
        return UserRepository.save(usuario);
    }
}