package com.bytedance.android.livesdk.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.utility.R$styleable;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class AdjustPercentBar extends View {

    /* renamed from: L */
    static Drawable f24899L;

    /* renamed from: M */
    static Drawable f24900M;

    /* renamed from: A */
    String f24901A;

    /* renamed from: B */
    float f24902B;

    /* renamed from: C */
    boolean f24903C;

    /* renamed from: D */
    boolean f24904D;

    /* renamed from: E */
    Context f24905E;

    /* renamed from: F */
    boolean f24906F;

    /* renamed from: G */
    Rect f24907G;

    /* renamed from: H */
    public String f24908H;

    /* renamed from: I */
    public int f24909I;

    /* renamed from: J */
    boolean f24910J;

    /* renamed from: K */
    boolean f24911K;

    /* renamed from: N */
    boolean f24912N;

    /* renamed from: O */
    ValueAnimator f24913O;

    /* renamed from: P */
    boolean f24914P;

    /* renamed from: Q */
    public int f24915Q;

    /* renamed from: R */
    public String f24916R;

    /* renamed from: S */
    public ValueAnimator f24917S;

    /* renamed from: T */
    public float f24918T;

    /* renamed from: U */
    public Handler f24919U;

    /* renamed from: V */
    public Runnable f24920V;

    /* renamed from: W */
    private C9189b f24921W;

    /* renamed from: a */
    int f24922a;

    /* renamed from: aa */
    private int f24923aa;

    /* renamed from: ab */
    private float f24924ab;

    /* renamed from: ac */
    private float f24925ac;

    /* renamed from: ad */
    private float f24926ad;

    /* renamed from: ae */
    private float f24927ae;

    /* renamed from: af */
    private int f24928af;

    /* renamed from: ag */
    private int f24929ag;

    /* renamed from: ah */
    private int f24930ah;

    /* renamed from: ai */
    private int f24931ai;

    /* renamed from: aj */
    private Runnable f24932aj;

    /* renamed from: ak */
    private int f24933ak;

    /* renamed from: al */
    private boolean f24934al;

    /* renamed from: b */
    int f24935b;

    /* renamed from: c */
    int f24936c;

    /* renamed from: d */
    int f24937d;

    /* renamed from: e */
    int f24938e;

    /* renamed from: f */
    int f24939f;

    /* renamed from: g */
    int f24940g;

    /* renamed from: h */
    int f24941h;

    /* renamed from: i */
    int f24942i;

    /* renamed from: j */
    int f24943j;

    /* renamed from: k */
    int f24944k;

    /* renamed from: l */
    int f24945l;

    /* renamed from: m */
    int f24946m;

    /* renamed from: n */
    int f24947n;

    /* renamed from: o */
    int f24948o;

    /* renamed from: p */
    float f24949p;

    /* renamed from: q */
    int f24950q;

    /* renamed from: r */
    int f24951r;

    /* renamed from: s */
    Paint f24952s;

    /* renamed from: t */
    Paint f24953t;

    /* renamed from: u */
    Paint f24954u;

    /* renamed from: v */
    Paint f24955v;

    /* renamed from: w */
    Paint f24956w;

    /* renamed from: x */
    Paint f24957x;

    /* renamed from: y */
    int f24958y;

    /* renamed from: z */
    int f24959z;

    /* renamed from: com.bytedance.android.livesdk.widget.AdjustPercentBar$a */
    class C9186a implements Runnable {
        public final void run() {
            if (AdjustPercentBar.this.f24914P) {
                if (AdjustPercentBar.this.f24913O != null) {
                    AdjustPercentBar.this.f24913O.removeAllListeners();
                    AdjustPercentBar.this.f24913O.cancel();
                }
                AdjustPercentBar.this.f24957x.setShadowLayer(0.0f, 0.0f, 0.0f, AdjustPercentBar.this.f24945l);
                AdjustPercentBar.this.f24913O = ValueAnimator.ofFloat(new float[]{1.0f});
                AdjustPercentBar.this.f24913O.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        AdjustPercentBar.this.setTextAlpha((int) ((1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 255.0f));
                        AdjustPercentBar.this.invalidate();
                    }
                });
                AdjustPercentBar.this.f24913O.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                    }
                });
                AdjustPercentBar.this.f24913O.setDuration(300);
                AdjustPercentBar.this.f24913O.start();
                AdjustPercentBar.this.f24914P = false;
            }
        }

        private C9186a() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.AdjustPercentBar$b */
    public interface C9189b {
        /* renamed from: a */
        void mo9236a(int i);
    }

    public int getPercent() {
        return this.f24958y;
    }

    /* renamed from: a */
    private boolean m27326a(float f, float f2) {
        double abs = (double) Math.abs(f - (this.f24927ae + (((float) (this.f24958y - this.f24931ai)) * this.f24949p)));
        double d = (double) this.f24937d;
        Double.isNaN(d);
        if (abs <= d * 2.5d) {
            double abs2 = (double) Math.abs(f2 - ((float) this.f24948o));
            double d2 = (double) this.f24937d;
            Double.isNaN(d2);
            if (abs2 <= d2 * 2.5d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m27328b() {
        if (this.f24931ai == 0 && (this.f24909I == 0 || this.f24909I == 100)) {
            return false;
        }
        return true;
    }

    public void buildDrawingCache() {
        if (VERSION.SDK_INT >= 23 || ((long) getWidth()) * ((long) getHeight()) * 4 < 838860800) {
            super.buildDrawingCache();
        }
    }

    /* renamed from: a */
    private void m27321a() {
        this.f24947n = this.f24922a / 2;
        this.f24948o = C3358ac.m12510a(32.0f);
        this.f24949p = (((float) this.f24922a) - (this.f24927ae * 2.0f)) / ((float) this.f24929ag);
        this.f24906F = true;
        invalidate();
    }

    /* renamed from: c */
    private void m27329c() {
        float f;
        removeCallbacks(this.f24932aj);
        if (!this.f24914P && !TextUtils.isEmpty(this.f24901A)) {
            if (this.f24913O != null) {
                this.f24913O.removeAllListeners();
                this.f24913O.cancel();
            }
            Paint paint = this.f24957x;
            if (this.f24912N) {
                f = 0.0f;
            } else {
                f = 3.0f;
            }
            paint.setShadowLayer((float) C3358ac.m12510a(f), 0.0f, 0.0f, this.f24945l);
            setTextAlpha(NormalGiftView.ALPHA_255);
            this.f24914P = true;
            invalidate();
        }
    }

    public void setIsTwoWayMode(boolean z) {
        this.f24934al = z;
    }

    public void setLevelAdjustBarTitle(String str) {
        this.f24908H = str;
    }

    public void setTextInCenter(boolean z) {
        this.f24911K = z;
    }

    public AdjustPercentBar(Context context) {
        this(context, null);
    }

    public void setOnLevelChangeListener(final C9189b bVar) {
        this.f24921W = new C9189b() {
            /* renamed from: a */
            public final void mo9236a(int i) {
                AdjustPercentBar.this.f24919U.removeCallbacks(AdjustPercentBar.this.f24920V);
                if (AdjustPercentBar.this.f24916R != null && i == AdjustPercentBar.this.f24909I) {
                    AdjustPercentBar.this.f24919U.postDelayed(AdjustPercentBar.this.f24920V, 100);
                } else if (AdjustPercentBar.this.f24917S != null) {
                    AdjustPercentBar.this.f24917S.cancel();
                    AdjustPercentBar.this.f24917S = null;
                }
                bVar.mo9236a(i);
            }
        };
    }

    public void setPercent(int i) {
        this.f24958y = i;
        invalidate();
    }

    public void setTextAlpha(int i) {
        this.f24933ak = i;
        this.f24957x.setAlpha(i);
        this.f24956w.setAlpha(i);
    }

    /* renamed from: a */
    private int m27320a(int i) {
        int i2;
        if (this.f24928af > 1) {
            i = m27327b(i);
        }
        if (i > this.f24929ag) {
            i2 = this.f24930ah;
        } else if (i <= 0) {
            i2 = this.f24931ai;
        } else {
            i2 = i + this.f24931ai;
        }
        if (!m27328b() || i2 < this.f24909I - 2 || i2 > this.f24909I + 2) {
            return i2;
        }
        return this.f24909I;
    }

    /* renamed from: b */
    private int m27327b(int i) {
        if (((float) (i % this.f24928af)) >= ((float) this.f24928af) / 2.0f) {
            return ((i / this.f24928af) + 1) * this.f24928af;
        }
        return (i / this.f24928af) * this.f24928af;
    }

    public void buildDrawingCache(boolean z) {
        if (VERSION.SDK_INT >= 23 || ((long) getWidth()) * ((long) getHeight()) * 4 < 838860800) {
            super.buildDrawingCache(z);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        String str;
        Paint paint;
        int i;
        Drawable drawable;
        super.onDraw(canvas);
        if (this.f24906F) {
            int i2 = this.f24958y - this.f24931ai;
            float f = (((float) i2) * this.f24949p) + this.f24927ae;
            float f2 = this.f24927ae + (((float) (this.f24909I - this.f24931ai)) * this.f24949p);
            canvas.drawLine(this.f24927ae, (float) this.f24948o, ((float) this.f24922a) - this.f24927ae, (float) this.f24948o, this.f24953t);
            if (this.f24910J) {
                canvas.drawLine(this.f24927ae, (float) this.f24948o, f, (float) this.f24948o, this.f24952s);
            } else {
                canvas.drawLine(f, (float) this.f24948o, f2, (float) this.f24948o, this.f24952s);
            }
            Paint paint2 = this.f24954u;
            int i3 = NormalGiftView.ALPHA_255;
            paint2.setAlpha(NormalGiftView.ALPHA_255);
            this.f24955v.setAlpha(NormalGiftView.ALPHA_255);
            this.f24957x.setAlpha(NormalGiftView.ALPHA_255);
            this.f24956w.setAlpha(NormalGiftView.ALPHA_255);
            canvas.drawCircle(f, (float) this.f24948o, this.f24925ac, this.f24954u);
            if (this.f24909I >= this.f24931ai && this.f24909I <= this.f24930ah && m27328b()) {
                canvas.drawCircle(f2, (float) this.f24948o, (float) this.f24938e, this.f24955v);
            }
            int i4 = this.f24915Q;
            if (i4 == Integer.MIN_VALUE) {
                i4 = this.f24958y;
            }
            if (this.f24918T == 0.0f) {
                str = String.valueOf(i4);
            } else if (this.f24916R == null) {
                str = "";
            } else {
                str = this.f24916R;
            }
            if (TextUtils.isEmpty(this.f24908H) || TextUtils.isEmpty(str)) {
                this.f24901A = str;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f24908H);
                sb.append(" ");
                sb.append(str);
                this.f24901A = sb.toString();
            }
            if (!TextUtils.isEmpty(this.f24901A)) {
                if (this.f24911K) {
                    paint = this.f24957x;
                } else {
                    paint = this.f24956w;
                }
                this.f24956w.getTextBounds(this.f24901A, 0, this.f24901A.length(), this.f24907G);
                int width = this.f24907G.width();
                int a = C3358ac.m12510a(14.0f);
                if (this.f24911K) {
                    i = this.f24947n;
                } else {
                    i = (int) f;
                }
                int a2 = (i - (width / 2)) - C3358ac.m12510a(1.0f);
                int i5 = this.f24948o - a;
                if (this.f24912N) {
                    drawable = f24900M;
                } else {
                    drawable = f24899L;
                }
                if (!this.f24911K && drawable != null) {
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int max = Math.max(width, intrinsicWidth);
                    if (this.f24918T == 1.0f) {
                        i3 = this.f24933ak;
                        max += intrinsicWidth;
                    } else if (this.f24918T > 0.0f) {
                        float f3 = (float) intrinsicWidth;
                        max = (int) (((float) ((int) ((((float) (max - intrinsicWidth)) * this.f24918T) + f3))) + (f3 * this.f24918T));
                    } else {
                        i3 = this.f24933ak;
                    }
                    float f4 = ((float) i) - (((float) max) / 2.0f);
                    float a3 = (float) (this.f24948o - C3358ac.m12510a(57.0f));
                    drawable.setAlpha(i3);
                    drawable.setBounds(0, 0, max, drawable.getIntrinsicHeight());
                    canvas.save();
                    canvas.translate(f4, a3);
                    drawable.draw(canvas);
                    canvas.restore();
                }
                if (this.f24918T <= 0.0f || this.f24918T >= 1.0f) {
                    canvas.drawText(this.f24901A, (float) a2, (float) i5, paint);
                    return;
                }
                int alpha = paint.getAlpha();
                paint.setAlpha((int) (this.f24918T * 255.0f));
                canvas.drawText(this.f24901A, (float) a2, (float) i5, paint);
                paint.setAlpha(alpha);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f24904D) {
            return true;
        }
        if (motionEvent.getAction() == 0 && (motionEvent.getX() < this.f24927ae - ((float) this.f24939f) || motionEvent.getX() > ((float) C3358ac.m12523c()) - (this.f24927ae - ((float) this.f24939f)))) {
            return false;
        }
        if (motionEvent.getAction() == 0 && Math.abs(motionEvent.getY() - ((float) this.f24948o)) > ((float) (this.f24935b - this.f24948o))) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                m27329c();
                this.f24959z = this.f24958y;
                this.f24903C = !m27326a(motionEvent.getX(), motionEvent.getY());
                this.f24902B = motionEvent.getX();
                int a = m27320a((int) ((this.f24902B - this.f24927ae) / this.f24949p));
                if (this.f24958y != a) {
                    this.f24958y = a;
                    this.f24959z = a;
                    if (this.f24921W != null) {
                        this.f24921W.mo9236a(this.f24958y);
                    }
                    invalidate();
                    break;
                }
                break;
            case 1:
                float x = motionEvent.getX();
                if (this.f24903C && Math.abs(x - this.f24902B) <= ((float) C3358ac.m12510a(3.0f))) {
                    int a2 = m27320a((int) ((x - this.f24927ae) / this.f24949p));
                    if (this.f24921W != null) {
                        this.f24958y = a2;
                        this.f24921W.mo9236a(a2);
                    }
                    m27322a(this.f24958y, a2);
                    break;
                }
            case 2:
                m27329c();
                int a3 = m27320a((this.f24959z - this.f24931ai) + ((int) ((motionEvent.getX() - this.f24902B) / this.f24949p)));
                if (!(this.f24921W == null || this.f24958y == a3)) {
                    this.f24958y = a3;
                    this.f24921W.mo9236a(this.f24958y);
                }
                invalidate();
                break;
        }
        return true;
    }

    public AdjustPercentBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m27322a(final int i, final int i2) {
        this.f24904D = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setTarget(this);
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                AdjustPercentBar.this.f24958y = (int) (((float) i) + (((float) (i2 - i)) * floatValue));
                AdjustPercentBar.this.invalidate();
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                AdjustPercentBar.this.f24904D = true;
                super.onAnimationEnd(animator);
            }
        });
        ofFloat.setDuration(50);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.start();
    }

    /* renamed from: a */
    private void m27324a(Context context, AttributeSet attributeSet) {
        this.f24905E = context;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ttlive_AdjustPercentBar);
            String string = obtainStyledAttributes.getString(4);
            if (string == null) {
                string = "";
            }
            this.f24908H = string;
            this.f24923aa = obtainStyledAttributes.getColor(5, -16777216);
            this.f24924ab = obtainStyledAttributes.getDimension(6, (float) C3358ac.m12510a(14.0f));
            this.f24927ae = obtainStyledAttributes.getDimension(0, (float) C3358ac.m12510a(40.0f));
            this.f24925ac = obtainStyledAttributes.getDimension(2, (float) this.f24937d);
            this.f24926ad = obtainStyledAttributes.getDimension(1, (float) this.f24936c);
            this.f24928af = obtainStyledAttributes.getInt(3, this.f24940g);
            obtainStyledAttributes.recycle();
            setLayerType(1, null);
            this.f24941h = C3358ac.m12521b((int) R.color.as5);
            this.f24942i = 1040187391;
            this.f24943j = C3358ac.m12521b((int) R.color.ad2);
            this.f24944k = C3358ac.m12521b((int) R.color.am9);
            this.f24945l = 1073741824;
            this.f24946m = C3358ac.m12521b((int) R.color.ac4);
            this.f24950q = C3358ac.m12512a("#ff4e33", C3358ac.m12521b((int) R.color.as5));
            this.f24951r = C3358ac.m12521b((int) R.color.as5);
            this.f24952s = new Paint();
            this.f24952s.setStyle(Style.FILL);
            this.f24952s.setStrokeWidth(this.f24926ad);
            this.f24952s.setStrokeCap(Cap.ROUND);
            this.f24952s.setAntiAlias(true);
            this.f24953t = new Paint();
            this.f24953t.setStyle(Style.FILL);
            this.f24953t.setStrokeWidth(this.f24926ad);
            this.f24953t.setStrokeCap(Cap.ROUND);
            this.f24953t.setAntiAlias(true);
            this.f24954u = new Paint();
            this.f24954u.setStyle(Style.FILL);
            this.f24954u.setAntiAlias(true);
            this.f24955v = new Paint();
            this.f24955v.setStyle(Style.FILL);
            this.f24955v.setAntiAlias(true);
            this.f24956w = new Paint();
            this.f24956w.setTextSize(this.f24924ab);
            this.f24956w.setAntiAlias(true);
            this.f24957x = new Paint();
            this.f24957x.setTextSize(this.f24924ab);
            this.f24957x.setAntiAlias(true);
            m27325a(false, true);
        }
    }

    /* renamed from: a */
    private void m27325a(boolean z, boolean z2) {
        this.f24952s.setColor(this.f24941h);
        this.f24952s.setShadowLayer((float) C3358ac.m12510a(1.0f), 0.0f, 0.0f, this.f24945l);
        this.f24953t.setColor(this.f24942i);
        this.f24953t.setShadowLayer((float) C3358ac.m12510a(1.0f), 0.0f, 0.0f, this.f24945l);
        this.f24954u.setColor(this.f24950q);
        this.f24954u.setShadowLayer((float) C3358ac.m12510a(3.0f), 0.0f, 0.0f, this.f24945l);
        this.f24955v.setColor(this.f24941h);
        this.f24956w.setColor(this.f24951r);
        this.f24957x.setColor(this.f24941h);
        setTextAlpha(this.f24933ak);
        this.f24912N = false;
        if (this.f24912N && f24900M == null) {
            f24900M = getResources().getDrawable(R.drawable.bvq);
        }
        if (!this.f24912N && f24899L == null) {
            f24899L = getResources().getDrawable(R.drawable.bvq);
        }
        invalidate();
    }

    public AdjustPercentBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24936c = C3358ac.m12510a(4.0f);
        this.f24937d = C3358ac.m12510a(9.0f);
        this.f24938e = C3358ac.m12510a(2.0f);
        this.f24939f = C3358ac.m12510a(10.0f);
        this.f24940g = 1;
        this.f24904D = true;
        this.f24906F = false;
        this.f24907G = new Rect();
        this.f24908H = null;
        this.f24923aa = 0;
        this.f24924ab = 0.0f;
        this.f24925ac = 0.0f;
        this.f24926ad = 0.0f;
        this.f24927ae = (float) C3358ac.m12510a(40.0f);
        this.f24910J = true;
        this.f24911K = false;
        this.f24914P = true;
        this.f24915Q = Integer.MIN_VALUE;
        this.f24932aj = new C9186a();
        this.f24933ak = 0;
        this.f24918T = 0.1f;
        this.f24919U = new Handler(Looper.getMainLooper());
        this.f24920V = new Runnable() {
            public final void run() {
            }
        };
        m27324a(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo22390a(int i, int i2, int i3, boolean z) {
        m27323a(i, i2, 0, null, z);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f24935b != getMeasuredHeight() || this.f24922a != getMeasuredWidth()) {
            this.f24922a = getMeasuredWidth();
            this.f24935b = getMeasuredHeight();
            m27321a();
        }
    }

    /* renamed from: a */
    private void m27323a(int i, int i2, int i3, String str, boolean z) {
        this.f24930ah = i;
        this.f24931ai = i2;
        if (i3 > this.f24930ah || i3 < this.f24931ai) {
            this.f24909I = this.f24930ah;
        } else {
            this.f24909I = i3;
        }
        this.f24929ag = this.f24930ah - this.f24931ai;
        this.f24910J = z;
        if (this.f24922a > 0 && this.f24935b > 0) {
            m27321a();
        }
        invalidate();
        this.f24916R = null;
        if (this.f24917S != null) {
            this.f24917S.cancel();
            this.f24917S = null;
        }
        this.f24918T = 0.0f;
    }
}
