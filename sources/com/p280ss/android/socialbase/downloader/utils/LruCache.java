package com.p280ss.android.socialbase.downloader.utils;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: com.ss.android.socialbase.downloader.utils.LruCache */
public class LruCache<K, T> extends LinkedHashMap<K, T> {
    private final int mMaxSize;

    public LruCache() {
        this(4, 4);
    }

    /* access modifiers changed from: protected */
    public boolean removeEldestEntry(Entry<K, T> entry) {
        if (size() > this.mMaxSize) {
            return true;
        }
        return false;
    }

    public LruCache(int i, int i2) {
        super(i2, 0.75f, true);
        this.mMaxSize = i;
    }
}
