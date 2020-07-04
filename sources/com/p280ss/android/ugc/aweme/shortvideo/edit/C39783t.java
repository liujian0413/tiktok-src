package com.p280ss.android.ugc.aweme.shortvideo.edit;

import android.graphics.RectF;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.vesdk.VESize;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.t */
public final class C39783t {

    /* renamed from: a */
    public static final C39783t f103416a = new C39783t();

    /* renamed from: b */
    private static final String f103417b = f103417b;

    private C39783t() {
    }

    /* renamed from: a */
    public static final boolean m127389a(C15389d dVar, C39504az azVar, C39774n... nVarArr) {
        C7573i.m23587b(dVar, "veEditor");
        C7573i.m23587b(azVar, "sizeProvider");
        C7573i.m23587b(nVarArr, "controllers");
        if (azVar.mo98355c() == azVar.mo98207a() && azVar.mo98356d() == azVar.mo98209b()) {
            return false;
        }
        VESize c = dVar.mo38828c();
        int a = azVar.mo98207a();
        int b = azVar.mo98209b();
        azVar.mo98355c();
        azVar.mo98356d();
        float f = (((float) c.f116386b) - (((float) b) * ((((float) c.f116385a) * 1.0f) / ((float) a)))) / 2.0f;
        RectF rectF = new RectF();
        rectF.set(0.0f, f, (float) c.f116385a, ((float) c.f116386b) - f);
        boolean z = false;
        for (int i = 0; i < 4; i++) {
            C39774n nVar = nVarArr[i];
            if (nVar != null) {
                z |= nVar.mo98644a(rectF);
            }
        }
        return z;
    }
}
