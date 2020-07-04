package com.bytedance.android.livesdk.chatroom.interact.p216d;

import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.presenter.C5017ci;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.android.livesdk.message.model.C8508bd;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.C6711m;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.List;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7494t;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.ec */
public final class C4646ec extends C5017ci<C4647a> implements OnMessageListener {

    /* renamed from: a */
    private LinkCrossRoomDataHolder f13319a = LinkCrossRoomDataHolder.m13782a();

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.ec$a */
    public interface C4647a extends C5595at {
    }

    /* renamed from: a */
    public final void mo8963a() {
        super.mo8963a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12545a(Throwable th) {
        mo13031m(th);
    }

    public final void onMessage(IMessage iMessage) {
        if (mo9140c() != null && (iMessage instanceof C8508bd)) {
            m15382b(iMessage);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo12544a(String str) {
        List list = (List) this.f13319a.get("data_inroom_banner_pending_data");
        if (list == null) {
            list = new ArrayList();
        }
        list.add(str);
        this.f13319a.lambda$put$1$DataCenter("data_inroom_banner_pending_data", list);
    }

    /* renamed from: a */
    public final void mo9142a(C4647a aVar) {
        super.mo9142a(aVar);
        if (this.f14276h != null) {
            this.f14276h.addMessageListener(MessageType.LINK_MIC.getIntType(), this);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ String m15381a(IMessage iMessage) throws Exception {
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
    private void m15382b(IMessage iMessage) {
        ((C3245ad) C7492s.m23301b(iMessage).mo19304b(C7333a.m23042a()).mo19317d(C4648ed.f13320a).mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) mo13032t())).mo10183a(new C4649ee(this), new C4650ef(this));
    }
}
