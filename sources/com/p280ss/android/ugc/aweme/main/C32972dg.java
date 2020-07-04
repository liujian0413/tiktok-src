package com.p280ss.android.ugc.aweme.main;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p562b.C10743b;
import com.bytedance.ies.dmt.p262ui.p562b.C10744c;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.main.dg */
public final class C32972dg extends C32857a {

    /* renamed from: a */
    private Activity f85925a;

    /* renamed from: b */
    private ViewGroup f85926b;

    /* renamed from: c */
    private ImageView f85927c;

    /* renamed from: d */
    private int[] f85928d = {0, 0, 0, 0};

    /* renamed from: e */
    private int[] f85929e = {7, 3, 6, 44};

    /* renamed from: f */
    private TextView[] f85930f = new TextView[4];

    /* renamed from: g */
    private int[] f85931g = {R.id.dsv, R.id.dsw, R.id.dss, R.id.dst};

    /* renamed from: h */
    private int[] f85932h = {R.drawable.a8j, R.drawable.a8k, R.drawable.a8h, R.drawable.a8i};

    /* renamed from: i */
    private AnimatorSet f85933i;

    public final View getContentView() {
        return this.f85926b;
    }

    /* renamed from: d */
    private boolean m106606d() {
        for (int i : this.f85928d) {
            if (i > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m106602b() {
        this.f85929e = new int[]{7, 3, 26, 44};
        for (int i = 0; i < this.f85929e.length; i++) {
            this.f85928d[i] = C34315c.m110974a(this.f85929e[i]);
            if (this.f85928d[i] > 0) {
                m106601a(this.f85930f[i], this.f85928d[i]);
            }
        }
    }

    /* renamed from: c */
    private void m106604c() {
        int i = 0;
        for (int i2 = 0; i2 < this.f85929e.length; i2++) {
            boolean z = true;
            this.f85928d[i2] = C34315c.m110974a(this.f85929e[i2]);
            if (this.f85928d[i2] > 0) {
                m106601a(this.f85930f[i], this.f85928d[i2]);
                int i3 = this.f85932h[i2];
                TextView textView = this.f85930f[i];
                if (i >= this.f85929e.length - 1) {
                    z = false;
                }
                m106599a(i3, textView, z);
                i++;
            }
        }
        if (i < this.f85928d.length && i > 0) {
            int i4 = i - 1;
            ((LayoutParams) this.f85930f[i4].getLayoutParams()).rightMargin = 0;
            this.f85930f[i4].setCompoundDrawables(this.f85930f[i4].getCompoundDrawables()[0], null, null, null);
        }
    }

    /* renamed from: e */
    private void m106607e() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(200);
        ofFloat.setInterpolator(new C10744c());
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C32972dg.this.getContentView().setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                C32972dg.this.getContentView().setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                C32972dg.this.getContentView().setVisibility(0);
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, -10.0f});
        ofFloat2.setDuration(200);
        ofFloat2.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C32972dg.this.getContentView().setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{-10.0f, 0.0f});
        ofFloat3.setDuration(500);
        ofFloat3.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C32972dg.this.getContentView().setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat3.setStartDelay(200);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{0.0f, -10.0f});
        ofFloat4.setDuration(150);
        ofFloat4.setStartDelay(5700);
        ofFloat4.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C32972dg.this.getContentView().setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(new float[]{-10.0f, 0.0f});
        ofFloat5.setDuration(300);
        ofFloat5.setStartDelay(5850);
        ofFloat5.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C32972dg.this.getContentView().setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat6.setDuration(300);
        ofFloat6.setStartDelay(5850);
        ofFloat6.setInterpolator(new C10743b());
        ofFloat6.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C32972dg.this.getContentView().setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                C32972dg.this.getContentView().setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat6.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C32972dg.this.mo84587a();
            }
        });
        this.f85933i = new AnimatorSet();
        this.f85933i.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6});
        this.f85933i.start();
    }

    /* renamed from: a */
    public final void mo84587a() {
        if (this.f85933i != null && this.f85925a != null && !this.f85925a.isFinishing() && isShowing()) {
            getContentView().clearAnimation();
            this.f85933i.cancel();
            try {
                dismiss();
            } catch (Exception e) {
                C6921a.m21559a((Throwable) e);
            }
        }
    }

    /* renamed from: a */
    private void m106598a(int i) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f85927c.getLayoutParams();
        marginLayoutParams.leftMargin = i;
        this.f85927c.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: b */
    private void m106603b(View view) {
        for (int i = 0; i < this.f85931g.length; i++) {
            this.f85930f[i] = (TextView) view.findViewById(this.f85931g[i]);
        }
        this.f85926b = (ViewGroup) view.findViewById(R.id.cws);
        this.f85927c = (ImageView) view.findViewById(R.id.b6o);
    }

    /* renamed from: c */
    private void m106605c(View view) {
        setContentView(view);
        setBackgroundDrawable(new ColorDrawable(this.f85925a.getResources().getColor(R.color.ayd)));
        setOutsideTouchable(false);
        setWidth(-2);
        setHeight(-2);
        update();
    }

    public C32972dg(Activity activity) {
        super(activity);
        this.f85925a = activity;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.agu, null, false);
        m106605c(inflate);
        m106603b(inflate);
    }

    /* renamed from: a */
    public final boolean mo84588a(View view) {
        if (C6399b.m19946v()) {
            m106602b();
        } else {
            m106604c();
        }
        if (!m106606d() || view == null) {
            dismiss();
            return false;
        }
        if (this.f85925a != null && !isShowing() && !this.f85925a.isFinishing()) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            getContentView().setVisibility(4);
            showAtLocation(view, 51, iArr[0], iArr[1] - view.getHeight());
            this.f85926b.measure(0, 0);
            if (C6399b.m19946v()) {
                m106600a(view, 8.0f);
            } else {
                m106600a(view, 10.0f);
            }
            m106607e();
        }
        return true;
    }

    /* renamed from: a */
    private void m106600a(View view, float f) {
        float f2;
        boolean a = C43127fh.m136806a(this.f85925a);
        int measuredWidth = this.f85926b.getMeasuredWidth();
        int measuredHeight = this.f85926b.getMeasuredHeight();
        int a2 = C9738o.m28691a((Context) this.f85925a);
        int measuredWidth2 = this.f85927c.getMeasuredWidth();
        int measuredWidth3 = view.getMeasuredWidth();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        float f3 = (float) measuredWidth;
        float f4 = f3 / 2.0f;
        float f5 = (((float) measuredWidth3) / 2.0f) + ((float) iArr[0]);
        if (!a) {
            float f6 = (float) a2;
            if (((float) (measuredWidth / 2)) + f5 >= f6) {
                f2 = f3 - (f6 - f5);
                m106598a((int) (f2 - (((float) measuredWidth2) / 2.0f)));
                update((int) (f5 - f4), (int) (((float) (iArr[1] - view.getHeight())) - C9738o.m28708b(C6399b.m19921a(), f)), measuredWidth, measuredHeight);
                this.f85926b.setPivotX(f2);
                this.f85926b.setPivotY((float) measuredHeight);
            }
        } else if (f5 - ((float) (measuredWidth / 2)) <= 0.0f) {
            f2 = f5;
            m106598a((int) (f2 - (((float) measuredWidth2) / 2.0f)));
            update((int) (f5 - f4), (int) (((float) (iArr[1] - view.getHeight())) - C9738o.m28708b(C6399b.m19921a(), f)), measuredWidth, measuredHeight);
            this.f85926b.setPivotX(f2);
            this.f85926b.setPivotY((float) measuredHeight);
        }
        f2 = f4;
        m106598a((int) (f2 - (((float) measuredWidth2) / 2.0f)));
        update((int) (f5 - f4), (int) (((float) (iArr[1] - view.getHeight())) - C9738o.m28708b(C6399b.m19921a(), f)), measuredWidth, measuredHeight);
        this.f85926b.setPivotX(f2);
        this.f85926b.setPivotY((float) measuredHeight);
    }

    /* renamed from: a */
    private static void m106601a(TextView textView, int i) {
        String str;
        if (i <= 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        if (C6399b.m19946v()) {
            str = C30537o.m99738a((long) i);
        } else if (i > 99) {
            str = "99+";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            str = sb.toString();
        }
        textView.setText(str);
    }

    /* renamed from: a */
    private void m106599a(int i, TextView textView, boolean z) {
        Drawable drawable;
        Drawable drawable2 = this.f85925a.getResources().getDrawable(i);
        drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
        if (z) {
            drawable = this.f85925a.getResources().getDrawable(R.drawable.a1_);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable2.getMinimumHeight());
        }
        textView.setCompoundDrawables(drawable2, null, drawable, null);
    }
}
