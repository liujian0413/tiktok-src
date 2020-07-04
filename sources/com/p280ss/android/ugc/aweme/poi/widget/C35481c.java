package com.p280ss.android.ugc.aweme.poi.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.OvershootInterpolator;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23321d;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.widget.c */
public final class C35481c extends PopupWindow {

    /* renamed from: a */
    public int f93093a;

    /* renamed from: b */
    public boolean f93094b;

    /* renamed from: c */
    public int f93095c;

    /* renamed from: d */
    public int f93096d;

    /* renamed from: e */
    public int f93097e;

    /* renamed from: f */
    public boolean f93098f;

    /* renamed from: g */
    public boolean f93099g;

    /* renamed from: h */
    public int f93100h;

    /* renamed from: i */
    public boolean f93101i;

    /* renamed from: j */
    public long f93102j;

    /* renamed from: k */
    public AnimatorSet f93103k;

    /* renamed from: l */
    public long f93104l;

    /* renamed from: m */
    public long f93105m;

    /* renamed from: n */
    public C23321d<Point> f93106n;

    /* renamed from: o */
    public C35486a f93107o;

    /* renamed from: p */
    private BubbleLayout f93108p;

    /* renamed from: q */
    private Activity f93109q;

    /* renamed from: r */
    private TextView f93110r;

    /* renamed from: s */
    private int f93111s;

    /* renamed from: t */
    private int f93112t;

    /* renamed from: u */
    private boolean f93113u;

    /* renamed from: v */
    private int f93114v;

    /* renamed from: w */
    private boolean f93115w;

    /* renamed from: x */
    private Runnable f93116x;

    /* renamed from: com.ss.android.ugc.aweme.poi.widget.c$a */
    public interface C35486a {
        /* renamed from: a */
        void mo62392a();
    }

    /* renamed from: g */
    private static int m114619g(int i) {
        switch (i) {
            case 1:
                return 2;
            case 2:
                return 1;
            default:
                return i;
        }
    }

    /* renamed from: h */
    private static int m114621h(int i) {
        if (i == 3) {
            return 2;
        }
        if (i != 5) {
            if (i == 48) {
                return 3;
            }
            if (i == 80) {
                return 0;
            }
        }
        return 1;
    }

    /* renamed from: a */
    public final void mo90257a(View view, int i, boolean z, float f) {
        float f2;
        if (!this.f93109q.isFinishing() && view != null && view.getWindowToken() != null) {
            getContentView().removeCallbacks(this.f93116x);
            this.f93097e = i;
            if (!isShowing()) {
                int h = m114621h(i);
                mo90273e();
                if (i == 80 || i == 48) {
                    f2 = (float) (mo90266c() / 2);
                } else {
                    f2 = (float) (m114623i() / 2);
                }
                int[] iArr = new int[2];
                if (this.f93106n != null) {
                    Point point = (Point) this.f93106n.mo60607a();
                    iArr[0] = point.x;
                    iArr[1] = point.y;
                } else {
                    view.getLocationOnScreen(iArr);
                }
                m114622h();
                if (mo90260a()) {
                    this.f93108p.mo90187a(m114619g(h), f2);
                    m114616a(view, i, true, iArr);
                } else {
                    this.f93108p.mo90187a(h, f2);
                    m114618b(view, i, true, iArr);
                }
                this.f93113u = false;
                if (this.f93102j > 0) {
                    getContentView().postDelayed(this.f93116x, this.f93102j);
                }
                return;
            }
            C35487d.m114651a(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo90260a() {
        return this.f93101i && C43127fh.m136806a(this.f93109q);
    }

    /* renamed from: a */
    public final void mo90259a(final boolean z, final int i) {
        final BubbleLayout bubbleLayout = this.f93108p;
        if (!z) {
            this.f93113u = true;
        }
        if (this.f93103k == null) {
            this.f93103k = new AnimatorSet();
        } else {
            this.f93103k.removeAllListeners();
            this.f93103k.cancel();
        }
        bubbleLayout.post(new Runnable() {
            public final void run() {
                float f;
                float f2;
                float f3;
                long j;
                if (C35481c.this.f93103k != null) {
                    if (C35481c.this.mo90260a()) {
                        C35481c.this.mo90264b(i, bubbleLayout);
                    } else {
                        C35481c.this.mo90252a(i, bubbleLayout);
                    }
                    View view = bubbleLayout;
                    String str = "scaleX";
                    float[] fArr = new float[2];
                    float f4 = 0.0f;
                    if (z) {
                        f = 0.0f;
                    } else {
                        f = 1.0f;
                    }
                    fArr[0] = f;
                    if (z) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    fArr[1] = f2;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, fArr);
                    View view2 = bubbleLayout;
                    String str2 = "scaleY";
                    float[] fArr2 = new float[2];
                    if (z) {
                        f3 = 0.0f;
                    } else {
                        f3 = 1.0f;
                    }
                    fArr2[0] = f3;
                    if (z) {
                        f4 = 1.0f;
                    }
                    fArr2[1] = f4;
                    C35481c.this.f93103k.play(ofFloat).with(ObjectAnimator.ofFloat(view2, str2, fArr2));
                    AnimatorSet animatorSet = C35481c.this.f93103k;
                    if (z) {
                        j = C35481c.this.f93104l;
                    } else {
                        j = C35481c.this.f93105m;
                    }
                    animatorSet.setDuration(j);
                    if (C35481c.this.f93099g) {
                        C35481c.this.f93103k.setInterpolator(new OvershootInterpolator(1.0f));
                    }
                    C35481c.this.f93103k.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationEnd(Animator animator) {
                            if (!z) {
                                bubbleLayout.setVisibility(8);
                                C35481c.this.mo90269d();
                            }
                        }

                        public final void onAnimationStart(Animator animator) {
                            super.onAnimationStart(animator);
                            if (z) {
                                bubbleLayout.setVisibility(0);
                            }
                        }
                    });
                    C35481c.this.f93103k.start();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo90258a(boolean z) {
        this.f93115w = false;
        if (this.f93108p != null) {
            this.f93108p.setNeedPath(false);
        }
    }

    /* renamed from: i */
    private int m114623i() {
        return getContentView().getMeasuredHeight();
    }

    /* renamed from: c */
    public final int mo90266c() {
        return getContentView().getMeasuredWidth();
    }

    /* renamed from: b */
    public final void mo90261b() {
        if (!this.f93113u) {
            this.f93108p.setVisibility(8);
            mo90269d();
            getContentView().removeCallbacks(this.f93116x);
            this.f93095c = 0;
            this.f93096d = 0;
        }
    }

    public final void dismiss() {
        if (!this.f93113u) {
            mo90259a(false, this.f93097e);
            getContentView().removeCallbacks(this.f93116x);
            this.f93095c = 0;
            this.f93096d = 0;
        }
    }

    /* renamed from: h */
    private void m114622h() {
        if (this.f93094b) {
            if (VERSION.SDK_INT < 19) {
                getContentView().setSystemUiVisibility(8);
                return;
            }
            if (VERSION.SDK_INT >= 19) {
                getContentView().setSystemUiVisibility(MessageCenter.MSG_CLIENT_TO_SDK_RESTART_GAME);
            }
        }
    }

    /* renamed from: d */
    public final void mo90269d() {
        if (!this.f93109q.isFinishing() && isShowing()) {
            if (this.f93103k != null) {
                this.f93103k.removeAllListeners();
                this.f93103k.cancel();
                this.f93103k = null;
            }
            try {
                C35487d.m114651a(this);
            } catch (Exception e) {
                C6921a.m21554a(e);
            }
        }
    }

    /* renamed from: e */
    public final void mo90273e() {
        if (this.f93111s == 0 || this.f93112t == 0) {
            getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
            return;
        }
        getContentView().measure(MeasureSpec.makeMeasureSpec(this.f93111s, 1073741824), MeasureSpec.makeMeasureSpec(this.f93112t, 1073741824));
    }

    /* renamed from: g */
    private void m114620g() {
        this.f93110r = new DmtTextView(this.f93109q);
        this.f93110r.setTextColor(this.f93109q.getResources().getColor(R.color.zg));
        this.f93110r.setTextSize(13.0f);
        this.f93110r.setLayoutParams(new LayoutParams(-2, -2));
        this.f93110r.setLines(1);
        this.f93110r.setGravity(17);
        mo90254a((View) this.f93110r);
        this.f93094b = true;
        getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: f */
    public final void mo90275f() {
        if (this.f93111s == 0 || this.f93112t == 0) {
            getContentView().measure(MeasureSpec.makeMeasureSpec(C23482j.m77098b(getContentView().getContext()), Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(C23482j.m77095a(getContentView().getContext()), Integer.MIN_VALUE));
            return;
        }
        getContentView().measure(MeasureSpec.makeMeasureSpec(this.f93111s, 1073741824), MeasureSpec.makeMeasureSpec(this.f93112t, 1073741824));
    }

    public C35481c(Activity activity) {
        this(activity, true);
    }

    /* renamed from: a */
    public final void mo90250a(int i) {
        this.f93112t = i;
        setHeight(i);
        BubbleLayout.f93010h = i;
    }

    /* renamed from: b */
    public final void mo90262b(int i) {
        this.f93111s = i;
        setWidth(i);
        BubbleLayout.f93009g = i;
    }

    /* renamed from: c */
    public final void mo90267c(int i) {
        this.f93110r.setText(i);
    }

    /* renamed from: e */
    public final void mo90274e(int i) {
        this.f93114v = i;
        if (this.f93108p != null) {
            this.f93108p.setBgColor(i);
        }
    }

    /* renamed from: f */
    public final void mo90276f(int i) {
        if (this.f93108p != null) {
            this.f93108p.setBorderColor(i);
        }
    }

    /* renamed from: d */
    public final void mo90270d(int i) {
        this.f93097e = 8388613;
        if (this.f93108p != null) {
            this.f93108p.setBubbleOrientation(m114621h(this.f93097e));
        }
    }

    /* renamed from: a */
    public final void mo90253a(Typeface typeface) {
        this.f93110r.setTypeface(typeface);
    }

    /* renamed from: b */
    public final void mo90265b(View view) {
        mo90257a(view, 80, true, 0.0f);
    }

    /* renamed from: a */
    public final void mo90254a(View view) {
        this.f93108p = new BubbleLayout(this.f93109q);
        this.f93108p.setBackgroundColor(0);
        this.f93108p.addView(view);
        this.f93108p.setGravity(17);
        this.f93108p.setLayoutParams(new MarginLayoutParams(-2, -2));
        this.f93108p.setVisibility(8);
        if (this.f93114v != 0) {
            this.f93108p.setBgColor(this.f93114v);
        }
        this.f93108p.setNeedPath(this.f93115w);
        this.f93108p.setNeedPressFade(this.f93098f);
        this.f93108p.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C35481c.this.f93107o != null) {
                    C35481c.this.f93107o.mo62392a();
                }
                C35481c.this.dismiss();
            }
        });
        setContentView(this.f93108p);
    }

    /* renamed from: d */
    public final void mo90271d(View view) {
        int i;
        int i2;
        int c;
        if (!this.f93109q.isFinishing() && view != null && view.getWindowToken() != null) {
            C9738o.m28708b((Context) this.f93109q, 16.0f);
            float b = C9738o.m28708b((Context) this.f93109q, 16.0f);
            float b2 = C9738o.m28708b((Context) this.f93109q, 36.0f);
            boolean a = C43127fh.m136806a(this.f93109q);
            getContentView().removeCallbacks(this.f93116x);
            if (!isShowing()) {
                if (this.f93111s == 0 || this.f93112t == 0) {
                    getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
                } else {
                    getContentView().measure(MeasureSpec.makeMeasureSpec(this.f93111s, 1073741824), MeasureSpec.makeMeasureSpec(this.f93112t, 1073741824));
                }
                int[] iArr = new int[2];
                if (this.f93106n != null) {
                    Point point = (Point) this.f93106n.mo60607a();
                    iArr[0] = point.x;
                    iArr[1] = point.y;
                } else {
                    view.getLocationOnScreen(iArr);
                }
                this.f93097e = 80;
                if (a) {
                    i = iArr[0] + ((int) b);
                } else {
                    i = C23482j.m77098b(this.f93109q) - mo90266c();
                }
                this.f93095c = i;
                this.f93096d = 0;
                int h = m114621h(this.f93097e);
                if (view.getMeasuredHeight() > 0) {
                    i2 = view.getMeasuredHeight();
                } else {
                    i2 = (int) b2;
                }
                if (a) {
                    c = i2 / 3;
                } else {
                    c = mo90266c() - i2;
                }
                this.f93108p.mo90187a(h, (float) c);
                m114622h();
                showAtLocation(view, 0, this.f93095c, iArr[1] + this.f93096d + i2);
                mo90259a(true, this.f93097e);
                this.f93113u = false;
                if (this.f93102j > 0) {
                    getContentView().postDelayed(this.f93116x, this.f93102j);
                }
                return;
            }
            C35487d.m114651a(this);
        }
    }

    /* renamed from: c */
    public final void mo90268c(View view) {
        if (!this.f93109q.isFinishing() && view != null && view.getWindowToken() != null) {
            float b = C9738o.m28708b((Context) this.f93109q, 36.0f);
            float b2 = C9738o.m28708b((Context) this.f93109q, 64.0f);
            float b3 = C9738o.m28708b((Context) this.f93109q, 16.0f);
            getContentView().removeCallbacks(this.f93116x);
            if (!isShowing()) {
                int[] iArr = new int[2];
                if (this.f93106n != null) {
                    Point point = (Point) this.f93106n.mo60607a();
                    iArr[0] = point.x;
                    iArr[1] = point.y;
                } else {
                    view.getLocationOnScreen(iArr);
                }
                this.f93097e = 48;
                this.f93100h = -((int) C9738o.m28708b(view.getContext(), 3.5f));
                if (((float) (iArr[1] - m114623i())) - b < b2) {
                    this.f93097e = 80;
                }
                if (((float) iArr[0]) - (((float) mo90266c()) / 2.0f) < b3) {
                    this.f93095c = (int) (b3 - (((float) iArr[0]) - (((float) mo90266c()) / 2.0f)));
                }
                if (((float) C23482j.m77098b(this.f93109q)) - (((float) iArr[0]) + (((float) mo90266c()) / 2.0f)) < b3) {
                    this.f93095c = (int) ((((float) C23482j.m77098b(this.f93109q)) - (((float) iArr[0]) + (((float) mo90266c()) / 2.0f))) - b3);
                }
                float c = ((float) mo90266c()) / 2.0f;
                this.f93108p.mo90187a(m114621h(this.f93097e), (((float) this.f93100h) + c) - ((float) this.f93095c));
                m114622h();
                int i = this.f93097e;
                if (i == 48) {
                    showAtLocation(view, 0, (int) (((float) (iArr[0] + this.f93095c)) - c), (int) ((((float) (iArr[1] + this.f93096d)) - b) - ((float) m114623i())));
                    mo90259a(true, this.f93097e);
                } else if (i == 80) {
                    showAtLocation(view, 0, (int) (((float) (iArr[0] + this.f93095c)) - c), (int) (((float) (iArr[1] + this.f93096d)) + b));
                    mo90259a(true, this.f93097e);
                }
                this.f93113u = false;
                if (this.f93102j > 0) {
                    getContentView().postDelayed(this.f93116x, this.f93102j);
                }
                return;
            }
            C35487d.m114651a(this);
        }
    }

    /* renamed from: a */
    public final void mo90251a(int i, int i2) {
        this.f93111s = i;
        this.f93112t = i2;
        setWidth(i);
        setHeight(i2);
    }

    /* renamed from: b */
    public final void mo90263b(int i, int i2) {
        this.f93110r.setTextSize(i, (float) i2);
    }

    /* renamed from: a */
    private static float m114615a(Context context, float f) {
        return (context.getResources().getDisplayMetrics().density * 3.0f) + 0.5f;
    }

    public C35481c(Activity activity, boolean z) {
        super(activity);
        this.f93115w = true;
        this.f93102j = 7000;
        this.f93116x = new Runnable() {
            public final void run() {
                C35481c.this.mo90259a(false, C35481c.this.f93097e);
            }
        };
        this.f93104l = 800;
        this.f93105m = 200;
        this.f93109q = activity;
        this.f93093a = (int) m114615a((Context) this.f93109q, 3.0f);
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(false);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        setInputMethodMode(1);
        setSoftInputMode(16);
        if (z) {
            m114620g();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo90252a(int i, View view) {
        Point point = new Point(0, 0);
        if (i == 3) {
            point.x = (int) (view.getX() + ((float) view.getMeasuredWidth()));
            point.y = (int) (view.getY() + this.f93108p.getBubbleOffset());
        } else if (i == 5) {
            point.x = (int) view.getX();
            point.y = (int) (view.getY() + this.f93108p.getBubbleOffset());
        } else if (i == 48) {
            point.x = (int) (view.getX() + this.f93108p.getBubbleOffset());
            point.y = (int) (view.getY() + ((float) view.getMeasuredHeight()));
        } else if (i == 80) {
            point.x = (int) (view.getX() + this.f93108p.getBubbleOffset());
            point.y = (int) view.getY();
        }
        view.setPivotY((float) point.y);
        view.setPivotX((float) point.x);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo90264b(int i, View view) {
        Point point = new Point(0, 0);
        if (i == 3) {
            point.x = (int) view.getX();
            point.y = (int) (view.getY() + this.f93108p.getBubbleOffset());
        } else if (i == 5) {
            point.x = (int) (view.getX() + ((float) view.getMeasuredWidth()));
            point.y = (int) (view.getY() + this.f93108p.getBubbleOffset());
        } else if (i == 48) {
            point.x = (int) (view.getX() + this.f93108p.getBubbleOffset());
            point.y = (int) (view.getY() + ((float) view.getMeasuredHeight()));
        } else if (i == 80) {
            point.x = (int) (view.getX() + this.f93108p.getBubbleOffset());
            point.y = (int) view.getY();
        }
        view.setPivotY((float) point.y);
        view.setPivotX((float) point.x);
    }

    /* renamed from: a */
    public final void mo90255a(View view, int i) {
        mo90257a(view, i, true, 0.0f);
    }

    /* renamed from: a */
    public final void mo90256a(View view, int i, int i2) {
        mo90255a(view, 80);
    }

    public final void showAtLocation(View view, int i, int i2, int i3) {
        try {
            super.showAtLocation(view, i, i2, i3);
        } catch (Exception e) {
            C6921a.m21554a(e);
        }
    }

    /* renamed from: a */
    private void m114616a(View view, int i, boolean z, int[] iArr) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (i == 3) {
            if (z) {
                i2 = (view.getMeasuredHeight() - m114623i()) / 2;
            } else {
                i2 = 0;
            }
            showAtLocation(view, 0, iArr[0] + this.f93095c + view.getWidth() + this.f93093a, iArr[1] + this.f93096d + i2);
            mo90259a(true, i);
        } else if (i == 5) {
            if (z) {
                i3 = (view.getMeasuredHeight() - m114623i()) / 2;
            } else {
                i3 = 0;
            }
            showAtLocation(view, 0, ((iArr[0] + this.f93095c) - mo90266c()) - this.f93093a, iArr[1] + this.f93096d + i3);
            mo90259a(true, i);
        } else if (i == 48) {
            if (z) {
                i4 = (view.getMeasuredWidth() - mo90266c()) / 2;
            } else {
                i4 = 0;
            }
            showAtLocation(view, 0, iArr[0] + this.f93095c + i4, ((iArr[1] - m114623i()) + this.f93096d) - this.f93093a);
            mo90259a(true, i);
        } else if (i == 80) {
            if (z) {
                i5 = (-view.getMeasuredWidth()) + ((view.getMeasuredWidth() - mo90266c()) / 2);
            }
            showAsDropDown(view, this.f93095c + i5, this.f93093a + this.f93096d);
            mo90259a(true, i);
        }
    }

    /* renamed from: b */
    private void m114618b(View view, int i, boolean z, int[] iArr) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (i == 3) {
            if (z) {
                i2 = (view.getMeasuredHeight() - m114623i()) / 2;
            } else {
                i2 = 0;
            }
            showAtLocation(view, 0, ((iArr[0] + this.f93095c) - mo90266c()) - this.f93093a, iArr[1] + this.f93096d + i2);
            mo90259a(true, i);
        } else if (i == 5) {
            if (z) {
                i3 = (view.getMeasuredHeight() - m114623i()) / 2;
            } else {
                i3 = 0;
            }
            showAtLocation(view, 0, iArr[0] + this.f93095c + view.getWidth() + this.f93093a, iArr[1] + this.f93096d + i3);
            mo90259a(true, i);
        } else if (i == 48) {
            if (z) {
                i4 = (view.getMeasuredWidth() - mo90266c()) / 2;
            } else {
                i4 = 0;
            }
            showAtLocation(view, 0, iArr[0] + this.f93095c + i4, ((iArr[1] - m114623i()) + this.f93096d) - this.f93093a);
            mo90259a(true, i);
        } else if (i == 80) {
            if (z) {
                i5 = (view.getMeasuredWidth() - mo90266c()) / 2;
            }
            showAsDropDown(view, this.f93095c + i5, this.f93093a + this.f93096d);
            mo90259a(true, i);
        }
    }
}
