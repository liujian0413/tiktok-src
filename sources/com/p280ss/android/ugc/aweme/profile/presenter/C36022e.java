package com.p280ss.android.ugc.aweme.profile.presenter;

import java.util.Collection;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7495v;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.e */
final /* synthetic */ class C36022e implements C7495v {

    /* renamed from: a */
    private final C36018b f94244a;

    /* renamed from: b */
    private final String f94245b;

    /* renamed from: c */
    private final Collection f94246c;

    C36022e(C36018b bVar, String str, Collection collection) {
        this.f94244a = bVar;
        this.f94245b = str;
        this.f94246c = collection;
    }

    public final void subscribe(C47870u uVar) {
        this.f94244a.mo91659a(this.f94245b, this.f94246c, uVar);
    }
}
