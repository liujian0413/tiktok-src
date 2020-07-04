package com.bytedance.android.live.uikit.p175c;

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
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.live.uikit.c.a */
public final class C3511a {

    /* renamed from: A */
    private int f10366A;

    /* renamed from: a */
    public Context f10367a;

    /* renamed from: b */
    public long f10368b = 2500;

    /* renamed from: c */
    public String f10369c;

    /* renamed from: d */
    public boolean f10370d;

    /* renamed from: e */
    public boolean f10371e;

    /* renamed from: f */
    public float f10372f;

    /* renamed from: g */
    public float f10373g;

    /* renamed from: h */
    public AnimatorSet f10374h;

    /* renamed from: i */
    public AnimatorSet f10375i;

    /* renamed from: j */
    private ViewGroup f10376j;

    /* renamed from: k */
    private int f10377k = 49;

    /* renamed from: l */
    private int[] f10378l;

    /* renamed from: m */
    private View f10379m;

    /* renamed from: n */
    private TextView f10380n;

    /* renamed from: o */
    private AnimatorSet f10381o;

    /* renamed from: p */
    private AnimatorSet f10382p;

    /* renamed from: q */
    private ImageView f10383q;

    /* renamed from: r */
    private boolean f10384r;

    /* renamed from: s */
    private boolean f10385s;

    /* renamed from: t */
    private WindowManager f10386t;

    /* renamed from: u */
    private LayoutParams f10387u;

    /* renamed from: v */
    private View f10388v;

    /* renamed from: w */
    private boolean f10389w;

    /* renamed from: x */
    private int f10390x;

    /* renamed from: y */
    private int f10391y;

    /* renamed from: z */
    private boolean f10392z;

    /* renamed from: d */
    public final void mo10602d() {
        m12937h();
    }

    /* renamed from: e */
    public final void mo10604e() {
        this.f10384r = false;
    }

    /* renamed from: c */
    public final boolean mo10601c() {
        if (this.f10379m == null || !this.f10379m.isShown()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final boolean mo10606g() {
        if (this.f10367a == null || this.f10384r) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private void m12937h() {
        dismiss();
        this.f10379m.clearAnimation();
        this.f10367a = null;
        C3513b.m12951a().mo10609b(this);
    }

    public final void dismiss() {
        if (this.f10385s) {
            if (!(this.f10376j == null || this.f10376j.getParent() == null)) {
                this.f10386t.removeView(this.f10376j);
                this.f10376j.removeView(this.f10379m);
            }
            this.f10385s = false;
        }
    }

    /* renamed from: a */
    public final AnimatorSet mo10593a() {
        if (this.f10381o == null) {
            this.f10381o = new AnimatorSet();
            this.f10381o.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f10376j, "translationY", new float[]{(float) (-this.f10366A), 0.0f}), ObjectAnimator.ofFloat(this.f10376j, "alpha", new float[]{0.0f, 1.0f})});
            this.f10381o.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f10381o.setDuration(320);
        }
        return this.f10381o;
    }

    /* renamed from: b */
    public final AnimatorSet mo10599b() {
        if (this.f10382p == null) {
            this.f10382p = new AnimatorSet();
            this.f10382p.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f10376j, "translationY", new float[]{0.0f, (float) (-this.f10366A)}), ObjectAnimator.ofFloat(this.f10376j, "alpha", new float[]{1.0f, 0.0f})});
            this.f10382p.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f10382p.setDuration(320);
        }
        return this.f10382p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo10605f() {
        if (!mo10606g()) {
            if (this.f10380n != null && !C6319n.m19593a(this.f10369c)) {
                this.f10380n.setText(this.f10369c);
            }
            this.f10385s = true;
            this.f10376j.removeAllViews();
            if (this.f10379m.getParent() == null) {
                this.f10376j.addView(this.f10379m);
            } else {
                ((ViewGroup) this.f10379m.getParent()).removeView(this.f10379m);
                this.f10376j.addView(this.f10379m);
            }
            if (this.f10387u == null) {
                LayoutParams layoutParams = new LayoutParams(-1, -2, 2, 262280, -2);
                layoutParams.flags = 262280;
                layoutParams.gravity = this.f10377k;
                if (layoutParams.gravity == 48) {
                    layoutParams.y = this.f10378l[0];
                }
                this.f10387u = layoutParams;
            }
            this.f10386t = (WindowManager) this.f10367a.getSystemService("window");
            if (this.f10376j.getParent() != null) {
                this.f10386t.removeView(this.f10376j);
            }
            try {
                this.f10386t.addView(this.f10376j, this.f10387u);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final C3511a mo10596a(boolean z) {
        this.f10389w = false;
        return this;
    }

    /* renamed from: b */
    public final C3511a mo10600b(boolean z) {
        this.f10371e = true;
        return this;
    }

    /* renamed from: a */
    public final C3511a mo10594a(int i) {
        this.f10377k = 48;
        return this;
    }

    public C3511a(Context context) {
        m12934a(context, (View) null);
    }

    /* renamed from: a */
    public final C3511a mo10595a(long j) {
        this.f10368b = DouPlusShareGuideExperiment.MIN_VALID_DURATION;
        return this;
    }

    /* renamed from: b */
    private View m12936b(int i) {
        View view;
        LayoutInflater from = LayoutInflater.from(this.f10367a);
        if (i == this.f10390x) {
            return this.f10388v;
        }
        if (i == -1) {
            if (this.f10391y > 0) {
                i = this.f10391y;
            } else if (this.f10389w) {
                i = R.layout.acj;
            } else {
                i = R.layout.aci;
            }
        }
        try {
            view = from.inflate(i, this.f10376j, false);
            this.f10388v = view;
            this.f10390x = i;
        } catch (InflateException unused) {
            if (this.f10388v == null) {
                this.f10388v = from.inflate(R.layout.aci, this.f10376j, false);
            }
            this.f10390x = R.layout.aci;
            view = this.f10388v;
        }
        return view;
    }

    /* renamed from: a */
    public final void mo10597a(int i, C3516d dVar) {
        this.f10379m = m12936b((int) R.layout.apq);
        dVar.mo8808a(this.f10379m);
        m12935a("", -1);
        C3513b.m12951a().mo10608a(this);
    }

    /* renamed from: a */
    private void m12934a(Context context, View view) {
        this.f10367a = context;
        this.f10378l = new int[4];
        if (!mo10606g()) {
            this.f10376j = new FrameLayout(this.f10367a);
            this.f10366A = (int) context.getResources().getDimension(R.dimen.ne);
            this.f10376j.setOnTouchListener(new OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    switch (motionEvent.getAction()) {
                        case 0:
                            C3511a.this.f10372f = motionEvent.getY();
                            C3511a.this.mo10598a(C3511a.this.f10374h, 1.0f, 0.98f);
                            break;
                        case 1:
                            C3511a.this.mo10598a(C3511a.this.f10375i, 0.98f, 1.0f);
                            if (C3511a.this.f10371e && C3511a.this.f10373g - C3511a.this.f10372f < 0.0f && Math.abs(C3511a.this.f10373g - C3511a.this.f10372f) > 20.0f) {
                                C3513b.m12951a().mo10610c(C3511a.this);
                                break;
                            }
                        case 2:
                            C3511a.this.f10373g = motionEvent.getY();
                            break;
                        case 3:
                            C3511a.this.mo10598a(C3511a.this.f10375i, 0.98f, 1.0f);
                            break;
                    }
                    return false;
                }
            });
        }
    }

    /* renamed from: a */
    private void m12935a(String str, int i) {
        if (!mo10606g()) {
            this.f10369c = str;
            if (this.f10379m != null) {
                this.f10380n = (TextView) this.f10379m.findViewById(R.id.text);
                this.f10383q = (ImageView) this.f10379m.findViewById(R.id.ax9);
            }
            if (this.f10383q != null) {
                this.f10383q.setVisibility(8);
            }
            this.f10379m.measure(MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE));
        }
    }

    /* renamed from: a */
    public final void mo10598a(AnimatorSet animatorSet, float f, float f2) {
        if (this.f10392z) {
            if (animatorSet == null && this.f10379m != null) {
                animatorSet = new AnimatorSet();
                animatorSet.play(ObjectAnimator.ofFloat(this.f10376j, "scaleX", new float[]{f, f2})).with(ObjectAnimator.ofFloat(this.f10376j, "scaleY", new float[]{f, f2}));
                animatorSet.setDuration(80);
            }
            if (animatorSet != null) {
                animatorSet.start();
            }
        }
    }
}
