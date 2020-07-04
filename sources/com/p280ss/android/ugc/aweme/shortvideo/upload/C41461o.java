package com.p280ss.android.ugc.aweme.shortvideo.upload;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.o */
public final class C41461o {

    /* renamed from: a */
    private HandlerThread f107845a = new HandlerThread("PublishCommandExecutor");

    /* renamed from: b */
    private Handler f107846b;

    /* renamed from: a */
    public final void mo102128a() {
        this.f107845a.quit();
    }

    public C41461o() {
        this.f107845a.start();
        this.f107846b = new Handler(this.f107845a.getLooper());
    }

    /* renamed from: a */
    public final void mo102129a(C41459m mVar) throws InterruptedException {
        if (this.f107845a.isAlive()) {
            this.f107846b.post(new C41462p(mVar));
            return;
        }
        throw new InterruptedException("PublishCommandExecutor has quit");
    }
}
