package com.bytedance.android.livesdk.floatwindow;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.android.livesdk.floatwindow.C7849h.C7850a;
import com.bytedance.common.utility.C9738o;

/* renamed from: com.bytedance.android.livesdk.floatwindow.g */
public final class C7843g extends C7838b {

    /* renamed from: a */
    public C7842f f21170a;

    /* renamed from: b */
    public C7850a f21171b;

    /* renamed from: c */
    public ValueAnimator f21172c;

    /* renamed from: d */
    public float f21173d;

    /* renamed from: e */
    public float f21174e;

    /* renamed from: f */
    public float f21175f;

    /* renamed from: g */
    public float f21176g;

    /* renamed from: h */
    public boolean f21177h;

    /* renamed from: i */
    public int f21178i;

    /* renamed from: j */
    private FloatWindowLifecycle f21179j;

    /* renamed from: k */
    private TimeInterpolator f21180k;

    /* renamed from: l */
    private boolean f21181l = true;

    /* renamed from: m */
    private boolean f21182m;

    /* renamed from: c */
    public final boolean mo20554c() {
        return this.f21182m;
    }

    private C7843g() {
    }

    /* renamed from: g */
    public final int mo20562g() {
        return this.f21170a.mo20550c();
    }

    /* renamed from: h */
    private void m24048h() {
        mo20555d().setOnTouchListener(new OnTouchListener() {

            /* renamed from: a */
            float f21184a;

            /* renamed from: b */
            float f21185b;

            /* renamed from: c */
            float f21186c;

            /* renamed from: d */
            float f21187d;

            /* renamed from: e */
            int f21188e;

            /* renamed from: f */
            int f21189f;

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean z;
                int i;
                switch (motionEvent.getAction()) {
                    case 0:
                        C7843g.this.f21173d = motionEvent.getRawX();
                        C7843g.this.f21174e = motionEvent.getRawY();
                        this.f21184a = motionEvent.getRawX();
                        this.f21185b = motionEvent.getRawY();
                        C7843g.this.mo20561f();
                        break;
                    case 1:
                        C7843g.this.f21175f = motionEvent.getRawX();
                        C7843g.this.f21176g = motionEvent.getRawY();
                        C7843g gVar = C7843g.this;
                        if (Math.abs(C7843g.this.f21175f - C7843g.this.f21173d) > ((float) C7843g.this.f21178i) || Math.abs(C7843g.this.f21176g - C7843g.this.f21174e) > ((float) C7843g.this.f21178i)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        gVar.f21177h = z;
                        switch (C7843g.this.f21171b.f21206k) {
                            case 3:
                                int b = C7843g.this.f21170a.mo20548b();
                                if ((b * 2) + view.getWidth() > C9738o.m28691a(C7843g.this.f21171b.f21196a)) {
                                    i = (C9738o.m28691a(C7843g.this.f21171b.f21196a) - view.getWidth()) - C7843g.this.f21171b.f21208m;
                                } else {
                                    i = C7843g.this.f21171b.f21207l;
                                }
                                C7843g.this.f21172c = ObjectAnimator.ofInt(new int[]{b, i});
                                C7843g.this.f21172c.addUpdateListener(new AnimatorUpdateListener() {
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                        C7843g.this.f21170a.mo20544a(intValue);
                                        if (C7843g.this.f21171b.f21214s != null) {
                                            C7843g.this.f21171b.f21214s.mo9048a(intValue, (int) C7843g.this.f21176g);
                                        }
                                    }
                                });
                                C7843g.this.mo20560e();
                                break;
                            case 4:
                                PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("x", new int[]{C7843g.this.f21170a.mo20548b(), C7843g.this.f21171b.f21202g});
                                PropertyValuesHolder ofInt2 = PropertyValuesHolder.ofInt("y", new int[]{C7843g.this.f21170a.mo20550c(), C7843g.this.f21171b.f21203h});
                                C7843g.this.f21172c = ObjectAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{ofInt, ofInt2});
                                C7843g.this.f21172c.addUpdateListener(new AnimatorUpdateListener() {
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        int intValue = ((Integer) valueAnimator.getAnimatedValue("x")).intValue();
                                        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("y")).intValue();
                                        C7843g.this.f21170a.mo20545a(intValue, intValue2);
                                        if (C7843g.this.f21171b.f21214s != null) {
                                            C7843g.this.f21171b.f21214s.mo9048a(intValue, intValue2);
                                        }
                                    }
                                });
                                C7843g.this.mo20560e();
                                break;
                            default:
                                if (!C7843g.this.f21177h && C7843g.this.f21171b.f21214s != null) {
                                    C7843g.this.f21171b.f21214s.mo9049b();
                                }
                                if (C7843g.this.f21177h && C7843g.this.f21171b.f21214s != null) {
                                    C7843g.this.f21171b.f21214s.mo9047a();
                                    break;
                                }
                        }
                        break;
                    case 2:
                        this.f21186c = motionEvent.getRawX() - this.f21184a;
                        this.f21187d = motionEvent.getRawY() - this.f21185b;
                        this.f21188e = (int) (((float) C7843g.this.f21170a.mo20548b()) + this.f21186c);
                        this.f21189f = (int) (((float) C7843g.this.f21170a.mo20550c()) + this.f21187d);
                        C7843g.this.f21170a.mo20545a(this.f21188e, this.f21189f);
                        if (C7843g.this.f21171b.f21214s != null) {
                            C7843g.this.f21171b.f21214s.mo9048a(this.f21188e, this.f21189f);
                        }
                        this.f21184a = motionEvent.getRawX();
                        this.f21185b = motionEvent.getRawY();
                        break;
                }
                return C7843g.this.f21177h;
            }
        });
    }

    public final void dismiss() {
        C7849h.m24058a(this.f21171b.f21211p);
        this.f21170a.dismiss();
        this.f21182m = false;
    }

    /* renamed from: a */
    public final void mo20552a() {
        if (this.f21181l) {
            this.f21170a.mo20543a();
            this.f21181l = false;
            this.f21182m = true;
        } else if (!this.f21182m) {
            mo20555d().setVisibility(0);
            this.f21182m = true;
        }
    }

    /* renamed from: b */
    public final void mo20553b() {
        if (!this.f21181l && this.f21182m) {
            mo20555d().setVisibility(4);
            this.f21182m = false;
        }
    }

    /* renamed from: d */
    public final View mo20555d() {
        this.f21178i = ViewConfiguration.get(this.f21171b.f21196a).getScaledTouchSlop();
        return this.f21171b.f21197b;
    }

    /* renamed from: f */
    public final void mo20561f() {
        if (this.f21172c != null && this.f21172c.isRunning()) {
            this.f21172c.cancel();
        }
    }

    /* renamed from: e */
    public final void mo20560e() {
        if (this.f21171b.f21210o == null) {
            if (this.f21180k == null) {
                this.f21180k = new DecelerateInterpolator();
            }
            this.f21171b.f21210o = this.f21180k;
        }
        this.f21172c.setInterpolator(this.f21171b.f21210o);
        this.f21172c.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C7843g.this.f21172c.removeAllUpdateListeners();
                C7843g.this.f21172c.removeAllListeners();
                C7843g.this.f21172c = null;
                if (C7843g.this.f21171b.f21214s != null) {
                    C7843g.this.f21171b.f21214s.mo9047a();
                }
            }
        });
        this.f21172c.setDuration(this.f21171b.f21209n).start();
    }

    C7843g(C7850a aVar) {
        this.f21171b = aVar;
        this.f21170a = new C7842f(aVar.f21196a, aVar.f21213r);
        m24048h();
        this.f21170a.mo20558b(aVar.f21199d, aVar.f21200e);
        this.f21170a.mo20546a(aVar.f21201f, aVar.f21202g, aVar.f21203h);
        this.f21170a.mo20547a(aVar.f21197b);
        this.f21179j = new FloatWindowLifecycle(this.f21171b.f21196a, this.f21171b.f21204i, this.f21171b.f21205j, new C7839c() {
            /* renamed from: a */
            public final void mo20557a() {
                if (!C7843g.this.f21171b.f21212q) {
                    C7843g.this.mo20553b();
                }
            }
        });
    }
}
