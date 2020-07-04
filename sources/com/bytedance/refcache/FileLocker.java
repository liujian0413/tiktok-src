package com.bytedance.refcache;

public class FileLocker {
    static native int getStatus(String str);

    static {
        C12445a.m36209a("flock-lib");
    }

    /* renamed from: a */
    public static boolean m36208a(String str) {
        if (getStatus(str) >= 0) {
            return true;
        }
        return false;
    }
}
