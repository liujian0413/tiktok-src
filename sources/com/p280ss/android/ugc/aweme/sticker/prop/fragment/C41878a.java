package com.p280ss.android.ugc.aweme.sticker.prop.fragment;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.detail.C26065h;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.fragment.a */
public final class C41878a implements C26065h {

    /* renamed from: a */
    private View f108952a;

    /* renamed from: b */
    private View f108953b;

    /* renamed from: c */
    private boolean f108954c = true;

    /* renamed from: d */
    private boolean f108955d;

    /* renamed from: a */
    public final void mo67572a(boolean z) {
    }

    /* renamed from: c */
    public final void mo67574c() {
        m133209g();
    }

    /* renamed from: d */
    public final void mo67575d() {
        m133210h();
    }

    /* renamed from: a */
    public final void mo67570a() {
        this.f108953b.clearAnimation();
        this.f108952a.setOnTouchListener(null);
    }

    /* renamed from: b */
    public final void mo67573b() {
        this.f108953b.startAnimation(AnimationUtils.loadAnimation(C6399b.m19921a(), R.anim.cq));
        this.f108952a.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case 0:
                        C41878a.this.mo102916e();
                        break;
                    case 1:
                        C41878a.this.mo102917f();
                        break;
                }
                return false;
            }
        });
    }

    /* renamed from: g */
    private void m133209g() {
        if (!this.f108955d && !this.f108954c) {
            this.f108952a.setVisibility(0);
            this.f108952a.startAnimation(m133212j());
            this.f108954c = true;
            this.f108953b.startAnimation(AnimationUtils.loadAnimation(C6399b.m19921a(), R.anim.cq));
        }
    }

    /* renamed from: h */
    private void m133210h() {
        if (!this.f108955d && this.f108954c) {
            this.f108953b.clearAnimation();
            this.f108952a.startAnimation(m133211i());
            this.f108952a.setVisibility(8);
            this.f108954c = false;
        }
    }

    /* renamed from: i */
    private static AnimationSet m133211i() {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(300);
        animationSet.setFillAfter(false);
        return animationSet;
    }

    /* renamed from: j */
    private static AnimationSet m133212j() {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(-0.5f, 1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(300);
        animationSet.setFillAfter(false);
        return animationSet;
    }

    /* renamed from: e */
    public final void mo102916e() {
        this.f108952a.startAnimation(AnimationUtils.loadAnimation(C6399b.m19921a(), R.anim.co));
        if (!this.f108955d) {
            this.f108953b.clearAnimation();
            this.f108953b.setVisibility(4);
        }
    }

    /* renamed from: f */
    public final void mo102917f() {
        this.f108952a.clearAnimation();
        if (!this.f108955d) {
            this.f108953b.setVisibility(0);
            this.f108953b.startAnimation(AnimationUtils.loadAnimation(C6399b.m19921a(), R.anim.cq));
        }
    }

    /* renamed from: a */
    public final void mo67571a(int i) {
        m133209g();
    }

    public C41878a(View view, View view2, boolean z) {
        this.f108952a = view;
        this.f108953b = view2;
        if (z) {
            this.f108953b.setVisibility(8);
        }
        this.f108955d = z;
    }
}
