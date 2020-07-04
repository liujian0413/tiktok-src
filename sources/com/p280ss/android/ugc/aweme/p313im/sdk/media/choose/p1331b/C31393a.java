package com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.p1331b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.utils.C43005cc;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.b.a */
public final class C31393a {

    /* renamed from: a */
    public static final C31393a f82228a = new C31393a();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.b.a$a */
    public static final class C31394a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f82229a;

        /* renamed from: b */
        final /* synthetic */ ImageView f82230b;

        /* renamed from: c */
        final /* synthetic */ DmtTextView f82231c;

        /* renamed from: d */
        final /* synthetic */ int f82232d;

        /* renamed from: e */
        final /* synthetic */ View f82233e;

        /* renamed from: f */
        final /* synthetic */ View f82234f;

        public final void onAnimationCancel(Animator animator) {
            C31393a.m102162a(this.f82233e, this.f82229a, this.f82230b, this.f82231c, this.f82232d);
        }

        public final void onAnimationEnd(Animator animator) {
            boolean z;
            C31393a.m102162a(null, this.f82229a, this.f82230b, this.f82231c, this.f82232d);
            View view = this.f82233e;
            View view2 = this.f82229a;
            View view3 = this.f82234f;
            if (this.f82232d > 0) {
                z = true;
            } else {
                z = false;
            }
            C31393a.m102161a(view, view2, view3, z);
        }

        C31394a(View view, ImageView imageView, DmtTextView dmtTextView, int i, View view2, View view3) {
            this.f82229a = view;
            this.f82230b = imageView;
            this.f82231c = dmtTextView;
            this.f82232d = i;
            this.f82233e = view2;
            this.f82234f = view3;
        }
    }

    private C31393a() {
    }

    /* renamed from: a */
    public static void m102161a(View view, View view2, View view3, boolean z) {
        Animator animator;
        Animator animator2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view3, "alpha", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view3, "scaleX", new float[]{0.3f, 1.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view3, "scaleY", new float[]{0.3f, 1.0f});
        ObjectAnimator objectAnimator = null;
        if (view == null || view2 == null) {
            animator2 = null;
            animator = null;
        } else {
            view.clearAnimation();
            view2.clearAnimation();
            if (z) {
                objectAnimator = ObjectAnimator.ofFloat(view, "scaleX", new float[]{1.0f, 1.1f});
                animator2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{1.0f, 1.1f});
                animator = ObjectAnimator.ofFloat(view2, "alpha", new float[]{0.0f, 1.0f});
            } else {
                objectAnimator = ObjectAnimator.ofFloat(view, "scaleX", new float[]{1.1f, 1.0f});
                animator2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{1.1f, 1.0f});
                animator = ObjectAnimator.ofFloat(view2, "alpha", new float[]{1.0f, 0.0f});
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        if (objectAnimator == null || animator2 == null || animator == null) {
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        } else {
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, objectAnimator, animator2, animator});
        }
        animatorSet.setInterpolator(C43005cc.m136505a(2, 0.32f, 0.94f, 0.6f, 1.0f));
        animatorSet.setDuration(300);
        animatorSet.start();
    }

    /* renamed from: a */
    public static void m102162a(View view, View view2, ImageView imageView, DmtTextView dmtTextView, int i) {
        C7573i.m23587b(imageView, "ivSelect");
        C7573i.m23587b(dmtTextView, "tvSelect");
        if (i > 0) {
            dmtTextView.setText(String.valueOf(i));
            imageView.setSelected(true);
            imageView.setImageResource(R.drawable.av9);
            if (view2 != null) {
                view2.setBackgroundResource(R.color.uy);
            }
            if (view2 != null) {
                view2.setVisibility(0);
            }
            if (view2 != null) {
                view2.setAlpha(1.0f);
            }
            if (view != null) {
                view.setScaleX(1.1f);
                view.setScaleY(1.1f);
            }
        } else {
            dmtTextView.setText("");
            imageView.setSelected(false);
            imageView.setImageResource(R.drawable.b5r);
            if (view2 != null) {
                view2.setVisibility(8);
            }
            if (view != null) {
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
            }
        }
    }

    /* renamed from: a */
    public static void m102160a(View view, View view2, View view3, ImageView imageView, DmtTextView dmtTextView, int i) {
        C7573i.m23587b(view3, "layoutSelect");
        C7573i.m23587b(imageView, "ivSelect");
        C7573i.m23587b(dmtTextView, "tvSelect");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view3, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view3, "scaleX", new float[]{1.0f, 0.3f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view3, "scaleY", new float[]{1.0f, 0.3f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        animatorSet.setDuration(50);
        C31394a aVar = new C31394a(view2, imageView, dmtTextView, i, view, view3);
        animatorSet.addListener(aVar);
        animatorSet.start();
    }
}
