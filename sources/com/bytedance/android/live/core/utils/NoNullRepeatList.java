package com.bytedance.android.live.core.utils;

import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;

public class NoNullRepeatList<T> extends CopyOnWriteArrayList<T> {
    public boolean add(T t) {
        if (t != null && !contains(t)) {
            return super.add(t);
        }
        return false;
    }

    public boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        return super.remove(obj);
    }

    public boolean addAll(Collection<? extends T> collection) {
        for (Object add : collection) {
            add(add);
        }
        return true;
    }
}
