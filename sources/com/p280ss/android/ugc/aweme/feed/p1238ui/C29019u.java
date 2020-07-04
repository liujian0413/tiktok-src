package com.p280ss.android.ugc.aweme.feed.p1238ui;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.u */
final /* synthetic */ class C29019u implements Callable {

    /* renamed from: a */
    private final C28994s f76444a;

    /* renamed from: b */
    private final String f76445b;

    /* renamed from: c */
    private final LogPbBean f76446c;

    /* renamed from: d */
    private final Aweme f76447d;

    /* renamed from: e */
    private final String f76448e;

    C29019u(C28994s sVar, String str, LogPbBean logPbBean, Aweme aweme, String str2) {
        this.f76444a = sVar;
        this.f76445b = str;
        this.f76446c = logPbBean;
        this.f76447d = aweme;
        this.f76448e = str2;
    }

    public final Object call() {
        return this.f76444a.mo74280a(this.f76445b, this.f76446c, this.f76447d, this.f76448e);
    }
}
