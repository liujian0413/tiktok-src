package com.p280ss.android.agilelogger;

import com.p280ss.android.agilelogger.ALog.MMAP_STATE;

/* renamed from: com.ss.android.agilelogger.AgileDelegate */
public class AgileDelegate {

    /* renamed from: a */
    private long f51786a;

    private native void asyncFlush(long j);

    private native void changeLogPath(long j, boolean z);

    private native long getAlogFuncAddr();

    private native long getFlushFuncAddr();

    private native long getFlushV2FuncAddr();

    private native long getLogStoreDirFuncAddr();

    private static native long init(String str, int i, String str2, String str3, int i2, boolean z, boolean z2, int i3, int i4);

    private native int initState(long j);

    private native void release(long j);

    private native void write(long j, String str);

    /* renamed from: d */
    public final long mo50869d() {
        return getAlogFuncAddr();
    }

    /* renamed from: e */
    public final long mo50870e() {
        return getFlushV2FuncAddr();
    }

    /* renamed from: f */
    public final long mo50871f() {
        return getLogStoreDirFuncAddr();
    }

    /* renamed from: a */
    public final void mo50864a() {
        if (this.f51786a != 0) {
            try {
                asyncFlush(this.f51786a);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo50867b() {
        if (this.f51786a != 0) {
            try {
                release(this.f51786a);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    public final MMAP_STATE mo50868c() {
        if (this.f51786a == 0) {
            return MMAP_STATE.NOT_INIT;
        }
        try {
            if (initState(this.f51786a) == 1) {
                return MMAP_STATE.USING_MMAP;
            }
            return MMAP_STATE.USING_CACHE;
        } catch (Throwable unused) {
            return MMAP_STATE.FATAL_ERROR;
        }
    }

    /* renamed from: a */
    public final void mo50865a(String str) {
        if (this.f51786a != 0) {
            try {
                write(this.f51786a, str);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo50866a(boolean z) {
        if (this.f51786a != 0) {
            changeLogPath(this.f51786a, z);
        }
    }

    public AgileDelegate(String str, int i, String str2, String str3, int i2, boolean z, boolean z2, int i3, int i4) {
        try {
            this.f51786a = init(str, i, str2, str3, i2, z, z2, i3, i4);
        } catch (Throwable unused) {
        }
    }
}
