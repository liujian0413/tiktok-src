package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.facebook.common.internal.C13307g;
import java.util.Arrays;

/* renamed from: com.facebook.drawee.drawable.f */
public final class C13411f extends C13405a {

    /* renamed from: a */
    public int f35522a;

    /* renamed from: b */
    public int f35523b;

    /* renamed from: c */
    long f35524c;

    /* renamed from: d */
    int[] f35525d;

    /* renamed from: e */
    int[] f35526e;

    /* renamed from: f */
    int f35527f;

    /* renamed from: g */
    boolean[] f35528g;

    /* renamed from: h */
    int f35529h;

    /* renamed from: i */
    private final Drawable[] f35530i;

    public final int getAlpha() {
        return this.f35527f;
    }

    /* renamed from: g */
    private static long m39341g() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: b */
    public final void mo32810b() {
        this.f35529h++;
    }

    public final void invalidateSelf() {
        if (this.f35529h == 0) {
            super.invalidateSelf();
        }
    }

    /* renamed from: c */
    public final void mo32811c() {
        this.f35529h--;
        invalidateSelf();
    }

    /* renamed from: d */
    public final void mo32813d() {
        this.f35522a = 0;
        Arrays.fill(this.f35528g, true);
        invalidateSelf();
    }

    /* renamed from: e */
    public final void mo32815e() {
        int i;
        this.f35522a = 2;
        for (int i2 = 0; i2 < this.f35530i.length; i2++) {
            int[] iArr = this.f35526e;
            if (this.f35528g[i2]) {
                i = NormalGiftView.ALPHA_255;
            } else {
                i = 0;
            }
            iArr[i2] = i;
        }
        invalidateSelf();
    }

    /* renamed from: f */
    private void m39340f() {
        this.f35522a = 2;
        Arrays.fill(this.f35525d, 0);
        this.f35525d[0] = 255;
        Arrays.fill(this.f35526e, 0);
        this.f35526e[0] = 255;
        Arrays.fill(this.f35528g, false);
        this.f35528g[0] = true;
    }

    /* renamed from: e */
    public final void mo32816e(int i) {
        this.f35522a = 0;
        this.f35528g[i] = false;
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        if (this.f35527f != i) {
            this.f35527f = i;
            invalidateSelf();
        }
    }

    /* renamed from: c */
    public final void mo32812c(int i) {
        this.f35523b = i;
        if (this.f35522a == 1) {
            this.f35522a = 0;
        }
    }

    /* renamed from: d */
    public final void mo32814d(int i) {
        this.f35522a = 0;
        this.f35528g[i] = true;
        invalidateSelf();
    }

    public C13411f(Drawable[] drawableArr) {
        boolean z;
        super(drawableArr);
        if (drawableArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38948b(z, "At least one layer required!");
        this.f35530i = drawableArr;
        this.f35525d = new int[drawableArr.length];
        this.f35526e = new int[drawableArr.length];
        this.f35527f = NormalGiftView.ALPHA_255;
        this.f35528g = new boolean[drawableArr.length];
        this.f35529h = 0;
        m39340f();
    }

    /* renamed from: a */
    private boolean m39339a(float f) {
        int i;
        boolean z = true;
        for (int i2 = 0; i2 < this.f35530i.length; i2++) {
            if (this.f35528g[i2]) {
                i = 1;
            } else {
                i = -1;
            }
            this.f35526e[i2] = (int) (((float) this.f35525d[i2]) + (((float) (i * NormalGiftView.ALPHA_255)) * f));
            if (this.f35526e[i2] < 0) {
                this.f35526e[i2] = 0;
            }
            if (this.f35526e[i2] > 255) {
                this.f35526e[i2] = 255;
            }
            if (this.f35528g[i2] && this.f35526e[i2] < 255) {
                z = false;
            }
            if (!this.f35528g[i2] && this.f35526e[i2] > 0) {
                z = false;
            }
        }
        return z;
    }

    public final void draw(Canvas canvas) {
        boolean z;
        float f;
        boolean z2;
        int i = 2;
        switch (this.f35522a) {
            case 0:
                System.arraycopy(this.f35526e, 0, this.f35525d, 0, this.f35530i.length);
                this.f35524c = m39341g();
                if (this.f35523b == 0) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                z = m39339a(f);
                if (!z) {
                    i = 1;
                }
                this.f35522a = i;
                break;
            case 1:
                if (this.f35523b > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C13307g.m38947b(z2);
                z = m39339a(((float) (m39341g() - this.f35524c)) / ((float) this.f35523b));
                if (!z) {
                    i = 1;
                }
                this.f35522a = i;
                break;
            default:
                z = true;
                break;
        }
        for (int i2 = 0; i2 < this.f35530i.length; i2++) {
            m39338a(canvas, this.f35530i[i2], (this.f35526e[i2] * this.f35527f) / NormalGiftView.ALPHA_255);
        }
        if (!z) {
            invalidateSelf();
        }
    }

    /* renamed from: a */
    private void m39338a(Canvas canvas, Drawable drawable, int i) {
        if (drawable != null && i > 0) {
            this.f35529h++;
            drawable.mutate().setAlpha(i);
            this.f35529h--;
            drawable.draw(canvas);
        }
    }
}
