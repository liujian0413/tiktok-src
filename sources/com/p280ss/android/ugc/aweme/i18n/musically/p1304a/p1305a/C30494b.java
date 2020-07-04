package com.p280ss.android.ugc.aweme.i18n.musically.p1304a.p1305a;

import android.os.Handler;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.notice.repo.api.NotificationApi;
import java.util.TimerTask;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.a.a.b */
final class C30494b extends TimerTask {

    /* renamed from: a */
    private Handler f80106a;

    public final void run() {
        C23397p.m76735a().mo60807a(this.f80106a, new Callable() {
            public final Object call() throws Exception {
                return NotificationApi.m111064a(3);
            }
        }, 1000);
    }

    C30494b(Handler handler) {
        this.f80106a = handler;
    }
}
