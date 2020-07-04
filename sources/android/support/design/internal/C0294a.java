package android.support.design.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.transition.C0508m;
import android.support.transition.C0524s;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

/* renamed from: android.support.design.internal.a */
public final class C0294a extends C0508m {
    /* renamed from: a */
    public final void mo1185a(C0524s sVar) {
        m1164d(sVar);
    }

    /* renamed from: b */
    public final void mo1186b(C0524s sVar) {
        m1164d(sVar);
    }

    /* renamed from: d */
    private static void m1164d(C0524s sVar) {
        if (sVar.f2073b instanceof TextView) {
            sVar.f2072a.put("android:textscale:scale", Float.valueOf(((TextView) sVar.f2073b).getScaleX()));
        }
    }

    /* renamed from: a */
    public final Animator mo1184a(ViewGroup viewGroup, C0524s sVar, C0524s sVar2) {
        float f;
        if (sVar == null || sVar2 == null || !(sVar.f2073b instanceof TextView) || !(sVar2.f2073b instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) sVar2.f2073b;
        Map<String, Object> map = sVar.f2072a;
        Map<String, Object> map2 = sVar2.f2072a;
        float f2 = 1.0f;
        if (map.get("android:textscale:scale") != null) {
            f = ((Float) map.get("android:textscale:scale")).floatValue();
        } else {
            f = 1.0f;
        }
        if (map2.get("android:textscale:scale") != null) {
            f2 = ((Float) map2.get("android:textscale:scale")).floatValue();
        }
        if (f == f2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textView.setScaleX(floatValue);
                textView.setScaleY(floatValue);
            }
        });
        return ofFloat;
    }
}
