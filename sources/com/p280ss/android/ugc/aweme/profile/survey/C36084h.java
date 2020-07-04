package com.p280ss.android.ugc.aweme.profile.survey;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p564d.C10789c;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.p1049ay.C23142a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Random;

/* renamed from: com.ss.android.ugc.aweme.profile.survey.h */
public abstract class C36084h implements OnClickListener {

    /* renamed from: i */
    private static final boolean f94329i = C7163a.m22363a();

    /* renamed from: a */
    public View f94330a;

    /* renamed from: b */
    public View f94331b;

    /* renamed from: c */
    public View f94332c;

    /* renamed from: d */
    TextView f94333d;

    /* renamed from: e */
    TextView f94334e;

    /* renamed from: f */
    public C36079d f94335f;

    /* renamed from: g */
    public C23142a f94336g;

    /* renamed from: h */
    public boolean f94337h;

    /* renamed from: j */
    private ViewStub f94338j;

    /* renamed from: k */
    private TextView f94339k;

    /* renamed from: l */
    private TextView f94340l;

    /* renamed from: m */
    private TextView f94341m;

    /* renamed from: n */
    private TextView f94342n;

    /* renamed from: o */
    private Animator f94343o;

    /* renamed from: p */
    private ValueAnimator f94344p;

    /* renamed from: q */
    private boolean f94345q;

    /* renamed from: r */
    private boolean f94346r;

    /* renamed from: i */
    private void m116219i() {
        this.f94345q = false;
    }

    /* renamed from: a */
    public abstract int mo91805a();

    /* renamed from: f */
    public final int mo91823f() {
        if (this.f94336g != null) {
            return this.f94336g.f61071a;
        }
        return 0;
    }

    /* renamed from: g */
    public final int mo91824g() {
        if (this.f94336g != null) {
            return this.f94336g.f61079i;
        }
        return 0;
    }

    /* renamed from: c */
    public final void mo91820c() {
        if (this.f94330a != null) {
            this.f94330a.setVisibility(8);
        }
        m116221k();
        this.f94337h = false;
    }

    /* renamed from: k */
    private void m116221k() {
        if (this.f94343o != null && this.f94344p != null) {
            if (this.f94343o.isStarted() || this.f94343o.isRunning()) {
                this.f94343o.cancel();
            }
            if (this.f94344p.isStarted() || this.f94344p.isRunning()) {
                this.f94344p.cancel();
            }
        }
    }

    /* renamed from: b */
    public final void mo91819b() {
        if (this.f94338j != null && m116217a(this.f94336g)) {
            if (this.f94330a == null) {
                this.f94330a = this.f94338j.inflate();
                mo91806a(this.f94330a);
            }
            m116219i();
            m116218b(this.f94336g);
            if (this.f94330a.getHeight() > 0) {
                mo91825h();
            } else {
                C23487o.m77142a(this.f94330a, (OnGlobalLayoutListener) new C36087i(this));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void mo91825h() {
        this.f94330a.setTranslationY((float) this.f94330a.getHeight());
        LayoutParams layoutParams = this.f94332c.getLayoutParams();
        layoutParams.height = this.f94330a.getHeight();
        this.f94332c.setLayoutParams(layoutParams);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f94330a, View.TRANSLATION_Y, new float[]{(float) this.f94330a.getMeasuredHeight(), 0.0f});
        ofFloat.setDuration(300);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C36084h.this.f94337h = true;
                if (C36084h.this.f94335f != null) {
                    C36084h.this.f94335f.mo91811a(C36084h.this.f94336g);
                }
            }

            public final void onAnimationStart(Animator animator) {
                C36084h.this.f94330a.setVisibility(0);
                C36084h.this.f94331b.setVisibility(0);
                C36084h.this.f94331b.setAlpha(1.0f);
                C36084h.this.f94332c.setVisibility(8);
            }
        });
        ofFloat.start();
    }

    /* renamed from: d */
    public final void mo91821d() {
        if (this.f94344p == null) {
            this.f94344p = ValueAnimator.ofFloat(new float[]{-1.0f, 0.0f, 1.0f});
            this.f94344p.addUpdateListener(new C36088j(this));
            this.f94344p.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    C36084h.this.mo91822e();
                }

                public final void onAnimationStart(Animator animator) {
                    C36084h.this.f94332c.setAlpha(0.0f);
                    C36084h.this.f94332c.setVisibility(0);
                }
            });
            this.f94344p.setDuration(600);
        }
        if (!this.f94344p.isStarted() && !this.f94344p.isRunning()) {
            this.f94344p.start();
        }
    }

    /* renamed from: e */
    public final void mo91822e() {
        if (!this.f94345q) {
            if (this.f94343o == null) {
                this.f94343o = ObjectAnimator.ofFloat(this.f94330a, View.TRANSLATION_Y, new float[]{0.0f, (float) this.f94330a.getHeight()});
                this.f94343o.setDuration(300);
                this.f94343o.setInterpolator(new DecelerateInterpolator());
                this.f94343o.setStartDelay(2000);
            }
            if (!this.f94343o.isStarted() && !this.f94343o.isRunning()) {
                this.f94343o.start();
            }
        }
    }

    C36084h(ViewStub viewStub) {
        this.f94338j = viewStub;
        if (this.f94338j.getLayoutResource() <= 0) {
            this.f94338j.setLayoutResource(mo91805a());
        }
    }

    /* renamed from: a */
    public static boolean m116217a(C23142a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.f61072b) || TextUtils.isEmpty(aVar.f61073c) || TextUtils.isEmpty(aVar.f61074d) || TextUtils.isEmpty(aVar.f61075e) || TextUtils.isEmpty(aVar.f61076f) || TextUtils.isEmpty(aVar.f61077g)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private void m116218b(C23142a aVar) {
        String str;
        String str2;
        if (aVar != null) {
            this.f94339k.setText(aVar.f61072b);
            this.f94340l.setText(aVar.f61073c);
            boolean z = true;
            if (new Random().nextInt(2) != 1) {
                z = false;
            }
            this.f94346r = z;
            TextView textView = this.f94333d;
            if (this.f94346r) {
                str = aVar.f61075e;
            } else {
                str = aVar.f61074d;
            }
            textView.setText(str);
            TextView textView2 = this.f94334e;
            if (this.f94346r) {
                str2 = aVar.f61074d;
            } else {
                str2 = aVar.f61075e;
            }
            textView2.setText(str2);
            this.f94341m.setText(aVar.f61076f);
            this.f94342n.setText(aVar.f61077g);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo91818a(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue <= 0.0f) {
            this.f94331b.setAlpha(Math.abs(floatValue));
            return;
        }
        if (this.f94331b.getAlpha() > 0.0f) {
            this.f94331b.setAlpha(0.0f);
        }
        this.f94332c.setAlpha(floatValue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91806a(View view) {
        this.f94331b = view.findViewById(R.id.ddx);
        this.f94339k = (TextView) this.f94331b.findViewById(R.id.de5);
        this.f94340l = (TextView) this.f94331b.findViewById(R.id.ddy);
        this.f94333d = (TextView) this.f94331b.findViewById(R.id.ddw);
        this.f94334e = (TextView) this.f94331b.findViewById(R.id.de0);
        this.f94332c = view.findViewById(R.id.de3);
        this.f94341m = (TextView) this.f94332c.findViewById(R.id.de4);
        this.f94342n = (TextView) this.f94332c.findViewById(R.id.de2);
        View findViewById = this.f94331b.findViewById(R.id.ddu);
        View findViewById2 = this.f94332c.findViewById(R.id.ddz);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        this.f94333d.setOnClickListener(this);
        this.f94334e.setOnClickListener(this);
        C10789c.m31503a(findViewById, 0.75f);
        C10789c.m31503a(findViewById2, 0.75f);
    }

    public void onClick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.ddu) {
            if (this.f94335f != null) {
                this.f94335f.mo91812a(this.f94336g, 3, "");
            }
        } else if (id == R.id.ddw) {
            if (this.f94335f != null) {
                if (this.f94346r) {
                    C36079d dVar = this.f94335f;
                    C23142a aVar = this.f94336g;
                    if (!TextUtils.isEmpty(this.f94336g.f61081k)) {
                        str4 = this.f94336g.f61081k;
                    } else {
                        str4 = this.f94336g.f61075e;
                    }
                    dVar.mo91812a(aVar, 2, str4);
                    return;
                }
                C36079d dVar2 = this.f94335f;
                C23142a aVar2 = this.f94336g;
                if (!TextUtils.isEmpty(this.f94336g.f61080j)) {
                    str3 = this.f94336g.f61080j;
                } else {
                    str3 = this.f94336g.f61074d;
                }
                dVar2.mo91812a(aVar2, 1, str3);
            }
        } else if (id == R.id.de0) {
            if (this.f94335f != null) {
                if (this.f94346r) {
                    C36079d dVar3 = this.f94335f;
                    C23142a aVar3 = this.f94336g;
                    if (!TextUtils.isEmpty(this.f94336g.f61080j)) {
                        str2 = this.f94336g.f61080j;
                    } else {
                        str2 = this.f94336g.f61074d;
                    }
                    dVar3.mo91812a(aVar3, 1, str2);
                    return;
                }
                C36079d dVar4 = this.f94335f;
                C23142a aVar4 = this.f94336g;
                if (!TextUtils.isEmpty(this.f94336g.f61081k)) {
                    str = this.f94336g.f61081k;
                } else {
                    str = this.f94336g.f61075e;
                }
                dVar4.mo91812a(aVar4, 2, str);
            }
        } else if (id == R.id.ddz) {
            this.f94345q = true;
            m116221k();
            if (this.f94335f != null) {
                this.f94335f.mo91810a();
            }
        }
    }
}
