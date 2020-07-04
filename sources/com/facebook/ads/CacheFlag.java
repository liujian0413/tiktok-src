package com.facebook.ads;

import java.util.EnumSet;

public enum CacheFlag {
    NONE,
    ICON,
    IMAGE,
    VIDEO;
    
    public static final EnumSet<CacheFlag> ALL = null;

    static {
        ALL = EnumSet.allOf(CacheFlag.class);
    }
}
