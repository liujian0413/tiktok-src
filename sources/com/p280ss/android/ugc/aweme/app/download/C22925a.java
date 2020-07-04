package com.p280ss.android.ugc.aweme.app.download;

import android.content.Context;
import com.p280ss.android.download.api.p858b.C19387c;
import com.p280ss.android.downloadlib.C19535g;
import com.p280ss.android.ugc.aweme.app.download.config.DownloaderManagerHolder;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22944c;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.p1445o.C34650a;

/* renamed from: com.ss.android.ugc.aweme.app.download.a */
public final class C22925a implements C34650a {
    /* renamed from: b */
    public final boolean mo59910b() {
        return DownloaderManagerHolder.m75538d();
    }

    /* renamed from: a */
    public final C19535g mo59909a() {
        return DownloaderManagerHolder.m75524a();
    }

    /* renamed from: a */
    public final C19387c mo59908a(Context context, AwemeRawAd awemeRawAd) {
        return C22944c.m75515a(context, awemeRawAd);
    }
}
