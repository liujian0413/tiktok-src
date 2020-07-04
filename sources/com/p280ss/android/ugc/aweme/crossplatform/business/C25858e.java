package com.p280ss.android.ugc.aweme.crossplatform.business;

import android.app.Activity;
import android.webkit.DownloadListener;
import android.widget.FrameLayout;
import com.p280ss.android.download.api.p858b.C19388d;
import com.p280ss.android.p848c.p849a.p850a.C19226a;
import com.p280ss.android.p848c.p849a.p850a.C19229b;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26039m;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.e */
final /* synthetic */ class C25858e implements DownloadListener {

    /* renamed from: a */
    private final DownloadBusiness f68389a;

    /* renamed from: b */
    private final C26039m f68390b;

    /* renamed from: c */
    private final Activity f68391c;

    /* renamed from: d */
    private final C19229b f68392d;

    /* renamed from: e */
    private final C19226a f68393e;

    /* renamed from: f */
    private final C19388d f68394f;

    /* renamed from: g */
    private final FrameLayout f68395g;

    C25858e(DownloadBusiness downloadBusiness, C26039m mVar, Activity activity, C19229b bVar, C19226a aVar, C19388d dVar, FrameLayout frameLayout) {
        this.f68389a = downloadBusiness;
        this.f68390b = mVar;
        this.f68391c = activity;
        this.f68392d = bVar;
        this.f68393e = aVar;
        this.f68394f = dVar;
        this.f68395g = frameLayout;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        this.f68389a.mo67184a(this.f68390b, this.f68391c, this.f68392d, this.f68393e, this.f68394f, this.f68395g, str, str2, str3, str4, j);
    }
}
