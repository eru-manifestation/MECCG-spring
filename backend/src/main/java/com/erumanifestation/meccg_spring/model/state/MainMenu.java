package com.erumanifestation.meccg_spring.model.state;

import com.erumanifestation.meccg_spring.model.GameContext;

public class MainMenu implements GameState {

    @Override
    public void enterState(GameContext context) {
        System.out.println("Entering Main Menu...");
    }

    @Override
    public void execute(GameContext context) {
        System.out.println("Waiting for the player to start the game...");
        // Transition to PlayerTurnState when the player starts the game
        context.setState(new PlayerTurn());
    }

    @Override
    public void exitState(GameContext context) {
        System.out.println("Exiting Main Menu...");
    }
}