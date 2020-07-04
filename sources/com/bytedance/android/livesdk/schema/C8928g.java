package com.bytedance.android.livesdk.schema;

import p346io.reactivex.C47870u;
import p346io.reactivex.C7495v;

/* renamed from: com.bytedance.android.livesdk.schema.g */
final /* synthetic */ class C8928g implements C7495v {

    /* renamed from: a */
    private final RoomActionHandler f24295a;

    /* renamed from: b */
    private final long f24296b;

    C8928g(RoomActionHandler roomActionHandler, long j) {
        this.f24295a = roomActionHandler;
        this.f24296b = j;
    }

    public final void subscribe(C47870u uVar) {
        this.f24295a.lambda$handle$0$RoomActionHandler(this.f24296b, uVar);
    }
}
