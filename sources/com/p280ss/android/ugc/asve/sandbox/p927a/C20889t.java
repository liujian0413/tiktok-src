package com.p280ss.android.ugc.asve.sandbox.p927a;

import com.p280ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20923g.C20924a;
import java.lang.ref.WeakReference;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.t */
public final class C20889t extends C20924a {

    /* renamed from: a */
    private final WeakReference<C7562b<RecorderConcatResult, C7581n>> f56318a;

    public C20889t(C7562b<? super RecorderConcatResult, C7581n> bVar) {
        C7573i.m23587b(bVar, "listener");
        this.f56318a = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public final void mo56400a(RecorderConcatResult recorderConcatResult) {
        C7573i.m23587b(recorderConcatResult, "result");
        C7562b bVar = (C7562b) this.f56318a.get();
        if (bVar != null) {
            bVar.invoke(recorderConcatResult);
        }
    }
}
