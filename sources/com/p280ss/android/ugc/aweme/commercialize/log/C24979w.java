package com.p280ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.w */
final /* synthetic */ class C24979w implements Callable {

    /* renamed from: a */
    private final Context f65857a;

    /* renamed from: b */
    private final Aweme f65858b;

    /* renamed from: c */
    private final long f65859c;

    /* renamed from: d */
    private final int f65860d;

    /* renamed from: e */
    private final String f65861e;

    /* renamed from: f */
    private final Integer f65862f;

    C24979w(Context context, Aweme aweme, long j, int i, String str, Integer num) {
        this.f65857a = context;
        this.f65858b = aweme;
        this.f65859c = j;
        this.f65860d = i;
        this.f65861e = str;
        this.f65862f = num;
    }

    public final Object call() {
        return C24976t.m82180c(this.f65857a, this.f65858b, this.f65859c, this.f65860d, this.f65861e, this.f65862f);
    }
}
