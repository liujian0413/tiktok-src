package com.p280ss.android.ugc.aweme.commercialize.playfun;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build.VERSION;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p1696v.C43178b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a */
public final class C25012a {

    /* renamed from: a */
    public static final C25012a f65980a = new C25012a();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a$a */
    static final class C25013a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ PathMeasure f65981a;

        /* renamed from: b */
        final /* synthetic */ float[] f65982b;

        /* renamed from: c */
        final /* synthetic */ View f65983c;

        C25013a(PathMeasure pathMeasure, float[] fArr, View view) {
            this.f65981a = pathMeasure;
            this.f65982b = fArr;
            this.f65983c = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator != null) {
                this.f65981a.getPosTan(this.f65981a.getLength() * valueAnimator.getAnimatedFraction(), this.f65982b, null);
                this.f65983c.setTranslationX(this.f65982b[0]);
                this.f65983c.setTranslationY(this.f65982b[1]);
            }
        }
    }

    private C25012a() {
    }

    /* renamed from: a */
    public static Animator m82348a(float f) {
        long j;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        C7573i.m23582a((Object) ofFloat, "ValueAnimator.ofFloat(0f, 1f)");
        if (f > 0.0f) {
            j = (long) f;
        } else {
            j = 3000;
        }
        ofFloat.setDuration(j);
        return ofFloat;
    }

    /* renamed from: a */
    public static Animator m82349a(View view) {
        C7573i.m23587b(view, "target");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f});
        C7573i.m23582a((Object) ofFloat, "alphaAnim");
        ofFloat.setDuration(200);
        return ofFloat;
    }

    /* renamed from: b */
    public static Animator m82353b(View view, float f) {
        C7573i.m23587b(view, "target");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", new float[]{view.getTranslationY(), f});
        C7573i.m23582a((Object) ofFloat, "transAnim");
        ofFloat.setDuration(300);
        return ofFloat;
    }

    /* renamed from: b */
    public static Animator m82354b(View view, long j) {
        C7573i.m23587b(view, "target");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f});
        C7573i.m23582a((Object) ofFloat, "alphaAnim");
        ofFloat.setDuration(j);
        return ofFloat;
    }

    /* renamed from: a */
    public static Animator m82350a(View view, float f) {
        C7573i.m23587b(view, "target");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", new float[]{C9738o.m28708b(C6399b.m19921a(), 25.0f) + f, f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200);
        animatorSet.play(ofFloat).with(ofFloat2);
        return animatorSet;
    }

    /* renamed from: a */
    public static Animator m82351a(View view, long j) {
        C7573i.m23587b(view, "target");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f});
        C7573i.m23582a((Object) ofFloat, "alphaAnim");
        ofFloat.setDuration(j);
        return ofFloat;
    }

    /* renamed from: a */
    private static Animator m82352a(View view, Path path) {
        C7573i.m23587b(view, "target");
        C7573i.m23587b(path, "path");
        if (VERSION.SDK_INT >= 21) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", "translationY", path);
            C7573i.m23582a((Object) ofFloat, "ObjectAnimator.ofFloat(t…N_X, TRANSLATION_Y, path)");
            return ofFloat;
        }
        AnimatorUpdateListener aVar = new C25013a(new PathMeasure(path, false), new float[2], view);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat2.addUpdateListener(aVar);
        C7573i.m23582a((Object) ofFloat2, "anim");
        return ofFloat2;
    }

    /* renamed from: b */
    public final Animator mo65459b(View view, C25028d dVar, C25024b bVar) {
        long j;
        C7573i.m23587b(view, "target");
        C7573i.m23587b(dVar, "playFunParam");
        C7573i.m23587b(bVar, "animParams");
        view.setPivotX(((float) dVar.f66014a) / 2.0f);
        view.setPivotY(((float) dVar.f66014a) / 2.0f);
        Path path = new Path();
        path.moveTo(bVar.f65995b, bVar.f65996c);
        Path path2 = path;
        path2.cubicTo((bVar.f65995b + bVar.f65999f) / 2.0f, bVar.f65996c, bVar.f65999f, (bVar.f65996c + bVar.f66000g) / 2.0f, bVar.f65999f, bVar.f66000g);
        Animator a = m82352a(view, path);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{view.getScaleX(), dVar.f66017d});
        C7573i.m23582a((Object) ofFloat, "ObjectAnimator.ofFloat(t…playFunParam.widgetScale)");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "ScaleY", new float[]{view.getScaleY(), dVar.f66017d});
        C7573i.m23582a((Object) ofFloat2, "ObjectAnimator.ofFloat(t…playFunParam.widgetScale)");
        AnimatorSet animatorSet = new AnimatorSet();
        float f = bVar.f65994a;
        if (f > 0.0f) {
            j = (long) f;
        } else {
            j = 500;
        }
        animatorSet.setDuration(j);
        animatorSet.setInterpolator(new C43178b());
        animatorSet.play(a).with(ofFloat).with(ofFloat2);
        return animatorSet;
    }

    /* renamed from: a */
    public final Animator mo65458a(View view, C25028d dVar, C25024b bVar) {
        long j;
        C7573i.m23587b(view, "target");
        C7573i.m23587b(dVar, "playFunParam");
        C7573i.m23587b(bVar, "animParams");
        view.setPivotX(((float) dVar.f66014a) / 2.0f);
        view.setPivotY(((float) dVar.f66014a) / 2.0f);
        view.setTranslationX(bVar.f65995b);
        view.setTranslationY(bVar.f65996c);
        view.setScaleX(bVar.f65997d);
        view.setScaleY(bVar.f65997d);
        view.setRotation((float) bVar.f65998e);
        Path path = new Path();
        path.moveTo(bVar.f65995b, bVar.f65996c);
        path.lineTo(bVar.f65999f, bVar.f66000g);
        Animator a = m82352a(view, path);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{bVar.f65997d, 1.0f});
        C7573i.m23582a((Object) ofFloat, "ObjectAnimator.ofFloat(t…E_X, animParams.size, 1f)");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "ScaleY", new float[]{bVar.f65997d, 1.0f});
        C7573i.m23582a((Object) ofFloat2, "ObjectAnimator.ofFloat(t…E_Y, animParams.size, 1f)");
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "rotation", new float[]{(float) bVar.f65998e, 0.0f});
        C7573i.m23582a((Object) ofFloat3, "ObjectAnimator.ofFloat(t…rams.angle.toFloat(), 0f)");
        AnimatorSet animatorSet = new AnimatorSet();
        float f = bVar.f65994a;
        if (f > 0.0f) {
            j = (long) f;
        } else {
            j = 500;
        }
        animatorSet.setDuration(j);
        animatorSet.setInterpolator(new C43178b());
        animatorSet.play(a).with(ofFloat).with(ofFloat2).with(ofFloat3);
        return animatorSet;
    }
}
