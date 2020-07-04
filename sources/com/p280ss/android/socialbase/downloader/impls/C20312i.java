package com.p280ss.android.socialbase.downloader.impls;

import android.text.TextUtils;
import com.C1642a;
import com.p280ss.android.socialbase.downloader.downloader.C20286k;
import com.p280ss.android.socialbase.downloader.utils.C20359e;

/* renamed from: com.ss.android.socialbase.downloader.impls.i */
public final class C20312i implements C20286k {
    /* renamed from: a */
    public final int mo54402a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return 0;
        }
        String d = C20359e.m67592d(C1642a.m8034a("%s_%s", new Object[]{str, str2}));
        if (TextUtils.isEmpty(d)) {
            return 0;
        }
        return d.hashCode();
    }
}
