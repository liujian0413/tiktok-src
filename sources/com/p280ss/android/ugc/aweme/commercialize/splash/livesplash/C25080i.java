package com.p280ss.android.ugc.aweme.commercialize.splash.livesplash;

import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.livesplash.i */
final /* synthetic */ class C25080i implements Callable {

    /* renamed from: a */
    private final Aweme f66202a;

    /* renamed from: b */
    private final DownloadInfo f66203b;

    C25080i(Aweme aweme, DownloadInfo downloadInfo) {
        this.f66202a = aweme;
        this.f66203b = downloadInfo;
    }

    public final Object call() {
        return C250751.m82599a(this.f66202a, this.f66203b);
    }
}
