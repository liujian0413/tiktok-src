package com.p280ss.android.downloadlib.p868c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.downloadlib.c.i */
public final class C19524i extends Handler {

    /* renamed from: a */
    WeakReference<C19525a> f52817a;

    /* renamed from: com.ss.android.downloadlib.c.i$a */
    public interface C19525a {
        /* renamed from: a */
        void mo51520a(Message message);
    }

    public final void handleMessage(Message message) {
        C19525a aVar = (C19525a) this.f52817a.get();
        if (aVar != null && message != null) {
            aVar.mo51520a(message);
        }
    }

    public C19524i(Looper looper, C19525a aVar) {
        super(looper);
        this.f52817a = new WeakReference<>(aVar);
    }
}
