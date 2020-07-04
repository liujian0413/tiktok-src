package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import com.p280ss.android.ugc.aweme.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.WheelPicker */
public class WheelPicker extends View implements Runnable {

    /* renamed from: a */
    private static final String f95401a = "WheelPicker";

    /* renamed from: A */
    private int f95402A;

    /* renamed from: B */
    private int f95403B;

    /* renamed from: C */
    private int f95404C;

    /* renamed from: D */
    private int f95405D;

    /* renamed from: E */
    private int f95406E;

    /* renamed from: F */
    private int f95407F;

    /* renamed from: G */
    private int f95408G;

    /* renamed from: H */
    private int f95409H;

    /* renamed from: I */
    private int f95410I;

    /* renamed from: J */
    private int f95411J;

    /* renamed from: K */
    private int f95412K;

    /* renamed from: L */
    private int f95413L;

    /* renamed from: M */
    private int f95414M;

    /* renamed from: N */
    private int f95415N;

    /* renamed from: O */
    private int f95416O;

    /* renamed from: P */
    private int f95417P;

    /* renamed from: Q */
    private int f95418Q;

    /* renamed from: R */
    private int f95419R;

    /* renamed from: S */
    private int f95420S;

    /* renamed from: T */
    private int f95421T;

    /* renamed from: U */
    private int f95422U;

    /* renamed from: V */
    private boolean f95423V;

    /* renamed from: W */
    private boolean f95424W;

    /* renamed from: aa */
    private boolean f95425aa;

    /* renamed from: ab */
    private boolean f95426ab;

    /* renamed from: ac */
    private boolean f95427ac;

    /* renamed from: ad */
    private boolean f95428ad;

    /* renamed from: ae */
    private boolean f95429ae;

    /* renamed from: af */
    private boolean f95430af;

    /* renamed from: ag */
    private boolean f95431ag;

    /* renamed from: b */
    private final Handler f95432b;

    /* renamed from: c */
    private Paint f95433c;

    /* renamed from: d */
    private Scroller f95434d;

    /* renamed from: e */
    private VelocityTracker f95435e;

    /* renamed from: f */
    private C36324a f95436f;

    /* renamed from: g */
    private C36325b f95437g;

    /* renamed from: h */
    private Rect f95438h;

    /* renamed from: i */
    private Rect f95439i;

    /* renamed from: j */
    private Rect f95440j;

    /* renamed from: k */
    private Rect f95441k;

    /* renamed from: l */
    private Camera f95442l;

    /* renamed from: m */
    private Matrix f95443m;

    /* renamed from: n */
    private Matrix f95444n;

    /* renamed from: o */
    private List f95445o;

    /* renamed from: p */
    private String f95446p;

    /* renamed from: q */
    private int f95447q;

    /* renamed from: r */
    private int f95448r;

    /* renamed from: s */
    private int f95449s;

    /* renamed from: t */
    private int f95450t;

    /* renamed from: u */
    private int f95451u;

    /* renamed from: v */
    private int f95452v;

    /* renamed from: w */
    private int f95453w;

    /* renamed from: x */
    private int f95454x;

    /* renamed from: y */
    private int f95455y;

    /* renamed from: z */
    private int f95456z;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.WheelPicker$a */
    public interface C36324a {
        /* renamed from: a */
        void mo92442a(WheelPicker wheelPicker, Object obj, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.WheelPicker$b */
    public interface C36325b {
    }

    public int getCurrentItemPosition() {
        return this.f95409H;
    }

    public int getCurtainColor() {
        return this.f95402A;
    }

    public List getData() {
        return this.f95445o;
    }

    public int getIndicatorColor() {
        return this.f95456z;
    }

    public int getIndicatorSize() {
        return this.f95455y;
    }

    public int getItemAlign() {
        return this.f95404C;
    }

    public int getItemSpace() {
        return this.f95403B;
    }

    public int getItemTextColor() {
        return this.f95452v;
    }

    public int getItemTextSize() {
        return this.f95454x;
    }

    public String getMaximumWidthText() {
        return this.f95446p;
    }

    public int getMaximumWidthTextPosition() {
        return this.f95419R;
    }

    public int getSelectedItemPosition() {
        return this.f95408G;
    }

    public int getSelectedItemTextColor() {
        return this.f95453w;
    }

    public int getVisibleItemCount() {
        return this.f95447q;
    }

    public Typeface getTypeface() {
        if (this.f95433c != null) {
            return this.f95433c.getTypeface();
        }
        return null;
    }

    /* renamed from: a */
    private void m117531a() {
        if (this.f95447q >= 2) {
            if (this.f95447q % 2 == 0) {
                this.f95447q++;
            }
            this.f95448r = this.f95447q + 2;
            this.f95449s = this.f95448r / 2;
            return;
        }
        throw new ArithmeticException("Wheel's visible item count can not be less than 2!");
    }

    /* renamed from: c */
    private void m117536c() {
        switch (this.f95404C) {
            case 1:
                this.f95433c.setTextAlign(Align.LEFT);
                return;
            case 2:
                this.f95433c.setTextAlign(Align.RIGHT);
                return;
            default:
                this.f95433c.setTextAlign(Align.CENTER);
                return;
        }
    }

    /* renamed from: d */
    private void m117538d() {
        switch (this.f95404C) {
            case 1:
                this.f95416O = this.f95438h.left;
                break;
            case 2:
                this.f95416O = this.f95438h.right;
                break;
            default:
                this.f95416O = this.f95414M;
                break;
        }
        this.f95417P = (int) (((float) this.f95415N) - ((this.f95433c.ascent() + this.f95433c.descent()) / 2.0f));
    }

    /* renamed from: e */
    private void m117539e() {
        int i;
        int i2 = this.f95408G * this.f95405D;
        if (this.f95427ac) {
            i = Integer.MIN_VALUE;
        } else {
            i = ((-this.f95405D) * (this.f95445o.size() - 1)) + i2;
        }
        this.f95410I = i;
        if (this.f95427ac) {
            i2 = Integer.MAX_VALUE;
        }
        this.f95411J = i2;
    }

    /* renamed from: f */
    private void m117540f() {
        if (this.f95424W) {
            int i = this.f95455y / 2;
            int i2 = this.f95415N + this.f95406E;
            int i3 = this.f95415N - this.f95406E;
            this.f95439i.set(this.f95438h.left, i2 - i, this.f95438h.right, i2 + i);
            this.f95440j.set(this.f95438h.left, i3 - i, this.f95438h.right, i3 + i);
        }
    }

    /* renamed from: g */
    private void m117541g() {
        if (this.f95425aa || this.f95453w != -1) {
            this.f95441k.set(this.f95438h.left, this.f95415N - this.f95406E, this.f95438h.right, this.f95415N + this.f95406E);
        }
    }

    public void run() {
        if (this.f95445o != null && this.f95445o.size() != 0) {
            if (this.f95434d.isFinished() && !this.f95430af) {
                if (this.f95405D != 0) {
                    int size = (((-this.f95418Q) / this.f95405D) + this.f95408G) % this.f95445o.size();
                    if (size < 0) {
                        size += this.f95445o.size();
                    }
                    this.f95409H = size;
                    if (this.f95436f != null) {
                        this.f95436f.mo92442a(this, this.f95445o.get(size), size);
                    }
                } else {
                    return;
                }
            }
            if (this.f95434d.computeScrollOffset()) {
                this.f95418Q = this.f95434d.getCurrY();
                postInvalidate();
                this.f95432b.postDelayed(this, 16);
            }
        }
    }

    /* renamed from: b */
    private void m117534b() {
        this.f95451u = 0;
        this.f95450t = this.f95451u;
        if (this.f95423V) {
            this.f95450t = (int) this.f95433c.measureText(String.valueOf(this.f95445o.get(0)));
        } else if (m117532a(this.f95419R)) {
            this.f95450t = (int) this.f95433c.measureText(String.valueOf(this.f95445o.get(this.f95419R)));
        } else if (!TextUtils.isEmpty(this.f95446p)) {
            this.f95450t = (int) this.f95433c.measureText(this.f95446p);
        } else {
            for (Object valueOf : this.f95445o) {
                this.f95450t = Math.max(this.f95450t, (int) this.f95433c.measureText(String.valueOf(valueOf)));
            }
        }
        FontMetrics fontMetrics = this.f95433c.getFontMetrics();
        this.f95451u = (int) (fontMetrics.bottom - fontMetrics.top);
    }

    public void setDebug(boolean z) {
        this.f95431ag = z;
    }

    public void setOnItemSelectedListener(C36324a aVar) {
        this.f95436f = aVar;
    }

    public void setOnWheelChangeListener(C36325b bVar) {
        this.f95437g = bVar;
    }

    public WheelPicker(Context context) {
        this(context, null);
    }

    public void setAtmospheric(boolean z) {
        this.f95426ab = z;
        invalidate();
    }

    public void setCurtainColor(int i) {
        this.f95402A = i;
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.f95456z = i;
        invalidate();
    }

    public void setItemTextColor(int i) {
        this.f95452v = i;
        invalidate();
    }

    public void setCurtain(boolean z) {
        this.f95425aa = z;
        m117541g();
        invalidate();
    }

    public void setCurved(boolean z) {
        this.f95428ad = z;
        requestLayout();
        invalidate();
    }

    public void setCyclic(boolean z) {
        this.f95427ac = z;
        m117539e();
        invalidate();
    }

    public void setIndicator(boolean z) {
        this.f95424W = z;
        m117540f();
        invalidate();
    }

    public void setIndicatorSize(int i) {
        this.f95455y = i;
        m117540f();
        invalidate();
    }

    public void setItemAlign(int i) {
        this.f95404C = i;
        m117536c();
        m117538d();
        invalidate();
    }

    public void setItemSpace(int i) {
        this.f95403B = i;
        requestLayout();
        invalidate();
    }

    public void setSameWidth(boolean z) {
        this.f95423V = z;
        m117534b();
        requestLayout();
        invalidate();
    }

    public void setSelectedItemTextColor(int i) {
        this.f95453w = i;
        m117541g();
        invalidate();
    }

    public void setVisibleItemCount(int i) {
        this.f95447q = i;
        m117531a();
        requestLayout();
    }

    /* renamed from: a */
    private boolean m117532a(int i) {
        if (i < 0 || i >= this.f95445o.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private int m117533b(int i) {
        double sin = Math.sin(Math.toRadians((double) i));
        double d = (double) this.f95407F;
        Double.isNaN(d);
        return (int) (sin * d);
    }

    /* renamed from: c */
    private int m117535c(int i) {
        double d = (double) this.f95407F;
        double cos = Math.cos(Math.toRadians((double) i));
        double d2 = (double) this.f95407F;
        Double.isNaN(d2);
        double d3 = cos * d2;
        Double.isNaN(d);
        return (int) (d - d3);
    }

    /* renamed from: d */
    private int m117537d(int i) {
        if (Math.abs(i) <= this.f95406E) {
            return -i;
        }
        if (this.f95418Q < 0) {
            return (-this.f95405D) - i;
        }
        return this.f95405D - i;
    }

    public void setItemTextSize(int i) {
        this.f95454x = i;
        this.f95433c.setTextSize((float) this.f95454x);
        m117534b();
        requestLayout();
        invalidate();
    }

    public void setMaximumWidthText(String str) {
        if (str != null) {
            this.f95446p = str;
            m117534b();
            requestLayout();
            invalidate();
            return;
        }
        throw new NullPointerException("Maximum width text can not be null!");
    }

    public void setTypeface(Typeface typeface) {
        if (this.f95433c != null) {
            this.f95433c.setTypeface(typeface);
        }
        m117534b();
        requestLayout();
        invalidate();
    }

    public void setData(List list) {
        if (list != null) {
            this.f95445o = list;
            if (this.f95408G > list.size() - 1 || this.f95409H > list.size() - 1) {
                this.f95409H = list.size() - 1;
            }
            this.f95408G = this.f95409H;
            this.f95418Q = 0;
            m117534b();
            m117539e();
            requestLayout();
            invalidate();
            return;
        }
        throw new NullPointerException("WheelPicker's data can not be null!");
    }

    public void setMaximumWidthTextPosition(int i) {
        if (m117532a(i)) {
            this.f95419R = i;
            m117534b();
            requestLayout();
            invalidate();
            return;
        }
        StringBuilder sb = new StringBuilder("Maximum width text Position must in [0, ");
        sb.append(this.f95445o.size());
        sb.append("), but current is ");
        sb.append(i);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    public void setSelectedItemPosition(int i) {
        int max = Math.max(Math.min(i, this.f95445o.size() - 1), 0);
        this.f95408G = max;
        this.f95409H = max;
        this.f95418Q = 0;
        m117539e();
        requestLayout();
        invalidate();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (this.f95435e == null) {
                    this.f95435e = VelocityTracker.obtain();
                } else {
                    this.f95435e.clear();
                }
                this.f95435e.addMovement(motionEvent);
                if (!this.f95434d.isFinished()) {
                    this.f95434d.abortAnimation();
                    this.f95430af = true;
                }
                this.f95420S = (int) motionEvent.getY();
                this.f95421T = this.f95420S;
                break;
            case 1:
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                if (!this.f95429ae) {
                    this.f95435e.addMovement(motionEvent);
                    if (VERSION.SDK_INT >= 4) {
                        this.f95435e.computeCurrentVelocity(1000, (float) this.f95413L);
                    } else {
                        this.f95435e.computeCurrentVelocity(1000);
                    }
                    this.f95430af = false;
                    int yVelocity = (int) this.f95435e.getYVelocity();
                    if (Math.abs(yVelocity) > this.f95412K) {
                        this.f95434d.fling(0, this.f95418Q, 0, yVelocity, 0, 0, this.f95410I, this.f95411J);
                        this.f95434d.setFinalY(this.f95434d.getFinalY() + m117537d(this.f95434d.getFinalY() % this.f95405D));
                    } else {
                        this.f95434d.startScroll(0, this.f95418Q, 0, m117537d(this.f95418Q % this.f95405D));
                    }
                    if (!this.f95427ac) {
                        if (this.f95434d.getFinalY() > this.f95411J) {
                            this.f95434d.setFinalY(this.f95411J);
                        } else if (this.f95434d.getFinalY() < this.f95410I) {
                            this.f95434d.setFinalY(this.f95410I);
                        }
                    }
                    this.f95432b.post(this);
                    if (this.f95435e != null) {
                        this.f95435e.recycle();
                        this.f95435e = null;
                        break;
                    }
                }
                break;
            case 2:
                if (Math.abs(((float) this.f95421T) - motionEvent.getY()) >= ((float) this.f95422U)) {
                    this.f95429ae = false;
                    this.f95435e.addMovement(motionEvent);
                    float y = motionEvent.getY() - ((float) this.f95420S);
                    if (Math.abs(y) >= 1.0f) {
                        this.f95418Q = (int) (((float) this.f95418Q) + y);
                        this.f95420S = (int) motionEvent.getY();
                        invalidate();
                        break;
                    }
                } else {
                    this.f95429ae = true;
                    break;
                }
                break;
            case 3:
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                if (this.f95435e != null) {
                    this.f95435e.recycle();
                    this.f95435e = null;
                    break;
                }
                break;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        Canvas canvas2 = canvas;
        if (this.f95445o != null && !this.f95445o.isEmpty()) {
            int i3 = ((-this.f95418Q) / this.f95405D) - this.f95449s;
            int i4 = this.f95408G + i3;
            int i5 = -this.f95449s;
            while (i4 < this.f95408G + i3 + this.f95448r) {
                String str = "";
                if (this.f95427ac) {
                    int size = i4 % this.f95445o.size();
                    if (size < 0) {
                        size += this.f95445o.size();
                    }
                    str = String.valueOf(this.f95445o.get(size));
                } else if (m117532a(i4)) {
                    str = String.valueOf(this.f95445o.get(i4));
                }
                this.f95433c.setColor(this.f95452v);
                this.f95433c.setStyle(Style.FILL);
                int i6 = this.f95417P + (this.f95405D * i5) + (this.f95418Q % this.f95405D);
                if (this.f95428ad) {
                    float abs = (((float) ((this.f95417P - Math.abs(this.f95417P - i6)) - this.f95438h.top)) * 1.0f) / ((float) (this.f95417P - this.f95438h.top));
                    if (i6 > this.f95417P) {
                        i2 = 1;
                    } else if (i6 < this.f95417P) {
                        i2 = -1;
                    } else {
                        i2 = 0;
                    }
                    float f = (-(1.0f - abs)) * 90.0f * ((float) i2);
                    if (f < -90.0f) {
                        f = -90.0f;
                    }
                    if (f > 90.0f) {
                        f = 90.0f;
                    }
                    int i7 = (int) f;
                    i = m117533b(i7);
                    int i8 = this.f95414M;
                    switch (this.f95404C) {
                        case 1:
                            i8 = this.f95438h.left;
                            break;
                        case 2:
                            i8 = this.f95438h.right;
                            break;
                    }
                    int i9 = this.f95415N - i;
                    this.f95442l.save();
                    this.f95442l.rotateX(f);
                    this.f95442l.getMatrix(this.f95443m);
                    this.f95442l.restore();
                    float f2 = (float) (-i8);
                    float f3 = (float) (-i9);
                    this.f95443m.preTranslate(f2, f3);
                    float f4 = (float) i8;
                    float f5 = (float) i9;
                    this.f95443m.postTranslate(f4, f5);
                    this.f95442l.save();
                    this.f95442l.translate(0.0f, 0.0f, (float) m117535c(i7));
                    this.f95442l.getMatrix(this.f95444n);
                    this.f95442l.restore();
                    this.f95444n.preTranslate(f2, f3);
                    this.f95444n.postTranslate(f4, f5);
                    this.f95443m.postConcat(this.f95444n);
                } else {
                    i = 0;
                }
                if (this.f95426ab) {
                    int abs2 = (int) (((((float) (this.f95417P - Math.abs(this.f95417P - i6))) * 1.0f) / ((float) this.f95417P)) * 255.0f);
                    if (abs2 < 0) {
                        abs2 = 0;
                    }
                    this.f95433c.setAlpha(abs2);
                }
                if (this.f95428ad) {
                    i6 = this.f95417P - i;
                }
                if (this.f95453w != -1) {
                    canvas.save();
                    if (this.f95428ad) {
                        canvas2.concat(this.f95443m);
                    }
                    canvas2.clipRect(this.f95441k, Op.DIFFERENCE);
                    canvas2.drawText(str, (float) this.f95416O, (float) i6, this.f95433c);
                    canvas.restore();
                    this.f95433c.setColor(this.f95453w);
                    canvas.save();
                    if (this.f95428ad) {
                        canvas2.concat(this.f95443m);
                    }
                    canvas2.clipRect(this.f95441k);
                } else {
                    canvas.save();
                    canvas2.clipRect(this.f95438h);
                    if (this.f95428ad) {
                        canvas2.concat(this.f95443m);
                    }
                }
                canvas2.drawText(str, (float) this.f95416O, (float) i6, this.f95433c);
                canvas.restore();
                if (this.f95431ag) {
                    canvas.save();
                    canvas2.clipRect(this.f95438h);
                    this.f95433c.setColor(-1166541);
                    int i10 = this.f95415N + (this.f95405D * i5);
                    float f6 = (float) i10;
                    canvas.drawLine((float) this.f95438h.left, f6, (float) this.f95438h.right, f6, this.f95433c);
                    this.f95433c.setColor(-13421586);
                    this.f95433c.setStyle(Style.STROKE);
                    int i11 = i10 - this.f95406E;
                    canvas.drawRect((float) this.f95438h.left, (float) i11, (float) this.f95438h.right, (float) (i11 + this.f95405D), this.f95433c);
                    canvas.restore();
                }
                i4++;
                i5++;
            }
            if (this.f95425aa) {
                this.f95433c.setColor(this.f95402A);
                this.f95433c.setStyle(Style.FILL);
                canvas2.drawRect(this.f95441k, this.f95433c);
            }
            if (this.f95424W) {
                this.f95433c.setColor(this.f95456z);
                this.f95433c.setStyle(Style.FILL);
                canvas2.drawRect(this.f95439i, this.f95433c);
                canvas2.drawRect(this.f95440j, this.f95433c);
            }
            if (this.f95431ag) {
                this.f95433c.setColor(1144254003);
                this.f95433c.setStyle(Style.FILL);
                canvas.drawRect(0.0f, 0.0f, (float) getPaddingLeft(), (float) getHeight(), this.f95433c);
                canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getPaddingTop(), this.f95433c);
                canvas.drawRect((float) (getWidth() - getPaddingRight()), 0.0f, (float) getWidth(), (float) getHeight(), this.f95433c);
                canvas.drawRect(0.0f, (float) (getHeight() - getPaddingBottom()), (float) getWidth(), (float) getHeight(), this.f95433c);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int i3 = this.f95450t;
        int i4 = (this.f95451u * this.f95447q) + (this.f95403B * (this.f95447q - 1));
        if (this.f95428ad) {
            double d = (double) (i4 * 2);
            Double.isNaN(d);
            i4 = (int) (d / 3.141592653589793d);
        }
        setMeasuredDimension(m117530a(mode, size, i3 + getPaddingLeft() + getPaddingRight()), m117530a(mode2, size2, i4 + getPaddingTop() + getPaddingBottom()));
    }

    public WheelPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f95432b = new Handler();
        this.f95412K = 50;
        this.f95413L = 8000;
        this.f95422U = 8;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WheelPicker);
        int resourceId = obtainStyledAttributes.getResourceId(5, 0);
        Resources resources = getResources();
        if (resourceId == 0) {
            resourceId = R.array.a;
        }
        this.f95445o = Arrays.asList(resources.getStringArray(resourceId));
        this.f95454x = obtainStyledAttributes.getDimensionPixelSize(12, getResources().getDimensionPixelSize(R.dimen.c));
        this.f95447q = obtainStyledAttributes.getInt(18, 7);
        this.f95408G = obtainStyledAttributes.getInt(16, 0);
        this.f95423V = obtainStyledAttributes.getBoolean(15, false);
        this.f95419R = obtainStyledAttributes.getInt(14, -1);
        this.f95446p = obtainStyledAttributes.getString(13);
        this.f95453w = obtainStyledAttributes.getColor(17, -1);
        this.f95452v = obtainStyledAttributes.getColor(11, -7829368);
        this.f95403B = obtainStyledAttributes.getDimensionPixelSize(10, getResources().getDimensionPixelSize(R.dimen.b));
        this.f95427ac = obtainStyledAttributes.getBoolean(4, false);
        this.f95424W = obtainStyledAttributes.getBoolean(6, false);
        this.f95456z = obtainStyledAttributes.getColor(7, -1166541);
        this.f95455y = obtainStyledAttributes.getDimensionPixelSize(8, getResources().getDimensionPixelSize(R.dimen.a));
        this.f95425aa = obtainStyledAttributes.getBoolean(1, false);
        this.f95402A = obtainStyledAttributes.getColor(2, -1996488705);
        this.f95426ab = obtainStyledAttributes.getBoolean(0, false);
        this.f95428ad = obtainStyledAttributes.getBoolean(3, false);
        this.f95404C = obtainStyledAttributes.getInt(9, 0);
        obtainStyledAttributes.recycle();
        m117531a();
        this.f95433c = new Paint(69);
        this.f95433c.setTextSize((float) this.f95454x);
        m117536c();
        m117534b();
        this.f95434d = new Scroller(getContext());
        if (VERSION.SDK_INT >= 4) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            this.f95412K = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f95413L = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f95422U = viewConfiguration.getScaledTouchSlop();
        }
        this.f95438h = new Rect();
        this.f95439i = new Rect();
        this.f95440j = new Rect();
        this.f95441k = new Rect();
        this.f95442l = new Camera();
        this.f95443m = new Matrix();
        this.f95444n = new Matrix();
    }

    /* renamed from: a */
    private static int m117530a(int i, int i2, int i3) {
        if (i == 1073741824) {
            return i2;
        }
        if (i == Integer.MIN_VALUE) {
            return Math.min(i3, i2);
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f95438h.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.f95414M = this.f95438h.centerX();
        this.f95415N = this.f95438h.centerY();
        m117538d();
        this.f95407F = this.f95438h.height() / 2;
        this.f95405D = this.f95438h.height() / this.f95447q;
        this.f95406E = this.f95405D / 2;
        m117539e();
        m117540f();
        m117541g();
    }
}
