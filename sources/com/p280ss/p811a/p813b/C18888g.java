package com.p280ss.p811a.p813b;

/* renamed from: com.ss.a.b.g */
public final class C18888g {
    /* renamed from: a */
    public static String m61655a(String str) {
        return (str == null || str.length() <= 0) ? "" : str.trim().replace('\'', ' ').replace('\"', ' ').replace(13, ' ').replace(10, ' ');
    }
}
