package com.bytedance.common.utility.collection;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.common.utility.collection.f */
public final class C6309f extends Handler {

    /* renamed from: a */
    WeakReference<C6310a> f18547a;

    /* renamed from: com.bytedance.common.utility.collection.f$a */
    public interface C6310a {
        void handleMsg(Message message);
    }

    public final void handleMessage(Message message) {
        C6310a aVar = (C6310a) this.f18547a.get();
        if (aVar != null && message != null) {
            aVar.handleMsg(message);
        }
    }

    public C6309f(C6310a aVar) {
        Looper looper;
        if (Looper.myLooper() == null) {
            looper = Looper.getMainLooper();
        } else {
            looper = Looper.myLooper();
        }
        this(looper, aVar);
    }

    public C6309f(Looper looper, C6310a aVar) {
        super(looper);
        this.f18547a = new WeakReference<>(aVar);
    }
}
