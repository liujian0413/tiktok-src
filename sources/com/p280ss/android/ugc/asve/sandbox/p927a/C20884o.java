package com.p280ss.android.ugc.asve.sandbox.p927a;

import com.p280ss.android.medialib.FaceBeautyInvoker.OnARTextContentCallback;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20902a.C20903a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.o */
public final class C20884o extends C20903a {

    /* renamed from: a */
    private final WeakReference<OnARTextContentCallback> f56313a;

    public C20884o(OnARTextContentCallback onARTextContentCallback) {
        C7573i.m23587b(onARTextContentCallback, "listener");
        this.f56313a = new WeakReference<>(onARTextContentCallback);
    }

    /* renamed from: a */
    public final void mo56394a(String[] strArr) {
        OnARTextContentCallback onARTextContentCallback = (OnARTextContentCallback) this.f56313a.get();
        if (onARTextContentCallback != null) {
            onARTextContentCallback.onResult(strArr);
        }
    }
}
