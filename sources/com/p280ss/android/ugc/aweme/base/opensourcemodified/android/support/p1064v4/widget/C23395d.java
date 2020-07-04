package com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.d */
public abstract class C23395d {

    /* renamed from: b */
    private static final String f61590b = "d";

    /* renamed from: a */
    public boolean f61591a;

    /* renamed from: c */
    private boolean f61592c = true;

    /* renamed from: d */
    private Boolean f61593d;

    /* renamed from: b */
    public final void mo60802b() {
        mo60801a(false);
    }

    /* renamed from: a */
    public final void mo60798a() {
        mo60801a(true);
    }

    /* renamed from: c */
    private void m76727c() {
        if (this.f61593d != null) {
            m76726b(this.f61593d.booleanValue());
            this.f61593d = null;
        }
    }

    /* renamed from: a */
    public final AnimationListener mo60797a(final AnimationListener animationListener) {
        return new AnimationListener() {
            public final void onAnimationEnd(Animation animation) {
                if (animationListener != null) {
                    animationListener.onAnimationEnd(animation);
                }
                C23395d.this.mo60801a(true);
            }

            public final void onAnimationRepeat(Animation animation) {
                if (animationListener != null) {
                    animationListener.onAnimationRepeat(animation);
                }
            }

            public final void onAnimationStart(Animation animation) {
                if (animationListener != null) {
                    animationListener.onAnimationStart(animation);
                }
            }
        };
    }

    /* renamed from: b */
    private void m76726b(boolean z) {
        if (this.f61591a != z) {
            if (!this.f61592c) {
                this.f61593d = Boolean.valueOf(z);
            } else {
                this.f61591a = z;
            }
        }
    }

    /* renamed from: a */
    public final void mo60799a(float f) {
        mo60801a(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60801a(boolean z) {
        if (this.f61592c != z) {
            this.f61592c = z;
            if (z) {
                m76727c();
            }
        }
    }

    /* renamed from: b */
    public final void mo60803b(int i, AnimationListener animationListener) {
        mo60801a(false);
    }

    /* renamed from: a */
    public final void mo60800a(int i, AnimationListener animationListener) {
        mo60801a(false);
    }
}
