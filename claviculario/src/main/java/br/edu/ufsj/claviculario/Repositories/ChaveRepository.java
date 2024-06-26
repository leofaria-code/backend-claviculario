package br.edu.ufsj.claviculario.Repositories;

import br.edu.ufsj.claviculario.Models.Chave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChaveRepository extends JpaRepository<Chave, Long> {
    Chave findChaveByNome(String nome);

}
