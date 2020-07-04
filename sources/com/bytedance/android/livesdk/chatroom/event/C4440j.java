package com.bytedance.android.livesdk.chatroom.event;

import com.bytedance.android.livesdk.gift.model.C8149d;

/* renamed from: com.bytedance.android.livesdk.chatroom.event.j */
public class C4440j {

    /* renamed from: a */
    public C8149d f12889a;

    /* renamed from: b */
    public int f12890b;

    /* renamed from: c */
    public boolean f12891c;

    public C4440j(C8149d dVar) {
        this.f12889a = dVar;
    }

    public C4440j(C8149d dVar, int i) {
        this(dVar, i, false);
    }

    public C4440j(C8149d dVar, int i, boolean z) {
        this.f12889a = dVar;
        this.f12890b = i;
        this.f12891c = z;
    }
}
