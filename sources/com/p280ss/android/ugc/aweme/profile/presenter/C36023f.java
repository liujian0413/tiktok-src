package com.p280ss.android.ugc.aweme.profile.presenter;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7495v;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.f */
final /* synthetic */ class C36023f implements C7495v {

    /* renamed from: a */
    private final C36018b f94247a;

    /* renamed from: b */
    private final String f94248b;

    /* renamed from: c */
    private final Aweme f94249c;

    C36023f(C36018b bVar, String str, Aweme aweme) {
        this.f94247a = bVar;
        this.f94248b = str;
        this.f94249c = aweme;
    }

    public final void subscribe(C47870u uVar) {
        this.f94247a.mo91657a(this.f94248b, this.f94249c, uVar);
    }
}
