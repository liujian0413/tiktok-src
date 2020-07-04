package com.p280ss.android.ugc.aweme.profile.util;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.profile.C35992k;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendCommonUserView;
import com.p280ss.android.ugc.aweme.setting.C7213d;

/* renamed from: com.ss.android.ugc.aweme.profile.util.af */
public final class C36712af {
    /* renamed from: a */
    private static void m118370a(ValueAnimator valueAnimator, final View view) {
        if (valueAnimator != null && view != null) {
            valueAnimator.addListener(new AnimatorListener() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    view.setVisibility(0);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m118367a(float f, View view, View view2, float f2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        layoutParams.height = (int) (C9738o.m28708b(C6399b.m19921a(), 248.0f) * f);
        view.setLayoutParams(layoutParams);
        float f3 = 1.0f - f;
        view2.setAlpha(f3);
        LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
        layoutParams2.height = (int) (f3 * f2);
        view2.setLayoutParams(layoutParams2);
    }

    /* renamed from: a */
    public static void m118371a(boolean z, final View view, final View view2, final float f) {
        ValueAnimator valueAnimator;
        if (view != null && view2 != null) {
            if (z) {
                valueAnimator = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            } else {
                valueAnimator = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            }
            valueAnimator.setDuration(300);
            valueAnimator.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C36712af.m118367a(((Float) valueAnimator.getAnimatedValue()).floatValue(), view, view2, f);
                }
            });
            valueAnimator.start();
        }
    }

    /* renamed from: b */
    public static void m118373b(boolean z, RecommendCommonUserView recommendCommonUserView, View view, FrameLayout frameLayout, FrameLayout frameLayout2, View view2, View view3, View view4) {
        ValueAnimator valueAnimator;
        View view5 = view;
        view.measure(0, 0);
        int height = view.getHeight();
        FrameLayout frameLayout3 = frameLayout;
        frameLayout.measure(0, 0);
        final int height2 = (int) (((float) (height + frameLayout.getHeight())) + C9738o.m28708b(C6399b.m19921a(), 15.0f));
        if (z) {
            valueAnimator = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        } else {
            valueAnimator = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        }
        valueAnimator.setDuration(300);
        final RecommendCommonUserView recommendCommonUserView2 = recommendCommonUserView;
        final View view6 = view;
        final FrameLayout frameLayout4 = frameLayout;
        final FrameLayout frameLayout5 = frameLayout2;
        final View view7 = view2;
        final View view8 = view3;
        final View view9 = view4;
        C367153 r1 = new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C36712af.m118369a(((Float) valueAnimator.getAnimatedValue()).floatValue(), recommendCommonUserView2, view6, frameLayout4, frameLayout5, view7, view8, view9, height2);
            }
        };
        valueAnimator.addUpdateListener(r1);
        valueAnimator.start();
    }

    /* renamed from: a */
    public static void m118368a(float f, RecommendCommonUserView recommendCommonUserView, View view, FrameLayout frameLayout, FrameLayout frameLayout2, View view2, View view3, int i) {
        Context a = C6399b.m19921a();
        int i2 = 294;
        if (C7213d.m22500a().mo18809i()) {
            if (!C35992k.m115952b()) {
                i2 = 236;
            }
        } else if (!C35992k.m115952b()) {
            i2 = 260;
        }
        LayoutParams layoutParams = (LayoutParams) recommendCommonUserView.getLayoutParams();
        layoutParams.topMargin = -((int) (((float) i) * f));
        layoutParams.height = (int) (C9738o.m28708b(a, (float) i2) * f);
        recommendCommonUserView.setLayoutParams(layoutParams);
        float f2 = 1.0f - f;
        ((LayoutParams) view3.getLayoutParams()).topMargin = (int) (C9738o.m28708b(a, 12.0f) * f2);
        float f3 = 1.0f - (f * 0.4787234f);
        if (frameLayout2 != null) {
            frameLayout2.setScaleX(f3);
            frameLayout2.setScaleY(f3);
        }
        float b = ((C9738o.m28708b(a, 94.0f) * 0.4787234f) / 2.0f) * f;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationX(-b);
        }
        if (view2 != null) {
            view2.setTranslationX(-b);
        }
        view.setAlpha(f2);
        frameLayout.setAlpha(f2);
        float f4 = -f;
        view.setTranslationY(C9738o.m28708b(a, 20.0f) * f4);
        frameLayout.setTranslationY(f4 * C9738o.m28708b(a, 20.0f));
    }

    /* renamed from: a */
    public static void m118372a(boolean z, RecommendCommonUserView recommendCommonUserView, View view, FrameLayout frameLayout, FrameLayout frameLayout2, View view2, View view3, View view4) {
        ValueAnimator valueAnimator;
        View view5 = view4;
        View view6 = view;
        view.measure(0, 0);
        int height = view.getHeight();
        FrameLayout frameLayout3 = frameLayout;
        frameLayout.measure(0, 0);
        final int height2 = (int) (((float) (height + frameLayout.getHeight())) + C9738o.m28708b(C6399b.m19921a(), 15.0f));
        if (z) {
            valueAnimator = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            if (view5 != null) {
                view5.setVisibility(4);
            }
        } else {
            valueAnimator = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            m118370a(valueAnimator, view5);
        }
        valueAnimator.setDuration(300);
        final RecommendCommonUserView recommendCommonUserView2 = recommendCommonUserView;
        final View view7 = view;
        final FrameLayout frameLayout4 = frameLayout;
        final FrameLayout frameLayout5 = frameLayout2;
        final View view8 = view2;
        final View view9 = view3;
        C367131 r2 = new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C36712af.m118368a(((Float) valueAnimator.getAnimatedValue()).floatValue(), recommendCommonUserView2, view7, frameLayout4, frameLayout5, view8, view9, height2);
            }
        };
        valueAnimator.addUpdateListener(r2);
        valueAnimator.start();
    }

    /* renamed from: a */
    public static void m118369a(float f, RecommendCommonUserView recommendCommonUserView, View view, FrameLayout frameLayout, FrameLayout frameLayout2, View view2, View view3, View view4, int i) {
        Context a = C6399b.m19921a();
        LayoutParams layoutParams = (LayoutParams) recommendCommonUserView.getLayoutParams();
        layoutParams.topMargin = -((int) (((float) i) * f));
        layoutParams.height = (int) (C9738o.m28708b(a, 220.0f) * f);
        recommendCommonUserView.setLayoutParams(layoutParams);
        float f2 = 1.0f - f;
        ((LayoutParams) view3.getLayoutParams()).topMargin = (int) (C9738o.m28708b(a, 12.0f) * f2);
        float f3 = 1.0f - (f * 0.4787234f);
        if (frameLayout2 != null) {
            frameLayout2.setScaleX(f3);
            frameLayout2.setScaleY(f3);
        }
        if (view2 != null) {
            view2.setScaleX(f3);
            view2.setScaleY(f3);
        }
        if (view4 != null) {
            view4.setScaleX(f3);
            view4.setScaleY(f3);
        }
        float b = ((C9738o.m28708b(a, 94.0f) * 0.4787234f) / 2.0f) * f;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationX(-b);
        }
        if (view2 != null) {
            view2.setTranslationX(-b);
        }
        if (view4 != null) {
            float b2 = ((C9738o.m28708b(a, 92.0f) * 0.4787234f) / 2.0f) * f;
            view4.setTranslationX(-b2);
            view4.setTranslationY(b2);
        }
        view.setAlpha(f2);
        frameLayout.setAlpha(f2);
        float f4 = -f;
        view.setTranslationY(C9738o.m28708b(a, 20.0f) * f4);
        frameLayout.setTranslationY(f4 * C9738o.m28708b(a, 20.0f));
    }
}
