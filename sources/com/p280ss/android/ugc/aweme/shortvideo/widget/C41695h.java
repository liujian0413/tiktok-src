package com.p280ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.p022v4.view.C0991u;
import android.view.View;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.h */
public final class C41695h extends Drawable {

    /* renamed from: a */
    public static final int f108520a = 1;

    /* renamed from: b */
    public static final int f108521b = 2;

    /* renamed from: c */
    public static final C41697b f108522c = new C41697b(null);

    /* renamed from: d */
    private final Paint f108523d;

    /* renamed from: e */
    private final Paint f108524e;

    /* renamed from: f */
    private RectF f108525f;

    /* renamed from: g */
    private final int f108526g;

    /* renamed from: h */
    private final int[] f108527h;

    /* renamed from: i */
    private final int f108528i;

    /* renamed from: j */
    private final int f108529j;

    /* renamed from: k */
    private final int f108530k;

    /* renamed from: l */
    private final int f108531l;

    /* renamed from: m */
    private final int f108532m;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.h$a */
    public static final class C41696a {

        /* renamed from: a */
        private int f108533a = C41697b.m132803a();

        /* renamed from: b */
        private int f108534b = 12;

        /* renamed from: c */
        private int f108535c = Color.parseColor("#4d000000");

        /* renamed from: d */
        private int f108536d = 18;

        /* renamed from: e */
        private int f108537e = 0;

        /* renamed from: f */
        private int f108538f = 0;

        /* renamed from: g */
        private int[] f108539g = new int[1];

        /* renamed from: a */
        public final C41695h mo102468a() {
            C41695h hVar = new C41695h(this.f108533a, this.f108539g, this.f108534b, this.f108535c, this.f108536d, this.f108537e, this.f108538f, null);
            return hVar;
        }

        public C41696a() {
            this.f108539g[0] = 0;
        }

        /* renamed from: a */
        public final C41696a mo102467a(int i) {
            this.f108534b = i;
            return this;
        }

        /* renamed from: b */
        public final C41696a mo102469b(int i) {
            this.f108535c = i;
            return this;
        }

        /* renamed from: c */
        public final C41696a mo102470c(int i) {
            this.f108536d = i;
            return this;
        }

        /* renamed from: d */
        public final C41696a mo102471d(int i) {
            this.f108537e = i;
            return this;
        }

        /* renamed from: e */
        public final C41696a mo102472e(int i) {
            this.f108538f = i;
            return this;
        }

        /* renamed from: f */
        public final C41696a mo102473f(int i) {
            this.f108539g[0] = i;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.h$b */
    public static final class C41697b {
        private C41697b() {
        }

        /* renamed from: a */
        public static int m132803a() {
            return C41695h.f108520a;
        }

        public /* synthetic */ C41697b(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m132804a(View view, int i, int i2, int i3, int i4, int i5, int i6) {
            C7573i.m23587b(view, "view");
            C41695h a = new C41696a().mo102473f(i).mo102467a(i2).mo102469b(i3).mo102470c(i4).mo102471d(0).mo102472e(0).mo102468a();
            view.setLayerType(1, null);
            C0991u.m4185a(view, (Drawable) a);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.f108523d.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f108523d.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        C7573i.m23587b(canvas, "canvas");
        if (this.f108527h != null) {
            if (this.f108527h.length == 1) {
                this.f108524e.setColor(this.f108527h[0]);
            } else {
                Paint paint = this.f108524e;
                RectF rectF = this.f108525f;
                if (rectF == null) {
                    C7573i.m23580a();
                }
                float f = rectF.left;
                RectF rectF2 = this.f108525f;
                if (rectF2 == null) {
                    C7573i.m23580a();
                }
                float height = rectF2.height() / 2.0f;
                RectF rectF3 = this.f108525f;
                if (rectF3 == null) {
                    C7573i.m23580a();
                }
                float f2 = rectF3.right;
                RectF rectF4 = this.f108525f;
                if (rectF4 == null) {
                    C7573i.m23580a();
                }
                LinearGradient linearGradient = new LinearGradient(f, height, f2, rectF4.height() / 2.0f, this.f108527h, null, TileMode.CLAMP);
                paint.setShader(linearGradient);
            }
        }
        if (this.f108526g == f108520a) {
            RectF rectF5 = this.f108525f;
            if (rectF5 == null) {
                C7573i.m23580a();
            }
            canvas.drawRoundRect(rectF5, (float) this.f108528i, (float) this.f108528i, this.f108523d);
            RectF rectF6 = this.f108525f;
            if (rectF6 == null) {
                C7573i.m23580a();
            }
            canvas.drawRoundRect(rectF6, (float) this.f108528i, (float) this.f108528i, this.f108524e);
            return;
        }
        RectF rectF7 = this.f108525f;
        if (rectF7 == null) {
            C7573i.m23580a();
        }
        float centerX = rectF7.centerX();
        RectF rectF8 = this.f108525f;
        if (rectF8 == null) {
            C7573i.m23580a();
        }
        float centerY = rectF8.centerY();
        RectF rectF9 = this.f108525f;
        if (rectF9 == null) {
            C7573i.m23580a();
        }
        float width = rectF9.width();
        RectF rectF10 = this.f108525f;
        if (rectF10 == null) {
            C7573i.m23580a();
        }
        canvas.drawCircle(centerX, centerY, Math.min(width, rectF10.height()) / 2.0f, this.f108523d);
        RectF rectF11 = this.f108525f;
        if (rectF11 == null) {
            C7573i.m23580a();
        }
        float centerX2 = rectF11.centerX();
        RectF rectF12 = this.f108525f;
        if (rectF12 == null) {
            C7573i.m23580a();
        }
        float centerY2 = rectF12.centerY();
        RectF rectF13 = this.f108525f;
        if (rectF13 == null) {
            C7573i.m23580a();
        }
        float width2 = rectF13.width();
        RectF rectF14 = this.f108525f;
        if (rectF14 == null) {
            C7573i.m23580a();
        }
        canvas.drawCircle(centerX2, centerY2, Math.min(width2, rectF14.height()) / 2.0f, this.f108524e);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f108525f = new RectF((float) ((i + this.f108530k) - this.f108531l), (float) ((i2 + this.f108530k) - this.f108532m), (float) ((i3 - this.f108530k) - this.f108531l), (float) ((i4 - this.f108530k) - this.f108532m));
    }

    private C41695h(int i, int[] iArr, int i2, int i3, int i4, int i5, int i6) {
        this.f108526g = i;
        this.f108527h = iArr;
        this.f108528i = i2;
        this.f108529j = i3;
        this.f108530k = i4;
        this.f108531l = i5;
        this.f108532m = i6;
        this.f108523d = new Paint();
        this.f108523d.setColor(0);
        this.f108523d.setAntiAlias(true);
        this.f108523d.setShadowLayer((float) this.f108530k, (float) this.f108531l, (float) this.f108532m, this.f108529j);
        this.f108523d.setXfermode(new PorterDuffXfermode(Mode.DST_ATOP));
        this.f108524e = new Paint();
        this.f108524e.setAntiAlias(true);
    }

    public /* synthetic */ C41695h(int i, int[] iArr, int i2, int i3, int i4, int i5, int i6, C7571f fVar) {
        this(i, iArr, i2, i3, i4, i5, i6);
    }
}
