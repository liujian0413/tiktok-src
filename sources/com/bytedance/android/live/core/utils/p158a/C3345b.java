package com.bytedance.android.live.core.utils.p158a;

import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: com.bytedance.android.live.core.utils.a.b */
public final class C3345b {

    /* renamed from: com.bytedance.android.live.core.utils.a.b$a */
    static class C3346a implements OnAttachStateChangeListener, OnPreDrawListener {

        /* renamed from: a */
        private View f10154a;

        /* renamed from: b */
        private OnAttachStateChangeListener f10155b;

        /* renamed from: c */
        private boolean f10156c = m12489a(this.f10154a);

        /* renamed from: d */
        private boolean f10157d = false;

        public final boolean onPreDraw() {
            m12487a();
            return true;
        }

        /* renamed from: a */
        private void m12487a() {
            boolean b = m12490b();
            if (this.f10157d != b) {
                this.f10157d = b;
                if (this.f10157d) {
                    this.f10155b.onViewAttachedToWindow(this.f10154a);
                    return;
                }
                this.f10155b.onViewDetachedFromWindow(this.f10154a);
            }
        }

        /* renamed from: b */
        private boolean m12490b() {
            if (this.f10156c) {
                View view = this.f10154a;
                while (true) {
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                }
                if (view == this.f10154a.getRootView()) {
                    return true;
                }
            }
            return false;
        }

        public final void onViewAttachedToWindow(View view) {
            if (!this.f10156c) {
                this.f10156c = true;
                this.f10154a.getViewTreeObserver().addOnPreDrawListener(this);
                m12487a();
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            if (this.f10156c) {
                this.f10156c = false;
                this.f10154a.getViewTreeObserver().removeOnPreDrawListener(this);
                m12487a();
            }
        }

        /* renamed from: a */
        private static boolean m12489a(View view) {
            if (VERSION.SDK_INT >= 19) {
                return view.isAttachedToWindow();
            }
            if (view.getWindowToken() != null) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public static void m12488a(View view, OnAttachStateChangeListener onAttachStateChangeListener) {
            new C3346a(view, onAttachStateChangeListener);
        }

        private C3346a(View view, OnAttachStateChangeListener onAttachStateChangeListener) {
            this.f10154a = view;
            this.f10155b = onAttachStateChangeListener;
            if (this.f10156c) {
                this.f10154a.getViewTreeObserver().addOnPreDrawListener(this);
            }
            this.f10154a.addOnAttachStateChangeListener(this);
            m12487a();
        }
    }

    /* renamed from: a */
    public static void m12486a(View view, OnAttachStateChangeListener onAttachStateChangeListener) {
        C3346a.m12488a(view, onAttachStateChangeListener);
    }
}
