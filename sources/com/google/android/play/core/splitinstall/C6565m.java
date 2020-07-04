package com.google.android.play.core.splitinstall;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.android.play.core.splitinstall.m */
public final class C6565m {

    /* renamed from: a */
    private final Map<String, Map<String, String>> f18885a;

    private C6565m(Map<String, Map<String, String>> map) {
        this.f18885a = map;
    }

    /* synthetic */ C6565m(Map map, byte b) {
        this(map);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Map<String, Set<String>> mo15930a(Collection<String> collection) {
        Set set;
        HashMap hashMap = new HashMap();
        for (String str : this.f18885a.keySet()) {
            if (!this.f18885a.containsKey(str)) {
                set = Collections.emptySet();
            } else {
                HashSet hashSet = new HashSet();
                for (Entry entry : ((Map) this.f18885a.get(str)).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        hashSet.add((String) entry.getValue());
                    }
                }
                set = Collections.unmodifiableSet(hashSet);
            }
            hashMap.put(str, set);
        }
        return hashMap;
    }
}
