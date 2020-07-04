package com.facebook.keyframes.model.keyframedmodels;

import android.graphics.Matrix;
import com.facebook.keyframes.model.C14031a;
import com.facebook.keyframes.model.C14032b;
import com.facebook.keyframes.model.KFAnimation;

/* renamed from: com.facebook.keyframes.model.keyframedmodels.b */
public final class C14057b extends C14060d<C14031a, Matrix> {

    /* renamed from: a */
    public final float f37131a;

    /* renamed from: b */
    public final float f37132b;

    /* renamed from: a */
    public static C14057b m41435a(KFAnimation kFAnimation) {
        float[] fArr = ((C14032b) kFAnimation.f37048c.get(0)).f37056a;
        return new C14057b(fArr[0], fArr[1]);
    }

    /* renamed from: a */
    public final void mo33706a(Matrix matrix) {
        matrix.postTranslate(-this.f37131a, -this.f37132b);
    }

    private C14057b(float f, float f2) {
        this.f37131a = f;
        this.f37132b = f2;
    }

    /* renamed from: a */
    private static void m41436a(float f, Matrix matrix) {
        throw new NoSuchMethodError("Anchor point currently has no keyframing ability");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo33705a(float f, Object obj) {
        m41436a(f, (Matrix) obj);
    }

    /* renamed from: a */
    private static void m41437a(C14031a aVar, C14031a aVar2, float f, Matrix matrix) {
        throw new NoSuchMethodError("Anchor point currently has no keyframing ability");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo33704a(C14031a aVar, C14031a aVar2, float f, Object obj) {
        m41437a(aVar, aVar2, f, (Matrix) obj);
    }
}
