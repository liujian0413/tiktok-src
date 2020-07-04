package com.p280ss.android.ugc.asve.sandbox.p927a;

import com.p280ss.android.ugc.asve.sandbox.p928b.C20959s.C20960a;
import com.p280ss.android.ugc.asve.sandbox.wrap.ASSimpleFaceInfo;
import com.p280ss.android.ugc.asve.sandbox.wrap.C21062a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.k */
public final class C20880k extends C20960a {

    /* renamed from: a */
    private final WeakReference<C21062a> f56309a;

    public C20880k(C21062a aVar) {
        C7573i.m23587b(aVar, "listener");
        this.f56309a = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    public final void mo56389a(ASSimpleFaceInfo[] aSSimpleFaceInfoArr) {
        if (aSSimpleFaceInfoArr != null) {
            C21062a aVar = (C21062a) this.f56309a.get();
            if (aVar != null) {
                aVar.mo56378a(aSSimpleFaceInfoArr);
            }
        }
    }
}
