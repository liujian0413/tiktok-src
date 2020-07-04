package com.bytedance.android.livesdk.chatroom.interact.p216d;

import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C3912d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.interact.p217e.C4764a;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4854e;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.p533a.C10290a;
import com.bytedance.ies.p533a.C10291b;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.a */
public final class C4527a extends C10291b<C4528a> {

    /* renamed from: a */
    private final C47562b f13124a = new C47562b();

    /* renamed from: b */
    private boolean f13125b;

    /* renamed from: c */
    private boolean f13126c;

    /* renamed from: d */
    private boolean f13127d;

    /* renamed from: e */
    private Room f13128e;

    /* renamed from: f */
    private boolean f13129f;

    /* renamed from: g */
    private C4764a f13130g;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.a$a */
    public interface C4528a extends C10290a {
        /* renamed from: a */
        void mo12379a();

        /* renamed from: a */
        void mo12380a(Throwable th);

        /* renamed from: b */
        void mo12381b();

        /* renamed from: b */
        void mo12382b(Throwable th);

        /* renamed from: c */
        void mo12383c();

        /* renamed from: c */
        void mo12384c(Throwable th);
    }

    /* renamed from: a */
    public final void mo8963a() {
        this.f13124a.mo119660a();
        super.mo8963a();
    }

    /* renamed from: b */
    public final int mo12372b() {
        C4854e b = this.f13130g.mo12691b(TTLiveSDKContext.getHostService().mo22367h().mo22179b(), C3912d.m13795a().f11713h);
        if (b != null) {
            return b.f13879l;
        }
        return -1;
    }

    /* renamed from: d */
    private static void m15140d(Throwable th) {
        C3166a.m11955a(6, "AudioGuestManagerPresenter", th.getStackTrace());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12369a(C3479d dVar) throws Exception {
        this.f13125b = false;
        if (mo9140c() != null) {
            ((C4528a) mo9140c()).mo12379a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo12377c(C3479d dVar) throws Exception {
        this.f13126c = false;
        if (mo9140c() != null) {
            ((C4528a) mo9140c()).mo12381b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12370a(Throwable th) throws Exception {
        m15140d(th);
        this.f13125b = false;
        if (mo9140c() != null) {
            ((C4528a) mo9140c()).mo12380a(th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12374b(C3479d dVar) throws Exception {
        this.f13127d = false;
        if (mo9140c() != null) {
            ((C4528a) mo9140c()).mo12383c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo12378c(Throwable th) throws Exception {
        m15140d(th);
        this.f13126c = false;
        if (mo9140c() != null) {
            ((C4528a) mo9140c()).mo12382b(th);
        }
    }

    /* renamed from: a */
    public final void mo12368a(long j) {
        if (!this.f13126c) {
            this.f13126c = true;
            this.f13124a.mo119661a(((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).silence(this.f13128e.getId(), j).mo19135b(C7333a.m23044b()).mo19127a(C47549a.m148327a()).mo19129a((C7326g<? super T>) new C4555b<Object>(this), (C7326g<? super Throwable>) new C4583c<Object>(this)));
        }
    }

    /* renamed from: b */
    public final void mo12373b(long j) {
        if (!this.f13127d) {
            this.f13127d = true;
            this.f13124a.mo119661a(((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).unSilence(this.f13128e.getId(), j).mo19135b(C7333a.m23044b()).mo19127a(C47549a.m148327a()).mo19129a((C7326g<? super T>) new C4616d<Object>(this), (C7326g<? super Throwable>) new C4643e<Object>(this)));
        }
    }

    /* renamed from: c */
    public final void mo12376c(long j) {
        if (!this.f13125b) {
            this.f13125b = true;
            this.f13124a.mo119661a(((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).kickOut(this.f13128e.getId(), j).mo19135b(C7333a.m23044b()).mo19127a(C47549a.m148327a()).mo19129a((C7326g<? super T>) new C4678f<Object>(this), (C7326g<? super Throwable>) new C4707g<Object>(this)));
        }
    }

    /* renamed from: a */
    public final boolean mo12371a(boolean z) {
        C4854e b = this.f13130g.mo12691b(TTLiveSDKContext.getHostService().mo22367h().mo22179b(), C3912d.m13795a().f11713h);
        if (this.f13129f || !z) {
            return true;
        }
        if (b == null || b.f13879l == 2) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12375b(Throwable th) throws Exception {
        m15140d(th);
        this.f13127d = false;
        if (mo9140c() != null) {
            ((C4528a) mo9140c()).mo12384c(th);
        }
    }

    public C4527a(Room room, boolean z, C4764a aVar) {
        this.f13128e = room;
        this.f13129f = z;
        this.f13130g = aVar;
    }
}
