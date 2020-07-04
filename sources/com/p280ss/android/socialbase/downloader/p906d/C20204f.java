package com.p280ss.android.socialbase.downloader.p906d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.socialbase.downloader.d.f */
public final class C20204f extends Handler {

    /* renamed from: a */
    private final WeakReference<C20205a> f54692a;

    /* renamed from: com.ss.android.socialbase.downloader.d.f$a */
    public interface C20205a {
        /* renamed from: a */
        void mo54120a(Message message);
    }

    public final void handleMessage(Message message) {
        C20205a aVar = (C20205a) this.f54692a.get();
        if (aVar != null && message != null) {
            aVar.mo54120a(message);
        }
    }

    public C20204f(Looper looper, C20205a aVar) {
        super(looper);
        this.f54692a = new WeakReference<>(aVar);
    }
}
