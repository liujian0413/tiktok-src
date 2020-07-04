package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
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

/* renamed from: com.ss.android.ugc.aweme.music.ui.ao */
public final class C33939ao extends Drawable {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f88562a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C33939ao.class), "paint", "getPaint()Landroid/graphics/Paint;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C33939ao.class), "shadowPaint", "getShadowPaint()Landroid/graphics/Paint;"))};

    /* renamed from: b */
    public int f88563b;

    /* renamed from: c */
    public C33937am f88564c;

    /* renamed from: d */
    private final C7541d f88565d;

    /* renamed from: e */
    private final C7541d f88566e = C7546e.m23569a(new C33941b(this));

    /* renamed from: com.ss.android.ugc.aweme.music.ui.ao$a */
    static final class C33940a extends Lambda implements C7561a<Paint> {

        /* renamed from: a */
        final /* synthetic */ int f88567a;

        C33940a(int i) {
            this.f88567a = i;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Paint invoke() {
            Paint paint = new Paint(1);
            paint.setColor(this.f88567a);
            return paint;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.ao$b */
    static final class C33941b extends Lambda implements C7561a<Paint> {

        /* renamed from: a */
        final /* synthetic */ C33939ao f88568a;

        C33941b(C33939ao aoVar) {
            this.f88568a = aoVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Paint invoke() {
            Paint paint = new Paint(1);
            C33937am amVar = this.f88568a.f88564c;
            if (amVar != null) {
                paint.setColor(amVar.f88552e);
                paint.setMaskFilter(new BlurMaskFilter(amVar.f88548a, amVar.f88549b));
            }
            return paint;
        }
    }

    /* renamed from: a */
    private Paint m109391a() {
        return (Paint) this.f88565d.getValue();
    }

    /* renamed from: b */
    private Paint m109392b() {
        return (Paint) this.f88566e.getValue();
    }

    public final int getOpacity() {
        return m109391a().getAlpha();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        m109391a().setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        if (m109391a().getAlpha() != i) {
            m109391a().setAlpha(i);
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        C7573i.m23587b(canvas, "canvas");
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0) {
            float f = (float) width;
            float f2 = (float) height;
            float min = Math.min(f, f2) / 2.0f;
            RectF rectF = new RectF(0.0f, 0.0f, f, f2);
            C33937am amVar = this.f88564c;
            if (amVar != null) {
                Math.abs(amVar.f88550c);
                float abs = Math.abs(amVar.f88551d) + amVar.f88548a;
                rectF.top += abs;
                rectF.bottom -= abs;
                rectF.left += abs;
                rectF.right -= abs;
                canvas.save();
                canvas.translate(amVar.f88550c, amVar.f88551d);
                canvas.drawRoundRect(rectF, min, min, m109392b());
                canvas.restore();
            }
            canvas.drawRoundRect(rectF, min, min, m109391a());
        }
    }

    public C33939ao(int i, C33937am amVar) {
        this.f88563b = i;
        this.f88564c = amVar;
        this.f88565d = C7546e.m23569a(new C33940a(i));
    }
}
