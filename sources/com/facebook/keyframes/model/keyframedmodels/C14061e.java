package com.facebook.keyframes.model.keyframedmodels;

import com.facebook.keyframes.C13981a;
import com.facebook.keyframes.model.C14031a;
import com.facebook.keyframes.model.C14040e;
import com.facebook.keyframes.model.C14045g;
import com.facebook.keyframes.model.C14045g.C14047b;
import com.facebook.keyframes.p733b.C14014f;
import java.util.List;

/* renamed from: com.facebook.keyframes.model.keyframedmodels.e */
public final class C14061e extends C14060d<C14045g, C13981a> {
    /* renamed from: a */
    public static C14061e m41452a(C14040e eVar) {
        return new C14061e(eVar.f37076f, eVar.f37077g);
    }

    private C14061e(List<C14045g> list, float[][][] fArr) {
        super(list, fArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo33704a(C14031a aVar, C14031a aVar2, float f, Object obj) {
        m41453a((C14045g) aVar, (C14045g) aVar2, f, (C13981a) obj);
    }

    /* renamed from: a */
    private static void m41453a(C14045g gVar, C14045g gVar2, float f, C13981a aVar) {
        if (gVar2 == null || f == 0.0f) {
            gVar.f37103a.mo33699a(aVar);
            return;
        }
        C14047b bVar = gVar.f37103a;
        C14047b bVar2 = gVar2.f37103a;
        int size = bVar.f37107a.size();
        for (int i = 0; i < size; i++) {
            ((C14014f) bVar.f37107a.get(i)).mo33672a((C14014f) bVar2.f37107a.get(i), f, aVar);
        }
    }
}
