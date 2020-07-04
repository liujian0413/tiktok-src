package com.p280ss.android.ugc.aweme.translation.p1682ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p564d.C10789c;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.translation.ui.TranslationStatusView */
public class TranslationStatusView extends FrameLayout {

    /* renamed from: a */
    public LinearLayout f110781a;

    /* renamed from: b */
    public C42627b f110782b;

    /* renamed from: c */
    public ObjectAnimator f110783c;

    /* renamed from: d */
    private DmtTextView f110784d;

    /* renamed from: e */
    private DmtTextView f110785e;

    /* renamed from: f */
    private C42626a f110786f;

    /* renamed from: g */
    private ImageView f110787g;

    /* renamed from: h */
    private DmtTextView f110788h;

    /* renamed from: i */
    private int f110789i;

    /* renamed from: com.ss.android.ugc.aweme.translation.ui.TranslationStatusView$a */
    public interface C42626a {
        /* renamed from: a */
        void mo74046a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.translation.ui.TranslationStatusView$b */
    public interface C42627b {
        /* renamed from: a */
        void mo74055a(View view);

        /* renamed from: a */
        void mo74056a(View view, boolean z);
    }

    public int getStatus() {
        return this.f110789i;
    }

    public C42626a getmUploadMobListener() {
        return this.f110786f;
    }

    /* renamed from: j */
    private static LayoutParams m135426j() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.gravity = 16;
        return layoutParams;
    }

    /* renamed from: b */
    public final void mo104218b() {
        setStatus(1);
        if (this.f110782b != null) {
            this.f110782b.mo74056a(this.f110784d, true);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f110783c.cancel();
    }

    /* renamed from: e */
    private void m135421e() {
        m135422f();
        m135423g();
        m135424h();
        mo104220d();
        addView(this.f110785e);
        addView(this.f110781a);
        addView(this.f110784d);
    }

    /* renamed from: c */
    public final void mo104219c() {
        this.f110784d.getPaint().setFakeBoldText(false);
        this.f110785e.getPaint().setFakeBoldText(false);
        this.f110788h.getPaint().setFakeBoldText(false);
    }

    /* renamed from: d */
    public final void mo104220d() {
        this.f110789i = 0;
        this.f110784d.setAlpha(1.0f);
        this.f110784d.setVisibility(0);
        this.f110781a.setVisibility(8);
        this.f110785e.setVisibility(8);
    }

    /* renamed from: f */
    private void m135422f() {
        this.f110784d = m135425i();
        this.f110784d.setText(R.string.dl6);
        this.f110784d.setLayoutParams(m135426j());
        this.f110784d.setGravity(16);
        C10789c.m31502a(this.f110784d);
        this.f110784d.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                TranslationStatusView.this.setStatus(1);
                if (TranslationStatusView.this.f110782b != null) {
                    TranslationStatusView.this.f110782b.mo74056a(view, false);
                }
            }
        });
    }

    /* renamed from: h */
    private void m135424h() {
        this.f110785e = m135425i();
        this.f110785e.setText(R.string.dl4);
        this.f110785e.setLayoutParams(m135426j());
        this.f110785e.setGravity(16);
        C10789c.m31502a(this.f110785e);
        this.f110785e.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                TranslationStatusView.this.setStatus(0);
                if (TranslationStatusView.this.f110782b != null) {
                    TranslationStatusView.this.f110782b.mo74055a(view);
                }
            }
        });
    }

    /* renamed from: i */
    private DmtTextView m135425i() {
        DmtTextView dmtTextView = new DmtTextView(getContext());
        dmtTextView.setTextSize(13.0f);
        dmtTextView.getPaint().setFakeBoldText(true);
        dmtTextView.setTextColor(getContext().getResources().getColor(R.color.lt));
        return dmtTextView;
    }

    /* renamed from: a */
    public final void mo104217a() {
        if (this.f110784d != null) {
            this.f110784d.setFontType(C10834d.f29332b);
        }
        if (this.f110785e != null) {
            this.f110785e.setFontType(C10834d.f29332b);
        }
        if (this.f110788h != null) {
            this.f110788h.setFontType(C10834d.f29332b);
        }
    }

    /* renamed from: g */
    private void m135423g() {
        this.f110781a = new LinearLayout(getContext());
        this.f110781a.setLayoutParams(new LayoutParams(-2, -1));
        this.f110781a.setOrientation(0);
        this.f110787g = new ImageView(getContext());
        this.f110787g.setImageResource(R.drawable.alw);
        this.f110783c = ObjectAnimator.ofFloat(this.f110787g, "rotation", new float[]{0.0f, 360.0f}).setDuration(800);
        this.f110783c.setInterpolator(new LinearInterpolator());
        this.f110783c.setRepeatCount(-1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        this.f110787g.setLayoutParams(layoutParams);
        this.f110781a.addView(this.f110787g);
        this.f110788h = m135425i();
        this.f110788h.setText(R.string.no);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = (int) C9738o.m28708b(getContext(), 6.0f);
        layoutParams2.gravity = 16;
        this.f110788h.setLayoutParams(layoutParams2);
        this.f110781a.addView(this.f110788h);
    }

    public void setOnTranslationViewClickListener(C42627b bVar) {
        this.f110782b = bVar;
    }

    public void setmUploadMobListener(C42626a aVar) {
        this.f110786f = aVar;
    }

    public TranslationStatusView(Context context) {
        this(context, null);
    }

    public void setLoadingDrawable(int i) {
        this.f110787g.setImageResource(i);
    }

    /* renamed from: a */
    private View m135419a(int i) {
        DmtTextView dmtTextView = this.f110784d;
        switch (i) {
            case 0:
                return this.f110784d;
            case 1:
                return this.f110781a;
            case 2:
                return this.f110785e;
            default:
                return dmtTextView;
        }
    }

    public void setStatus(int i) {
        if (this.f110786f != null) {
            this.f110786f.mo74046a(i);
        }
        if (this.f110789i != i) {
            m135420a(m135419a(this.f110789i), m135419a(i));
            this.f110789i = i;
        }
    }

    public void setStatusWithoutAnim(int i) {
        if (this.f110789i != i) {
            View a = m135419a(this.f110789i);
            View a2 = m135419a(i);
            a.setVisibility(8);
            a2.setVisibility(0);
            a2.setAlpha(1.0f);
            this.f110789i = i;
            if (this.f110786f != null) {
                this.f110786f.mo74046a(this.f110789i);
            }
        }
    }

    public void setTextColor(int i) {
        this.f110788h.setTextColor(getContext().getResources().getColor(i));
        this.f110784d.setTextColor(getContext().getResources().getColor(i));
        this.f110785e.setTextColor(getContext().getResources().getColor(i));
    }

    public TranslationStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m135420a(final View view, final View view2) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f}).setDuration(150);
        duration.setInterpolator(new LinearInterpolator());
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view2, "alpha", new float[]{0.0f, 1.0f}).setDuration(150);
        duration2.setInterpolator(new LinearInterpolator());
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                view.setVisibility(8);
                view2.setVisibility(0);
                if (view == TranslationStatusView.this.f110781a) {
                    TranslationStatusView.this.f110783c.cancel();
                }
                if (view2 == TranslationStatusView.this.f110781a) {
                    TranslationStatusView.this.f110783c.start();
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{duration, duration2});
        animatorSet.start();
    }

    public TranslationStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m135421e();
    }
}
