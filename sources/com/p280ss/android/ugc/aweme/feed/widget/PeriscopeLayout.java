package com.p280ss.android.ugc.aweme.feed.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.view.C0991u;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.performance.C29349b;
import com.p280ss.android.ugc.aweme.performance.C7188c;
import com.p280ss.android.ugc.aweme.utils.C43169t;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.PeriscopeLayout */
public class PeriscopeLayout extends FrameLayout {

    /* renamed from: a */
    public Random f76541a = new Random();

    /* renamed from: b */
    int f76542b;

    /* renamed from: c */
    public int f76543c;

    /* renamed from: d */
    public Handler f76544d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private int f76545e;

    /* renamed from: f */
    private int f76546f;

    /* renamed from: g */
    private LayoutParams f76547g;

    /* renamed from: h */
    private Drawable[] f76548h;

    /* renamed from: i */
    private Queue<ImageView> f76549i;

    /* renamed from: j */
    private int f76550j;

    /* renamed from: k */
    private int f76551k;

    /* renamed from: l */
    private Runnable f76552l = new Runnable() {
        public final void run() {
            PeriscopeLayout.this.mo74423a();
            if (PeriscopeLayout.this.f76544d != null) {
                PeriscopeLayout.this.f76544d.postDelayed(this, (long) PeriscopeLayout.this.f76542b);
            }
        }
    };

    /* renamed from: m */
    private boolean f76553m;

    /* renamed from: n */
    private int f76554n = 0;

    /* renamed from: o */
    private float f76555o;

    /* renamed from: p */
    private float f76556p;

    /* renamed from: q */
    private float f76557q;

    /* renamed from: r */
    private float f76558r;

    /* renamed from: s */
    private float f76559s;

    /* renamed from: t */
    private float f76560t = -1.0f;

    /* renamed from: u */
    private float f76561u = -1.0f;

    /* renamed from: v */
    private PointF f76562v;

    /* renamed from: w */
    private PointF f76563w;

    /* renamed from: x */
    private PointF f76564x;

    /* renamed from: com.ss.android.ugc.aweme.feed.widget.PeriscopeLayout$a */
    class C29047a implements AnimatorUpdateListener {

        /* renamed from: a */
        public View f76569a;

        /* renamed from: c */
        private int f76571c;

        /* renamed from: d */
        private int f76572d;

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (this.f76569a != null && this.f76569a.getTag() != null) {
                PointF pointF = (PointF) valueAnimator.getAnimatedValue();
                this.f76569a.setX(pointF.x);
                this.f76569a.setY(pointF.y);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction <= 0.7f) {
                    float f = animatedFraction / 0.7f;
                    this.f76569a.setAlpha(0.7f * f);
                    float f2 = (f * 0.3f) + 0.3f;
                    this.f76569a.setScaleX(f2);
                    this.f76569a.setScaleY(f2);
                } else if (((double) animatedFraction) <= 0.8d) {
                    this.f76569a.setAlpha(0.7f);
                    this.f76569a.setScaleX(0.6f);
                    this.f76569a.setScaleY(0.6f);
                } else if (animatedFraction <= 1.0f) {
                    float f3 = (animatedFraction - 0.8f) / 0.2f;
                    this.f76569a.setAlpha((1.0f - f3) * 0.7f);
                    float f4 = (f3 * 0.1f) + 0.6f;
                    this.f76569a.setScaleX(f4);
                    this.f76569a.setScaleY(f4);
                    if (((double) (1.0f - animatedFraction)) < 1.0E-10d) {
                        PeriscopeLayout.this.mo74426a(this.f76569a);
                        return;
                    }
                }
                if (animatedFraction <= 0.5f) {
                    this.f76569a.setRotation((animatedFraction / 0.5f) * 20.0f * ((float) this.f76571c));
                } else {
                    this.f76569a.setRotation((((animatedFraction - 0.5f) / 0.5f) * 20.0f * ((float) this.f76572d)) + ((float) (this.f76571c * 20)));
                }
            }
        }

        public C29047a(View view) {
            int i;
            this.f76569a = view;
            int i2 = -1;
            if (PeriscopeLayout.this.f76541a.nextBoolean()) {
                i = 1;
            } else {
                i = -1;
            }
            this.f76571c = i;
            if (PeriscopeLayout.this.f76541a.nextBoolean()) {
                i2 = 1;
            }
            this.f76572d = i2;
        }
    }

    /* renamed from: g */
    private void m95308g() {
        this.f76544d.removeCallbacksAndMessages(null);
    }

    /* renamed from: b */
    public final void mo74427b() {
        m95308g();
        this.f76544d.removeCallbacks(this.f76552l);
        m95307f();
    }

    /* renamed from: c */
    public final void mo74428c() {
        m95307f();
        m95308g();
        this.f76544d.removeCallbacks(this.f76552l);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f76544d.removeCallbacksAndMessages(null);
    }

    /* renamed from: f */
    private void m95307f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            mo74426a(getChildAt(i));
        }
    }

    /* renamed from: a */
    public final void mo74423a() {
        ImageView e = m95306e();
        Drawable[] drawableArr = this.f76548h;
        int i = this.f76554n;
        this.f76554n = i + 1;
        e.setImageDrawable(drawableArr[i & 1]);
        ValueAnimator b = m95304b(e);
        e.setTag(b);
        b.start();
    }

    /* renamed from: e */
    private ImageView m95306e() {
        if (!this.f76549i.isEmpty()) {
            return (ImageView) this.f76549i.poll();
        }
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(this.f76547g);
        addView(imageView);
        return imageView;
    }

    /* renamed from: d */
    private void m95305d() {
        this.f76549i = new LinkedList();
        this.f76548h = new Drawable[2];
        Drawable drawable = getResources().getDrawable(R.drawable.a8n);
        Drawable drawable2 = getResources().getDrawable(R.drawable.a8o);
        this.f76548h[0] = drawable;
        this.f76548h[1] = drawable2;
        this.f76550j = drawable.getIntrinsicHeight();
        this.f76551k = drawable.getIntrinsicWidth();
        this.f76547g = new LayoutParams(this.f76551k, this.f76550j);
        this.f76555o = C9738o.m28708b(getContext(), 51.0f);
        this.f76556p = C9738o.m28708b(getContext(), 48.0f);
        this.f76557q = C9738o.m28708b(getContext(), 20.0f);
        this.f76558r = C9738o.m28708b(getContext(), 8.0f);
        this.f76559s = C9738o.m28708b(getContext(), 2.0f);
    }

    public PeriscopeLayout(Context context) {
        super(context);
        m95305d();
    }

    /* renamed from: a */
    public final void mo74424a(int i) {
        this.f76542b = i;
        this.f76544d.removeCallbacksAndMessages(null);
        this.f76544d.postDelayed(this.f76552l, (long) (this.f76541a.nextInt(4) * 100));
    }

    /* renamed from: a */
    public final void mo74426a(View view) {
        if (view.getTag() != null) {
            this.f76549i.add((ImageView) view);
            ValueAnimator valueAnimator = (ValueAnimator) view.getTag();
            if (valueAnimator != null) {
                valueAnimator.setTarget(null);
                valueAnimator.cancel();
                valueAnimator.removeAllUpdateListeners();
            }
            if (view.getTag(R.id.dg0) instanceof C29047a) {
                C29047a aVar = (C29047a) view.getTag(R.id.dg0);
                if (aVar != null) {
                    aVar.f76569a = null;
                }
            }
            view.setAlpha(0.0f);
            view.setScaleX(0.3f);
            view.setScaleY(0.3f);
            view.setRotation(0.0f);
            view.setTag(null);
        }
    }

    /* renamed from: b */
    private ValueAnimator m95304b(View view) {
        float f;
        float f2;
        if (this.f76560t == -1.0f) {
            this.f76560t = this.f76556p;
            float f3 = this.f76557q;
            this.f76561u = this.f76557q;
            if (this.f76553m) {
                this.f76560t = (((float) this.f76546f) - this.f76560t) - this.f76561u;
                f3 = (((float) this.f76546f) - f3) - this.f76561u;
            }
            this.f76562v = new PointF(this.f76560t, ((float) (this.f76545e - this.f76550j)) - this.f76558r);
            this.f76563w = new PointF(f3, this.f76555o);
            if (this.f76553m) {
                f2 = ((float) this.f76551k) - this.f76561u;
            } else {
                f2 = (float) (this.f76546f - this.f76551k);
            }
            this.f76564x = new PointF(f2, ((float) (this.f76545e - this.f76550j)) - this.f76559s);
        }
        C43169t tVar = new C43169t(this.f76562v, this.f76563w);
        Object[] objArr = new Object[2];
        objArr[0] = this.f76564x;
        if (this.f76553m) {
            f = (((float) this.f76546f) - this.f76561u) - C9738o.m28708b(getContext(), (float) (this.f76541a.nextInt(30) + 12));
        } else {
            f = C9738o.m28708b(getContext(), (float) (this.f76541a.nextInt(30) + 12));
        }
        objArr[1] = new PointF(f, 0.0f);
        ValueAnimator ofObject = ValueAnimator.ofObject(tVar, objArr);
        C29047a aVar = new C29047a(view);
        ofObject.addUpdateListener(aVar);
        ofObject.setTarget(view);
        view.setTag(R.id.dg0, aVar);
        ofObject.setDuration((long) this.f76543c);
        return ofObject;
    }

    /* renamed from: a */
    public final void mo74425a(int i, int i2) {
        C7188c.m22427a((C29349b) new C29349b(3000, 800) {
            /* renamed from: a */
            public final void mo74432a() {
                PeriscopeLayout.this.f76543c = 3000;
                PeriscopeLayout.this.mo74424a(800);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f76546f = getMeasuredWidth();
        this.f76545e = getMeasuredHeight();
        boolean z = true;
        if (C0991u.m4220h(this) != 1) {
            z = false;
        }
        this.f76553m = z;
        this.f76560t = -1.0f;
    }

    public PeriscopeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m95305d();
    }

    public PeriscopeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m95305d();
    }

    public PeriscopeLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m95305d();
    }
}
