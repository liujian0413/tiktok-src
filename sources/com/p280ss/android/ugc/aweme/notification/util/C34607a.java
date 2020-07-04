package com.p280ss.android.ugc.aweme.notification.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.notification.p1444ui.LiveCircleView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.notification.util.a */
public final class C34607a {

    /* renamed from: a */
    public LiveCircleView f90340a;

    /* renamed from: b */
    public AvatarImageView f90341b;

    /* renamed from: c */
    public boolean f90342c;

    /* renamed from: d */
    public int f90343d;

    /* renamed from: e */
    public int f90344e;

    /* renamed from: f */
    public ValueAnimator f90345f;

    /* renamed from: g */
    public List<UrlModel> f90346g = new ArrayList();

    /* renamed from: h */
    private ValueAnimator f90347h;

    /* renamed from: b */
    public final void mo87903b() {
        if (this.f90347h != null) {
            this.f90347h.cancel();
        }
    }

    /* renamed from: a */
    public final void mo87900a() {
        if (this.f90341b != null && this.f90340a != null && !this.f90342c) {
            if (this.f90347h != null) {
                this.f90347h.start();
                return;
            }
            this.f90343d = 1;
            this.f90347h = ValueAnimator.ofInt(new int[]{0, 800});
            this.f90345f = ValueAnimator.ofInt(new int[]{0, 800});
            this.f90345f.setRepeatCount(-1);
            this.f90345f.setRepeatMode(1);
            this.f90345f.setDuration(800);
            this.f90347h.setRepeatCount(-1);
            this.f90347h.setRepeatMode(1);
            this.f90347h.setDuration(800);
            this.f90347h.start();
            this.f90345f.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (intValue >= 0 && intValue <= 640) {
                        C34607a.this.f90340a.setFraction((((float) intValue) * 1.0f) / 640.0f);
                    }
                }
            });
            this.f90347h.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float f;
                    float f2;
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    if (C34607a.this.f90343d % 5 == 0) {
                        f = 1.0f;
                    } else {
                        f = 0.08f;
                    }
                    if (C34607a.this.f90343d % 5 == 0 && animatedFraction > 0.48f && animatedFraction < 0.52f && C34607a.this.f90346g.size() != 0) {
                        C23323e.m76524b(C34607a.this.f90341b, (UrlModel) C34607a.this.f90346g.get(C34607a.this.f90344e));
                        C34607a.this.f90344e = (C34607a.this.f90344e + 1) % C34607a.this.f90346g.size();
                    }
                    if (animatedFraction <= 0.5f) {
                        f2 = 1.0f - (f * (animatedFraction / 0.5f));
                    } else {
                        f2 = (1.0f - f) + (f * ((animatedFraction - 0.5f) / 0.5f));
                    }
                    C34607a.this.f90341b.setScaleX(f2);
                    C34607a.this.f90341b.setScaleY(f2);
                    if (intValue >= 730 && intValue < 740 && !C34607a.this.f90342c) {
                        C34607a.this.f90342c = true;
                        C34607a.this.f90345f.start();
                    }
                }
            });
            this.f90347h.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationCancel(Animator animator) {
                    C34607a.this.f90345f.cancel();
                    C34607a.this.f90342c = false;
                }

                public final void onAnimationRepeat(Animator animator) {
                    C34607a.this.f90343d = (C34607a.this.f90343d + 1) % 5;
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo87901a(View view) {
        this.f90341b = (AvatarImageView) view.findViewById(R.id.b3s);
        this.f90340a = (LiveCircleView) view.findViewById(R.id.b3w);
    }

    /* renamed from: a */
    public final void mo87902a(List<UrlModel> list) {
        if (list != null && list.size() != 0) {
            this.f90346g.addAll(list);
            C23323e.m76524b(this.f90341b, (UrlModel) this.f90346g.get(0));
        }
    }
}
