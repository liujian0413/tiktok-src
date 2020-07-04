package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.p164b.C3430a;
import com.bytedance.android.live.gift.p164b.C3431b;
import com.bytedance.android.live.gift.p164b.C3432c;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.event.C4425aq;
import com.bytedance.android.livesdk.gift.C8163o;
import com.bytedance.android.livesdk.gift.model.C8158m;
import com.bytedance.android.livesdk.gift.p374d.C7895a;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p404a.C8416g;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p431y.p433b.C9281a;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.x */
public final class C5046x extends C3430a {

    /* renamed from: a */
    public DataCenter f14334a;

    /* renamed from: b */
    public final Room f14335b;

    /* renamed from: c */
    public IMessageManager f14336c;

    /* renamed from: d */
    private final boolean f14337d;

    /* renamed from: e */
    private C3431b f14338e;

    /* renamed from: a */
    public final void mo8963a() {
        if (mo9140c() != null) {
            ((C3432c) mo9140c()).mo10398b();
        }
        this.f14338e = null;
        super.mo8963a();
    }

    public C5046x(DataCenter dataCenter) {
        this.f14334a = dataCenter;
        this.f14335b = (Room) dataCenter.get("data_room");
        this.f14337d = ((Boolean) dataCenter.get("data_is_anchor")).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo9142a(C3432c cVar) {
        super.mo9142a(cVar);
        this.f14336c = (IMessageManager) this.f14334a.get("data_message_manager");
        this.f14338e = new C3431b() {
            /* renamed from: b */
            public final void mo10397b() {
                if (C5046x.this.mo9140c() != null) {
                    C9049ap.m27022a((int) R.string.es1);
                }
            }

            /* renamed from: a */
            public final void mo10394a() {
                C4425aq aqVar = new C4425aq(0, "live_detail", "gift_guide");
                C9049ap.m27022a((int) R.string.fc7);
                C5046x.this.f14334a.lambda$put$1$DataCenter("cmd_show_recharge_dialog", aqVar);
            }

            /* renamed from: a */
            public final void mo10396a(String str) {
                if (C5046x.this.mo9140c() != null) {
                    C9049ap.m27028a(str);
                }
            }

            /* renamed from: a */
            public final void mo10395a(C8158m mVar) {
                if (C5046x.this.mo9140c() != null) {
                    ((C3432c) C5046x.this.mo9140c()).mo10398b();
                }
                User user = (User) C5046x.this.f14334a.get("data_user_in_room");
                if (C5046x.this.f14336c != null) {
                    C5046x.this.f14336c.insertMessage(C8163o.m24998a(C5046x.this.f14335b.getId(), mVar, user));
                }
                C5046x.this.f14334a.get("log_enter_live_source");
                String str = (String) C5046x.this.f14334a.get("log_action_type");
                C8416g a = C8443c.m25663a().mo21605a(C8438j.class);
                String str2 = "";
                String str3 = "";
                if (a.mo21568a().containsKey("source")) {
                    str3 = (String) a.mo21568a().get("source");
                }
                if (a.mo21568a().containsKey("enter_from")) {
                    str2 = (String) a.mo21568a().get("enter_from");
                }
                HashMap hashMap = new HashMap();
                hashMap.put("event_type", "core");
                hashMap.put("event_belong", "live_interact");
                hashMap.put("event_page", "live_detail");
                hashMap.put("room_id", String.valueOf(C5046x.this.f14335b.getId()));
                hashMap.put("enter_from", str2);
                hashMap.put("anchor_id", String.valueOf(C5046x.this.f14335b.getOwner().getId()));
                hashMap.put("gift_id", String.valueOf(mVar.f22301e));
                hashMap.put("live_type", "video_live");
                hashMap.put("gift_type", "convenient_gift");
                hashMap.put("source", str3);
                hashMap.put("request_page", "shortcut");
                hashMap.put("event_type", "other");
                hashMap.put("event_module", "bottom_tab");
                hashMap.put("money", "1");
                hashMap.put("gift_cnt", "1");
                hashMap.put("action_type", str);
                HashMap hashMap2 = new HashMap();
                hashMap2.put(Long.valueOf(mVar.f22301e), Integer.valueOf(1));
                hashMap.put("gift_info", C7895a.m24190a(hashMap2));
                hashMap.put("is_first_consume", String.valueOf(C9281a.m27615a(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a())));
                hashMap.put("growth_deepevent", "1");
                C8443c.m25663a().mo21606a("send_gift", hashMap, new C8438j());
            }
        };
    }
}
