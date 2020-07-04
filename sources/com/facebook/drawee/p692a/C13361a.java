package com.facebook.drawee.p692a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.C1642a;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.p692a.p693a.C13363b;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;

/* renamed from: com.facebook.drawee.a.a */
public final class C13361a extends Drawable implements C13363b {

    /* renamed from: a */
    public int f35295a;

    /* renamed from: b */
    public String f35296b;

    /* renamed from: c */
    public C13423b f35297c;

    /* renamed from: d */
    public long f35298d;

    /* renamed from: e */
    private String f35299e;

    /* renamed from: f */
    private String f35300f;

    /* renamed from: g */
    private int f35301g;

    /* renamed from: h */
    private int f35302h;

    /* renamed from: i */
    private int f35303i;

    /* renamed from: j */
    private int f35304j;

    /* renamed from: k */
    private int f35305k = 80;

    /* renamed from: l */
    private final Paint f35306l = new Paint(1);

    /* renamed from: m */
    private final Matrix f35307m = new Matrix();

    /* renamed from: n */
    private final Rect f35308n = new Rect();

    /* renamed from: o */
    private final RectF f35309o = new RectF();

    /* renamed from: p */
    private int f35310p;

    /* renamed from: q */
    private int f35311q;

    /* renamed from: r */
    private int f35312r;

    /* renamed from: s */
    private int f35313s;

    /* renamed from: t */
    private int f35314t;

    /* renamed from: u */
    private String f35315u;

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C13361a() {
        mo32664a();
    }

    /* renamed from: a */
    public final void mo32664a() {
        this.f35301g = -1;
        this.f35302h = -1;
        this.f35295a = -1;
        this.f35303i = -1;
        this.f35304j = -1;
        this.f35296b = null;
        mo32667a((String) null);
        this.f35298d = -1;
        this.f35315u = null;
        invalidateSelf();
    }

    /* renamed from: b */
    public final void mo32668b(String str) {
        this.f35315u = str;
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo32666a(long j) {
        this.f35298d = j;
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m39126a(rect, 9, 8);
    }

    /* renamed from: a */
    public final void mo32667a(String str) {
        if (str == null) {
            str = "none";
        }
        this.f35299e = str;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f35306l.setStyle(Style.STROKE);
        this.f35306l.setStrokeWidth(2.0f);
        this.f35306l.setColor(-26624);
        canvas.drawRect((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, this.f35306l);
        this.f35306l.setStyle(Style.FILL);
        this.f35306l.setColor(m39124a(this.f35301g, this.f35302h, this.f35297c));
        canvas.drawRect((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, this.f35306l);
        this.f35306l.setStyle(Style.FILL);
        this.f35306l.setStrokeWidth(0.0f);
        this.f35306l.setColor(-1);
        this.f35313s = this.f35310p;
        this.f35314t = this.f35311q;
        if (this.f35300f != null) {
            m39125a(canvas, "IDs: %s, %s", this.f35299e, this.f35300f);
        } else {
            m39125a(canvas, "ID: %s", this.f35299e);
        }
        m39125a(canvas, "D: %dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height()));
        m39125a(canvas, "I: %dx%d", Integer.valueOf(this.f35301g), Integer.valueOf(this.f35302h));
        m39125a(canvas, "I: %d KiB", Integer.valueOf(this.f35295a / PreloadTask.BYTE_UNIT_NUMBER));
        if (this.f35296b != null) {
            m39125a(canvas, "i format: %s", this.f35296b);
        }
        if (this.f35303i > 0) {
            m39125a(canvas, "anim: f %d, l %d", Integer.valueOf(this.f35303i), Integer.valueOf(this.f35304j));
        }
        if (this.f35297c != null) {
            m39125a(canvas, "scale: %s", this.f35297c);
        }
        if (this.f35298d >= 0) {
            m39125a(canvas, "t: %d ms", Long.valueOf(this.f35298d));
        }
        if (this.f35315u != null) {
            m39125a(canvas, "origin: %s", this.f35315u);
        }
    }

    /* renamed from: a */
    public final void mo32665a(int i, int i2) {
        this.f35301g = i;
        this.f35302h = i2;
        invalidateSelf();
    }

    /* renamed from: a */
    private void m39125a(Canvas canvas, String str, Object... objArr) {
        canvas.drawText(C1642a.m8034a(str, objArr), (float) this.f35313s, (float) this.f35314t, this.f35306l);
        this.f35314t += this.f35312r;
    }

    /* renamed from: a */
    private void m39126a(Rect rect, int i, int i2) {
        int i3;
        int min = Math.min(40, Math.max(10, Math.min(rect.width() / 8, rect.height() / 9)));
        this.f35306l.setTextSize((float) min);
        this.f35312r = min + 8;
        if (this.f35305k == 80) {
            this.f35312r *= -1;
        }
        this.f35310p = rect.left + 10;
        if (this.f35305k == 80) {
            i3 = rect.bottom - 10;
        } else {
            i3 = rect.top + 10 + 10;
        }
        this.f35311q = i3;
    }

    /* renamed from: a */
    private int m39124a(int i, int i2, C13423b bVar) {
        int width = getBounds().width();
        int height = getBounds().height();
        if (width <= 0 || height <= 0 || i <= 0 || i2 <= 0) {
            return 1727284022;
        }
        if (bVar != null) {
            Rect rect = this.f35308n;
            this.f35308n.top = 0;
            rect.left = 0;
            this.f35308n.right = width;
            this.f35308n.bottom = height;
            this.f35307m.reset();
            bVar.mo32864a(this.f35307m, this.f35308n, i, i2, 0.0f, 0.0f);
            RectF rectF = this.f35309o;
            this.f35309o.top = 0.0f;
            rectF.left = 0.0f;
            this.f35309o.right = (float) i;
            this.f35309o.bottom = (float) i2;
            this.f35307m.mapRect(this.f35309o);
            int height2 = (int) this.f35309o.height();
            width = Math.min(width, (int) this.f35309o.width());
            height = Math.min(height, height2);
        }
        float f = (float) width;
        float f2 = f * 0.1f;
        float f3 = f * 0.5f;
        float f4 = (float) height;
        float f5 = 0.1f * f4;
        float f6 = f4 * 0.5f;
        int abs = Math.abs(i - width);
        int abs2 = Math.abs(i2 - height);
        float f7 = (float) abs;
        if (f7 < f2 && ((float) abs2) < f5) {
            return 1716301648;
        }
        if (f7 >= f3 || ((float) abs2) >= f6) {
            return 1727284022;
        }
        return 1728026624;
    }
}
