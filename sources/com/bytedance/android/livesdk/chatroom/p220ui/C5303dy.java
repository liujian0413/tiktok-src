package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.view.View;
import android.view.View.MeasureSpec;
import com.bytedance.common.utility.C9738o;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.dy */
public final class C5303dy extends View {

    /* renamed from: a */
    public int f15510a;

    /* renamed from: b */
    public int f15511b;

    /* renamed from: c */
    public Context f15512c;

    /* renamed from: d */
    private Paint f15513d;

    /* renamed from: e */
    private Paint f15514e = new Paint();

    /* renamed from: f */
    private int f15515f;

    /* renamed from: g */
    private int f15516g;

    /* renamed from: h */
    private int f15517h;

    /* renamed from: i */
    private int f15518i;

    /* renamed from: j */
    private int f15519j = 12;

    /* renamed from: k */
    private int f15520k;

    /* renamed from: l */
    private RectF f15521l;

    /* renamed from: m */
    private C5304a f15522m;

    /* renamed from: n */
    private C5304a f15523n;

    /* renamed from: o */
    private PathEffect f15524o;

    /* renamed from: p */
    private float f15525p;

    /* renamed from: q */
    private float f15526q;

    /* renamed from: r */
    private float f15527r;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dy$a */
    public class C5304a {

        /* renamed from: a */
        public float f15528a;

        /* renamed from: b */
        public float f15529b;

        /* renamed from: c */
        float f15530c = 2.0f;

        /* renamed from: a */
        public final void mo13587a(int i) {
            float b = (((float) C5303dy.this.f15510a) - C9738o.m28708b(C5303dy.this.f15512c, 2.0f)) / this.f15530c;
            double d = (double) i;
            float f = ((float) C5303dy.this.f15510a) / this.f15530c;
            Double.isNaN(d);
            double d2 = (d * 3.141592653589793d) / 180.0d;
            this.f15528a = f + (((float) Math.cos(d2)) * b);
            this.f15529b = (((float) C5303dy.this.f15511b) / this.f15530c) + (((float) Math.sin(d2)) * b);
        }

        public C5304a(int i) {
            mo13587a(0);
        }
    }

    public final void setColor(int i) {
        this.f15520k = i;
    }

    public C5303dy(Context context) {
        super(context);
        m16977a(context);
    }

    /* renamed from: a */
    private static int m16976a(int i) {
        double d = (double) i;
        Double.isNaN(d);
        int sin = (int) (Math.sin((d * 3.141592653589793d) / 90.0d) * 345.0d * -1.0d);
        if ((i < 0 || i >= 45) && ((135 > i || i >= 225) && (315 > i || i >= 360))) {
            return sin;
        }
        return -sin;
    }

    /* renamed from: a */
    private void m16977a(Context context) {
        this.f15512c = context;
        this.f15515f = 0;
        this.f15516g = 0;
        this.f15521l = new RectF();
        this.f15522m = new C5304a(0);
        this.f15523n = new C5304a(0);
        this.f15524o = new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f);
        this.f15525p = C9738o.m28708b(this.f15512c, 1.9f);
        this.f15526q = C9738o.m28708b(this.f15512c, 2.0f);
        this.f15527r = C9738o.m28708b(this.f15512c, 2.0f) / 2.0f;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f15513d == null) {
            this.f15513d = new Paint();
            this.f15513d.setAntiAlias(true);
            this.f15513d.setStyle(Style.STROKE);
        }
        this.f15513d.setColor(this.f15520k);
        this.f15513d.setPathEffect(this.f15524o);
        this.f15513d.setStrokeWidth(this.f15525p);
        canvas.drawArc(this.f15521l, ((float) this.f15515f) / 4.0f, 359.0f, false, this.f15513d);
        this.f15513d.setPathEffect(null);
        int a = m16976a(this.f15515f);
        if (this.f15515f % 90 == 45) {
            this.f15518i = (this.f15516g - this.f15517h) - 1;
            this.f15516g = this.f15517h + 1;
        }
        if (a == 0) {
            this.f15516g += this.f15518i;
        }
        this.f15513d.setStrokeWidth(this.f15526q);
        canvas.drawArc(this.f15521l, (float) (this.f15516g - this.f15519j), (float) a, false, this.f15513d);
        this.f15522m.mo13587a(this.f15516g - this.f15519j);
        this.f15523n.mo13587a((this.f15516g - this.f15519j) + a);
        this.f15514e.setColor(this.f15520k);
        canvas.drawCircle(this.f15522m.f15528a, this.f15522m.f15529b, this.f15527r, this.f15514e);
        canvas.drawCircle(this.f15523n.f15528a, this.f15523n.f15529b, this.f15527r, this.f15514e);
        this.f15517h = this.f15516g + a;
        this.f15515f = (this.f15515f + 1) % 360;
        this.f15516g = (this.f15516g + 1) % 360;
        postInvalidateDelayed(15);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f15510a = MeasureSpec.getSize(i);
        this.f15511b = MeasureSpec.getSize(i2);
        float b = C9738o.m28708b(this.f15512c, 1.0f);
        this.f15521l.set(b, b, ((float) this.f15510a) - b, ((float) this.f15511b) - b);
    }
}
