package com.bytedance.android.livesdk.chatroom.presenter;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.message.model.C8545cg;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bz */
public final class C5000bz extends C5017ci<C5001a> implements OnMessageListener {

    /* renamed from: a */
    private Queue<C8545cg> f14228a;

    /* renamed from: b */
    private long f14229b;

    /* renamed from: c */
    private boolean f14230c;

    /* renamed from: d */
    private long f14231d;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bz$a */
    public interface C5001a extends C5595at {
        /* renamed from: a */
        void mo13000a(C8545cg cgVar);

        /* renamed from: a */
        boolean mo13001a();
    }

    /* renamed from: a */
    public final void mo8963a() {
        if (this.f14228a != null) {
            this.f14228a.clear();
        }
        super.mo8963a();
    }

    /* renamed from: b */
    public final void mo12999b() {
        if (mo9140c() != null && !((C5001a) mo9140c()).mo13001a()) {
            C8545cg cgVar = (C8545cg) this.f14228a.poll();
            if (cgVar != null) {
                ((C5001a) mo9140c()).mo13000a(cgVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo9142a(C5001a aVar) {
        super.mo9142a(aVar);
        this.f14230c = ((Boolean) this.f14275g.get("data_is_anchor")).booleanValue();
        this.f14229b = ((Long) this.f14275g.get("data_room_id")).longValue();
        if (this.f14275g.get("data_room") instanceof Room) {
            this.f14231d = ((Room) this.f14275g.get("data_room")).getOwnerUserId();
        }
        if (this.f14276h != null) {
            this.f14276h.addMessageListener(MessageType.ROOM_PUSH.getIntType(), this);
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof C8545cg) {
            C8545cg cgVar = (C8545cg) iMessage;
            if (cgVar.baseMessage != null && cgVar.baseMessage.f25993c == this.f14229b) {
                if (this.f14228a == null) {
                    this.f14228a = new ArrayDeque();
                }
                if (!TextUtils.isEmpty(cgVar.f23528f) && cgVar.f23528f.equals("8") && (TextUtils.isEmpty((CharSequence) LiveConfigSettingKeys.LIVE_TURNTABLE_URL.mo10240a()) || this.f14230c)) {
                    return;
                }
                if (TextUtils.isEmpty(cgVar.f23528f) || !cgVar.f23528f.equals("10") || (!TextUtils.isEmpty((CharSequence) LiveConfigSettingKeys.LIVE_TURNTABLE_URL.mo10240a()) && !this.f14230c)) {
                    this.f14228a.offer(cgVar);
                    mo12999b();
                }
            }
        }
    }
}
