package com.p280ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.u */
final /* synthetic */ class C24977u implements Callable {

    /* renamed from: a */
    private final Context f65852a;

    /* renamed from: b */
    private final Aweme f65853b;

    C24977u(Context context, Aweme aweme) {
        this.f65852a = context;
        this.f65853b = aweme;
    }

    public final Object call() {
        return C24976t.m82170ba(this.f65852a, this.f65853b);
    }
}
