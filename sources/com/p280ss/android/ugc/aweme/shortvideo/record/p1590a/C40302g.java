package com.p280ss.android.ugc.aweme.shortvideo.record.p1590a;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.a.g */
final class C40302g {

    /* renamed from: a */
    public TextView f104681a;

    /* renamed from: b */
    private Context f104682b;

    /* renamed from: c */
    private ViewGroup f104683c;

    /* renamed from: d */
    private int f104684d;

    /* renamed from: e */
    private int f104685e;

    /* renamed from: f */
    private int f104686f;

    /* renamed from: c */
    private void m128745c() {
        this.f104681a.setText(R.string.dbi);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo100122a() {
        m128744b();
        m128745c();
        this.f104681a.setVisibility(0);
    }

    /* renamed from: b */
    private void m128744b() {
        if (this.f104681a == null) {
            this.f104681a = new TextView(this.f104682b);
            this.f104681a.setTextSize(14.0f);
            this.f104681a.setGravity(17);
            this.f104681a.setTextColor(this.f104682b.getResources().getColor(R.color.lt));
            this.f104681a.setTextColor(-16777216);
            this.f104683c.addView(this.f104681a, new MarginLayoutParams(-2, -2));
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f104681a.getLayoutParams();
        marginLayoutParams.width = this.f104686f;
        if (C43127fh.m136806a(this.f104682b)) {
            marginLayoutParams.setMargins(0, this.f104685e, this.f104684d, 0);
        } else {
            marginLayoutParams.setMargins(this.f104684d, this.f104685e, 0, 0);
        }
        if (VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginStart(this.f104684d);
        }
        this.f104681a.requestLayout();
    }

    C40302g(ViewGroup viewGroup) {
        this.f104682b = viewGroup.getContext();
        this.f104683c = viewGroup;
    }

    /* renamed from: a */
    public final void mo100124a(boolean z) {
        if (this.f104681a != null && this.f104681a.getVisibility() == 0) {
            if (z) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(150);
                alphaAnimation.setAnimationListener(new AnimationListener() {
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    public final void onAnimationStart(Animation animation) {
                    }

                    public final void onAnimationEnd(Animation animation) {
                        C40302g.this.f104681a.setVisibility(8);
                    }
                });
                this.f104681a.startAnimation(alphaAnimation);
                return;
            }
            this.f104681a.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo100123a(int i, int i2, int i3) {
        this.f104684d = i;
        this.f104685e = i2;
        this.f104686f = i3;
    }
}
