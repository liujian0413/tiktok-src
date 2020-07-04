package com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.p1662a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.edit.p1563c.C39515a;
import com.p280ss.android.ugc.aweme.story.shootvideo.textfont.C42039d;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.C42088k;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a */
public final class C42070a {

    /* renamed from: A */
    private int f109354A;

    /* renamed from: B */
    private TextPaint f109355B = new TextPaint();

    /* renamed from: C */
    private Paint f109356C = new Paint();

    /* renamed from: D */
    private boolean f109357D = C35563c.f93231M.mo93305a(Property.EnableStickerFunctionalities);

    /* renamed from: E */
    private Path f109358E;

    /* renamed from: F */
    private C42088k f109359F;

    /* renamed from: G */
    private float f109360G;

    /* renamed from: H */
    private float f109361H;

    /* renamed from: I */
    private boolean f109362I = false;

    /* renamed from: J */
    private float f109363J;

    /* renamed from: K */
    private Paint f109364K;

    /* renamed from: L */
    private List<PointF> f109365L = new ArrayList();

    /* renamed from: M */
    private Paint f109366M = new Paint();

    /* renamed from: a */
    public RectF f109367a = new RectF();

    /* renamed from: b */
    public RectF f109368b = new RectF();

    /* renamed from: c */
    public RectF f109369c = new RectF();

    /* renamed from: d */
    public RectF f109370d = new RectF();

    /* renamed from: e */
    public RectF f109371e = new RectF();

    /* renamed from: f */
    public RectF f109372f = new RectF();

    /* renamed from: g */
    public String[] f109373g;

    /* renamed from: h */
    private Rect f109374h = new Rect();

    /* renamed from: i */
    private RectF f109375i = new RectF();

    /* renamed from: j */
    private RectF f109376j = new RectF();

    /* renamed from: k */
    private RectF f109377k = new RectF();

    /* renamed from: l */
    private RectF f109378l = new RectF();

    /* renamed from: m */
    private Bitmap f109379m;

    /* renamed from: n */
    private Bitmap f109380n;

    /* renamed from: o */
    private Bitmap f109381o;

    /* renamed from: p */
    private Bitmap f109382p;

    /* renamed from: q */
    private Paint f109383q;

    /* renamed from: r */
    private int f109384r = 0;

    /* renamed from: s */
    private float f109385s = 60.0f;

    /* renamed from: t */
    private int f109386t = 20;

    /* renamed from: u */
    private int f109387u = 20;

    /* renamed from: v */
    private int f109388v;

    /* renamed from: w */
    private int f109389w;

    /* renamed from: x */
    private int f109390x = 20;

    /* renamed from: y */
    private int f109391y = 30;

    /* renamed from: z */
    private int f109392z = 10;

    /* renamed from: a */
    public final void mo103366a(Context context, C42088k kVar) {
        this.f109359F = kVar;
        this.f109359F.setLayerType(2, null);
        this.f109385s = C9738o.m28690a(context, 28.0f);
        this.f109386t = (int) C9738o.m28708b(context, 12.0f);
        this.f109387u = (int) C9738o.m28708b(context, 8.0f);
        this.f109388v = this.f109386t;
        this.f109389w = this.f109387u;
        this.f109390x = (int) C9738o.m28708b(context, 12.0f);
        this.f109391y = (int) C9738o.m28708b(context, 14.0f);
        this.f109392z = (int) C9738o.m28708b(context, 2.0f);
        this.f109354A = (int) C9738o.m28708b(context, 5.0f);
        this.f109379m = BitmapFactory.decodeResource(context.getResources(), R.drawable.aiy);
        this.f109380n = BitmapFactory.decodeResource(context.getResources(), R.drawable.aj0);
        this.f109381o = BitmapFactory.decodeResource(context.getResources(), R.drawable.a4l);
        this.f109382p = BitmapFactory.decodeResource(context.getResources(), R.drawable.aj3);
        this.f109374h.set(0, 0, this.f109379m.getWidth(), this.f109379m.getHeight());
        this.f109369c = new RectF(0.0f, 0.0f, (float) (this.f109391y << 1), (float) (this.f109391y << 1));
        this.f109370d = new RectF(0.0f, 0.0f, (float) (this.f109391y << 1), (float) (this.f109391y << 1));
        this.f109371e = new RectF(0.0f, 0.0f, (float) (this.f109391y << 1), (float) (this.f109391y << 1));
        this.f109372f = new RectF(0.0f, 0.0f, (float) (this.f109391y << 1), (float) (this.f109391y << 1));
        this.f109355B.setColor(-1);
        this.f109355B.setTypeface(Typeface.DEFAULT_BOLD);
        this.f109355B.setTextSize(this.f109385s);
        this.f109355B.setAntiAlias(true);
        this.f109364K = new Paint(this.f109355B);
        this.f109364K.setColor(-16737912);
        this.f109356C.setColor(-2130706433);
        this.f109356C.setStyle(Style.STROKE);
        this.f109356C.setAntiAlias(true);
        this.f109356C.setStrokeWidth(2.0f);
        this.f109383q = new Paint();
        this.f109383q.setStyle(Style.FILL);
        this.f109383q.setAntiAlias(true);
        this.f109383q.setXfermode(new PorterDuffXfermode(Mode.DST_OVER));
        this.f109383q.setPathEffect(new CornerPathEffect((float) this.f109354A));
        this.f109358E = new Path();
    }

    /* renamed from: a */
    public final void mo103367a(Canvas canvas, float f, float f2, PointF pointF, int i, boolean z, boolean z2, boolean z3, int i2) {
        this.f109360G = pointF.x;
        this.f109361H = pointF.y;
        this.f109355B.setTextSize(((float) i2) * f);
        this.f109363J = f2;
        if (this.f109373g != null) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.f109373g.length; i4++) {
                Rect rect = new Rect();
                this.f109355B.getTextBounds(this.f109373g[i4], 0, this.f109373g[i4].length(), rect);
                if (rect.width() > i3) {
                    i3 = rect.width();
                }
            }
            if (i == 1) {
                this.f109360G -= (float) (i3 / 2);
            }
            if (i == 3) {
                this.f109360G += (float) (i3 / 2);
            }
        }
        m133847a(this.f109360G, this.f109361H, f, i);
        m133846a(f2);
        m133850a(canvas, f2, z2, z3);
        m133848a(canvas, this.f109360G, this.f109361H, f2, i);
        m133849a(canvas, f2, z);
    }

    /* renamed from: b */
    public final PointF[] mo103369b() {
        PointF[] pointFArr = new PointF[this.f109365L.size()];
        float radians = (float) Math.toRadians((double) this.f109363J);
        for (int i = 0; i < pointFArr.length; i++) {
            pointFArr[i] = C39515a.m126213a((PointF) this.f109365L.get(i), this.f109368b.centerX(), this.f109368b.centerY(), radians);
        }
        return pointFArr;
    }

    /* renamed from: c */
    public final PointF[] mo103370c() {
        PointF[] pointFArr = {new PointF(this.f109367a.left, this.f109367a.top), new PointF(this.f109367a.right, this.f109367a.top), new PointF(this.f109367a.right, this.f109367a.bottom), new PointF(this.f109367a.left, this.f109367a.bottom)};
        float radians = (float) Math.toRadians((double) this.f109363J);
        for (int i = 0; i < 4; i++) {
            pointFArr[i] = C39515a.m126213a(pointFArr[i], this.f109367a.centerX(), this.f109367a.centerY(), radians);
        }
        return pointFArr;
    }

    public C42070a() {
        this.f109366M.setColor(C23481i.m77088a(R.color.a3t));
        this.f109366M.setAlpha(76);
    }

    /* renamed from: a */
    public final RectF mo103364a() {
        RectF rectF = new RectF();
        rectF.set(this.f109367a);
        rectF.set(rectF.left - ((float) this.f109390x), rectF.top - ((float) this.f109390x), rectF.right + ((float) this.f109390x), rectF.bottom + ((float) this.f109390x));
        return rectF;
    }

    /* renamed from: a */
    public final void mo103365a(int i) {
        this.f109383q.setColor(i);
        this.f109384r = i;
        if (this.f109362I) {
            this.f109355B.setShadowLayer(12.0f, 0.0f, 0.0f, i);
        } else {
            this.f109355B.setShadowLayer(0.0f, 0.0f, 0.0f, i);
        }
    }

    /* renamed from: b */
    public final void mo103368b(int i) {
        this.f109362I = C42039d.m133620a().mo103237e();
        if (this.f109355B.getTypeface() != C42039d.m133620a().mo103235d()) {
            this.f109355B.setTypeface(C42039d.m133620a().mo103235d());
        }
        if (this.f109362I) {
            this.f109355B.setColor(-1);
            this.f109355B.setShadowLayer(12.0f, 0.0f, 0.0f, i);
            return;
        }
        this.f109355B.setShadowLayer(0.0f, 0.0f, 0.0f, i);
        this.f109355B.setColor(i);
    }

    /* renamed from: a */
    private void m133846a(float f) {
        float width = (float) (((int) this.f109369c.width()) >> 1);
        this.f109369c.offsetTo(this.f109368b.left - width, this.f109368b.top - width);
        this.f109370d.offsetTo(this.f109368b.right - width, this.f109368b.bottom - width);
        this.f109371e.offsetTo(this.f109368b.left - width, this.f109368b.bottom - width);
        this.f109372f.offsetTo(this.f109368b.right - width, this.f109368b.top - width);
        this.f109375i.set(this.f109369c);
        this.f109376j.set(this.f109370d);
        this.f109377k.set(this.f109371e);
        this.f109378l.set(this.f109372f);
        C39515a.m126216a(this.f109369c, this.f109368b.centerX(), this.f109368b.centerY(), f);
        C39515a.m126216a(this.f109370d, this.f109368b.centerX(), this.f109368b.centerY(), f);
        C39515a.m126216a(this.f109371e, this.f109368b.centerX(), this.f109368b.centerY(), f);
        C39515a.m126216a(this.f109372f, this.f109368b.centerX(), this.f109368b.centerY(), f);
    }

    /* renamed from: a */
    private void m133849a(Canvas canvas, float f, boolean z) {
        if (!this.f109362I && z) {
            canvas.save();
            canvas.rotate(f, this.f109368b.centerX(), this.f109368b.centerY());
            this.f109383q.setColor(this.f109384r);
            canvas.drawPath(this.f109358E, this.f109383q);
            canvas.restore();
        }
    }

    /* renamed from: a */
    private void m133850a(Canvas canvas, float f, boolean z, boolean z2) {
        if (z) {
            canvas.save();
            canvas.rotate(f, this.f109368b.centerX(), this.f109368b.centerY());
            if (this.f109357D) {
                this.f109356C.setColor(-1);
                canvas.drawRoundRect(this.f109368b, (float) this.f109392z, (float) this.f109392z, this.f109356C);
            } else {
                this.f109356C.setColor(-2130706433);
                canvas.drawRoundRect(this.f109368b, (float) this.f109392z, (float) this.f109392z, this.f109356C);
                canvas.drawBitmap(this.f109379m, this.f109374h, this.f109375i, null);
                canvas.drawBitmap(this.f109380n, this.f109374h, this.f109376j, null);
                canvas.drawBitmap(this.f109381o, this.f109374h, this.f109377k, null);
                if (z2) {
                    canvas.drawBitmap(this.f109382p, this.f109374h, this.f109378l, null);
                }
            }
            canvas.restore();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x017a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m133847a(float r25, float r26, float r27, int r28) {
        /*
            r24 = this;
            r0 = r24
            r3 = r28
            java.lang.String[] r4 = r0.f109373g
            if (r4 == 0) goto L_0x0367
            java.lang.String[] r4 = r0.f109373g
            int r4 = r4.length
            if (r4 != 0) goto L_0x000f
            goto L_0x0367
        L_0x000f:
            android.text.TextPaint r4 = r0.f109355B
            android.graphics.Paint$FontMetrics r4 = r4.getFontMetrics()
            float r5 = r4.ascent
            float r6 = r4.descent
            java.lang.String[] r7 = r0.f109373g
            int r7 = r7.length
            int r8 = r7 + -1
            float r9 = (float) r8
            float r10 = r4.descent
            float r4 = r4.ascent
            float r10 = r10 - r4
            float r9 = r9 * r10
            android.graphics.PointF[][] r4 = new android.graphics.PointF[r7][]
            float r6 = r6 - r5
            int r5 = (int) r6
            int r6 = r0.f109388v
            float r6 = (float) r6
            float r6 = r6 * r27
            int r6 = (int) r6
            r0.f109386t = r6
            int r6 = r0.f109389w
            float r6 = (float) r6
            float r6 = r6 * r27
            int r6 = (int) r6
            r0.f109387u = r6
            int r6 = r0.f109387u
            int r10 = r0.f109389w
            if (r6 < r10) goto L_0x0044
            int r6 = r0.f109389w
            r0.f109387u = r6
        L_0x0044:
            int r6 = r0.f109386t
            int r10 = r0.f109388v
            if (r6 < r10) goto L_0x004e
            int r6 = r0.f109388v
            r0.f109386t = r6
        L_0x004e:
            r6 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r6
            float r6 = r26 - r9
            int r6 = (int) r6
            float r9 = r0.f109385s
            float r9 = r9 * r27
            r2 = 1082130432(0x40800000, float:4.0)
            float r9 = r9 / r2
            r2 = -1
            r2 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = -1
            r18 = -1
        L_0x0067:
            if (r2 >= r7) goto L_0x018a
            android.text.TextPaint r11 = r0.f109355B
            java.lang.String[] r10 = r0.f109373g
            r10 = r10[r2]
            float r10 = r11.measureText(r10)
            int r10 = (int) r10
            int r11 = r10 / 2
            float r11 = (float) r11
            float r19 = r25 - r11
            r20 = r15
            int r15 = r0.f109386t
            float r15 = (float) r15
            float r19 = r19 - r15
            float r11 = r25 + r11
            int r15 = r0.f109386t
            float r15 = (float) r15
            float r11 = r11 + r15
            r15 = 1
            if (r3 != r15) goto L_0x0095
            int r11 = r0.f109386t
            float r11 = (float) r11
            float r19 = r25 - r11
            float r11 = (float) r10
            float r11 = r25 + r11
            int r15 = r0.f109386t
            float r15 = (float) r15
            float r11 = r11 + r15
        L_0x0095:
            r15 = 3
            if (r3 != r15) goto L_0x00a5
            float r11 = (float) r10
            float r11 = r25 - r11
            int r15 = r0.f109386t
            float r15 = (float) r15
            float r19 = r11 - r15
            int r11 = r0.f109386t
            float r11 = (float) r11
            float r11 = r25 + r11
        L_0x00a5:
            java.lang.String[] r15 = r0.f109373g
            r15 = r15[r2]
            java.lang.String r15 = r15.trim()
            int r15 = r15.length()
            if (r15 != 0) goto L_0x00ca
            r15 = 1
            if (r3 != r15) goto L_0x00be
            int r11 = r0.f109386t
            float r11 = (float) r11
            float r11 = r25 + r11
            r19 = r11
            goto L_0x00c0
        L_0x00be:
            r19 = r25
        L_0x00c0:
            r11 = 3
            if (r3 != r11) goto L_0x00c8
            int r11 = r0.f109386t
            float r11 = (float) r11
            float r19 = r25 - r11
        L_0x00c8:
            r11 = r19
        L_0x00ca:
            int r12 = r10 - r12
            int r12 = java.lang.Math.abs(r12)
            float r12 = (float) r12
            int r12 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r12 >= 0) goto L_0x00ef
            r12 = 1
            if (r3 != r12) goto L_0x00de
            r12 = 0
            int r15 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r15 <= 0) goto L_0x00f0
            goto L_0x00f3
        L_0x00de:
            r12 = 0
            r15 = 3
            if (r3 != r15) goto L_0x00e7
            int r15 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r15 <= 0) goto L_0x00f0
            goto L_0x00f3
        L_0x00e7:
            r15 = 2
            if (r3 != r15) goto L_0x00f0
            int r15 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r15 <= 0) goto L_0x00f0
            goto L_0x00f3
        L_0x00ef:
            r12 = 0
        L_0x00f0:
            r13 = r11
            r14 = r19
        L_0x00f3:
            if (r2 != 0) goto L_0x00f7
            int r16 = r6 - r5
        L_0x00f7:
            int r11 = r16 + r5
            r15 = 1
            if (r7 <= r15) goto L_0x0123
            if (r2 <= 0) goto L_0x010c
            android.text.TextPaint r15 = r0.f109355B
            java.lang.String[] r12 = r0.f109373g
            int r17 = r2 + -1
            r12 = r12[r17]
            float r12 = r15.measureText(r12)
            int r12 = (int) r12
            goto L_0x010e
        L_0x010c:
            r12 = r17
        L_0x010e:
            if (r2 >= r8) goto L_0x0120
            android.text.TextPaint r15 = r0.f109355B
            r21 = r5
            java.lang.String[] r5 = r0.f109373g
            int r17 = r2 + 1
            r5 = r5[r17]
            float r5 = r15.measureText(r5)
            int r5 = (int) r5
            goto L_0x0129
        L_0x0120:
            r21 = r5
            goto L_0x0127
        L_0x0123:
            r21 = r5
            r12 = r17
        L_0x0127:
            r5 = r18
        L_0x0129:
            if (r12 <= 0) goto L_0x0130
            if (r10 < r12) goto L_0x0130
            int r15 = r0.f109387u
            int r11 = r11 + r15
        L_0x0130:
            if (r5 <= 0) goto L_0x0137
            if (r10 <= r5) goto L_0x0137
            int r15 = r0.f109387u
            int r11 = r11 + r15
        L_0x0137:
            if (r2 != 0) goto L_0x013d
            int r15 = r0.f109387u
            int r16 = r16 - r15
        L_0x013d:
            r15 = r16
            if (r2 != r8) goto L_0x0147
            r22 = r5
            int r5 = r0.f109387u
            int r11 = r11 + r5
            goto L_0x0149
        L_0x0147:
            r22 = r5
        L_0x0149:
            r5 = 4
            android.graphics.PointF[] r5 = new android.graphics.PointF[r5]
            r23 = r6
            android.graphics.PointF r6 = new android.graphics.PointF
            float r15 = (float) r15
            r6.<init>(r14, r15)
            r16 = 0
            r5[r16] = r6
            android.graphics.PointF r6 = new android.graphics.PointF
            r6.<init>(r13, r15)
            r15 = 1
            r5[r15] = r6
            android.graphics.PointF r6 = new android.graphics.PointF
            float r15 = (float) r11
            r6.<init>(r13, r15)
            r16 = 2
            r5[r16] = r6
            android.graphics.PointF r6 = new android.graphics.PointF
            r6.<init>(r14, r15)
            r15 = 3
            r5[r15] = r6
            r4[r2] = r5
            r5 = r20
            if (r10 <= r5) goto L_0x017a
            r15 = r10
            goto L_0x017b
        L_0x017a:
            r15 = r5
        L_0x017b:
            int r2 = r2 + 1
            r16 = r11
            r17 = r12
            r5 = r21
            r18 = r22
            r6 = r23
            r12 = r10
            goto L_0x0067
        L_0x018a:
            r5 = r15
            android.graphics.Path r2 = r0.f109358E
            r2.reset()
            java.util.List<android.graphics.PointF> r2 = r0.f109365L
            r2.clear()
            r2 = 0
        L_0x0196:
            if (r2 >= r7) goto L_0x0231
            if (r2 != 0) goto L_0x01ac
            android.graphics.Path r6 = r0.f109358E
            r9 = r4[r2]
            r10 = 0
            r9 = r9[r10]
            float r9 = r9.x
            r11 = r4[r2]
            r11 = r11[r10]
            float r10 = r11.y
            r6.moveTo(r9, r10)
        L_0x01ac:
            android.graphics.Path r6 = r0.f109358E
            r9 = r4[r2]
            r10 = 1
            r9 = r9[r10]
            float r9 = r9.x
            r11 = r4[r2]
            r11 = r11[r10]
            float r11 = r11.y
            r6.lineTo(r9, r11)
            r6 = r4[r2]
            r9 = 0
            r6 = r6[r9]
            float r6 = r6.x
            r9 = r4[r2]
            r9 = r9[r10]
            float r9 = r9.x
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x01f3
            android.graphics.Path r6 = r0.f109358E
            r9 = r4[r2]
            r9 = r9[r10]
            float r9 = r9.x
            r11 = r4[r2]
            r11 = r11[r10]
            float r10 = r11.y
            r6.lineTo(r9, r10)
            android.graphics.Path r6 = r0.f109358E
            r9 = r4[r2]
            r10 = 2
            r9 = r9[r10]
            float r9 = r9.x
            r11 = r4[r2]
            r11 = r11[r10]
            float r11 = r11.y
            r6.lineTo(r9, r11)
            goto L_0x01f4
        L_0x01f3:
            r10 = 2
        L_0x01f4:
            android.graphics.Path r6 = r0.f109358E
            r9 = r4[r2]
            r9 = r9[r10]
            float r9 = r9.x
            r11 = r4[r2]
            r11 = r11[r10]
            float r10 = r11.y
            r6.lineTo(r9, r10)
            java.util.List<android.graphics.PointF> r6 = r0.f109365L
            r9 = r4[r2]
            r10 = 0
            r9 = r9[r10]
            r6.add(r9)
            java.util.List<android.graphics.PointF> r6 = r0.f109365L
            r9 = r4[r2]
            r10 = 1
            r9 = r9[r10]
            r6.add(r9)
            java.util.List<android.graphics.PointF> r6 = r0.f109365L
            r9 = r4[r2]
            r10 = 2
            r9 = r9[r10]
            r6.add(r9)
            java.util.List<android.graphics.PointF> r6 = r0.f109365L
            r9 = r4[r2]
            r10 = 3
            r9 = r9[r10]
            r6.add(r9)
            int r2 = r2 + 1
            goto L_0x0196
        L_0x0231:
            r2 = r8
        L_0x0232:
            if (r2 < 0) goto L_0x02a2
            r6 = r4[r2]
            r7 = 0
            r6 = r6[r7]
            float r6 = r6.x
            r7 = r4[r2]
            r9 = 1
            r7 = r7[r9]
            float r7 = r7.x
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x0259
            android.graphics.Path r6 = r0.f109358E
            r7 = r4[r2]
            r9 = 3
            r7 = r7[r9]
            float r7 = r7.x
            r10 = r4[r2]
            r10 = r10[r9]
            float r10 = r10.y
            r6.lineTo(r7, r10)
            goto L_0x025a
        L_0x0259:
            r9 = 3
        L_0x025a:
            android.graphics.Path r6 = r0.f109358E
            r7 = r4[r2]
            r7 = r7[r9]
            float r7 = r7.x
            r10 = r4[r2]
            r10 = r10[r9]
            float r9 = r10.y
            r6.lineTo(r7, r9)
            r6 = r4[r2]
            r7 = 0
            r6 = r6[r7]
            float r6 = r6.x
            r9 = r4[r2]
            r10 = 1
            r9 = r9[r10]
            float r9 = r9.x
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x028e
            android.graphics.Path r6 = r0.f109358E
            r9 = r4[r2]
            r9 = r9[r7]
            float r9 = r9.x
            r10 = r4[r2]
            r10 = r10[r7]
            float r10 = r10.y
            r6.lineTo(r9, r10)
        L_0x028e:
            android.graphics.Path r6 = r0.f109358E
            r9 = r4[r2]
            r9 = r9[r7]
            float r9 = r9.x
            r10 = r4[r2]
            r10 = r10[r7]
            float r10 = r10.y
            r6.lineTo(r9, r10)
            int r2 = r2 + -1
            goto L_0x0232
        L_0x02a2:
            r7 = 0
            android.graphics.Path r2 = r0.f109358E
            r6 = r4[r7]
            r9 = 1
            r6 = r6[r9]
            float r6 = r6.x
            r10 = r4[r7]
            r10 = r10[r9]
            float r9 = r10.y
            r2.lineTo(r6, r9)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.text.TextPaint r6 = r0.f109355B
            java.lang.String[] r9 = r0.f109373g
            r9 = r9[r7]
            java.lang.String[] r10 = r0.f109373g
            r10 = r10[r7]
            int r10 = r10.length()
            r6.getTextBounds(r9, r7, r10, r2)
            int r2 = r5 >> 1
            r6 = 1
            if (r3 != r6) goto L_0x02f0
            android.graphics.RectF r6 = new android.graphics.RectF
            int r9 = r0.f109386t
            float r9 = (float) r9
            float r9 = r25 - r9
            r10 = r4[r7]
            r10 = r10[r7]
            float r7 = r10.y
            float r10 = (float) r5
            float r10 = r25 + r10
            int r11 = r0.f109386t
            float r11 = (float) r11
            float r10 = r10 + r11
            r11 = r4[r8]
            r12 = 2
            r11 = r11[r12]
            float r11 = r11.y
            r6.<init>(r9, r7, r10, r11)
            r0.f109367a = r6
        L_0x02f0:
            r6 = 3
            if (r3 != r6) goto L_0x0315
            android.graphics.RectF r6 = new android.graphics.RectF
            float r5 = (float) r5
            float r5 = r25 - r5
            int r7 = r0.f109386t
            float r7 = (float) r7
            float r5 = r5 - r7
            r7 = 0
            r9 = r4[r7]
            r9 = r9[r7]
            float r7 = r9.y
            int r9 = r0.f109386t
            float r9 = (float) r9
            float r9 = r25 + r9
            r10 = r4[r8]
            r11 = 2
            r10 = r10[r11]
            float r10 = r10.y
            r6.<init>(r5, r7, r9, r10)
            r0.f109367a = r6
            goto L_0x0316
        L_0x0315:
            r11 = 2
        L_0x0316:
            if (r3 != r11) goto L_0x033a
            android.graphics.RectF r3 = new android.graphics.RectF
            float r2 = (float) r2
            float r5 = r25 - r2
            int r6 = r0.f109386t
            float r6 = (float) r6
            float r5 = r5 - r6
            r6 = 0
            r7 = r4[r6]
            r6 = r7[r6]
            float r6 = r6.y
            float r1 = r25 + r2
            int r2 = r0.f109386t
            float r2 = (float) r2
            float r1 = r1 + r2
            r2 = r4[r8]
            r4 = 2
            r2 = r2[r4]
            float r2 = r2.y
            r3.<init>(r5, r6, r1, r2)
            r0.f109367a = r3
        L_0x033a:
            android.graphics.RectF r1 = r0.f109368b
            android.graphics.RectF r2 = r0.f109367a
            r1.set(r2)
            android.graphics.RectF r1 = r0.f109368b
            android.graphics.RectF r2 = r0.f109368b
            float r2 = r2.left
            int r3 = r0.f109390x
            float r3 = (float) r3
            float r2 = r2 - r3
            android.graphics.RectF r3 = r0.f109368b
            float r3 = r3.top
            int r4 = r0.f109390x
            float r4 = (float) r4
            float r3 = r3 - r4
            android.graphics.RectF r4 = r0.f109368b
            float r4 = r4.right
            int r5 = r0.f109390x
            float r5 = (float) r5
            float r4 = r4 + r5
            android.graphics.RectF r5 = r0.f109368b
            float r5 = r5.bottom
            int r6 = r0.f109390x
            float r6 = (float) r6
            float r5 = r5 + r6
            r1.set(r2, r3, r4, r5)
            return
        L_0x0367:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.p1662a.C42070a.m133847a(float, float, float, int):void");
    }

    /* renamed from: a */
    private void m133848a(Canvas canvas, float f, float f2, float f3, int i) {
        Canvas canvas2 = canvas;
        float f4 = f;
        int i2 = i;
        FontMetrics fontMetrics = this.f109355B.getFontMetrics();
        float f5 = fontMetrics.ascent;
        float f6 = fontMetrics.descent;
        int length = this.f109373g.length;
        float f7 = ((((float) (length - 1)) * (fontMetrics.descent - fontMetrics.ascent)) / 2.0f) - f6;
        canvas.save();
        canvas2.rotate(f3, this.f109368b.centerX(), this.f109368b.centerY());
        for (int i3 = 0; i3 < length; i3++) {
            float f8 = (((float) (-((length - i3) - 1))) * (f6 - f5)) + f7;
            Rect rect = new Rect();
            this.f109355B.getTextBounds(this.f109373g[i3], 0, this.f109373g[i3].length(), rect);
            if (i2 == 2) {
                canvas2.drawText(this.f109373g[i3], f4 - ((float) (rect.width() / 2)), f2 + f8 + ((float) (this.f109387u * i3)), this.f109355B);
            } else if (i2 == 1) {
                canvas2.drawText(this.f109373g[i3], f4, f2 + f8 + ((float) (this.f109387u * i3)), this.f109355B);
            } else if (i2 == 3) {
                canvas2.drawText(this.f109373g[i3], f4 - ((float) rect.width()), f2 + f8 + ((float) (this.f109387u * i3)), this.f109355B);
            }
        }
        canvas.restore();
    }
}
