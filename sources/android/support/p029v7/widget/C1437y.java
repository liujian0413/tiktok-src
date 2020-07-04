package android.support.p029v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1280l;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.MotionEvent;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;

/* renamed from: android.support.v7.widget.y */
final class C1437y extends C1272h implements C1280l {

    /* renamed from: m */
    private static final int[] f5574m = {16842919};

    /* renamed from: n */
    private static final int[] f5575n = new int[0];

    /* renamed from: A */
    private int f5576A;

    /* renamed from: B */
    private final int[] f5577B = new int[2];

    /* renamed from: C */
    private final int[] f5578C = new int[2];

    /* renamed from: D */
    private final Runnable f5579D = new Runnable() {
        public final void run() {
            C1437y.this.mo6630b((int) VETransitionFilterParam.TransitionDuration_DEFAULT);
        }
    };

    /* renamed from: E */
    private final C1281m f5580E = new C1281m() {
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C1437y.this.mo6629a(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    };

    /* renamed from: a */
    public final StateListDrawable f5581a;

    /* renamed from: b */
    public final Drawable f5582b;

    /* renamed from: c */
    public final StateListDrawable f5583c;

    /* renamed from: d */
    public final Drawable f5584d;

    /* renamed from: e */
    int f5585e;

    /* renamed from: f */
    int f5586f;

    /* renamed from: g */
    float f5587g;

    /* renamed from: h */
    int f5588h;

    /* renamed from: i */
    int f5589i;

    /* renamed from: j */
    float f5590j;

    /* renamed from: k */
    final ValueAnimator f5591k = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});

    /* renamed from: l */
    int f5592l = 0;

    /* renamed from: o */
    private final int f5593o;

    /* renamed from: p */
    private final int f5594p;

    /* renamed from: q */
    private final int f5595q;

    /* renamed from: r */
    private final int f5596r;

    /* renamed from: s */
    private final int f5597s;

    /* renamed from: t */
    private final int f5598t;

    /* renamed from: u */
    private int f5599u;

    /* renamed from: v */
    private int f5600v;

    /* renamed from: w */
    private RecyclerView f5601w;

    /* renamed from: x */
    private boolean f5602x;

    /* renamed from: y */
    private boolean f5603y;

    /* renamed from: z */
    private int f5604z;

    /* renamed from: android.support.v7.widget.y$a */
    class C1440a extends AnimatorListenerAdapter {

        /* renamed from: b */
        private boolean f5608b;

        public final void onAnimationCancel(Animator animator) {
            this.f5608b = true;
        }

        C1440a() {
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f5608b) {
                this.f5608b = false;
            } else if (((Float) C1437y.this.f5591k.getAnimatedValue()).floatValue() == 0.0f) {
                C1437y.this.f5592l = 0;
                C1437y.this.mo6628a(0);
            } else {
                C1437y.this.f5592l = 2;
                C1437y.this.mo6627a();
            }
        }
    }

    /* renamed from: android.support.v7.widget.y$b */
    class C1441b implements AnimatorUpdateListener {
        C1441b() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C1437y.this.f5581a.setAlpha(floatValue);
            C1437y.this.f5582b.setAlpha(floatValue);
            C1437y.this.mo6627a();
        }
    }

    /* renamed from: a */
    public final void mo5689a(boolean z) {
    }

    /* renamed from: a */
    public final boolean mo5690a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f5604z == 1) {
            boolean a = m7221a(motionEvent.getX(), motionEvent.getY());
            boolean b = m7225b(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!a && !b) {
                return false;
            }
            if (b) {
                this.f5576A = 1;
                this.f5590j = (float) ((int) motionEvent.getX());
            } else if (a) {
                this.f5576A = 2;
                this.f5587g = (float) ((int) motionEvent.getY());
            }
            mo6628a(2);
        } else if (this.f5604z != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private void m7230f() {
        this.f5601w.removeCallbacks(this.f5579D);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6627a() {
        this.f5601w.invalidate();
    }

    /* renamed from: d */
    private boolean m7228d() {
        if (C0991u.m4220h(this.f5601w) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m7222b() {
        this.f5601w.mo5525a((C1272h) this);
        this.f5601w.mo5527a((C1280l) this);
        this.f5601w.mo5528a(this.f5580E);
    }

    /* renamed from: c */
    private void m7226c() {
        this.f5601w.mo5542b((C1272h) this);
        this.f5601w.mo5544b((C1280l) this);
        this.f5601w.mo5545b(this.f5580E);
        m7230f();
    }

    /* renamed from: g */
    private int[] m7231g() {
        this.f5577B[0] = this.f5594p;
        this.f5577B[1] = this.f5600v - this.f5594p;
        return this.f5577B;
    }

    /* renamed from: h */
    private int[] m7232h() {
        this.f5578C[0] = this.f5594p;
        this.f5578C[1] = this.f5599u - this.f5594p;
        return this.f5578C;
    }

    /* renamed from: e */
    private void m7229e() {
        int i = this.f5592l;
        if (i != 0) {
            if (i == 3) {
                this.f5591k.cancel();
            } else {
                return;
            }
        }
        this.f5592l = 1;
        this.f5591k.setFloatValues(new float[]{((Float) this.f5591k.getAnimatedValue()).floatValue(), 1.0f});
        this.f5591k.setDuration(500);
        this.f5591k.setStartDelay(0);
        this.f5591k.start();
    }

    /* renamed from: c */
    private void m7227c(int i) {
        m7230f();
        this.f5601w.postDelayed(this.f5579D, (long) i);
    }

    /* renamed from: a */
    private void m7220a(RecyclerView recyclerView) {
        if (this.f5601w != recyclerView) {
            if (this.f5601w != null) {
                m7226c();
            }
            this.f5601w = recyclerView;
            if (this.f5601w != null) {
                m7222b();
            }
        }
    }

    /* renamed from: b */
    private void m7224b(Canvas canvas) {
        int i = this.f5600v - this.f5597s;
        int i2 = this.f5589i - (this.f5588h / 2);
        this.f5583c.setBounds(0, 0, this.f5588h, this.f5597s);
        this.f5584d.setBounds(0, 0, this.f5599u, this.f5598t);
        canvas.translate(0.0f, (float) i);
        this.f5584d.draw(canvas);
        canvas.translate((float) i2, 0.0f);
        this.f5583c.draw(canvas);
        canvas.translate((float) (-i2), (float) (-i));
    }

    /* renamed from: a */
    private void m7218a(float f) {
        int[] g = m7231g();
        float max = Math.max((float) g[0], Math.min((float) g[1], f));
        if (Math.abs(((float) this.f5586f) - max) >= 2.0f) {
            int a = m7217a(this.f5587g, max, g, this.f5601w.computeVerticalScrollRange(), this.f5601w.computeVerticalScrollOffset(), this.f5600v);
            if (a != 0) {
                this.f5601w.scrollBy(0, a);
            }
            this.f5587g = max;
        }
    }

    /* renamed from: b */
    private void m7223b(float f) {
        int[] h = m7232h();
        float max = Math.max((float) h[0], Math.min((float) h[1], f));
        if (Math.abs(((float) this.f5589i) - max) >= 2.0f) {
            int a = m7217a(this.f5590j, max, h, this.f5601w.computeHorizontalScrollRange(), this.f5601w.computeHorizontalScrollOffset(), this.f5599u);
            if (a != 0) {
                this.f5601w.scrollBy(a, 0);
            }
            this.f5590j = max;
        }
    }

    /* renamed from: a */
    private void m7219a(Canvas canvas) {
        int i = this.f5599u - this.f5595q;
        int i2 = this.f5586f - (this.f5585e / 2);
        this.f5581a.setBounds(0, 0, this.f5595q, this.f5585e);
        this.f5582b.setBounds(0, 0, this.f5596r, this.f5600v);
        if (m7228d()) {
            this.f5582b.draw(canvas);
            canvas.translate((float) this.f5595q, (float) i2);
            canvas.scale(-1.0f, 1.0f);
            this.f5581a.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate((float) (-this.f5595q), (float) (-i2));
            return;
        }
        canvas.translate((float) i, 0.0f);
        this.f5582b.draw(canvas);
        canvas.translate(0.0f, (float) i2);
        this.f5581a.draw(canvas);
        canvas.translate((float) (-i), (float) (-i2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo6630b(int i) {
        switch (this.f5592l) {
            case 1:
                this.f5591k.cancel();
                break;
            case 2:
                break;
            default:
                return;
        }
        this.f5592l = 3;
        this.f5591k.setFloatValues(new float[]{((Float) this.f5591k.getAnimatedValue()).floatValue(), 0.0f});
        this.f5591k.setDuration(500);
        this.f5591k.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6628a(int i) {
        if (i == 2 && this.f5604z != 2) {
            this.f5581a.setState(f5574m);
            m7230f();
        }
        if (i == 0) {
            mo6627a();
        } else {
            m7229e();
        }
        if (this.f5604z == 2 && i != 2) {
            this.f5581a.setState(f5575n);
            m7227c(1200);
        } else if (i == 1) {
            m7227c(1500);
        }
        this.f5604z = i;
    }

    /* renamed from: b */
    private boolean m7225b(float f, float f2) {
        if (f2 < ((float) (this.f5600v - this.f5597s)) || f < ((float) (this.f5589i - (this.f5588h / 2))) || f > ((float) (this.f5589i + (this.f5588h / 2)))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m7221a(float f, float f2) {
        if (!m7228d() ? f >= ((float) (this.f5599u - this.f5595q)) : f <= ((float) (this.f5595q / 2))) {
            if (f2 >= ((float) (this.f5586f - (this.f5585e / 2))) && f2 <= ((float) (this.f5586f + (this.f5585e / 2)))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo5691b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f5604z != 0) {
            if (motionEvent.getAction() == 0) {
                boolean a = m7221a(motionEvent.getX(), motionEvent.getY());
                boolean b = m7225b(motionEvent.getX(), motionEvent.getY());
                if (a || b) {
                    if (b) {
                        this.f5576A = 1;
                        this.f5590j = (float) ((int) motionEvent.getX());
                    } else if (a) {
                        this.f5576A = 2;
                        this.f5587g = (float) ((int) motionEvent.getY());
                    }
                    mo6628a(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f5604z == 2) {
                this.f5587g = 0.0f;
                this.f5590j = 0.0f;
                mo6628a(1);
                this.f5576A = 0;
            } else {
                if (motionEvent.getAction() == 2 && this.f5604z == 2) {
                    m7229e();
                    if (this.f5576A == 1) {
                        m7223b(motionEvent.getX());
                    }
                    if (this.f5576A == 2) {
                        m7218a(motionEvent.getY());
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6629a(int i, int i2) {
        boolean z;
        boolean z2;
        int computeVerticalScrollRange = this.f5601w.computeVerticalScrollRange();
        int i3 = this.f5600v;
        if (computeVerticalScrollRange - i3 <= 0 || this.f5600v < this.f5593o) {
            z = false;
        } else {
            z = true;
        }
        this.f5602x = z;
        int computeHorizontalScrollRange = this.f5601w.computeHorizontalScrollRange();
        int i4 = this.f5599u;
        if (computeHorizontalScrollRange - i4 <= 0 || this.f5599u < this.f5593o) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f5603y = z2;
        if (this.f5602x || this.f5603y) {
            if (this.f5602x) {
                float f = (float) i3;
                this.f5586f = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f5585e = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f5603y) {
                float f2 = (float) i4;
                this.f5589i = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f5588h = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            if (this.f5604z == 0 || this.f5604z == 1) {
                mo6628a(1);
            }
            return;
        }
        if (this.f5604z != 0) {
            mo6628a(0);
        }
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
        if (this.f5599u == this.f5601w.getWidth() && this.f5600v == this.f5601w.getHeight()) {
            if (this.f5592l != 0) {
                if (this.f5602x) {
                    m7219a(canvas);
                }
                if (this.f5603y) {
                    m7224b(canvas);
                }
            }
            return;
        }
        this.f5599u = this.f5601w.getWidth();
        this.f5600v = this.f5601w.getHeight();
        mo6628a(0);
    }

    /* renamed from: a */
    private static int m7217a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    C1437y(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f5581a = stateListDrawable;
        this.f5582b = drawable;
        this.f5583c = stateListDrawable2;
        this.f5584d = drawable2;
        this.f5595q = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f5596r = Math.max(i, drawable.getIntrinsicWidth());
        this.f5597s = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f5598t = Math.max(i, drawable2.getIntrinsicWidth());
        this.f5593o = i2;
        this.f5594p = i3;
        this.f5581a.setAlpha(NormalGiftView.ALPHA_255);
        this.f5582b.setAlpha(NormalGiftView.ALPHA_255);
        this.f5591k.addListener(new C1440a());
        this.f5591k.addUpdateListener(new C1441b());
        m7220a(recyclerView);
    }
}
