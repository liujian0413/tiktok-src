package com.iab.omid.library.bytedance.adsession;

public enum Owner {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE("none");
    
    private final String owner;

    private Owner(String str) {
        this.owner = str;
    }

    public final String toString() {
        return this.owner;
    }
}
