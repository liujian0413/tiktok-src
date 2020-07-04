package com.bytedance.android.livesdk.chatroom.interact.p216d;

import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKUserListContract.C4515a;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKUserListContract.View;
import com.bytedance.android.livesdk.chatroom.interact.model.C4816a;
import com.bytedance.android.livesdk.chatroom.interact.model.C4817b;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.Map;
import p346io.reactivex.C7494t;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.au */
public final class C4549au extends C4515a {

    /* renamed from: d */
    private Room f13157d;

    /* renamed from: e */
    private boolean f13158e;

    public C4549au(View view) {
        super(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12391a(C3479d dVar) throws Exception {
        ((View) this.f13121b).mo12324a((C4817b) dVar.data);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12396b(Throwable th) throws Exception {
        mo12286a(th);
        ((View) this.f13121b).mo12327a(th);
    }

    /* renamed from: a */
    public final void mo12328a(int i) {
        ((C3245ad) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).rivalsList(i).mo19297a((C7494t<T, ? extends R>) mo12287b())).mo10183a(new C4550av(this), new C4551aw(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12392a(RivalExtraInfo rivalExtraInfo, int i, C3479d dVar) throws Exception {
        this.f13122c.f11675m = ((C4816a) dVar.data).f13726b;
        this.f13122c.f11665c = ((C4816a) dVar.data).f13725a;
        ((View) this.f13121b).mo12325a(this.f13157d, rivalExtraInfo, i);
        this.f13158e = false;
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "INVITE_SUCCEED");
        hashMap.put("vendor", Integer.valueOf(((C4816a) dVar.data).f13726b));
        hashMap.put("channel_id", Long.valueOf(((C4816a) dVar.data).f13725a));
        C8444d.m25673b().mo9999a("ttlive_pk", (Map<String, ?>) hashMap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12394b(RivalExtraInfo rivalExtraInfo, int i, C3479d dVar) throws Exception {
        if (!(dVar == null || dVar.data == null)) {
            this.f13122c.f11675m = ((C4816a) dVar.data).f13726b;
            this.f13122c.f11665c = ((C4816a) dVar.data).f13725a;
        }
        ((View) this.f13121b).mo12325a(this.f13157d, rivalExtraInfo, i);
        this.f13158e = false;
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "INVITE_BATTLE_SUCCEED");
        hashMap.put("vendor", Integer.valueOf(((C4816a) dVar.data).f13726b));
        hashMap.put("channel_id", Long.valueOf(((C4816a) dVar.data).f13725a));
        C8444d.m25673b().mo9999a("ttlive_pk", (Map<String, ?>) hashMap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12395b(RivalExtraInfo rivalExtraInfo, int i, Room room, Throwable th) throws Exception {
        mo12286a(th);
        ((View) this.f13121b).mo12326a(this.f13157d, th, rivalExtraInfo, i);
        this.f13122c.mo11450c();
        this.f13158e = false;
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "INVITE_BATTLE_FAILED");
        hashMap.put("target_room_id", Long.valueOf(room.getId()));
        C8444d.m25673b().mo10001b("ttlive_pk", (Map<String, ?>) hashMap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12393a(RivalExtraInfo rivalExtraInfo, int i, Room room, Throwable th) throws Exception {
        mo12286a(th);
        ((View) this.f13121b).mo12326a(this.f13157d, th, rivalExtraInfo, i);
        this.f13158e = false;
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "INVITE_FAILED");
        hashMap.put("target_room_id", Long.valueOf(room.getId()));
        C8444d.m25673b().mo10001b("ttlive_pk", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public final void mo12329a(Room room, long j, RivalExtraInfo rivalExtraInfo, int i, int i2) {
        Room room2 = room;
        RivalExtraInfo rivalExtraInfo2 = rivalExtraInfo;
        int i3 = i2;
        if (!this.f13158e) {
            this.f13158e = true;
            this.f13157d = room2;
            this.f13122c.f11667e = room.getOwner().getId();
            ((C3245ad) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).invite(6, room.getId(), room.getOwner().getId(), j, i, 0).mo19297a((C7494t<T, ? extends R>) mo12287b())).mo10183a(new C4554az(this, rivalExtraInfo2, i3), new C4556ba(this, rivalExtraInfo2, i3, room2));
        }
    }

    /* renamed from: a */
    public final void mo12330a(Room room, long j, String str, int i, int i2, RivalExtraInfo rivalExtraInfo, int i3) {
        Room room2 = room;
        RivalExtraInfo rivalExtraInfo2 = rivalExtraInfo;
        int i4 = i3;
        if (!this.f13158e) {
            this.f13158e = true;
            this.f13157d = room2;
            int i5 = i;
            this.f13122c.f11672j = i5;
            String str2 = str;
            this.f13122c.f11673k = str2;
            this.f13122c.f11667e = room.getOwner().getId();
            this.f13122c.f11669g = (long) i2;
            ((C3245ad) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).inviteWithBattleOn(4, 6, room.getId(), room.getOwner().getId(), j, str2, i5, 0, i2, 0).mo19297a((C7494t<T, ? extends R>) mo12287b())).mo10183a(new C4552ax(this, rivalExtraInfo2, i4), new C4553ay(this, rivalExtraInfo2, i4, room2));
        }
    }
}
