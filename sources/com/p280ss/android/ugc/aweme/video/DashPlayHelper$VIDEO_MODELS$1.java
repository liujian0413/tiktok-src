package com.p280ss.android.ugc.aweme.video;

import com.p280ss.ttvideoengine.p1812e.C46083h;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.video.DashPlayHelper$VIDEO_MODELS$1 */
public final class DashPlayHelper$VIDEO_MODELS$1 extends LinkedHashMap<String, C46083h> {
    DashPlayHelper$VIDEO_MODELS$1() {
    }

    public final Set<Entry<String, C46083h>> entrySet() {
        return getEntries();
    }

    public final Set getEntries() {
        return super.entrySet();
    }

    public final Set getKeys() {
        return super.keySet();
    }

    public final int getSize() {
        return super.size();
    }

    public final Collection getValues() {
        return super.values();
    }

    public final Set<String> keySet() {
        return getKeys();
    }

    public final int size() {
        return getSize();
    }

    public final Collection<C46083h> values() {
        return getValues();
    }

    public final /* bridge */ boolean containsKey(String str) {
        return super.containsKey(str);
    }

    public final /* bridge */ boolean containsValue(C46083h hVar) {
        return super.containsValue(hVar);
    }

    public final /* bridge */ C46083h get(String str) {
        return (C46083h) super.get(str);
    }

    public final /* bridge */ C46083h remove(String str) {
        return (C46083h) super.remove(str);
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return containsKey((String) obj);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof C46083h)) {
            return false;
        }
        return containsValue((C46083h) obj);
    }

    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    public final /* bridge */ Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Entry<String, C46083h> entry) {
        if (size() > 50) {
            return true;
        }
        return false;
    }

    public final /* bridge */ C46083h getOrDefault(String str, C46083h hVar) {
        return (C46083h) super.getOrDefault(str, hVar);
    }

    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof String)) {
            return obj2;
        }
        return getOrDefault((String) obj, (C46083h) obj2);
    }

    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof String) || !(obj2 instanceof C46083h)) {
            return false;
        }
        return remove((String) obj, (C46083h) obj2);
    }

    public final /* bridge */ boolean remove(String str, C46083h hVar) {
        return super.remove(str, hVar);
    }
}
