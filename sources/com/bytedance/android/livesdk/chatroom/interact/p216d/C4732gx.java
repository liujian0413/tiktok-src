package com.bytedance.android.livesdk.chatroom.interact.p216d;

import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.browser.jsbridge.p199a.C4031a;
import com.bytedance.android.livesdk.browser.jsbridge.p199a.C4036f;
import com.bytedance.android.livesdk.chatroom.presenter.C5017ci;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.android.livesdk.message.model.C8504ba;
import com.bytedance.android.livesdk.message.model.C8508bd;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.C6711m;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7494t;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.gx */
public final class C4732gx extends C5017ci<C4733a> implements OnMessageListener {

    /* renamed from: a */
    private Set<MessageType> f13451a = new HashSet();

    /* renamed from: b */
    private LinkCrossRoomDataHolder f13452b = LinkCrossRoomDataHolder.m13782a();

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.gx$a */
    public interface C4733a extends C5595at {
        /* renamed from: a */
        void mo12656a();

        /* renamed from: a */
        void mo12657a(int i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12653a(Throwable th) {
        mo13031m(th);
    }

    public final void onEvent(C4031a aVar) {
        ((C4733a) mo9140c()).mo12657a(aVar.f12004a);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo12652a(String str) {
        List list = (List) this.f13452b.get("data_banner_pending_data");
        if (list == null) {
            list = new ArrayList();
        }
        list.add(str);
        this.f13452b.lambda$put$1$DataCenter("data_banner_pending_data", list);
    }

    public final void onMessage(IMessage iMessage) {
        if (mo9140c() != null) {
            if (iMessage instanceof C8504ba) {
                ((C4733a) mo9140c()).mo12656a();
                this.f13451a.clear();
                return;
            }
            m15577b(iMessage);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ String m15576a(IMessage iMessage) throws Exception {
        if (!(iMessage instanceof C8508bd)) {
            return C2317a.m9932a().mo15979b((Object) iMessage);
        }
        C8508bd bdVar = (C8508bd) iMessage;
        C6711m mVar = new C6711m();
        mVar.mo16144a("extra", C2317a.m9932a().mo15963a((Object) bdVar));
        if (bdVar.baseMessage != null) {
            mVar.mo16144a("common", C2317a.m9932a().mo15963a((Object) bdVar.baseMessage));
        }
        return mVar.toString();
    }

    /* renamed from: b */
    private void m15577b(IMessage iMessage) {
        ((C3245ad) C7492s.m23301b(iMessage).mo19304b(C7333a.m23042a()).mo19317d(C4737ha.f13466a).mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) mo13032t())).mo10183a(new C4738hb(this), new C4739hc(this));
    }

    /* renamed from: a */
    public final void mo9142a(C4733a aVar) {
        super.mo9142a(aVar);
        if (this.f14276h != null) {
            this.f14276h.addMessageListener(MessageType.LINK_MIC_BATTLE.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.LINK_MIC_BATTLE_TASK.getIntType(), this);
        }
        ((C3245ad) C9097a.m27146a().mo22266a(C4031a.class).mo19297a((C7494t<T, ? extends R>) mo13032t())).mo10182a((C7326g<? super T>) new C4734gy<Object>(this));
        ((C3245ad) C9097a.m27146a().mo22266a(C4036f.class).mo19297a((C7494t<T, ? extends R>) mo13032t())).mo10182a((C7326g<? super T>) new C4735gz<Object>(this));
    }

    public final void onEvent(C4036f fVar) {
        for (MessageType messageType : this.f13451a) {
            if (!fVar.mo11655a().contains(messageType)) {
                if (this.f14276h != null) {
                    this.f14276h.removeMessageListener(messageType.getIntType(), this);
                }
                this.f13451a.remove(messageType);
            }
        }
        for (MessageType messageType2 : fVar.mo11655a()) {
            if (!this.f13451a.contains(messageType2)) {
                if (this.f14276h != null) {
                    this.f14276h.addMessageListener(messageType2.getIntType(), this);
                }
                this.f13451a.add(messageType2);
            }
        }
    }
}
