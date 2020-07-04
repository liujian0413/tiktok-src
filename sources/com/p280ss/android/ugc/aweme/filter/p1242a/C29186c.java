package com.p280ss.android.ugc.aweme.filter.p1242a;

import com.p280ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.ugc.aweme.beauty.C23537g;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1198a.C27414b;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1199b.C27416b;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1199b.C27419e;
import com.p280ss.android.ugc.aweme.tools.beauty.manager.C42194c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.filter.a.c */
public final class C29186c extends AbsDownloadListener {

    /* renamed from: a */
    private final C27416b<C23537g, Void> f77081a;

    /* renamed from: b */
    private final C27414b<C23537g, Void> f77082b;

    public final void onProgress(DownloadInfo downloadInfo) {
    }

    public final void onSuccessed(DownloadInfo downloadInfo) {
        C42194c.f109764a.mo103640b(((C23537g) this.f77081a.f72333e).f62121a);
        this.f77081a.mo70523a(3);
        this.f77081a.f72331c = null;
        this.f77082b.mo70508b(this.f77081a);
    }

    public C29186c(C27416b<C23537g, Void> bVar, C27414b<C23537g, Void> bVar2) {
        C7573i.m23587b(bVar, "task");
        C7573i.m23587b(bVar2, "callback");
        this.f77081a = bVar;
        this.f77082b = bVar2;
    }

    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        this.f77081a.mo70523a(4);
        C27416b<C23537g, Void> bVar = this.f77081a;
        Integer valueOf = Integer.valueOf(-1);
        if (baseException != null) {
            str = baseException.getMessage();
        } else {
            str = null;
        }
        bVar.f72332d = new C27419e(valueOf, str, baseException);
        this.f77082b.mo70512c(this.f77081a);
    }
}
