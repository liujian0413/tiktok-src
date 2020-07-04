package com.p280ss.android.ugc.aweme.live.sdk.chatroom.p1367ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.p280ss.android.ugc.aweme.port.internal.C35610c.C35611a;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.b */
public final class C32535b {

    /* renamed from: a */
    public int f84842a;

    /* renamed from: b */
    public ViewGroup f84843b;

    /* renamed from: c */
    public C35611a f84844c;

    /* renamed from: d */
    private ValueAnimator f84845d;

    /* renamed from: e */
    private float f84846e;

    /* renamed from: f */
    private LinkedList<View> f84847f = new LinkedList<>();

    /* renamed from: a */
    public final void mo83786a() {
        this.f84842a = 1;
        m105387d();
    }

    /* renamed from: b */
    public final void mo83790b() {
        this.f84842a = 2;
        m105387d();
    }

    /* renamed from: c */
    private void m105386c() {
        if (this.f84842a != 0) {
            mo83787a((1.0f - this.f84846e) / 0.5f);
            this.f84843b.setAlpha(1.0f - ((1.0f - this.f84846e) / 0.5f));
        }
    }

    /* renamed from: d */
    private void m105387d() {
        if (this.f84845d != null) {
            this.f84845d.cancel();
            this.f84845d = null;
        }
        if (this.f84842a == 2) {
            this.f84845d = ValueAnimator.ofFloat(new float[]{1.0f, 0.5f});
        } else {
            this.f84845d = ValueAnimator.ofFloat(new float[]{0.5f, 1.0f});
        }
        this.f84845d.setDuration(300);
        this.f84845d.setInterpolator(new LinearInterpolator());
        this.f84845d.addUpdateListener(new C32537c(this));
        this.f84845d.addListener(new AnimatorListener() {
            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationCancel(Animator animator) {
                switch (C32535b.this.f84842a) {
                    case 1:
                        C32535b.this.mo83787a(0.0f);
                        break;
                    case 2:
                        C32535b.this.mo83787a(1.0f);
                        return;
                }
            }

            public final void onAnimationStart(Animator animator) {
                C32535b.this.f84843b.setEnabled(false);
                C32535b.this.f84843b.setVisibility(0);
                if (C32535b.this.f84842a == 1 && C32535b.this.f84844c != null) {
                    C32535b.this.f84844c.mo90422b();
                }
            }

            public final void onAnimationEnd(Animator animator) {
                C32535b.this.f84843b.setEnabled(true);
                if (C32535b.this.f84842a == 2) {
                    C32535b.this.f84843b.setVisibility(8);
                    if (C32535b.this.f84844c != null) {
                        C32535b.this.f84844c.mo90421a();
                    }
                }
                switch (C32535b.this.f84842a) {
                    case 1:
                        C32535b.this.mo83787a(0.0f);
                        break;
                    case 2:
                        C32535b.this.mo83787a(1.0f);
                        return;
                }
            }
        });
        this.f84845d.start();
    }

    public C32535b(ViewGroup viewGroup) {
        this.f84843b = viewGroup;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo83788a(ValueAnimator valueAnimator) {
        this.f84846e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        m105386c();
    }

    /* renamed from: a */
    public final void mo83789a(View... viewArr) {
        if (viewArr != null) {
            for (View add : viewArr) {
                this.f84847f.add(add);
            }
        }
    }

    /* renamed from: a */
    public final void mo83787a(float f) {
        Iterator it = this.f84847f.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            view.setAlpha(f);
            if (f == 0.0f) {
                view.setEnabled(false);
            }
            if (f == 1.0f) {
                view.setEnabled(true);
            }
        }
    }
}
