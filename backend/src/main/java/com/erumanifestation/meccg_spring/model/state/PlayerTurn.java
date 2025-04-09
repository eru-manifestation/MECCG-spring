package com.erumanifestation.meccg_spring.model.state;

import com.erumanifestation.meccg_spring.model.GameContext;

public class PlayerTurn implements GameState {

    @Override
    public void enterState(GameContext context) {
        System.out.println("Entering Player Turn...");
    }

    @Override
    public void execute(GameContext context) {
        System.out.println("Player's turn is in progress...");
        // Logic for player's turn goes here
        // Transition to the next state when the turn is over
    }

    @Override
    public void exitState(GameContext context) {
        System.out.println("Exiting Player Turn...");
    }

}
