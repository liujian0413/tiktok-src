package com.graphic.RNCanvas;

import java.util.Stack;

public class CanvasDrawingStateManager {
    private final Stack<CanvasDrawingState> states = new Stack<>();

    public void restore() {
        this.states.pop();
    }

    public void save() {
        setUpNewState(getCurrentState());
    }

    private void setUpNewState() {
        this.states.push(new CanvasDrawingState());
    }

    public CanvasDrawingState getCurrentState() {
        return (CanvasDrawingState) this.states.peek();
    }

    public void reset() {
        this.states.clear();
        setUpNewState();
    }

    private void setUpNewState(CanvasDrawingState canvasDrawingState) {
        this.states.push(new CanvasDrawingState(canvasDrawingState));
    }
}
