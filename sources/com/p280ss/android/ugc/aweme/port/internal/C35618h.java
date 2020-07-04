package com.p280ss.android.ugc.aweme.port.internal;

import android.support.p022v4.app.Fragment;
import android.view.View;
import bolts.C1591g;
import bolts.C1592h;

/* renamed from: com.ss.android.ugc.aweme.port.internal.h */
final /* synthetic */ class C35618h implements C1591g {

    /* renamed from: a */
    private final Fragment f93306a;

    /* renamed from: b */
    private final View f93307b;

    C35618h(Fragment fragment, View view) {
        this.f93306a = fragment;
        this.f93307b = view;
    }

    public final Object then(C1592h hVar) {
        return PublishFragmentLifecycleCallbacks.m115028a(this.f93306a, this.f93307b, hVar);
    }
}
