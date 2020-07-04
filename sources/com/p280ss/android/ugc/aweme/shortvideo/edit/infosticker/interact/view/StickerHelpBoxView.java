package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.edit.p1563c.C39515a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.StickerHelpBoxView */
public class StickerHelpBoxView extends View {

    /* renamed from: A */
    private Paint f103011A;

    /* renamed from: B */
    private PointF[] f103012B;

    /* renamed from: C */
    private C39629a f103013C;

    /* renamed from: a */
    public boolean f103014a;

    /* renamed from: b */
    private Context f103015b;

    /* renamed from: c */
    private RectF f103016c;

    /* renamed from: d */
    private RectF f103017d;

    /* renamed from: e */
    private RectF f103018e;

    /* renamed from: f */
    private Rect f103019f;

    /* renamed from: g */
    private RectF f103020g;

    /* renamed from: h */
    private RectF f103021h;

    /* renamed from: i */
    private RectF f103022i;

    /* renamed from: j */
    private Bitmap f103023j;

    /* renamed from: k */
    private Bitmap f103024k;

    /* renamed from: l */
    private Bitmap f103025l;

    /* renamed from: m */
    private RectF f103026m;

    /* renamed from: n */
    private RectF f103027n;

    /* renamed from: o */
    private Paint f103028o;

    /* renamed from: p */
    private RectF f103029p;

    /* renamed from: q */
    private Paint f103030q;

    /* renamed from: r */
    private int f103031r;

    /* renamed from: s */
    private int f103032s;

    /* renamed from: t */
    private int f103033t;

    /* renamed from: u */
    private int f103034u;

    /* renamed from: v */
    private int f103035v;

    /* renamed from: w */
    private float f103036w;

    /* renamed from: x */
    private float f103037x;

    /* renamed from: y */
    private boolean f103038y;

    /* renamed from: z */
    private boolean f103039z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.StickerHelpBoxView$a */
    public interface C39629a {
        /* renamed from: a */
        void mo98870a(boolean z, boolean z2);
    }

    public PointF[] getFourAnglePoint() {
        return this.f103012B;
    }

    public RectF getHelpBoxRect() {
        return this.f103027n;
    }

    public float getRotateAngle() {
        return this.f103036w;
    }

    public RectF getRotateRect() {
        return this.f103017d;
    }

    public RectF getViewBoxRect() {
        return this.f103029p;
    }

    /* renamed from: b */
    public final void mo98856b() {
        if (!this.f103014a) {
            this.f103014a = true;
            invalidate();
            if (this.f103013C != null) {
                this.f103013C.mo98870a(true, false);
            }
        }
    }

    /* renamed from: c */
    private void m126891c() {
        this.f103023j = BitmapFactory.decodeResource(this.f103015b.getResources(), R.drawable.aiy);
        this.f103024k = BitmapFactory.decodeResource(this.f103015b.getResources(), R.drawable.aj0);
        this.f103025l = BitmapFactory.decodeResource(this.f103015b.getResources(), R.drawable.a4l);
        this.f103016c = new RectF(0.0f, 0.0f, (float) (this.f103035v << 1), (float) (this.f103035v << 1));
        this.f103017d = new RectF(0.0f, 0.0f, (float) (this.f103035v << 1), (float) (this.f103035v << 1));
        this.f103018e = new RectF(0.0f, 0.0f, (float) (this.f103035v << 1), (float) (this.f103035v << 1));
        this.f103019f.set(0, 0, this.f103023j.getWidth(), this.f103023j.getHeight());
        this.f103028o.setColor(-2130706433);
        this.f103028o.setStyle(Style.STROKE);
        this.f103028o.setAntiAlias(true);
        this.f103028o.setStrokeWidth(2.0f);
        this.f103030q = new Paint(this.f103028o);
        this.f103030q.setColor(-1);
        this.f103030q.setStyle(Style.FILL);
        this.f103031r = (int) C9738o.m28708b(this.f103015b, 10.0f);
        this.f103032s = (int) C9738o.m28708b(this.f103015b, 16.0f);
        this.f103033t = (int) C9738o.m28708b(this.f103015b, 8.0f);
        this.f103034u = (int) C9738o.m28708b(this.f103015b, 5.0f);
        this.f103011A = new Paint();
        this.f103011A.setColor(-65536);
    }

    /* renamed from: a */
    public final void mo98852a() {
        RectF rectF = new RectF(this.f103026m);
        C39515a.m126215a(rectF, this.f103037x);
        if (this.f103038y) {
            this.f103029p.set(rectF.left - ((float) this.f103032s), rectF.top - ((float) this.f103033t), rectF.right + ((float) this.f103032s), rectF.bottom + ((float) this.f103033t));
        } else {
            this.f103029p.set(rectF);
        }
        this.f103027n.set(this.f103029p.left - ((float) this.f103031r), this.f103029p.top - ((float) this.f103031r), this.f103029p.right + ((float) this.f103031r), this.f103029p.bottom + ((float) this.f103031r));
        float width = (float) (((int) this.f103016c.width()) >> 1);
        this.f103016c.offsetTo(this.f103027n.left - width, this.f103027n.top - width);
        this.f103017d.offsetTo(this.f103027n.right - width, this.f103027n.bottom - width);
        this.f103018e.offsetTo(this.f103027n.left - width, this.f103027n.bottom - width);
        this.f103020g.set(this.f103016c);
        this.f103021h.set(this.f103017d);
        this.f103022i.set(this.f103018e);
        C39515a.m126216a(this.f103016c, this.f103027n.centerX(), this.f103027n.centerY(), this.f103036w);
        C39515a.m126216a(this.f103017d, this.f103027n.centerX(), this.f103027n.centerY(), this.f103036w);
        C39515a.m126216a(this.f103018e, this.f103027n.centerX(), this.f103027n.centerY(), this.f103036w);
        this.f103012B[0].x = this.f103029p.left;
        this.f103012B[0].y = this.f103029p.top;
        this.f103012B[1].x = this.f103029p.right;
        this.f103012B[1].y = this.f103029p.top;
        this.f103012B[2].x = this.f103029p.left;
        this.f103012B[2].y = this.f103029p.bottom;
        this.f103012B[3].x = this.f103029p.right;
        this.f103012B[3].y = this.f103029p.bottom;
        for (PointF a : this.f103012B) {
            C39515a.m126213a(a, this.f103027n.centerX(), this.f103027n.centerY(), (float) Math.toRadians((double) this.f103036w));
        }
    }

    public void setStickerShowHelpboxCallback(C39629a aVar) {
        this.f103013C = aVar;
    }

    public StickerHelpBoxView(Context context) {
        this(context, null);
    }

    public void setShowBg(boolean z) {
        this.f103038y = z;
        invalidate();
    }

    /* renamed from: a */
    public final void mo98854a(Rect rect) {
        this.f103026m.set(rect);
    }

    /* renamed from: a */
    public final void mo98855a(boolean z) {
        if (this.f103014a) {
            this.f103014a = false;
            invalidate();
            if (this.f103013C != null) {
                this.f103013C.mo98870a(false, z);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mo98852a();
        canvas.save();
        canvas.rotate(this.f103036w, this.f103026m.centerX(), this.f103026m.centerY());
        if (this.f103038y) {
            canvas.drawRoundRect(this.f103029p, (float) this.f103034u, (float) this.f103034u, this.f103030q);
        }
        if (this.f103014a) {
            if (this.f103039z) {
                this.f103028o.setColor(-1);
                canvas.drawRect(this.f103027n, this.f103028o);
            } else {
                this.f103028o.setColor(-2130706433);
                canvas.drawRect(this.f103027n, this.f103028o);
                canvas.drawBitmap(this.f103023j, this.f103019f, this.f103020g, null);
                canvas.drawBitmap(this.f103024k, this.f103019f, this.f103021h, null);
                canvas.drawBitmap(this.f103025l, this.f103019f, this.f103022i, null);
            }
        }
        canvas.restore();
    }

    /* renamed from: a */
    public final void mo98853a(float f, float f2) {
        this.f103037x = f;
        this.f103036w = f2;
        invalidate();
    }

    /* renamed from: b */
    public final void mo98857b(float f, float f2) {
        this.f103026m.offset(f, f2);
        invalidate();
    }

    /* renamed from: c */
    public final boolean mo98858c(float f, float f2) {
        return C39515a.m126217b(this.f103027n, f, f2, this.f103036w);
    }

    /* renamed from: d */
    public final boolean mo98859d(float f, float f2) {
        return C39515a.m126217b(this.f103017d, f, f2, this.f103036w);
    }

    /* renamed from: e */
    public final boolean mo98860e(float f, float f2) {
        return C39515a.m126217b(this.f103016c, f, f2, this.f103036w);
    }

    /* renamed from: f */
    public final boolean mo98861f(float f, float f2) {
        return C39515a.m126217b(this.f103018e, f, f2, this.f103036w);
    }

    public StickerHelpBoxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f103016c = new RectF();
        this.f103017d = new RectF();
        this.f103018e = new RectF();
        this.f103019f = new Rect();
        this.f103020g = new RectF();
        this.f103021h = new RectF();
        this.f103022i = new RectF();
        this.f103026m = new RectF();
        this.f103027n = new RectF();
        this.f103028o = new Paint();
        this.f103029p = new RectF();
        this.f103030q = new Paint();
        this.f103031r = 10;
        this.f103032s = 10;
        this.f103033t = 10;
        this.f103034u = 10;
        this.f103035v = 30;
        this.f103014a = false;
        this.f103038y = false;
        this.f103039z = C35563c.f93231M.mo93305a(Property.EnableStickerFunctionalities);
        this.f103012B = new PointF[]{new PointF(), new PointF(), new PointF(), new PointF()};
        this.f103015b = context;
        this.f103035v = (int) C9738o.m28708b(context, 14.0f);
        m126891c();
    }
}
