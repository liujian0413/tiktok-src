package com.iab.omid.library.bytedance.adsession.video;

public enum Position {
    PREROLL("preroll"),
    MIDROLL("midroll"),
    POSTROLL("postroll"),
    STANDALONE("standalone");
    
    private final String position;

    private Position(String str) {
        this.position = str;
    }

    public final String toString() {
        return this.position;
    }
}
