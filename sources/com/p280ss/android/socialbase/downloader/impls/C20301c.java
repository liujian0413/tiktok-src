package com.p280ss.android.socialbase.downloader.impls;

import com.p280ss.android.socialbase.downloader.downloader.C20281h;

/* renamed from: com.ss.android.socialbase.downloader.impls.c */
public final class C20301c implements C20281h {
    /* renamed from: a */
    public final int mo51487a(long j) {
        if (j < 10485760) {
            return 1;
        }
        if (j < 52428800) {
            return 2;
        }
        return j < 104857600 ? 3 : 4;
    }
}
