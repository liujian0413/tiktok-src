package com.bytedance.android.live.uikit.refresh;

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
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.live.uikit.refresh.b */
final class C3568b extends Drawable implements Animatable {

    /* renamed from: a */
    public static final Interpolator f10654a = new C3572a();

    /* renamed from: b */
    public static final Interpolator f10655b = new C3574c();

    /* renamed from: f */
    private static final Interpolator f10656f = new LinearInterpolator();

    /* renamed from: g */
    private static final Interpolator f10657g = new AccelerateDecelerateInterpolator();

    /* renamed from: c */
    public float f10658c;

    /* renamed from: d */
    public float f10659d;

    /* renamed from: e */
    boolean f10660e;

    /* renamed from: h */
    private final int[] f10661h = {-16777216};

    /* renamed from: i */
    private final ArrayList<Animation> f10662i = new ArrayList<>();

    /* renamed from: j */
    private final C3573b f10663j;

    /* renamed from: k */
    private Resources f10664k;

    /* renamed from: l */
    private View f10665l;

    /* renamed from: m */
    private Animation f10666m;

    /* renamed from: n */
    private double f10667n;

    /* renamed from: o */
    private double f10668o;

    /* renamed from: p */
    private final Callback f10669p = new Callback() {
        public final void invalidateDrawable(Drawable drawable) {
            C3568b.this.invalidateSelf();
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C3568b.this.unscheduleSelf(runnable);
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C3568b.this.scheduleSelf(runnable, j);
        }
    };

    /* renamed from: com.bytedance.android.live.uikit.refresh.b$a */
    static class C3572a extends AccelerateDecelerateInterpolator {
        private C3572a() {
        }

        public final float getInterpolation(float f) {
            return super.getInterpolation(Math.max(0.0f, (f - 0.5f) * 2.0f));
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.refresh.b$b */
    static class C3573b {

        /* renamed from: a */
        public float f10675a = 0.0f;

        /* renamed from: b */
        public float f10676b = 0.0f;

        /* renamed from: c */
        public float f10677c = 0.0f;

        /* renamed from: d */
        public float f10678d = 5.0f;

        /* renamed from: e */
        public float f10679e = 2.5f;

        /* renamed from: f */
        public int f10680f;

        /* renamed from: g */
        public float f10681g;

        /* renamed from: h */
        public float f10682h;

        /* renamed from: i */
        public float f10683i;

        /* renamed from: j */
        public double f10684j;

        /* renamed from: k */
        public int f10685k;

        /* renamed from: l */
        public int f10686l;

        /* renamed from: m */
        private final RectF f10687m = new RectF();

        /* renamed from: n */
        private final Paint f10688n = new Paint();

        /* renamed from: o */
        private final Paint f10689o = new Paint();

        /* renamed from: p */
        private final Callback f10690p;

        /* renamed from: q */
        private int[] f10691q;

        /* renamed from: r */
        private boolean f10692r;

        /* renamed from: s */
        private Path f10693s;

        /* renamed from: t */
        private float f10694t;

        /* renamed from: u */
        private int f10695u;

        /* renamed from: v */
        private int f10696v;

        /* renamed from: w */
        private final Paint f10697w = new Paint();

        /* renamed from: d */
        private void m13126d() {
            this.f10690p.invalidateDrawable(null);
        }

        /* renamed from: a */
        public final void mo10911a() {
            this.f10680f = (this.f10680f + 1) % this.f10691q.length;
        }

        /* renamed from: b */
        public final void mo10919b() {
            this.f10681g = this.f10675a;
            this.f10682h = this.f10676b;
            this.f10683i = this.f10677c;
        }

        /* renamed from: c */
        public final void mo10921c() {
            this.f10681g = 0.0f;
            this.f10682h = 0.0f;
            this.f10683i = 0.0f;
            mo10920b(0.0f);
            mo10922c(0.0f);
            mo10923d(0.0f);
        }

        /* renamed from: b */
        public final void mo10920b(float f) {
            this.f10675a = f;
            m13126d();
        }

        /* renamed from: c */
        public final void mo10922c(float f) {
            this.f10676b = f;
            m13126d();
        }

        /* renamed from: d */
        public final void mo10923d(float f) {
            this.f10677c = f;
            m13126d();
        }

        /* renamed from: e */
        public final void mo10924e(float f) {
            if (f != this.f10694t) {
                this.f10694t = f;
                m13126d();
            }
        }

        /* renamed from: a */
        public final void mo10912a(float f) {
            this.f10678d = f;
            this.f10688n.setStrokeWidth(f);
            m13126d();
        }

        public C3573b(Callback callback) {
            this.f10690p = callback;
            this.f10688n.setStrokeCap(Cap.SQUARE);
            this.f10688n.setAntiAlias(true);
            this.f10688n.setStyle(Style.STROKE);
            this.f10689o.setStyle(Style.FILL);
            this.f10689o.setAntiAlias(true);
        }

        /* renamed from: a */
        public final void mo10916a(ColorFilter colorFilter) {
            this.f10688n.setColorFilter(colorFilter);
            m13126d();
        }

        /* renamed from: a */
        public final void mo10917a(boolean z) {
            if (this.f10692r != z) {
                this.f10692r = z;
                m13126d();
            }
        }

        /* renamed from: a */
        public final void mo10918a(int[] iArr) {
            this.f10691q = iArr;
            this.f10680f = 0;
        }

        /* renamed from: a */
        public final void mo10913a(float f, float f2) {
            this.f10695u = (int) f;
            this.f10696v = (int) f2;
        }

        /* renamed from: a */
        public final void mo10914a(int i, int i2) {
            float f;
            float min = (float) Math.min(i, i2);
            if (this.f10684j <= 0.0d || min < 0.0f) {
                f = (float) Math.ceil((double) (this.f10678d / 2.0f));
            } else {
                double d = (double) (min / 2.0f);
                double d2 = this.f10684j;
                Double.isNaN(d);
                f = (float) (d - d2);
            }
            this.f10679e = f;
        }

        /* renamed from: a */
        public final void mo10915a(Canvas canvas, Rect rect) {
            RectF rectF = this.f10687m;
            rectF.set(rect);
            rectF.inset(this.f10679e, this.f10679e);
            float f = (this.f10675a + this.f10677c) * 360.0f;
            float f2 = ((this.f10676b + this.f10677c) * 360.0f) - f;
            this.f10688n.setColor(this.f10691q[this.f10680f]);
            canvas.drawArc(rectF, f, f2, false, this.f10688n);
            m13125a(canvas, f, f2, rect);
            if (this.f10685k < 255) {
                this.f10697w.setColor(this.f10686l);
                this.f10697w.setAlpha(NormalGiftView.ALPHA_255 - this.f10685k);
                canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), (float) (rect.width() / 2), this.f10697w);
            }
        }

        /* renamed from: a */
        private void m13125a(Canvas canvas, float f, float f2, Rect rect) {
            if (this.f10692r) {
                if (this.f10693s == null) {
                    this.f10693s = new Path();
                    this.f10693s.setFillType(FillType.EVEN_ODD);
                } else {
                    this.f10693s.reset();
                }
                float f3 = ((float) (((int) this.f10679e) / 2)) * this.f10694t;
                double cos = this.f10684j * Math.cos(0.0d);
                double exactCenterX = (double) rect.exactCenterX();
                Double.isNaN(exactCenterX);
                float f4 = (float) (cos + exactCenterX);
                double sin = this.f10684j * Math.sin(0.0d);
                double exactCenterY = (double) rect.exactCenterY();
                Double.isNaN(exactCenterY);
                float f5 = (float) (sin + exactCenterY);
                this.f10693s.moveTo(0.0f, 0.0f);
                this.f10693s.lineTo(((float) this.f10695u) * this.f10694t, 0.0f);
                this.f10693s.lineTo((((float) this.f10695u) * this.f10694t) / 2.0f, ((float) this.f10696v) * this.f10694t);
                this.f10693s.offset(f4 - f3, f5);
                this.f10693s.close();
                this.f10689o.setColor(this.f10691q[this.f10680f]);
                canvas.rotate((f + f2) - 5.0f, rect.exactCenterX(), rect.exactCenterY());
                canvas.drawPath(this.f10693s, this.f10689o);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.refresh.b$c */
    static class C3574c extends AccelerateDecelerateInterpolator {
        private C3574c() {
        }

        public final float getInterpolation(float f) {
            return super.getInterpolation(Math.min(1.0f, f * 2.0f));
        }
    }

    public final int getIntrinsicHeight() {
        return (int) this.f10668o;
    }

    public final int getIntrinsicWidth() {
        return (int) this.f10667n;
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getAlpha() {
        return this.f10663j.f10685k;
    }

    /* renamed from: a */
    private void m13114a() {
        final C3573b bVar = this.f10663j;
        C35691 r1 = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                if (C3568b.this.f10660e) {
                    C3568b.m13116a(f, bVar);
                    return;
                }
                double d = (double) bVar.f10678d;
                double d2 = bVar.f10684j * 6.283185307179586d;
                Double.isNaN(d);
                float radians = (float) Math.toRadians(d / d2);
                float f2 = bVar.f10682h;
                float f3 = bVar.f10681g;
                float f4 = bVar.f10683i;
                bVar.mo10922c(f2 + ((0.8f - radians) * C3568b.f10655b.getInterpolation(f)));
                bVar.mo10920b(f3 + (C3568b.f10654a.getInterpolation(f) * 0.8f));
                bVar.mo10923d(f4 + (0.25f * f));
                C3568b.this.mo10892c((f * 144.0f) + ((C3568b.this.f10659d / 5.0f) * 720.0f));
            }
        };
        r1.setRepeatCount(-1);
        r1.setRepeatMode(1);
        r1.setInterpolator(f10656f);
        r1.setAnimationListener(new AnimationListener() {
            public final void onAnimationEnd(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
                C3568b.this.f10659d = 0.0f;
            }

            public final void onAnimationRepeat(Animation animation) {
                bVar.mo10919b();
                bVar.mo10911a();
                bVar.mo10920b(bVar.f10676b);
                if (C3568b.this.f10660e) {
                    C3568b.this.f10660e = false;
                    animation.setDuration(1333);
                    bVar.mo10917a(false);
                    return;
                }
                C3568b.this.f10659d = (C3568b.this.f10659d + 1.0f) % 5.0f;
            }
        });
        this.f10666m = r1;
    }

    public final void stop() {
        this.f10665l.clearAnimation();
        mo10892c(0.0f);
        this.f10663j.mo10917a(false);
        this.f10663j.f10680f = 0;
        this.f10663j.mo10921c();
    }

    public final boolean isRunning() {
        ArrayList<Animation> arrayList = this.f10662i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animation animation = (Animation) arrayList.get(i);
            if (animation.hasStarted() && !animation.hasEnded()) {
                return true;
            }
        }
        return false;
    }

    public final void start() {
        this.f10666m.reset();
        this.f10663j.mo10919b();
        if (this.f10663j.f10676b != this.f10663j.f10675a) {
            this.f10660e = true;
            this.f10666m.setDuration(666);
            this.f10665l.startAnimation(this.f10666m);
            return;
        }
        this.f10663j.f10680f = 0;
        this.f10663j.mo10921c();
        this.f10666m.setDuration(1333);
        this.f10665l.startAnimation(this.f10666m);
    }

    /* renamed from: a */
    public final void mo10885a(float f) {
        this.f10663j.mo10924e(f);
    }

    /* renamed from: b */
    public final void mo10890b(float f) {
        this.f10663j.mo10923d(f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo10892c(float f) {
        this.f10658c = f;
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        this.f10663j.f10685k = i;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f10663j.mo10916a(colorFilter);
    }

    /* renamed from: b */
    public final void mo10891b(int i) {
        this.f10663j.f10686l = i;
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.rotate(this.f10658c, bounds.exactCenterX(), bounds.exactCenterY());
        this.f10663j.mo10915a(canvas, bounds);
        canvas.restoreToCount(save);
    }

    /* renamed from: a */
    public final void mo10887a(int i) {
        if (i == 0) {
            m13115a(56.0d, 56.0d, 12.5d, 3.0d, 12.0f, 6.0f);
        } else {
            m13115a(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
        }
    }

    /* renamed from: a */
    public final void mo10888a(boolean z) {
        this.f10663j.mo10917a(z);
    }

    /* renamed from: a */
    public final void mo10889a(int... iArr) {
        this.f10663j.mo10918a(iArr);
        this.f10663j.f10680f = 0;
    }

    /* renamed from: a */
    public final void mo10886a(float f, float f2) {
        this.f10663j.mo10920b(0.0f);
        this.f10663j.mo10922c(f2);
    }

    public C3568b(Context context, View view) {
        this.f10665l = view;
        this.f10664k = context.getResources();
        this.f10663j = new C3573b(this.f10669p);
        this.f10663j.mo10918a(this.f10661h);
        mo10887a(1);
        m13114a();
    }

    /* renamed from: a */
    public static void m13116a(float f, C3573b bVar) {
        float floor = (float) (Math.floor((double) (bVar.f10683i / 0.8f)) + 1.0d);
        bVar.mo10920b(bVar.f10681g + ((bVar.f10682h - bVar.f10681g) * f));
        bVar.mo10923d(bVar.f10683i + ((floor - bVar.f10683i) * f));
    }

    /* renamed from: a */
    private void m13115a(double d, double d2, double d3, double d4, float f, float f2) {
        C3573b bVar = this.f10663j;
        float f3 = this.f10664k.getDisplayMetrics().density;
        double d5 = (double) f3;
        Double.isNaN(d5);
        this.f10667n = d * d5;
        Double.isNaN(d5);
        this.f10668o = d2 * d5;
        bVar.mo10912a(((float) d4) * f3);
        Double.isNaN(d5);
        bVar.f10684j = d3 * d5;
        bVar.f10680f = 0;
        bVar.mo10913a(f * f3, f2 * f3);
        bVar.mo10914a((int) this.f10667n, (int) this.f10668o);
    }
}
