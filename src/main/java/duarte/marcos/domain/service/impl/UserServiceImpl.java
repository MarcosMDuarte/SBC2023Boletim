package duarte.marcos.domain.service.impl;

import duarte.marcos.domain.model.Alunos;
import duarte.marcos.domain.repository.UserRepository;
import duarte.marcos.domain.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public Alunos findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Alunos create(Alunos alunosToCreate) {
        if(userRepository.existsByCarteirinhaNumber(alunosToCreate.getCarteirinha().getNumber())){
            throw new IllegalArgumentException("Numero de matrícula já existente.");
        }
        return userRepository.save(alunosToCreate);
    }
}
