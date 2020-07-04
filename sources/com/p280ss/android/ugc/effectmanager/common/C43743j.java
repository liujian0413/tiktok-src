package com.p280ss.android.ugc.effectmanager.common;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.effectmanager.common.j */
public final class C43743j extends Handler {

    /* renamed from: a */
    WeakReference<C43744a> f113246a;

    /* renamed from: com.ss.android.ugc.effectmanager.common.j$a */
    public interface C43744a {
        /* renamed from: a */
        void mo105789a(Message message);
    }

    public final void handleMessage(Message message) {
        C43744a aVar = (C43744a) this.f113246a.get();
        if (aVar != null && message != null) {
            aVar.mo105789a(message);
        }
    }

    public C43743j(C43744a aVar) {
        super(Looper.getMainLooper());
        this.f113246a = new WeakReference<>(aVar);
    }

    public C43743j(Looper looper, C43744a aVar) {
        super(looper);
        this.f113246a = new WeakReference<>(aVar);
    }
}
