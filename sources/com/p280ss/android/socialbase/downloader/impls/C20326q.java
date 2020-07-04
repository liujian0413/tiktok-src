package com.p280ss.android.socialbase.downloader.impls;

import android.text.TextUtils;
import com.p280ss.android.socialbase.downloader.downloader.C20292q;

/* renamed from: com.ss.android.socialbase.downloader.impls.q */
public final class C20326q implements C20292q {

    /* renamed from: a */
    private final long[] f54905a;

    public C20326q(String str) {
        this.f54905a = m67369a(str);
    }

    /* renamed from: a */
    private static long[] m67369a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = str.split(",");
            if (split.length == 0) {
                return null;
            }
            long[] jArr = new long[split.length];
            for (int i = 0; i < split.length; i++) {
                jArr[i] = Long.parseLong(split[i]);
            }
            return jArr;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final long mo54462a(int i, int i2) {
        if (this.f54905a == null || this.f54905a.length <= 0) {
            return 0;
        }
        int i3 = i - 1;
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 > this.f54905a.length - 1) {
            i3 = this.f54905a.length - 1;
        }
        return this.f54905a[i3];
    }
}
