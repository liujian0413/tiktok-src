package com.bytedance.android.livesdk.chatroom.presenter;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.model.C4899c;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p404a.C8416g;
import com.bytedance.android.livesdk.log.p404a.C8420k;
import com.bytedance.android.livesdk.log.p404a.C8423n;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.message.model.C8495au;
import com.bytedance.android.livesdk.message.model.C8503b;
import com.bytedance.android.livesdk.message.model.C8527bq;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.a */
public final class C4934a extends C5017ci<C4935a> implements OnMessageListener {

    /* renamed from: a */
    private final boolean f14143a;

    /* renamed from: b */
    private Room f14144b;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.a$a */
    public interface C4935a extends C5595at {
        /* renamed from: a */
        void mo12917a(C4899c cVar);

        /* renamed from: a */
        void mo12918a(C8495au auVar);

        /* renamed from: a */
        void mo12919a(C8527bq bqVar);
    }

    /* renamed from: a */
    public final void mo9142a(C4935a aVar) {
        super.mo9142a(aVar);
        if (this.f14276h != null) {
            this.f14276h.addMessageListener(MessageType.IN_ROOM_BANNER_MESSAGE.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.D_H5_MESSAGE.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.BANNER_UPDATE.getIntType(), this);
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (mo9140c() != null) {
            if (iMessage instanceof C8495au) {
                C8495au auVar = (C8495au) iMessage;
                if (auVar.f23282b == 1) {
                    ((C4935a) mo9140c()).mo12918a(auVar);
                    return;
                }
            }
            if (iMessage instanceof C8527bq) {
                C8527bq bqVar = (C8527bq) iMessage;
                if (!TextUtils.isEmpty(bqVar.f23440b)) {
                    ((C4935a) mo9140c()).mo12919a(bqVar);
                }
            } else if (iMessage instanceof C8503b) {
                C8503b bVar = (C8503b) iMessage;
                if (bVar.f23298a != null) {
                    ((C4935a) mo9140c()).mo12917a(bVar.f23298a);
                }
            }
        }
    }

    /* renamed from: a */
    public final String mo12915a(String str) {
        String str2;
        String str3 = "";
        String str4 = "";
        String str5 = "";
        String str6 = "";
        String str7 = "";
        C8416g a = C8443c.m25663a().mo21605a(C8438j.class);
        if (a instanceof C8420k) {
            C8420k kVar = (C8420k) a;
            if (kVar.mo21568a().containsKey("enter_from")) {
                str3 = (String) kVar.mo21568a().get("enter_from");
            }
            if (kVar.mo21568a().containsKey("source")) {
                str4 = (String) kVar.mo21568a().get("source");
            }
        }
        C8416g a2 = C8443c.m25663a().mo21605a(Room.class);
        if (a2 instanceof C8423n) {
            C8423n nVar = (C8423n) a2;
            if (nVar.mo21568a().containsKey("anchor_id")) {
                str5 = (String) nVar.mo21568a().get("anchor_id");
            }
            if (nVar.mo21568a().containsKey("log_pb")) {
                str6 = (String) nVar.mo21568a().get("log_pb");
            }
            if (nVar.mo21568a().containsKey("request_id")) {
                str7 = (String) nVar.mo21568a().get("request_id");
            }
        }
        C19290j jVar = new C19290j(str);
        jVar.mo51187a("room_id", this.f14144b.getId());
        jVar.mo51188a("mode", "live_room");
        jVar.mo51187a("anchor_id", this.f14144b.getOwner().getId());
        jVar.mo51188a("is_anchor", String.valueOf(this.f14143a));
        jVar.mo51188a("enter_from", str3);
        jVar.mo51188a("source_v3", str4);
        jVar.mo51188a("anchor_id", str5);
        jVar.mo51188a("log_pb", str6);
        jVar.mo51188a("request_id", str7);
        String str8 = "event_page";
        if (this.f14143a) {
            str2 = "live_take_detail";
        } else {
            str2 = "live_detail";
        }
        jVar.mo51188a(str8, str2);
        jVar.mo51188a("event_belong", "live_interact");
        return jVar.mo51184a();
    }

    public C4934a(Room room, boolean z) {
        this.f14144b = room;
        this.f14143a = z;
    }
}
