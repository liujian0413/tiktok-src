package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C3478c;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4854e;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4855f;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4857h;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4858i;
import p346io.reactivex.C7319aa;

/* renamed from: com.bytedance.android.livesdk.chatroom.api.b */
public final class C4258b {
    /* renamed from: a */
    static final /* synthetic */ C3478c m14403a(C3479d dVar) throws Exception {
        C3478c cVar = new C3478c();
        m14406a(dVar, cVar);
        cVar.f10296b = ((C4858i) dVar.data).f13891a;
        return cVar;
    }

    /* renamed from: b */
    static final /* synthetic */ C3478c m14407b(C3479d dVar) throws Exception {
        C3478c cVar = new C3478c();
        m14406a(dVar, cVar);
        cVar.f10296b = ((C4857h) dVar.data).f13890a;
        return cVar;
    }

    /* renamed from: a */
    private static <T, R> void m14406a(C3479d<R> dVar, C3478c<T> cVar) {
        cVar.f10295a = dVar.statusCode;
        cVar.f10297c = dVar.extra;
        cVar.f10298d = dVar.error;
    }

    /* renamed from: a */
    public static C7319aa<C3478c<C4854e>> m14404a(LinkApi linkApi, long j, int i) {
        return linkApi.getList(j, i).mo19134b(C4259c.f12421a);
    }

    /* renamed from: a */
    public static C7319aa<C3478c<C4855f>> m14405a(LinkApi linkApi, long j, long j2, int i) {
        return linkApi.contributorRank(j, j2, 0).mo19134b(C4260d.f12422a);
    }
}
