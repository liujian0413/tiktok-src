package com.p280ss.android.ugc.aweme.shortvideo.widget;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.SystemClock;
import android.support.p022v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout */
public class RecordLayout extends FrameLayout {

    /* renamed from: A */
    private TextView f108328A;

    /* renamed from: B */
    private int f108329B;

    /* renamed from: C */
    private int f108330C;

    /* renamed from: D */
    private int f108331D;

    /* renamed from: E */
    private int f108332E;

    /* renamed from: F */
    private int f108333F;

    /* renamed from: G */
    private int f108334G;

    /* renamed from: H */
    private int f108335H;

    /* renamed from: I */
    private long f108336I;

    /* renamed from: J */
    private int f108337J;

    /* renamed from: K */
    private final int f108338K;

    /* renamed from: L */
    private long f108339L;

    /* renamed from: M */
    private long f108340M;

    /* renamed from: N */
    private C41698i f108341N;

    /* renamed from: O */
    private ArgbEvaluator f108342O;

    /* renamed from: P */
    private DashPathEffect f108343P;

    /* renamed from: Q */
    private OnClickListener f108344Q;

    /* renamed from: a */
    protected float f108345a;

    /* renamed from: b */
    protected float f108346b;

    /* renamed from: c */
    protected float f108347c;

    /* renamed from: d */
    protected int f108348d;

    /* renamed from: e */
    protected int f108349e;

    /* renamed from: f */
    protected int f108350f;

    /* renamed from: g */
    protected int f108351g;

    /* renamed from: h */
    protected Paint f108352h;

    /* renamed from: i */
    protected Paint f108353i;

    /* renamed from: j */
    protected float f108354j;

    /* renamed from: k */
    protected float f108355k;

    /* renamed from: l */
    protected long f108356l;

    /* renamed from: m */
    protected final RectF f108357m;

    /* renamed from: n */
    public boolean f108358n;

    /* renamed from: o */
    protected boolean f108359o;

    /* renamed from: p */
    protected boolean f108360p;

    /* renamed from: q */
    protected long f108361q;

    /* renamed from: r */
    protected boolean f108362r;

    /* renamed from: s */
    protected boolean f108363s;

    /* renamed from: t */
    protected boolean f108364t;

    /* renamed from: u */
    protected ScaleGestureDetector f108365u;

    /* renamed from: v */
    protected C41665a f108366v;

    /* renamed from: w */
    public boolean f108367w;

    /* renamed from: x */
    private float f108368x;

    /* renamed from: y */
    private float f108369y;

    /* renamed from: z */
    private int f108370z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a */
    public interface C41665a {
        /* renamed from: a */
        void mo97949a(float f);

        /* renamed from: a */
        void mo97950a(int i);

        /* renamed from: a */
        boolean mo97951a();

        /* renamed from: b */
        void mo97952b();

        /* renamed from: c */
        void mo97953c();

        /* renamed from: d */
        void mo97954d();

        /* renamed from: e */
        void mo97955e();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$b */
    class C41666b implements C41665a {

        /* renamed from: b */
        private final C41665a f108374b;

        /* renamed from: d */
        public final void mo97954d() {
            this.f108374b.mo97954d();
        }

        /* renamed from: e */
        public final void mo97955e() {
            this.f108374b.mo97955e();
        }

        /* renamed from: a */
        public final boolean mo97951a() {
            return this.f108374b.mo97951a();
        }

        /* renamed from: b */
        public final void mo97952b() {
            if (!RecordLayout.this.f108367w) {
                this.f108374b.mo97952b();
                RecordLayout.this.f108367w = true;
            }
        }

        /* renamed from: c */
        public final void mo97953c() {
            if (RecordLayout.this.f108367w) {
                this.f108374b.mo97953c();
                RecordLayout.this.f108367w = false;
            }
        }

        /* renamed from: a */
        public final void mo97949a(float f) {
            this.f108374b.mo97949a(f);
        }

        /* renamed from: a */
        public final void mo97950a(int i) {
            this.f108374b.mo97950a(i);
        }

        public C41666b(C41665a aVar) {
            this.f108374b = aVar;
        }
    }

    public int getCurrentScaleMode() {
        return this.f108350f;
    }

    public int getMode() {
        return this.f108349e;
    }

    /* renamed from: a */
    private void m132631a(Canvas canvas, int i) {
        int c = m132639c(this.f108348d, this.f108356l);
        int d = m132641d(this.f108348d, this.f108356l);
        int i2 = (d + c) / 2;
        if (i == 0 || i == 2) {
            this.f108353i.setStrokeWidth((float) (d - c));
            this.f108353i.setPathEffect(null);
            canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) i2, this.f108353i);
        } else if (i == 1) {
            this.f108352h.setStrokeWidth((float) (d - c));
            canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) i2, this.f108352h);
        }
        int a = m132625a(this.f108348d, this.f108351g, this.f108356l, this.f108336I);
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        int b = m132634b(this.f108348d, this.f108351g, this.f108356l, this.f108336I);
        this.f108352h.setStyle(Style.FILL);
        this.f108357m.left = (float) (measuredWidth - b);
        this.f108357m.top = (float) (measuredHeight - b);
        this.f108357m.right = (float) (measuredWidth + b);
        this.f108357m.bottom = (float) (measuredHeight + b);
        float f = (float) a;
        canvas.drawRoundRect(this.f108357m, f, f, this.f108352h);
        this.f108352h.setStyle(Style.STROKE);
    }

    /* renamed from: a */
    private void m132632a(Canvas canvas, boolean z) {
        long uptimeMillis = SystemClock.uptimeMillis();
        float g = (float) m132650g(4, this.f108356l);
        float h = (float) m132652h(4, this.f108356l);
        this.f108353i.setStrokeWidth(h - g);
        this.f108353i.setPathEffect(null);
        canvas.drawCircle((float) (getMeasuredWidth() >> 1), (float) (getMeasuredHeight() >> 1), (h + g) / 2.0f, this.f108353i);
        float f = (((float) this.f108334G) * 0.8f) + (((((float) (uptimeMillis - this.f108356l)) * 1.0f) / 300.0f) * ((float) this.f108334G) * 0.2f);
        this.f108352h.setStrokeWidth(f);
        canvas.drawCircle((float) (getMeasuredWidth() >> 1), (float) (getMeasuredHeight() >> 1), f / 2.0f, this.f108352h);
        if (uptimeMillis - this.f108356l > 300) {
            mo102363b(1);
            this.f108349e = 0;
        }
        invalidate();
    }

    /* renamed from: a */
    private void m132633a(Canvas canvas, boolean z, boolean z2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        float i = (float) m132653i(4, this.f108356l);
        float j = (float) m132654j(4, this.f108356l);
        this.f108353i.setStrokeWidth(j - i);
        this.f108353i.setPathEffect(null);
        canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (j + i) / 2.0f, this.f108353i);
        float f = (((float) this.f108334G) * 0.8f) + ((1.0f - ((((float) (uptimeMillis - this.f108356l)) * 1.0f) / 300.0f)) * ((float) this.f108334G) * 0.2f);
        this.f108352h.setStrokeWidth(f);
        canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), f / 2.0f, this.f108352h);
        if (uptimeMillis - this.f108356l > 300) {
            mo102363b(1);
            if (z2) {
                this.f108349e = 3;
            } else {
                this.f108349e = 1;
            }
        }
        invalidate();
    }

    /* renamed from: d */
    private void m132642d() {
        if (this.f108337J != -1) {
            this.f108349e = this.f108337J;
            this.f108337J = -1;
            invalidate();
        }
    }

    /* renamed from: e */
    private boolean m132647e() {
        if (System.currentTimeMillis() - this.f108339L < 300) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo102362b() {
        m132642d();
        if (this.f108348d == 3 || this.f108348d == 2) {
            mo102363b(4);
            this.f108367w = false;
        }
    }

    public DashPathEffect getDashPathEffect() {
        if (this.f108343P == null) {
            this.f108343P = new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f);
        }
        return this.f108343P;
    }

    /* renamed from: a */
    public final void mo102359a() {
        if (this.f108348d == 1) {
            mo102363b(2);
            invalidate();
            return;
        }
        if (this.f108348d == 3 || this.f108348d == 2) {
            mo102363b(4);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f108328A = (TextView) findViewById(R.id.e0e);
        if (C6399b.m19946v()) {
            this.f108328A.setText("");
            this.f108328A.setBackgroundDrawable(getResources().getDrawable(R.drawable.bb2));
        }
    }

    /* renamed from: c */
    public final void mo102364c() {
        m132642d();
        setHasBeenMoveScaled(false);
        this.f108366v.mo97955e();
        if (this.f108348d == 3 || this.f108348d == 2) {
            mo102363b(4);
        }
        this.f108366v.mo97953c();
        this.f108361q = System.currentTimeMillis();
        invalidate();
    }

    public void setCurrentScaleMode(int i) {
        this.f108350f = i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setScaleGestureDetector(ScaleGestureDetector scaleGestureDetector) {
        this.f108365u = scaleGestureDetector;
    }

    public RecordLayout(Context context) {
        this(context, null);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        throw new UnsupportedOperationException();
    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    private int m132638c(int i) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        return this.f108338K;
    }

    /* renamed from: a */
    public final void mo102360a(int i) {
        super.setOnClickListener(this.f108344Q);
        this.f108337J = this.f108349e;
        this.f108349e = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo102363b(int i) {
        this.f108348d = i;
        this.f108356l = SystemClock.uptimeMillis();
    }

    public void setHasBeenMoveScaled(boolean z) {
        this.f108358n = z;
        this.f108339L = System.currentTimeMillis();
    }

    public void setRecordListener(C41665a aVar) {
        if (aVar != null) {
            this.f108366v = new C41666b(aVar);
        } else {
            this.f108366v = null;
        }
    }

    /* renamed from: d */
    private void m132643d(int i) {
        this.f108351g = i;
        this.f108336I = SystemClock.uptimeMillis();
    }

    /* renamed from: b */
    private int m132636b(long j) {
        int i;
        int i2;
        if (this.f108363s) {
            i2 = this.f108332E;
            i = this.f108330C;
        } else if (this.f108362r) {
            i2 = this.f108330C;
            i = this.f108332E;
        } else {
            i2 = this.f108332E;
            i = this.f108332E;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - j;
        if (uptimeMillis > 300) {
            return i;
        }
        return ((Integer) this.f108342O.evaluate((((float) uptimeMillis) * 1.0f) / 300.0f, Integer.valueOf(i2), Integer.valueOf(i))).intValue();
    }

    /* renamed from: c */
    private void m132640c(Canvas canvas) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f108348d == 2 && uptimeMillis - this.f108356l > 300) {
            mo102363b(3);
        }
        if (this.f108348d == 4 && uptimeMillis - this.f108356l > 300) {
            mo102363b(1);
            invalidate();
        }
        m132646e(canvas);
        if (this.f108348d != 1) {
            invalidate();
        }
    }

    /* renamed from: g */
    private void m132651g(Canvas canvas) {
        int k = m132655k(this.f108348d, this.f108356l);
        int l = m132656l(this.f108348d, this.f108356l);
        int i = (l + k) / 2;
        this.f108352h.setStrokeWidth((float) (l - k));
        canvas.drawCircle((float) (getMeasuredWidth() >> 1), (float) (getMeasuredHeight() >> 1), (float) i, this.f108352h);
    }

    /* renamed from: a */
    private int m132627a(long j) {
        int i;
        int i2;
        if (this.f108363s) {
            i2 = this.f108331D;
            i = this.f108329B;
        } else if (this.f108362r) {
            i2 = this.f108329B;
            i = this.f108331D;
        } else {
            i2 = this.f108331D;
            i = this.f108331D;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.f108356l > 300) {
            return i;
        }
        return ((Integer) this.f108342O.evaluate((((float) (uptimeMillis - j)) * 1.0f) / 300.0f, Integer.valueOf(i2), Integer.valueOf(i))).intValue();
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f108348d == 6) {
            this.f108352h.setColor(m132627a(this.f108356l));
            this.f108353i.setColor(m132636b(this.f108356l));
            m132633a(canvas, false, false);
        } else if (this.f108348d == 7) {
            this.f108352h.setColor(m132627a(this.f108356l));
            this.f108353i.setColor(m132636b(this.f108356l));
            m132633a(canvas, false, true);
        } else if (this.f108348d == 8) {
            this.f108352h.setColor(m132627a(this.f108356l));
            this.f108353i.setColor(m132636b(this.f108356l));
            m132632a(canvas, false);
        } else if (this.f108349e == 0) {
            m132649f(canvas);
        } else if (this.f108349e == 1) {
            m132640c(canvas);
        } else if (this.f108349e == 3) {
            m132644d(canvas);
        } else {
            m132630a(canvas);
        }
    }

    /* renamed from: b */
    private void m132637b(Canvas canvas) {
        int i = (int) (((float) this.f108334G) * 0.85f);
        int i2 = this.f108334G;
        int i3 = (i2 + i) / 2;
        this.f108353i.setStrokeWidth((float) (i2 - i));
        this.f108353i.setPathEffect(getDashPathEffect());
        canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) i3, this.f108353i);
        int e = m132645e(1, this.f108356l);
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        int f = m132648f(1, this.f108356l);
        this.f108352h.setStyle(Style.FILL);
        this.f108357m.left = (float) (measuredWidth - f);
        this.f108357m.top = (float) (measuredHeight - f);
        this.f108357m.right = (float) (measuredWidth + f);
        this.f108357m.bottom = (float) (measuredHeight + f);
        float f2 = (float) e;
        canvas.drawRoundRect(this.f108357m, f2, f2, this.f108352h);
        this.f108352h.setStyle(Style.STROKE);
    }

    /* renamed from: d */
    private void m132644d(Canvas canvas) {
        canvas.save();
        canvas.translate(this.f108354j, this.f108355k);
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f108348d == 2 && uptimeMillis - this.f108356l > 300) {
            mo102363b(3);
            m132643d(0);
        }
        if (this.f108348d == 4) {
            if (uptimeMillis - this.f108356l > 300) {
                mo102363b(1);
                m132643d(0);
                this.f108360p = false;
                this.f108354j = 0.0f;
                this.f108355k = 0.0f;
                invalidate();
            } else {
                this.f108354j = (1.0f - ((((float) (uptimeMillis - this.f108356l)) * 1.0f) / 300.0f)) * this.f108354j;
                this.f108355k = (1.0f - ((((float) (uptimeMillis - this.f108356l)) * 1.0f) / 300.0f)) * this.f108355k;
            }
        }
        if (this.f108348d == 3) {
            if (this.f108351g == 0) {
                if (uptimeMillis - this.f108340M > 350 && !this.f108360p) {
                    m132643d(2);
                }
            } else if (this.f108351g == 2 && uptimeMillis - this.f108336I > 200) {
                m132643d(1);
                this.f108366v.mo97950a(2);
            }
        }
        m132631a(canvas, this.f108351g);
        canvas.restore();
        if (this.f108348d != 1) {
            invalidate();
        }
    }

    /* renamed from: e */
    private void m132646e(Canvas canvas) {
        int a = m132626a(this.f108348d, this.f108356l);
        int b = m132635b(this.f108348d, this.f108356l);
        int i = (b + a) / 2;
        this.f108353i.setStrokeWidth((float) (b - a));
        this.f108353i.setPathEffect(null);
        canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) i, this.f108353i);
        int e = m132645e(this.f108348d, this.f108356l);
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        int f = m132648f(this.f108348d, this.f108356l);
        this.f108352h.setStyle(Style.FILL);
        this.f108357m.left = (float) (measuredWidth - f);
        this.f108357m.top = (float) (measuredHeight - f);
        this.f108357m.right = (float) (measuredWidth + f);
        this.f108357m.bottom = (float) (measuredHeight + f);
        float f2 = (float) e;
        canvas.drawRoundRect(this.f108357m, f2, f2, this.f108352h);
        this.f108352h.setStyle(Style.STROKE);
    }

    /* renamed from: f */
    private void m132649f(Canvas canvas) {
        canvas.save();
        canvas.translate(this.f108354j, this.f108355k);
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f108348d == 2 && uptimeMillis - this.f108356l > 300) {
            mo102363b(3);
        }
        if (this.f108348d == 4) {
            if (uptimeMillis - this.f108356l > 300) {
                mo102363b(1);
                this.f108354j = 0.0f;
                this.f108355k = 0.0f;
                invalidate();
            } else {
                this.f108354j = (1.0f - ((((float) (uptimeMillis - this.f108356l)) * 1.0f) / 300.0f)) * this.f108354j;
                this.f108355k = (1.0f - ((((float) (uptimeMillis - this.f108356l)) * 1.0f) / 300.0f)) * this.f108355k;
            }
        }
        m132651g(canvas);
        if (this.f108348d == 1) {
            super.dispatchDraw(canvas);
        }
        canvas.restore();
        if (this.f108348d != 1) {
            invalidate();
        }
    }

    /* renamed from: a */
    private void m132629a(Context context) {
        this.f108333F = (int) C9738o.m28708b(context, 55.0f);
        this.f108334G = (int) C9738o.m28708b(context, 40.0f);
        this.f108335H = (int) C9738o.m28708b(context, 40.0f);
        if (context instanceof FragmentActivity) {
            this.f108341N = new C41698i((FragmentActivity) context);
        }
        this.f108348d = 1;
        this.f108352h = new Paint();
        this.f108329B = Color.parseColor("#ffffffff");
        this.f108330C = Color.parseColor("#99ffffff");
        this.f108331D = getResources().getColor(R.color.a79);
        this.f108332E = getResources().getColor(R.color.a7b);
        this.f108352h.setColor(this.f108331D);
        this.f108352h.setStyle(Style.STROKE);
        this.f108352h.setAntiAlias(true);
        this.f108353i = new Paint();
        this.f108353i.setColor(getResources().getColor(R.color.a7b));
        this.f108353i.setStyle(Style.STROKE);
        this.f108353i.setAntiAlias(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008c, code lost:
        if (r11.f108356l != 2) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0090, code lost:
        if (r11.f108351g != 0) goto L_0x015f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            boolean r0 = r11.isEnabled()
            r1 = 1
            if (r0 != 0) goto L_0x000f
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r11.f108366v
            if (r0 == 0) goto L_0x000e
            r12.getAction()
        L_0x000e:
            return r1
        L_0x000f:
            int r0 = r12.getAction()
            if (r0 != 0) goto L_0x0022
            com.ss.android.ugc.aweme.shortvideo.widget.i r2 = r11.f108341N
            if (r2 == 0) goto L_0x0022
            com.ss.android.ugc.aweme.shortvideo.widget.i r2 = r11.f108341N
            boolean r2 = r2.mo102474a()
            if (r2 == 0) goto L_0x0022
            return r1
        L_0x0022:
            r2 = 261(0x105, float:3.66E-43)
            r3 = 2
            if (r0 == r2) goto L_0x002f
            r2 = 517(0x205, float:7.24E-43)
            if (r0 == r2) goto L_0x002c
            goto L_0x0031
        L_0x002c:
            r11.f108350f = r3
            goto L_0x0031
        L_0x002f:
            r11.f108350f = r1
        L_0x0031:
            int r2 = r11.f108349e
            r4 = 4
            r5 = 3
            r6 = 0
            if (r2 != r5) goto L_0x016f
            long r7 = android.os.SystemClock.uptimeMillis()
            r2 = 0
            if (r0 != 0) goto L_0x0094
            long r7 = android.os.SystemClock.uptimeMillis()
            r11.f108340M = r7
            float r0 = r12.getX()
            r11.f108345a = r0
            float r0 = r12.getY()
            r11.f108346b = r0
            float r0 = r12.getRawX()
            r11.f108368x = r0
            float r0 = r12.getRawY()
            r11.f108369y = r0
            int r0 = r11.f108348d
            if (r0 != r1) goto L_0x006b
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r11.f108366v
            r0.mo97952b()
            r11.mo102363b(r3)
            goto L_0x015c
        L_0x006b:
            int r0 = r11.f108348d
            if (r0 != r4) goto L_0x0082
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r11.f108366v
            r0.mo97952b()
            r11.mo102363b(r3)
            r11.m132643d(r6)
            r11.f108360p = r6
            r11.f108354j = r2
            r11.f108355k = r2
            goto L_0x015c
        L_0x0082:
            int r0 = r11.f108348d
            if (r0 == r5) goto L_0x008e
            long r2 = r11.f108356l
            r5 = 2
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x015f
        L_0x008e:
            int r0 = r11.f108351g
            if (r0 != 0) goto L_0x015f
            goto L_0x0154
        L_0x0094:
            if (r0 != r3) goto L_0x0110
            int r0 = r11.f108348d
            if (r0 == r5) goto L_0x009e
            int r0 = r11.f108348d
            if (r0 != r3) goto L_0x010c
        L_0x009e:
            float r0 = r12.getX()
            float r4 = r11.f108345a
            float r0 = r0 - r4
            r11.f108354j = r0
            float r0 = r12.getY()
            float r4 = r11.f108346b
            float r0 = r0 - r4
            r11.f108355k = r0
            int r0 = r11.f108351g
            if (r0 != 0) goto L_0x00fa
            float r0 = r12.getRawX()
            float r4 = r11.f108368x
            float r0 = r0 - r4
            double r4 = (double) r0
            float r0 = r12.getRawY()
            float r7 = r11.f108369y
            float r0 = r0 - r7
            double r7 = (double) r0
            java.lang.Double.isNaN(r4)
            java.lang.Double.isNaN(r4)
            double r4 = r4 * r4
            java.lang.Double.isNaN(r7)
            java.lang.Double.isNaN(r7)
            double r7 = r7 * r7
            double r4 = r4 + r7
            double r4 = java.lang.Math.sqrt(r4)
            int r0 = r11.f108338K
            int r0 = r0 / r3
            double r7 = (double) r0
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e9
            boolean r0 = r11.f108360p
            if (r0 != 0) goto L_0x00e9
            r11.m132643d(r3)
            goto L_0x010c
        L_0x00e9:
            boolean r0 = r11.f108360p
            if (r0 == 0) goto L_0x010c
            r11.f108354j = r2
            r11.f108355k = r2
            r11.setHasBeenMoveScaled(r6)
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r11.f108366v
            r0.mo97955e()
            goto L_0x010c
        L_0x00fa:
            int r0 = r11.f108350f
            if (r0 == 0) goto L_0x0102
            int r0 = r11.f108350f
            if (r0 != r1) goto L_0x010c
        L_0x0102:
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r11.f108366v
            float r2 = r12.getY()
            float r2 = -r2
            r0.mo97949a(r2)
        L_0x010c:
            r11.invalidate()
            goto L_0x015f
        L_0x0110:
            if (r0 == r1) goto L_0x0114
            if (r0 != r5) goto L_0x015f
        L_0x0114:
            int r0 = r11.f108351g
            if (r0 != 0) goto L_0x0140
            int r0 = r11.f108348d
            if (r0 == r5) goto L_0x0120
            int r0 = r11.f108348d
            if (r0 != r3) goto L_0x015c
        L_0x0120:
            long r3 = r11.f108340M
            long r7 = r7 - r3
            r3 = 350(0x15e, double:1.73E-321)
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x015c
            r11.setHasBeenMoveScaled(r6)
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r11.f108366v
            r0.mo97955e()
            r11.f108360p = r1
            r11.f108354j = r2
            r11.f108355k = r2
            r11.m132643d(r6)
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r11.f108366v
            r0.mo97950a(r1)
            goto L_0x015c
        L_0x0140:
            int r0 = r11.f108350f
            if (r0 == 0) goto L_0x0148
            int r0 = r11.f108350f
            if (r0 != r1) goto L_0x0154
        L_0x0148:
            boolean r0 = r11.f108358n
            if (r0 == 0) goto L_0x0154
            r11.setHasBeenMoveScaled(r6)
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r11.f108366v
            r0.mo97955e()
        L_0x0154:
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r11.f108366v
            r0.mo97953c()
            r11.mo102363b(r4)
        L_0x015c:
            r11.invalidate()
        L_0x015f:
            android.view.ScaleGestureDetector r0 = r11.f108365u
            if (r0 == 0) goto L_0x016e
            boolean r0 = r11.m132647e()
            if (r0 != 0) goto L_0x016e
            android.view.ScaleGestureDetector r0 = r11.f108365u
            r0.onTouchEvent(r12)
        L_0x016e:
            return r1
        L_0x016f:
            if (r0 != 0) goto L_0x0184
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = r11.f108361q
            long r7 = r7 - r9
            r9 = 300(0x12c, double:1.48E-321)
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x017f
            return r1
        L_0x017f:
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r2 = r11.f108366v
            r2.mo97950a(r6)
        L_0x0184:
            int r2 = r11.f108349e
            if (r2 != 0) goto L_0x0218
            if (r0 != 0) goto L_0x01af
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r11.f108366v
            boolean r0 = r0.mo97951a()
            r1 = r1 ^ r0
            if (r1 == 0) goto L_0x0208
            float r0 = r12.getX()
            r11.f108345a = r0
            float r0 = r12.getY()
            r11.f108346b = r0
            float r0 = r11.f108346b
            r11.f108347c = r0
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r11.f108366v
            r0.mo97952b()
            r11.mo102363b(r3)
            r11.invalidate()
            goto L_0x0208
        L_0x01af:
            if (r0 != r3) goto L_0x01dc
            float r0 = r12.getX()
            float r2 = r11.f108345a
            float r0 = r0 - r2
            r11.f108354j = r0
            float r0 = r12.getY()
            float r2 = r11.f108346b
            float r0 = r0 - r2
            r11.f108355k = r0
            int r0 = r11.f108350f
            if (r0 == 0) goto L_0x01cb
            int r0 = r11.f108350f
            if (r0 != r1) goto L_0x0208
        L_0x01cb:
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r11.f108366v
            float r2 = r12.getY()
            float r2 = -r2
            r0.mo97949a(r2)
            float r0 = r12.getY()
            r11.f108347c = r0
            goto L_0x0208
        L_0x01dc:
            if (r0 == r1) goto L_0x01e3
            if (r0 != r5) goto L_0x01e1
            goto L_0x01e3
        L_0x01e1:
            r1 = 0
            goto L_0x0208
        L_0x01e3:
            int r0 = r11.f108350f
            if (r0 == 0) goto L_0x01eb
            int r0 = r11.f108350f
            if (r0 != r1) goto L_0x01f7
        L_0x01eb:
            boolean r0 = r11.f108358n
            if (r0 == 0) goto L_0x01f7
            r11.setHasBeenMoveScaled(r6)
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r11.f108366v
            r0.mo97955e()
        L_0x01f7:
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r0 = r11.f108366v
            r0.mo97953c()
            long r2 = java.lang.System.currentTimeMillis()
            r11.f108361q = r2
            r11.mo102363b(r4)
            r11.invalidate()
        L_0x0208:
            android.view.ScaleGestureDetector r0 = r11.f108365u
            if (r0 == 0) goto L_0x0217
            boolean r0 = r11.m132647e()
            if (r0 != 0) goto L_0x0217
            android.view.ScaleGestureDetector r0 = r11.f108365u
            r0.onTouchEvent(r12)
        L_0x0217:
            return r1
        L_0x0218:
            android.view.ScaleGestureDetector r0 = r11.f108365u
            if (r0 == 0) goto L_0x0227
            boolean r0 = r11.m132647e()
            if (r0 != 0) goto L_0x0227
            android.view.ScaleGestureDetector r0 = r11.f108365u
            r0.onTouchEvent(r12)
        L_0x0227:
            r11.requestFocus()
            boolean r12 = super.onTouchEvent(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.widget.RecordLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private void m132630a(Canvas canvas) {
        long uptimeMillis = SystemClock.uptimeMillis();
        m132637b(canvas);
        this.f108353i.setColor(this.f108329B);
        if (this.f108348d == 3) {
            int i = (this.f108334G + ((int) (((float) this.f108334G) * 0.85f))) / 2;
            canvas.drawArc((float) ((getMeasuredWidth() / 2) - i), (float) ((getMeasuredHeight() / 2) - i), (float) ((getMeasuredWidth() / 2) + i), (float) ((getMeasuredHeight() / 2) + i), -90.0f, (float) (((uptimeMillis - this.f108356l) * 360) / 1000), false, this.f108353i);
        }
        this.f108353i.setColor(this.f108332E);
        this.f108353i.setPathEffect(getDashPathEffect());
        if (this.f108348d != 1) {
            if (uptimeMillis - this.f108356l > 1000) {
                mo102363b(1);
                invalidate();
            }
            if (this.f108348d != 1) {
                invalidate();
            }
        }
    }

    /* renamed from: h */
    private int m132652h(int i, long j) {
        return this.f108334G;
    }

    /* renamed from: j */
    private int m132654j(int i, long j) {
        return this.f108334G;
    }

    /* renamed from: b */
    private int m132635b(int i, long j) {
        return m132656l(i, j);
    }

    /* renamed from: d */
    private int m132641d(int i, long j) {
        return m132656l(i, j);
    }

    /* renamed from: a */
    public final void mo102361a(int i, boolean z) {
        m132628a(i, z, true);
    }

    public RecordLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private int m132626a(int i, long j) {
        if (this.f108348d == 1) {
            return (int) (((float) this.f108334G) * 0.85f);
        }
        return m132655k(i, j);
    }

    /* renamed from: g */
    private int m132650g(int i, long j) {
        return (int) (((float) this.f108335H) * 0.85f * (1.0f - ((((float) (SystemClock.uptimeMillis() - j)) * 1.0f) / 300.0f)));
    }

    /* renamed from: i */
    private int m132653i(int i, long j) {
        return (int) (((((float) this.f108335H) * 0.85f) * ((float) (SystemClock.uptimeMillis() - j))) / 300.0f);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(MeasureSpec.makeMeasureSpec(m132638c(i), 1073741824), MeasureSpec.makeMeasureSpec(m132638c(i2), 1073741824));
    }

    /* renamed from: c */
    private int m132639c(int i, long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f108348d == 1) {
            return (int) (((float) this.f108334G) * 0.85f);
        }
        if (this.f108348d == 4) {
            if (this.f108351g == 0) {
                return (int) (((float) this.f108335H) * (1.0f - ((((float) (uptimeMillis - j)) * 1.0f) / 300.0f)));
            }
            if (this.f108351g == 1) {
                return (int) (((float) this.f108335H) * (1.0f - ((((float) (uptimeMillis - j)) * 0.15f) / 300.0f)));
            }
            if (this.f108351g == 2) {
                return (int) (((float) this.f108335H) * (1.0f - ((((float) (uptimeMillis - j)) * 0.15f) / 300.0f)));
            }
        }
        return m132655k(i, j);
    }

    /* renamed from: e */
    private int m132645e(int i, long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i == 2) {
            return (int) ((((float) this.f108335H) * 0.1f) + (((float) this.f108335H) * 0.7f * (1.0f - ((((float) (uptimeMillis - j)) * 1.0f) / 300.0f))));
        }
        if (i == 3) {
            return (int) (((float) this.f108335H) * 0.1f);
        }
        if (i == 4) {
            return (int) ((((float) this.f108335H) * 0.1f) + (((((float) this.f108335H) * 0.7f) * ((float) (uptimeMillis - j))) / 300.0f));
        }
        if (i == 1) {
            return (int) (((float) this.f108335H) * 0.8f);
        }
        return 0;
    }

    /* renamed from: f */
    private int m132648f(int i, long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i == 2) {
            return (int) ((((float) this.f108335H) * 0.4f) + (((float) this.f108335H) * 0.4f * (1.0f - ((((float) (uptimeMillis - j)) * 1.0f) / 300.0f))));
        }
        if (i == 3) {
            return (int) (((float) this.f108335H) * 0.4f);
        }
        if (i == 4) {
            return (int) ((((float) this.f108335H) * 0.4f) + (((((float) this.f108335H) * 0.4f) * ((float) (uptimeMillis - j))) / 300.0f));
        }
        if (i == 1) {
            return (int) (((float) this.f108335H) * 0.8f);
        }
        return 0;
    }

    /* renamed from: k */
    private int m132655k(int i, long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i == 2) {
            return (int) ((((long) this.f108335H) * (uptimeMillis - j)) / 300);
        }
        if (i == 3) {
            double d = (double) this.f108335H;
            double d2 = (double) (uptimeMillis - j);
            Double.isNaN(d2);
            double sin = Math.sin((d2 * 3.141592653589793d) / 700.0d) + 1.0d;
            double d3 = (double) (this.f108333F - this.f108334G);
            Double.isNaN(d3);
            double d4 = sin * d3 * 0.30000001192092896d;
            Double.isNaN(d);
            return (int) (d + d4);
        } else if (i == 4) {
            return (int) (((float) this.f108335H) * (1.0f - ((((float) (uptimeMillis - j)) * 1.0f) / 300.0f)));
        } else {
            return i == 1 ? 0 : 0;
        }
    }

    /* renamed from: l */
    private int m132656l(int i, long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i == 2) {
            return this.f108334G + ((int) ((((long) (this.f108333F - this.f108334G)) * (uptimeMillis - j)) / 300));
        }
        if (i == 3) {
            return this.f108334G + (this.f108333F - this.f108334G);
        }
        if (i == 4) {
            return this.f108334G + ((int) (((float) (this.f108333F - this.f108334G)) * (1.0f - ((((float) (uptimeMillis - j)) * 1.0f) / 300.0f))));
        }
        if (i == 1) {
            return this.f108334G;
        }
        return 0;
    }

    public RecordLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f108349e = 3;
        this.f108370z = -1;
        this.f108337J = -1;
        this.f108338K = (int) C9738o.m28708b(getContext(), 100.0f);
        this.f108357m = new RectF();
        this.f108339L = 0;
        this.f108359o = false;
        this.f108360p = false;
        this.f108364t = true;
        this.f108342O = new ArgbEvaluator();
        this.f108366v = new C41691d();
        this.f108344Q = new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (RecordLayout.this.f108348d != 1) {
                    if ((RecordLayout.this.f108348d == 3 || RecordLayout.this.f108348d == 2) && RecordLayout.this.f108364t) {
                        RecordLayout.this.mo102363b(4);
                        RecordLayout.this.f108366v.mo97953c();
                    }
                } else if (!RecordLayout.this.f108366v.mo97951a()) {
                    if (RecordLayout.this.f108363s) {
                        RecordLayout.this.animate().scaleX(1.2f).scaleY(1.2f).setDuration(100).withEndAction(new Runnable() {
                            public final void run() {
                                RecordLayout.this.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
                            }
                        }).start();
                        RecordLayout.this.f108366v.mo97954d();
                        return;
                    }
                    RecordLayout.this.mo102363b(2);
                    RecordLayout.this.invalidate();
                    RecordLayout.this.f108366v.mo97952b();
                }
            }
        };
        m132629a(context);
    }

    /* renamed from: a */
    private void m132628a(int i, boolean z, boolean z2) {
        this.f108362r = this.f108363s;
        this.f108370z = this.f108349e;
        this.f108349e = i;
        this.f108363s = z;
        this.f108364t = true;
        if (!this.f108359o) {
            invalidate();
            super.setOnClickListener(this.f108344Q);
            this.f108359o = !this.f108359o;
        } else if (this.f108349e != this.f108370z) {
            if (i == 1) {
                super.setOnClickListener(this.f108344Q);
                mo102363b(6);
            } else if (i == 0) {
                this.f108352h.setColor(this.f108331D);
                this.f108353i.setColor(this.f108332E);
                super.setOnClickListener(null);
                mo102363b(8);
            } else if (i == 3) {
                super.setOnClickListener(this.f108344Q);
                mo102363b(7);
            }
            invalidate();
        }
    }

    /* renamed from: b */
    private int m132634b(int i, int i2, long j, long j2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i == 3) {
            if (i2 == 0) {
                return (int) (((float) this.f108335H) * 0.4f);
            }
            if (i2 == 2) {
                return (int) (((float) this.f108335H) * 0.4f * (1.0f - ((((float) (uptimeMillis - j2)) * 1.0f) / 200.0f)));
            }
            if (i2 == 1) {
                return 0;
            }
        }
        if (i == 4) {
            if (i2 == 0) {
                return (int) ((((float) this.f108335H) * 0.4f) + (((((float) this.f108335H) * 0.4f) * ((float) (uptimeMillis - j))) / 300.0f));
            }
            if (i2 == 1) {
                return (int) (((((float) this.f108335H) * 0.8f) * ((float) (uptimeMillis - j))) / 300.0f);
            }
            if (i2 == 2) {
                return 0;
            }
        }
        return m132648f(i, j);
    }

    /* renamed from: a */
    private int m132625a(int i, int i2, long j, long j2) {
        int i3 = i;
        int i4 = i2;
        long j3 = j;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i3 == 3) {
            if (i4 == 0) {
                return (int) (((float) this.f108335H) * 0.1f);
            }
            if (i4 == 2) {
                float f = (float) (uptimeMillis - j2);
                if (f < 100.0f) {
                    return (int) ((((float) this.f108335H) * 0.1f) + ((f * 0.2f) / 200.0f));
                }
            }
            if (i4 == 2) {
                float f2 = (float) (uptimeMillis - j2);
                if (f2 >= 100.0f) {
                    return (int) (((float) this.f108335H) * 0.4f * (1.0f - ((f2 * 1.0f) / 200.0f)));
                }
            }
            if (i4 == 1) {
                return 0;
            }
        }
        if (i3 == 4) {
            if (i4 == 0) {
                return (int) ((((float) this.f108335H) * 0.1f) + (((((float) this.f108335H) * 0.7f) * ((float) (uptimeMillis - j3))) / 300.0f));
            }
            if (i4 == 1) {
                return (int) (((((float) this.f108335H) * 0.8f) * ((float) (uptimeMillis - j3))) / 300.0f);
            }
            if (i4 == 2) {
                return 0;
            }
        }
        return m132645e(i3, j3);
    }
}
