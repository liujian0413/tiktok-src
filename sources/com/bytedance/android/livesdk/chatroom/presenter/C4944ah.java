package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.android.livesdk.gift.relay.p392a.C8269a;
import com.bytedance.android.livesdk.gift.relay.p392a.C8270b;
import p346io.reactivex.C7497x;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.ah */
public final class C4944ah extends C5017ci<C4945a> {

    /* renamed from: a */
    private C7321c f14153a;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.ah$a */
    public interface C4945a extends C5595at {
        /* renamed from: a */
        void mo12928a(C8269a aVar);
    }

    /* renamed from: a */
    public final void mo8963a() {
        super.mo8963a();
        if (this.f14153a != null && !this.f14153a.isDisposed()) {
            this.f14153a.dispose();
        }
    }

    /* renamed from: a */
    public final void mo9142a(C4945a aVar) {
        super.mo9142a(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12926a(C3479d dVar) throws Exception {
        if (dVar != null && dVar.data != null) {
            ((C4945a) mo9140c()).mo12928a(((C8270b) dVar.data).f22709a);
        }
    }

    /* renamed from: a */
    public final void mo12925a(long j, long j2, long j3) {
        this.f14153a = ((GiftRetrofitApi) C3458e.m12798a().mo10440a(GiftRetrofitApi.class)).checkFreeCellStatus(j, j2, j3).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19281a((C7326g<? super T>) new C4946ai<Object>(this), C4947aj.f14155a, C4948ak.f14156a);
    }
}
