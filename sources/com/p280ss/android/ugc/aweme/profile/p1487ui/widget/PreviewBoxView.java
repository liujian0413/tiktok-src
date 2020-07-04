package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.PreviewBoxView */
public class PreviewBoxView extends View {

    /* renamed from: a */
    public boolean f96081a;

    /* renamed from: b */
    public float f96082b;

    /* renamed from: c */
    public C36616a f96083c;

    /* renamed from: d */
    private Paint f96084d;

    /* renamed from: e */
    private ValueAnimator f96085e;

    /* renamed from: f */
    private int f96086f;

    /* renamed from: g */
    private int f96087g;

    /* renamed from: h */
    private float f96088h = 0.5625f;

    /* renamed from: i */
    private RectF f96089i;

    /* renamed from: j */
    private Bitmap f96090j;

    /* renamed from: k */
    private int f96091k = -1;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.PreviewBoxView$a */
    public interface C36616a {
        /* renamed from: a */
        void mo92197a();

        /* renamed from: a */
        void mo92198a(float f);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public Rect getVisibleRect() {
        Rect rect = new Rect();
        rect.set((int) this.f96089i.left, (int) this.f96089i.top, (int) this.f96089i.right, (int) this.f96089i.bottom);
        return rect;
    }

    /* renamed from: c */
    private void m118151c() {
        int width = getWidth() - (this.f96086f * 2);
        int i = (int) (((float) width) * this.f96088h);
        int i2 = this.f96091k;
        if (i2 < 0) {
            i2 = Math.max(0, (getHeight() - i) / 2);
        }
        this.f96089i = new RectF((float) this.f96086f, (float) i2, (float) (this.f96086f + width), (float) (i2 + i));
    }

    /* renamed from: b */
    public final void mo92894b() {
        if (this.f96085e != null && this.f96085e.isStarted()) {
            this.f96085e.cancel();
        }
        if (Math.abs(this.f96082b - 0.5f) >= Float.MIN_NORMAL) {
            this.f96082b = 0.5f;
            setAlpha(this.f96082b);
            if (this.f96083c != null) {
                this.f96083c.mo92197a();
            }
        }
    }

    /* renamed from: a */
    public final void mo92892a() {
        if (Math.abs(this.f96082b - 0.85f) >= Float.MIN_NORMAL && !this.f96081a) {
            this.f96081a = true;
            this.f96085e = ValueAnimator.ofFloat(new float[]{0.5f, 0.85f});
            this.f96085e.setEvaluator(new FloatEvaluator());
            this.f96085e.setDuration(300);
            this.f96085e.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PreviewBoxView.this.f96082b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    PreviewBoxView.this.setAlpha(PreviewBoxView.this.f96082b);
                    if (PreviewBoxView.this.f96083c != null) {
                        PreviewBoxView.this.f96083c.mo92198a(valueAnimator.getAnimatedFraction());
                    }
                }
            });
            this.f96085e.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    PreviewBoxView.this.f96082b = 0.85f;
                    PreviewBoxView.this.f96081a = false;
                }
            });
            this.f96085e.setStartDelay(300);
            this.f96085e.start();
        }
    }

    /* renamed from: a */
    public final PreviewBoxView mo92890a(float f) {
        this.f96088h = f;
        return this;
    }

    /* renamed from: b */
    public final PreviewBoxView mo92893b(int i) {
        this.f96086f = i;
        return this;
    }

    public void setTopOffset(int i) {
        this.f96091k = i;
    }

    /* renamed from: a */
    public final PreviewBoxView mo92891a(int i) {
        this.f96087g = i;
        return this;
    }

    public PreviewBoxView(Context context) {
        super(context);
        m118149a(context);
    }

    public void onDraw(Canvas canvas) {
        if (this.f96089i != null) {
            m118150a(canvas);
        }
    }

    /* renamed from: a */
    private void m118149a(Context context) {
        this.f96084d = new Paint();
        this.f96084d.setAntiAlias(true);
        this.f96086f = (int) C9738o.m28708b(context, 16.0f);
        this.f96082b = 0.5f;
        setAlpha(this.f96082b);
    }

    /* renamed from: a */
    private void m118150a(Canvas canvas) {
        if (this.f96090j == null) {
            boolean z = false;
            if (C6399b.m19946v()) {
                int width = getWidth();
                int height = getHeight();
                RectF rectF = this.f96089i;
                int parseColor = Color.parseColor("#d9ffffff");
                if (this.f96087g == 1) {
                    z = true;
                }
                this.f96090j = m118148a(width, height, rectF, parseColor, z);
            } else {
                int width2 = getWidth();
                int height2 = getHeight();
                RectF rectF2 = this.f96089i;
                int parseColor2 = Color.parseColor("#d9161823");
                if (this.f96087g == 1) {
                    z = true;
                }
                this.f96090j = m118148a(width2, height2, rectF2, parseColor2, z);
            }
        }
        canvas.drawBitmap(this.f96090j, 0.0f, 0.0f, this.f96084d);
    }

    public PreviewBoxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m118149a(context);
    }

    public PreviewBoxView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m118149a(context);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m118151c();
    }

    /* renamed from: a */
    private static Bitmap m118148a(int i, int i2, RectF rectF, int i3, boolean z) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Config.ARGB_4444);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(i3);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        if (z) {
            canvas.drawOval(rectF, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        return createBitmap;
    }
}
