package com.bytedance.scene;

public enum State {
    NONE(0, "NONE"),
    VIEW_CREATED(1, "VIEW_CREATED"),
    ACTIVITY_CREATED(2, "ACTIVITY_CREATED"),
    STARTED(3, "STARTED"),
    RESUMED(4, "RESUMED");
    
    public final String name;
    public final int value;

    public final String getName() {
        return this.name;
    }

    private State(int i, String str) {
        this.value = i;
        this.name = str;
    }
}
