package com.p280ss.android.ugc.aweme.live.p1365e;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.DecelerateInterpolator;

/* renamed from: com.ss.android.ugc.aweme.live.e.a */
public final class C32508a {
    /* renamed from: a */
    public static void m105304a(final View view, final Rect rect, final View... viewArr) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                View[] viewArr;
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                view.setPivotX((float) rect.centerX());
                view.setPivotY((float) rect.centerY());
                view.setScaleX(0.0f);
                view.setScaleY(0.0f);
                view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200).setInterpolator(new DecelerateInterpolator()).withEndAction(C32510b.f84773a).start();
                if (viewArr != null && viewArr.length != 0) {
                    for (View view : viewArr) {
                        Rect rect = new Rect();
                        if (view != null) {
                            int[] iArr = new int[2];
                            view.getLocationOnScreen(iArr);
                            rect.left = iArr[0];
                            rect.top = iArr[1];
                            rect.right = iArr[0] + view.getMeasuredWidth();
                            rect.bottom = iArr[1] + view.getMeasuredHeight();
                            view.setTranslationX((float) (rect.left - rect.left));
                            view.setTranslationY((float) (rect.top - rect.top));
                            view.setPivotX(0.0f);
                            view.setPivotY(0.0f);
                            view.setScaleX(((float) rect.width()) / ((float) view.getWidth()));
                            view.setScaleY(((float) rect.height()) / ((float) view.getHeight()));
                            view.animate().scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setDuration(200).start();
                        }
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static void m105303a(View view, Rect rect, Runnable runnable, View... viewArr) {
        if (view == null) {
            runnable.run();
            return;
        }
        view.setPivotX((float) rect.centerX());
        view.setPivotY((float) rect.centerY());
        view.animate().scaleX(0.0f).scaleY(0.0f).setDuration(200).setInterpolator(new DecelerateInterpolator()).withEndAction(runnable).start();
    }
}
