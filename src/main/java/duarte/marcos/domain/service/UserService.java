package duarte.marcos.domain.service;

import duarte.marcos.domain.model.Alunos;

public interface UserService {

    Alunos findById(Long id);

    Alunos create(Alunos alunosToCreate);
}
