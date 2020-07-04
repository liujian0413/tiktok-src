package com.bytedance.android.live.uikit.refresh;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0978j;
import android.support.p022v4.view.C0991u;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

public class I18nSwipeRefreshLayout extends ViewGroup {

    /* renamed from: m */
    private static final String f10601m = "I18nSwipeRefreshLayout";

    /* renamed from: y */
    private static final int[] f10602y = {16842766};

    /* renamed from: A */
    private Animation f10603A;

    /* renamed from: B */
    private Animation f10604B;

    /* renamed from: C */
    private Animation f10605C;

    /* renamed from: D */
    private Animation f10606D;

    /* renamed from: E */
    private Animation f10607E;

    /* renamed from: F */
    private int f10608F;

    /* renamed from: G */
    private int f10609G;

    /* renamed from: H */
    private AnimationListener f10610H;

    /* renamed from: I */
    private final Animation f10611I;

    /* renamed from: J */
    private final Animation f10612J;

    /* renamed from: a */
    public C3565b f10613a;

    /* renamed from: b */
    public boolean f10614b;

    /* renamed from: c */
    public int f10615c;

    /* renamed from: d */
    public boolean f10616d;

    /* renamed from: e */
    public C3566a f10617e;

    /* renamed from: f */
    protected int f10618f;

    /* renamed from: g */
    public float f10619g;

    /* renamed from: h */
    protected int f10620h;

    /* renamed from: i */
    public C3568b f10621i;

    /* renamed from: j */
    public float f10622j;

    /* renamed from: k */
    public boolean f10623k;

    /* renamed from: l */
    public boolean f10624l;

    /* renamed from: n */
    private View f10625n;

    /* renamed from: o */
    private C3564a f10626o;

    /* renamed from: p */
    private int f10627p;

    /* renamed from: q */
    private float f10628q;

    /* renamed from: r */
    private int f10629r;

    /* renamed from: s */
    private boolean f10630s;

    /* renamed from: t */
    private float f10631t;

    /* renamed from: u */
    private boolean f10632u;

    /* renamed from: v */
    private int f10633v;

    /* renamed from: w */
    private boolean f10634w;

    /* renamed from: x */
    private final DecelerateInterpolator f10635x;

    /* renamed from: z */
    private int f10636z;

    /* renamed from: com.bytedance.android.live.uikit.refresh.I18nSwipeRefreshLayout$a */
    public interface C3564a {
        /* renamed from: a */
        void mo10876a();

        /* renamed from: b */
        void mo10877b();
    }

    /* renamed from: com.bytedance.android.live.uikit.refresh.I18nSwipeRefreshLayout$b */
    public interface C3565b {
        /* renamed from: a */
        void mo10878a();
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
    }

    /* renamed from: a */
    public final void mo10846a(AnimationListener animationListener) {
        this.f10604B = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                I18nSwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
            }
        };
        this.f10604B.setDuration(150);
        this.f10617e.mo10879a(animationListener);
        this.f10617e.clearAnimation();
        this.f10617e.startAnimation(this.f10604B);
    }

    /* renamed from: a */
    public final void mo10845a(int i, boolean z) {
        this.f10617e.bringToFront();
        this.f10617e.offsetTopAndBottom(i);
        this.f10615c = this.f10617e.getTop();
        if (z && VERSION.SDK_INT < 11) {
            invalidate();
        }
    }

    /* renamed from: b */
    private static boolean m13100b() {
        if (VERSION.SDK_INT < 11) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m13101c() {
        this.f10605C = m13092a(this.f10621i.getAlpha(), 76);
    }

    /* renamed from: d */
    private void m13103d() {
        this.f10606D = m13092a(this.f10621i.getAlpha(), (int) NormalGiftView.ALPHA_255);
    }

    /* renamed from: e */
    private void m13104e() {
        if (this.f10625n == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f10617e)) {
                    this.f10625n = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    private boolean m13105f() {
        if (VERSION.SDK_INT >= 14) {
            return C0991u.m4195a(this.f10625n, -1);
        }
        if (this.f10625n instanceof AbsListView) {
            AbsListView absListView = (AbsListView) this.f10625n;
            if (absListView.getChildCount() <= 0 || (absListView.getFirstVisiblePosition() <= 0 && absListView.getChildAt(0).getTop() >= absListView.getPaddingTop())) {
                return false;
            }
            return true;
        } else if (this.f10625n.getScrollY() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private void m13093a() {
        this.f10617e = new C3566a(getContext(), -328966, 20.0f);
        this.f10621i = new C3568b(getContext(), this);
        this.f10621i.mo10891b(-328966);
        this.f10617e.setImageDrawable(this.f10621i);
        this.f10617e.setVisibility(8);
        addView(this.f10617e);
    }

    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f10628q = (float) i;
    }

    public void setOnRefreshListener(C3565b bVar) {
        this.f10613a = bVar;
    }

    public void setStartEndRefreshListener(C3564a aVar) {
        this.f10626o = aVar;
    }

    public I18nSwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public void setColorSchemeColors(int... iArr) {
        m13104e();
        this.f10621i.mo10889a(iArr);
    }

    public void setColorViewAlpha(int i) {
        this.f10617e.getBackground().setAlpha(i);
        this.f10621i.setAlpha(i);
    }

    /* renamed from: a */
    private void m13095a(MotionEvent motionEvent) {
        int i;
        int b = C0978j.m4131b(motionEvent);
        if (C0978j.m4132b(motionEvent, b) == this.f10633v) {
            if (b == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f10633v = C0978j.m4132b(motionEvent, i);
        }
    }

    public void setAnimationProgress(float f) {
        if (m13100b()) {
            setColorViewAlpha((int) (f * 255.0f));
            return;
        }
        C0991u.m4218g((View) this.f10617e, f);
        C0991u.m4221h((View) this.f10617e, f);
    }

    public void setColorSchemeResources(int... iArr) {
        Resources resources = getResources();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = resources.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setProgressBackgroundColor(int i) {
        this.f10617e.setBackgroundColor(i);
        this.f10621i.mo10891b(getResources().getColor(i));
    }

    public void setRefreshing(boolean z) {
        int i;
        if (!z || this.f10614b == z) {
            m13096a(z, false);
            return;
        }
        this.f10614b = z;
        if (!this.f10624l) {
            i = (int) (this.f10622j + ((float) this.f10620h));
        } else {
            i = (int) this.f10622j;
        }
        mo10845a(i - this.f10615c, true);
        this.f10623k = false;
        m13099b(this.f10610H);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                int i2 = (int) (displayMetrics.density * 56.0f);
                this.f10608F = i2;
                this.f10609G = i2;
            } else {
                int i3 = (int) (displayMetrics.density * 40.0f);
                this.f10608F = i3;
                this.f10609G = i3;
            }
            this.f10617e.setImageDrawable(null);
            this.f10621i.mo10887a(i);
            this.f10617e.setImageDrawable(this.f10621i);
        }
    }

    /* renamed from: b */
    private void m13099b(AnimationListener animationListener) {
        this.f10617e.setVisibility(0);
        if (VERSION.SDK_INT >= 11) {
            this.f10621i.setAlpha(NormalGiftView.ALPHA_255);
        }
        this.f10603A = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                I18nSwipeRefreshLayout.this.setAnimationProgress(f);
            }
        };
        this.f10603A.setDuration((long) this.f10629r);
        if (animationListener != null) {
            this.f10617e.mo10879a(animationListener);
        }
        this.f10617e.clearAnimation();
        this.f10617e.startAnimation(this.f10603A);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m13104e();
        int a = C0978j.m4129a(motionEvent);
        if (this.f10634w && a == 0) {
            this.f10634w = false;
        }
        if (!isEnabled() || this.f10634w || m13105f() || this.f10614b) {
            return false;
        }
        if (a != 6) {
            switch (a) {
                case 0:
                    mo10845a(this.f10620h - this.f10617e.getTop(), true);
                    this.f10633v = C0978j.m4132b(motionEvent, 0);
                    this.f10632u = false;
                    float a2 = m13091a(motionEvent, this.f10633v);
                    if (a2 != -1.0f) {
                        this.f10631t = a2;
                        break;
                    } else {
                        return false;
                    }
                case 1:
                case 3:
                    this.f10632u = false;
                    if (this.f10626o != null) {
                        this.f10626o.mo10877b();
                    }
                    this.f10633v = -1;
                    break;
                case 2:
                    break;
            }
            if (this.f10633v == -1) {
                return false;
            }
            float a3 = m13091a(motionEvent, this.f10633v);
            if (a3 == -1.0f) {
                return false;
            }
            if (a3 - this.f10631t > ((float) this.f10627p) && !this.f10632u) {
                this.f10632u = true;
                if (this.f10626o != null) {
                    this.f10626o.mo10876a();
                }
                this.f10621i.setAlpha(76);
            }
        } else {
            m13095a(motionEvent);
        }
        return this.f10632u;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        int a = C0978j.m4129a(motionEvent);
        if (this.f10634w && a == 0) {
            this.f10634w = false;
        }
        if (!isEnabled() || this.f10634w || m13105f()) {
            return false;
        }
        switch (a) {
            case 0:
                this.f10633v = C0978j.m4132b(motionEvent, 0);
                this.f10632u = false;
                break;
            case 1:
            case 3:
                if (this.f10633v == -1) {
                    return false;
                }
                try {
                    float d = (C0978j.m4134d(motionEvent, C0978j.m4130a(motionEvent, this.f10633v)) - this.f10631t) * 0.5f;
                    this.f10632u = false;
                    if (d > this.f10628q) {
                        m13096a(true, true);
                    } else {
                        this.f10614b = false;
                        this.f10621i.mo10886a(0.0f, 0.0f);
                        C35605 r15 = null;
                        if (!this.f10616d) {
                            r15 = new AnimationListener() {
                                public final void onAnimationRepeat(Animation animation) {
                                }

                                public final void onAnimationStart(Animation animation) {
                                }

                                public final void onAnimationEnd(Animation animation) {
                                    if (!I18nSwipeRefreshLayout.this.f10616d) {
                                        I18nSwipeRefreshLayout.this.mo10846a((AnimationListener) null);
                                    }
                                }
                            };
                        }
                        m13098b(this.f10615c, r15);
                        this.f10621i.mo10888a(false);
                        if (this.f10626o != null) {
                            this.f10626o.mo10877b();
                        }
                    }
                    this.f10633v = -1;
                    return false;
                } catch (Exception unused) {
                    return true;
                }
            case 2:
                int a2 = C0978j.m4130a(motionEvent, this.f10633v);
                if (a2 < 0) {
                    return false;
                }
                try {
                    float d2 = (C0978j.m4134d(motionEvent, a2) - this.f10631t) * 0.5f;
                    if (this.f10632u) {
                        this.f10621i.mo10888a(true);
                        float f2 = d2 / this.f10628q;
                        if (f2 >= 0.0f) {
                            float min = Math.min(1.0f, Math.abs(f2));
                            double d3 = (double) min;
                            Double.isNaN(d3);
                            float max = (Math.max((float) (d3 - 0.4d), 0.0f) * 5.0f) / 3.0f;
                            float abs = Math.abs(d2) - this.f10628q;
                            if (this.f10624l) {
                                f = this.f10622j - ((float) this.f10620h);
                            } else {
                                f = this.f10622j;
                            }
                            double max2 = (double) (Math.max(0.0f, Math.min(abs, f * 2.0f) / f) / 4.0f);
                            double pow = Math.pow(max2, 2.0d);
                            Double.isNaN(max2);
                            float f3 = ((float) (max2 - pow)) * 2.0f;
                            int i = this.f10620h + ((int) ((f * min) + (f * f3 * 2.0f)));
                            if (this.f10617e.getVisibility() != 0) {
                                this.f10617e.setVisibility(0);
                            }
                            if (!this.f10616d) {
                                C0991u.m4218g((View) this.f10617e, 1.0f);
                                C0991u.m4221h((View) this.f10617e, 1.0f);
                            }
                            if (d2 < this.f10628q) {
                                if (this.f10616d) {
                                    setAnimationProgress(d2 / this.f10628q);
                                }
                                if (this.f10621i.getAlpha() > 76 && !m13097a(this.f10605C)) {
                                    m13101c();
                                }
                                this.f10621i.mo10886a(0.0f, Math.min(0.8f, max * 0.8f));
                                this.f10621i.mo10885a(Math.min(1.0f, max));
                            } else if (this.f10621i.getAlpha() < 255 && !m13097a(this.f10606D)) {
                                m13103d();
                            }
                            this.f10621i.mo10890b((((max * 0.4f) - 16.0f) + (f3 * 2.0f)) * 0.5f);
                            mo10845a(i - this.f10615c, true);
                            break;
                        } else {
                            return false;
                        }
                    }
                } catch (Exception unused2) {
                    return true;
                }
                break;
            case 5:
                this.f10633v = C0978j.m4132b(motionEvent, C0978j.m4131b(motionEvent));
                break;
            case 6:
                m13095a(motionEvent);
                break;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m13097a(Animation animation) {
        if (animation == null || !animation.hasStarted() || animation.hasEnded()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo10844a(float f) {
        mo10845a((this.f10618f + ((int) (((float) (this.f10620h - this.f10618f)) * f))) - this.f10617e.getTop(), false);
    }

    /* renamed from: a */
    private static float m13091a(MotionEvent motionEvent, int i) {
        int a = C0978j.m4130a(motionEvent, i);
        if (a < 0) {
            return -1.0f;
        }
        return C0978j.m4134d(motionEvent, a);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f10636z < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return this.f10636z;
        }
        if (i2 >= this.f10636z) {
            return i2 + 1;
        }
        return i2;
    }

    /* renamed from: a */
    private Animation m13092a(final int i, final int i2) {
        if (this.f10616d && m13100b()) {
            return null;
        }
        C35594 r0 = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                I18nSwipeRefreshLayout.this.f10621i.setAlpha((int) (((float) i) + (((float) (i2 - i)) * f)));
            }
        };
        r0.setDuration(300);
        this.f10617e.mo10879a(null);
        this.f10617e.clearAnimation();
        this.f10617e.startAnimation(r0);
        return r0;
    }

    /* renamed from: b */
    private void m13098b(int i, AnimationListener animationListener) {
        if (this.f10616d) {
            m13102c(i, animationListener);
            return;
        }
        this.f10618f = i;
        this.f10612J.reset();
        this.f10612J.setDuration(200);
        this.f10612J.setInterpolator(this.f10635x);
        if (animationListener != null) {
            this.f10617e.mo10879a(animationListener);
        }
        this.f10617e.clearAnimation();
        this.f10617e.startAnimation(this.f10612J);
    }

    /* renamed from: c */
    private void m13102c(int i, AnimationListener animationListener) {
        this.f10618f = i;
        if (m13100b()) {
            this.f10619g = (float) this.f10621i.getAlpha();
        } else {
            this.f10619g = C0991u.m4239r(this.f10617e);
        }
        this.f10607E = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                I18nSwipeRefreshLayout.this.setAnimationProgress(I18nSwipeRefreshLayout.this.f10619g + ((-I18nSwipeRefreshLayout.this.f10619g) * f));
                I18nSwipeRefreshLayout.this.mo10844a(f);
            }
        };
        this.f10607E.setDuration(150);
        if (animationListener != null) {
            this.f10617e.mo10879a(animationListener);
        }
        this.f10617e.clearAnimation();
        this.f10617e.startAnimation(this.f10607E);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f10625n == null) {
            m13104e();
        }
        if (this.f10625n != null) {
            this.f10625n.measure(MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f10617e.measure(MeasureSpec.makeMeasureSpec(this.f10608F, 1073741824), MeasureSpec.makeMeasureSpec(this.f10609G, 1073741824));
            if (!this.f10624l && !this.f10630s) {
                this.f10630s = true;
                int i3 = -this.f10617e.getMeasuredHeight();
                this.f10620h = i3;
                this.f10615c = i3;
            }
            this.f10636z = -1;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                if (getChildAt(i4) == this.f10617e) {
                    this.f10636z = i4;
                    return;
                }
            }
        }
    }

    public I18nSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10628q = -1.0f;
        this.f10633v = -1;
        this.f10636z = -1;
        this.f10610H = new AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                if (I18nSwipeRefreshLayout.this.f10614b) {
                    I18nSwipeRefreshLayout.this.f10621i.setAlpha(NormalGiftView.ALPHA_255);
                    I18nSwipeRefreshLayout.this.f10621i.start();
                    if (I18nSwipeRefreshLayout.this.f10623k && I18nSwipeRefreshLayout.this.f10613a != null) {
                        I18nSwipeRefreshLayout.this.f10613a.mo10878a();
                    }
                } else {
                    I18nSwipeRefreshLayout.this.f10621i.stop();
                    I18nSwipeRefreshLayout.this.f10617e.setVisibility(8);
                    I18nSwipeRefreshLayout.this.setColorViewAlpha(NormalGiftView.ALPHA_255);
                    if (I18nSwipeRefreshLayout.this.f10616d) {
                        I18nSwipeRefreshLayout.this.setAnimationProgress(0.0f);
                    } else {
                        I18nSwipeRefreshLayout.this.mo10845a(I18nSwipeRefreshLayout.this.f10620h - I18nSwipeRefreshLayout.this.f10615c, true);
                    }
                }
                I18nSwipeRefreshLayout.this.f10615c = I18nSwipeRefreshLayout.this.f10617e.getTop();
            }
        };
        this.f10611I = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                int i;
                if (!I18nSwipeRefreshLayout.this.f10624l) {
                    i = (int) (I18nSwipeRefreshLayout.this.f10622j - ((float) Math.abs(I18nSwipeRefreshLayout.this.f10620h)));
                } else {
                    i = (int) I18nSwipeRefreshLayout.this.f10622j;
                }
                I18nSwipeRefreshLayout.this.mo10845a((I18nSwipeRefreshLayout.this.f10618f + ((int) (((float) (i - I18nSwipeRefreshLayout.this.f10618f)) * f))) - I18nSwipeRefreshLayout.this.f10617e.getTop(), false);
            }
        };
        this.f10612J = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                I18nSwipeRefreshLayout.this.mo10844a(f);
            }
        };
        this.f10627p = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f10629r = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f10635x = new DecelerateInterpolator(2.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f10602y);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f10608F = (int) (displayMetrics.density * 40.0f);
        this.f10609G = (int) (displayMetrics.density * 40.0f);
        m13093a();
        C0991u.m4194a((ViewGroup) this, true);
        this.f10622j = displayMetrics.density * 64.0f;
        this.f10628q = this.f10622j;
    }

    /* renamed from: a */
    private void m13094a(int i, AnimationListener animationListener) {
        this.f10618f = i;
        this.f10611I.reset();
        this.f10611I.setDuration(200);
        this.f10611I.setInterpolator(this.f10635x);
        if (animationListener != null) {
            this.f10617e.mo10879a(animationListener);
        }
        this.f10617e.clearAnimation();
        this.f10617e.startAnimation(this.f10611I);
    }

    /* renamed from: a */
    private void m13096a(boolean z, boolean z2) {
        if (this.f10614b != z) {
            this.f10623k = z2;
            m13104e();
            this.f10614b = z;
            if (this.f10614b) {
                m13094a(this.f10615c, this.f10610H);
                return;
            }
            mo10846a(this.f10610H);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f10625n == null) {
                m13104e();
            }
            if (this.f10625n != null) {
                View view = this.f10625n;
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f10617e.getMeasuredWidth();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                this.f10617e.layout(i5 - i6, this.f10615c, i5 + i6, this.f10615c + this.f10617e.getMeasuredHeight());
            }
        }
    }
}
