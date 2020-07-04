package com.bytedance.android.livesdk.honor;

import com.bytedance.android.livesdk.chatroom.presenter.C5017ci;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.android.livesdk.message.model.C8498ax;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.LinkedList;

/* renamed from: com.bytedance.android.livesdk.honor.a */
public final class C8298a extends C5017ci<C8299a> implements OnMessageListener {

    /* renamed from: a */
    private LinkedList<C8498ax> f22785a = new LinkedList<>();

    /* renamed from: b */
    private C8498ax f22786b;

    /* renamed from: com.bytedance.android.livesdk.honor.a$a */
    public interface C8299a extends C5595at {
        /* renamed from: a */
        void mo21450a(C8498ax axVar);
    }

    /* renamed from: a */
    public final void mo8963a() {
        super.mo8963a();
    }

    /* renamed from: b */
    public final void mo21452b() {
        if (this.f22785a.isEmpty()) {
            return;
        }
        if (this.f22786b == null || !this.f22786b.f23288d) {
            this.f22786b = (C8498ax) this.f22785a.poll();
            if (this.f22786b != null) {
                this.f22786b.f23288d = true;
                if (mo9140c() != null) {
                    ((C8299a) mo9140c()).mo21450a(this.f22786b);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo9142a(C8299a aVar) {
        super.mo9142a(aVar);
        if (this.f14276h != null) {
            this.f14276h.addMessageListener(MessageType.HONOR_LEVEL_UP.getIntType(), this);
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (iMessage != null && iMessage.getIntType() == MessageType.HONOR_LEVEL_UP.getIntType()) {
            this.f22785a.offer((C8498ax) iMessage);
            mo21452b();
        }
    }
}
