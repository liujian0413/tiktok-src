package com.bytedance.jedi.ext.adapter.internal;

import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0608j.C0609a;
import android.support.p022v4.app.Fragment;
import kotlin.jvm.internal.C7573i;

public final class JediViewHolderProxyHost$Companion$create$1$1 extends C0609a {

    /* renamed from: a */
    final /* synthetic */ JediViewHolderProxyHost f31490a;

    JediViewHolderProxyHost$Companion$create$1$1(JediViewHolderProxyHost jediViewHolderProxyHost) {
        this.f31490a = jediViewHolderProxyHost;
    }

    public final void onFragmentViewDestroyed(C0608j jVar, Fragment fragment) {
        C7573i.m23587b(jVar, "fm");
        C7573i.m23587b(fragment, "f");
        if (fragment == this.f31490a.f31486a) {
            jVar.mo2648a((C0609a) this);
            fragment.getChildFragmentManager().mo2645a().mo2587a((Fragment) this.f31490a).mo2610f();
            this.f31490a.mo29280a();
        }
    }
}
