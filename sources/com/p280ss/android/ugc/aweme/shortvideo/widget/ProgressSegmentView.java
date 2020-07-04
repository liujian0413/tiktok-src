package com.p280ss.android.ugc.aweme.shortvideo.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import com.p280ss.android.vesdk.VERecordData.VERecordSegmentData;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ProgressSegmentView */
public class ProgressSegmentView extends View {

    /* renamed from: A */
    private List<TimeSpeedModelExtension> f108295A;

    /* renamed from: a */
    private List<TimeSpeedModelExtension> f108296a;

    /* renamed from: b */
    private long f108297b;

    /* renamed from: c */
    private Paint f108298c;

    /* renamed from: d */
    private Paint f108299d;

    /* renamed from: e */
    private Paint f108300e;

    /* renamed from: f */
    private Paint f108301f;

    /* renamed from: g */
    private Paint f108302g;

    /* renamed from: h */
    private Paint f108303h;

    /* renamed from: i */
    private Paint f108304i;

    /* renamed from: j */
    private long f108305j;

    /* renamed from: k */
    private long f108306k;

    /* renamed from: l */
    private long f108307l;

    /* renamed from: m */
    private long f108308m;

    /* renamed from: n */
    private long f108309n;

    /* renamed from: o */
    private long f108310o;

    /* renamed from: p */
    private boolean f108311p;

    /* renamed from: q */
    private String f108312q;

    /* renamed from: r */
    private float f108313r;

    /* renamed from: s */
    private float f108314s;

    /* renamed from: t */
    private boolean f108315t;

    /* renamed from: u */
    private int f108316u;

    /* renamed from: v */
    private List<VERecordSegmentData> f108317v;

    /* renamed from: w */
    private int f108318w;

    /* renamed from: x */
    private ValueAnimator f108319x;

    /* renamed from: y */
    private ValueAnimator f108320y;

    /* renamed from: z */
    private long f108321z;

    /* renamed from: a */
    public final void mo102348a(boolean z) {
        if (this.f108319x != null) {
            if (z) {
                this.f108319x.start();
                return;
            }
            this.f108319x.end();
            this.f108313r = 1.0f;
        }
    }

    private long getLongVideoAnchorPosition() {
        return m132613a(this.f108308m);
    }

    /* renamed from: a */
    public final void mo102344a() {
        this.f108315t = true;
        this.f108320y.start();
        mo102348a(false);
    }

    /* renamed from: b */
    private boolean m132617b() {
        if (this.f108309n <= 30000 || this.f108297b >= this.f108308m) {
            return false;
        }
        return true;
    }

    public void setAnchorDuration(long j) {
        this.f108308m = j;
    }

    public void setNeedDrawAnchor(boolean z) {
        this.f108311p = z;
    }

    public void setMaxDuration(long j) {
        this.f108309n = j;
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo102349b(ValueAnimator valueAnimator) {
        this.f108313r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public void setAnchorString(String str) {
        this.f108312q = str;
        this.f108310o = (long) this.f108304i.measureText(this.f108312q);
    }

    /* renamed from: a */
    private float m132612a(List<VERecordSegmentData> list) {
        long j = 0;
        for (int i = 0; i < list.size(); i++) {
            j += ((VERecordSegmentData) list.get(i)).f116377c;
        }
        return ((float) this.f108305j) / ((float) j);
    }

    /* renamed from: a */
    private long m132613a(long j) {
        double d = (double) j;
        Double.isNaN(d);
        double d2 = d * 1.0d;
        double d3 = (double) this.f108305j;
        Double.isNaN(d3);
        double d4 = d2 * d3;
        double d5 = (double) this.f108309n;
        Double.isNaN(d5);
        return (long) (d4 / d5);
    }

    /* renamed from: b */
    private void m132616b(Canvas canvas) {
        int i;
        if (m132617b()) {
            long longVideoAnchorPosition = getLongVideoAnchorPosition();
            long j = longVideoAnchorPosition - 2;
            canvas.drawRect((float) j, 0.0f, (float) (longVideoAnchorPosition + 2), (float) this.f108306k, this.f108301f);
            String str = this.f108312q;
            float f = (float) (j - (this.f108310o / 2));
            float y = getY() + ((float) (this.f108306k * 2));
            if (C39805en.m127445a()) {
                i = C39805en.m127450c(getContext());
            } else {
                i = 0;
            }
            canvas.drawText(str, f, y - ((float) i), this.f108304i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo102345a(ValueAnimator valueAnimator) {
        this.f108314s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f108316u == 2) {
            m132614a(canvas);
            return;
        }
        long a = m132613a(this.f108297b);
        if (this.f108297b < this.f108309n) {
            canvas.drawLine((float) a, (float) this.f108307l, (float) this.f108305j, (float) this.f108307l, this.f108298c);
        }
        long j = 0;
        if (a > 0) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, (float) this.f108307l, (float) this.f108306k);
            canvas.drawCircle((float) this.f108307l, (float) this.f108307l, (float) this.f108307l, this.f108299d);
            canvas.restore();
            canvas.drawRect((float) this.f108307l, 0.0f, (float) Math.min(a, this.f108305j - this.f108307l), (float) this.f108306k, this.f108299d);
        }
        if (this.f108297b >= this.f108309n) {
            canvas.save();
            canvas.clipRect((float) (this.f108305j - this.f108307l), 0.0f, (float) this.f108305j, (float) this.f108306k);
            canvas.drawCircle((float) (this.f108305j - this.f108307l), (float) this.f108307l, (float) this.f108307l, this.f108299d);
            canvas.restore();
        }
        if (this.f108296a != null) {
            for (int i = 0; i < this.f108296a.size(); i++) {
                TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) this.f108296a.get(i);
                j += (long) TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension.getDuration(), timeSpeedModelExtension.getSpeed());
                int a2 = (int) m132613a(j);
                if (((long) a2) < this.f108305j) {
                    canvas.drawRect((float) (a2 - 4), 0.0f, (float) a2, (float) this.f108306k, this.f108301f);
                }
            }
            m132616b(canvas);
            return;
        }
        if (this.f108311p) {
            m132616b(canvas);
        }
    }

    /* renamed from: a */
    private void m132614a(Canvas canvas) {
        int i;
        Canvas canvas2 = canvas;
        float a = m132612a(this.f108317v);
        float f = 0.0f;
        int i2 = 0;
        float f2 = 0.0f;
        while (i2 < this.f108317v.size()) {
            int i3 = (int) (((float) ((VERecordSegmentData) this.f108317v.get(i2)).f116377c) * a);
            if (i2 == this.f108318w) {
                this.f108298c.setStrokeCap(Cap.BUTT);
                float f3 = f2 + ((float) i3);
                Canvas canvas3 = canvas;
                float f4 = f2;
                canvas3.drawLine(f4, (float) this.f108307l, f3, (float) this.f108307l, this.f108298c);
                if (this.f108295A != null && this.f108321z >= 0) {
                    m132615a(canvas, f2, f3, a * 1000.0f, this.f108321z);
                }
                if (this.f108315t) {
                    this.f108303h.setAlpha((int) (this.f108314s * 255.0f));
                    canvas.drawRect(f2, 0.0f, f3, (float) this.f108306k, this.f108303h);
                }
                i = i2;
                f2 = f3;
            } else {
                if (i2 == 0) {
                    canvas.save();
                    canvas2.clipRect(f, f, (float) this.f108307l, (float) this.f108306k);
                    canvas2.drawCircle((float) this.f108307l, (float) this.f108307l, (float) this.f108307l, this.f108300e);
                    canvas.restore();
                    int i4 = i2;
                    canvas.drawRect((float) this.f108307l, 0.0f, (float) Math.min((long) i3, this.f108305j - this.f108307l), (float) this.f108306k, this.f108300e);
                    i = i4;
                } else {
                    i = i2;
                    if (i == this.f108317v.size() - 1) {
                        canvas.save();
                        canvas2.clipRect((float) (this.f108305j - this.f108307l), 0.0f, (float) this.f108305j, (float) this.f108306k);
                        canvas2.drawCircle((float) (this.f108305j - this.f108307l), (float) this.f108307l, (float) this.f108307l, this.f108300e);
                        canvas.restore();
                        canvas.drawRect(f2, 0.0f, (float) (this.f108305j - this.f108307l), (float) this.f108306k, this.f108300e);
                    } else {
                        canvas.drawRect(f2, 0.0f, f2 + ((float) i3), (float) this.f108306k, this.f108300e);
                    }
                }
                float f5 = f2 + ((float) i3);
                if (i == this.f108318w - 1) {
                    this.f108302g.setAlpha((int) (this.f108313r * 255.0f));
                    canvas.drawRect(f5 - 4.0f, 0.0f, f5, (float) this.f108306k, this.f108302g);
                } else if (i != this.f108317v.size() - 1) {
                    canvas.drawRect(f5 - 4.0f, 0.0f, f5, (float) this.f108306k, this.f108301f);
                }
                f2 = f5;
            }
            i2 = i + 1;
            f = 0.0f;
        }
    }

    /* renamed from: a */
    public final void mo102346a(RetakeVideoContext retakeVideoContext) {
        if (retakeVideoContext.f99690d != null) {
            this.f108317v = retakeVideoContext.f99690d.f116371b;
            this.f108318w = retakeVideoContext.f99689c;
            this.f108316u = 2;
            if (this.f108295A != null) {
                this.f108295A = null;
            }
            this.f108321z = 0;
        }
    }

    public ProgressSegmentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public final void mo102350b(List<TimeSpeedModelExtension> list, long j) {
        this.f108295A = list;
        this.f108321z = j;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f108305j = (long) getMeasuredWidth();
        this.f108306k = (long) (getMeasuredHeight() / 3);
        this.f108307l = this.f108306k >> 1;
    }

    /* renamed from: a */
    public final void mo102347a(List<TimeSpeedModelExtension> list, long j) {
        this.f108296a = list;
        this.f108297b = j;
        this.f108316u = 1;
        postInvalidate();
    }

    public ProgressSegmentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f108308m = C40413c.f105051b;
        this.f108309n = C40413c.f105051b;
        this.f108312q = "15s";
        this.f108316u = 1;
        this.f108298c = new Paint(1);
        this.f108298c.setStyle(Style.STROKE);
        this.f108298c.setStrokeCap(Cap.ROUND);
        this.f108298c.setStrokeWidth(C9738o.m28708b(context, 6.0f));
        this.f108298c.setColor(getResources().getColor(R.color.a3d));
        this.f108300e = new Paint(1);
        this.f108300e.setColor(getResources().getColor(R.color.a4v));
        this.f108300e.setAlpha(86);
        this.f108299d = new Paint(1);
        this.f108299d.setColor(getResources().getColor(R.color.a4v));
        this.f108301f = new Paint(1);
        this.f108301f.setStyle(Style.FILL);
        this.f108301f.setColor(getResources().getColor(R.color.zg));
        this.f108302g = new Paint(1);
        this.f108302g.setStyle(Style.FILL);
        this.f108302g.setColor(getResources().getColor(R.color.zg));
        this.f108303h = new Paint(1);
        this.f108303h.setStyle(Style.FILL);
        this.f108303h.setColor(getResources().getColor(R.color.zg));
        this.f108304i = new Paint(1);
        this.f108304i.setStyle(Style.FILL);
        this.f108304i.setColor(getResources().getColor(R.color.zg));
        this.f108304i.setTextSize(C9738o.m28690a(getContext(), 12.0f));
        this.f108304i.setShadowLayer(4.0f, 0.0f, 2.0f, getResources().getColor(R.color.a80));
        this.f108310o = (long) this.f108304i.measureText(this.f108312q);
        this.f108319x = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}).setDuration(350);
        this.f108319x.setRepeatCount(-1);
        this.f108319x.setRepeatMode(2);
        this.f108319x.addUpdateListener(new C41693f(this));
        this.f108320y = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f, 0.0f}).setDuration(700);
        this.f108320y.addUpdateListener(new C41694g(this));
    }

    /* renamed from: a */
    private void m132615a(Canvas canvas, float f, float f2, float f3, long j) {
        float f4;
        if (j > 0) {
            float f5 = (((float) j) * f3) + f;
            float min = Math.min(f5, f2);
            if (this.f108318w == 0) {
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, (float) this.f108307l, (float) this.f108306k);
                canvas.drawCircle((float) this.f108307l, (float) this.f108307l, (float) this.f108307l, this.f108299d);
                canvas.restore();
                f4 = ((float) this.f108307l) + f;
            } else {
                if (f5 >= f2 && this.f108318w == this.f108317v.size() - 1) {
                    canvas.save();
                    canvas.clipRect(f2 - ((float) this.f108307l), 0.0f, f2, (float) this.f108306k);
                    canvas.drawCircle(f2 - ((float) this.f108307l), (float) this.f108307l, (float) this.f108307l, this.f108299d);
                    canvas.restore();
                    min = f2 - ((float) this.f108307l);
                }
                f4 = f;
            }
            canvas.drawRect(f4, 0.0f, min, (float) this.f108306k, this.f108299d);
        }
        if (this.f108295A != null) {
            for (int i = 0; i < this.f108295A.size(); i++) {
                TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) this.f108295A.get(i);
                f += ((float) ((long) TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension.getDuration(), timeSpeedModelExtension.getSpeed()))) * f3;
                if (this.f108318w != this.f108317v.size() - 1 || f < f2) {
                    float min2 = Math.min(f, f2);
                    canvas.drawRect(min2 - 4.0f, 0.0f, min2, (float) this.f108306k, this.f108301f);
                }
            }
        }
    }
}
