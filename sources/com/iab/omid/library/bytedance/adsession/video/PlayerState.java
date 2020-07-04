package com.iab.omid.library.bytedance.adsession.video;

public enum PlayerState {
    MINIMIZED("minimized"),
    COLLAPSED("collapsed"),
    NORMAL("normal"),
    EXPANDED("expanded"),
    FULLSCREEN("fullscreen");
    
    private final String playerState;

    private PlayerState(String str) {
        this.playerState = str;
    }

    public final String toString() {
        return this.playerState;
    }
}
