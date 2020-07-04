package com.p280ss.android.ugc.aweme.app.p1035h;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;

/* renamed from: com.ss.android.ugc.aweme.app.h.b */
public final class C22992b extends HandlerThread {

    /* renamed from: a */
    private Handler f60766a;

    /* renamed from: b */
    private Callback f60767b;

    /* access modifiers changed from: protected */
    public final void onLooperPrepared() {
        this.f60766a = new Handler(getLooper(), this.f60767b);
    }

    /* renamed from: a */
    public final void mo59982a() {
        if (this.f60766a != null) {
            this.f60766a.sendMessage(this.f60766a.obtainMessage(1));
        }
    }

    /* renamed from: a */
    public final void mo59983a(C22991a aVar) {
        if (this.f60766a != null) {
            Message obtainMessage = this.f60766a.obtainMessage(0);
            obtainMessage.obj = aVar;
            obtainMessage.setTarget(this.f60766a);
            this.f60766a.sendMessage(obtainMessage);
        }
    }
}
