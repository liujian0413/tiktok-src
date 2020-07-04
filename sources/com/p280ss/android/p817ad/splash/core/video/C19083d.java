package com.p280ss.android.p817ad.splash.core.video;

import android.content.Context;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.p817ad.splash.core.C19025f;
import com.p280ss.android.p817ad.splash.p836g.C19129h;
import com.p280ss.android.p817ad.splash.p836g.C19137n;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ad.splash.core.video.d */
public final class C19083d implements C19064a {

    /* renamed from: a */
    public ImageView f51560a;

    /* renamed from: b */
    public boolean f51561b;

    /* renamed from: c */
    public C19087a f51562c;

    /* renamed from: d */
    public boolean f51563d;

    /* renamed from: e */
    private FrameLayout f51564e;

    /* renamed from: f */
    private TextView f51565f;

    /* renamed from: g */
    private TextView f51566g;

    /* renamed from: h */
    private ImageView f51567h;

    /* renamed from: i */
    private SSRenderSurfaceView f51568i;

    /* renamed from: j */
    private View f51569j;

    /* renamed from: k */
    private int f51570k;

    /* renamed from: l */
    private int f51571l;

    /* renamed from: m */
    private View f51572m;

    /* renamed from: n */
    private Context f51573n;

    /* renamed from: o */
    private FrameLayout f51574o;

    /* renamed from: p */
    private TextView f51575p;

    /* renamed from: q */
    private Space f51576q;

    /* renamed from: r */
    private TextView f51577r;

    /* renamed from: s */
    private TextView f51578s;

    /* renamed from: t */
    private OnTouchListener f51579t = new OnTouchListener() {
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                C19083d.this.mo50716a(view, motionEvent);
            }
            return true;
        }
    };

    /* renamed from: com.ss.android.ad.splash.core.video.d$a */
    interface C19087a {
        /* renamed from: a */
        void mo50730a();

        /* renamed from: a */
        void mo50731a(C19083d dVar, SurfaceHolder surfaceHolder);

        /* renamed from: a */
        void mo50732a(C19083d dVar, SurfaceHolder surfaceHolder, int i, int i2, int i3);

        /* renamed from: a */
        void mo50733a(C19083d dVar, View view, MotionEvent motionEvent);

        /* renamed from: b */
        void mo50734b(C19083d dVar, SurfaceHolder surfaceHolder);
    }

    /* renamed from: a */
    public final void mo50719a(boolean z, boolean z2) {
        if (this.f51563d) {
            m62519b(z, z2);
            return;
        }
        this.f51569j.setVisibility(8);
        if (z) {
            this.f51567h.setVisibility(0);
            if (C19025f.m62148c()) {
                this.f51565f.setVisibility(0);
            }
        }
        if (z2) {
            this.f51564e.setVisibility(0);
            this.f51566g.setVisibility(0);
        }
        if (!z || C19025f.m62167h() != 1) {
            if (!z2) {
                m62524h();
            }
            return;
        }
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(12);
        layoutParams.addRule(11);
        layoutParams.setMargins(0, 0, (int) C19137n.m62745a(this.f51573n, 10.0f), 0);
        this.f51564e.setLayoutParams(layoutParams);
        this.f51564e.setPadding(0, 0, 0, (int) C19137n.m62745a(this.f51573n, 10.0f));
        m62524h();
    }

    /* renamed from: b */
    public final void mo50720b() {
        this.f51569j.setVisibility(0);
    }

    /* renamed from: c */
    public final void mo50723c() {
        this.f51569j.setVisibility(8);
    }

    /* renamed from: d */
    public final boolean mo50725d() {
        if (this.f51562c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private void m62522f() {
        this.f51574o.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C19083d.this.mo50725d()) {
                    C19083d.this.f51562c.mo50730a();
                }
            }
        });
        this.f51566g.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                view.setVisibility(4);
                C19083d.this.f51560a.setVisibility(0);
                RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setDuration(800);
                rotateAnimation.setRepeatCount(10);
                rotateAnimation.setRepeatMode(1);
                rotateAnimation.setInterpolator(new LinearInterpolator());
                C19083d.this.f51560a.startAnimation(rotateAnimation);
                if (C19083d.this.mo50725d()) {
                    C19083d.this.f51562c.mo50730a();
                }
            }
        });
    }

    /* renamed from: i */
    private void m62525i() {
        if (this.f51563d) {
            this.f51574o.setVisibility(8);
            this.f51577r.setVisibility(8);
            this.f51578s.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final FrameLayout.LayoutParams mo50713a() {
        if (this.f51572m.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            return (FrameLayout.LayoutParams) this.f51572m.getLayoutParams();
        }
        return null;
    }

    /* renamed from: g */
    private void m62523g() {
        LayoutParams layoutParams = (LayoutParams) this.f51576q.getLayoutParams();
        layoutParams.height = C19129h.m62726h() - 4;
        this.f51576q.setLayoutParams(layoutParams);
        this.f51576q.setVisibility(4);
        this.f51574o.setPadding(4, 4, 0, 4);
    }

    /* renamed from: h */
    private void m62524h() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        layoutParams.setMargins(0, (int) C19137n.m62745a(this.f51573n, 14.0f), (int) C19137n.m62745a(this.f51573n, 9.0f), 0);
        this.f51565f.setLayoutParams(layoutParams);
    }

    /* renamed from: e */
    public final void mo50726e() {
        mo50721b(8);
        this.f51566g.setVisibility(4);
        this.f51564e.setVisibility(8);
        this.f51565f.setVisibility(8);
        this.f51567h.setVisibility(8);
        this.f51560a.setVisibility(4);
        m62525i();
    }

    /* renamed from: a */
    public final void mo50714a(int i) {
        this.f51572m.setVisibility(0);
        if (this.f51568i != null) {
            this.f51568i.setVisibility(i);
        }
    }

    /* renamed from: b */
    public final void mo50721b(int i) {
        C19137n.m62748a(this.f51572m, i);
    }

    /* renamed from: c */
    private int m62520c(int i) {
        if (this.f51570k <= 0 || this.f51571l <= 0) {
            return 0;
        }
        int dimensionPixelSize = this.f51573n.getResources().getDimensionPixelSize(R.dimen.mj);
        int dimensionPixelSize2 = this.f51573n.getResources().getDimensionPixelSize(R.dimen.mk);
        int i2 = (int) (((float) this.f51571l) * ((((float) i) * 1.0f) / ((float) this.f51570k)));
        if (i2 > dimensionPixelSize) {
            i2 = dimensionPixelSize;
        } else if (i2 < dimensionPixelSize2) {
            i2 = dimensionPixelSize2;
        }
        return i2;
    }

    /* renamed from: a */
    public final void mo50657a(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == this.f51568i.getHolder()) {
            this.f51561b = true;
            if (mo50725d()) {
                this.f51562c.mo50731a(this, surfaceHolder);
            }
        }
    }

    /* renamed from: b */
    public final void mo50659b(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == this.f51568i.getHolder()) {
            this.f51561b = false;
            if (mo50725d()) {
                this.f51562c.mo50734b(this, surfaceHolder);
            }
        }
    }

    /* renamed from: a */
    private void m62518a(View view) {
        if (view != null) {
            this.f51566g = (TextView) view.findViewById(R.id.de);
            this.f51564e = (FrameLayout) view.findViewById(R.id.dd);
            this.f51565f = (TextView) view.findViewById(R.id.dc);
            if (C19025f.m62177l() != 0) {
                this.f51565f.setText(C19025f.m62177l());
            } else {
                this.f51565f.setText(R.string.dwi);
            }
            this.f51560a = (ImageView) view.findViewById(R.id.dg);
            this.f51567h = (ImageView) view.findViewById(R.id.df);
            if (C19025f.m62185p() != 0) {
                this.f51567h.setImageResource(C19025f.m62185p());
            }
            this.f51575p = (TextView) view.findViewById(R.id.b5);
            this.f51574o = (FrameLayout) view.findViewById(R.id.b4);
            this.f51576q = (Space) view.findViewById(R.id.b3);
            this.f51577r = (TextView) view.findViewById(R.id.b7);
            this.f51578s = (TextView) view.findViewById(R.id.b6);
            if (C19025f.m62181n() != 0) {
                this.f51566g.setText(C19025f.m62181n());
            } else {
                this.f51566g.setText(R.string.dw4);
            }
            if (C19025f.m62183o() != 0) {
                this.f51560a.setImageResource(C19025f.m62183o());
            } else {
                this.f51560a.setImageResource(R.drawable.bjp);
            }
            if (C19025f.m62179m() != 0) {
                this.f51566g.setBackgroundResource(C19025f.m62179m());
                this.f51575p.setBackgroundResource(C19025f.m62179m());
            }
            this.f51568i = (SSRenderSurfaceView) view.findViewById(R.id.ebm);
            this.f51568i.mo50651a(this);
            this.f51569j = view.findViewById(R.id.eav);
            this.f51564e.setWillNotDraw(false);
            m62522f();
        }
    }

    /* renamed from: a */
    public final void mo50717a(ViewGroup viewGroup) {
        if (this.f51572m.getParent() != null) {
            ((ViewGroup) this.f51572m.getParent()).removeView(this.f51572m);
        }
        viewGroup.addView(this.f51572m);
        mo50721b(0);
    }

    /* renamed from: a */
    public final void mo50718a(FrameLayout.LayoutParams layoutParams) {
        this.f51572m.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final void mo50715a(int i, int i2) {
        this.f51570k = i;
        this.f51571l = i2;
    }

    /* renamed from: d */
    private void m62521d(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.f51572m.getLayoutParams();
        if (i == -1 || i == -2 || i > 0) {
            layoutParams.width = i;
        }
        if (i2 == -1 || i2 == -2 || i2 > 0) {
            layoutParams.height = i2;
        }
        this.f51572m.setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    public final void mo50722b(int i, int i2) {
        if (i == -1) {
            i = this.f51573n.getResources().getDisplayMetrics().widthPixels;
        }
        if (i > 0) {
            m62521d(i, m62520c(i));
        }
    }

    /* renamed from: c */
    public final void mo50724c(int i, int i2) {
        if (this.f51568i != null && (i != 0 || i2 != 0)) {
            ((LayoutParams) this.f51568i.getLayoutParams()).setMargins(i, i2, i, i2);
        }
    }

    C19083d(Context context, View view) {
        mo50721b(8);
        this.f51573n = context;
        m62518a(view);
        this.f51572m = view;
        if (this.f51572m != null) {
            this.f51572m.setOnTouchListener(this.f51579t);
        }
    }

    /* renamed from: b */
    private void m62519b(boolean z, boolean z2) {
        this.f51569j.setVisibility(8);
        if (z) {
            this.f51567h.setVisibility(0);
            this.f51578s.setVisibility(0);
            if (C19025f.m62148c()) {
                this.f51577r.setVisibility(0);
            }
        }
        if (z2) {
            m62523g();
            this.f51574o.setVisibility(0);
            this.f51575p.setBackgroundResource(R.drawable.bjl);
            this.f51575p.setTextColor(this.f51573n.getResources().getColor(R.color.a9q));
        }
    }

    /* renamed from: a */
    public final void mo50716a(View view, MotionEvent motionEvent) {
        if (mo50725d()) {
            this.f51562c.mo50733a(this, view, motionEvent);
        }
    }

    /* renamed from: a */
    public final void mo50658a(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder == this.f51568i.getHolder() && mo50725d()) {
            this.f51562c.mo50732a(this, surfaceHolder, i, i2, i3);
        }
    }
}
