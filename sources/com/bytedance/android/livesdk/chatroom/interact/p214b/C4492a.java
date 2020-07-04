package com.bytedance.android.livesdk.chatroom.interact.p214b;

import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.api.LinkPKApi;
import com.bytedance.android.livesdk.chatroom.interact.data.LinkAutoMatchModel;
import com.bytedance.android.livesdk.chatroom.interact.p214b.C4499h.C4500a;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.p426b.C9057b;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.b.a */
public final class C4492a implements C4499h {

    /* renamed from: a */
    private static C4492a f13091a;

    /* renamed from: b */
    private final List<C4500a> f13092b = new LinkedList();

    /* renamed from: c */
    private final int f13093c = ((((Integer) LiveConfigSettingKeys.PK_AUTO_MATCH_TIME.mo10240a()).intValue() / 3) + 1);

    /* renamed from: d */
    private C7321c f13094d;

    /* renamed from: e */
    private boolean f13095e;

    /* renamed from: c */
    public final boolean mo12267c() {
        return this.f13095e;
    }

    private C4492a() {
    }

    /* renamed from: a */
    public static synchronized C4492a m15023a() {
        C4492a aVar;
        synchronized (C4492a.class) {
            if (f13091a == null) {
                f13091a = new C4492a();
            }
            aVar = f13091a;
        }
        return aVar;
    }

    /* renamed from: b */
    public final void mo12265b() {
        if (this.f13095e) {
            this.f13095e = false;
            if (this.f13094d != null) {
                this.f13094d.dispose();
                this.f13094d = null;
            }
            ((LinkPKApi) C9178j.m27302j().mo22373b().mo10440a(LinkPKApi.class)).cancleMatch().mo19304b(C7333a.m23044b()).mo19280a(C4495d.f13099a, C4496e.f13100a);
            for (C4500a c : this.f13092b) {
                c.mo12273c();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Long mo12258a(Long l) throws Exception {
        return Long.valueOf(((long) this.f13093c) - l.longValue());
    }

    /* renamed from: b */
    public final void mo12266b(C4500a aVar) {
        if (aVar != null && this.f13092b.contains(aVar)) {
            this.f13092b.remove(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo12264a(Throwable th) {
        LinkCrossRoomDataHolder.m13782a().f11681s = 0;
        this.f13095e = false;
        if (this.f13094d != null) {
            this.f13094d.dispose();
            this.f13094d = null;
        }
        if (th instanceof ApiServerException) {
            for (C4500a aVar : this.f13092b) {
                aVar.mo12269a((ApiServerException) th);
                aVar.mo12271b();
            }
        }
    }

    /* renamed from: a */
    public final void mo12262a(C4500a aVar) {
        if (aVar != null) {
            mo12263a(aVar, this.f13092b.size());
        }
    }

    /* renamed from: a */
    public final void mo12259a(long j) {
        this.f13095e = true;
        for (C4500a a : this.f13092b) {
            a.mo12268a();
        }
        if (this.f13094d != null) {
            this.f13094d.dispose();
            this.f13094d = null;
        }
        this.f13094d = C9057b.m27050a(0, 3, TimeUnit.SECONDS).mo19305c((long) (this.f13093c + 1)).mo19317d((C7327h<? super T, ? extends R>) new C4493b<Object,Object>(this)).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C4494c<Object>(this, j));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12261a(long j, Long l) throws Exception {
        m15024a(j, l.longValue());
    }

    /* renamed from: a */
    private void m15024a(long j, long j2) {
        int i;
        LinkPKApi linkPKApi = (LinkPKApi) C9178j.m27302j().mo22373b().mo10440a(LinkPKApi.class);
        int i2 = 0;
        if (j2 == ((long) this.f13093c)) {
            i = 1;
        } else {
            i = 0;
        }
        int i3 = LinkCrossRoomDataHolder.m13782a().f11680r;
        if (LinkCrossRoomDataHolder.m13782a().f11680r == 2 && LinkCrossRoomDataHolder.m13782a().f11681s == 1) {
            i2 = 1;
        }
        linkPKApi.autoMatch(j, i, i3, i2).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C4497f<Object>(this, j2), (C7326g<? super Throwable>) new C4498g<Object>(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12260a(long j, C3479d dVar) throws Exception {
        if (dVar.statusCode == 0) {
            LinkAutoMatchModel linkAutoMatchModel = (LinkAutoMatchModel) dVar.data;
            if (linkAutoMatchModel.getRivalRoom() != null) {
                this.f13095e = false;
                if (this.f13094d != null) {
                    this.f13094d.dispose();
                    this.f13094d = null;
                }
                for (C4500a b : this.f13092b) {
                    b.mo12272b(linkAutoMatchModel);
                }
            } else if (j == 0) {
                this.f13095e = false;
                for (C4500a b2 : this.f13092b) {
                    b2.mo12271b();
                }
            } else {
                for (C4500a a : this.f13092b) {
                    a.mo12270a(linkAutoMatchModel);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo12263a(C4500a aVar, int i) {
        if (aVar != null) {
            if (this.f13092b.size() < i) {
                i = this.f13092b.size();
            }
            this.f13092b.add(i, aVar);
        }
    }
}
