package com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget;

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
import android.graphics.drawable.Drawable.Callback;
import android.support.p022v4.view.animation.FastOutSlowInInterpolator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.c */
final class C23390c extends Drawable implements Animatable {

    /* renamed from: a */
    static final Interpolator f61547a = new FastOutSlowInInterpolator();

    /* renamed from: e */
    private static final Interpolator f61548e = new LinearInterpolator();

    /* renamed from: f */
    private static final int[] f61549f = {-16777216};

    /* renamed from: b */
    public float f61550b;

    /* renamed from: c */
    float f61551c;

    /* renamed from: d */
    boolean f61552d;

    /* renamed from: g */
    private final ArrayList<Animation> f61553g = new ArrayList<>();

    /* renamed from: h */
    private final C23394a f61554h;

    /* renamed from: i */
    private Resources f61555i;

    /* renamed from: j */
    private View f61556j;

    /* renamed from: k */
    private Animation f61557k;

    /* renamed from: l */
    private double f61558l;

    /* renamed from: m */
    private double f61559m;

    /* renamed from: n */
    private final Callback f61560n = new Callback() {
        public final void invalidateDrawable(Drawable drawable) {
            C23390c.this.invalidateSelf();
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C23390c.this.unscheduleSelf(runnable);
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C23390c.this.scheduleSelf(runnable, j);
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.c$a */
    static class C23394a {

        /* renamed from: a */
        public float f61566a = 0.0f;

        /* renamed from: b */
        public float f61567b = 0.0f;

        /* renamed from: c */
        public float f61568c = 0.0f;

        /* renamed from: d */
        public float f61569d = 5.0f;

        /* renamed from: e */
        public float f61570e = 2.5f;

        /* renamed from: f */
        public float f61571f;

        /* renamed from: g */
        public float f61572g;

        /* renamed from: h */
        public float f61573h;

        /* renamed from: i */
        public double f61574i;

        /* renamed from: j */
        public int f61575j;

        /* renamed from: k */
        public int f61576k;

        /* renamed from: l */
        public int f61577l;

        /* renamed from: m */
        private final RectF f61578m = new RectF();

        /* renamed from: n */
        private final Paint f61579n = new Paint();

        /* renamed from: o */
        private final Paint f61580o = new Paint();

        /* renamed from: p */
        private final Callback f61581p;

        /* renamed from: q */
        private int[] f61582q;

        /* renamed from: r */
        private int f61583r;

        /* renamed from: s */
        private boolean f61584s;

        /* renamed from: t */
        private Path f61585t;

        /* renamed from: u */
        private float f61586u;

        /* renamed from: v */
        private int f61587v;

        /* renamed from: w */
        private int f61588w;

        /* renamed from: x */
        private final Paint f61589x = new Paint(1);

        /* renamed from: a */
        public final void mo60788a(int[] iArr) {
            this.f61582q = iArr;
            mo60783a(0);
        }

        /* renamed from: g */
        private void m76708g() {
            this.f61581p.invalidateDrawable(null);
        }

        /* renamed from: b */
        public final void mo60789b() {
            mo60783a(m76707f());
        }

        /* renamed from: c */
        public final int mo60791c() {
            return this.f61582q[this.f61583r];
        }

        /* renamed from: f */
        private int m76707f() {
            return (this.f61583r + 1) % this.f61582q.length;
        }

        /* renamed from: a */
        public final int mo60780a() {
            return this.f61582q[m76707f()];
        }

        /* renamed from: d */
        public final void mo60793d() {
            this.f61571f = this.f61566a;
            this.f61572g = this.f61567b;
            this.f61573h = this.f61568c;
        }

        /* renamed from: e */
        public final void mo60795e() {
            this.f61571f = 0.0f;
            this.f61572g = 0.0f;
            this.f61573h = 0.0f;
            mo60790b(0.0f);
            mo60792c(0.0f);
            mo60794d(0.0f);
        }

        /* renamed from: d */
        public final void mo60794d(float f) {
            this.f61568c = f;
            m76708g();
        }

        /* renamed from: b */
        public final void mo60790b(float f) {
            this.f61566a = f;
            m76708g();
        }

        /* renamed from: c */
        public final void mo60792c(float f) {
            this.f61567b = f;
            m76708g();
        }

        /* renamed from: e */
        public final void mo60796e(float f) {
            if (f != this.f61586u) {
                this.f61586u = f;
                m76708g();
            }
        }

        /* renamed from: a */
        public final void mo60781a(float f) {
            this.f61569d = f;
            this.f61579n.setStrokeWidth(f);
            m76708g();
        }

        /* renamed from: a */
        public final void mo60783a(int i) {
            this.f61583r = i;
            this.f61577l = this.f61582q[this.f61583r];
        }

        C23394a(Callback callback) {
            this.f61581p = callback;
            this.f61579n.setStrokeCap(Cap.SQUARE);
            this.f61579n.setAntiAlias(true);
            this.f61579n.setStyle(Style.STROKE);
            this.f61580o.setStyle(Style.FILL);
            this.f61580o.setAntiAlias(true);
        }

        /* renamed from: a */
        public final void mo60786a(ColorFilter colorFilter) {
            this.f61579n.setColorFilter(colorFilter);
            m76708g();
        }

        /* renamed from: a */
        public final void mo60787a(boolean z) {
            if (this.f61584s != z) {
                this.f61584s = z;
                m76708g();
            }
        }

        /* renamed from: a */
        public final void mo60782a(float f, float f2) {
            this.f61587v = (int) f;
            this.f61588w = (int) f2;
        }

        /* renamed from: a */
        public final void mo60784a(int i, int i2) {
            float f;
            float min = (float) Math.min(i, i2);
            if (this.f61574i <= 0.0d || min < 0.0f) {
                f = (float) Math.ceil((double) (this.f61569d / 2.0f));
            } else {
                double d = (double) (min / 2.0f);
                double d2 = this.f61574i;
                Double.isNaN(d);
                f = (float) (d - d2);
            }
            this.f61570e = f;
        }

        /* renamed from: a */
        public final void mo60785a(Canvas canvas, Rect rect) {
            RectF rectF = this.f61578m;
            rectF.set(rect);
            rectF.inset(this.f61570e, this.f61570e);
            float f = (this.f61566a + this.f61568c) * 360.0f;
            float f2 = ((this.f61567b + this.f61568c) * 360.0f) - f;
            this.f61579n.setColor(this.f61577l);
            canvas.drawArc(rectF, f, f2, false, this.f61579n);
            m76706a(canvas, f, f2, rect);
            if (this.f61575j < 255) {
                this.f61589x.setColor(this.f61576k);
                this.f61589x.setAlpha(NormalGiftView.ALPHA_255 - this.f61575j);
                canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), (float) (rect.width() / 2), this.f61589x);
            }
        }

        /* renamed from: a */
        private void m76706a(Canvas canvas, float f, float f2, Rect rect) {
            if (this.f61584s) {
                if (this.f61585t == null) {
                    this.f61585t = new Path();
                    this.f61585t.setFillType(FillType.EVEN_ODD);
                } else {
                    this.f61585t.reset();
                }
                float f3 = ((float) (((int) this.f61570e) / 2)) * this.f61586u;
                double cos = this.f61574i * Math.cos(0.0d);
                double exactCenterX = (double) rect.exactCenterX();
                Double.isNaN(exactCenterX);
                float f4 = (float) (cos + exactCenterX);
                double sin = this.f61574i * Math.sin(0.0d);
                double exactCenterY = (double) rect.exactCenterY();
                Double.isNaN(exactCenterY);
                float f5 = (float) (sin + exactCenterY);
                this.f61585t.moveTo(0.0f, 0.0f);
                this.f61585t.lineTo(((float) this.f61587v) * this.f61586u, 0.0f);
                this.f61585t.lineTo((((float) this.f61587v) * this.f61586u) / 2.0f, ((float) this.f61588w) * this.f61586u);
                this.f61585t.offset(f4 - f3, f5);
                this.f61585t.close();
                this.f61580o.setColor(this.f61577l);
                canvas.rotate((f + f2) - 5.0f, rect.exactCenterX(), rect.exactCenterY());
                canvas.drawPath(this.f61585t, this.f61580o);
            }
        }
    }

    /* renamed from: a */
    private static int m76693a(float f, int i, int i2) {
        int i3 = (i >> 24) & NormalGiftView.ALPHA_255;
        int i4 = (i >> 16) & NormalGiftView.ALPHA_255;
        int i5 = (i >> 8) & NormalGiftView.ALPHA_255;
        int i6 = i & NormalGiftView.ALPHA_255;
        return ((i3 + ((int) (((float) (((i2 >> 24) & NormalGiftView.ALPHA_255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & NormalGiftView.ALPHA_255) - i4)) * f))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & NormalGiftView.ALPHA_255) - i5)) * f))) << 8) | (i6 + ((int) (f * ((float) ((i2 & NormalGiftView.ALPHA_255) - i6)))));
    }

    public final int getIntrinsicHeight() {
        return (int) this.f61559m;
    }

    public final int getIntrinsicWidth() {
        return (int) this.f61558l;
    }

    public final int getOpacity() {
        return -3;
    }

    /* renamed from: a */
    public final void mo60758a(int... iArr) {
        this.f61554h.mo60788a(iArr);
        this.f61554h.mo60783a(0);
    }

    public final int getAlpha() {
        return this.f61554h.f61575j;
    }

    public final void stop() {
        this.f61556j.clearAnimation();
        mo60762c(0.0f);
        this.f61554h.mo60787a(false);
        this.f61554h.mo60783a(0);
        this.f61554h.mo60795e();
    }

    public final boolean isRunning() {
        ArrayList<Animation> arrayList = this.f61553g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animation animation = (Animation) arrayList.get(i);
            if (animation.hasStarted() && !animation.hasEnded()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m76694a() {
        final C23394a aVar = this.f61554h;
        C233911 r1 = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                if (C23390c.this.f61552d) {
                    C23390c.this.mo60760b(f, aVar);
                    return;
                }
                float a = C23390c.m76692a(aVar);
                float f2 = aVar.f61572g;
                float f3 = aVar.f61571f;
                float f4 = aVar.f61573h;
                C23390c.this.mo60755a(f, aVar);
                if (f <= 0.5f) {
                    aVar.mo60790b(f3 + ((0.8f - a) * C23390c.f61547a.getInterpolation(f / 0.5f)));
                }
                if (f > 0.5f) {
                    aVar.mo60792c(f2 + ((0.8f - a) * C23390c.f61547a.getInterpolation((f - 0.5f) / 0.5f)));
                }
                aVar.mo60794d(f4 + (0.25f * f));
                C23390c.this.mo60762c((f * 216.0f) + ((C23390c.this.f61551c / 5.0f) * 1080.0f));
            }
        };
        r1.setRepeatCount(-1);
        r1.setRepeatMode(1);
        r1.setInterpolator(f61548e);
        r1.setAnimationListener(new AnimationListener() {
            public final void onAnimationEnd(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
                C23390c.this.f61551c = 0.0f;
            }

            public final void onAnimationRepeat(Animation animation) {
                aVar.mo60793d();
                aVar.mo60789b();
                aVar.mo60790b(aVar.f61567b);
                if (C23390c.this.f61552d) {
                    C23390c.this.f61552d = false;
                    animation.setDuration(1332);
                    aVar.mo60787a(false);
                    return;
                }
                C23390c.this.f61551c = (C23390c.this.f61551c + 1.0f) % 5.0f;
            }
        });
        this.f61557k = r1;
    }

    public final void start() {
        this.f61557k.reset();
        this.f61554h.mo60793d();
        if (this.f61554h.f61567b != this.f61554h.f61566a) {
            this.f61552d = true;
            this.f61557k.setDuration(666);
            this.f61556j.startAnimation(this.f61557k);
            return;
        }
        this.f61554h.mo60783a(0);
        this.f61554h.mo60795e();
        this.f61557k.setDuration(1332);
        this.f61556j.startAnimation(this.f61557k);
    }

    /* renamed from: a */
    public final void mo60753a(float f) {
        this.f61554h.mo60796e(f);
    }

    /* renamed from: b */
    public final void mo60759b(float f) {
        this.f61554h.mo60794d(f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo60762c(float f) {
        this.f61550b = f;
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        this.f61554h.f61575j = i;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f61554h.mo60786a(colorFilter);
    }

    /* renamed from: b */
    public final void mo60761b(int i) {
        this.f61554h.f61576k = i;
    }

    /* renamed from: a */
    static float m76692a(C23394a aVar) {
        double d = (double) aVar.f61569d;
        double d2 = aVar.f61574i * 6.283185307179586d;
        Double.isNaN(d);
        return (float) Math.toRadians(d / d2);
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.rotate(this.f61550b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f61554h.mo60785a(canvas, bounds);
        canvas.restoreToCount(save);
    }

    /* renamed from: a */
    public final void mo60756a(int i) {
        if (i == 0) {
            m76695a(56.0d, 56.0d, 12.5d, 3.0d, 12.0f, 6.0f);
        } else {
            m76695a(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
        }
    }

    /* renamed from: a */
    public final void mo60757a(boolean z) {
        this.f61554h.mo60787a(z);
    }

    /* renamed from: a */
    public final void mo60754a(float f, float f2) {
        this.f61554h.mo60790b(0.0f);
        this.f61554h.mo60792c(f2);
    }

    C23390c(Context context, View view) {
        this.f61556j = view;
        this.f61555i = context.getResources();
        this.f61554h = new C23394a(this.f61560n);
        this.f61554h.mo60788a(f61549f);
        mo60756a(1);
        m76694a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo60760b(float f, C23394a aVar) {
        mo60755a(f, aVar);
        float floor = (float) (Math.floor((double) (aVar.f61573h / 0.8f)) + 1.0d);
        aVar.mo60790b(aVar.f61571f + (((aVar.f61572g - m76692a(aVar)) - aVar.f61571f) * f));
        aVar.mo60792c(aVar.f61572g);
        aVar.mo60794d(aVar.f61573h + ((floor - aVar.f61573h) * f));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo60755a(float f, C23394a aVar) {
        if (f > 0.75f) {
            aVar.f61577l = m76693a((f - 0.75f) / 0.25f, aVar.mo60791c(), aVar.mo60780a());
        }
    }

    /* renamed from: a */
    private void m76695a(double d, double d2, double d3, double d4, float f, float f2) {
        C23394a aVar = this.f61554h;
        float f3 = this.f61555i.getDisplayMetrics().density;
        double d5 = (double) f3;
        Double.isNaN(d5);
        this.f61558l = d * d5;
        Double.isNaN(d5);
        this.f61559m = d2 * d5;
        aVar.mo60781a(((float) d4) * f3);
        Double.isNaN(d5);
        aVar.f61574i = d3 * d5;
        aVar.mo60783a(0);
        aVar.mo60782a(f * f3, f2 * f3);
        aVar.mo60784a((int) this.f61558l, (int) this.f61559m);
    }
}
