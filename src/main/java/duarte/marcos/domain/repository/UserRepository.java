package duarte.marcos.domain.repository;

import duarte.marcos.domain.model.Alunos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <Alunos, Long>{

    boolean existsByCarteirinhaNumber(String accountNumber);
}
