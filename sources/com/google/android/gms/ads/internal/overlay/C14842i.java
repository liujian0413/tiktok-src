package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.ami;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.overlay.i */
public final class C14842i {

    /* renamed from: a */
    public final int f38449a;

    /* renamed from: b */
    public final LayoutParams f38450b;

    /* renamed from: c */
    public final ViewGroup f38451c;

    /* renamed from: d */
    public final Context f38452d;

    public C14842i(ami ami) throws C14840g {
        this.f38450b = ami.getLayoutParams();
        ViewParent parent = ami.getParent();
        this.f38452d = ami.mo39750r();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new C14840g("Could not get the parent of the WebView for an overlay.");
        }
        this.f38451c = (ViewGroup) parent;
        this.f38449a = this.f38451c.indexOfChild(ami.getView());
        this.f38451c.removeView(ami.getView());
        ami.mo39726b(true);
    }
}
