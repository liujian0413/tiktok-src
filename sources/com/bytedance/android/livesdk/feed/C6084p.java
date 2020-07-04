package com.bytedance.android.livesdk.feed;

import java.util.List;

/* renamed from: com.bytedance.android.livesdk.feed.p */
public final class C6084p<T> implements C6039l<T> {
    /* renamed from: a */
    private static boolean m18969a(T t, T t2) {
        if (t == null && t2 == null) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return t.equals(t2);
    }

    /* renamed from: a */
    public final boolean mo14694a(List<T> list, List<T> list2) {
        if ((list == null && list2 == null) || list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!m18969a((T) list.get(i), (T) list2.get(i))) {
                return false;
            }
        }
        return true;
    }
}
