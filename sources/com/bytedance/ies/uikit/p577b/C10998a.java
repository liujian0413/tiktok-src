package com.bytedance.ies.uikit.p577b;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C6319n;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.ies.uikit.b.a */
public final class C10998a {

    /* renamed from: A */
    private int f29744A;

    /* renamed from: a */
    public Context f29745a;

    /* renamed from: b */
    public long f29746b = 2500;

    /* renamed from: c */
    public String f29747c;

    /* renamed from: d */
    public boolean f29748d;

    /* renamed from: e */
    public boolean f29749e;

    /* renamed from: f */
    public float f29750f;

    /* renamed from: g */
    public float f29751g;

    /* renamed from: h */
    public AnimatorSet f29752h;

    /* renamed from: i */
    public AnimatorSet f29753i;

    /* renamed from: j */
    private ViewGroup f29754j;

    /* renamed from: k */
    private int f29755k = 49;

    /* renamed from: l */
    private int[] f29756l;

    /* renamed from: m */
    private View f29757m;

    /* renamed from: n */
    private TextView f29758n;

    /* renamed from: o */
    private AnimatorSet f29759o;

    /* renamed from: p */
    private AnimatorSet f29760p;

    /* renamed from: q */
    private ImageView f29761q;

    /* renamed from: r */
    private boolean f29762r;

    /* renamed from: s */
    private boolean f29763s;

    /* renamed from: t */
    private WindowManager f29764t;

    /* renamed from: u */
    private LayoutParams f29765u;

    /* renamed from: v */
    private View f29766v;

    /* renamed from: w */
    private boolean f29767w;

    /* renamed from: x */
    private int f29768x;

    /* renamed from: y */
    private int f29769y = R.layout.j2;

    /* renamed from: z */
    private boolean f29770z;

    /* renamed from: e */
    public final void mo26564e() {
        m32226j();
    }

    /* renamed from: f */
    public final void mo26565f() {
        this.f29762r = true;
    }

    /* renamed from: g */
    public final void mo26566g() {
        this.f29762r = false;
    }

    /* renamed from: c */
    public final View mo26561c() {
        if (this.f29757m == null) {
            return this.f29754j;
        }
        return this.f29757m;
    }

    /* renamed from: d */
    public final boolean mo26562d() {
        if (this.f29757m == null || !this.f29757m.isShown()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final boolean mo26568i() {
        if (this.f29745a == null || this.f29762r) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private void m32226j() {
        dismiss();
        this.f29757m.clearAnimation();
        this.f29745a = null;
        C11000b.m32244a().mo26573b(this);
    }

    public final void dismiss() {
        if (this.f29763s) {
            if (!(this.f29754j == null || this.f29754j.getParent() == null)) {
                this.f29764t.removeView(this.f29754j);
                this.f29754j.removeView(this.f29757m);
            }
            this.f29763s = false;
        }
    }

    /* renamed from: a */
    public final AnimatorSet mo26551a() {
        if (this.f29759o == null) {
            this.f29759o = new AnimatorSet();
            this.f29759o.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f29754j, "translationY", new float[]{(float) (-this.f29744A), 0.0f}), ObjectAnimator.ofFloat(this.f29754j, "alpha", new float[]{0.0f, 1.0f})});
            this.f29759o.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f29759o.setDuration(320);
        }
        return this.f29759o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final void mo26567h() {
        if (!mo26568i()) {
            if (this.f29758n != null && !C6319n.m19593a(this.f29747c)) {
                this.f29758n.setText(this.f29747c);
            }
            this.f29763s = true;
            this.f29754j.removeAllViews();
            if (this.f29757m.getParent() == null) {
                this.f29754j.addView(this.f29757m);
            } else {
                ((ViewGroup) this.f29757m.getParent()).removeView(this.f29757m);
                this.f29754j.addView(this.f29757m);
            }
            if (this.f29765u == null) {
                LayoutParams layoutParams = new LayoutParams(-1, -2, 2, 262280, -2);
                layoutParams.flags = 262280;
                layoutParams.gravity = this.f29755k;
                if (layoutParams.gravity == 48) {
                    layoutParams.y = this.f29756l[0];
                }
                this.f29765u = layoutParams;
            }
            this.f29764t = (WindowManager) this.f29745a.getSystemService("window");
            if (this.f29754j.getParent() != null) {
                this.f29764t.removeView(this.f29754j);
            }
            try {
                this.f29764t.addView(this.f29754j, this.f29765u);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final AnimatorSet mo26559b() {
        if (this.f29760p == null) {
            this.f29760p = new AnimatorSet();
            this.f29760p.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f29754j, "translationY", new float[]{0.0f, (float) (-this.f29744A)}), ObjectAnimator.ofFloat(this.f29754j, "alpha", new float[]{1.0f, 0.0f})});
            this.f29760p.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f29760p.setDuration(320);
        }
        return this.f29760p;
    }

    /* renamed from: a */
    public final C10998a mo26552a(int i) {
        this.f29755k = i;
        return this;
    }

    /* renamed from: b */
    public final C10998a mo26560b(boolean z) {
        this.f29749e = z;
        return this;
    }

    /* renamed from: a */
    public final C10998a mo26553a(long j) {
        this.f29746b = j;
        return this;
    }

    /* renamed from: a */
    public final C10998a mo26554a(boolean z) {
        this.f29770z = false;
        return this;
    }

    /* renamed from: b */
    private View m32224b(int i) {
        int i2;
        View view;
        LayoutInflater from = LayoutInflater.from(this.f29745a);
        if (-1 == this.f29768x) {
            return this.f29766v;
        }
        if (this.f29769y > 0) {
            i2 = this.f29769y;
        } else if (this.f29767w) {
            i2 = R.layout.j0;
        } else {
            i2 = R.layout.iz;
        }
        try {
            view = from.inflate(i2, this.f29754j, false);
            this.f29766v = view;
            this.f29768x = i2;
        } catch (InflateException unused) {
            if (this.f29766v == null) {
                this.f29766v = from.inflate(R.layout.iz, this.f29754j, false);
            }
            this.f29768x = R.layout.iz;
            view = this.f29766v;
        }
        return view;
    }

    /* renamed from: a */
    public final void mo26557a(String str) {
        this.f29757m = m32224b(-1);
        m32225b(str, -1);
        C11000b.m32244a().mo26571a(this);
    }

    public C10998a(Context context, int i) {
        m32223a(context, (View) null);
    }

    /* renamed from: a */
    public final void mo26556a(AnimatorSet animatorSet, AnimatorSet animatorSet2) {
        this.f29759o = animatorSet;
        this.f29760p = animatorSet2;
    }

    /* renamed from: a */
    private void m32223a(Context context, View view) {
        this.f29745a = context;
        this.f29756l = new int[4];
        if (!mo26568i()) {
            this.f29754j = new FrameLayout(this.f29745a);
            this.f29744A = (int) context.getResources().getDimension(R.dimen.ne);
            this.f29754j.setOnTouchListener(new OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    switch (motionEvent.getAction()) {
                        case 0:
                            C10998a.this.f29750f = motionEvent.getY();
                            C10998a.this.mo26555a(C10998a.this.f29752h, 1.0f, 0.98f);
                            break;
                        case 1:
                            C10998a.this.mo26555a(C10998a.this.f29753i, 0.98f, 1.0f);
                            if (C10998a.this.f29749e && C10998a.this.f29751g - C10998a.this.f29750f < 0.0f && Math.abs(C10998a.this.f29751g - C10998a.this.f29750f) > 20.0f) {
                                C11000b.m32244a().mo26575c(C10998a.this);
                                break;
                            }
                        case 2:
                            C10998a.this.f29751g = motionEvent.getY();
                            break;
                        case 3:
                            C10998a.this.mo26555a(C10998a.this.f29753i, 0.98f, 1.0f);
                            break;
                    }
                    return false;
                }
            });
        }
    }

    /* renamed from: b */
    private void m32225b(String str, int i) {
        if (!mo26568i()) {
            this.f29747c = str;
            if (this.f29757m != null) {
                this.f29758n = (TextView) this.f29757m.findViewById(R.id.text);
                this.f29761q = (ImageView) this.f29757m.findViewById(R.id.ax9);
            }
            if (this.f29761q != null && i == -1) {
                this.f29761q.setVisibility(8);
            }
            this.f29757m.measure(MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE));
        }
    }

    /* renamed from: a */
    public final void mo26558a(String str, int i) {
        this.f29757m = m32224b(-1);
        m32225b(str, i);
        C11000b.m32244a().mo26571a(this);
    }

    /* renamed from: a */
    public final void mo26555a(AnimatorSet animatorSet, float f, float f2) {
        if (this.f29770z) {
            if (animatorSet == null && this.f29757m != null) {
                animatorSet = new AnimatorSet();
                animatorSet.play(ObjectAnimator.ofFloat(this.f29754j, "scaleX", new float[]{f, f2})).with(ObjectAnimator.ofFloat(this.f29754j, "scaleY", new float[]{f, f2}));
                animatorSet.setDuration(80);
            }
            if (animatorSet != null) {
                animatorSet.start();
            }
        }
    }
}
