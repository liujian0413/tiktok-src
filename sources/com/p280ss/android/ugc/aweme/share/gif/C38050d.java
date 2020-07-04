package com.p280ss.android.ugc.aweme.share.gif;

import android.app.Activity;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.share.gif.d */
final /* synthetic */ class C38050d implements Runnable {

    /* renamed from: a */
    private final C38046b f99073a;

    /* renamed from: b */
    private final Activity f99074b;

    /* renamed from: c */
    private final Aweme f99075c;

    /* renamed from: d */
    private final String f99076d;

    /* renamed from: e */
    private final String f99077e;

    /* renamed from: f */
    private final String f99078f;

    C38050d(C38046b bVar, Activity activity, Aweme aweme, String str, String str2, String str3) {
        this.f99073a = bVar;
        this.f99074b = activity;
        this.f99075c = aweme;
        this.f99076d = str;
        this.f99077e = str2;
        this.f99078f = str3;
    }

    public final void run() {
        this.f99073a.mo95687a(this.f99074b, this.f99075c, this.f99076d, this.f99077e, this.f99078f);
    }
}
