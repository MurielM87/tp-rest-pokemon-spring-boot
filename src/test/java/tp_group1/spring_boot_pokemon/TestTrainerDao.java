package tp_group1.spring_boot_pokemon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tp_group1.spring_boot_pokemon.dao.TrainerDao;
import tp_group1.spring_boot_pokemon.model.Trainer;

@SpringBootTest
public class TestTrainerDao {
    @Autowired
    private TrainerDao trainerDao;

    @Test
    public void testSaveTrainer() {
        Trainer trainer1 = new Trainer(null, "Ivy", "12", 100);
        trainerDao.save(trainer1);
        Assertions.assertEquals(1,trainer1.getId());

    }
}
