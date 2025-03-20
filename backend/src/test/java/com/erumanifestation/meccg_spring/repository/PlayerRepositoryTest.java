package com.erumanifestation.meccg_spring.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.erumanifestation.meccg_spring.model.Player;
import com.erumanifestation.meccg_spring.BaseTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class PlayerRepositoryTest extends BaseTest {

    @Autowired
    private PlayerRepository playerRepository;

    @Test
    public void testDatabaseConnection() {
        String name="name_1";
        Player testPlayer = new Player();
        if(playerRepository.findByName(name).isPresent()){
            playerRepository.delete(playerRepository.findByName(name).get());
        }
        testPlayer.setName(name);
        playerRepository.save(testPlayer);

        Optional<Player> foundPlayer = playerRepository.findByName(name);
        assertTrue(foundPlayer.isPresent());
        assertEquals(testPlayer, foundPlayer.get());
    }
}
