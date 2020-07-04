package com.google.i18n.phonenumbers.internal;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.regex.Pattern;

public class RegexCache {
    private LRUCache<String, Pattern> cache;

    static class LRUCache<K, V> {
        private LinkedHashMap<K, V> map;
        public int size;

        public synchronized boolean containsKey(K k) {
            return this.map.containsKey(k);
        }

        public synchronized V get(K k) {
            return this.map.get(k);
        }

        public LRUCache(int i) {
            this.size = i;
            this.map = new LinkedHashMap<K, V>(((i * 4) / 3) + 1, 0.75f, true) {
                /* access modifiers changed from: protected */
                public boolean removeEldestEntry(Entry<K, V> entry) {
                    if (size() > LRUCache.this.size) {
                        return true;
                    }
                    return false;
                }
            };
        }

        public synchronized void put(K k, V v) {
            this.map.put(k, v);
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean containsRegex(String str) {
        return this.cache.containsKey(str);
    }

    public RegexCache(int i) {
        this.cache = new LRUCache<>(i);
    }

    public Pattern getPatternForRegex(String str) {
        Pattern pattern = (Pattern) this.cache.get(str);
        if (pattern != null) {
            return pattern;
        }
        Pattern compile = Pattern.compile(str);
        this.cache.put(str, compile);
        return compile;
    }
}
