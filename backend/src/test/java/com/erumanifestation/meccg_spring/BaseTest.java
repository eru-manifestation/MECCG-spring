package com.erumanifestation.meccg_spring;

import org.junit.jupiter.api.BeforeAll;
import org.springframework.boot.test.context.SpringBootTest;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootTest
public abstract class BaseTest {
    // Common test configurations can be added here
    @BeforeAll
static void loadEnv() {
    Dotenv dotenv = Dotenv.load();
    System.setProperty("DATABASE_URL", dotenv.get("DATABASE_URL"));
    System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
    System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));
}

}
