package com.facebook.jni;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapIteratorHelper {
    private final Iterator<Entry> mIterator;
    private Object mKey;
    private Object mValue;

    /* access modifiers changed from: 0000 */
    public boolean hasNext() {
        if (this.mIterator.hasNext()) {
            Entry entry = (Entry) this.mIterator.next();
            this.mKey = entry.getKey();
            this.mValue = entry.getValue();
            return true;
        }
        this.mKey = null;
        this.mValue = null;
        return false;
    }

    public MapIteratorHelper(Map map) {
        this.mIterator = map.entrySet().iterator();
    }
}
