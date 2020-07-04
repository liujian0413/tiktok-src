package com.p280ss.android.p817ad.splash.p836g;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ad.splash.g.p */
public final class C19139p extends Handler {

    /* renamed from: a */
    private WeakReference<C19140a> f51731a;

    /* renamed from: com.ss.android.ad.splash.g.p$a */
    public interface C19140a {
        /* renamed from: a */
        void mo50406a(Message message);
    }

    public final void handleMessage(Message message) {
        C19140a aVar = (C19140a) this.f51731a.get();
        if (aVar != null && message != null) {
            aVar.mo50406a(message);
        }
    }

    public C19139p(C19140a aVar) {
        Looper looper;
        if (Looper.myLooper() == null) {
            looper = Looper.getMainLooper();
        } else {
            looper = Looper.myLooper();
        }
        this(looper, aVar);
    }

    public C19139p(Looper looper, C19140a aVar) {
        super(looper);
        this.f51731a = new WeakReference<>(aVar);
    }
}
