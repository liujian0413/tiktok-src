package com.p280ss.android.ugc.aweme.journey;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.journey.q */
public final class C32259q extends Drawable {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f84312a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C32259q.class), "paint", "getPaint()Landroid/graphics/Paint;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C32259q.class), "shadowPaint", "getShadowPaint()Landroid/graphics/Paint;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C32259q.class), "strokePaint", "getStrokePaint()Landroid/graphics/Paint;"))};

    /* renamed from: b */
    public int f84313b;

    /* renamed from: c */
    public int f84314c = -1;

    /* renamed from: d */
    public C32258p f84315d;

    /* renamed from: e */
    private final C7541d f84316e;

    /* renamed from: f */
    private final C7541d f84317f;

    /* renamed from: g */
    private final C7541d f84318g;

    /* renamed from: com.ss.android.ugc.aweme.journey.q$a */
    static final class C32260a extends Lambda implements C7561a<Paint> {

        /* renamed from: a */
        final /* synthetic */ int f84319a;

        C32260a(int i) {
            this.f84319a = i;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Paint invoke() {
            Paint paint = new Paint(1);
            paint.setColor(this.f84319a);
            return paint;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.q$b */
    static final class C32261b extends Lambda implements C7561a<Paint> {

        /* renamed from: a */
        final /* synthetic */ C32259q f84320a;

        C32261b(C32259q qVar) {
            this.f84320a = qVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Paint invoke() {
            Paint paint = new Paint(1);
            C32258p pVar = this.f84320a.f84315d;
            if (pVar != null) {
                paint.setColor(pVar.f84310e);
                paint.setMaskFilter(new BlurMaskFilter(pVar.f84306a, pVar.f84307b));
            }
            return paint;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.q$c */
    static final class C32262c extends Lambda implements C7561a<Paint> {

        /* renamed from: a */
        public static final C32262c f84321a = new C32262c();

        C32262c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m104773a();
        }

        /* renamed from: a */
        private static Paint m104773a() {
            Paint paint = new Paint();
            paint.setStyle(Style.STROKE);
            return paint;
        }
    }

    /* renamed from: a */
    private Paint m104767a() {
        return (Paint) this.f84316e.getValue();
    }

    /* renamed from: b */
    private Paint m104768b() {
        return (Paint) this.f84317f.getValue();
    }

    /* renamed from: c */
    private Paint m104769c() {
        return (Paint) this.f84318g.getValue();
    }

    public final int getOpacity() {
        return m104767a().getAlpha();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        m104767a().setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo83481a(int i) {
        if (this.f84314c != i) {
            this.f84314c = i;
            m104769c().setColor(i);
            invalidateSelf();
        }
    }

    public final void setAlpha(int i) {
        if (m104767a().getAlpha() != i) {
            m104767a().setAlpha(i);
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        C7573i.m23587b(canvas, "canvas");
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0) {
            C32258p pVar = this.f84315d;
            if (pVar == null) {
                C7573i.m23580a();
            }
            float f = pVar.f84311f;
            RectF rectF = new RectF(0.0f, 0.0f, (float) width, (float) height);
            C32258p pVar2 = this.f84315d;
            if (pVar2 != null) {
                float f2 = pVar2.f84306a;
                float f3 = pVar2.f84306a;
                rectF.top += pVar2.f84306a;
                rectF.bottom -= f3;
                rectF.left += f2;
                rectF.right -= f2;
                canvas.save();
                canvas.translate(pVar2.f84308c, pVar2.f84309d);
                canvas.drawRoundRect(rectF, f, f, m104768b());
                canvas.restore();
            }
            if (this.f84313b != 0) {
                canvas.drawRoundRect(rectF, f, f, m104767a());
            }
            if (this.f84314c != -1) {
                canvas.drawRoundRect(rectF, f, f, m104769c());
            }
        }
    }

    public C32259q(int i, C32258p pVar) {
        this.f84313b = i;
        this.f84315d = pVar;
        this.f84316e = C7546e.m23569a(new C32260a(i));
        this.f84317f = C7546e.m23569a(new C32261b(this));
        this.f84318g = C7546e.m23569a(C32262c.f84321a);
    }
}
