package com.bytedance.android.livesdk.feed.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.android.livesdk.feed.feed.C5989f;
import java.util.List;

public class LiveFeedFloatTabView extends LiveTabIndicator {

    /* renamed from: a */
    public boolean f21124a;

    /* renamed from: c */
    private boolean f21125c;

    /* renamed from: d */
    private Animator f21126d;

    /* renamed from: e */
    private Animator f21127e;

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f21125c = true;
    }

    /* renamed from: c */
    public final void mo20512c() {
        if (this.f21125c) {
            if (this.f21126d != null && this.f21126d.isRunning()) {
                this.f21126d.cancel();
            }
            setTranslationY((float) (-getHeight()));
            this.f21124a = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f21125c = false;
        if (this.f21126d != null && this.f21126d.isRunning()) {
            this.f21126d.cancel();
        }
        if (this.f21127e != null && this.f21127e.isRunning()) {
            this.f21127e.cancel();
        }
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    public final void mo20510a() {
        if (this.f21125c && !this.f21124a) {
            if (this.f21127e != null && this.f21127e.isRunning()) {
                this.f21127e.cancel();
            }
            this.f21126d = ObjectAnimator.ofFloat(this, "translationY", new float[]{getTranslationY(), 0.0f});
            this.f21126d.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    LiveFeedFloatTabView.this.f21124a = true;
                }
            });
            this.f21126d.start();
        }
    }

    /* renamed from: b */
    public final void mo20511b() {
        if (this.f21125c && this.f21124a) {
            if (this.f21126d != null && this.f21126d.isRunning()) {
                this.f21126d.cancel();
            }
            this.f21127e = ObjectAnimator.ofFloat(this, "translationY", new float[]{getTranslationY(), (float) (-getHeight())});
            this.f21127e.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    LiveFeedFloatTabView.this.f21124a = false;
                }
            });
            this.f21127e.start();
        }
    }

    public void setTabList(List<C5989f> list) {
        setTitles(list);
    }

    public LiveFeedFloatTabView(Context context) {
        this(context, null);
    }

    public LiveFeedFloatTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveFeedFloatTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
