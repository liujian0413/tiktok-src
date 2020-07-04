package com.p280ss.android.ugc.asve.sandbox.p927a;

import com.p280ss.android.medialib.FaceBeautyInvoker.OnARTextCountCallback;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20971w.C20972a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.p */
public final class C20885p extends C20972a {

    /* renamed from: a */
    private final WeakReference<OnARTextCountCallback> f56314a;

    public C20885p(OnARTextCountCallback onARTextCountCallback) {
        C7573i.m23587b(onARTextCountCallback, "listener");
        this.f56314a = new WeakReference<>(onARTextCountCallback);
    }

    /* renamed from: a */
    public final void mo56395a(int i) {
        OnARTextCountCallback onARTextCountCallback = (OnARTextCountCallback) this.f56314a.get();
        if (onARTextCountCallback != null) {
            onARTextCountCallback.onResult(i);
        }
    }
}
