package com.bytedance.android.livesdk.commonpop;

import android.text.TextUtils;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.p148d.C3172e;
import com.bytedance.android.livesdk.chatroom.presenter.C5017ci;
import com.bytedance.android.livesdk.message.model.C8685q;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.commonpop.a */
public final class C5861a extends C5017ci<C5862b> implements OnMessageListener {
    /* renamed from: a */
    public final void mo9142a(C5862b bVar) {
        super.mo9142a(bVar);
        if (this.f14276h != null) {
            this.f14276h.addMessageListener(MessageType.COMMON_POPUP_MESSAGE.getIntType(), this);
        }
    }

    public final void onMessage(IMessage iMessage) {
        boolean z;
        if (!(mo9140c() == null || iMessage == null || !(iMessage instanceof C8685q))) {
            C8685q qVar = (C8685q) iMessage;
            boolean z2 = qVar.f23654b;
            if (this.f14275g != null) {
                z = ((Boolean) this.f14275g.get("data_is_anchor", Boolean.valueOf(false))).booleanValue();
            } else {
                z = false;
            }
            if (!TextUtils.isEmpty(qVar.f23653a) && mo9140c() != null) {
                if (z2 || !z) {
                    C3172e.m12002a("ttlive_show_common_dialog", 0, new JSONObject());
                    ((C5862b) mo9140c()).mo14352a(qVar.f23653a);
                    try {
                        C3166a.m11961b("COMMON_POPUP_DIALOG_SHOW", qVar.f23653a);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }
}
