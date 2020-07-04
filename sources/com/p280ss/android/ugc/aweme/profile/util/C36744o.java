package com.p280ss.android.ugc.aweme.profile.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p022v4.content.C0683b;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.profile.p1487ui.header.C36530bb;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.util.o */
public final class C36744o {

    /* renamed from: h */
    public static final int f96433h;

    /* renamed from: a */
    public float f96434a;

    /* renamed from: b */
    public float f96435b;

    /* renamed from: c */
    public Context f96436c;

    /* renamed from: d */
    public TextView f96437d;

    /* renamed from: e */
    public View f96438e;

    /* renamed from: f */
    public DmtTextView f96439f;

    /* renamed from: g */
    public boolean f96440g;

    /* renamed from: i */
    private float f96441i;

    /* renamed from: j */
    private float f96442j;

    /* renamed from: k */
    private float f96443k;

    /* renamed from: l */
    private int f96444l;

    /* renamed from: m */
    private int f96445m = -1;

    /* renamed from: n */
    private int f96446n;

    /* renamed from: o */
    private TextView f96447o;

    /* renamed from: p */
    private RemoteImageView f96448p;

    /* renamed from: q */
    private TextView f96449q;

    /* renamed from: r */
    private ImageView f96450r;

    /* renamed from: s */
    private FrameLayout f96451s;

    /* renamed from: t */
    private ValueAnimator f96452t;

    /* renamed from: u */
    private ValueAnimator f96453u;

    /* renamed from: v */
    private boolean f96454v;

    /* renamed from: w */
    private boolean f96455w;

    /* renamed from: n */
    private boolean m118450n() {
        if (!this.f96440g) {
            return true;
        }
        return false;
    }

    static {
        int i;
        if (!C36530bb.m117956c()) {
            i = C36530bb.m117951a();
        } else {
            i = -4;
        }
        f96433h = i;
    }

    /* renamed from: c */
    private void m118436c() {
        this.f96437d.setVisibility(8);
        m118439e();
    }

    /* renamed from: d */
    private void m118438d() {
        if (this.f96448p != null) {
            this.f96448p.setVisibility(8);
        }
    }

    /* renamed from: m */
    private boolean m118449m() {
        if (!this.f96440g || this.f96455w) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private void m118447k() {
        if (this.f96452t != null) {
            this.f96452t.cancel();
            this.f96452t.setupEndValues();
        }
        if (this.f96453u != null) {
            this.f96453u.cancel();
            this.f96453u.setupEndValues();
        }
    }

    /* renamed from: l */
    private void m118448l() {
        if (!C30553b.m99785a() || (!this.f96455w && C36530bb.m117956c())) {
            this.f96438e.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo93064a() {
        int i;
        if (this.f96444l > 0) {
            i = this.f96444l;
        } else {
            i = C9738o.m28691a(this.f96436c);
        }
        this.f96435b = m118437d(i);
        this.f96439f.getLayoutParams().width = (int) this.f96435b;
    }

    /* renamed from: g */
    private void m118443g() {
        this.f96437d.setVisibility(8);
        this.f96438e.setVisibility(8);
        this.f96448p.setVisibility(8);
        this.f96439f.setVisibility(8);
        this.f96449q.getLayoutParams().width = (int) this.f96443k;
        this.f96449q.setVisibility(0);
        this.f96449q.requestLayout();
    }

    /* renamed from: b */
    public final void mo93068b() {
        this.f96434a = m118435c(this.f96444l);
        this.f96437d.getLayoutParams().width = (int) this.f96434a;
        this.f96437d.getLayoutParams().height = (int) this.f96441i;
        mo93067a(this.f96437d, (int) this.f96434a);
        this.f96437d.requestLayout();
    }

    /* renamed from: e */
    private void m118439e() {
        if (this.f96445m == 2) {
            if (C6399b.m19946v()) {
                this.f96439f.setText(R.string.aua);
            } else {
                m118434a(this.f96439f, R.drawable.bgg, R.string.aua);
            }
        } else if (this.f96445m == 1) {
            this.f96439f.setText(R.string.b7y);
        } else if (this.f96445m == 4) {
            this.f96439f.setText(R.string.b8v);
        }
        this.f96439f.getLayoutParams().width = (int) this.f96435b;
        this.f96439f.setVisibility(0);
        this.f96439f.requestLayout();
    }

    /* renamed from: f */
    private void m118441f() {
        this.f96438e.setVisibility(8);
        this.f96449q.setVisibility(8);
        this.f96448p.setVisibility(8);
        this.f96439f.setVisibility(8);
        if (this.f96450r != null) {
            this.f96450r.setVisibility(0);
            this.f96450r.getLayoutParams().width = (int) this.f96442j;
            this.f96450r.requestLayout();
        }
        this.f96437d.getLayoutParams().width = (int) this.f96434a;
        this.f96437d.getLayoutParams().height = (int) this.f96441i;
        mo93067a(this.f96437d, (int) this.f96434a);
        this.f96437d.setVisibility(0);
        this.f96437d.requestLayout();
    }

    /* renamed from: h */
    private void m118444h() {
        int i = 0;
        if (C6399b.m19947w()) {
            if (this.f96451s != null) {
                this.f96451s.setVisibility(0);
            }
        } else if (!C6399b.m19944t() && this.f96451s != null) {
            if (this.f96455w || !C21115b.m71197a().isLogin() || !C7213d.m22500a().mo18808h() || this.f96440g) {
                i = 8;
            }
            if (this.f96451s.getVisibility() != i) {
                this.f96451s.setVisibility(i);
            }
        }
    }

    /* renamed from: i */
    private void m118445i() {
        if (!this.f96455w) {
            this.f96438e.getLayoutParams().width = (int) C9738o.m28708b(this.f96436c, (float) f96433h);
            this.f96438e.setVisibility(0);
            View findViewById = this.f96438e.findViewById(R.id.d38);
            if (findViewById != null) {
                findViewById.setTranslationX(0.0f);
            }
            if (f96433h > 0) {
                ((LayoutParams) this.f96439f.getLayoutParams()).rightMargin = (int) C9738o.m28708b(this.f96436c, 4.0f);
            } else {
                ((LayoutParams) this.f96439f.getLayoutParams()).rightMargin = (int) C9738o.m28708b(this.f96436c, 0.0f);
            }
            m118448l();
            return;
        }
        if (!C6399b.m19944t() && this.f96450r != null) {
            this.f96450r.setVisibility(0);
        }
    }

    /* renamed from: j */
    private void m118446j() {
        m118447k();
        if (this.f96455w) {
            this.f96437d.getLayoutParams().width = (int) this.f96434a;
            this.f96437d.getLayoutParams().height = (int) this.f96441i;
            mo93067a(this.f96437d, (int) this.f96434a);
            this.f96437d.setVisibility(0);
            this.f96439f.setVisibility(8);
            return;
        }
        this.f96453u = ValueAnimator.ofInt(new int[]{(int) this.f96435b, (int) this.f96434a});
        this.f96453u.setInterpolator(new LinearInterpolator());
        this.f96453u.addUpdateListener(new AnimatorUpdateListener() {

            /* renamed from: b */
            private IntEvaluator f96457b = new IntEvaluator();

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                C36744o.this.f96439f.getLayoutParams().width = this.f96457b.evaluate(animatedFraction, Integer.valueOf((int) C36744o.this.f96435b), Integer.valueOf((int) C36744o.this.f96434a)).intValue();
                if (C36744o.f96433h > 0) {
                    ((LayoutParams) C36744o.this.f96439f.getLayoutParams()).rightMargin = this.f96457b.evaluate(animatedFraction, Integer.valueOf((int) C9738o.m28708b(C36744o.this.f96436c, 4.0f)), Integer.valueOf(0)).intValue();
                }
                C36744o.this.mo93067a((TextView) C36744o.this.f96439f, C36744o.this.f96439f.getLayoutParams().width);
                C36744o.this.f96439f.requestLayout();
                int intValue = this.f96457b.evaluate(animatedFraction, Integer.valueOf((int) C9738o.m28708b(C36744o.this.f96436c, (float) C36744o.f96433h)), Integer.valueOf(0)).intValue();
                C36744o.this.f96438e.getLayoutParams().width = intValue;
                View findViewById = C36744o.this.f96438e.findViewById(R.id.d38);
                if (findViewById != null && findViewById.getVisibility() == 0) {
                    findViewById.setTranslationX((C9738o.m28708b(C36744o.this.f96436c, (float) C36744o.f96433h) - ((float) intValue)) / 4.0f);
                }
                C36744o.this.f96438e.requestLayout();
            }
        });
        this.f96453u.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                C36744o.this.f96439f.setTextColor(C0683b.m2912c(C36744o.this.f96436c, R.color.az3));
            }

            public final void onAnimationEnd(Animator animator) {
                C36744o.this.f96439f.setVisibility(8);
                C36744o.this.f96438e.setVisibility(8);
                C36744o.this.f96437d.setVisibility(0);
                C36744o.this.f96439f.setBackground(C0683b.m2903a(C36744o.this.f96436c, (int) R.drawable.bg_followed));
                C36744o.this.f96439f.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                C36744o.this.f96439f.setPadding(0, 0, 0, 0);
                C36744o.this.f96439f.setText(R.string.b7y);
                C36744o.this.f96439f.setTextColor(C0683b.m2912c(C36744o.this.f96436c, R.color.ql));
            }
        });
        this.f96453u.setDuration(300).start();
    }

    /* renamed from: c */
    private float m118435c(int i) {
        int i2;
        int a = ((i - (C23486n.m77122a(16.0d) * 2)) - C23486n.m77122a(94.0d)) - C23486n.m77122a(20.0d);
        if (m118449m()) {
            i2 = C23486n.m77122a(40.0d);
        } else {
            i2 = 0;
        }
        return (float) ((a - i2) - C23486n.m77122a(4.0d));
    }

    /* renamed from: a */
    public final void mo93065a(int i) {
        this.f96444l = C23486n.m77122a((double) i);
        this.f96434a = m118435c(this.f96444l);
        this.f96435b = m118437d(this.f96444l);
    }

    /* renamed from: d */
    private float m118437d(int i) {
        if (this.f96455w) {
            float a = (float) ((((i - (C23486n.m77122a(16.0d) * 2)) - C23486n.m77122a(94.0d)) - C23486n.m77122a(4.0d)) - C23486n.m77122a(20.0d));
            if (m118450n()) {
                a -= (float) C23486n.m77122a(40.0d);
            }
            return a;
        }
        float a2 = (float) (((((i - (C23486n.m77122a(16.0d) * 2)) - C23486n.m77122a((double) f96433h)) - C23486n.m77122a(94.0d)) - (C23486n.m77122a(4.0d) * 2)) - C23486n.m77122a(20.0d));
        if (m118450n()) {
            a2 -= (float) C23486n.m77122a(40.0d);
        }
        return a2;
    }

    /* renamed from: b */
    public final void mo93069b(int i) {
        this.f96445m = i;
        if (i == 0) {
            m118441f();
            m118444h();
        } else if (i == 1) {
            m118436c();
            m118445i();
            m118444h();
        } else if (i == 2) {
            m118436c();
            m118445i();
            m118444h();
        } else if (i == 4) {
            m118443g();
            m118444h();
        }
        m118440e(i);
    }

    /* renamed from: a */
    private void m118433a(Context context) {
        float f;
        if (this.f96434a == 0.0f) {
            this.f96434a = m118435c(C9738o.m28691a(context));
        }
        if (this.f96441i == 0.0f) {
            this.f96441i = C9738o.m28708b(context, 40.0f);
        }
        if (this.f96442j == 0.0f) {
            this.f96442j = C9738o.m28708b(context, 40.0f);
        }
        if (this.f96443k == 0.0f) {
            float a = (((float) C9738o.m28691a(context)) - C9738o.m28708b(context, 94.0f)) - (C9738o.m28708b(context, 16.0f) * 2.0f);
            if (m118449m()) {
                f = C9738o.m28708b(context, 40.0f);
            } else {
                f = 0.0f;
            }
            this.f96443k = ((a - f) - C9738o.m28708b(context, 4.0f)) - C9738o.m28708b(context, 20.0f);
        }
        if (this.f96435b == 0.0f) {
            this.f96435b = m118437d(C9738o.m28691a(context));
        }
        if (C6399b.m19944t()) {
            this.f96439f.setFontType(C10834d.f29337g);
        }
    }

    /* renamed from: e */
    private void m118440e(int i) {
        if (this.f96447o != null) {
            this.f96447o.setVisibility(0);
            Resources resources = this.f96447o.getContext().getResources();
            if (i == 0) {
                this.f96447o.setBackgroundResource(R.drawable.lv);
                this.f96447o.setTextColor(resources.getColor(R.color.a5e));
                this.f96447o.setText(resources.getText(R.string.b7r));
                return;
            }
            if (i == 1 || i == 2) {
                this.f96447o.setTextColor(resources.getColor(R.color.a5h));
                this.f96447o.setBackgroundResource(R.drawable.bg_followed);
                int i2 = R.string.b92;
                if (i == 2) {
                    i2 = R.string.aua;
                }
                this.f96447o.setText(i2);
            }
        }
    }

    /* renamed from: f */
    private void m118442f(int i) {
        m118447k();
        if (this.f96455w) {
            this.f96437d.setVisibility(8);
            if (i == 1) {
                this.f96439f.setText(R.string.b7y);
            } else if (i == 2) {
                if (C6399b.m19946v()) {
                    this.f96439f.setText(R.string.aua);
                } else {
                    m118434a(this.f96439f, R.drawable.bgg, R.string.aua);
                }
            }
            this.f96439f.getLayoutParams().width = (int) this.f96435b;
            this.f96439f.setVisibility(0);
            return;
        }
        this.f96449q.setVisibility(8);
        this.f96437d.setVisibility(8);
        this.f96439f.getLayoutParams().width = (int) this.f96434a;
        this.f96439f.setVisibility(0);
        this.f96438e.setVisibility(0);
        if (i == 1) {
            this.f96439f.setText(R.string.b7y);
        } else if (i == 2) {
            if (C6399b.m19946v()) {
                this.f96439f.setText(R.string.aua);
            } else {
                m118434a(this.f96439f, R.drawable.bgg, R.string.aua);
            }
        }
        m118448l();
        this.f96452t = ValueAnimator.ofInt(new int[]{(int) this.f96434a, (int) this.f96435b});
        this.f96452t.setInterpolator(new LinearInterpolator());
        this.f96452t.addUpdateListener(new AnimatorUpdateListener() {

            /* renamed from: b */
            private IntEvaluator f96460b = new IntEvaluator();

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                C36744o.this.f96439f.getLayoutParams().width = this.f96460b.evaluate(animatedFraction, Integer.valueOf((int) C36744o.this.f96434a), Integer.valueOf((int) C36744o.this.f96435b)).intValue();
                if (C36744o.f96433h > 0) {
                    ((LayoutParams) C36744o.this.f96439f.getLayoutParams()).rightMargin = this.f96460b.evaluate(animatedFraction, Integer.valueOf(0), Integer.valueOf((int) C9738o.m28708b(C36744o.this.f96436c, 4.0f))).intValue();
                }
                C36744o.this.f96439f.requestLayout();
                int intValue = this.f96460b.evaluate(animatedFraction, Integer.valueOf(0), Integer.valueOf((int) C9738o.m28708b(C36744o.this.f96436c, (float) C36744o.f96433h))).intValue();
                C36744o.this.f96438e.getLayoutParams().width = intValue;
                View findViewById = C36744o.this.f96438e.findViewById(R.id.d38);
                if (findViewById != null && findViewById.getVisibility() == 0) {
                    findViewById.setTranslationX((C9738o.m28708b(C36744o.this.f96436c, (float) C36744o.f96433h) - ((float) intValue)) / 4.0f);
                }
                C36744o.this.f96438e.requestLayout();
            }
        });
        this.f96452t.setDuration(300).start();
    }

    /* renamed from: b */
    public final void mo93070b(int i, int i2) {
        this.f96445m = i;
        if (i == 0) {
            m118441f();
            m118444h();
        } else if (i == 1) {
            m118436c();
            m118445i();
            m118444h();
        } else if (i == 2) {
            m118436c();
            m118445i();
            m118444h();
        } else if (i == 4) {
            m118443g();
            m118444h();
        }
        m118440e(i);
    }

    /* renamed from: a */
    public final void mo93066a(int i, int i2) {
        int i3;
        int i4;
        if (this.f96445m != i) {
            this.f96445m = i;
            this.f96446n = i2;
            if (this.f96451s != null) {
                FrameLayout frameLayout = this.f96451s;
                if (this.f96440g) {
                    i3 = 8;
                } else {
                    i3 = 0;
                }
                frameLayout.setVisibility(i3);
                if (this.f96444l > 0) {
                    i4 = this.f96444l;
                } else {
                    i4 = C9738o.m28691a(this.f96436c);
                }
                this.f96435b = m118437d(i4);
            }
            if (i == 0) {
                m118446j();
                m118438d();
                m118444h();
            } else if (i == 1) {
                m118442f(i);
                m118444h();
            } else if (i == 2) {
                m118442f(i);
                m118444h();
            } else if (i == 4) {
                m118443g();
                m118444h();
            }
            m118440e(i);
        }
    }

    /* renamed from: a */
    public final void mo93067a(TextView textView, int i) {
        Rect rect = new Rect();
        textView.getPaint().getTextBounds(this.f96436c.getString(R.string.b7r), 0, this.f96436c.getString(R.string.b7r).length(), rect);
        int b = (int) ((((((float) i) - C9738o.m28708b(this.f96436c, 16.0f)) - ((float) rect.width())) - C9738o.m28708b(this.f96436c, 4.0f)) / 2.0f);
        int b2 = (int) ((C9738o.m28708b(this.f96436c, 40.0f) - C9738o.m28708b(this.f96436c, 21.0f)) / 2.0f);
        textView.setPadding(b, b2, b, b2);
        textView.setBackground(C0683b.m2903a(this.f96436c, (int) R.drawable.r2));
        Drawable a = C0683b.m2903a(this.f96436c, (int) R.drawable.axn);
        a.setBounds(0, 0, a.getIntrinsicWidth(), a.getIntrinsicHeight());
        textView.setCompoundDrawables(a, null, null, null);
        textView.setText(this.f96436c.getString(R.string.b7r));
    }

    /* renamed from: a */
    private static void m118434a(TextView textView, int i, int i2) {
        int i3;
        if (textView != null) {
            C36728am amVar = new C36728am(textView.getContext(), R.drawable.bgg, 1);
            if (C43127fh.m136806a(textView.getContext())) {
                i3 = -4;
            } else {
                i3 = 4;
            }
            amVar.f96392a = (int) C9738o.m28708b(textView.getContext(), (float) i3);
            StringBuilder sb = new StringBuilder("#  ");
            sb.append(textView.getResources().getString(R.string.aua));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
            spannableStringBuilder.setSpan(amVar, 0, 1, 18);
            textView.setText(spannableStringBuilder, BufferType.SPANNABLE);
        }
    }

    public C36744o(Context context, TextView textView, TextView textView2, View view, RemoteImageView remoteImageView, DmtTextView dmtTextView, TextView textView3, ImageView imageView, boolean z, boolean z2, FrameLayout frameLayout, boolean z3) {
        this.f96444l = C9738o.m28691a(context);
        this.f96437d = textView;
        this.f96447o = textView2;
        this.f96438e = view;
        this.f96448p = remoteImageView;
        this.f96439f = dmtTextView;
        this.f96449q = textView3;
        this.f96436c = context;
        this.f96454v = z;
        this.f96450r = imageView;
        this.f96455w = z2;
        this.f96451s = frameLayout;
        this.f96440g = z3;
        m118433a(context);
    }
}
