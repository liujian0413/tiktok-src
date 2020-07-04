package com.bytedance.android.livesdk.chatroom.interact.p216d;

import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKMatchContract.C4510a;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKMatchContract.View;
import com.bytedance.android.livesdk.chatroom.interact.model.C4816a;
import com.bytedance.android.livesdk.chatroom.interact.p214b.C4492a;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.p426b.C9057b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7494t;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.af */
public final class C4534af extends C4510a {

    /* renamed from: d */
    private C7321c f13138d;

    /* renamed from: e */
    private boolean f13139e;

    /* renamed from: f */
    private Room f13140f;

    /* renamed from: c */
    public final void mo12302c() {
        C4492a.m15023a().mo12265b();
    }

    /* renamed from: d */
    public final void mo12303d() {
        if (this.f13138d != null) {
            this.f13138d.dispose();
            this.f13138d = null;
        }
    }

    /* renamed from: e */
    public final boolean mo12304e() {
        if (this.f13138d == null || this.f13138d.isDisposed()) {
            return false;
        }
        return true;
    }

    public C4534af(View view) {
        super(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12387a(Long l) throws Exception {
        ((View) this.f13121b).mo12295a(l.intValue());
    }

    /* renamed from: a */
    public final void mo12299a(int i) {
        this.f13138d = ((C3245ad) C9057b.m27053a(1, TimeUnit.SECONDS).mo19305c(4).mo19317d((C7327h<? super T, ? extends R>) new C4535ag<Object,Object>(3)).mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) mo12285a())).mo10183a(new C4536ah(this), C4537ai.f13143a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x004d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12300a(long r6) {
        /*
            r5 = this;
            com.bytedance.android.livesdk.sharedpref.c<java.lang.String> r0 = com.bytedance.android.livesdk.sharedpref.C8946b.f24482l
            java.lang.Object r0 = r0.mo22117a()
            java.lang.String r0 = (java.lang.String) r0
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = com.bytedance.android.livesdk.utils.C9048ao.m27019b(r1)
            boolean r0 = r0.equals(r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0028
            com.bytedance.android.livesdk.sharedpref.c<java.lang.Integer> r0 = com.bytedance.android.livesdk.sharedpref.C8946b.f24384aI
            java.lang.Object r0 = r0.mo22117a()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 > 0) goto L_0x004a
            r0 = 0
            goto L_0x004b
        L_0x0028:
            com.bytedance.android.livesdk.sharedpref.c<java.lang.Integer> r0 = com.bytedance.android.livesdk.sharedpref.C8946b.f24481k
            java.lang.Object r0 = r0.mo22117a()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.bytedance.android.livesdk.sharedpref.c<java.lang.Integer> r3 = com.bytedance.android.livesdk.sharedpref.C8946b.f24384aI
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.mo22118a(r0)
            com.bytedance.android.livesdk.sharedpref.c<java.lang.String> r0 = com.bytedance.android.livesdk.sharedpref.C8946b.f24482l
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = com.bytedance.android.livesdk.utils.C9048ao.m27019b(r3)
            r0.mo22118a(r3)
        L_0x004a:
            r0 = 1
        L_0x004b:
            if (r0 == 0) goto L_0x0055
            com.bytedance.android.livesdk.chatroom.interact.b.a r0 = com.bytedance.android.livesdk.chatroom.interact.p214b.C4492a.m15023a()
            r0.mo12259a(r6)
            return
        L_0x0055:
            com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract$View r6 = r5.f13121b
            com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKMatchContract$View r6 = (com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKMatchContract.View) r6
            r7 = 2131828196(0x7f111de4, float:1.9289326E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.bytedance.android.livesdk.sharedpref.c<java.lang.Integer> r2 = com.bytedance.android.livesdk.sharedpref.C8946b.f24480j
            java.lang.Object r2 = r2.mo22117a()
            r0[r1] = r2
            java.lang.String r7 = com.bytedance.android.live.core.utils.C3358ac.m12517a(r7, r0)
            r6.mo12297a(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.interact.p216d.C4534af.mo12300a(long):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12385a(int i, C3479d dVar) throws Exception {
        this.f13122c.f11675m = ((C4816a) dVar.data).f13726b;
        this.f13122c.f11665c = ((C4816a) dVar.data).f13725a;
        ((View) this.f13121b).mo12296a(this.f13140f, i);
        this.f13139e = false;
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "INVITE_BATTLE_SUCCEED");
        hashMap.put("vendor", Integer.valueOf(((C4816a) dVar.data).f13726b));
        hashMap.put("channel_id", Long.valueOf(((C4816a) dVar.data).f13725a));
        C8444d.m25673b().mo9999a("ttlive_pk", (Map<String, ?>) hashMap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12386a(Room room, Throwable th) throws Exception {
        mo12286a(th);
        ((View) this.f13121b).mo12298a(th);
        this.f13122c.mo11450c();
        this.f13139e = false;
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "INVITE_BATTLE_FAILED");
        hashMap.put("target_room_id", Long.valueOf(room.getId()));
        C8444d.m25673b().mo9999a("ttlive_pk", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public final void mo12301a(Room room, long j, String str, int i, int i2) {
        Room room2 = room;
        if (!this.f13139e) {
            this.f13139e = true;
            this.f13140f = room2;
            this.f13122c.f11672j = C34943c.f91128x;
            String str2 = str;
            this.f13122c.f11673k = str2;
            this.f13122c.f11667e = room.getOwner().getId();
            ((C3245ad) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).inviteWithBattleOn(4, 6, room.getId(), room.getOwner().getId(), j, str2, C34943c.f91128x, this.f13122c.f11680r, -1, i2).mo19297a((C7494t<T, ? extends R>) mo12287b())).mo10183a(new C4538aj(this, i2), new C4539ak(this, room2));
        }
    }
}
