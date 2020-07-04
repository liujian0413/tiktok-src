package com.p280ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.x */
final /* synthetic */ class C24980x implements Callable {

    /* renamed from: a */
    private final Context f65863a;

    /* renamed from: b */
    private final Aweme f65864b;

    C24980x(Context context, Aweme aweme) {
        this.f65863a = context;
        this.f65864b = aweme;
    }

    public final Object call() {
        return C24976t.m82171bb(this.f65863a, this.f65864b);
    }
}
