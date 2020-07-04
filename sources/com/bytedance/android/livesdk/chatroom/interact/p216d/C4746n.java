package com.bytedance.android.livesdk.chatroom.interact.p216d;

import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.event.C4448r;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKInviteContract.C4509a;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKInviteContract.View;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4856g;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.log.p405b.C8435g;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.p426b.C9057b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7494t;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.n */
public final class C4746n extends C4509a {

    /* renamed from: d */
    private C7321c f13478d;

    /* renamed from: e */
    private DataCenter f13479e;

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo12668c(Throwable th) {
        mo12286a(th);
    }

    /* renamed from: c */
    public final void mo12293c() {
        if (this.f13478d != null) {
            this.f13478d.dispose();
        }
    }

    /* renamed from: d */
    public final void mo12294d() {
        ((C3245ad) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).settings(2).mo19297a((C7494t<T, ? extends R>) mo12287b())).mo10183a(new C4754v(this), new C4755w(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12666b(C3479d dVar) throws Exception {
        this.f13122c.mo11450c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12667b(Throwable th) throws Exception {
        mo12286a(th);
        this.f13122c.mo11450c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12665a(Long l) throws Exception {
        ((View) this.f13121b).mo12288a(l.intValue());
    }

    /* renamed from: a */
    public final void mo12290a(int i) {
        this.f13478d = ((C3245ad) C9057b.m27050a(0, 1, TimeUnit.SECONDS).mo19305c((long) (i + 1)).mo19317d((C7327h<? super T, ? extends R>) new C4747o<Object,Object>(i)).mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) mo12285a())).mo10183a(new C4748p(this), new C4749q(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12664a(C3479d dVar) throws Exception {
        if (dVar.statusCode == 0) {
            ((View) this.f13121b).mo12289a(false);
            C8946b.f24488r.mo22118a(Integer.valueOf(2));
            C3517a.m12960a(((View) this.f13121b).getContext(), (int) R.string.ew2);
        }
    }

    public C4746n(View view, DataCenter dataCenter) {
        super(view);
        this.f13479e = dataCenter;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12663a(int i, long j, C3479d dVar) throws Exception {
        C4856g gVar = (C4856g) dVar.data;
        if (i != 1) {
            this.f13122c.mo11450c();
        } else {
            this.f13122c.f11676n = gVar.f13886a;
            this.f13122c.f11677o = gVar.f13887b;
            this.f13122c.f11678p = gVar.f13889d;
            if (this.f13479e != null) {
                this.f13479e.lambda$put$1$DataCenter("cmd_pk_state_change", new C4448r(4));
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "REPLY_SUCCEED");
        hashMap.put(C38347c.f99553h, gVar);
        hashMap.put("accesskey", gVar.f13886a);
        hashMap.put("link_mic_id", Integer.valueOf(gVar.f13887b));
        hashMap.put("confluence_type", Integer.valueOf(gVar.f13889d));
        hashMap.put("channel_id", Long.valueOf(j));
        C8444d.m25673b().mo9999a("ttlive_pk", (Map<String, ?>) hashMap);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0091  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12291a(int r12, long r13, long r15, com.bytedance.android.live.base.model.user.User r17) {
        /*
            r11 = this;
            r0 = r11
            r9 = r12
            r1 = 2
            r2 = 1
            if (r9 != r1) goto L_0x006f
            com.bytedance.android.livesdk.sharedpref.c<java.lang.Integer> r3 = com.bytedance.android.livesdk.sharedpref.C8946b.f24488r
            java.lang.Object r3 = r3.mo22117a()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 == r1) goto L_0x006f
            boolean r1 = r17.isFollowing()
            if (r1 != 0) goto L_0x006f
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = com.bytedance.android.livesdk.utils.C9048ao.m27019b(r3)
            com.bytedance.android.livesdk.sharedpref.c<java.lang.String> r3 = com.bytedance.android.livesdk.sharedpref.C8946b.f24387aL
            java.lang.Object r3 = r3.mo22117a()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x003f
            com.bytedance.android.livesdk.sharedpref.c<java.lang.Integer> r3 = com.bytedance.android.livesdk.sharedpref.C8946b.f24386aK
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.mo22118a(r2)
            com.bytedance.android.livesdk.sharedpref.c<java.lang.String> r2 = com.bytedance.android.livesdk.sharedpref.C8946b.f24387aL
            r2.mo22118a(r1)
            goto L_0x006f
        L_0x003f:
            com.bytedance.android.livesdk.sharedpref.c<java.lang.Integer> r1 = com.bytedance.android.livesdk.sharedpref.C8946b.f24386aK
            java.lang.Object r3 = r1.mo22117a()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = r3 + r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.mo22118a(r3)
            com.bytedance.android.livesdk.sharedpref.c<java.lang.Integer> r1 = com.bytedance.android.livesdk.sharedpref.C8946b.f24386aK
            java.lang.Object r1 = r1.mo22117a()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3 = 3
            if (r1 <= r3) goto L_0x006f
            com.bytedance.android.livesdk.sharedpref.c<java.lang.Integer> r1 = com.bytedance.android.livesdk.sharedpref.C8946b.f24386aK
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.mo22118a(r3)
            r10 = 1
            goto L_0x0071
        L_0x006f:
            r2 = 0
            r10 = 0
        L_0x0071:
            com.bytedance.android.livesdk.w.f r1 = com.bytedance.android.livesdk.p428w.C9178j.m27302j()
            com.bytedance.android.live.network.e r1 = r1.mo22373b()
            java.lang.Class<com.bytedance.android.livesdk.chatroom.api.LinkApi> r2 = com.bytedance.android.livesdk.chatroom.api.LinkApi.class
            java.lang.Object r1 = r1.mo10440a(r2)
            com.bytedance.android.livesdk.chatroom.api.LinkApi r1 = (com.bytedance.android.livesdk.chatroom.api.LinkApi) r1
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r2 = r0.f13122c
            long r2 = r2.f11667e
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0091
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r2 = r0.f13122c
            long r2 = r2.f11667e
        L_0x008f:
            r7 = r2
            goto L_0x0096
        L_0x0091:
            long r2 = r17.getId()
            goto L_0x008f
        L_0x0096:
            r2 = r13
            r4 = r15
            r6 = r12
            io.reactivex.s r1 = r1.reply(r2, r4, r6, r7)
            com.bytedance.android.live.core.rxutils.autodispose.m r2 = r11.mo12287b()
            java.lang.Object r1 = r1.mo19297a(r2)
            com.bytedance.android.live.core.rxutils.autodispose.ad r1 = (com.bytedance.android.live.core.rxutils.autodispose.C3245ad) r1
            com.bytedance.android.livesdk.chatroom.interact.d.r r2 = new com.bytedance.android.livesdk.chatroom.interact.d.r
            r3 = r13
            r2.<init>(r11, r12, r13)
            com.bytedance.android.livesdk.chatroom.interact.d.s r3 = new com.bytedance.android.livesdk.chatroom.interact.d.s
            r3.<init>(r11)
            r1.mo10183a(r2, r3)
            com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract$View r1 = r0.f13121b
            com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKInviteContract$View r1 = (com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKInviteContract.View) r1
            r1.mo12289a(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.interact.p216d.C4746n.mo12291a(int, long, long, com.bytedance.android.live.base.model.user.User):void");
    }

    /* renamed from: a */
    public final void mo12292a(long j, long j2, long j3, long j4) {
        C8435g gVar = new C8435g();
        if (this.f13122c.f11672j > 0) {
            gVar.mo21596c(j3).mo21591a(LinkCrossRoomDataHolder.m13782a().f11669g);
        } else {
            long j5 = j3;
        }
        C8443c.m25663a().mo21607a("match_cancel_click", gVar, LinkCrossRoomDataHolder.m13782a().mo11449b(), Room.class);
        ((C3245ad) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).cancel(j, j2, j4, j3).mo19297a((C7494t<T, ? extends R>) mo12287b())).mo10183a(new C4752t(this), new C4753u(this));
    }
}
