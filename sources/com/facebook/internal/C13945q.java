package com.facebook.internal;

import android.app.Activity;
import android.content.Intent;
import android.support.p022v4.app.Fragment;

/* renamed from: com.facebook.internal.q */
public final class C13945q {

    /* renamed from: a */
    public Fragment f36900a;

    /* renamed from: b */
    public android.app.Fragment f36901b;

    /* renamed from: a */
    public final Activity mo33598a() {
        if (this.f36900a != null) {
            return this.f36900a.getActivity();
        }
        return this.f36901b.getActivity();
    }

    public C13945q(android.app.Fragment fragment) {
        C13876aa.m40978a((Object) fragment, "fragment");
        this.f36901b = fragment;
    }

    public C13945q(Fragment fragment) {
        C13876aa.m40978a((Object) fragment, "fragment");
        this.f36900a = fragment;
    }

    /* renamed from: a */
    public final void mo33599a(Intent intent, int i) {
        if (this.f36900a != null) {
            this.f36900a.startActivityForResult(intent, i);
        } else {
            this.f36901b.startActivityForResult(intent, i);
        }
    }
}
