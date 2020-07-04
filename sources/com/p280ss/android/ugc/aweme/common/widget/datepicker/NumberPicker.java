package com.p280ss.android.ugc.aweme.common.widget.datepicker;

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
import com.p280ss.android.ugc.aweme.R$styleable;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.common.widget.datepicker.NumberPicker */
public class NumberPicker extends View {

    /* renamed from: P */
    private static final int f67934P = Color.rgb(0, NormalGiftView.MASK_TRANSLATE_VALUE, 136);

    /* renamed from: Q */
    private static final int f67935Q = Color.rgb(0, NormalGiftView.MASK_TRANSLATE_VALUE, 136);

    /* renamed from: R */
    private static final int f67936R = Color.rgb(NormalGiftView.ALPHA_255, NormalGiftView.ALPHA_255, NormalGiftView.ALPHA_255);

    /* renamed from: A */
    protected int f67937A;

    /* renamed from: B */
    protected Scroller f67938B;

    /* renamed from: C */
    protected Scroller f67939C;

    /* renamed from: D */
    protected int f67940D;

    /* renamed from: E */
    protected int f67941E;

    /* renamed from: F */
    protected int f67942F;

    /* renamed from: G */
    protected int f67943G;

    /* renamed from: H */
    protected int f67944H;

    /* renamed from: I */
    protected boolean f67945I;

    /* renamed from: J */
    protected C25761b f67946J;

    /* renamed from: K */
    protected Set<String> f67947K;

    /* renamed from: L */
    protected int f67948L;

    /* renamed from: M */
    protected C25762a f67949M;

    /* renamed from: N */
    protected boolean f67950N;

    /* renamed from: O */
    protected String[] f67951O;

    /* renamed from: S */
    private int f67952S;

    /* renamed from: T */
    private int f67953T;

    /* renamed from: U */
    private int f67954U;

    /* renamed from: V */
    private int f67955V;

    /* renamed from: W */
    private VelocityTracker f67956W;

    /* renamed from: a */
    protected int f67957a;

    /* renamed from: aa */
    private float f67958aa;

    /* renamed from: b */
    protected int f67959b;

    /* renamed from: c */
    protected TextPaint f67960c;

    /* renamed from: d */
    protected TextPaint f67961d;

    /* renamed from: e */
    protected TextPaint f67962e;

    /* renamed from: f */
    protected Paint f67963f;

    /* renamed from: g */
    protected Rect f67964g;

    /* renamed from: h */
    protected C25760a[] f67965h;

    /* renamed from: i */
    protected int f67966i;

    /* renamed from: j */
    protected int f67967j;

    /* renamed from: k */
    protected int f67968k;

    /* renamed from: l */
    protected int f67969l;

    /* renamed from: m */
    protected float f67970m;

    /* renamed from: n */
    protected int f67971n;

    /* renamed from: o */
    protected int f67972o;

    /* renamed from: p */
    protected int f67973p;

    /* renamed from: q */
    protected float f67974q;

    /* renamed from: r */
    protected float f67975r;

    /* renamed from: s */
    protected int f67976s;

    /* renamed from: t */
    protected String f67977t;

    /* renamed from: u */
    protected int f67978u;

    /* renamed from: v */
    protected float f67979v;

    /* renamed from: w */
    protected int[] f67980w;

    /* renamed from: x */
    protected int f67981x;

    /* renamed from: y */
    protected RectF f67982y;

    /* renamed from: z */
    protected Rect f67983z;

    /* renamed from: com.ss.android.ugc.aweme.common.widget.datepicker.NumberPicker$a */
    class C25760a {

        /* renamed from: a */
        public int f67984a;

        /* renamed from: b */
        public int f67985b;

        C25760a(int i, int i2) {
            this.f67984a = i;
            this.f67985b = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.datepicker.NumberPicker$b */
    public interface C25761b {
        /* renamed from: a */
        void mo66820a(NumberPicker numberPicker, int i, int i2);
    }

    public int getCurrentNumber() {
        return this.f67973p;
    }

    /* renamed from: a */
    private void m84619a() {
        this.f67965h = new C25760a[(this.f67948L + 4)];
    }

    /* renamed from: e */
    private void m84624e() {
        this.f67964g = new Rect();
        this.f67983z = new Rect();
    }

    /* renamed from: f */
    private void m84625f() {
        int length = String.valueOf(this.f67972o).length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append("0");
        }
        String sb2 = sb.toString();
        this.f67960c.getTextBounds(sb2, 0, sb2.length(), this.f67964g);
        if (this.f67977t != null) {
            this.f67961d.getTextBounds(this.f67977t, 0, this.f67977t.length(), this.f67983z);
        }
    }

    /* renamed from: g */
    private void m84626g() {
        if (this.f67939C.isFinished()) {
            this.f67941E = 0;
            int round = (this.f67966i + (Math.round(((float) (this.f67965h[0].f67985b - this.f67966i)) / ((float) this.f67944H)) * this.f67944H)) - this.f67965h[0].f67985b;
            if (round != 0) {
                this.f67939C.startScroll(0, 0, 0, round, C34943c.f91128x);
            }
        }
    }

    /* renamed from: h */
    private void m84628h() {
        for (int i = 0; i < this.f67965h.length; i++) {
            C25760a aVar = new C25760a((this.f67981x - 3) + i, this.f67966i + (this.f67944H * i));
            if (aVar.f67984a > this.f67980w.length - 1) {
                aVar.f67984a -= this.f67980w.length;
            } else if (aVar.f67984a < 0) {
                aVar.f67984a += this.f67980w.length;
            }
            this.f67965h[i] = aVar;
        }
    }

    public void computeScroll() {
        Scroller scroller = this.f67938B;
        if (scroller.isFinished()) {
            m84630i(0);
            scroller = this.f67939C;
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        this.f67942F = scroller.getCurrY();
        this.f67943G = this.f67942F - this.f67941E;
        m84627g(this.f67943G);
        invalidate();
        this.f67941E = this.f67942F;
    }

    /* renamed from: b */
    private void m84621b() {
        m84622c();
        m84623d();
        m84624e();
        m84625f();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f67952S = C0995v.m4257a(viewConfiguration);
        this.f67954U = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f67955V = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        this.f67938B = new Scroller(getContext(), null);
        this.f67939C = new Scroller(getContext(), new DecelerateInterpolator(2.5f));
    }

    /* renamed from: c */
    private void m84622c() {
        if (this.f67971n < 0 || this.f67972o < 0) {
            throw new IllegalArgumentException("number can not be negative");
        }
        if (this.f67971n > this.f67972o) {
            this.f67972o = this.f67971n;
        }
        if (this.f67973p < this.f67971n) {
            this.f67973p = this.f67971n;
        }
        if (this.f67973p > this.f67972o) {
            this.f67973p = this.f67972o;
        }
        if (this.f67951O != null) {
            this.f67980w = new int[this.f67951O.length];
        } else {
            this.f67980w = new int[((this.f67972o - this.f67971n) + 1)];
        }
        for (int i = 0; i < this.f67980w.length; i++) {
            this.f67980w[i] = this.f67971n + i;
        }
        this.f67981x = this.f67973p - this.f67971n;
    }

    /* renamed from: d */
    private void m84623d() {
        this.f67960c = new TextPaint();
        this.f67960c.setTextSize(this.f67970m);
        this.f67960c.setColor(this.f67968k);
        this.f67960c.setFlags(1);
        this.f67960c.setTextAlign(Align.CENTER);
        this.f67962e = new TextPaint(this.f67960c);
        this.f67962e.setColor(Color.argb((int) (((float) Color.alpha(this.f67968k)) * 0.3f), Color.red(this.f67968k), Color.green(this.f67968k), Color.blue(this.f67968k)));
        this.f67961d = new TextPaint();
        this.f67961d.setTextSize(this.f67979v);
        this.f67961d.setColor(this.f67978u);
        this.f67961d.setFlags(1);
        this.f67961d.setTextAlign(Align.LEFT);
        this.f67963f = new Paint();
        this.f67963f.setColor(this.f67969l);
        this.f67963f.setStyle(Style.STROKE);
        this.f67963f.setStrokeWidth(this.f67974q);
    }

    /* renamed from: a */
    public final NumberPicker mo66829a(C25761b bVar) {
        this.f67946J = bVar;
        return this;
    }

    public NumberPicker(Context context) {
        this(context, null);
    }

    /* renamed from: i */
    private void m84630i(int i) {
        if (this.f67953T != i) {
            this.f67953T = i;
        }
    }

    public void setSoundEffectsEnabled(boolean z) {
        super.setSoundEffectsEnabled(z);
        this.f67950N = z;
    }

    /* renamed from: b */
    public final NumberPicker mo66831b(int i) {
        this.f67972o = i;
        m84622c();
        m84628h();
        invalidate();
        return this;
    }

    /* renamed from: c */
    public final NumberPicker mo66832c(int i) {
        this.f67973p = i;
        m84622c();
        m84628h();
        invalidate();
        return this;
    }

    /* renamed from: d */
    public final NumberPicker mo66834d(int i) {
        this.f67968k = i;
        m84623d();
        invalidate();
        return this;
    }

    /* renamed from: f */
    public final NumberPicker mo66836f(int i) {
        this.f67969l = i;
        m84623d();
        invalidate();
        return this;
    }

    /* renamed from: a */
    public final NumberPicker mo66828a(int i) {
        this.f67971n = i;
        m84622c();
        m84628h();
        invalidate();
        return this;
    }

    /* renamed from: e */
    public final NumberPicker mo66835e(int i) {
        this.f67978u = i;
        m84623d();
        invalidate();
        return this;
    }

    /* renamed from: a */
    public final NumberPicker mo66830a(String[] strArr) {
        this.f67951O = strArr;
        m84622c();
        invalidate();
        return this;
    }

    /* renamed from: h */
    private void m84629h(int i) {
        if (i > 0) {
            int i2 = (int) (this.f67970m * 10.0f);
            this.f67941E = 0;
            this.f67938B.fling(0, 0, 0, i, 0, 0, 0, i2);
        } else if (i < 0) {
            int i3 = (int) (this.f67970m * 10.0f);
            this.f67941E = i3;
            this.f67938B.fling(0, i3, 0, i, 0, 0, 0, i3);
        }
        invalidate();
    }

    /* renamed from: g */
    private void m84627g(int i) {
        for (int i2 = 0; i2 < this.f67965h.length; i2++) {
            C25760a aVar = this.f67965h[i2];
            aVar.f67985b += i;
            if (this.f67965h[i2].f67985b >= this.f67967j + this.f67944H) {
                C25760a aVar2 = this.f67965h[i2];
                aVar2.f67985b -= (this.f67948L + 2) * this.f67944H;
                C25760a aVar3 = this.f67965h[i2];
                aVar3.f67984a -= this.f67948L + 2;
                while (this.f67965h[i2].f67984a < 0) {
                    C25760a aVar4 = this.f67965h[i2];
                    aVar4.f67984a += this.f67980w.length;
                }
            }
            if (this.f67965h[i2].f67985b <= this.f67966i - this.f67944H) {
                C25760a aVar5 = this.f67965h[i2];
                aVar5.f67985b += (this.f67948L + 2) * this.f67944H;
                C25760a aVar6 = this.f67965h[i2];
                aVar6.f67984a += this.f67948L + 2;
                while (this.f67965h[i2].f67984a > this.f67980w.length - 1) {
                    C25760a aVar7 = this.f67965h[i2];
                    aVar7.f67984a -= this.f67980w.length;
                }
            }
            if (Math.abs(this.f67965h[i2].f67985b - (this.f67959b / 2)) < this.f67944H / 4) {
                this.f67981x = Math.min(this.f67965h[i2].f67984a, this.f67980w.length - 1);
                int i3 = this.f67973p;
                if (this.f67981x >= 0) {
                    this.f67973p = this.f67980w[this.f67981x];
                }
                if (i3 != this.f67973p) {
                    if (this.f67946J != null) {
                        this.f67946J.mo66820a(this, i3, this.f67973p);
                    }
                    if (this.f67949M != null && this.f67950N) {
                        this.f67949M.mo66842a();
                    }
                }
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.f67956W == null) {
            this.f67956W = VelocityTracker.obtain();
        }
        this.f67956W.addMovement(motionEvent);
        int a = C0978j.m4129a(motionEvent);
        this.f67937A = a;
        if (a == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.f67941E = (int) motionEvent.getY();
            if (!this.f67938B.isFinished() || !this.f67939C.isFinished()) {
                this.f67938B.forceFinished(true);
                this.f67939C.forceFinished(true);
                m84630i(0);
            }
        } else if (2 == a) {
            this.f67942F = (int) motionEvent.getY();
            this.f67943G = this.f67942F - this.f67941E;
            if (!this.f67945I && Math.abs(this.f67943G) < this.f67952S) {
                return false;
            }
            this.f67945I = true;
            if (this.f67943G > this.f67952S) {
                this.f67943G -= this.f67952S;
            } else if (this.f67943G < (-this.f67952S)) {
                this.f67943G += this.f67952S;
            }
            this.f67941E = this.f67942F;
            m84627g(this.f67943G);
            m84630i(1);
            invalidate();
        } else if (1 == a) {
            this.f67945I = false;
            VelocityTracker velocityTracker = this.f67956W;
            velocityTracker.computeCurrentVelocity(1000, (float) this.f67955V);
            int yVelocity = (int) velocityTracker.getYVelocity();
            if (Math.abs(yVelocity) > this.f67954U) {
                m84629h(yVelocity);
                m84630i(2);
            } else {
                m84626g();
                invalidate();
            }
            this.f67956W.recycle();
            this.f67956W = null;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        TextPaint textPaint;
        canvas.drawColor(this.f67940D);
        if (this.f67975r == 0.0f) {
            this.f67975r = (float) this.f67957a;
        }
        if (this.f67975r > ((float) this.f67957a)) {
            f = (float) this.f67957a;
        } else {
            f = this.f67975r;
        }
        float f2 = f / 2.0f;
        float f3 = ((float) (this.f67957a / 2)) - f2;
        float f4 = f2 + ((float) (this.f67957a / 2));
        canvas.drawLine(f3, this.f67982y.top, f4, this.f67982y.top, this.f67963f);
        canvas.drawLine(f3, this.f67982y.bottom, f4, this.f67982y.bottom, this.f67963f);
        if (this.f67977t != null) {
            canvas.drawText(this.f67977t, (float) ((int) (((float) ((this.f67957a + this.f67964g.width()) / 2)) + (this.f67958aa * 4.0f))), (float) (((this.f67959b / 2) + (this.f67964g.height() / 2)) - 4), this.f67961d);
        }
        for (int i = 0; i < this.f67965h.length; i++) {
            if (this.f67965h[i].f67984a >= 0 && this.f67965h[i].f67984a <= this.f67972o - this.f67971n) {
                String str = "";
                if (this.f67965h[i].f67984a >= 0 && this.f67965h[i].f67984a < this.f67980w.length) {
                    str = this.f67951O != null ? this.f67951O[this.f67965h[i].f67984a] : String.valueOf(this.f67980w[this.f67965h[i].f67984a]);
                }
                float f5 = (float) (this.f67957a / 2);
                float height = (float) (this.f67965h[i].f67985b + (this.f67964g.height() / 2));
                if (this.f67965h[i].f67984a == this.f67981x) {
                    textPaint = this.f67960c;
                } else {
                    textPaint = this.f67962e;
                }
                canvas.drawText(str, f5, height, textPaint);
                this.f67947K.add(str);
            }
        }
        this.f67947K.clear();
        if (1 == this.f67937A && this.f67938B.isFinished()) {
            m84626g();
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
            this.f67957a = size;
        } else {
            this.f67957a = this.f67964g.width() + getPaddingLeft() + getPaddingRight() + this.f67983z.width() + 6;
        }
        if (mode2 == 1073741824) {
            this.f67959b = size2;
        } else {
            this.f67959b = (this.f67948L * this.f67964g.height()) + ((this.f67948L - 1) * this.f67976s) + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(this.f67957a, this.f67959b);
        if (this.f67982y == null) {
            this.f67982y = new RectF();
            this.f67982y.left = 0.0f;
            this.f67982y.right = (float) this.f67957a;
            this.f67982y.top = (float) (((this.f67959b - this.f67964g.height()) - this.f67976s) / 2);
            this.f67982y.bottom = (float) (((this.f67959b + this.f67964g.height()) + this.f67976s) / 2);
            this.f67944H = this.f67976s + this.f67964g.height();
            this.f67966i = (this.f67959b / 2) - (this.f67944H * 3);
            this.f67967j = (this.f67959b / 2) + (this.f67944H * 3);
            m84628h();
        }
    }

    public NumberPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f67937A = 3;
        this.f67947K = new HashSet();
        this.f67950N = true;
        this.f67958aa = getResources().getDisplayMetrics().density;
        m84620a(context, attributeSet, i);
        m84621b();
        m84619a();
    }

    /* renamed from: a */
    private void m84620a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NumberPicker, i, 0);
        this.f67968k = obtainStyledAttributes.getColor(2, f67934P);
        this.f67970m = obtainStyledAttributes.getDimension(3, this.f67958aa * 32.0f);
        this.f67969l = obtainStyledAttributes.getColor(4, f67934P);
        this.f67971n = obtainStyledAttributes.getInteger(13, 0);
        this.f67972o = obtainStyledAttributes.getInteger(7, 0);
        this.f67973p = obtainStyledAttributes.getInteger(1, 0);
        this.f67976s = (int) obtainStyledAttributes.getDimension(14, this.f67958aa * 16.0f);
        this.f67977t = obtainStyledAttributes.getString(8);
        this.f67978u = obtainStyledAttributes.getColor(9, f67935Q);
        this.f67979v = obtainStyledAttributes.getDimension(10, this.f67958aa * 12.0f);
        this.f67940D = obtainStyledAttributes.getColor(0, f67936R);
        this.f67948L = obtainStyledAttributes.getInteger(12, 5);
        this.f67974q = obtainStyledAttributes.getDimension(6, this.f67958aa * 2.0f);
        this.f67975r = obtainStyledAttributes.getDimension(5, 0.0f);
        obtainStyledAttributes.recycle();
    }
}
