package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import com.google.android.gms.ads.internal.C14793ay;

@C6505uv
public final class afa {

    /* renamed from: a */
    public Activity f40129a;

    /* renamed from: b */
    private final View f40130b;

    /* renamed from: c */
    private boolean f40131c;

    /* renamed from: d */
    private boolean f40132d;

    /* renamed from: e */
    private boolean f40133e;

    /* renamed from: f */
    private OnGlobalLayoutListener f40134f;

    /* renamed from: g */
    private OnScrollChangedListener f40135g;

    public afa(Activity activity, View view, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        this.f40129a = activity;
        this.f40130b = view;
        this.f40134f = onGlobalLayoutListener;
        this.f40135g = onScrollChangedListener;
    }

    /* renamed from: a */
    public final void mo39269a() {
        this.f40133e = true;
        if (this.f40132d) {
            m45715e();
        }
    }

    /* renamed from: b */
    public final void mo39270b() {
        this.f40133e = false;
        m45716f();
    }

    /* renamed from: c */
    public final void mo39271c() {
        this.f40132d = true;
        if (this.f40133e) {
            m45715e();
        }
    }

    /* renamed from: d */
    public final void mo39272d() {
        this.f40132d = false;
        m45716f();
    }

    /* renamed from: e */
    private final void m45715e() {
        if (!this.f40131c) {
            if (this.f40134f != null) {
                if (this.f40129a != null) {
                    Activity activity = this.f40129a;
                    OnGlobalLayoutListener onGlobalLayoutListener = this.f40134f;
                    ViewTreeObserver a = m45714a(activity);
                    if (a != null) {
                        a.addOnGlobalLayoutListener(onGlobalLayoutListener);
                    }
                }
                ahd.m45860a(this.f40130b, this.f40134f);
            }
            if (this.f40135g != null) {
                if (this.f40129a != null) {
                    Activity activity2 = this.f40129a;
                    OnScrollChangedListener onScrollChangedListener = this.f40135g;
                    ViewTreeObserver a2 = m45714a(activity2);
                    if (a2 != null) {
                        a2.addOnScrollChangedListener(onScrollChangedListener);
                    }
                }
                ahd.m45861a(this.f40130b, this.f40135g);
            }
            this.f40131c = true;
        }
    }

    /* renamed from: f */
    private final void m45716f() {
        if (this.f40129a != null && this.f40131c) {
            if (this.f40134f != null) {
                Activity activity = this.f40129a;
                OnGlobalLayoutListener onGlobalLayoutListener = this.f40134f;
                ViewTreeObserver a = m45714a(activity);
                if (a != null) {
                    C14793ay.m42896b().mo39198a(a, onGlobalLayoutListener);
                }
            }
            if (this.f40135g != null) {
                Activity activity2 = this.f40129a;
                OnScrollChangedListener onScrollChangedListener = this.f40135g;
                ViewTreeObserver a2 = m45714a(activity2);
                if (a2 != null) {
                    a2.removeOnScrollChangedListener(onScrollChangedListener);
                }
            }
            this.f40131c = false;
        }
    }

    /* renamed from: a */
    private static ViewTreeObserver m45714a(Activity activity) {
        if (activity == null) {
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }
}
