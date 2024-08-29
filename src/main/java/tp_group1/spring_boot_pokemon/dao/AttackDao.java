package tp_group1.spring_boot_pokemon.dao;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import tp_group1.spring_boot_pokemon.model.Attack;

@Repository
public interface AttackDao extends CrudRepository<Attack, Long> {

//    List<Attack> findAll();
//
//    List<Attack> findByAttackNameContainingIgnoringCase(String attackName);
//
//    List<Attack> findAllByOrderByAttackNameAsc();
//
//    List<Attack> findAllByOrderByAttackNameDesc();
}
