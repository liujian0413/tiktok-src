package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: com.google.android.gms.dynamic.i */
final class C15354i implements C15344a {

    /* renamed from: a */
    private final /* synthetic */ FrameLayout f39638a;

    /* renamed from: b */
    private final /* synthetic */ LayoutInflater f39639b;

    /* renamed from: c */
    private final /* synthetic */ ViewGroup f39640c;

    /* renamed from: d */
    private final /* synthetic */ Bundle f39641d;

    /* renamed from: e */
    private final /* synthetic */ C15343a f39642e;

    C15354i(C15343a aVar, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f39642e = aVar;
        this.f39638a = frameLayout;
        this.f39639b = layoutInflater;
        this.f39640c = viewGroup;
        this.f39641d = bundle;
    }

    /* renamed from: a */
    public final int mo38703a() {
        return 2;
    }

    /* renamed from: a */
    public final void mo38704a(C15348c cVar) {
        this.f39638a.removeAllViews();
        this.f39638a.addView(this.f39642e.f39626a.mo38705a(this.f39639b, this.f39640c, this.f39641d));
    }
}
