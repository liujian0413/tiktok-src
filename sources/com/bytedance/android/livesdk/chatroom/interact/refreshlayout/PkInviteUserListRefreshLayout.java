package com.bytedance.android.livesdk.chatroom.interact.refreshlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0978j;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;

public class PkInviteUserListRefreshLayout extends ViewGroup {

    /* renamed from: m */
    private static final String f13740m = SwipeRefreshLayout.class.getSimpleName();

    /* renamed from: v */
    private static final int[] f13741v = {16842766};

    /* renamed from: A */
    private final Runnable f13742A;

    /* renamed from: B */
    private final Runnable f13743B;

    /* renamed from: C */
    private final Runnable f13744C;

    /* renamed from: a */
    public View f13745a;

    /* renamed from: b */
    public int f13746b;

    /* renamed from: c */
    public C4833b f13747c;

    /* renamed from: d */
    public int f13748d;

    /* renamed from: e */
    public boolean f13749e;

    /* renamed from: f */
    public int f13750f;

    /* renamed from: g */
    public boolean f13751g;

    /* renamed from: h */
    public int f13752h;

    /* renamed from: i */
    public C4834c f13753i;

    /* renamed from: j */
    public boolean f13754j;

    /* renamed from: k */
    public final AnimationListener f13755k;

    /* renamed from: l */
    public final AnimationListener f13756l;

    /* renamed from: n */
    private int f13757n;

    /* renamed from: o */
    private float f13758o;

    /* renamed from: p */
    private int f13759p;

    /* renamed from: q */
    private float f13760q;

    /* renamed from: r */
    private float f13761r;

    /* renamed from: s */
    private boolean f13762s;

    /* renamed from: t */
    private int f13763t;

    /* renamed from: u */
    private final DecelerateInterpolator f13764u;

    /* renamed from: w */
    private View f13765w;

    /* renamed from: x */
    private boolean f13766x;

    /* renamed from: y */
    private final Animation f13767y;

    /* renamed from: z */
    private final Animation f13768z;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.refreshlayout.PkInviteUserListRefreshLayout$a */
    class C4832a implements AnimationListener {
        public void onAnimationEnd(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }

        private C4832a() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.refreshlayout.PkInviteUserListRefreshLayout$b */
    public interface C4833b {
        /* renamed from: a */
        void mo12762a();

        /* renamed from: b */
        void mo12763b();

        /* renamed from: c */
        void mo12764c();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.refreshlayout.PkInviteUserListRefreshLayout$c */
    enum C4834c {
        NORMAL,
        LOOSEN,
        REFRESHING
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
    }

    /* renamed from: a */
    public final void mo12785a() {
        this.f13742A.run();
    }

    /* renamed from: e */
    private void m15852e() {
        removeCallbacks(this.f13744C);
        postDelayed(this.f13744C, 300);
    }

    /* renamed from: d */
    private void m15851d() {
        removeCallbacks(this.f13744C);
        this.f13743B.run();
        setRefreshing(true);
        this.f13754j = true;
        if (this.f13747c != null) {
            this.f13747c.mo12763b();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f13744C);
        removeCallbacks(this.f13742A);
        removeCallbacks(this.f13743B);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f13742A);
        removeCallbacks(this.f13744C);
        removeCallbacks(this.f13743B);
    }

    /* renamed from: c */
    private boolean m15850c() {
        if (VERSION.SDK_INT >= 14) {
            return C0991u.m4195a(this.f13745a, -1);
        }
        if (this.f13745a instanceof AbsListView) {
            AbsListView absListView = (AbsListView) this.f13745a;
            if (absListView.getChildCount() <= 0 || (absListView.getFirstVisiblePosition() <= 0 && absListView.getChildAt(0).getTop() >= absListView.getPaddingTop())) {
                return false;
            }
            return true;
        } else if (this.f13745a.getScrollY() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    private void m15849b() {
        if (this.f13745a == null) {
            if (getChildCount() <= 2 || isInEditMode()) {
                this.f13745a = getChildAt(1);
                this.f13745a.setOnTouchListener(new OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return PkInviteUserListRefreshLayout.this.f13754j;
                    }
                });
                this.f13746b = this.f13745a.getTop() + getPaddingTop();
            } else {
                throw new IllegalStateException("SwipeRefreshLayout can only host two children");
            }
        }
        if (this.f13758o == -1.0f && getParent() != null && ((View) getParent()).getHeight() > 0) {
            this.f13758o = (float) ((int) Math.min(((float) ((View) getParent()).getHeight()) * 0.6f, getResources().getDisplayMetrics().density * 120.0f));
        }
    }

    public void setOnRefreshListener(C4833b bVar) {
        this.f13747c = bVar;
    }

    public void setmIsDisable(boolean z) {
        this.f13766x = z;
    }

    public PkInviteUserListRefreshLayout(Context context) {
        this(context, null);
    }

    public void setRefreshing(boolean z) {
        if (this.f13749e != z) {
            m15849b();
            this.f13749e = z;
        }
    }

    /* renamed from: a */
    private void m15847a(int i) {
        int top = this.f13745a.getTop();
        float f = (float) i;
        if (f > this.f13758o) {
            i = ((int) this.f13758o) + (((int) (f - this.f13758o)) / 2);
        } else if (i < 0) {
            i = 0;
        }
        setTargetOffsetTopAndBottom(i - top);
    }

    public void setTargetOffsetTopAndBottom(int i) {
        this.f13745a.offsetTopAndBottom(i);
        this.f13765w.offsetTopAndBottom(i);
        this.f13750f = this.f13745a.getTop();
        invalidate();
    }

    /* renamed from: a */
    private void m15848a(MotionEvent motionEvent) {
        int i;
        int b = C0978j.m4131b(motionEvent);
        if (C0978j.m4132b(motionEvent, b) == this.f13763t) {
            if (b == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f13761r = C0978j.m4134d(motionEvent, i);
            this.f13763t = C0978j.m4132b(motionEvent, i);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f13766x) {
            return false;
        }
        m15849b();
        int a = C0978j.m4129a(motionEvent);
        if (this.f13751g && a == 0) {
            this.f13751g = false;
        }
        if (!isEnabled() || this.f13751g || m15850c()) {
            return false;
        }
        if (a != 6) {
            switch (a) {
                case 0:
                    float y = motionEvent.getY();
                    this.f13760q = y;
                    this.f13761r = y;
                    this.f13763t = C0978j.m4132b(motionEvent, 0);
                    this.f13762s = false;
                    break;
                case 1:
                case 3:
                    this.f13762s = false;
                    this.f13763t = -1;
                    break;
                case 2:
                    if (this.f13763t != -1) {
                        int a2 = C0978j.m4130a(motionEvent, this.f13763t);
                        if (a2 >= 0) {
                            float d = C0978j.m4134d(motionEvent, a2);
                            if (d - this.f13760q > ((float) this.f13757n)) {
                                this.f13761r = d;
                                this.f13762s = true;
                                break;
                            }
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                    break;
            }
        } else {
            m15848a(motionEvent);
        }
        return this.f13762s;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f13766x) {
            return true;
        }
        int a = C0978j.m4129a(motionEvent);
        if (this.f13751g && a == 0) {
            this.f13751g = false;
        }
        if (!isEnabled() || this.f13751g || m15850c()) {
            return false;
        }
        switch (a) {
            case 0:
                float y = motionEvent.getY();
                this.f13760q = y;
                this.f13761r = y;
                this.f13763t = C0978j.m4132b(motionEvent, 0);
                this.f13762s = false;
                break;
            case 1:
                if (this.f13753i == C4834c.LOOSEN) {
                    m15851d();
                } else {
                    m15852e();
                }
                this.f13762s = false;
                this.f13763t = -1;
                return false;
            case 2:
                int a2 = C0978j.m4130a(motionEvent, this.f13763t);
                if (a2 >= 0) {
                    float d = C0978j.m4134d(motionEvent, a2);
                    float f = d - this.f13760q;
                    if (!this.f13762s && f > ((float) this.f13757n)) {
                        this.f13762s = true;
                    }
                    if (this.f13762s) {
                        if (this.f13747c != null) {
                            this.f13747c.mo12762a();
                        }
                        if (f > this.f13758o) {
                            if (this.f13753i == C4834c.NORMAL) {
                                this.f13753i = C4834c.LOOSEN;
                            }
                            m15847a((int) f);
                        } else {
                            if (this.f13753i == C4834c.LOOSEN) {
                                this.f13753i = C4834c.NORMAL;
                            }
                            m15847a((int) f);
                            if (this.f13761r > d && this.f13745a.getTop() == getPaddingTop()) {
                                removeCallbacks(this.f13744C);
                            }
                        }
                        this.f13761r = d;
                        break;
                    }
                } else {
                    return false;
                }
                break;
            case 3:
                m15852e();
                this.f13762s = false;
                this.f13763t = -1;
                return false;
            case 5:
                int b = C0978j.m4131b(motionEvent);
                this.f13761r = C0978j.m4134d(motionEvent, b);
                this.f13763t = C0978j.m4132b(motionEvent, b);
                break;
            case 6:
                m15848a(motionEvent);
                break;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo12787b(int i, AnimationListener animationListener) {
        this.f13748d = i;
        this.f13768z.reset();
        this.f13768z.setDuration((long) this.f13759p);
        this.f13768z.setAnimationListener(animationListener);
        this.f13768z.setInterpolator(this.f13764u);
        this.f13745a.startAnimation(this.f13768z);
    }

    public PkInviteUserListRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13758o = -1.0f;
        this.f13763t = -1;
        this.f13753i = C4834c.NORMAL;
        this.f13767y = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                int i;
                if (PkInviteUserListRefreshLayout.this.f13748d != PkInviteUserListRefreshLayout.this.f13746b) {
                    i = ((int) (((float) (PkInviteUserListRefreshLayout.this.f13746b - PkInviteUserListRefreshLayout.this.f13748d)) * f)) + PkInviteUserListRefreshLayout.this.f13748d;
                } else {
                    i = 0;
                }
                int top = i - PkInviteUserListRefreshLayout.this.f13745a.getTop();
                int top2 = PkInviteUserListRefreshLayout.this.f13745a.getTop();
                if (top + top2 < 0) {
                    top = 0 - top2;
                }
                PkInviteUserListRefreshLayout.this.setTargetOffsetTopAndBottom(top);
            }
        };
        this.f13768z = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                int i;
                if (PkInviteUserListRefreshLayout.this.f13748d != PkInviteUserListRefreshLayout.this.f13752h) {
                    i = ((int) (((float) (PkInviteUserListRefreshLayout.this.f13752h - PkInviteUserListRefreshLayout.this.f13748d)) * f)) + PkInviteUserListRefreshLayout.this.f13748d;
                } else {
                    i = 0;
                }
                int top = i - PkInviteUserListRefreshLayout.this.f13745a.getTop();
                int top2 = PkInviteUserListRefreshLayout.this.f13745a.getTop();
                if (top + top2 < 0) {
                    top = 0 - top2;
                }
                PkInviteUserListRefreshLayout.this.setTargetOffsetTopAndBottom(top);
            }
        };
        this.f13755k = new C4832a() {
            public final void onAnimationEnd(Animation animation) {
                PkInviteUserListRefreshLayout.this.f13750f = 0;
                PkInviteUserListRefreshLayout.this.f13753i = C4834c.NORMAL;
                PkInviteUserListRefreshLayout.this.f13754j = false;
                PkInviteUserListRefreshLayout.this.f13747c.mo12764c();
            }
        };
        this.f13756l = new C4832a() {
            public final void onAnimationEnd(Animation animation) {
                PkInviteUserListRefreshLayout.this.f13750f = PkInviteUserListRefreshLayout.this.f13752h;
                PkInviteUserListRefreshLayout.this.f13753i = C4834c.REFRESHING;
            }
        };
        this.f13742A = new Runnable() {
            public final void run() {
                PkInviteUserListRefreshLayout.this.f13751g = true;
                PkInviteUserListRefreshLayout.this.mo12786a(PkInviteUserListRefreshLayout.this.f13750f + PkInviteUserListRefreshLayout.this.getPaddingTop(), PkInviteUserListRefreshLayout.this.f13755k);
            }
        };
        this.f13743B = new Runnable() {
            public final void run() {
                PkInviteUserListRefreshLayout.this.f13751g = true;
                PkInviteUserListRefreshLayout.this.mo12787b(PkInviteUserListRefreshLayout.this.f13750f + PkInviteUserListRefreshLayout.this.getPaddingTop(), PkInviteUserListRefreshLayout.this.f13756l);
            }
        };
        this.f13744C = new Runnable() {
            public final void run() {
                PkInviteUserListRefreshLayout.this.f13751g = true;
                PkInviteUserListRefreshLayout.this.mo12786a(PkInviteUserListRefreshLayout.this.f13750f + PkInviteUserListRefreshLayout.this.getPaddingTop(), PkInviteUserListRefreshLayout.this.f13755k);
            }
        };
        this.f13757n = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f13759p = getResources().getInteger(17694721);
        this.f13764u = new DecelerateInterpolator(2.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f13741v);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo12786a(int i, AnimationListener animationListener) {
        this.f13748d = i;
        this.f13767y.reset();
        this.f13767y.setDuration((long) this.f13759p);
        this.f13767y.setAnimationListener(animationListener);
        this.f13767y.setInterpolator(this.f13764u);
        this.f13745a.startAnimation(this.f13767y);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getChildCount() <= 1) {
            throw new IllegalStateException("SwipeRefreshLayout must have the headerview and contentview");
        } else if (getChildCount() <= 2 || isInEditMode()) {
            if (this.f13765w == null) {
                this.f13765w = getChildAt(0);
                measureChild(this.f13765w, i, i2);
                this.f13752h = this.f13765w.getMeasuredHeight();
                this.f13758o = (float) this.f13752h;
            }
            getChildAt(1).measure(MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        } else {
            throw new IllegalStateException("SwipeRefreshLayout can only host two children");
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0 && getChildCount() != 1) {
            View childAt = getChildAt(1);
            int paddingLeft = getPaddingLeft();
            int paddingTop = this.f13750f + getPaddingTop();
            int paddingLeft2 = ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft;
            childAt.layout(paddingLeft, paddingTop, paddingLeft2, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
            this.f13765w.layout(paddingLeft, paddingTop - this.f13752h, paddingLeft2, paddingTop);
        }
    }
}
