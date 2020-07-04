package com.p280ss.android.ugc.aweme.shortvideo.upload;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.ttuploader.TTUploadLog;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.x */
public final class C41499x {
    /* renamed from: a */
    public static final void m132199a() {
        if (m132200b()) {
            TTUploadLog.turnOn(1, 1);
        }
    }

    /* renamed from: b */
    private static final boolean m132200b() {
        boolean c = C6399b.m19928c();
        boolean equals = TextUtils.equals(C6399b.m19941q(), "local_test");
        if (c || equals) {
            return true;
        }
        return false;
    }
}
