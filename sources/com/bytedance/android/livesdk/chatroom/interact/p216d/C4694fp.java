package com.bytedance.android.livesdk.chatroom.interact.p216d;

import android.arch.lifecycle.C0053p;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.PkResult;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.PkState;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4861l;
import com.bytedance.android.livesdk.chatroom.p209bl.C4270b;
import com.bytedance.android.livesdk.chatroom.presenter.C5017ci;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.android.livesdk.message.model.C8499ay;
import com.bytedance.android.livesdk.message.model.C8504ba;
import com.bytedance.android.livesdk.message.model.C8505bb;
import com.bytedance.android.livesdk.message.model.C8543ce;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.C9376n;
import com.bytedance.android.livesdkapi.depend.model.live.C9376n.C9377a;
import com.bytedance.android.livesdkapi.depend.model.live.C9380q;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.fp */
public final class C4694fp extends C5017ci<C4695a> implements C0053p<KVData>, OnMessageListener {

    /* renamed from: a */
    private Room f13391a;

    /* renamed from: b */
    private LinkCrossRoomDataHolder f13392b = LinkCrossRoomDataHolder.m13782a();

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.fp$a */
    public interface C4695a extends C5595at {
        /* renamed from: a */
        void mo12615a();

        /* renamed from: a */
        void mo12616a(User user, User user2, C4861l lVar);
    }

    /* renamed from: a */
    public final void mo8963a() {
        this.f13392b.removeObserver(this);
        super.mo8963a();
    }

    /* renamed from: b */
    private void m15500b() {
        List list;
        String str;
        PkResult pkResult = (PkResult) this.f13392b.get("data_pk_result", PkResult.EVEN);
        if (pkResult == PkResult.LEFT_WON) {
            list = (List) this.f13392b.get("data_pk_mvp_list_anchor");
        } else if (pkResult == PkResult.RIGHT_WON) {
            list = (List) this.f13392b.get("data_pk_mvp_list_guest");
        } else {
            return;
        }
        if (!C6311g.m19573a(list)) {
            String str2 = ((C9377a) list.get(0)).f25741c;
            if (((C9377a) list.get(0)).f25739a == TTLiveSDKContext.getHostService().mo22367h().mo22179b()) {
                str = C3358ac.m12515a((int) R.string.ew1);
            } else if (pkResult == PkResult.LEFT_WON) {
                str = C3358ac.m12517a((int) R.string.ew0, str2);
            } else {
                str = null;
            }
            if (str != null) {
                C8543ce a = C4270b.m14421a(this.f13391a.getId(), str);
                if (this.f14276h != null) {
                    this.f14276h.insertMessage(a, true);
                }
            }
        }
    }

    public C4694fp(DataCenter dataCenter) {
        this.f13391a = (Room) dataCenter.get("data_room");
    }

    /* renamed from: a */
    private void m15496a(C8505bb bbVar) {
        if (bbVar.f23302a == 101 && bbVar.f23305d != null && bbVar.f23309h != null && bbVar.f23307f != null) {
            ((C4695a) mo9140c()).mo12616a(bbVar.f23305d, bbVar.f23309h, bbVar.f23307f);
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof C8504ba) {
            this.f13392b.lambda$put$1$DataCenter("data_pk_mvp_list_anchor", new ArrayList());
            this.f13392b.lambda$put$1$DataCenter("data_pk_mvp_list_guest", new ArrayList());
            ((C4695a) mo9140c()).mo12615a();
        } else if (iMessage instanceof C8499ay) {
            C8499ay ayVar = (C8499ay) iMessage;
            if (ayVar.f23289a != null) {
                m15499a(ayVar.f23289a);
            }
        } else {
            if (iMessage instanceof C8505bb) {
                m15496a((C8505bb) iMessage);
            }
        }
    }

    /* renamed from: a */
    private void m15497a(C9380q qVar) {
        if (qVar.f25767g != null) {
            C8499ay ayVar = new C8499ay();
            ArrayList arrayList = new ArrayList();
            C9376n nVar = null;
            C9376n nVar2 = null;
            for (C9376n nVar3 : qVar.f25767g) {
                if (nVar3.f25735a == this.f13391a.getOwnerUserId()) {
                    nVar = nVar3;
                } else {
                    nVar2 = nVar3;
                }
            }
            arrayList.add(nVar);
            arrayList.add(nVar2);
            ayVar.f23289a = arrayList;
            if (this.f14276h != null) {
                this.f14276h.insertMessage(ayVar, true);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -1692693464) {
                if (hashCode == 1505611330 && key.equals("data_pk_state")) {
                    c = 1;
                }
            } else if (key.equals("data_pk_current_room_interact_info")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    C3479d dVar = (C3479d) kVData.getData();
                    if (dVar.data != null) {
                        m15497a((C9380q) dVar.data);
                        return;
                    }
                    break;
                case 1:
                    if (kVData.getData().equals(PkState.PENAL)) {
                        m15500b();
                        break;
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    private void m15499a(List<C9376n> list) {
        if (!C6311g.m19573a(list)) {
            if (list.get(0) != null) {
                this.f13392b.lambda$put$1$DataCenter("data_pk_mvp_list_anchor", ((C9376n) list.get(0)).f25736b);
            }
            if (list.size() >= 2 && list.get(1) != null) {
                this.f13392b.lambda$put$1$DataCenter("data_pk_mvp_list_guest", ((C9376n) list.get(1)).f25736b);
            }
        }
    }

    /* renamed from: a */
    public final void mo9142a(C4695a aVar) {
        super.mo9142a(aVar);
        if (this.f14276h != null) {
            this.f14276h.addMessageListener(MessageType.LINK_MIC_ARMIES.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.LINK_MIC_BATTLE.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.LINK_MIC_BATTLE_PUNISH.getIntType(), this);
        }
        if (this.f13392b != LinkCrossRoomDataHolder.f11658a) {
            this.f13392b.observeForever("data_pk_current_room_interact_info", this).observeForever("data_pk_state", this);
        }
    }
}
