package com.bytedance.android.live.core.utils;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowInsets;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.android.live.core.utils.a */
public final class C3341a implements OnGlobalLayoutListener {

    /* renamed from: a */
    private WeakReference<View> f10115a;

    /* renamed from: b */
    private ViewTreeObserver f10116b;

    /* renamed from: c */
    private int f10117c;

    /* renamed from: d */
    private LayoutParams f10118d;

    public final void onGlobalLayout() {
        View view = (View) this.f10115a.get();
        if (view == null) {
            if (this.f10116b.isAlive()) {
                this.f10116b.removeGlobalOnLayoutListener(this);
            }
            return;
        }
        int b = m12467b(view);
        if (b != this.f10117c) {
            this.f10118d.height = b;
            view.setLayoutParams(this.f10118d);
            view.getClass();
            view.post(C3365b.m12550a(view));
            this.f10117c = b;
        }
    }

    /* renamed from: a */
    public static void m12466a(View view) {
        if (VERSION.SDK_INT >= 19) {
            new C3341a(view);
        }
    }

    private C3341a(View view) {
        if (view != null) {
            this.f10115a = new WeakReference<>(view);
            this.f10116b = view.getViewTreeObserver();
            this.f10116b.addOnGlobalLayoutListener(this);
            this.f10118d = view.getLayoutParams();
        }
    }

    /* renamed from: b */
    private static int m12467b(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        if (VERSION.SDK_INT >= 23) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return rect.bottom;
            }
            if (rootWindowInsets.getStableInsetTop() == rect.top) {
                return rect.bottom;
            }
            if (rootWindowInsets.getStableInsetTop() < rect.top) {
                return rect.bottom - (rect.top - rootWindowInsets.getStableInsetTop());
            }
        }
        return rect.bottom;
    }
}
