package com.bytedance.p263im.core.internal.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.im.core.internal.utils.k */
public final class C11433k extends Handler {

    /* renamed from: a */
    WeakReference<C11434a> f30947a;

    /* renamed from: com.bytedance.im.core.internal.utils.k$a */
    public interface C11434a {
        /* renamed from: a */
        void mo27309a(Message message);
    }

    public final void handleMessage(Message message) {
        C11434a aVar = (C11434a) this.f30947a.get();
        if (aVar != null && message != null) {
            aVar.mo27309a(message);
        }
    }

    public C11433k(C11434a aVar) {
        this.f30947a = new WeakReference<>(aVar);
    }

    public C11433k(Looper looper, C11434a aVar) {
        super(looper);
        this.f30947a = new WeakReference<>(aVar);
    }
}
