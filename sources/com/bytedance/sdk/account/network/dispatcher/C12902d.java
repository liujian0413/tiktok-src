package com.bytedance.sdk.account.network.dispatcher;

import android.os.Message;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.bytedance.sdk.account.network.dispatcher.d */
public final class C12902d extends C12899a {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo31369a() {
        super.mo31369a();
    }

    public final /* bridge */ /* synthetic */ void run() {
        super.run();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo31371b() {
        return super.mo31371b();
    }

    /* renamed from: d */
    public final void mo31373d() {
        this.f34087c.removeMessages(1);
    }

    /* renamed from: c */
    public final void mo31372c() {
        mo31373d();
        this.f34087c.sendEmptyMessageDelayed(1, 2000);
    }

    /* renamed from: a */
    public final void mo31370a(C12901c cVar) {
        if (cVar != null) {
            cVar.mo31384h();
        }
    }

    public final void handleMsg(Message message) {
        if (message != null) {
            try {
                if (message.what == 1) {
                    f34085a.mo31389e();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public C12902d(BlockingQueue<IRequest> blockingQueue, String str, String str2) {
        super(blockingQueue, str, str2);
    }
}
