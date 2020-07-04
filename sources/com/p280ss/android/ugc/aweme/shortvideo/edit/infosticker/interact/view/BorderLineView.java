package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.asve.p756d.C15450d;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C39601a;
import com.p280ss.android.ugc.aweme.utils.C43127fh;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.BorderLineView */
public class BorderLineView extends FrameLayout {

    /* renamed from: a */
    RectF f102951a;

    /* renamed from: b */
    PointF[] f102952b;

    /* renamed from: c */
    private int f102953c;

    /* renamed from: d */
    private int f102954d;

    /* renamed from: e */
    private RectF f102955e;

    /* renamed from: f */
    private int f102956f;

    /* renamed from: g */
    private Paint f102957g;

    /* renamed from: h */
    private DashPathEffect f102958h;

    /* renamed from: i */
    private float f102959i;

    /* renamed from: j */
    private int f102960j;

    /* renamed from: k */
    private int f102961k;

    /* renamed from: l */
    private Vibrator f102962l;

    /* renamed from: m */
    private int f102963m;

    /* renamed from: n */
    private C39630a f102964n;

    public int getDeltaX() {
        return this.f102960j;
    }

    public int getViewWidth() {
        return this.f102961k;
    }

    /* renamed from: a */
    public final void mo98797a() {
        m126823c(false);
        m126818a(false);
        m126821b(false);
        m126826d(false);
        m126828e(false);
        m126830f(false);
        m126832g(false);
        m126834h(false);
        m126836i(false);
        if (this.f102964n != null) {
            this.f102964n.mo98872b(false);
            this.f102964n.mo98871a(false);
        }
    }

    /* renamed from: a */
    public final boolean mo98798a(PointF[] pointFArr, float f) {
        if (pointFArr == null) {
            return true;
        }
        RectF a = C39601a.m126687a(pointFArr);
        if (a.isEmpty()) {
            return true;
        }
        a.offset((float) this.f102960j, 0.0f);
        if (this.f102955e == null) {
            return true;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(f, a.centerX(), a.centerY());
        matrix.mapRect(a);
        return this.f102955e.contains(a);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m126819b();
    }

    /* renamed from: c */
    private boolean m126824c() {
        if ((this.f102963m & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) == 128) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private boolean m126827d() {
        if ((this.f102963m & 256) == 256) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private boolean m126829e() {
        if ((this.f102963m & 64) == 64) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private boolean m126831f() {
        if ((this.f102963m & 32) == 32) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private boolean m126833g() {
        if ((this.f102963m & 16) == 16) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private boolean m126835h() {
        if ((this.f102963m & 8) == 8) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private boolean m126837i() {
        if ((this.f102963m & 4) == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private boolean m126838j() {
        if ((this.f102963m & 2) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private boolean m126839k() {
        if ((this.f102963m & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private void m126840l() {
        if (this.f102962l != null) {
            try {
                this.f102962l.vibrate(30);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    private void m126819b() {
        mo98797a();
        if (!C15450d.m45250b()) {
            m126825d(getContext());
        }
        m126820b(getContext());
    }

    private float getLeftViewXMargin() {
        if (C43127fh.m136806a(getContext())) {
            return (float) this.f102956f;
        }
        return C9738o.m28708b(getContext(), 8.0f);
    }

    private float getRightViewXMargin() {
        if (C43127fh.m136806a(getContext())) {
            return ((float) C39805en.m127447b(getContext())) - C9738o.m28708b(getContext(), 8.0f);
        }
        return (float) (C39805en.m127447b(getContext()) - this.f102956f);
    }

    public void setDeltaX(int i) {
        this.f102960j = i;
    }

    public void setViewWidth(int i) {
        this.f102961k = i;
    }

    private BorderLineView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private static int m126815a(Context context) {
        boolean a = C39804em.m127436a();
        int c = C39805en.m127450c(context);
        int a2 = C39805en.m127443a(context);
        if (!a) {
            c = 0;
        }
        return a2 - c;
    }

    /* renamed from: c */
    private void m126822c(Context context) {
        this.f102955e = new RectF(getLeftViewXMargin(), (float) (-getHeight()), getRightViewXMargin(), ((float) m126815a(context)) - this.f102959i);
    }

    /* renamed from: d */
    private void m126826d(boolean z) {
        if (z) {
            this.f102963m |= 32;
        } else {
            this.f102963m &= -33;
        }
        postInvalidate();
    }

    /* renamed from: e */
    private void m126828e(boolean z) {
        if (z) {
            this.f102963m |= 16;
        } else {
            this.f102963m &= -17;
        }
        postInvalidate();
    }

    /* renamed from: f */
    private void m126830f(boolean z) {
        if (z) {
            if (!m126835h()) {
                m126840l();
            }
            this.f102963m |= 8;
        } else {
            this.f102963m &= -9;
        }
        postInvalidate();
    }

    /* renamed from: g */
    private void m126832g(boolean z) {
        if (z) {
            if (!m126837i()) {
                m126840l();
            }
            this.f102963m |= 4;
        } else {
            this.f102963m &= -5;
        }
        postInvalidate();
    }

    /* renamed from: h */
    private void m126834h(boolean z) {
        if (z) {
            if (!m126838j()) {
                m126840l();
            }
            this.f102963m |= 2;
        } else {
            this.f102963m &= -3;
        }
        postInvalidate();
    }

    /* renamed from: i */
    private void m126836i(boolean z) {
        if (z) {
            if (!m126839k()) {
                m126840l();
            }
            this.f102963m |= 1;
        } else {
            this.f102963m &= -2;
        }
        postInvalidate();
    }

    /* renamed from: b */
    private void m126821b(boolean z) {
        if (z) {
            if (!m126824c()) {
                m126840l();
            }
            this.f102963m |= PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
        } else {
            this.f102963m &= -129;
        }
        postInvalidate();
    }

    /* renamed from: c */
    private void m126823c(boolean z) {
        if (z) {
            if (!m126827d()) {
                m126840l();
            }
            this.f102963m |= 256;
        } else {
            this.f102963m &= -257;
        }
        postInvalidate();
    }

    /* renamed from: d */
    private void m126825d(Context context) {
        if (this.f102964n == null) {
            this.f102964n = new C39630a(context);
            LayoutParams layoutParams = new LayoutParams(C39805en.m127447b(getContext()), m126815a(context));
            layoutParams.gravity = 1;
            this.f102964n.setLayoutParams(layoutParams);
            addView(this.f102964n);
        }
    }

    /* renamed from: a */
    public static Float m126817a(float f) {
        if (Math.abs(f - 0.0f) < 1.0f) {
            return Float.valueOf(0.0f);
        }
        if (Math.abs(Math.abs(f) - 90.0f) < 1.0f) {
            return Float.valueOf(90.0f);
        }
        if (Math.abs(f - 45.0f) < 1.0f) {
            return Float.valueOf(45.0f);
        }
        if (Math.abs(f - -45.0f) < 1.0f) {
            return Float.valueOf(-45.0f);
        }
        return Float.valueOf(f);
    }

    /* renamed from: b */
    private void m126820b(Context context) {
        LayoutParams layoutParams = new LayoutParams(C39805en.m127447b(getContext()), m126815a(getContext()));
        layoutParams.gravity = 1;
        setLayoutParams(layoutParams);
        if (!C15450d.m45250b()) {
            LayoutParams layoutParams2 = new LayoutParams(C39805en.m127447b(getContext()), m126815a(getContext()));
            layoutParams2.gravity = 1;
            this.f102964n.setLayoutParams(layoutParams2);
        }
        m126822c(context);
    }

    /* renamed from: a */
    private void m126818a(boolean z) {
        if (z) {
            if (!m126829e()) {
                m126840l();
            }
            this.f102963m |= 64;
        } else {
            this.f102963m &= -65;
        }
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f102957g.setPathEffect(null);
        if (m126827d()) {
            canvas.drawLine(getLeftViewXMargin(), 0.0f, getLeftViewXMargin(), (float) getHeight(), this.f102957g);
        }
        if (m126824c()) {
            canvas.drawLine(getRightViewXMargin(), 0.0f, getRightViewXMargin(), (float) getHeight(), this.f102957g);
        }
        if (m126829e()) {
            canvas.drawLine(0.0f, ((float) getHeight()) - this.f102959i, (float) getWidth(), ((float) getHeight()) - this.f102959i, this.f102957g);
        }
        if (m126831f()) {
            canvas.drawLine(0.0f, ((float) getHeight()) / 2.0f, (float) getWidth(), ((float) getHeight()) / 2.0f, this.f102957g);
        }
        if (m126833g()) {
            canvas.drawLine(((float) getWidth()) / 2.0f, 0.0f, ((float) getWidth()) / 2.0f, (float) getHeight(), this.f102957g);
        }
        this.f102957g.setPathEffect(this.f102958h);
        if (m126835h() && this.f102951a != null) {
            canvas.drawLine(0.0f, this.f102951a.centerY(), (float) getWidth(), this.f102951a.centerY(), this.f102957g);
        }
        if (m126837i() && this.f102951a != null) {
            canvas.drawLine(this.f102951a.centerX(), 0.0f, this.f102951a.centerX(), (float) getHeight(), this.f102957g);
        }
        if (m126838j() && this.f102951a != null) {
            canvas.drawLine(0.0f, ((float) getHeight()) - ((((float) getHeight()) - this.f102951a.centerY()) + this.f102951a.centerX()), this.f102951a.centerX() + (((float) getHeight()) - this.f102951a.centerY()), (float) getHeight(), this.f102957g);
        }
        if (m126839k() && this.f102951a != null) {
            canvas.drawLine((float) getWidth(), ((float) getHeight()) - ((((float) getWidth()) - this.f102951a.centerX()) + (((float) getHeight()) - this.f102951a.centerY())), ((float) getWidth()) - ((((float) getWidth()) - this.f102951a.centerX()) + (((float) getHeight()) - this.f102951a.centerY())), (float) getHeight(), this.f102957g);
        }
    }

    public BorderLineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f102953c = 4;
        this.f102954d = -16717825;
        this.f102957g = new Paint();
        this.f102951a = new RectF();
        this.f102963m = 0;
        this.f102953c = (int) C9738o.m28708b(context, 1.5f);
        this.f102956f = (int) C9738o.m28708b(context, 56.0f);
        this.f102957g.setColor(this.f102954d);
        this.f102957g.setAntiAlias(true);
        this.f102957g.setStyle(Style.STROKE);
        this.f102957g.setStrokeWidth((float) this.f102953c);
        setWillNotDraw(false);
        this.f102959i = (float) ((int) C9738o.m28708b(context, 201.0f));
        this.f102958h = new DashPathEffect(new float[]{C9738o.m28708b(context, 2.0f), C9738o.m28708b(context, 1.0f)}, 0.0f);
        this.f102962l = (Vibrator) context.getSystemService("vibrator");
    }

    /* renamed from: b */
    public final boolean mo98799b(PointF[] pointFArr, float f) {
        if (pointFArr == null) {
            return true;
        }
        RectF a = C39601a.m126687a(pointFArr);
        if (a.isEmpty()) {
            return true;
        }
        a.offset((float) this.f102960j, 0.0f);
        if (this.f102955e == null || f < 1.0f) {
            return true;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(f, f, a.centerX(), a.centerY());
        matrix.mapRect(a);
        return this.f102955e.contains(a);
    }

    /* renamed from: a */
    public final int mo98794a(PointF[] pointFArr, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        int i = -1;
        if (pointFArr == null) {
            return -1;
        }
        this.f102951a = C39601a.m126687a(pointFArr);
        if (this.f102951a.isEmpty()) {
            return -1;
        }
        this.f102951a.offset((float) this.f102960j, 0.0f);
        this.f102952b = pointFArr;
        if (this.f102955e == null) {
            return -1;
        }
        if (!z2 || Math.abs(this.f102951a.left - this.f102955e.left) >= 2.0f) {
            m126823c(false);
        } else {
            m126823c(true);
        }
        if (!z2 || Math.abs(this.f102951a.right - this.f102955e.right) >= 2.0f) {
            m126821b(false);
        } else {
            m126821b(true);
        }
        if (!z2 || Math.abs(this.f102951a.bottom - this.f102955e.bottom) >= 2.0f) {
            m126818a(false);
        } else {
            m126818a(true);
        }
        if (!C43127fh.m136806a(getContext()) ? this.f102951a.right >= this.f102955e.right || Math.abs(this.f102951a.right - this.f102955e.right) < 2.0f : this.f102951a.left <= this.f102955e.left || Math.abs(this.f102951a.left - this.f102955e.left) < 2.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f102951a.bottom >= this.f102955e.bottom || Math.abs(this.f102951a.bottom - this.f102955e.bottom) < 2.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 || z4) {
            m126825d(getContext());
        }
        if (this.f102964n != null) {
            this.f102964n.mo98871a(z3);
            this.f102964n.mo98872b(z4);
        }
        int i2 = 3;
        if (z) {
            int round = Math.round((float) ((Math.atan((double) ((pointFArr[1].y - pointFArr[0].y) / (pointFArr[1].x - pointFArr[0].x))) / 3.141592653589793d) * 180.0d));
            float f = (float) round;
            if (Math.abs(f - 0.0f) < 1.0f) {
                m126830f(true);
                i = 4;
            } else {
                m126830f(false);
            }
            if (Math.abs(((float) Math.abs(round)) - 90.0f) < 1.0f) {
                m126832g(true);
                i = 4;
            } else {
                m126832g(false);
            }
            if (Math.abs(f - 45.0f) < 1.0f) {
                m126834h(true);
                i2 = 4;
            } else {
                m126834h(false);
                i2 = i;
            }
            if (Math.abs(f - -45.0f) < 1.0f) {
                m126836i(true);
                i2 = 4;
            } else {
                m126836i(false);
            }
        } else {
            if (Math.abs(((Math.abs(this.f102951a.bottom - this.f102951a.top) / 2.0f) + this.f102951a.top) - (((float) getHeight()) / 2.0f)) < 2.0f) {
                m126826d(true);
                i = 3;
            } else {
                m126826d(false);
            }
            if (Math.abs(((Math.abs(this.f102951a.right - this.f102951a.left) / 2.0f) + this.f102951a.left) - (((float) getWidth()) / 2.0f)) < 2.0f) {
                m126828e(true);
            } else {
                m126828e(false);
                i2 = i;
            }
        }
        return i2;
    }

    /* renamed from: b */
    public final boolean mo98800b(PointF[] pointFArr, float f, float f2) {
        if (pointFArr == null) {
            return true;
        }
        RectF a = C39601a.m126687a(pointFArr);
        if (a.isEmpty()) {
            return true;
        }
        a.offset(((float) this.f102960j) + f, f2);
        if (this.f102955e == null) {
            return true;
        }
        return this.f102955e.contains(a);
    }

    /* renamed from: a */
    public final PointF mo98795a(PointF[] pointFArr, float f, float f2) {
        if (pointFArr == null) {
            return new PointF(0.0f, 0.0f);
        }
        RectF a = C39601a.m126687a(pointFArr);
        a.offset((float) this.f102960j, 0.0f);
        PointF pointF = new PointF();
        pointF.x = f;
        pointF.y = f2;
        if (a.right - this.f102955e.right > 0.0f) {
            pointF.x = this.f102955e.right - a.right;
        }
        if (a.left - this.f102955e.left < 0.0f) {
            pointF.x = this.f102955e.left - a.left;
        }
        if (a.bottom - this.f102955e.bottom > 0.0f) {
            pointF.y = this.f102955e.bottom - a.bottom;
        }
        return pointF;
    }

    /* renamed from: a */
    public final PointF mo98796a(PointF[] pointFArr, float f, float f2, boolean z) {
        if (pointFArr == null) {
            return new PointF(0.0f, 0.0f);
        }
        RectF a = C39601a.m126687a(pointFArr);
        a.offset((float) this.f102960j, 0.0f);
        PointF pointF = new PointF();
        pointF.x = f;
        pointF.y = f2;
        if (Math.abs(((Math.abs(a.bottom - a.top) / 2.0f) + a.top) - (((float) getHeight()) / 2.0f)) < 1.0f) {
            pointF.y = (((float) getHeight()) / 2.0f) - (((a.bottom - a.top) / 2.0f) + a.top);
        }
        if (Math.abs(((Math.abs(a.right - a.left) / 2.0f) + a.left) - (((float) getWidth()) / 2.0f)) < 1.0f) {
            pointF.x = (((float) getWidth()) / 2.0f) - (((a.right - a.left) / 2.0f) + a.left);
        }
        return pointF;
    }

    /* renamed from: a */
    public static BorderLineView m126816a(Context context, int i, int i2, int i3, int i4) {
        BorderLineView borderLineView = new BorderLineView(context);
        LayoutParams layoutParams = new LayoutParams(C39805en.m127447b(context), m126815a(context));
        layoutParams.gravity = 1;
        borderLineView.setLayoutParams(layoutParams);
        borderLineView.setDeltaX(i3);
        borderLineView.setViewWidth(i);
        borderLineView.setLayerType(1, null);
        return borderLineView;
    }
}
