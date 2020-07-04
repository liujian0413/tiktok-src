package com.p280ss.android.ugc.aweme.base.utils;

import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.base.utils.d */
public final class C23477d {
    /* renamed from: a */
    public static <T> boolean m77081a(Collection<T> collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static <T> boolean m77083b(Collection<T> collection) {
        if (collection == null || collection.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static <T> boolean m77082a(T[] tArr) {
        if (tArr == null || tArr.length == 0) {
            return true;
        }
        return false;
    }
}
