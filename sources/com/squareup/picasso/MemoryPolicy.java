package com.squareup.picasso;

public enum MemoryPolicy {
    NO_CACHE(1),
    NO_STORE(2);
    
    final int index;

    static boolean shouldReadFromMemoryCache(int i) {
        if ((i & NO_CACHE.index) == 0) {
            return true;
        }
        return false;
    }

    static boolean shouldWriteToMemoryCache(int i) {
        if ((i & NO_STORE.index) == 0) {
            return true;
        }
        return false;
    }

    private MemoryPolicy(int i) {
        this.index = i;
    }
}
