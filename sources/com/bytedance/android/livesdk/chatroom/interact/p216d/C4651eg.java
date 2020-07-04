package com.bytedance.android.livesdk.chatroom.interact.p216d;

import android.arch.lifecycle.C0053p;
import com.bytedance.android.live.core.rxutils.autodispose.C3247af;
import com.bytedance.android.live.network.response.C3478c;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C3912d;
import com.bytedance.android.livesdk.app.dataholder.C3913e;
import com.bytedance.android.livesdk.chatroom.api.C4258b;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.event.C4447q;
import com.bytedance.android.livesdk.chatroom.event.C4450t;
import com.bytedance.android.livesdk.chatroom.interact.C4480af;
import com.bytedance.android.livesdk.chatroom.interact.C4811i;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4854e;
import com.bytedance.android.livesdk.chatroom.presenter.C5017ci;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p280ss.avframework.livestreamv2.interact.model.Config.Vendor;
import java.util.List;
import p346io.reactivex.C47555ab;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.eg */
public final class C4651eg extends C5017ci<C4653b> {

    /* renamed from: a */
    public boolean f13323a;

    /* renamed from: b */
    public Room f13324b;

    /* renamed from: c */
    public C4652a f13325c;

    /* renamed from: d */
    private boolean f13326d;

    /* renamed from: e */
    private boolean f13327e;

    /* renamed from: f */
    private boolean f13328f;

    /* renamed from: i */
    private boolean f13329i;

    /* renamed from: j */
    private boolean f13330j;

    /* renamed from: k */
    private boolean f13331k;

    /* renamed from: l */
    private boolean f13332l;

    /* renamed from: m */
    private boolean f13333m;

    /* renamed from: n */
    private boolean f13334n;

    /* renamed from: o */
    private boolean f13335o;

    /* renamed from: p */
    private long f13336p;

    /* renamed from: q */
    private long f13337q;

    /* renamed from: r */
    private DataCenter f13338r;

    /* renamed from: s */
    private C0053p<KVData> f13339s = new C4654eh(this);

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.eg$a */
    public interface C4652a {
        /* renamed from: a */
        void mo12574a(long j);

        /* renamed from: a */
        void mo12575a(long j, Throwable th);

        /* renamed from: a */
        void mo12576a(Throwable th);

        /* renamed from: b */
        void mo12577b();

        /* renamed from: b */
        void mo12578b(long j);

        /* renamed from: c */
        void mo12579c();

        /* renamed from: d */
        void mo12580d();

        /* renamed from: e */
        void mo12581e();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.eg$b */
    public interface C4653b extends C5595at {
        /* renamed from: a */
        void mo12162a();

        /* renamed from: a */
        void mo12168a(List<C4854e> list);

        /* renamed from: b */
        void mo12171b();

        /* renamed from: c */
        void mo12175c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo12566g(Throwable th) {
        mo13031m(th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12551a(Throwable th) throws Exception {
        mo13031m(th);
        this.f13329i = false;
        if (this.f13335o) {
            if (this.f13325c != null) {
                this.f13325c.mo12580d();
            }
            C3913e.m13800a().mo11452a(Integer.valueOf(0));
            this.f13338r.lambda$put$1$DataCenter("cmd_interact_state_change", new C4450t(8));
            C9097a.m27146a().mo22267a((Object) new C4447q(1));
        } else if (this.f13325c != null) {
            this.f13325c.mo12581e();
        }
    }

    /* renamed from: l */
    public static int m15392l() {
        return C3912d.m13795a().f11713h;
    }

    /* renamed from: j */
    public final void mo12569j() {
        this.f13335o = true;
        mo12561e();
    }

    /* renamed from: k */
    public static long m15391k() {
        return TTLiveSDKContext.getHostService().mo22367h().mo22179b();
    }

    /* renamed from: h */
    public final void mo12567h() {
        this.f13334n = false;
        this.f13323a = false;
        mo12561e();
    }

    /* renamed from: m */
    public final boolean mo12571m() {
        if (this.f13324b.getStreamUrlExtraSafely().f25788l > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final String mo12572o() {
        return this.f13324b.getStreamUrl().mo23050a();
    }

    /* renamed from: p */
    public final String mo12573p() {
        return String.valueOf(this.f13324b.getId());
    }

    /* renamed from: g */
    public final void mo12565g() {
        this.f13333m = false;
        if (this.f13325c != null) {
            this.f13325c.mo12579c();
        }
        this.f13338r.lambda$put$1$DataCenter("cmd_interact_state_change", new C4450t(8));
    }

    /* renamed from: i */
    public final void mo12568i() {
        this.f13334n = false;
        if (this.f13335o) {
            this.f13323a = false;
            mo12561e();
            return;
        }
        if (this.f13325c != null) {
            this.f13325c.mo12581e();
        }
    }

    /* renamed from: n */
    public static Vendor m15393n() {
        int i;
        if (((Integer) LiveConfigSettingKeys.INTERACT_VENDOR.mo10240a()).intValue() == 0) {
            i = C3912d.m13795a().f11714i;
        } else {
            i = ((Integer) LiveConfigSettingKeys.INTERACT_VENDOR.mo10240a()).intValue();
        }
        if (i == 4) {
            return Vendor.BYTE;
        }
        switch (i) {
            case 1:
                return Vendor.AGORA;
            case 2:
                return Vendor.ZEGO;
            default:
                return Vendor.AGORA;
        }
    }

    /* renamed from: b */
    public final void mo12552b() {
        if (!this.f13326d) {
            this.f13326d = true;
            ((C3247af) C4258b.m14404a((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class), this.f13324b.getId(), 4).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(new C4662ep(this), new C4663eq(this));
        }
    }

    /* renamed from: k_ */
    public final void mo12570k_() {
        C4480af.m14977a(0, 0, null, "anchor", "normal", m15393n().toString());
        this.f13333m = false;
        this.f13323a = true;
        if (this.f13325c != null) {
            this.f13325c.mo12577b();
        }
    }

    /* renamed from: a */
    public final void mo8963a() {
        if (2 == ((Integer) C3913e.m13800a().f11699b).intValue() || 1 == ((Integer) C3913e.m13800a().f11699b).intValue()) {
            ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).leave(this.f13324b.getId()).mo19129a(C4655ei.f13341a, (C7326g<? super Throwable>) new C4661eo<Object>(this));
        }
        this.f13338r.removeObserver("cmd_interact_state_change", this.f13339s);
        super.mo8963a();
    }

    /* renamed from: d */
    public final void mo12558d() {
        if (mo9140c() != null && !this.f13330j && !this.f13333m) {
            if (!this.f13332l) {
                this.f13330j = true;
                ((C3247af) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).joinChannelV1(this.f13324b.getId()).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(new C4668ev(this), new C4656ej(this));
            } else if (!this.f13323a) {
                this.f13338r.lambda$put$1$DataCenter("cmd_interact_state_change", new C4450t(7));
                this.f13333m = true;
                ((C4653b) mo9140c()).mo12171b();
            } else {
                if (this.f13325c != null) {
                    this.f13325c.mo12577b();
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo12561e() {
        if (mo9140c() != null && !this.f13331k && !this.f13334n && !this.f13329i) {
            if (this.f13323a) {
                this.f13334n = true;
                ((C4653b) mo9140c()).mo12175c();
            } else if (this.f13332l) {
                this.f13331k = true;
                ((C3247af) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).leave(this.f13324b.getId()).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(new C4657ek(this), new C4658el(this));
            } else {
                this.f13329i = true;
                ((C3247af) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).finishV1(this.f13324b.getId()).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(new C4659em(this), new C4660en(this));
            }
        }
    }

    /* renamed from: a */
    private void m15390a(C4450t tVar) {
        if (tVar.f12909a == 0 && mo9140c() != null) {
            mo12552b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12554b(C3479d dVar) throws Exception {
        this.f13331k = false;
        this.f13332l = false;
        mo12561e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo12556c(C3479d dVar) throws Exception {
        this.f13330j = false;
        this.f13332l = true;
        mo12558d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo12564f(Throwable th) throws Exception {
        mo13031m(th);
        this.f13326d = false;
        ((C4653b) mo9140c()).mo12162a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12547a(C3478c cVar) throws Exception {
        this.f13326d = false;
        ((C4653b) mo9140c()).mo12168a(cVar.f10296b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12555b(Throwable th) throws Exception {
        mo13031m(th);
        this.f13331k = false;
        if (this.f13325c != null) {
            this.f13325c.mo12581e();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo12557c(Throwable th) throws Exception {
        mo13031m(th);
        this.f13330j = false;
        if (this.f13325c != null) {
            this.f13325c.mo12579c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo12559d(C3479d dVar) throws Exception {
        this.f13328f = false;
        if (this.f13325c != null) {
            this.f13325c.mo12578b(this.f13337q);
            this.f13337q = 0;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo12562e(C3479d dVar) throws Exception {
        this.f13327e = false;
        if (this.f13325c != null) {
            this.f13325c.mo12574a(this.f13336p);
            this.f13336p = 0;
            C4811i.m15838a(1, "");
        }
    }

    /* renamed from: a */
    public final void mo12546a(long j) {
        if (!this.f13327e) {
            this.f13336p = j;
            ((C3247af) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).permit(this.f13324b.getId(), j).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(new C4664er(this), new C4665es(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo12560d(Throwable th) throws Exception {
        mo13031m(th);
        this.f13328f = false;
        if (this.f13325c != null) {
            this.f13325c.mo12576a(th);
            this.f13337q = 0;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo12563e(Throwable th) throws Exception {
        mo13031m(th);
        this.f13327e = false;
        if (this.f13325c != null) {
            this.f13325c.mo12575a(this.f13336p, th);
            this.f13336p = 0;
        }
    }

    /* renamed from: b */
    public final void mo12553b(long j) {
        if (!this.f13328f) {
            this.f13337q = j;
            ((C3247af) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).kickOut(this.f13324b.getId(), j).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(new C4666et(this), new C4667eu(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12548a(C3479d dVar) throws Exception {
        this.f13329i = false;
        if (this.f13325c != null) {
            this.f13325c.mo12580d();
        }
        C3913e.m13800a().mo11452a(Integer.valueOf(0));
        this.f13338r.lambda$put$1$DataCenter("cmd_interact_state_change", new C4450t(8));
        C9097a.m27146a().mo22267a((Object) new C4447q(1));
    }

    /* renamed from: a */
    public final void mo9142a(C4653b bVar) {
        super.mo9142a(bVar);
        this.f13338r.observeForever("cmd_interact_state_change", this.f13339s);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12550a(KVData kVData) {
        if (kVData != null && kVData.getData() != null) {
            m15390a((C4450t) kVData.getData());
        }
    }

    public C4651eg(Room room, DataCenter dataCenter) {
        this.f13324b = room;
        this.f13338r = dataCenter;
    }
}
