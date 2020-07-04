package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.p022v4.view.animation.C0957c;
import android.view.View;
import android.view.animation.Interpolator;
import com.bytedance.android.livesdk.utils.C9051ar;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ei */
public final class C5693ei {

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ei$a */
    static final class C5694a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f16785a;

        C5694a(View view) {
            this.f16785a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f16785a;
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                view.setScaleX(((Float) animatedValue).floatValue());
                View view2 = this.f16785a;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                if (animatedValue2 != null) {
                    view2.setScaleY(((Float) animatedValue2).floatValue());
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ei$b */
    static final class C5695b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f16786a;

        C5695b(View view) {
            this.f16786a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f16786a;
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                view.setScaleX(((Float) animatedValue).floatValue());
                View view2 = this.f16786a;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                if (animatedValue2 != null) {
                    view2.setScaleY(((Float) animatedValue2).floatValue());
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: a */
    public static final AnimatorSet m18049a(View view, boolean z, long j) {
        view.setTranslationX(-C9051ar.m27035b(view.getContext(), 137.0f));
        view.setTranslationY(C9051ar.m27035b(view.getContext(), 104.0f));
        view.setScaleX(2.5f);
        view.setScaleY(2.5f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "translationX", new float[]{C9051ar.m27035b(view.getContext(), 20.0f)}).setDuration(333);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "translationX", new float[]{0.0f}).setDuration(333);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, "translationY", new float[]{0.0f}).setDuration(333);
        C7573i.m23582a((Object) duration, "translation1");
        duration.setInterpolator(C0957c.m4073a(0.03f, 0.0f, 0.07f, 1.0f));
        Interpolator a = C0957c.m4073a(0.17f, 0.0f, 0.39f, 1.0f);
        C7573i.m23582a((Object) duration2, "translation2X");
        TimeInterpolator timeInterpolator = a;
        duration2.setInterpolator(timeInterpolator);
        C7573i.m23582a((Object) duration3, "translation2Y");
        duration3.setInterpolator(timeInterpolator);
        ValueAnimator duration4 = ValueAnimator.ofFloat(new float[]{view.getScaleX(), 1.0f}).setDuration(333);
        C7573i.m23582a((Object) duration4, "scale");
        duration4.setInterpolator(C0957c.m4073a(0.22f, 0.0f, 0.49f, 1.0f));
        duration4.addUpdateListener(new C5694a(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(j);
        animatorSet.play(duration2).with(duration3);
        animatorSet.play(duration4);
        if (z) {
            View findViewById = view.findViewById(R.id.dhi);
            C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.text_container)");
            findViewById.setVisibility(0);
            ObjectAnimator duration5 = ObjectAnimator.ofFloat(findViewById, "alpha", new float[]{1.0f, 0.0f}).setDuration(167);
            View findViewById2 = view.findViewById(R.id.a3f);
            C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.count_down_background)");
            findViewById2.setScaleX(0.0f);
            findViewById2.setScaleY(0.0f);
            ValueAnimator duration6 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(333);
            duration6.addUpdateListener(new C5695b(findViewById2));
            C7573i.m23582a((Object) duration6, "countDownBgScale");
            duration6.setInterpolator(C0957c.m4073a(0.33f, 0.0f, 0.67f, 1.0f));
            View findViewById3 = view.findViewById(R.id.a3e);
            C7573i.m23582a((Object) findViewById3, "view.findViewById(R.id.count_down)");
            findViewById3.setAlpha(0.0f);
            ObjectAnimator duration7 = ObjectAnimator.ofFloat(findViewById3, "alpha", new float[]{0.0f, 1.0f}).setDuration(167);
            animatorSet.play(duration5);
            animatorSet.play(duration7).before(duration6);
        } else {
            View findViewById4 = view.findViewById(R.id.a20);
            C7573i.m23582a((Object) findViewById4, "view.findViewById(R.id.content_container)");
            animatorSet.play(ObjectAnimator.ofFloat(findViewById4, "alpha", new float[]{1.0f, 0.0f}).setDuration(167));
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(animatorSet).after(duration);
        return animatorSet2;
    }
}
