package com.bytedance.android.livesdk.chatroom.event;

import android.os.Bundle;

/* renamed from: com.bytedance.android.livesdk.chatroom.event.o */
public class C4445o {

    /* renamed from: a */
    public long f12898a;

    /* renamed from: b */
    public String f12899b;

    /* renamed from: c */
    public Bundle f12900c;

    /* renamed from: d */
    public boolean f12901d;

    public C4445o(long j) {
        this.f12898a = j;
    }

    public C4445o(long j, Bundle bundle, boolean z) {
        this.f12898a = j;
        this.f12900c = bundle;
        this.f12901d = true;
    }

    public C4445o(long j, String str, Bundle bundle) {
        this.f12898a = j;
        this.f12899b = str;
        this.f12900c = bundle;
    }
}
