package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.api.PkPromotionApi;
import com.bytedance.android.livesdk.chatroom.model.C4874ai;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7497x;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.br */
public final class C4991br extends C5017ci<C4992a> implements OnMessageListener {

    /* renamed from: a */
    private Room f14219a;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.br$a */
    public interface C4992a extends C5595at {
        /* renamed from: a */
        void mo12997a(C4874ai aiVar, long j, boolean z);
    }

    public final void onMessage(IMessage iMessage) {
        m16034a(true);
    }

    /* renamed from: a */
    public final void mo9142a(C4992a aVar) {
        super.mo9142a(aVar);
        this.f14219a = (Room) this.f14275g.get("data_room");
        if (this.f14276h != null) {
            this.f14276h.addMessageListener(MessageType.LINK_MIC_BATTLE_FINISH.getIntType(), this);
        }
        m16034a(false);
    }

    /* renamed from: a */
    private void m16034a(boolean z) {
        ((C3245ad) ((PkPromotionApi) C9178j.m27302j().mo22373b().mo10440a(PkPromotionApi.class)).getCurrentMedal(this.f14219a.getOwner().getId()).mo19293a((C7497x<? super T, ? extends R>) ((C4992a) mo9140c()).getAutoUnbindTransformer()).mo19297a((C7494t<T, ? extends R>) mo13033u())).mo10183a(new C4993bs(this, z), new C4994bt(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12996a(boolean z, C3479d dVar) throws Exception {
        C4874ai aiVar = (C4874ai) dVar.data;
        if (aiVar != null && mo9140c() != null) {
            ((C4992a) mo9140c()).mo12997a(aiVar, dVar.extra.now, z);
        }
    }
}
