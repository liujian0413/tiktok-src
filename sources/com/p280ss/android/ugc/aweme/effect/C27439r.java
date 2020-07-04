package com.p280ss.android.ugc.aweme.effect;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;

/* renamed from: com.ss.android.ugc.aweme.effect.r */
public final class C27439r {
    /* renamed from: a */
    public static void m89908a(View view, boolean z, int i, View view2, C6892b<Void> bVar) {
        m89907a(view, z, i, view2, C34943c.f91128x, bVar);
    }

    /* renamed from: a */
    public static void m89909a(final View view, boolean z, View view2, boolean z2, boolean z3) {
        float f;
        String str = "alpha";
        float[] fArr = new float[2];
        float f2 = 1.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (!z) {
            f2 = 0.0f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, fArr);
        ofFloat.setDuration(200);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
        ofFloat.addListener(new AnimatorListenerAdapter(null, false, false) {

            /* renamed from: b */
            final /* synthetic */ boolean f72362b;

            public final void onAnimationEnd(Animator animator) {
                int i;
                if (null != null) {
                    View view = null;
                    if (this.f72362b) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    view.setVisibility(i);
                }
                if (false) {
                    view.setVisibility(4);
                }
            }

            {
                this.f72362b = r2;
            }
        });
    }

    /* renamed from: a */
    public static void m89907a(final View view, final boolean z, int i, final View view2, int i2, final C6892b<Void> bVar) {
        float f;
        float f2;
        float f3;
        if (z) {
            view2.setVisibility(0);
        }
        view2.bringToFront();
        String str = "translationY";
        float[] fArr = new float[2];
        if (!z) {
            f = 0.0f;
        } else {
            f = (float) i;
        }
        fArr[0] = f;
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = (float) i;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, fArr);
        long j = (long) i2;
        ofFloat.setDuration(j);
        String str2 = "alpha";
        float[] fArr2 = new float[2];
        float f4 = 1.0f;
        if (!z) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        fArr2[0] = f3;
        if (!z) {
            f4 = 0.0f;
        }
        fArr2[1] = f4;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, str2, fArr2);
        ofFloat2.setDuration(j);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                view.setVisibility(0);
            }

            public final void onAnimationEnd(Animator animator) {
                if (!z) {
                    view2.setVisibility(4);
                }
                if (bVar != null) {
                    bVar.run(null);
                }
            }
        });
        animatorSet.start();
    }
}
