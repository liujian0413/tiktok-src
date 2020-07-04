package com.twitter.sdk.android.tweetui.internal;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;

/* renamed from: com.twitter.sdk.android.tweetui.internal.j */
public final class C47077j implements OnTouchListener {

    /* renamed from: a */
    public C47078a f120809a;

    /* renamed from: b */
    public boolean f120810b;

    /* renamed from: c */
    private int f120811c;

    /* renamed from: d */
    private float f120812d;

    /* renamed from: e */
    private final float f120813e;

    /* renamed from: f */
    private final float f120814f;

    /* renamed from: g */
    private float f120815g;

    /* renamed from: h */
    private float f120816h;

    /* renamed from: i */
    private int f120817i;

    /* renamed from: com.twitter.sdk.android.tweetui.internal.j$a */
    public interface C47078a {
        /* renamed from: a */
        void mo118173a();
    }

    /* renamed from: com.twitter.sdk.android.tweetui.internal.j$b */
    public interface C47079b {
        /* renamed from: c */
        boolean mo118263c();
    }

    /* renamed from: a */
    private boolean m147182a(float f) {
        if (Math.abs(f) > ((float) this.f120811c)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private double m147187b(float f) {
        return 1.0d - (Math.pow((double) Math.abs(f), 2.0d) / Math.pow((double) (this.f120814f * 2.0f), 2.0d));
    }

    /* renamed from: c */
    private float m147189c(float f) {
        if (f < (-this.f120813e)) {
            return -this.f120813e;
        }
        if (f > this.f120813e) {
            return this.f120813e;
        }
        return f;
    }

    /* renamed from: b */
    private void m147188b(View view) {
        if (view.getTranslationY() != 0.0f) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{0.0f}).setDuration(100);
            duration.addUpdateListener(new C47080k(this));
            duration.start();
        }
    }

    /* renamed from: a */
    private boolean m147184a(MotionEvent motionEvent) {
        if (this.f120817i < 0 || motionEvent.getPointerCount() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m147185a(View view) {
        float translationY = view.getTranslationY();
        if (translationY > this.f120814f || translationY < (-this.f120814f)) {
            if (this.f120809a != null) {
                this.f120809a.mo118173a();
            }
            return true;
        }
        m147188b(view);
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo118350a(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    /* renamed from: a */
    private void m147181a(View view, float f) {
        float translationY = view.getTranslationY();
        double d = (double) f;
        double b = m147187b(translationY);
        Double.isNaN(d);
        view.setTranslationY(m147189c(translationY + ((float) (d * b))));
    }

    /* renamed from: a */
    public static C47077j m147180a(View view, C47078a aVar) {
        return new C47077j(aVar, ViewConfiguration.get(view.getContext()).getScaledTouchSlop(), ((float) view.getContext().getResources().getDisplayMetrics().heightPixels) * 0.5f);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        if (!(view instanceof C47079b) || ((C47079b) view).mo118263c() || this.f120810b) {
            z = m147186a(view, motionEvent);
        } else {
            z = false;
        }
        if (z || view.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m147183a(float f, float f2) {
        if (Math.abs(f2) > Math.abs(f)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m147186a(View view, MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 5) {
            switch (actionMasked) {
                case 0:
                    this.f120815g = motionEvent.getRawX();
                    float rawY = motionEvent.getRawY();
                    this.f120816h = rawY;
                    this.f120812d = rawY;
                    this.f120810b = false;
                    this.f120817i = motionEvent.getPointerId(motionEvent.getPointerCount() - 1);
                    break;
                case 1:
                case 3:
                    if (!m147184a(motionEvent) || !this.f120810b) {
                        z = false;
                    } else {
                        z = m147185a(view);
                    }
                    this.f120810b = false;
                    return z;
                case 2:
                    float rawX = motionEvent.getRawX();
                    float rawY2 = motionEvent.getRawY();
                    float f = rawY2 - this.f120812d;
                    float f2 = rawX - this.f120815g;
                    float f3 = rawY2 - this.f120816h;
                    this.f120815g = rawX;
                    this.f120816h = rawY2;
                    if (m147184a(motionEvent) && (this.f120810b || (m147182a(f) && m147183a(f2, f3)))) {
                        this.f120810b = true;
                        m147181a(view, f3);
                        break;
                    }
            }
        } else {
            m147188b(view);
            this.f120810b = false;
            this.f120817i = -1;
        }
        return false;
    }

    private C47077j(C47078a aVar, int i, float f) {
        this(aVar, i, f, 0.2f * f);
    }

    private C47077j(C47078a aVar, int i, float f, float f2) {
        this.f120809a = aVar;
        this.f120811c = i;
        this.f120813e = f;
        this.f120814f = f2;
    }
}
