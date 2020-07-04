package com.p280ss.android.ugc.asve.sandbox.p927a;

import com.bef.effectsdk.message.MessageCenter.C1944a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20968v.C20969a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.m */
public final class C20882m extends C20969a {

    /* renamed from: a */
    private final WeakReference<C1944a> f56311a;

    public C20882m(C1944a aVar) {
        C7573i.m23587b(aVar, "listener");
        this.f56311a = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    public final void mo56391a(int i, int i2, int i3, String str) {
        C1944a aVar = (C1944a) this.f56311a.get();
        if (aVar != null) {
            aVar.onMessageReceived(i, i2, i3, str);
        }
    }
}
