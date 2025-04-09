package com.erumanifestation.meccg_spring.model;

import com.erumanifestation.meccg_spring.model.state.GameState;

public class GameContext {

    private GameState currentState;

    public GameContext(GameState initialState) {
        this.currentState = initialState;
        this.currentState.enterState(this);
    }

    public void setState(GameState newState) {
        this.currentState.exitState(this);
        this.currentState = newState;
        this.currentState.enterState(this);
    }

    public void execute() {
        this.currentState.execute(this);
    }
}
