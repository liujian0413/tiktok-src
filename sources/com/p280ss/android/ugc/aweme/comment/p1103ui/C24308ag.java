package com.p280ss.android.ugc.aweme.comment.p1103ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Bitmap;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.ag */
final /* synthetic */ class C24308ag implements AnimatorUpdateListener {

    /* renamed from: a */
    private final KeyboardDialogFragment f64203a;

    /* renamed from: b */
    private final Bitmap f64204b;

    /* renamed from: c */
    private final MarginLayoutParams f64205c;

    /* renamed from: d */
    private final int f64206d;

    /* renamed from: e */
    private final int f64207e;

    /* renamed from: f */
    private final int f64208f;

    /* renamed from: g */
    private final int f64209g;

    /* renamed from: h */
    private final LayoutParams f64210h;

    /* renamed from: i */
    private final int f64211i;

    /* renamed from: j */
    private final int f64212j;

    C24308ag(KeyboardDialogFragment keyboardDialogFragment, Bitmap bitmap, MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, LayoutParams layoutParams, int i5, int i6) {
        this.f64203a = keyboardDialogFragment;
        this.f64204b = bitmap;
        this.f64205c = marginLayoutParams;
        this.f64206d = i;
        this.f64207e = i2;
        this.f64208f = i3;
        this.f64209g = i4;
        this.f64210h = layoutParams;
        this.f64211i = i5;
        this.f64212j = i6;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f64203a.mo63147a(this.f64204b, this.f64205c, this.f64206d, this.f64207e, this.f64208f, this.f64209g, this.f64210h, this.f64211i, this.f64212j, valueAnimator);
    }
}
