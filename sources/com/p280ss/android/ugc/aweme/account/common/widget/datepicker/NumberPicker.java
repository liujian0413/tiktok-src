package com.p280ss.android.ugc.aweme.account.common.widget.datepicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.p022v4.view.C0978j;
import android.support.p022v4.view.C0995v;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.account.R$styleable;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.account.common.widget.datepicker.NumberPicker */
public class NumberPicker extends View {

    /* renamed from: Q */
    private static final int f56838Q = Color.rgb(0, NormalGiftView.MASK_TRANSLATE_VALUE, 136);

    /* renamed from: R */
    private static final int f56839R = Color.rgb(0, NormalGiftView.MASK_TRANSLATE_VALUE, 136);

    /* renamed from: S */
    private static final int f56840S = Color.rgb(NormalGiftView.ALPHA_255, NormalGiftView.ALPHA_255, NormalGiftView.ALPHA_255);

    /* renamed from: A */
    protected int f56841A;

    /* renamed from: B */
    protected Scroller f56842B;

    /* renamed from: C */
    protected Scroller f56843C;

    /* renamed from: D */
    protected int f56844D;

    /* renamed from: E */
    protected int f56845E;

    /* renamed from: F */
    protected int f56846F;

    /* renamed from: G */
    protected int f56847G;

    /* renamed from: H */
    protected int f56848H;

    /* renamed from: I */
    protected boolean f56849I;

    /* renamed from: J */
    protected C21162b f56850J;

    /* renamed from: K */
    protected Set<String> f56851K;

    /* renamed from: L */
    protected int f56852L;

    /* renamed from: M */
    protected C21163a f56853M;

    /* renamed from: N */
    protected boolean f56854N;

    /* renamed from: O */
    protected String[] f56855O;

    /* renamed from: P */
    int f56856P;

    /* renamed from: T */
    private int f56857T;

    /* renamed from: U */
    private int f56858U;

    /* renamed from: V */
    private int f56859V;

    /* renamed from: W */
    private int f56860W;

    /* renamed from: a */
    protected int f56861a;

    /* renamed from: aa */
    private VelocityTracker f56862aa;

    /* renamed from: ab */
    private float f56863ab;

    /* renamed from: ac */
    private boolean f56864ac;

    /* renamed from: b */
    protected int f56865b;

    /* renamed from: c */
    protected TextPaint f56866c;

    /* renamed from: d */
    protected TextPaint f56867d;

    /* renamed from: e */
    protected TextPaint f56868e;

    /* renamed from: f */
    protected Paint f56869f;

    /* renamed from: g */
    protected Rect f56870g;

    /* renamed from: h */
    protected C21161a[] f56871h;

    /* renamed from: i */
    protected int f56872i;

    /* renamed from: j */
    protected int f56873j;

    /* renamed from: k */
    protected int f56874k;

    /* renamed from: l */
    protected int f56875l;

    /* renamed from: m */
    protected float f56876m;

    /* renamed from: n */
    protected int f56877n;

    /* renamed from: o */
    protected int f56878o;

    /* renamed from: p */
    protected int f56879p;

    /* renamed from: q */
    protected float f56880q;

    /* renamed from: r */
    protected float f56881r;

    /* renamed from: s */
    protected int f56882s;

    /* renamed from: t */
    protected String f56883t;

    /* renamed from: u */
    protected int f56884u;

    /* renamed from: v */
    protected float f56885v;

    /* renamed from: w */
    protected int[] f56886w;

    /* renamed from: x */
    protected int f56887x;

    /* renamed from: y */
    protected RectF f56888y;

    /* renamed from: z */
    protected Rect f56889z;

    /* renamed from: com.ss.android.ugc.aweme.account.common.widget.datepicker.NumberPicker$a */
    class C21161a {

        /* renamed from: a */
        public int f56890a;

        /* renamed from: b */
        public int f56891b;

        public C21161a(int i, int i2) {
            this.f56890a = i;
            this.f56891b = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.common.widget.datepicker.NumberPicker$b */
    public interface C21162b {
        /* renamed from: a */
        void mo57062a(NumberPicker numberPicker, int i, int i2);
    }

    public int getCurrentNumber() {
        return this.f56879p;
    }

    /* renamed from: a */
    private void m71306a() {
        this.f56871h = new C21161a[(this.f56852L + 4)];
    }

    /* renamed from: e */
    private void m71312e() {
        this.f56870g = new Rect();
        this.f56889z = new Rect();
    }

    /* renamed from: f */
    private void m71314f() {
        int length = String.valueOf(this.f56878o).length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append("0");
        }
        String sb2 = sb.toString();
        this.f56866c.getTextBounds(sb2, 0, sb2.length(), this.f56870g);
        if (this.f56883t != null) {
            this.f56867d.getTextBounds(this.f56883t, 0, this.f56883t.length(), this.f56889z);
        }
    }

    /* renamed from: g */
    private void m71316g() {
        if (this.f56843C.isFinished()) {
            this.f56845E = 0;
            int round = (this.f56872i + (Math.round(((float) (this.f56871h[0].f56891b - this.f56872i)) / ((float) this.f56848H)) * this.f56848H)) - this.f56871h[0].f56891b;
            if (round != 0) {
                this.f56843C.startScroll(0, 0, 0, round, C34943c.f91128x);
            }
        }
    }

    public void computeScroll() {
        Scroller scroller = this.f56842B;
        if (scroller.isFinished()) {
            m71315f(0);
            scroller = this.f56843C;
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        this.f56846F = scroller.getCurrY();
        this.f56847G = this.f56846F - this.f56845E;
        m71311d(this.f56847G);
        invalidate();
        this.f56845E = this.f56846F;
    }

    /* renamed from: b */
    private void m71308b() {
        m71309c();
        m71310d();
        m71312e();
        m71314f();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f56857T = C0995v.m4257a(viewConfiguration);
        this.f56859V = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f56860W = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        this.f56842B = new Scroller(getContext(), null);
        this.f56843C = new Scroller(getContext(), new DecelerateInterpolator(2.5f));
    }

    /* renamed from: c */
    private void m71309c() {
        if (this.f56877n < 0 || this.f56878o < 0) {
            throw new IllegalArgumentException("number can not be negative");
        }
        if (this.f56877n > this.f56878o) {
            this.f56878o = this.f56877n;
        }
        if (this.f56879p < this.f56877n) {
            this.f56879p = this.f56877n;
        }
        if (this.f56879p > this.f56878o) {
            this.f56879p = this.f56878o;
        }
        if (this.f56855O != null) {
            this.f56886w = new int[this.f56855O.length];
        } else {
            this.f56886w = new int[((this.f56878o - this.f56877n) + 1)];
        }
        for (int i = 0; i < this.f56886w.length; i++) {
            this.f56886w[i] = this.f56877n + i;
        }
        this.f56887x = this.f56879p - this.f56877n;
    }

    /* renamed from: d */
    private void m71310d() {
        this.f56866c = new TextPaint();
        this.f56866c.setTextSize(this.f56876m);
        this.f56866c.setColor(this.f56874k);
        this.f56866c.setFlags(1);
        this.f56866c.setTextAlign(Align.CENTER);
        this.f56868e = new TextPaint(this.f56866c);
        this.f56868e.setAlpha(77);
        this.f56867d = new TextPaint();
        this.f56867d.setTextSize(this.f56885v);
        this.f56867d.setColor(this.f56884u);
        this.f56867d.setFlags(1);
        this.f56867d.setTextAlign(Align.LEFT);
        this.f56869f = new Paint();
        this.f56869f.setColor(this.f56875l);
        this.f56869f.setStyle(Style.STROKE);
        this.f56869f.setStrokeWidth(this.f56880q);
    }

    /* renamed from: h */
    private void m71317h() {
        int i = 0;
        if (this.f56864ac) {
            this.f56856P = this.f56871h.length / 2;
            while (i < this.f56871h.length) {
                this.f56871h[i] = new C21161a((this.f56887x - 3) + i, this.f56872i + (this.f56848H * i));
                i++;
            }
            return;
        }
        while (i < this.f56871h.length) {
            C21161a aVar = new C21161a((this.f56887x - 3) + i, this.f56872i + (this.f56848H * i));
            if (aVar.f56890a > this.f56886w.length - 1) {
                aVar.f56890a -= this.f56886w.length;
            } else if (aVar.f56890a < 0) {
                aVar.f56890a += this.f56886w.length;
            }
            this.f56871h[i] = aVar;
            i++;
        }
    }

    /* renamed from: a */
    public final NumberPicker mo57072a(C21162b bVar) {
        this.f56850J = bVar;
        return this;
    }

    public NumberPicker(Context context) {
        this(context, null);
    }

    /* renamed from: f */
    private void m71315f(int i) {
        if (this.f56858U != i) {
            this.f56858U = i;
        }
    }

    public void setNonRecurrent(boolean z) {
        this.f56864ac = z;
        m71317h();
    }

    public void setSoundEffectsEnabled(boolean z) {
        super.setSoundEffectsEnabled(z);
        this.f56854N = z;
    }

    /* renamed from: b */
    public final NumberPicker mo57074b(int i) {
        this.f56878o = i;
        m71309c();
        m71317h();
        invalidate();
        return this;
    }

    /* renamed from: c */
    public final NumberPicker mo57075c(int i) {
        this.f56879p = i;
        m71309c();
        m71317h();
        invalidate();
        return this;
    }

    /* renamed from: a */
    public final NumberPicker mo57071a(int i) {
        this.f56877n = i;
        m71309c();
        m71317h();
        invalidate();
        return this;
    }

    /* renamed from: e */
    private void m71313e(int i) {
        if (i > 0) {
            int i2 = (int) (this.f56876m * 10.0f);
            this.f56845E = 0;
            this.f56842B.fling(0, 0, 0, i, 0, 0, 0, i2);
        } else if (i < 0) {
            int i3 = (int) (this.f56876m * 10.0f);
            this.f56845E = i3;
            this.f56842B.fling(0, i3, 0, i, 0, 0, 0, i3);
        }
        invalidate();
    }

    /* renamed from: a */
    public final NumberPicker mo57073a(String[] strArr) {
        this.f56855O = strArr;
        m71309c();
        invalidate();
        return this;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.f56862aa == null) {
            this.f56862aa = VelocityTracker.obtain();
        }
        this.f56862aa.addMovement(motionEvent);
        int a = C0978j.m4129a(motionEvent);
        this.f56841A = a;
        if (a == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.f56845E = (int) motionEvent.getY();
            if (!this.f56842B.isFinished() || !this.f56843C.isFinished()) {
                this.f56842B.forceFinished(true);
                this.f56843C.forceFinished(true);
                m71315f(0);
            }
        } else if (2 == a) {
            this.f56846F = (int) motionEvent.getY();
            this.f56847G = this.f56846F - this.f56845E;
            if (!this.f56849I && Math.abs(this.f56847G) < this.f56857T) {
                return false;
            }
            this.f56849I = true;
            if (this.f56847G > this.f56857T) {
                this.f56847G -= this.f56857T;
            } else if (this.f56847G < (-this.f56857T)) {
                this.f56847G += this.f56857T;
            }
            this.f56845E = this.f56846F;
            m71311d(this.f56847G);
            m71315f(1);
            invalidate();
        } else if (1 == a) {
            this.f56849I = false;
            VelocityTracker velocityTracker = this.f56862aa;
            velocityTracker.computeCurrentVelocity(1000, (float) this.f56860W);
            int yVelocity = (int) velocityTracker.getYVelocity();
            if (Math.abs(yVelocity) > this.f56859V) {
                m71313e(yVelocity);
                m71315f(2);
            } else {
                m71316g();
                invalidate();
            }
            this.f56862aa.recycle();
            this.f56862aa = null;
        }
        return true;
    }

    /* renamed from: d */
    private void m71311d(int i) {
        int i2 = 0;
        if (this.f56864ac) {
            if (this.f56887x == 0 && this.f56871h[this.f56856P].f56891b + i > this.f56865b / 2) {
                i = (this.f56865b / 2) - this.f56871h[this.f56856P].f56891b;
            } else if (this.f56887x == this.f56886w.length - 1 && this.f56871h[this.f56856P].f56891b + i < this.f56865b / 2) {
                i = (this.f56865b / 2) - this.f56871h[this.f56856P].f56891b;
            }
            while (i2 < this.f56871h.length) {
                C21161a aVar = this.f56871h[i2];
                aVar.f56891b += i;
                if (this.f56871h[i2].f56891b >= this.f56873j + this.f56848H) {
                    C21161a aVar2 = this.f56871h[i2];
                    aVar2.f56891b -= (this.f56852L + 2) * this.f56848H;
                    C21161a aVar3 = this.f56871h[i2];
                    aVar3.f56890a -= this.f56852L + 2;
                }
                if (this.f56871h[i2].f56891b <= this.f56872i - this.f56848H) {
                    C21161a aVar4 = this.f56871h[i2];
                    aVar4.f56891b += (this.f56852L + 2) * this.f56848H;
                    C21161a aVar5 = this.f56871h[i2];
                    aVar5.f56890a += this.f56852L + 2;
                }
                if (Math.abs(this.f56871h[i2].f56891b - (this.f56865b / 2)) < this.f56848H / 4) {
                    int i3 = this.f56879p;
                    if (this.f56871h[i2].f56890a >= 0 && this.f56871h[i2].f56890a < this.f56886w.length) {
                        this.f56856P = i2;
                        this.f56887x = this.f56871h[i2].f56890a;
                        this.f56879p = this.f56886w[this.f56887x];
                    }
                    if (i3 != this.f56879p) {
                        if (this.f56850J != null) {
                            this.f56850J.mo57062a(this, i3, this.f56879p);
                        }
                        if (this.f56853M != null && this.f56854N) {
                            this.f56853M.mo57083a();
                        }
                    }
                }
                i2++;
            }
            return;
        }
        while (i2 < this.f56871h.length) {
            C21161a aVar6 = this.f56871h[i2];
            aVar6.f56891b += i;
            if (this.f56871h[i2].f56891b >= this.f56873j + this.f56848H) {
                C21161a aVar7 = this.f56871h[i2];
                aVar7.f56891b -= (this.f56852L + 2) * this.f56848H;
                C21161a aVar8 = this.f56871h[i2];
                aVar8.f56890a -= this.f56852L + 2;
                while (this.f56871h[i2].f56890a < 0) {
                    C21161a aVar9 = this.f56871h[i2];
                    aVar9.f56890a += this.f56886w.length;
                }
            }
            if (this.f56871h[i2].f56891b <= this.f56872i - this.f56848H) {
                C21161a aVar10 = this.f56871h[i2];
                aVar10.f56891b += (this.f56852L + 2) * this.f56848H;
                C21161a aVar11 = this.f56871h[i2];
                aVar11.f56890a += this.f56852L + 2;
                while (this.f56871h[i2].f56890a > this.f56886w.length - 1) {
                    C21161a aVar12 = this.f56871h[i2];
                    aVar12.f56890a -= this.f56886w.length;
                }
            }
            if (Math.abs(this.f56871h[i2].f56891b - (this.f56865b / 2)) < this.f56848H / 4) {
                this.f56887x = Math.min(this.f56871h[i2].f56890a, this.f56886w.length - 1);
                int i4 = this.f56879p;
                if (this.f56887x >= 0) {
                    this.f56879p = this.f56886w[this.f56887x];
                }
                if (i4 != this.f56879p) {
                    if (this.f56850J != null) {
                        this.f56850J.mo57062a(this, i4, this.f56879p);
                    }
                    if (this.f56853M != null && this.f56854N) {
                        this.f56853M.mo57083a();
                    }
                }
            }
            i2++;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        TextPaint textPaint;
        canvas.drawColor(this.f56844D);
        if (this.f56881r == 0.0f) {
            this.f56881r = (float) this.f56861a;
        }
        if (this.f56881r > ((float) this.f56861a)) {
            f = (float) this.f56861a;
        } else {
            f = this.f56881r;
        }
        float f2 = f / 2.0f;
        float f3 = ((float) (this.f56861a / 2)) - f2;
        float f4 = f2 + ((float) (this.f56861a / 2));
        canvas.drawLine(f3, this.f56888y.top, f4, this.f56888y.top, this.f56869f);
        canvas.drawLine(f3, this.f56888y.bottom, f4, this.f56888y.bottom, this.f56869f);
        if (this.f56883t != null) {
            canvas.drawText(this.f56883t, (float) ((int) (((float) ((this.f56861a + this.f56870g.width()) / 2)) + (this.f56863ab * 4.0f))), (float) (((this.f56865b / 2) + (this.f56870g.height() / 2)) - 4), this.f56867d);
        }
        for (int i = 0; i < this.f56871h.length; i++) {
            if (this.f56871h[i].f56890a >= 0 && this.f56871h[i].f56890a <= this.f56878o - this.f56877n) {
                String str = "";
                if (this.f56871h[i].f56890a >= 0 && this.f56871h[i].f56890a < this.f56886w.length) {
                    str = this.f56855O != null ? this.f56855O[this.f56871h[i].f56890a] : String.valueOf(this.f56886w[this.f56871h[i].f56890a]);
                }
                this.f56851K.contains(str);
                float f5 = (float) (this.f56861a / 2);
                float height = (float) (this.f56871h[i].f56891b + (this.f56870g.height() / 2));
                if (this.f56871h[i].f56890a == this.f56887x) {
                    textPaint = this.f56866c;
                } else {
                    textPaint = this.f56868e;
                }
                canvas.drawText(str, f5, height, textPaint);
                this.f56851K.add(str);
            }
        }
        this.f56851K.clear();
        if (1 == this.f56841A && this.f56842B.isFinished()) {
            m71316g();
        }
    }

    public NumberPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            this.f56861a = size;
        } else {
            this.f56861a = this.f56870g.width() + getPaddingLeft() + getPaddingRight() + this.f56889z.width() + 6;
        }
        if (mode2 == 1073741824) {
            this.f56865b = size2;
        } else {
            this.f56865b = (this.f56852L * this.f56870g.height()) + ((this.f56852L - 1) * this.f56882s) + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(this.f56861a, this.f56865b);
        if (this.f56888y == null) {
            this.f56888y = new RectF();
            this.f56888y.left = 0.0f;
            this.f56888y.right = (float) this.f56861a;
            this.f56888y.top = (float) (((this.f56865b - this.f56870g.height()) - this.f56882s) / 2);
            this.f56888y.bottom = (float) (((this.f56865b + this.f56870g.height()) + this.f56882s) / 2);
            this.f56848H = this.f56882s + this.f56870g.height();
            this.f56872i = (this.f56865b / 2) - (this.f56848H * 3);
            this.f56873j = (this.f56865b / 2) + (this.f56848H * 3);
            m71317h();
        }
    }

    public NumberPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f56841A = 3;
        this.f56851K = new HashSet();
        this.f56854N = true;
        this.f56863ab = getResources().getDisplayMetrics().density;
        m71307a(context, attributeSet, i);
        m71308b();
        m71306a();
    }

    /* renamed from: a */
    private void m71307a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NumberPicker, i, 0);
        this.f56874k = obtainStyledAttributes.getColor(2, f56838Q);
        this.f56876m = obtainStyledAttributes.getDimension(3, this.f56863ab * 32.0f);
        this.f56875l = obtainStyledAttributes.getColor(4, f56838Q);
        this.f56877n = obtainStyledAttributes.getInteger(13, 0);
        this.f56878o = obtainStyledAttributes.getInteger(7, 0);
        this.f56879p = obtainStyledAttributes.getInteger(1, 0);
        this.f56882s = (int) obtainStyledAttributes.getDimension(14, this.f56863ab * 16.0f);
        this.f56883t = obtainStyledAttributes.getString(8);
        this.f56884u = obtainStyledAttributes.getColor(9, f56839R);
        this.f56885v = obtainStyledAttributes.getDimension(10, this.f56863ab * 12.0f);
        this.f56844D = obtainStyledAttributes.getColor(0, f56840S);
        this.f56852L = obtainStyledAttributes.getInteger(12, 5);
        this.f56880q = obtainStyledAttributes.getDimension(6, this.f56863ab * 2.0f);
        this.f56881r = obtainStyledAttributes.getDimension(5, 0.0f);
        obtainStyledAttributes.recycle();
    }
}
