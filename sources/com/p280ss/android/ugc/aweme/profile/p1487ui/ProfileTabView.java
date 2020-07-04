package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileTabView */
public class ProfileTabView extends RelativeLayout {

    /* renamed from: a */
    public TextView f95215a;

    /* renamed from: b */
    public boolean f95216b;

    /* renamed from: c */
    private TextView f95217c;

    /* renamed from: d */
    private int f95218d;

    /* renamed from: e */
    private int f95219e;

    /* renamed from: f */
    private ValueAnimator f95220f;

    /* renamed from: g */
    private ValueAnimator f95221g;

    /* renamed from: h */
    private boolean f95222h;

    /* renamed from: d */
    private void m117270d() {
        if (this.f95216b) {
            this.f95217c.setAlpha(1.0f);
            return;
        }
        this.f95215a.setVisibility(0);
        this.f95220f.start();
    }

    /* renamed from: e */
    private void m117271e() {
        if (this.f95216b) {
            this.f95217c.setAlpha(0.6f);
        } else {
            this.f95221g.start();
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f95217c = (TextView) findViewById(16908308);
        this.f95215a = (TextView) findViewById(R.id.a7m);
    }

    /* renamed from: a */
    private void m117267a() {
        float f = getContext().getResources().getDisplayMetrics().density;
        this.f95218d = (int) (8.0f * f);
        this.f95219e = (int) (f * 3.0f);
        m117268b();
        m117269c();
    }

    /* renamed from: b */
    private void m117268b() {
        this.f95220f = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.f95220f.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ProfileTabView.this.mo92320a(valueAnimator);
            }
        });
        this.f95220f.setDuration(300);
    }

    /* renamed from: c */
    private void m117269c() {
        this.f95221g = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f95221g.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ProfileTabView.this.mo92320a(valueAnimator);
            }
        });
        this.f95221g.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                ProfileTabView.this.f95215a.setVisibility(8);
            }
        });
        this.f95221g.setDuration(300);
    }

    public void setAnimationEnabled(boolean z) {
        this.f95222h = z;
    }

    public ProfileTabView(Context context) {
        super(context);
        m117267a();
    }

    public void setDescription(String str) {
        this.f95215a.setText(str);
    }

    public void setText(String str) {
        this.f95217c.setText(str);
    }

    public void setTextColor(int i) {
        this.f95217c.setTextColor(i);
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f95220f.cancel();
        this.f95221g.cancel();
        if (z) {
            if (this.f95222h) {
                m117270d();
            }
        } else if (this.f95222h) {
            m117271e();
        }
    }

    public void setDrawableLeft(Drawable drawable) {
        this.f95217c.setCompoundDrawables(drawable, null, null, null);
        if (VERSION.SDK_INT >= 17) {
            this.f95217c.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, null, null, null);
        }
        this.f95217c.setCompoundDrawablePadding((int) C9738o.m28708b(getContext(), 3.5f));
    }

    /* renamed from: a */
    public final void mo92320a(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = floatValue - 1.0f;
        this.f95217c.setTranslationY(((float) this.f95218d) * f);
        float f2 = 1.0f - floatValue;
        float f3 = 1.0f - (0.13f * f2);
        this.f95217c.setScaleX(f3);
        this.f95217c.setScaleY(f3);
        this.f95215a.setTranslationY(f * ((float) (this.f95218d - this.f95219e)));
        this.f95215a.setAlpha(f2);
    }

    public ProfileTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m117267a();
    }

    public ProfileTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m117267a();
    }
}
