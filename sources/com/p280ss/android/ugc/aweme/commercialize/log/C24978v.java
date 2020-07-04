package com.p280ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.v */
final /* synthetic */ class C24978v implements Callable {

    /* renamed from: a */
    private final Context f65854a;

    /* renamed from: b */
    private final Aweme f65855b;

    /* renamed from: c */
    private final int f65856c;

    C24978v(Context context, Aweme aweme, int i) {
        this.f65854a = context;
        this.f65855b = aweme;
        this.f65856c = i;
    }

    public final Object call() {
        return C24976t.m82272r(this.f65854a, this.f65855b, this.f65856c);
    }
}
