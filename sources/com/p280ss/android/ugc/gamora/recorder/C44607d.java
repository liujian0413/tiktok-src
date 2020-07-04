package com.p280ss.android.ugc.gamora.recorder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
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
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23321d;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.poi.widget.BubbleLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.gamora.recorder.d */
public final class C44607d extends PopupWindow {

    /* renamed from: a */
    public static int f114917a;

    /* renamed from: b */
    public BubbleLayout f114918b;

    /* renamed from: c */
    public boolean f114919c;

    /* renamed from: d */
    public int f114920d;

    /* renamed from: e */
    public int f114921e;

    /* renamed from: f */
    public int f114922f;

    /* renamed from: g */
    public int f114923g;

    /* renamed from: h */
    public boolean f114924h;

    /* renamed from: i */
    public boolean f114925i;

    /* renamed from: j */
    public long f114926j;

    /* renamed from: k */
    public AnimatorSet f114927k;

    /* renamed from: l */
    public long f114928l;

    /* renamed from: m */
    public long f114929m;

    /* renamed from: n */
    public C23321d<Point> f114930n;

    /* renamed from: o */
    private Activity f114931o;

    /* renamed from: p */
    private TextView f114932p;

    /* renamed from: q */
    private int f114933q;

    /* renamed from: r */
    private int f114934r;

    /* renamed from: s */
    private boolean f114935s;

    /* renamed from: t */
    private int f114936t;

    /* renamed from: u */
    private boolean f114937u;

    /* renamed from: v */
    private Runnable f114938v;

    /* renamed from: a */
    private static int m140918a(int i) {
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

    /* renamed from: d */
    private int m140924d() {
        return getContentView().getMeasuredHeight();
    }

    /* renamed from: e */
    private int m140925e() {
        return getContentView().getMeasuredWidth();
    }

    public final void dismiss() {
        if (!this.f114935s) {
            mo107046a(false, this.f114922f);
            getContentView().removeCallbacks(this.f114938v);
            this.f114920d = 0;
            this.f114921e = 0;
        }
    }

    /* renamed from: c */
    private void m140923c() {
        if (this.f114919c) {
            if (VERSION.SDK_INT < 19) {
                getContentView().setSystemUiVisibility(8);
                return;
            }
            if (VERSION.SDK_INT >= 19) {
                getContentView().setSystemUiVisibility(MessageCenter.MSG_CLIENT_TO_SDK_RESTART_GAME);
            }
        }
    }

    /* renamed from: b */
    private void m140922b() {
        this.f114932p = new DmtTextView(this.f114931o);
        this.f114932p.setTextColor(this.f114931o.getResources().getColor(R.color.a5d));
        this.f114932p.setTextSize(13.0f);
        this.f114932p.setLayoutParams(new LayoutParams(-2, -2));
        this.f114932p.setMaxLines(2);
        this.f114932p.setGravity(17);
        m140919a((View) this.f114932p);
        this.f114919c = true;
        getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: a */
    public final void mo107042a() {
        if (this.f114927k != null) {
            this.f114927k.removeAllListeners();
            this.f114927k.cancel();
            this.f114927k = null;
        }
        if (!this.f114931o.isFinishing() && isShowing()) {
            try {
                C44612e.m140931a(this);
            } catch (Exception e) {
                C6921a.m21554a(e);
            }
        }
    }

    public C44607d(Activity activity) {
        this(activity, true);
    }

    /* renamed from: a */
    public final void mo107044a(String str) {
        this.f114932p.setText(str);
    }

    /* renamed from: a */
    private void m140919a(View view) {
        this.f114918b = new BubbleLayout(this.f114931o);
        this.f114918b.setBackgroundColor(0);
        this.f114918b.addView(view);
        this.f114918b.setGravity(17);
        this.f114918b.setLayoutParams(new MarginLayoutParams(-2, -2));
        this.f114918b.setVisibility(8);
        if (this.f114936t != 0) {
            this.f114918b.setBgColor(this.f114936t);
        }
        this.f114918b.setNeedPath(this.f114937u);
        this.f114918b.setNeedPressFade(this.f114924h);
        this.f114918b.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C44607d.this.dismiss();
            }
        });
        setContentView(this.f114918b);
    }

    /* renamed from: a */
    public final void mo107045a(boolean z) {
        this.f114937u = true;
        if (this.f114918b != null) {
            this.f114918b.setNeedPath(true);
        }
    }

    /* renamed from: a */
    public final void mo107043a(View view, int i) {
        m140920a(view, 48, true, 0.0f);
    }

    /* renamed from: a */
    private static float m140917a(Context context, float f) {
        return (context.getResources().getDisplayMetrics().density * 3.0f) + 0.5f;
    }

    private C44607d(Activity activity, boolean z) {
        super(activity);
        this.f114937u = true;
        this.f114926j = 7000;
        this.f114938v = new Runnable() {
            public final void run() {
                C44607d.this.mo107046a(false, C44607d.this.f114922f);
            }
        };
        this.f114928l = 800;
        this.f114929m = 200;
        this.f114931o = activity;
        f114917a = (int) m140917a((Context) this.f114931o, 3.0f);
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(false);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        setInputMethodMode(1);
        setSoftInputMode(16);
        m140922b();
    }

    /* renamed from: a */
    public final void mo107046a(final boolean z, final int i) {
        final BubbleLayout bubbleLayout = this.f114918b;
        if (!z) {
            this.f114935s = true;
        }
        if (this.f114927k == null) {
            this.f114927k = new AnimatorSet();
        } else {
            this.f114927k.removeAllListeners();
            this.f114927k.cancel();
        }
        bubbleLayout.post(new Runnable() {
            public final void run() {
                int i;
                int i2;
                float f;
                float f2;
                float f3;
                long j;
                if (C44607d.this.f114927k != null) {
                    int i3 = i;
                    if (i3 == 3) {
                        i2 = (int) (bubbleLayout.getX() + ((float) bubbleLayout.getMeasuredWidth()));
                        i = (int) (bubbleLayout.getY() + C44607d.this.f114918b.getBubbleOffset());
                    } else if (i3 == 5) {
                        i2 = (int) bubbleLayout.getX();
                        i = (int) (bubbleLayout.getY() + C44607d.this.f114918b.getBubbleOffset());
                    } else if (i3 == 48) {
                        i2 = (int) (bubbleLayout.getX() + C44607d.this.f114918b.getBubbleOffset());
                        i = (int) (bubbleLayout.getY() + ((float) bubbleLayout.getMeasuredHeight()));
                    } else if (i3 != 80) {
                        i2 = 0;
                        i = 0;
                    } else {
                        i2 = (int) (bubbleLayout.getX() + C44607d.this.f114918b.getBubbleOffset());
                        i = (int) bubbleLayout.getY();
                    }
                    bubbleLayout.setPivotY((float) i);
                    bubbleLayout.setPivotX((float) i2);
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
                    C44607d.this.f114927k.play(ofFloat).with(ObjectAnimator.ofFloat(view2, str2, fArr2));
                    AnimatorSet animatorSet = C44607d.this.f114927k;
                    if (z) {
                        j = C44607d.this.f114928l;
                    } else {
                        j = C44607d.this.f114929m;
                    }
                    animatorSet.setDuration(j);
                    if (C44607d.this.f114925i) {
                        C44607d.this.f114927k.setInterpolator(new OvershootInterpolator(1.0f));
                    }
                    C44607d.this.f114927k.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationEnd(Animator animator) {
                            if (!z) {
                                bubbleLayout.setVisibility(8);
                                C44607d.this.mo107042a();
                            }
                        }

                        public final void onAnimationStart(Animator animator) {
                            super.onAnimationStart(animator);
                            if (z) {
                                bubbleLayout.setVisibility(0);
                            }
                        }
                    });
                    C44607d.this.f114927k.start();
                }
            }
        });
    }

    public final void showAtLocation(View view, int i, int i2, int i3) {
        try {
            super.showAtLocation(view, i, i2, i3);
        } catch (Exception e) {
            C6921a.m21554a(e);
        }
    }

    /* renamed from: a */
    private void m140920a(View view, int i, boolean z, float f) {
        float f2;
        if (!this.f114931o.isFinishing() && view != null && view.getWindowToken() != null) {
            getContentView().removeCallbacks(this.f114938v);
            this.f114922f = i;
            if (!isShowing()) {
                int a = m140918a(i);
                if (this.f114933q == 0 || this.f114934r == 0) {
                    getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
                } else {
                    getContentView().measure(MeasureSpec.makeMeasureSpec(this.f114933q, 1073741824), MeasureSpec.makeMeasureSpec(this.f114934r, 1073741824));
                }
                if (i == 80 || i == 48) {
                    f2 = (float) (m140925e() / 2);
                } else {
                    f2 = (float) (m140924d() / 2);
                }
                this.f114918b.mo90187a(a, f2 + ((float) this.f114923g));
                int[] iArr = new int[2];
                if (this.f114930n != null) {
                    Point point = (Point) this.f114930n.mo60607a();
                    iArr[0] = point.x;
                    iArr[1] = point.y;
                } else {
                    view.getLocationOnScreen(iArr);
                }
                m140923c();
                if (i == 3) {
                    showAtLocation(view, 0, ((iArr[0] + this.f114920d) - m140925e()) - f114917a, (iArr[1] + this.f114921e) - ((view.getMeasuredHeight() - m140924d()) / 2));
                    mo107046a(true, i);
                } else if (i == 5) {
                    showAtLocation(view, 0, iArr[0] + this.f114920d + view.getWidth() + f114917a, (iArr[1] + this.f114921e) - ((view.getMeasuredHeight() - m140924d()) / 2));
                    mo107046a(true, i);
                } else if (i == 48) {
                    showAtLocation(view, 0, iArr[0] + this.f114920d + ((view.getMeasuredWidth() - m140925e()) / 2), ((iArr[1] - m140924d()) + this.f114921e) - f114917a);
                    mo107046a(true, i);
                } else if (i == 80) {
                    showAsDropDown(view, this.f114920d + ((view.getMeasuredWidth() - m140925e()) / 2), f114917a + this.f114921e);
                    mo107046a(true, i);
                }
                this.f114935s = false;
                if (this.f114926j > 0) {
                    getContentView().postDelayed(this.f114938v, this.f114926j);
                }
                return;
            }
            C44612e.m140931a(this);
        }
    }
}
