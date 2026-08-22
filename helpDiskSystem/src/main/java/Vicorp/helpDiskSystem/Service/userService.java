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

    public void deletarUsuarioId(Long id) {
        UserRepository.deleteById(id);
    }

    public users buscarUsuarioId(Long id) {
        return UserRepository.findById(id).orElse(null);
    }

    public users atualizarUsuario(Long id, users usuarioAtualizado) {
        users usuarioExistente = UserRepository.findById(id).orElse(null);
        if (usuarioExistente != null) {
            usuarioExistente.setNome(usuarioAtualizado.getNome());
            usuarioExistente.setEmail(usuarioAtualizado.getEmail());
            // Atualize outros campos conforme necessário
            return UserRepository.save(usuarioExistente);
        }
        return null; // Retorna null se o usuário não for encontrado
    }
}
