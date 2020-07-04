package com.bytedance.android.livesdk.chatroom.presenter;

import android.content.Context;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.gift.model.C8149d;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.u */
final /* synthetic */ class C5043u implements C7326g {

    /* renamed from: a */
    private final C5040t f14327a;

    /* renamed from: b */
    private final C8149d f14328b;

    /* renamed from: c */
    private final long f14329c;

    /* renamed from: d */
    private final Context f14330d;

    C5043u(C5040t tVar, C8149d dVar, long j, Context context) {
        this.f14327a = tVar;
        this.f14328b = dVar;
        this.f14329c = j;
        this.f14330d = context;
    }

    public final void accept(Object obj) {
        this.f14327a.mo13071a(this.f14328b, this.f14329c, this.f14330d, (C3479d) obj);
    }
}
