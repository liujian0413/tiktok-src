package com.p280ss.android.ugc.aweme.shortvideo.countdown;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.content.ContentResolver;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.provider.Settings.System;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.p280ss.android.ugc.aweme.shortvideo.countdown.C38622h.C38623a;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.b */
public final class C38593b implements AnimatorListener, C38622h {

    /* renamed from: a */
    private C38623a f100260a;

    /* renamed from: b */
    private C38621g f100261b;

    /* renamed from: c */
    private FrameLayout f100262c;

    /* renamed from: d */
    private LottieAnimationView f100263d;

    /* renamed from: e */
    private int f100264e;

    /* renamed from: f */
    private boolean f100265f;

    /* renamed from: b */
    public final boolean mo96564b() {
        return this.f100265f;
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    /* renamed from: d */
    private void m123309d() {
        if (!(this.f100263d == null || this.f100262c == null || !this.f100263d.mo7084e())) {
            this.f100263d.setVisibility(8);
        }
        this.f100260a.mo96627b();
    }

    /* renamed from: a */
    public final void mo96561a() {
        if (this.f100263d != null && this.f100262c != null && this.f100263d.mo7084e()) {
            this.f100263d.mo7085f();
            this.f100263d.setVisibility(8);
        }
    }

    /* renamed from: c */
    private void m123308c() {
        float f;
        float f2;
        float f3;
        ContentResolver contentResolver = this.f100262c.getContext().getContentResolver();
        if (contentResolver != null) {
            if (VERSION.SDK_INT >= 17) {
                f2 = Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
                f = Global.getFloat(contentResolver, "transition_animation_scale", 1.0f);
                f3 = Global.getFloat(contentResolver, "window_animation_scale", 1.0f);
            } else {
                f2 = System.getFloat(contentResolver, "animator_duration_scale", 1.0f);
                f = System.getFloat(contentResolver, "transition_animation_scale", 1.0f);
                f3 = System.getFloat(contentResolver, "window_animation_scale", 1.0f);
            }
            StringBuilder sb = new StringBuilder("anim_duration_scale =");
            sb.append(f2);
            C42880h.m136156a(sb.toString());
            StringBuilder sb2 = new StringBuilder("transition_anim_scale =");
            sb2.append(f);
            C42880h.m136156a(sb2.toString());
            StringBuilder sb3 = new StringBuilder("window_anim_scale =");
            sb3.append(f3);
            C42880h.m136156a(sb3.toString());
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f100261b.mo96593a(this.f100264e);
    }

    public final void onAnimationCancel(Animator animator) {
        this.f100265f = false;
        C42880h.m136156a("record cound down onAnimationCancel() called");
        this.f100260a.mo96628c();
        this.f100261b.mo96594b();
    }

    public final void onAnimationEnd(Animator animator) {
        C42880h.m136156a("record cound down onAnimationEnd() called");
        this.f100265f = false;
        m123309d();
        this.f100261b.mo96594b();
    }

    /* renamed from: a */
    public final void mo96562a(int i) {
        String str;
        this.f100264e = i;
        this.f100265f = true;
        this.f100260a.mo96626a();
        this.f100263d = (LottieAnimationView) LayoutInflater.from(this.f100262c.getContext()).inflate(R.layout.al5, this.f100262c, false);
        this.f100262c.addView(this.f100263d);
        this.f100263d.mo7083d();
        this.f100263d.mo7076a((AnimatorListener) this);
        LottieAnimationView lottieAnimationView = this.f100263d;
        if (i == 3) {
            str = "countdown_3_lottie.json";
        } else {
            str = "countdown_10_lottie.json";
        }
        lottieAnimationView.setAnimation(str);
        this.f100263d.mo7078b();
        this.f100263d.setVisibility(0);
        m123308c();
    }

    C38593b(FrameLayout frameLayout, C38623a aVar, C38621g gVar) {
        this.f100262c = frameLayout;
        this.f100260a = aVar;
        this.f100261b = gVar;
    }
}
