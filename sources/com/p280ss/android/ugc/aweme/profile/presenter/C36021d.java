package com.p280ss.android.ugc.aweme.profile.presenter;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7495v;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.d */
final /* synthetic */ class C36021d implements C7495v {

    /* renamed from: a */
    private final C36018b f94241a;

    /* renamed from: b */
    private final String f94242b;

    /* renamed from: c */
    private final Aweme f94243c;

    C36021d(C36018b bVar, String str, Aweme aweme) {
        this.f94241a = bVar;
        this.f94242b = str;
        this.f94243c = aweme;
    }

    public final void subscribe(C47870u uVar) {
        this.f94241a.mo91663b(this.f94242b, this.f94243c, uVar);
    }
}
