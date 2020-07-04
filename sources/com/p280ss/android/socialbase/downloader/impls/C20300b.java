package com.p280ss.android.socialbase.downloader.impls;

import com.p280ss.android.socialbase.downloader.downloader.C20280g;
import com.p280ss.android.socialbase.downloader.network.NetworkQuality;

/* renamed from: com.ss.android.socialbase.downloader.impls.b */
public final class C20300b implements C20280g {
    /* renamed from: a */
    public final int mo51549a(int i, NetworkQuality networkQuality) {
        if (networkQuality.ordinal() <= NetworkQuality.MODERATE.ordinal()) {
            return 1;
        }
        if (networkQuality == NetworkQuality.GOOD) {
            return i - 1;
        }
        return i;
    }
}
