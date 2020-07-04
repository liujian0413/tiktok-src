package com.iab.omid.library.bytedance.adsession;

public enum AdSessionContextType {
    HTML("html"),
    NATIVE("native");
    
    private final String typeString;

    private AdSessionContextType(String str) {
        this.typeString = str;
    }

    public final String toString() {
        return this.typeString;
    }
}
