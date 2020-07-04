package com.bytedance.widget;

import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0608j.C0609a;
import android.support.p022v4.app.Fragment;
import kotlin.jvm.internal.C7573i;

public final class WidgetHost$Companion$createHost$1$1 extends C0609a {

    /* renamed from: a */
    final /* synthetic */ WidgetHost f34473a;

    WidgetHost$Companion$createHost$1$1(WidgetHost widgetHost) {
        this.f34473a = widgetHost;
    }

    public final void onFragmentViewDestroyed(C0608j jVar, Fragment fragment) {
        C7573i.m23587b(jVar, "fm");
        C7573i.m23587b(fragment, "f");
        if (fragment == this.f34473a.f34467a) {
            jVar.mo2648a((C0609a) this);
            fragment.getChildFragmentManager().mo2645a().mo2587a((Fragment) this.f34473a).mo2610f();
            this.f34473a.mo31596a();
        }
    }
}
