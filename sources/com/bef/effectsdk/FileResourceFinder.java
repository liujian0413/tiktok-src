package com.bef.effectsdk;

public final class FileResourceFinder implements C1942b {

    /* renamed from: a */
    private final String f6979a;

    private static native long nativeCreateFileResourceFinder(long j, String str);

    public final void release(long j) {
    }

    public FileResourceFinder(String str) {
        this.f6979a = str;
    }

    public final long createNativeResourceFinder(long j) {
        return nativeCreateFileResourceFinder(j, this.f6979a);
    }
}
