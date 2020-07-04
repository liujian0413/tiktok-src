package com.p280ss.android.ugc.asve.sandbox.p927a;

import com.p280ss.android.medialib.FaceBeautyInvoker.OnCherEffectParmaCallback;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20947o.C20948a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.j */
public final class C20879j extends C20948a {

    /* renamed from: a */
    private final WeakReference<OnCherEffectParmaCallback> f56308a;

    public C20879j(OnCherEffectParmaCallback onCherEffectParmaCallback) {
        C7573i.m23587b(onCherEffectParmaCallback, "listener");
        this.f56308a = new WeakReference<>(onCherEffectParmaCallback);
    }

    /* renamed from: a */
    public final void mo56388a(String[] strArr, double[] dArr, boolean[] zArr) {
        OnCherEffectParmaCallback onCherEffectParmaCallback = (OnCherEffectParmaCallback) this.f56308a.get();
        if (onCherEffectParmaCallback != null) {
            onCherEffectParmaCallback.onCherEffect(strArr, dArr, zArr);
        }
    }
}
