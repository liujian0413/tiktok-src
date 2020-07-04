package com.bytedance.android.livesdk;

import android.os.Bundle;

/* renamed from: com.bytedance.android.livesdk.r */
final /* synthetic */ class C6139r implements Runnable {

    /* renamed from: a */
    private final LiveRoomFragment f18089a;

    /* renamed from: b */
    private final String f18090b;

    /* renamed from: c */
    private final Bundle f18091c;

    /* renamed from: d */
    private final String f18092d;

    /* renamed from: e */
    private final long f18093e;

    C6139r(LiveRoomFragment liveRoomFragment, String str, Bundle bundle, String str2, long j) {
        this.f18089a = liveRoomFragment;
        this.f18090b = str;
        this.f18091c = bundle;
        this.f18092d = str2;
        this.f18093e = j;
    }

    public final void run() {
        this.f18089a.mo11354a(this.f18090b, this.f18091c, this.f18092d, this.f18093e);
    }
}
