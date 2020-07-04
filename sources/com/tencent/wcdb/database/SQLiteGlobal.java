package com.tencent.wcdb.database;

import android.os.Environment;
import android.os.StatFs;

public final class SQLiteGlobal {

    /* renamed from: a */
    public static final int f119529a;

    private SQLiteGlobal() {
    }

    public static void loadLib() {
    }

    private static native int nativeReleaseMemory();

    private static native void nativeSetDefaultPageSize(int i);

    static {
        int i;
        if (!WCDBInitializationProbe.libLoaded) {
            C46421i.m145916a("wcdb");
        }
        try {
            i = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getBlockSize();
        } catch (RuntimeException unused) {
            i = 4096;
        }
        f119529a = i;
        nativeSetDefaultPageSize(i);
    }
}
