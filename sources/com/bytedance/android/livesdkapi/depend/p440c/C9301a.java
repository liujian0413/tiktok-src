package com.bytedance.android.livesdkapi.depend.p440c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.android.livesdkapi.depend.c.a */
public final class C9301a extends Handler {

    /* renamed from: a */
    WeakReference<C9302a> f25480a;

    /* renamed from: com.bytedance.android.livesdkapi.depend.c.a$a */
    public interface C9302a {
        /* renamed from: a */
        void mo12403a(Message message);
    }

    public final void handleMessage(Message message) {
        C9302a aVar = (C9302a) this.f25480a.get();
        if (aVar != null && message != null) {
            aVar.mo12403a(message);
        }
    }

    public C9301a(C9302a aVar) {
        this.f25480a = new WeakReference<>(aVar);
    }

    public C9301a(Looper looper, C9302a aVar) {
        super(looper);
        this.f25480a = new WeakReference<>(aVar);
    }
}
