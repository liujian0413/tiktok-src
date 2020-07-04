package com.bytedance.android.livesdk.rank.p421c;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.network.response.C3477b;
import com.bytedance.android.livesdk.chatroom.p209bl.C4275g;
import com.bytedance.android.livesdk.rank.model.C8852a;
import com.bytedance.android.livesdk.rank.p419a.C8805a.C8806a;
import com.bytedance.android.livesdk.rank.p419a.C8805a.C8807b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;

/* renamed from: com.bytedance.android.livesdk.rank.c.e */
public final class C8825e implements C8806a, C6310a {

    /* renamed from: a */
    private final C6309f f23980a = new C6309f(this);

    /* renamed from: b */
    private final C8807b f23981b;

    /* renamed from: c */
    private final long f23982c;

    /* renamed from: d */
    private final long f23983d;

    /* renamed from: e */
    private boolean f23984e = false;

    /* renamed from: b */
    public final void mo21884b() {
        this.f23980a.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void mo21882a() {
        if (!this.f23984e) {
            this.f23984e = true;
            C4275g.m14448a((Handler) this.f23980a, this.f23983d, this.f23982c, 12, 0);
        }
    }

    /* renamed from: a */
    public final void mo21883a(int i) {
        C4275g.m14448a((Handler) this.f23980a, this.f23983d, this.f23982c, i, 0);
    }

    public final void handleMsg(Message message) {
        long j = 0;
        if (message.what == 12) {
            this.f23984e = false;
            if (message.obj instanceof Exception) {
                this.f23981b.mo21871a((Exception) message.obj);
                return;
            }
            C3477b bVar = (C3477b) message.obj;
            C8852a aVar = (C8852a) bVar.data;
            if (bVar.extra != null) {
                j = bVar.extra.now;
            }
            aVar.f24085r = j;
            this.f23981b.mo21869a(aVar);
        } else if (message.obj instanceof Exception) {
            this.f23981b.mo21870a(null, message.what);
        } else {
            C3477b bVar2 = (C3477b) message.obj;
            C8852a aVar2 = (C8852a) bVar2.data;
            if (bVar2.extra != null) {
                j = bVar2.extra.now;
            }
            aVar2.f24085r = j;
            this.f23981b.mo21870a(aVar2, message.what);
        }
    }

    public C8825e(C8807b bVar, long j, long j2) {
        this.f23981b = bVar;
        this.f23982c = j;
        this.f23983d = j2;
    }
}
