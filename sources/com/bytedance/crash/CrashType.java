package com.bytedance.crash;

public enum CrashType {
    LAUNCH("launch"),
    JAVA("java"),
    NATIVE("native"),
    ANR("anr"),
    BLOCK("block"),
    ENSURE("ensure"),
    DART("dart"),
    CUSTOM_JAVA("custom_java"),
    OOM("oom"),
    ALL("all");
    
    private String mName;

    public final String getName() {
        return this.mName;
    }

    private CrashType(String str) {
        this.mName = str;
    }
}
