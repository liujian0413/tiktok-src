package com.p280ss.android.ugc.aweme.app;

import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.app.bo */
final /* synthetic */ class C22906bo implements Callable {

    /* renamed from: a */
    private final C22905bn f60633a;

    /* renamed from: b */
    private final Uri f60634b;

    C22906bo(C22905bn bnVar, Uri uri) {
        this.f60633a = bnVar;
        this.f60634b = uri;
    }

    public final Object call() {
        return this.f60633a.mo59880b(this.f60634b);
    }
}
