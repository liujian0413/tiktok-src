package com.google.common.collect;

import com.google.common.base.C17439m;

/* renamed from: com.google.common.collect.v */
final class C18053v {
    /* renamed from: a */
    static void m59703a(boolean z) {
        C17439m.m57982b(z, (Object) "no calls to next() since the last call to remove()");
    }

    /* renamed from: a */
    static int m59700a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    static void m59704b(int i, String str) {
        if (i <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" must be positive but was: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    static long m59701a(long j, String str) {
        if (j >= 0) {
            return j;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    static void m59702a(Object obj, Object obj2) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder("null key in entry: null=");
            sb.append(obj2);
            throw new NullPointerException(sb.toString());
        } else if (obj2 == null) {
            StringBuilder sb2 = new StringBuilder("null value in entry: ");
            sb2.append(obj);
            sb2.append("=null");
            throw new NullPointerException(sb2.toString());
        }
    }
}
