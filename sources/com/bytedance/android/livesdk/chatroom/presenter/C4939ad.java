package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.android.livesdk.gift.relay.p392a.C8269a;
import com.bytedance.android.livesdk.gift.relay.p392a.C8270b;
import com.bytedance.android.livesdk.message.model.C8483aj;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import p346io.reactivex.C7497x;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.ad */
public final class C4939ad extends C5017ci<C4940a> implements OnMessageListener {

    /* renamed from: a */
    private C7321c f14149a;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.ad$a */
    public interface C4940a extends C5595at {
        /* renamed from: a */
        void mo12923a(C8269a aVar);

        /* renamed from: a */
        void mo12924a(C8483aj ajVar);
    }

    /* renamed from: a */
    public final void mo8963a() {
        super.mo8963a();
        if (this.f14149a != null && !this.f14149a.isDisposed()) {
            this.f14149a.dispose();
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof C8483aj) {
            ((C4940a) mo9140c()).mo12924a((C8483aj) iMessage);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12921a(C3479d dVar) throws Exception {
        if (dVar != null && dVar.data != null) {
            ((C4940a) mo9140c()).mo12923a(((C8270b) dVar.data).f22709a);
        }
    }

    /* renamed from: a */
    public final void mo9142a(C4940a aVar) {
        super.mo9142a(aVar);
        if (this.f14276h != null) {
            this.f14276h.addMessageListener(MessageType.FREE_CELL_GIFT_MESSAGE.getIntType(), this);
        }
    }

    /* renamed from: a */
    public final void mo12920a(long j, long j2, long j3) {
        this.f14149a = ((GiftRetrofitApi) C3458e.m12798a().mo10440a(GiftRetrofitApi.class)).checkFreeCellStatus(j, j2, j3).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19281a((C7326g<? super T>) new C4941ae<Object>(this), C4942af.f14151a, C4943ag.f14152a);
    }
}
