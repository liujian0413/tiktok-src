package com.facebook.keyframes.p733b;

import com.C1642a;
import com.facebook.keyframes.model.C14035c;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: com.facebook.keyframes.b.c */
public final class C14011c {
    /* renamed from: a */
    public static boolean m41369a(List<C14035c> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Integer valueOf = Integer.valueOf(((C14035c) list.get(i)).f37060a);
            if (hashSet.contains(valueOf)) {
                return false;
            }
            hashSet.add(valueOf);
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m41370a(float[][][] fArr, int i) {
        if (i <= 1 && (fArr == null || fArr.length == 0)) {
            return true;
        }
        if (i - 1 != fArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            if (fArr[i2].length != 2) {
                return false;
            }
            for (float[] length : fArr[i2]) {
                if (length.length != 2) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static <T> T m41368a(T t, boolean z, String str) {
        if (z) {
            return t;
        }
        throw new IllegalArgumentException(C1642a.m8035a(Locale.US, "Illegal argument for %s.", new Object[]{str}));
    }
}
