package com.erumanifestation.meccg_spring.model.state;

import com.erumanifestation.meccg_spring.model.GameContext;

public interface GameState {
    void enterState(GameContext context);
    void execute(GameContext context);
    void exitState(GameContext context);
}