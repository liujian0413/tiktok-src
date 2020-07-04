package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.p022v4.util.C0902i;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView.C39541b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.p1565a.C39547c;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.p1565a.C39548d;
import com.p280ss.android.ugc.aweme.shortvideo.edit.p1563c.C39515a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.aj */
public final class C39558aj implements C39548d<C39547c>, Cloneable {

    /* renamed from: n */
    public static boolean f102692n;

    /* renamed from: p */
    private static final float f102693p = C9738o.m28708b((Context) C35563c.f93238a, 44.0f);

    /* renamed from: q */
    private static final int f102694q = ((int) C9738o.m28708b((Context) C35563c.f93238a, 12.0f));

    /* renamed from: r */
    private static final int f102695r = ((int) C9738o.m28708b((Context) C35563c.f93238a, 14.0f));

    /* renamed from: s */
    private static final int f102696s = ((int) C9738o.m28708b((Context) C35563c.f93238a, 8.0f));

    /* renamed from: x */
    private static Bitmap f102697x;

    /* renamed from: y */
    private static Bitmap f102698y;

    /* renamed from: z */
    private static Bitmap f102699z;

    /* renamed from: A */
    private RectF f102700A;

    /* renamed from: B */
    private RectF f102701B;

    /* renamed from: C */
    private RectF f102702C;

    /* renamed from: D */
    private PointF[] f102703D = new PointF[4];

    /* renamed from: E */
    private Paint f102704E;

    /* renamed from: F */
    private boolean f102705F = C35563c.f93231M.mo93305a(Property.EnableStickerFunctionalities);

    /* renamed from: a */
    public float f102706a = 0.15f;

    /* renamed from: b */
    public float f102707b = 3.0f;

    /* renamed from: c */
    public StickerItemModel f102708c;

    /* renamed from: d */
    boolean f102709d;

    /* renamed from: e */
    public RectF f102710e;

    /* renamed from: f */
    public RectF f102711f;

    /* renamed from: g */
    public Matrix f102712g;

    /* renamed from: h */
    public RectF f102713h;

    /* renamed from: i */
    public RectF f102714i;

    /* renamed from: j */
    public RectF f102715j;

    /* renamed from: k */
    public long f102716k;

    /* renamed from: l */
    public boolean f102717l = true;

    /* renamed from: m */
    public float f102718m = 1.0f;

    /* renamed from: o */
    public boolean f102719o = false;

    /* renamed from: t */
    private final C39586c f102720t;

    /* renamed from: u */
    private Paint f102721u = new Paint();

    /* renamed from: v */
    private PointF[] f102722v = {new PointF(), new PointF(), new PointF(), new PointF()};

    /* renamed from: w */
    private Rect f102723w;

    /* renamed from: a */
    private void m126341a(Canvas canvas, boolean z) {
    }

    /* renamed from: a */
    public final boolean mo98489a() {
        return !this.f102708c.isLyric();
    }

    /* renamed from: a */
    public final boolean mo98490a(int i, int i2, int i3, int i4, float f, float f2) {
        f102692n = C39804em.m127437a(i, i2);
        float f3 = ((((float) i) * f) - (this.f102708c.initWidth / 2.0f)) + ((float) i3);
        float f4 = ((((float) i2) * f2) - (this.f102708c.initHeight / 2.0f)) + ((float) i4);
        this.f102710e = new RectF(f3, f4, this.f102708c.initWidth + f3, this.f102708c.initHeight + f4);
        this.f102712g = new Matrix();
        if (this.f102719o) {
            this.f102706a = 0.5f;
            this.f102707b = 3.0f;
        } else {
            this.f102706a = Math.max(f102693p / this.f102708c.initWidth, f102693p / this.f102708c.initHeight);
        }
        this.f102711f = new RectF(this.f102710e);
        m126346f();
        m126342a(this.f102711f);
        return true;
    }

    /* renamed from: a */
    public final void mo98487a(int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        this.f102718m = 1.0f;
        f102692n = C39804em.m127437a(i, i2);
        float f5 = ((((float) i) * f) - (f3 / 2.0f)) + ((float) i3);
        float f6 = ((((float) i2) * f2) - (f4 / 2.0f)) + ((float) i4);
        this.f102710e = new RectF(f5, f6, f5 + f3, f6 + f4);
        this.f102712g = new Matrix();
        if (this.f102719o) {
            this.f102706a = 0.5f;
            this.f102707b = 3.0f;
        } else {
            this.f102706a = Math.max(f102693p / f3, f102693p / f4);
        }
        this.f102711f = new RectF(this.f102710e);
        m126346f();
        m126342a(this.f102711f);
    }

    /* renamed from: a */
    public final void mo98488a(Canvas canvas) {
        if (this.f102711f != null && this.f102700A != null && this.f102701B != null && this.f102702C != null) {
            int i = (!C39805en.m127445a() || !C39804em.m127436a()) ? 0 : C39804em.f103459c;
            RectF rectF = this.f102711f;
            float f = (float) i;
            rectF.top += f;
            this.f102711f.bottom += f;
            this.f102700A.top += f;
            this.f102700A.bottom += f;
            this.f102701B.top += f;
            this.f102701B.bottom += f;
            this.f102702C.top += f;
            this.f102702C.bottom += f;
            if (this.f102709d) {
                canvas.save();
                canvas.rotate(this.f102708c.rotateAngle, this.f102711f.centerX(), this.f102711f.centerY());
                if (this.f102705F) {
                    canvas.drawRect(this.f102711f, this.f102721u);
                } else {
                    canvas.drawRect(this.f102711f, this.f102721u);
                    canvas.drawBitmap(f102697x, this.f102723w, this.f102700A, null);
                    canvas.drawBitmap(f102698y, this.f102723w, this.f102701B, null);
                    if (this.f102717l) {
                        canvas.drawBitmap(f102699z, this.f102723w, this.f102702C, null);
                    }
                }
                canvas.restore();
                m126341a(canvas, false);
                this.f102716k = System.currentTimeMillis();
            }
            float width = this.f102710e.width() / 2.0f;
            float height = this.f102710e.height() / 2.0f;
            float centerX = this.f102710e.centerX();
            float centerY = this.f102710e.centerY();
            float f2 = centerX - width;
            float f3 = centerY - height;
            this.f102703D[0].set(f2, f3);
            float f4 = centerX + width;
            this.f102703D[1].set(f4, f3);
            float f5 = centerY + height;
            this.f102703D[2].set(f4, f5);
            this.f102703D[3].set(f2, f5);
            this.f102711f.top -= f;
            this.f102711f.bottom -= f;
            this.f102700A.top -= f;
            this.f102700A.bottom -= f;
            this.f102701B.top -= f;
            this.f102701B.bottom -= f;
            this.f102702C.top -= f;
            this.f102702C.bottom -= f;
        }
    }

    /* renamed from: b */
    public final int mo98491b() {
        return this.f102708c.startTime;
    }

    /* renamed from: c */
    public final int mo98494c() {
        return this.f102708c.endTime;
    }

    /* renamed from: d */
    public final float mo98497d() {
        return this.f102708c.rotateAngle;
    }

    public final int hashCode() {
        return this.f102708c.hashCode();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public C39558aj clone() {
        try {
            return (C39558aj) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public C39547c mo98475e() {
        C39547c cVar = new C39547c(this.f102708c.startTime, this.f102708c.endTime, this.f102708c.rotateAngle, this.f102708c.scale, this.f102708c.currentOffsetX, this.f102708c.currentOffsetY);
        return cVar;
    }

    /* renamed from: f */
    private void m126346f() {
        this.f102711f.left -= (float) f102694q;
        this.f102711f.right += (float) f102694q;
        this.f102711f.top -= (float) f102694q;
        this.f102711f.bottom += (float) f102694q;
    }

    /* renamed from: a */
    public final int mo98472a(int i) {
        return mo98491b();
    }

    /* renamed from: b */
    public final int mo98474b(int i) {
        return mo98494c();
    }

    public final void setAlpha(boolean z) {
        if (z) {
            this.f102720t.mo98612i(this);
        } else {
            this.f102720t.mo98611h(this);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39558aj)) {
            return false;
        }
        return this.f102708c.equals(((C39558aj) obj).f102708c);
    }

    /* renamed from: a */
    private void m126340a(Context context) {
        this.f102721u.setColor(context.getResources().getColor(R.color.sj));
        this.f102721u.setStyle(Style.STROKE);
        this.f102721u.setAntiAlias(true);
        this.f102721u.setStrokeWidth(2.0f);
        this.f102704E = new Paint();
        this.f102704E.setColor(-65536);
    }

    /* renamed from: b */
    private static void m126344b(Context context) {
        if (f102697x == null) {
            f102697x = BitmapFactory.decodeResource(context.getResources(), R.drawable.aiy);
        }
        if (f102698y == null) {
            f102698y = BitmapFactory.decodeResource(context.getResources(), R.drawable.aj0);
        }
        if (f102699z == null) {
            f102699z = BitmapFactory.decodeResource(context.getResources(), R.drawable.aj3);
        }
    }

    /* renamed from: b */
    private static void m126345b(RectF rectF) {
        rectF.left -= (float) f102696s;
        rectF.right += (float) f102696s;
        rectF.top -= (float) f102696s;
        rectF.bottom += (float) f102696s;
    }

    /* renamed from: a */
    private void m126342a(RectF rectF) {
        this.f102723w = new Rect(0, 0, f102697x.getWidth(), f102697x.getHeight());
        this.f102700A = new RectF(rectF.left - ((float) f102695r), rectF.top - ((float) f102695r), rectF.left + ((float) f102695r), rectF.top + ((float) f102695r));
        this.f102701B = new RectF(rectF.right - ((float) f102695r), rectF.bottom - ((float) f102695r), rectF.right + ((float) f102695r), rectF.bottom + ((float) f102695r));
        this.f102702C = new RectF(rectF.right - ((float) f102695r), rectF.top - ((float) f102695r), rectF.right + ((float) f102695r), rectF.top + ((float) f102695r));
        this.f102713h = new RectF(this.f102701B);
        this.f102714i = new RectF(this.f102700A);
        this.f102715j = new RectF(this.f102702C);
        m126345b(this.f102713h);
        m126345b(this.f102714i);
        m126345b(this.f102715j);
        for (int i = 0; i < 4; i++) {
            this.f102703D[i] = new PointF();
        }
    }

    /* renamed from: b */
    public final void mo98492b(float f) {
        this.f102718m *= f;
        this.f102712g.postScale(f, f, this.f102710e.centerX(), this.f102710e.centerY());
        C39515a.m126215a(this.f102710e, f);
        this.f102711f.set(this.f102710e);
        m126346f();
        this.f102701B.offsetTo(this.f102711f.right - ((float) f102695r), this.f102711f.bottom - ((float) f102695r));
        this.f102700A.offsetTo(this.f102711f.left - ((float) f102695r), this.f102711f.top - ((float) f102695r));
        this.f102702C.offsetTo(this.f102711f.right - ((float) f102695r), this.f102711f.top - ((float) f102695r));
        this.f102713h.offsetTo(this.f102701B.left - ((float) f102696s), this.f102701B.top - ((float) f102696s));
        this.f102714i.offsetTo(this.f102700A.left - ((float) f102696s), this.f102700A.top - ((float) f102696s));
        this.f102715j.offsetTo(this.f102702C.left - ((float) f102696s), this.f102702C.top - ((float) f102696s));
        C39515a.m126216a(this.f102713h, this.f102710e.centerX(), this.f102710e.centerY(), this.f102708c.rotateAngle);
        C39515a.m126216a(this.f102714i, this.f102710e.centerX(), this.f102710e.centerY(), this.f102708c.rotateAngle);
        C39515a.m126216a(this.f102715j, this.f102710e.centerX(), this.f102710e.centerY(), this.f102708c.rotateAngle);
    }

    /* renamed from: c */
    public final PointF[] mo98495c(float f) {
        this.f102722v[0].x = this.f102710e.left;
        this.f102722v[0].y = this.f102710e.top;
        this.f102722v[1].x = this.f102710e.right;
        this.f102722v[1].y = this.f102710e.top;
        this.f102722v[2].x = this.f102710e.right;
        this.f102722v[2].y = this.f102710e.bottom;
        this.f102722v[3].x = this.f102710e.left;
        this.f102722v[3].y = this.f102710e.bottom;
        for (PointF a : this.f102722v) {
            C39515a.m126213a(a, this.f102710e.centerX(), this.f102710e.centerY(), (float) Math.toRadians((double) mo98497d()));
        }
        PointF pointF = this.f102722v[0];
        pointF.x -= f;
        PointF pointF2 = this.f102722v[1];
        pointF2.x -= f;
        PointF pointF3 = this.f102722v[2];
        pointF3.x -= f;
        PointF pointF4 = this.f102722v[3];
        pointF4.x -= f;
        return this.f102722v;
    }

    /* renamed from: a */
    public final void mo98485a(float f) {
        if (f != 0.0f) {
            this.f102712g.postRotate(f, this.f102710e.centerX(), this.f102710e.centerY());
            C39515a.m126216a(this.f102713h, this.f102710e.centerX(), this.f102710e.centerY(), f);
            C39515a.m126216a(this.f102714i, this.f102710e.centerX(), this.f102710e.centerY(), f);
            C39515a.m126216a(this.f102715j, this.f102710e.centerX(), this.f102710e.centerY(), f);
        }
    }

    /* renamed from: a */
    public static void m126339a(int i, int i2) {
        f102692n = C39804em.m127437a(i, i2);
    }

    /* renamed from: b */
    public final PointF[] mo98493b(float f, float f2) {
        PointF[] pointFArr = new PointF[this.f102703D.length];
        for (int i = 0; i < pointFArr.length; i++) {
            pointFArr[i] = this.f102703D[i];
            PointF pointF = pointFArr[i];
            pointF.x -= f;
            PointF pointF2 = pointFArr[i];
            pointF2.y -= f2;
        }
        for (PointF a : pointFArr) {
            C39515a.m126213a(a, this.f102710e.centerX(), this.f102710e.centerY(), (float) Math.toRadians((double) mo98497d()));
        }
        return pointFArr;
    }

    /* renamed from: a */
    public final void mo98486a(float f, float f2) {
        this.f102712g.postTranslate(f, f2);
        this.f102710e.offset(f, f2);
        this.f102711f.offset(f, f2);
        this.f102700A.offset(f, f2);
        this.f102701B.offset(f, f2);
        this.f102702C.offset(f, f2);
        this.f102713h.offset(f, f2);
        this.f102714i.offset(f, f2);
        this.f102715j.offset(f, f2);
    }

    C39558aj(Context context, StickerItemModel stickerItemModel, C39586c cVar) {
        this.f102708c = stickerItemModel;
        this.f102720t = cVar;
        m126340a(context);
        m126344b(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo98473a(C39547c cVar, int i, int i2) {
        C39586c cVar2 = this.f102720t;
        cVar2.mo98588a(this, cVar.f102673a, cVar.f102674b);
        C39547c h = mo98475e();
        cVar2.mo98586a(this, (cVar.f102677e - h.f102677e) * ((float) i), (cVar.f102678f - h.f102678f) * ((float) i2));
        cVar2.mo98585a(this, cVar.f102675c - h.f102675c);
        cVar2.mo98597b(this, cVar.f102676d / h.f102676d);
    }

    /* renamed from: a */
    public final C0902i<Float, Float> mo98484a(float f, float f2, C39541b bVar) {
        int i;
        this.f102716k = System.currentTimeMillis();
        float centerX = this.f102710e.centerX();
        float centerY = this.f102710e.centerY();
        float centerX2 = this.f102713h.centerX();
        float centerY2 = this.f102713h.centerY();
        float f3 = f + centerX2;
        float f4 = f2 + centerY2;
        float f5 = centerX2 - centerX;
        float f6 = centerY2 - centerY;
        float f7 = f3 - centerX;
        float f8 = f4 - centerY;
        float sqrt = (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
        float sqrt2 = (float) Math.sqrt((double) ((f7 * f7) + (f8 * f8)));
        float f9 = sqrt2 / sqrt;
        double d = (double) (((f5 * f7) + (f6 * f8)) / (sqrt * sqrt2));
        if (d > 1.0d || d < -1.0d) {
            return C0902i.m3837a(Float.valueOf(f9), Float.valueOf(0.0f));
        }
        float degrees = (float) Math.toDegrees(Math.acos(d));
        if ((f5 * f8) - (f7 * f6) > 0.0f) {
            i = 1;
        } else {
            i = -1;
        }
        float f10 = ((float) i) * degrees;
        if (bVar != null) {
            f10 = bVar.mo98457a(f10);
        }
        return C0902i.m3837a(Float.valueOf(f9), Float.valueOf(f10));
    }
}
