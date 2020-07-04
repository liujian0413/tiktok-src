package com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.p1662a;

import android.graphics.PointF;
import android.graphics.RectF;
import android.support.p022v4.app.FragmentActivity;
import android.view.MotionEvent;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39564ap;
import com.p280ss.android.ugc.aweme.shortvideo.edit.p1563c.C39515a;
import com.p280ss.android.ugc.aweme.story.shootvideo.textfont.TextStickerViewModel;
import com.p280ss.android.ugc.aweme.story.shootvideo.textfont.TextStickerViewState;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.C42088k;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.C42088k.C42092c;
import com.p280ss.android.ugc.aweme.utils.C43041d;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.c */
public final class C42072c {

    /* renamed from: a */
    public C42092c f109407a;

    /* renamed from: b */
    public float f109408b;

    /* renamed from: c */
    public float f109409c;

    /* renamed from: d */
    public boolean f109410d;

    /* renamed from: e */
    public final int f109411e = C34943c.f91127w;

    /* renamed from: f */
    public C42088k f109412f;

    /* renamed from: g */
    public C42075b f109413g;

    /* renamed from: h */
    private float f109414h;

    /* renamed from: i */
    private float f109415i;

    /* renamed from: j */
    private float f109416j;

    /* renamed from: k */
    private float f109417k;

    /* renamed from: l */
    private long f109418l;

    /* renamed from: m */
    private int f109419m = 2;

    /* renamed from: n */
    private int f109420n;

    /* renamed from: o */
    private int f109421o;

    /* renamed from: p */
    private boolean f109422p;

    /* renamed from: q */
    private SafeHandler f109423q;

    /* renamed from: r */
    private Runnable f109424r = new C42074a();

    /* renamed from: s */
    private boolean f109425s;

    /* renamed from: t */
    private boolean f109426t;

    /* renamed from: u */
    private boolean f109427u = C35563c.f93231M.mo93305a(Property.EnableStickerFunctionalities);

    /* renamed from: v */
    private TextStickerViewModel f109428v;

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.c$a */
    class C42074a implements Runnable {
        public final void run() {
            C42072c.this.f109410d = false;
            if (C42072c.this.f109412f != null) {
                C42072c.this.f109412f.invalidate();
            }
            if (C42072c.this.f109413g != null) {
                C42072c.this.f109413g.mo103391a(false, true);
            }
        }

        private C42074a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.c$b */
    public interface C42075b {
        /* renamed from: a */
        void mo103391a(boolean z, boolean z2);
    }

    /* renamed from: g */
    public final void mo103389g() {
        this.f109419m = 2;
    }

    /* renamed from: a */
    public final void mo103377a() {
        this.f109408b = 0.0f;
        this.f109409c = 0.0f;
    }

    /* renamed from: b */
    public final boolean mo103382b() {
        if (this.f109419m == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo103384c() {
        if (this.f109419m == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo103386d() {
        if (this.f109419m == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo103387e() {
        if (this.f109419m != 2) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private TextStickerViewModel m133866h() {
        if (this.f109428v == null) {
            this.f109428v = (TextStickerViewModel) C36113b.m116288a((FragmentActivity) this.f109412f.getContext()).mo91871a(TextStickerViewModel.class);
        }
        return this.f109428v;
    }

    /* renamed from: f */
    public final boolean mo103388f() {
        return ((TextStickerViewState) m133866h().mo106825a((FragmentActivity) C43041d.m136566a(this.f109412f.getContext()))).getInTimeEditView();
    }

    /* renamed from: a */
    public final void mo103380a(boolean z) {
        this.f109410d = z;
        if (this.f109424r != null) {
            this.f109412f.removeCallbacks(this.f109424r);
            this.f109424r = null;
        }
        if (z && this.f109423q != null && this.f109424r == null) {
            this.f109424r = new C42074a();
            this.f109412f.postDelayed(this.f109424r, 3000);
        }
        this.f109412f.invalidate();
        if (this.f109413g != null) {
            this.f109413g.mo103391a(z, false);
        }
    }

    /* renamed from: a */
    public final boolean mo103381a(MotionEvent motionEvent) {
        boolean z;
        int i;
        boolean z2;
        this.f109426t = true;
        if (this.f109407a == null || (!mo103382b() && !mo103384c())) {
            z = false;
        } else {
            RectF helpRect = this.f109412f.getHelpRect();
            C39515a.m126216a(helpRect, helpRect.centerX(), helpRect.centerY(), this.f109412f.getStickerRotate());
            C39515a.m126215a(helpRect, this.f109412f.getStickerScale());
            this.f109407a.mo103276a(this.f109412f, helpRect, this.f109420n + ((int) this.f109408b), this.f109421o + ((int) this.f109409c), true, mo103384c(), mo103388f());
            if (this.f109425s) {
                if (!mo103388f() && !C35563c.f93231M.mo93305a(Property.EnableStickerFunctionalities)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                mo103380a(z2);
                this.f109425s = false;
            }
            this.f109407a.mo103272a(this.f109412f, true, false);
            z = true;
        }
        if (this.f109419m != 6 || !this.f109412f.mo103425d(this.f109416j, this.f109417k)) {
            if (this.f109419m != 7 || !this.f109412f.mo103422c(this.f109416j, this.f109417k)) {
                if (this.f109419m != 5 || !this.f109412f.mo103426e(this.f109416j, this.f109417k)) {
                    if (!this.f109422p) {
                        return z;
                    }
                    long currentTimeMillis = System.currentTimeMillis() - this.f109418l;
                    int abs = (int) Math.abs(motionEvent.getX() - (this.f109416j + ((float) this.f109420n)));
                    float y = motionEvent.getY();
                    if (C39804em.m127436a()) {
                        i = C39804em.f103459c;
                    } else {
                        i = 0;
                    }
                    int abs2 = (int) Math.abs((y - ((float) i)) - (this.f109417k + ((float) this.f109421o)));
                    if (currentTimeMillis > 200) {
                        return true;
                    }
                    if (abs > 5 && abs2 > 5) {
                        return true;
                    }
                    if (this.f109410d || mo103388f()) {
                        if (this.f109407a != null) {
                            new C39564ap().mo98506b(true);
                            this.f109407a.mo103277a(this.f109412f, true);
                        }
                        mo103380a(false);
                        return true;
                    }
                    if (this.f109407a != null) {
                        this.f109407a.mo103277a(this.f109412f, false);
                    }
                    mo103380a(true);
                    return true;
                } else if (this.f109407a == null) {
                    return true;
                } else {
                    this.f109407a.mo103278b(this.f109412f);
                    return true;
                }
            } else if (this.f109407a == null) {
                return true;
            } else {
                this.f109407a.mo103275a(this.f109412f);
                return true;
            }
        } else if (this.f109407a == null) {
            return true;
        } else {
            this.f109407a.mo103277a(this.f109412f, true);
            return true;
        }
    }

    /* renamed from: a */
    public final void mo103378a(int i, int i2) {
        this.f109420n = i;
        this.f109421o = i2;
    }

    /* renamed from: a */
    public final void mo103379a(C42088k kVar, SafeHandler safeHandler) {
        this.f109412f = kVar;
        this.f109423q = safeHandler;
    }

    /* renamed from: a */
    public final float mo103376a(float f, float f2) {
        if (-1 != this.f109407a.mo103272a(this.f109412f, false, true)) {
            f2 = this.f109407a.mo103274a(f2).floatValue();
        }
        float f3 = f - f2;
        if (f3 > 180.0f) {
            f3 -= 360.0f;
        }
        if (f3 < -180.0f) {
            f3 += 360.0f;
        }
        if (C35563c.f93231M.mo93305a(Property.EnableStickerFunctionalities)) {
            mo103380a(false);
        }
        return f3;
    }

    /* renamed from: d */
    private void m133865d(float f, float f2) {
        int i;
        float centerX = this.f109412f.getHelpRect().centerX();
        float centerY = this.f109412f.getHelpRect().centerY();
        float centerX2 = this.f109412f.getRotateRect().centerX();
        float centerY2 = this.f109412f.getRotateRect().centerY();
        float f3 = f + centerX2;
        float f4 = f2 + centerY2;
        float f5 = centerX2 - centerX;
        float f6 = centerY2 - centerY;
        float f7 = f3 - centerX;
        float f8 = f4 - centerY;
        float sqrt = (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
        float sqrt2 = (float) Math.sqrt((double) ((f7 * f7) + (f8 * f8)));
        float f9 = sqrt2 / sqrt;
        if (this.f109412f.mo103421c(f9)) {
            this.f109412f.mo103415b(this.f109412f.getStickerScale() * f9);
        }
        double d = (double) (((f5 * f7) + (f6 * f8)) / (sqrt * sqrt2));
        if (d <= 1.0d && d >= -1.0d) {
            float degrees = (float) Math.toDegrees(Math.acos(d));
            if ((f5 * f8) - (f7 * f6) > 0.0f) {
                i = 1;
            } else {
                i = -1;
            }
            float f10 = ((float) i) * degrees;
            if (this.f109407a != null && 4 == this.f109407a.mo103272a(this.f109412f, false, true)) {
                f10 = this.f109407a.mo103274a(f10).floatValue();
            }
            this.f109412f.mo103401a(this.f109412f.getStickerRotate() + f10, true);
        }
    }

    /* renamed from: c */
    public final boolean mo103385c(float f, float f2) {
        this.f109418l = System.currentTimeMillis();
        float f3 = f - ((float) this.f109420n);
        float f4 = f2 - ((float) this.f109421o);
        this.f109416j = f3;
        this.f109417k = f4;
        boolean z = false;
        if (this.f109426t) {
            this.f109419m = 2;
            this.f109426t = false;
        }
        if (this.f109410d && !this.f109427u) {
            if (this.f109412f.mo103426e(f3, f4)) {
                this.f109419m = 5;
            } else if (this.f109412f.mo103416b(f3, f4)) {
                this.f109419m = 4;
                this.f109408b = this.f109412f.getRotateRect().centerX();
                this.f109409c = this.f109412f.getRotateRect().centerY();
            } else if (this.f109412f.mo103425d(f3, f4)) {
                this.f109419m = 6;
                this.f109408b = this.f109412f.getEditRect().centerX();
                this.f109409c = this.f109412f.getEditRect().centerY();
            } else if (this.f109412f.mo103422c(f3, f4)) {
                this.f109419m = 7;
                this.f109408b = this.f109412f.getTimeRect().centerX();
                this.f109409c = this.f109412f.getTimeRect().centerY();
            }
            z = true;
        }
        if (this.f109419m != 2 && !mo103388f()) {
            return z;
        }
        this.f109422p = this.f109412f.mo103406a(f3, f4);
        if (!this.f109422p) {
            return z;
        }
        this.f109419m = 3;
        this.f109408b = f3;
        this.f109409c = f4;
        return true;
    }

    /* renamed from: b */
    public final boolean mo103383b(float f, float f2) {
        boolean z;
        float f3 = f;
        float f4 = f2;
        float f5 = this.f109408b + f3;
        float f6 = this.f109409c + f4;
        float abs = Math.abs(f5 - this.f109416j);
        float abs2 = Math.abs(f6 - this.f109417k);
        if (abs < 5.0f && abs2 < 5.0f) {
            return false;
        }
        boolean z2 = true;
        if (this.f109407a == null || (!mo103382b() && !mo103384c())) {
            z = false;
        } else {
            RectF helpRect = this.f109412f.getHelpRect();
            C39515a.m126216a(helpRect, helpRect.centerX(), helpRect.centerY(), this.f109412f.getStickerRotate());
            C39515a.m126215a(helpRect, this.f109412f.getStickerScale());
            if (this.f109410d) {
                this.f109425s = this.f109410d;
            }
            this.f109407a.mo103276a(this.f109412f, helpRect, (int) (((float) this.f109420n) + f5), (int) (((float) this.f109421o) + f6), false, mo103384c(), mo103388f());
            if (!mo103388f()) {
                int a = this.f109407a.mo103272a(this.f109412f, false, false);
                if (-1 != a) {
                    PointF a2 = this.f109407a.mo103273a(this.f109412f, f3, f4);
                    if (3 == a) {
                        f6 = this.f109409c + a2.y;
                        f5 = this.f109408b + a2.x;
                    }
                }
            }
            z = true;
        }
        if (this.f109419m == 3) {
            this.f109419m = 3;
            this.f109414h = f5 - this.f109408b;
            this.f109415i = f6 - this.f109409c;
            this.f109412f.setCenterX(this.f109412f.getCenterX() + this.f109414h);
            this.f109412f.setCenterY(this.f109412f.getCenterY() + this.f109415i);
            this.f109412f.invalidate();
            this.f109408b = f5;
            this.f109409c = f6;
        } else if (this.f109419m == 4) {
            this.f109419m = 4;
            this.f109414h = f5 - this.f109408b;
            this.f109415i = f6 - this.f109409c;
            m133865d(this.f109414h, this.f109415i);
            this.f109412f.invalidate();
            this.f109408b = f5;
            this.f109409c = f6;
        } else {
            z2 = z;
        }
        if (z2 && this.f109410d) {
            mo103380a(false);
        }
        return z2;
    }
}
