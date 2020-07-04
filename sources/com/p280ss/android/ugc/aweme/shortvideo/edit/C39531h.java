package com.p280ss.android.ugc.aweme.shortvideo.edit;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.h */
public final class C39531h {

    /* renamed from: a */
    public C39530g f102595a;

    /* renamed from: b */
    public boolean f102596b = true;

    /* renamed from: c */
    public final Activity f102597c;

    /* renamed from: d */
    private View f102598d;

    /* renamed from: e */
    private LinearLayout f102599e;

    /* renamed from: f */
    private View f102600f;

    /* renamed from: g */
    private final long f102601g = 250;

    /* renamed from: h */
    private int f102602h;

    /* renamed from: i */
    private final ViewGroup f102603i;

    /* renamed from: j */
    private final List<View> f102604j;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.h$a */
    static final class C39532a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f102605a;

        C39532a(View view) {
            this.f102605a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                LayoutParams layoutParams = this.f102605a.getLayoutParams();
                layoutParams.height = intValue;
                this.f102605a.setLayoutParams(layoutParams);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.h$b */
    public static final class C39533b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ LinearLayout f102606a;

        /* renamed from: b */
        final /* synthetic */ C39531h f102607b;

        public final void onAnimationCancel(Animator animator) {
            this.f102607b.f102596b = false;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f102606a.setVisibility(8);
            this.f102607b.f102596b = true;
        }

        C39533b(LinearLayout linearLayout, C39531h hVar) {
            this.f102606a = linearLayout;
            this.f102607b = hVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.h$c */
    static final class C39534c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39531h f102608a;

        C39534c(C39531h hVar) {
            this.f102608a = hVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C39531h hVar = this.f102608a;
            C7573i.m23582a((Object) view, "it");
            hVar.mo98386a(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.h$d */
    static final class C39535d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39531h f102609a;

        C39535d(C39531h hVar) {
            this.f102609a = hVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f102609a.f102596b) {
                C39531h hVar = this.f102609a;
                C7573i.m23582a((Object) view, "it");
                hVar.mo98386a(view);
                return;
            }
            this.f102609a.mo98388b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.h$e */
    public static final class C39536e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ LinearLayout f102610a;

        /* renamed from: b */
        final /* synthetic */ C39531h f102611b;

        public final void onAnimationCancel(Animator animator) {
            this.f102611b.f102596b = true;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f102611b.f102596b = false;
        }

        public final void onAnimationStart(Animator animator) {
            LayoutParams layoutParams = this.f102610a.getLayoutParams();
            layoutParams.height = 0;
            this.f102610a.setLayoutParams(layoutParams);
            this.f102610a.setVisibility(0);
        }

        C39536e(LinearLayout linearLayout, C39531h hVar) {
            this.f102610a = linearLayout;
            this.f102611b = hVar;
        }
    }

    /* renamed from: c */
    private final boolean m126257c() {
        if (this.f102604j.size() > 3) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private final void m126260f() {
        View view = this.f102598d;
        if (view == null) {
            C7573i.m23583a("toolbarRootView");
        }
        this.f102599e = (LinearLayout) view.findViewById(R.id.an8);
    }

    /* renamed from: g */
    private final void m126261g() {
        if (this.f102596b) {
            View view = this.f102600f;
            if (view != null) {
                view.setRotation(180.0f);
            }
            return;
        }
        View view2 = this.f102600f;
        if (view2 != null) {
            view2.setRotation(0.0f);
        }
    }

    /* renamed from: e */
    private final void m126259e() {
        m126260f();
        int i = 0;
        for (View view : this.f102604j.subList(2, this.f102604j.size())) {
            LinearLayout linearLayout = this.f102599e;
            if (linearLayout != null) {
                linearLayout.addView(view);
            }
            if (i != 0) {
                m126256b(view);
            }
            i++;
        }
    }

    /* renamed from: b */
    public final void mo98388b() {
        if (!this.f102596b) {
            LinearLayout linearLayout = this.f102599e;
            if (linearLayout != null) {
                m126261g();
                View view = linearLayout;
                ValueAnimator a = m126255a(view, this.f102602h, 0);
                a.addListener(new C39533b(linearLayout, this));
                ObjectAnimator a2 = m126254a(view, 1.0f, 0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{a, a2});
                animatorSet.start();
            }
        }
    }

    /* renamed from: a */
    public final void mo98385a() {
        if (!this.f102604j.isEmpty()) {
            m126258d();
        }
        if (m126257c()) {
            m126259e();
        }
    }

    /* renamed from: d */
    private final void m126258d() {
        View inflate = LayoutInflater.from(this.f102597c).inflate(R.layout.lr, this.f102603i, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(cont… toolBarContainer, false)");
        this.f102598d = inflate;
        View view = this.f102598d;
        if (view == null) {
            C7573i.m23583a("toolbarRootView");
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.alk);
        int min = Math.min(1, this.f102604j.size() - 1);
        if (min >= 0) {
            int i = 0;
            while (true) {
                View view2 = (View) this.f102604j.get(i);
                linearLayout.addView(view2);
                if (i == 1) {
                    m126256b(view2);
                }
                if (i == min) {
                    break;
                }
                i++;
            }
        }
        if (this.f102604j.size() == 3) {
            linearLayout.addView((View) this.f102604j.get(2));
            m126256b((View) this.f102604j.get(2));
        } else if (this.f102604j.size() > 3) {
            View view3 = this.f102598d;
            if (view3 == null) {
                C7573i.m23583a("toolbarRootView");
            }
            this.f102600f = view3.findViewById(R.id.dlb);
            View view4 = this.f102600f;
            if (view4 != null) {
                view4.setVisibility(0);
            }
            View view5 = this.f102600f;
            if (view5 != null) {
                view5.setOnClickListener(new C39534c(this));
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388613;
        ViewGroup viewGroup = this.f102603i;
        View view6 = this.f102598d;
        if (view6 == null) {
            C7573i.m23583a("toolbarRootView");
        }
        viewGroup.addView(view6, layoutParams);
        View view7 = this.f102600f;
        if (view7 != null) {
            view7.setOnClickListener(new C39535d(this));
        }
    }

    /* renamed from: a */
    public final void mo98387a(boolean z) {
        int i;
        ViewGroup viewGroup = this.f102603i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        viewGroup.setVisibility(i);
    }

    /* renamed from: b */
    private final void m126256b(View view) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ((LinearLayout.LayoutParams) layoutParams).topMargin = (int) C9738o.m28708b((Context) this.f102597c, 12.0f);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* renamed from: a */
    public final void mo98386a(View view) {
        C39530g gVar = this.f102595a;
        if (gVar != null) {
            gVar.mo98384a();
        }
        if (this.f102596b) {
            LinearLayout linearLayout = this.f102599e;
            if (linearLayout != null) {
                m126261g();
                linearLayout.measure(0, 0);
                this.f102602h = linearLayout.getMeasuredHeight();
                View view2 = linearLayout;
                ValueAnimator a = m126255a(view2, 0, this.f102602h);
                a.addListener(new C39536e(linearLayout, this));
                ObjectAnimator a2 = m126254a(view2, 0.0f, 1.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{a, a2});
                animatorSet.start();
            }
        }
    }

    public C39531h(ViewGroup viewGroup, List<? extends View> list, Activity activity) {
        C7573i.m23587b(viewGroup, "toolBarContainer");
        C7573i.m23587b(list, "editToolbarList");
        C7573i.m23587b(activity, "context");
        this.f102603i = viewGroup;
        this.f102604j = list;
        this.f102597c = activity;
    }

    /* renamed from: a */
    private final ObjectAnimator m126254a(View view, float f, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{f, f2});
        C7573i.m23582a((Object) ofFloat, "alphaAnimator");
        ofFloat.setDuration(this.f102601g);
        return ofFloat;
    }

    /* renamed from: a */
    private final ValueAnimator m126255a(View view, int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        C7573i.m23582a((Object) ofInt, "heightAnimator");
        ofInt.setDuration(this.f102601g);
        ofInt.addUpdateListener(new C39532a(view));
        return ofInt;
    }
}
