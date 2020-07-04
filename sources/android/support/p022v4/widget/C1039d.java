package android.support.p022v4.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.p022v4.util.C0903j;
import android.support.p022v4.view.animation.FastOutSlowInInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

/* renamed from: android.support.v4.widget.d */
public final class C1039d extends Drawable implements Animatable {

    /* renamed from: d */
    private static final Interpolator f3611d = new LinearInterpolator();

    /* renamed from: e */
    private static final Interpolator f3612e = new FastOutSlowInInterpolator();

    /* renamed from: f */
    private static final int[] f3613f = {-16777216};

    /* renamed from: a */
    public float f3614a;

    /* renamed from: b */
    float f3615b;

    /* renamed from: c */
    boolean f3616c;

    /* renamed from: g */
    private final C1042a f3617g = new C1042a();

    /* renamed from: h */
    private Resources f3618h;

    /* renamed from: i */
    private Animator f3619i;

    /* renamed from: android.support.v4.widget.d$a */
    static class C1042a {

        /* renamed from: a */
        final RectF f3624a = new RectF();

        /* renamed from: b */
        final Paint f3625b = new Paint();

        /* renamed from: c */
        final Paint f3626c = new Paint();

        /* renamed from: d */
        final Paint f3627d = new Paint();

        /* renamed from: e */
        public float f3628e = 0.0f;

        /* renamed from: f */
        public float f3629f = 0.0f;

        /* renamed from: g */
        public float f3630g = 0.0f;

        /* renamed from: h */
        public float f3631h = 5.0f;

        /* renamed from: i */
        public int[] f3632i;

        /* renamed from: j */
        int f3633j;

        /* renamed from: k */
        public float f3634k;

        /* renamed from: l */
        public float f3635l;

        /* renamed from: m */
        public float f3636m;

        /* renamed from: n */
        public boolean f3637n;

        /* renamed from: o */
        Path f3638o;

        /* renamed from: p */
        public float f3639p = 1.0f;

        /* renamed from: q */
        public float f3640q;

        /* renamed from: r */
        int f3641r;

        /* renamed from: s */
        int f3642s;

        /* renamed from: t */
        public int f3643t = NormalGiftView.ALPHA_255;

        /* renamed from: u */
        public int f3644u;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo4117b() {
            mo4112a(m4488f());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final int mo4119c() {
            return this.f3632i[this.f3633j];
        }

        /* renamed from: f */
        private int m4488f() {
            return (this.f3633j + 1) % this.f3632i.length;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo4109a() {
            return this.f3632i[m4488f()];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final void mo4120d() {
            this.f3634k = this.f3628e;
            this.f3635l = this.f3629f;
            this.f3636m = this.f3630g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public final void mo4121e() {
            this.f3634k = 0.0f;
            this.f3635l = 0.0f;
            this.f3636m = 0.0f;
            this.f3628e = 0.0f;
            this.f3629f = 0.0f;
            this.f3630g = 0.0f;
        }

        C1042a() {
            this.f3625b.setStrokeCap(Cap.SQUARE);
            this.f3625b.setAntiAlias(true);
            this.f3625b.setStyle(Style.STROKE);
            this.f3626c.setStyle(Style.FILL);
            this.f3626c.setAntiAlias(true);
            this.f3627d.setColor(0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo4110a(float f) {
            this.f3631h = f;
            this.f3625b.setStrokeWidth(f);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo4118b(float f) {
            if (f != this.f3639p) {
                this.f3639p = f;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo4112a(int i) {
            this.f3633j = i;
            this.f3644u = this.f3632i[this.f3633j];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo4114a(ColorFilter colorFilter) {
            this.f3625b.setColorFilter(colorFilter);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo4115a(boolean z) {
            if (this.f3637n != z) {
                this.f3637n = z;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo4116a(int[] iArr) {
            this.f3632i = iArr;
            mo4112a(0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo4111a(float f, float f2) {
            this.f3641r = (int) f;
            this.f3642s = (int) f2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo4113a(Canvas canvas, Rect rect) {
            RectF rectF = this.f3624a;
            float f = this.f3640q + (this.f3631h / 2.0f);
            if (this.f3640q <= 0.0f) {
                f = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.f3641r) * this.f3639p) / 2.0f, this.f3631h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f, ((float) rect.centerY()) - f, ((float) rect.centerX()) + f, ((float) rect.centerY()) + f);
            float f2 = (this.f3628e + this.f3630g) * 360.0f;
            float f3 = ((this.f3629f + this.f3630g) * 360.0f) - f2;
            this.f3625b.setColor(this.f3644u);
            this.f3625b.setAlpha(this.f3643t);
            float f4 = this.f3631h / 2.0f;
            rectF.inset(f4, f4);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f3627d);
            float f5 = -f4;
            rectF.inset(f5, f5);
            canvas.drawArc(rectF, f2, f3, false, this.f3625b);
            m4487a(canvas, f2, f3, rectF);
        }

        /* renamed from: a */
        private void m4487a(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f3637n) {
                if (this.f3638o == null) {
                    this.f3638o = new Path();
                    this.f3638o.setFillType(FillType.EVEN_ODD);
                } else {
                    this.f3638o.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f3 = (((float) this.f3641r) * this.f3639p) / 2.0f;
                this.f3638o.moveTo(0.0f, 0.0f);
                this.f3638o.lineTo(((float) this.f3641r) * this.f3639p, 0.0f);
                this.f3638o.lineTo((((float) this.f3641r) * this.f3639p) / 2.0f, ((float) this.f3642s) * this.f3639p);
                this.f3638o.offset((min + rectF.centerX()) - f3, rectF.centerY() + (this.f3631h / 2.0f));
                this.f3638o.close();
                this.f3626c.setColor(this.f3644u);
                this.f3626c.setAlpha(this.f3643t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f3638o, this.f3626c);
                canvas.restore();
            }
        }
    }

    /* renamed from: a */
    private static int m4474a(float f, int i, int i2) {
        int i3 = (i >> 24) & NormalGiftView.ALPHA_255;
        int i4 = (i >> 16) & NormalGiftView.ALPHA_255;
        int i5 = (i >> 8) & NormalGiftView.ALPHA_255;
        int i6 = i & NormalGiftView.ALPHA_255;
        return ((i3 + ((int) (((float) (((i2 >> 24) & NormalGiftView.ALPHA_255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & NormalGiftView.ALPHA_255) - i4)) * f))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & NormalGiftView.ALPHA_255) - i5)) * f))) << 8) | (i6 + ((int) (f * ((float) ((i2 & NormalGiftView.ALPHA_255) - i6)))));
    }

    public final int getOpacity() {
        return -3;
    }

    /* renamed from: a */
    public final void mo4093a(boolean z) {
        this.f3617g.mo4115a(z);
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo4094a(int... iArr) {
        this.f3617g.mo4116a(iArr);
        this.f3617g.mo4112a(0);
        invalidateSelf();
    }

    public final int getAlpha() {
        return this.f3617g.f3643t;
    }

    public final boolean isRunning() {
        return this.f3619i.isRunning();
    }

    public final void stop() {
        this.f3619i.cancel();
        this.f3614a = 0.0f;
        this.f3617g.mo4115a(false);
        this.f3617g.mo4112a(0);
        this.f3617g.mo4121e();
        invalidateSelf();
    }

    public final void start() {
        this.f3619i.cancel();
        this.f3617g.mo4120d();
        if (this.f3617g.f3629f != this.f3617g.f3628e) {
            this.f3616c = true;
            this.f3619i.setDuration(666);
            this.f3619i.start();
            return;
        }
        this.f3617g.mo4112a(0);
        this.f3617g.mo4121e();
        this.f3619i.setDuration(1332);
        this.f3619i.start();
    }

    /* renamed from: a */
    private void m4475a() {
        final C1042a aVar = this.f3617g;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C1039d.this.mo4090a(floatValue, aVar);
                C1039d.this.mo4091a(floatValue, aVar, false);
                C1039d.this.invalidateSelf();
            }
        });
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f3611d);
        ofFloat.addListener(new AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
                C1039d.this.f3615b = 0.0f;
            }

            public final void onAnimationRepeat(Animator animator) {
                C1039d.this.mo4091a(1.0f, aVar, true);
                aVar.mo4120d();
                aVar.mo4117b();
                if (C1039d.this.f3616c) {
                    C1039d.this.f3616c = false;
                    animator.cancel();
                    animator.setDuration(1332);
                    animator.start();
                    aVar.mo4115a(false);
                    return;
                }
                C1039d.this.f3615b += 1.0f;
            }
        });
        this.f3619i = ofFloat;
    }

    /* renamed from: b */
    public final void mo4095b(float f) {
        this.f3617g.f3630g = f;
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        this.f3617g.f3643t = i;
        invalidateSelf();
    }

    /* renamed from: c */
    private void m4478c(float f) {
        this.f3617g.mo4110a(2.5f);
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo4088a(float f) {
        this.f3617g.mo4118b(f);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3617g.mo4114a(colorFilter);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f3614a, bounds.exactCenterX(), bounds.exactCenterY());
        this.f3617g.mo4113a(canvas, bounds);
        canvas.restore();
    }

    public C1039d(Context context) {
        this.f3618h = ((Context) C0903j.m3840a(context)).getResources();
        this.f3617g.mo4116a(f3613f);
        m4478c(2.5f);
        m4475a();
    }

    /* renamed from: a */
    public final void mo4092a(int i) {
        if (i == 0) {
            m4476a(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m4476a(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* renamed from: b */
    private void m4477b(float f, C1042a aVar) {
        mo4090a(f, aVar);
        float floor = (float) (Math.floor((double) (aVar.f3636m / 0.8f)) + 1.0d);
        aVar.f3628e = aVar.f3634k + (((aVar.f3635l - 0.01f) - aVar.f3634k) * f);
        aVar.f3629f = aVar.f3635l;
        aVar.f3630g = aVar.f3636m + ((floor - aVar.f3636m) * f);
    }

    /* renamed from: a */
    public final void mo4089a(float f, float f2) {
        this.f3617g.f3628e = 0.0f;
        this.f3617g.f3629f = f2;
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4090a(float f, C1042a aVar) {
        if (f > 0.75f) {
            aVar.f3644u = m4474a((f - 0.75f) / 0.25f, aVar.mo4119c(), aVar.mo4109a());
        } else {
            aVar.f3644u = aVar.mo4119c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4091a(float f, C1042a aVar, boolean z) {
        float f2;
        float f3;
        if (this.f3616c) {
            m4477b(f, aVar);
            return;
        }
        if (f != 1.0f || z) {
            float f4 = aVar.f3636m;
            if (f < 0.5f) {
                float f5 = f / 0.5f;
                float f6 = aVar.f3634k;
                float f7 = f6;
                f2 = (f3612e.getInterpolation(f5) * 0.79f) + 0.01f + f6;
                f3 = f7;
            } else {
                f2 = aVar.f3634k + 0.79f;
                f3 = f2 - (((1.0f - f3612e.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            float f8 = f4 + (0.20999998f * f);
            float f9 = (f + this.f3615b) * 216.0f;
            aVar.f3628e = f3;
            aVar.f3629f = f2;
            aVar.f3630g = f8;
            this.f3614a = f9;
        }
    }

    /* renamed from: a */
    private void m4476a(float f, float f2, float f3, float f4) {
        C1042a aVar = this.f3617g;
        float f5 = this.f3618h.getDisplayMetrics().density;
        aVar.mo4110a(f2 * f5);
        aVar.f3640q = f * f5;
        aVar.mo4112a(0);
        aVar.mo4111a(f3 * f5, f4 * f5);
    }
}
