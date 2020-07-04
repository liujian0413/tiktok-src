package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
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
import com.bytedance.android.livesdk.R$styleable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WheelPicker extends View implements Runnable {

    /* renamed from: a */
    private static final String f25253a = "WheelPicker";

    /* renamed from: A */
    private int f25254A;

    /* renamed from: B */
    private int f25255B;

    /* renamed from: C */
    private int f25256C;

    /* renamed from: D */
    private int f25257D;

    /* renamed from: E */
    private int f25258E;

    /* renamed from: F */
    private int f25259F;

    /* renamed from: G */
    private int f25260G;

    /* renamed from: H */
    private int f25261H;

    /* renamed from: I */
    private int f25262I;

    /* renamed from: J */
    private int f25263J;

    /* renamed from: K */
    private int f25264K;

    /* renamed from: L */
    private int f25265L;

    /* renamed from: M */
    private int f25266M;

    /* renamed from: N */
    private int f25267N;

    /* renamed from: O */
    private int f25268O;

    /* renamed from: P */
    private int f25269P;

    /* renamed from: Q */
    private int f25270Q;

    /* renamed from: R */
    private int f25271R;

    /* renamed from: S */
    private int f25272S;

    /* renamed from: T */
    private int f25273T;

    /* renamed from: U */
    private int f25274U;

    /* renamed from: V */
    private int f25275V;

    /* renamed from: W */
    private int f25276W;

    /* renamed from: aa */
    private boolean f25277aa;

    /* renamed from: ab */
    private boolean f25278ab;

    /* renamed from: ac */
    private boolean f25279ac;

    /* renamed from: ad */
    private boolean f25280ad;

    /* renamed from: ae */
    private boolean f25281ae;

    /* renamed from: af */
    private boolean f25282af;

    /* renamed from: ag */
    private boolean f25283ag;

    /* renamed from: ah */
    private boolean f25284ah;

    /* renamed from: ai */
    private String f25285ai;

    /* renamed from: aj */
    private boolean f25286aj;

    /* renamed from: b */
    private final Handler f25287b;

    /* renamed from: c */
    private Paint f25288c;

    /* renamed from: d */
    private Scroller f25289d;

    /* renamed from: e */
    private VelocityTracker f25290e;

    /* renamed from: f */
    private boolean f25291f;

    /* renamed from: g */
    private C9222a f25292g;

    /* renamed from: h */
    private C9223b f25293h;

    /* renamed from: i */
    private Rect f25294i;

    /* renamed from: j */
    private Rect f25295j;

    /* renamed from: k */
    private Rect f25296k;

    /* renamed from: l */
    private Rect f25297l;

    /* renamed from: m */
    private Camera f25298m;

    /* renamed from: n */
    private Matrix f25299n;

    /* renamed from: o */
    private Matrix f25300o;

    /* renamed from: p */
    private List f25301p;

    /* renamed from: q */
    private String f25302q;

    /* renamed from: r */
    private int f25303r;

    /* renamed from: s */
    private int f25304s;

    /* renamed from: t */
    private int f25305t;

    /* renamed from: u */
    private int f25306u;

    /* renamed from: v */
    private int f25307v;

    /* renamed from: w */
    private int f25308w;

    /* renamed from: x */
    private int f25309x;

    /* renamed from: y */
    private int f25310y;

    /* renamed from: z */
    private int f25311z;

    /* renamed from: com.bytedance.android.livesdk.widget.WheelPicker$a */
    public interface C9222a {
    }

    /* renamed from: com.bytedance.android.livesdk.widget.WheelPicker$b */
    public interface C9223b {
    }

    public int getCurrentItemPosition() {
        return this.f25263J;
    }

    public int getCurtainColor() {
        return this.f25256C;
    }

    public List getData() {
        return this.f25301p;
    }

    public int getIndicatorColor() {
        return this.f25255B;
    }

    public int getIndicatorSize() {
        return this.f25254A;
    }

    public int getItemAlign() {
        return this.f25258E;
    }

    public int getItemSpace() {
        return this.f25257D;
    }

    public int getItemTextColor() {
        return this.f25308w;
    }

    public int getItemTextSize() {
        return this.f25310y;
    }

    public String getMaximumWidthText() {
        return this.f25302q;
    }

    public int getMaximumWidthTextPosition() {
        return this.f25273T;
    }

    public int getSelectedItemPosition() {
        return this.f25262I;
    }

    public int getSelectedItemTextColor() {
        return this.f25309x;
    }

    public int getVisibleItemCount() {
        return this.f25303r;
    }

    public Typeface getTypeface() {
        if (this.f25288c != null) {
            return this.f25288c.getTypeface();
        }
        return null;
    }

    /* renamed from: a */
    private void m27461a() {
        if (this.f25303r >= 2) {
            if (this.f25303r % 2 == 0) {
                this.f25303r++;
            }
            this.f25304s = this.f25303r + 2;
            this.f25305t = this.f25304s / 2;
            return;
        }
        throw new ArithmeticException("Wheel's visible item count can not be less than 2!");
    }

    /* renamed from: c */
    private void m27466c() {
        switch (this.f25258E) {
            case 1:
                this.f25288c.setTextAlign(Align.LEFT);
                return;
            case 2:
                this.f25288c.setTextAlign(Align.RIGHT);
                return;
            default:
                this.f25288c.setTextAlign(Align.CENTER);
                return;
        }
    }

    /* renamed from: d */
    private void m27468d() {
        switch (this.f25258E) {
            case 1:
                this.f25270Q = this.f25294i.left;
                break;
            case 2:
                this.f25270Q = this.f25294i.right;
                break;
            default:
                this.f25270Q = this.f25268O;
                break;
        }
        this.f25271R = (int) (((float) this.f25269P) - ((this.f25288c.ascent() + this.f25288c.descent()) / 2.0f));
    }

    /* renamed from: e */
    private void m27469e() {
        int i;
        int i2 = this.f25262I * this.f25259F;
        if (this.f25281ae) {
            i = Integer.MIN_VALUE;
        } else {
            i = ((-this.f25259F) * (this.f25301p.size() - 1)) + i2;
        }
        this.f25264K = i;
        if (this.f25281ae) {
            i2 = Integer.MAX_VALUE;
        }
        this.f25265L = i2;
    }

    /* renamed from: f */
    private void m27470f() {
        if (this.f25278ab) {
            int i = this.f25254A / 2;
            int i2 = this.f25269P + this.f25260G;
            int i3 = this.f25269P - this.f25260G;
            this.f25295j.set(this.f25294i.left, i2 - i, this.f25294i.right, i2 + i);
            this.f25296k.set(this.f25294i.left, i3 - i, this.f25294i.right, i3 + i);
        }
    }

    /* renamed from: g */
    private void m27471g() {
        if (this.f25279ac || this.f25309x != -1) {
            this.f25297l.set(this.f25294i.left, this.f25269P - this.f25260G, this.f25294i.right, this.f25269P + this.f25260G);
        }
    }

    public void run() {
        if (this.f25301p != null && this.f25301p.size() != 0) {
            if (this.f25289d.isFinished() && !this.f25284ah) {
                if (this.f25259F != 0) {
                    int size = (((-this.f25272S) / this.f25259F) + this.f25262I) % this.f25301p.size();
                    if (size < 0) {
                        size += this.f25301p.size();
                    }
                    this.f25263J = size;
                    if (this.f25292g != null && this.f25291f) {
                        this.f25301p.get(size);
                    }
                } else {
                    return;
                }
            }
            if (this.f25289d.computeScrollOffset()) {
                this.f25272S = this.f25289d.getCurrY();
                postInvalidate();
                this.f25287b.postDelayed(this, 16);
            }
        }
    }

    /* renamed from: b */
    private void m27464b() {
        this.f25306u = 0;
        this.f25307v = 0;
        if (this.f25277aa) {
            this.f25306u = (int) this.f25288c.measureText(String.valueOf(this.f25301p.get(0)));
        } else if (m27462a(this.f25273T)) {
            this.f25306u = (int) this.f25288c.measureText(String.valueOf(this.f25301p.get(this.f25273T)));
        } else if (!TextUtils.isEmpty(this.f25302q)) {
            this.f25306u = (int) this.f25288c.measureText(this.f25302q);
        } else {
            for (Object valueOf : this.f25301p) {
                this.f25306u = Math.max(this.f25306u, (int) this.f25288c.measureText(String.valueOf(valueOf)));
            }
        }
        FontMetrics fontMetrics = this.f25288c.getFontMetrics();
        this.f25307v = (int) (fontMetrics.bottom - fontMetrics.top);
    }

    public void setOnItemSelectedListener(C9222a aVar) {
        this.f25292g = aVar;
    }

    public void setOnWheelChangeListener(C9223b bVar) {
        this.f25293h = bVar;
    }

    public void setSelectItemTextSize(int i) {
        this.f25311z = i;
    }

    public WheelPicker(Context context) {
        this(context, null);
    }

    public void setAtmospheric(boolean z) {
        this.f25280ad = z;
        invalidate();
    }

    public void setCurtainColor(int i) {
        this.f25256C = i;
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.f25255B = i;
        invalidate();
    }

    public void setItemTextColor(int i) {
        this.f25308w = i;
        invalidate();
    }

    public void setSelectedItemPosition(int i) {
        mo22642a(i, true);
    }

    public void setCurtain(boolean z) {
        this.f25279ac = z;
        m27471g();
        invalidate();
    }

    public void setCurved(boolean z) {
        this.f25282af = z;
        requestLayout();
        invalidate();
    }

    public void setCyclic(boolean z) {
        this.f25281ae = z;
        m27469e();
        invalidate();
    }

    public void setIndicator(boolean z) {
        this.f25278ab = z;
        m27470f();
        invalidate();
    }

    public void setIndicatorSize(int i) {
        this.f25254A = i;
        m27470f();
        invalidate();
    }

    public void setItemAlign(int i) {
        this.f25258E = i;
        m27466c();
        m27468d();
        invalidate();
    }

    public void setItemSpace(int i) {
        this.f25257D = i;
        requestLayout();
        invalidate();
    }

    public void setSameWidth(boolean z) {
        this.f25277aa = z;
        m27464b();
        requestLayout();
        invalidate();
    }

    public void setSelectedItemTextColor(int i) {
        this.f25309x = i;
        m27471g();
        invalidate();
    }

    public void setVisibleItemCount(int i) {
        this.f25303r = i;
        m27461a();
        requestLayout();
    }

    /* renamed from: a */
    private boolean m27462a(int i) {
        if (i < 0 || i >= this.f25301p.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private int m27463b(int i) {
        double sin = Math.sin(Math.toRadians((double) i));
        double d = (double) this.f25261H;
        Double.isNaN(d);
        return (int) (sin * d);
    }

    /* renamed from: c */
    private int m27465c(int i) {
        double d = (double) this.f25261H;
        double cos = Math.cos(Math.toRadians((double) i));
        double d2 = (double) this.f25261H;
        Double.isNaN(d2);
        double d3 = cos * d2;
        Double.isNaN(d);
        return (int) (d - d3);
    }

    /* renamed from: d */
    private int m27467d(int i) {
        if (Math.abs(i) <= this.f25260G) {
            return -i;
        }
        if (this.f25272S < 0) {
            return (-this.f25259F) - i;
        }
        return this.f25259F - i;
    }

    public void setItemTextSize(int i) {
        this.f25310y = i;
        this.f25288c.setTextSize((float) this.f25310y);
        m27464b();
        requestLayout();
        invalidate();
    }

    public void setMaximumWidthText(String str) {
        if (str != null) {
            this.f25302q = str;
            m27464b();
            requestLayout();
            invalidate();
            return;
        }
        throw new NullPointerException("Maximum width text can not be null!");
    }

    public void setTypeface(Typeface typeface) {
        if (this.f25288c != null) {
            this.f25288c.setTypeface(typeface);
        }
        m27464b();
        requestLayout();
        invalidate();
    }

    public void setData(List list) {
        if (list != null) {
            this.f25301p = list;
            if (this.f25262I > list.size() - 1 || this.f25263J > list.size() - 1) {
                this.f25263J = list.size() - 1;
            }
            this.f25262I = this.f25263J;
            this.f25272S = 0;
            m27464b();
            m27469e();
            requestLayout();
            invalidate();
            return;
        }
        throw new NullPointerException("WheelPicker's data can not be null!");
    }

    public void setMaximumWidthTextPosition(int i) {
        if (m27462a(i)) {
            this.f25273T = i;
            m27464b();
            requestLayout();
            invalidate();
            return;
        }
        StringBuilder sb = new StringBuilder("Maximum width text Position must in [0, ");
        sb.append(this.f25301p.size());
        sb.append("), but current is ");
        sb.append(i);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f25291f = true;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (this.f25290e == null) {
                    this.f25290e = VelocityTracker.obtain();
                } else {
                    this.f25290e.clear();
                }
                this.f25290e.addMovement(motionEvent);
                if (!this.f25289d.isFinished()) {
                    this.f25289d.abortAnimation();
                    this.f25284ah = true;
                }
                this.f25274U = (int) motionEvent.getY();
                this.f25275V = this.f25274U;
                break;
            case 1:
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                if (!this.f25283ag || this.f25284ah) {
                    this.f25290e.addMovement(motionEvent);
                    if (VERSION.SDK_INT >= 4) {
                        this.f25290e.computeCurrentVelocity(1000, (float) this.f25267N);
                    } else {
                        this.f25290e.computeCurrentVelocity(1000);
                    }
                    this.f25284ah = false;
                    int yVelocity = (int) this.f25290e.getYVelocity();
                    if (Math.abs(yVelocity) > this.f25266M) {
                        this.f25289d.fling(0, this.f25272S, 0, yVelocity, 0, 0, this.f25264K, this.f25265L);
                        this.f25289d.setFinalY(this.f25289d.getFinalY() + m27467d(this.f25289d.getFinalY() % this.f25259F));
                    } else {
                        this.f25289d.startScroll(0, this.f25272S, 0, m27467d(this.f25272S % this.f25259F));
                    }
                    if (!this.f25281ae) {
                        if (this.f25289d.getFinalY() > this.f25265L) {
                            this.f25289d.setFinalY(this.f25265L);
                        } else if (this.f25289d.getFinalY() < this.f25264K) {
                            this.f25289d.setFinalY(this.f25264K);
                        }
                    }
                    this.f25287b.post(this);
                    if (this.f25290e != null) {
                        this.f25290e.recycle();
                        this.f25290e = null;
                        break;
                    }
                }
                break;
            case 2:
                if (Math.abs(((float) this.f25275V) - motionEvent.getY()) >= ((float) this.f25276W)) {
                    this.f25283ag = false;
                    this.f25290e.addMovement(motionEvent);
                    float y = motionEvent.getY() - ((float) this.f25274U);
                    if (Math.abs(y) >= 1.0f) {
                        this.f25272S = (int) (((float) this.f25272S) + y);
                        this.f25274U = (int) motionEvent.getY();
                        invalidate();
                        break;
                    }
                } else {
                    this.f25283ag = true;
                    break;
                }
                break;
            case 3:
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                if (this.f25290e != null) {
                    this.f25290e.recycle();
                    this.f25290e = null;
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
        int i3 = ((-this.f25272S) / this.f25259F) - this.f25305t;
        int i4 = this.f25262I + i3;
        int i5 = -this.f25305t;
        while (i4 < this.f25262I + i3 + this.f25304s) {
            String str = "";
            if (this.f25281ae) {
                int size = i4 % this.f25301p.size();
                if (size < 0) {
                    size += this.f25301p.size();
                }
                str = String.valueOf(this.f25301p.get(size));
            } else if (m27462a(i4)) {
                str = String.valueOf(this.f25301p.get(i4));
            }
            this.f25288c.setColor(this.f25308w);
            this.f25288c.setTextSize((float) this.f25310y);
            this.f25288c.setStyle(Style.FILL);
            int i6 = this.f25271R + (this.f25259F * i5) + (this.f25272S % this.f25259F);
            if (this.f25282af) {
                float abs = (((float) ((this.f25271R - Math.abs(this.f25271R - i6)) - this.f25294i.top)) * 1.0f) / ((float) (this.f25271R - this.f25294i.top));
                if (i6 > this.f25271R) {
                    i2 = 1;
                } else if (i6 < this.f25271R) {
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
                i = m27463b(i7);
                int i8 = this.f25268O;
                switch (this.f25258E) {
                    case 1:
                        i8 = this.f25294i.left;
                        break;
                    case 2:
                        i8 = this.f25294i.right;
                        break;
                }
                int i9 = this.f25269P - i;
                this.f25298m.save();
                this.f25298m.rotateX(f);
                this.f25298m.getMatrix(this.f25299n);
                this.f25298m.restore();
                float f2 = (float) (-i8);
                float f3 = (float) (-i9);
                this.f25299n.preTranslate(f2, f3);
                float f4 = (float) i8;
                float f5 = (float) i9;
                this.f25299n.postTranslate(f4, f5);
                this.f25298m.save();
                this.f25298m.translate(0.0f, 0.0f, (float) m27465c(i7));
                this.f25298m.getMatrix(this.f25300o);
                this.f25298m.restore();
                this.f25300o.preTranslate(f2, f3);
                this.f25300o.postTranslate(f4, f5);
                this.f25299n.postConcat(this.f25300o);
            } else {
                i = 0;
            }
            if (this.f25280ad) {
                int abs2 = (int) (((((float) (this.f25271R - Math.abs(this.f25271R - i6))) * 1.0f) / ((float) this.f25271R)) * 255.0f);
                if (abs2 < 0) {
                    abs2 = 0;
                }
                this.f25288c.setAlpha(abs2);
            }
            if (this.f25282af) {
                i6 = this.f25271R - i;
            }
            if (this.f25309x != -1) {
                canvas.save();
                if (this.f25282af) {
                    canvas2.concat(this.f25299n);
                }
                if (i6 < this.f25297l.bottom) {
                    RectF rectF = new RectF(this.f25297l);
                    rectF.bottom = rectF.top;
                    rectF.top = 0.0f;
                    canvas2.clipRect(rectF);
                } else {
                    RectF rectF2 = new RectF(this.f25297l);
                    rectF2.top = rectF2.bottom;
                    rectF2.bottom = (float) getBottom();
                    canvas2.clipRect(rectF2);
                }
                canvas2.clipRect(this.f25297l, Op.DIFFERENCE);
                float f6 = (float) i6;
                canvas2.drawText(str, (float) this.f25270Q, f6, this.f25288c);
                canvas.restore();
                this.f25288c.setColor(this.f25309x);
                this.f25288c.setTextSize((float) this.f25311z);
                canvas.save();
                if (this.f25282af) {
                    canvas2.concat(this.f25299n);
                }
                canvas2.clipRect(this.f25297l);
                i6 = (int) (f6 + (((this.f25288c.descent() - this.f25288c.ascent()) / 2.0f) - ((float) (this.f25307v / 2))));
            } else {
                canvas.save();
                canvas2.clipRect(this.f25294i);
                if (this.f25282af) {
                    canvas2.concat(this.f25299n);
                }
            }
            canvas2.drawText(str, (float) this.f25270Q, (float) i6, this.f25288c);
            canvas.restore();
            if (this.f25286aj) {
                canvas.save();
                canvas2.clipRect(this.f25294i);
                this.f25288c.setColor(-1166541);
                int i10 = this.f25269P + (this.f25259F * i5);
                float f7 = (float) i10;
                canvas.drawLine((float) this.f25294i.left, f7, (float) this.f25294i.right, f7, this.f25288c);
                this.f25288c.setColor(-13421586);
                this.f25288c.setStyle(Style.STROKE);
                int i11 = i10 - this.f25260G;
                canvas.drawRect((float) this.f25294i.left, (float) i11, (float) this.f25294i.right, (float) (i11 + this.f25259F), this.f25288c);
                canvas.restore();
            }
            i4++;
            i5++;
        }
        if (this.f25279ac) {
            this.f25288c.setColor(this.f25256C);
            this.f25288c.setStyle(Style.FILL);
            canvas2.drawRect(this.f25297l, this.f25288c);
        }
        if (this.f25278ab) {
            this.f25288c.setColor(this.f25255B);
            this.f25288c.setStyle(Style.FILL);
            canvas2.drawRect(this.f25295j, this.f25288c);
            canvas2.drawRect(this.f25296k, this.f25288c);
        }
        if (this.f25286aj) {
            this.f25288c.setColor(1144254003);
            this.f25288c.setStyle(Style.FILL);
            canvas.drawRect(0.0f, 0.0f, (float) getPaddingLeft(), (float) getHeight(), this.f25288c);
            canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getPaddingTop(), this.f25288c);
            canvas.drawRect((float) (getWidth() - getPaddingRight()), 0.0f, (float) getWidth(), (float) getHeight(), this.f25288c);
            canvas.drawRect(0.0f, (float) (getHeight() - getPaddingBottom()), (float) getWidth(), (float) getHeight(), this.f25288c);
        }
    }

    /* renamed from: a */
    public final void mo22642a(int i, boolean z) {
        this.f25291f = false;
        if (!z || !this.f25289d.isFinished()) {
            if (!this.f25289d.isFinished()) {
                this.f25289d.abortAnimation();
            }
            int max = Math.max(Math.min(i, this.f25301p.size() - 1), 0);
            this.f25262I = max;
            this.f25263J = max;
            this.f25272S = 0;
            m27469e();
            requestLayout();
            invalidate();
            return;
        }
        int size = getData().size();
        int i2 = i - this.f25263J;
        if (i2 != 0) {
            if (this.f25281ae && Math.abs(i2) > size / 2) {
                if (i2 > 0) {
                    size = -size;
                }
                i2 += size;
            }
            this.f25289d.startScroll(0, this.f25289d.getCurrY(), 0, (-i2) * this.f25259F);
            this.f25287b.post(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int i3 = this.f25306u;
        int i4 = (this.f25307v * this.f25303r) + (this.f25257D * (this.f25303r - 1));
        if (this.f25282af) {
            double d = (double) (i4 * 2);
            Double.isNaN(d);
            i4 = (int) (d / 3.141592653589793d);
        }
        setMeasuredDimension(m27460a(mode, size, i3 + getPaddingLeft() + getPaddingRight()), m27460a(mode2, size2, i4 + getPaddingTop() + getPaddingBottom()));
    }

    public WheelPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25287b = new Handler();
        this.f25266M = 50;
        this.f25267N = 8000;
        this.f25276W = 8;
        this.f25286aj = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ttlive_WheelPicker);
        int resourceId = obtainStyledAttributes.getResourceId(7, 0);
        if (resourceId == 0) {
            this.f25301p = new ArrayList();
        } else {
            this.f25301p = Arrays.asList(getResources().getStringArray(resourceId));
        }
        this.f25303r = obtainStyledAttributes.getInt(20, 7);
        this.f25262I = obtainStyledAttributes.getInt(17, 0);
        this.f25277aa = obtainStyledAttributes.getBoolean(16, false);
        this.f25273T = obtainStyledAttributes.getInt(15, -1);
        this.f25302q = obtainStyledAttributes.getString(14);
        this.f25309x = obtainStyledAttributes.getColor(18, -1);
        this.f25308w = obtainStyledAttributes.getColor(12, -7829368);
        this.f25281ae = obtainStyledAttributes.getBoolean(6, false);
        this.f25278ab = obtainStyledAttributes.getBoolean(8, false);
        this.f25255B = obtainStyledAttributes.getColor(9, -2105377);
        this.f25279ac = obtainStyledAttributes.getBoolean(3, false);
        this.f25256C = obtainStyledAttributes.getColor(4, -1996488705);
        this.f25280ad = obtainStyledAttributes.getBoolean(2, false);
        this.f25282af = obtainStyledAttributes.getBoolean(5, false);
        this.f25258E = obtainStyledAttributes.getInt(1, 0);
        this.f25285ai = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        m27461a();
        this.f25288c = new Paint(69);
        this.f25288c.setTextSize((float) this.f25310y);
        if (this.f25285ai != null) {
            setTypeface(Typeface.createFromAsset(context.getAssets(), this.f25285ai));
        }
        m27466c();
        m27464b();
        this.f25289d = new Scroller(getContext());
        if (VERSION.SDK_INT >= 4) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            this.f25266M = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f25267N = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f25276W = viewConfiguration.getScaledTouchSlop();
        }
        this.f25294i = new Rect();
        this.f25295j = new Rect();
        this.f25296k = new Rect();
        this.f25297l = new Rect();
        this.f25298m = new Camera();
        this.f25299n = new Matrix();
        this.f25300o = new Matrix();
    }

    /* renamed from: a */
    private static int m27460a(int i, int i2, int i3) {
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
        this.f25294i.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.f25268O = this.f25294i.centerX();
        this.f25269P = this.f25294i.centerY();
        m27468d();
        this.f25261H = this.f25294i.height() / 2;
        this.f25259F = this.f25294i.height() / this.f25303r;
        this.f25260G = this.f25259F / 2;
        m27469e();
        m27470f();
        m27471g();
    }
}
