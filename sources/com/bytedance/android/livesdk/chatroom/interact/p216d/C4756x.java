package com.bytedance.android.livesdk.chatroom.interact.p216d;

import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.event.C4448r;
import com.bytedance.android.livesdk.chatroom.interact.C4812j;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKMatchInviteContract.C4511a;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKMatchInviteContract.View;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4856g;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.p426b.C9057b;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7494t;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.x */
public final class C4756x extends C4511a {

    /* renamed from: d */
    private C7321c f13491d;

    /* renamed from: e */
    private DataCenter f13492e;

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo12673c(Throwable th) {
        mo12286a(th);
    }

    /* renamed from: c */
    public final void mo12309c() {
        if (this.f13491d != null) {
            this.f13491d.dispose();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12670a(C3479d dVar) throws Exception {
        this.f13122c.mo11450c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12672b(Throwable th) throws Exception {
        mo12286a(th);
        this.f13122c.mo11450c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12671a(Long l) throws Exception {
        ((View) this.f13121b).mo12305a(l.intValue());
    }

    /* renamed from: a */
    public final void mo12306a(int i) {
        this.f13491d = ((C3245ad) C9057b.m27050a(0, 1, TimeUnit.SECONDS).mo19305c((long) (i + 1)).mo19317d((C7327h<? super T, ? extends R>) new C4757y<Object,Object>(i)).mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) mo12285a())).mo10183a(new C4758z(this), new C4529aa(this));
    }

    public C4756x(View view, DataCenter dataCenter) {
        super(view);
        this.f13492e = dataCenter;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12669a(int i, long j, C3479d dVar) throws Exception {
        C4856g gVar = (C4856g) dVar.data;
        if (i != 1) {
            this.f13122c.mo11450c();
        } else {
            this.f13122c.f11676n = gVar.f13886a;
            this.f13122c.f11677o = gVar.f13887b;
            this.f13122c.f11678p = gVar.f13889d;
            if (this.f13492e != null) {
                if (this.f13122c.f11680r == 2) {
                    this.f13492e.lambda$put$1$DataCenter("cmd_inroompk_state_change", new C4812j(1));
                } else {
                    this.f13492e.lambda$put$1$DataCenter("cmd_pk_state_change", new C4448r(4));
                }
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "REPLY_SUCCEED");
        hashMap.put(C38347c.f99553h, gVar);
        hashMap.put("accesskey", gVar.f13886a);
        hashMap.put("link_mic_id", Integer.valueOf(gVar.f13887b));
        hashMap.put("confluence_type", Integer.valueOf(((C4856g) dVar.data).f13889d));
        hashMap.put("channel_id", Long.valueOf(j));
        C8444d.m25673b().mo9999a("ttlive_pk", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public final void mo12307a(int i, long j, long j2, long j3) {
        long j4;
        LinkApi linkApi = (LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class);
        if (this.f13122c.f11667e != 0) {
            j4 = this.f13122c.f11667e;
        } else {
            j4 = j3;
        }
        int i2 = i;
        long j5 = j;
        ((C3245ad) linkApi.reply(j, j2, i, j4).mo19297a((C7494t<T, ? extends R>) mo12287b())).mo10183a(new C4530ab(this, i, j), new C4531ac(this));
    }

    /* renamed from: a */
    public final void mo12308a(long j, long j2, long j3, long j4) {
        ((C3245ad) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).cancel(j, j2, j4, j3).mo19297a((C7494t<T, ? extends R>) mo12287b())).mo10183a(new C4532ad(this), new C4533ae(this));
    }
}
