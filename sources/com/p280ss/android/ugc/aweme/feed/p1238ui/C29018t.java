package com.p280ss.android.ugc.aweme.feed.p1238ui;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.t */
final /* synthetic */ class C29018t implements Callable {

    /* renamed from: a */
    private final C28994s f76440a;

    /* renamed from: b */
    private final LogPbBean f76441b;

    /* renamed from: c */
    private final Aweme f76442c;

    /* renamed from: d */
    private final String f76443d;

    C29018t(C28994s sVar, LogPbBean logPbBean, Aweme aweme, String str) {
        this.f76440a = sVar;
        this.f76441b = logPbBean;
        this.f76442c = aweme;
        this.f76443d = str;
    }

    public final Object call() {
        return this.f76440a.mo74279a(this.f76441b, this.f76442c, this.f76443d);
    }
}
