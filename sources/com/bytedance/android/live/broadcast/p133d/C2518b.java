package com.bytedance.android.live.broadcast.p133d;

import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.broadcast.stream.p144c.C2975a;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.live.broadcast.d.b */
public final class C2518b implements C2975a {

    /* renamed from: a */
    public C2517a f8105a;

    /* renamed from: b */
    private Room f8106b;

    /* renamed from: c */
    private C7321c f8107c;

    /* renamed from: a */
    public final void mo9084a() {
        if (this.f8107c != null && !this.f8107c.isDisposed()) {
            this.f8107c.dispose();
        }
    }

    public C2518b(Room room) {
        this.f8106b = room;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9086a(C3479d dVar) throws Exception {
        this.f8105a.mo8776b(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9087a(Throwable th) throws Exception {
        if (th instanceof ApiServerException) {
            this.f8105a.mo8776b(((ApiServerException) th).getErrorCode());
        }
        this.f8105a.mo8776b(0);
    }

    /* renamed from: a */
    public final void mo9085a(int i, int i2) {
        this.f8107c = C2515f.m10417f().mo9076c().mo9174i().sendStatus(this.f8106b.getId(), i, this.f8106b.getStreamId(), i2).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C2519c<Object>(this), (C7326g<? super Throwable>) new C2520d<Object>(this));
    }
}
