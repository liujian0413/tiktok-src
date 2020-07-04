package com.google.common.collect;

import com.google.common.base.C17439m;
import java.util.Collection;

/* renamed from: com.google.common.collect.ce */
public final class C17892ce {
    /* renamed from: a */
    static Object[] m59447a(Object... objArr) {
        return m59450b(objArr, objArr.length);
    }

    /* renamed from: a */
    static Object[] m59445a(Collection<?> collection) {
        return m59444a((Iterable<?>) collection, new Object[collection.size()]);
    }

    /* renamed from: b */
    static Object[] m59450b(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m59443a(objArr[i2], i2);
        }
        return objArr;
    }

    /* renamed from: a */
    static Object m59443a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    /* renamed from: a */
    private static Object[] m59444a(Iterable<?> iterable, Object[] objArr) {
        int i = 0;
        for (Object obj : iterable) {
            int i2 = i + 1;
            objArr[i] = obj;
            i = i2;
        }
        return objArr;
    }

    /* renamed from: a */
    static <T> T[] m59446a(Collection<?> collection, T[] tArr) {
        int size = collection.size();
        if (tArr.length < size) {
            tArr = m59448a(tArr, size);
        }
        m59444a((Iterable<?>) collection, (Object[]) tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    /* renamed from: a */
    public static <T> T[] m59448a(T[] tArr, int i) {
        return C17898cj.m59508a(tArr, i);
    }

    /* renamed from: a */
    static <T> T[] m59449a(Object[] objArr, int i, int i2, T[] tArr) {
        C17439m.m57967a(0, i2 + 0, objArr.length);
        if (tArr.length < i2) {
            tArr = m59448a(tArr, i2);
        } else if (tArr.length > i2) {
            tArr[i2] = null;
        }
        System.arraycopy(objArr, 0, tArr, 0, i2);
        return tArr;
    }
}
