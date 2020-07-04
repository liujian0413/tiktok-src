package com.bytedance.android.livesdk.gift.download;

import android.content.Context;
import com.p280ss.android.socialbase.downloader.downloader.C20279f;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.network.C20347f;

/* renamed from: com.bytedance.android.livesdk.gift.download.a */
public final class C7953a {

    /* renamed from: a */
    private static boolean f21531a;

    /* renamed from: a */
    private static C20347f m24377a() {
        return new C7954b();
    }

    /* renamed from: a */
    public static void m24378a(Context context) {
        if (!f21531a) {
            Downloader.init(new C20279f(context).mo54345a(m24377a()));
            f21531a = true;
        }
    }
}
