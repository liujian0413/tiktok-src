package com.facebook.react.uimanager.layoutanimation;

enum LayoutAnimationType {
    CREATE("create"),
    UPDATE("update"),
    DELETE("delete");
    
    private final String mName;

    public final String toString() {
        return this.mName;
    }

    private LayoutAnimationType(String str) {
        this.mName = str;
    }
}
