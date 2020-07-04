package com.facebook.keyframes.model.keyframedmodels;

import com.facebook.keyframes.model.C14031a;
import com.facebook.keyframes.model.C14032b;
import com.facebook.keyframes.model.KFAnimation;
import com.facebook.keyframes.model.KFAnimation.PropertyType;
import java.util.List;

/* renamed from: com.facebook.keyframes.model.keyframedmodels.f */
public final class C14062f extends C14060d<C14032b, C14063a> {

    /* renamed from: com.facebook.keyframes.model.keyframedmodels.f$a */
    public static class C14063a {

        /* renamed from: a */
        public float f37140a;

        /* renamed from: a */
        public final float mo33707a() {
            return Math.abs(this.f37140a);
        }

        /* renamed from: a */
        public final void mo33708a(float f) {
            this.f37140a *= f;
        }
    }

    private C14062f() {
    }

    /* renamed from: a */
    public static C14062f m41455a(KFAnimation kFAnimation) {
        if (kFAnimation.f37047b == PropertyType.STROKE_WIDTH) {
            return new C14062f(kFAnimation.f37048c, kFAnimation.f37049d);
        }
        throw new IllegalArgumentException("Cannot create a KeyFramedStrokeWidth object from a non STROKE_WIDTH animation.");
    }

    private C14062f(List<C14032b> list, float[][][] fArr) {
        super(list, fArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo33704a(C14031a aVar, C14031a aVar2, float f, Object obj) {
        m41456a((C14032b) aVar, (C14032b) aVar2, f, (C14063a) obj);
    }

    /* renamed from: a */
    private static void m41456a(C14032b bVar, C14032b bVar2, float f, C14063a aVar) {
        if (bVar2 == null) {
            aVar.f37140a = bVar.f37056a[0];
        } else {
            aVar.f37140a = m41449a(bVar.f37056a[0], bVar2.f37056a[0], f);
        }
    }
}
