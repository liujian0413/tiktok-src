package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.v */
public final class C31001v extends Handler {

    /* renamed from: a */
    WeakReference<C31002a> f81163a;

    /* renamed from: b */
    private volatile int f81164b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.v$a */
    public interface C31002a {
        /* renamed from: a */
        void mo18063a();

        /* renamed from: a */
        void mo18064a(Object obj, int i);

        /* renamed from: c */
        void mo18065c();
    }

    public C31001v(C31002a aVar) {
        this.f81163a = new WeakReference<>(aVar);
    }

    public final void handleMessage(Message message) {
        super.handleMessage(message);
        C31002a aVar = (C31002a) this.f81163a.get();
        if (!(aVar == null || message == null)) {
            Object obj = message.obj;
            switch (message.what) {
                case 1:
                    aVar.mo18063a();
                    if (this.f81164b != 0) {
                        this.f81164b = 0;
                        removeMessages(1);
                        return;
                    }
                    break;
                case 2:
                    if (this.f81164b == 0) {
                        sendEmptyMessageDelayed(1, 300);
                    }
                    this.f81164b++;
                    return;
                case 3:
                    aVar.mo18065c();
                    return;
                case 4:
                    if (obj != null) {
                        aVar.mo18064a(obj, 0);
                        return;
                    }
                    break;
                case 5:
                    if (obj != null) {
                        aVar.mo18064a(obj, 1);
                        return;
                    }
                    break;
                case 6:
                    if (obj != null) {
                        aVar.mo18064a(obj, 2);
                        return;
                    }
                    break;
                case 7:
                    if (obj != null) {
                        aVar.mo18064a(obj, 3);
                        break;
                    }
                    break;
            }
        }
    }
}
