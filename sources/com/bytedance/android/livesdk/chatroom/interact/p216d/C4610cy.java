package com.bytedance.android.livesdk.chatroom.interact.p216d;

import android.arch.lifecycle.C0053p;
import android.content.Context;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.rxutils.autodispose.C3247af;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3477b;
import com.bytedance.android.live.network.response.C3478c;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C3912d;
import com.bytedance.android.livesdk.app.dataholder.C3913e;
import com.bytedance.android.livesdk.chatroom.api.C4258b;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.event.C4447q;
import com.bytedance.android.livesdk.chatroom.event.C4450t;
import com.bytedance.android.livesdk.chatroom.model.C4848a;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4849a;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4853d;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4854e;
import com.bytedance.android.livesdk.chatroom.presenter.C5017ci;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.message.model.C8508bd;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.C9036ae;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostPlugin.C9430a;
import com.bytedance.android.livesdkapi.plugin.PluginType;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p280ss.avframework.livestreamv2.interact.model.Config.Vendor;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import p346io.reactivex.C47555ab;
import p346io.reactivex.C7494t;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.cy */
public final class C4610cy extends C5017ci<C4614b> implements OnMessageListener {

    /* renamed from: a */
    public boolean f13265a;

    /* renamed from: b */
    public Room f13266b;

    /* renamed from: c */
    public C4613a f13267c;

    /* renamed from: d */
    private boolean f13268d;

    /* renamed from: e */
    private boolean f13269e;

    /* renamed from: f */
    private boolean f13270f;

    /* renamed from: i */
    private boolean f13271i;

    /* renamed from: j */
    private boolean f13272j;

    /* renamed from: k */
    private boolean f13273k;

    /* renamed from: l */
    private boolean f13274l;

    /* renamed from: m */
    private boolean f13275m;

    /* renamed from: n */
    private boolean f13276n;

    /* renamed from: o */
    private boolean f13277o;

    /* renamed from: p */
    private boolean f13278p;

    /* renamed from: q */
    private boolean f13279q;

    /* renamed from: r */
    private boolean f13280r;

    /* renamed from: s */
    private boolean f13281s;

    /* renamed from: t */
    private long f13282t;

    /* renamed from: u */
    private long f13283u;

    /* renamed from: v */
    private DataCenter f13284v;

    /* renamed from: w */
    private C0053p<KVData> f13285w = new C4615cz(this);

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.cy$a */
    public interface C4613a {
        /* renamed from: a */
        void mo12518a(long j, Throwable th);

        /* renamed from: a */
        void mo12519a(Throwable th);

        /* renamed from: b */
        void mo12520b();

        /* renamed from: c */
        void mo12521c();

        /* renamed from: c */
        void mo12522c(long j);

        /* renamed from: d */
        void mo12523d();

        /* renamed from: d */
        void mo12524d(long j);

        /* renamed from: e */
        void mo12525e();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.cy$b */
    public interface C4614b extends C5595at {
        /* renamed from: a */
        void mo12526a();

        /* renamed from: a */
        void mo12527a(List<C4854e> list);

        /* renamed from: a */
        void mo12528a(boolean z);

        /* renamed from: b */
        void mo12529b();

        /* renamed from: b */
        void mo12530b(Throwable th);

        /* renamed from: b */
        void mo12531b(boolean z);

        /* renamed from: c */
        void mo12532c();

        /* renamed from: c */
        void mo12533c(Throwable th);

        /* renamed from: d */
        void mo12534d();

        /* renamed from: d */
        void mo12535d(Throwable th);

        /* renamed from: e */
        void mo12536e(Throwable th);

        /* renamed from: f */
        void mo12537f();

        /* renamed from: f */
        void mo12538f(Throwable th);

        /* renamed from: g */
        void mo12539g();

        Context getContext();

        /* renamed from: h */
        void mo12541h();

        /* renamed from: i */
        void mo12542i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final /* synthetic */ void mo12508l(Throwable th) {
        mo13031m(th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12481a(Throwable th) throws Exception {
        this.f13270f = false;
        if (mo9140c() != null && (th instanceof Exception)) {
            ((C4614b) mo9140c()).mo12533c(th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12480a(KVData kVData) {
        if (kVData != null && kVData.getData() != null) {
            m15300a((C4450t) kVData.getData());
        }
    }

    /* renamed from: e */
    public static int m15303e() {
        return C3912d.m13795a().f11713h;
    }

    /* renamed from: q */
    public final void mo12513q() {
        this.f13274l = true;
        mo12507l();
    }

    /* renamed from: d */
    public static long m15302d() {
        return TTLiveSDKContext.getHostService().mo22367h().mo22179b();
    }

    /* renamed from: b */
    public final String mo12482b() {
        return String.valueOf(this.f13266b.getId());
    }

    /* renamed from: g */
    public final String mo12494g() {
        return this.f13266b.getStreamUrl().mo23050a();
    }

    /* renamed from: j */
    public final void mo12503j() {
        this.f13276n = false;
        this.f13265a = false;
        if (this.f13281s) {
            mo12515s();
        } else {
            m15307y();
        }
    }

    /* renamed from: l */
    public final void mo12507l() {
        if (mo9140c() != null && !this.f13276n) {
            this.f13276n = true;
            ((C4614b) mo9140c()).mo12529b();
        }
    }

    /* renamed from: m */
    public final void mo12509m() {
        if (mo9140c() != null) {
            PluginType.LiveResource.checkInstall(((C4614b) mo9140c()).getContext(), "interact", new C9430a() {
                /* renamed from: a */
                public final void mo8840a(String str) {
                    C4610cy.this.mo12510n();
                }
            });
        }
    }

    /* renamed from: j_ */
    public static Vendor m15304j_() {
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

    /* renamed from: w */
    private void m15305w() {
        this.f13284v.lambda$put$1$DataCenter("cmd_interact_state_change", new C4450t(4));
        C3913e.m13800a().mo11452a(Integer.valueOf(0));
        if (mo9140c() != null) {
            ((C4614b) mo9140c()).mo12542i();
        }
    }

    /* renamed from: x */
    private void m15306x() {
        if (!this.f13272j) {
            this.f13272j = true;
            ((C3247af) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).joinChannelV1(this.f13266b.getId()).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(new C4617da(this), new C4628dl(this));
            m15299A();
        }
    }

    /* renamed from: y */
    private void m15307y() {
        if (!this.f13273k) {
            this.f13273k = true;
            ((C3247af) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).leave(this.f13266b.getId()).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(new C4638dv(this), new C4639dw(this));
        }
    }

    /* renamed from: z */
    private void m15308z() {
        if (!this.f13271i) {
            this.f13271i = true;
            ((C3247af) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).leave(this.f13266b.getId()).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(new C4619dc(this), new C4620dd(this));
        }
    }

    /* renamed from: h */
    public final void mo12497h() {
        this.f13265a = true;
        if (this.f13281s) {
            this.f13275m = false;
            if (this.f13267c != null) {
                this.f13267c.mo12520b();
            }
        } else {
            this.f13284v.lambda$put$1$DataCenter("cmd_interact_state_change", new C4450t(3));
            C3913e.m13800a().mo11452a(Integer.valueOf(2));
        }
    }

    /* renamed from: i */
    public final void mo12500i() {
        ((C3247af) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).leave(this.f13266b.getId()).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(C4636dt.f13309a, new C4637du(this));
        C3913e.m13800a().mo11452a(Integer.valueOf(0));
    }

    /* renamed from: k */
    public final void mo12505k() {
        if (this.f13281s) {
            this.f13276n = false;
            if (this.f13274l) {
                this.f13265a = false;
                mo12515s();
            } else if (this.f13267c != null) {
                this.f13267c.mo12525e();
            }
        } else {
            this.f13276n = false;
            this.f13265a = false;
            m15307y();
        }
    }

    /* renamed from: o */
    public final void mo12511o() {
        if (!this.f13269e) {
            this.f13269e = true;
            ((C3247af) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).checkPermissionV1(this.f13266b.getId(), 8).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(new C4640dx(this), new C4641dy(this));
        }
    }

    /* renamed from: p */
    public final void mo12512p() {
        if (!this.f13268d) {
            this.f13268d = true;
            ((C3247af) C4258b.m14404a((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class), this.f13266b.getId(), 4).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(new C4642dz(this), new C4618db(this));
        }
    }

    /* renamed from: A */
    private void m15299A() {
        String str;
        HashMap hashMap = new HashMap();
        if (this.f13266b != null) {
            String str2 = "room_type";
            if (this.f13266b.getStreamType() == LiveMode.AUDIO) {
                str = "radio";
            } else {
                str = "video";
            }
            hashMap.put(str2, str);
        }
        hashMap.put("audience_connection_type", "video");
        C8443c.m25663a().mo21606a("audience_connection_success", hashMap, new C8438j().mo21598a("live_detail").mo21599b("live").mo21603f("click"), C8438j.class, Room.class);
    }

    /* renamed from: n */
    public final void mo12510n() {
        PluginType pluginType;
        if (mo9140c() != null) {
            Context context = ((C4614b) mo9140c()).getContext();
            if (((Boolean) LiveConfigSettingKeys.LIVE_FIX_CHECK_PLUGIN_ERROR.mo10240a()).booleanValue()) {
                pluginType = PluginType.Camera;
            } else {
                pluginType = PluginType.LiveResource;
            }
            if (pluginType.isInstalled()) {
                ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).init();
                mo12511o();
                return;
            }
            pluginType.checkInstall(context, "interact", new C9430a() {
                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* synthetic */ void mo12517a(Throwable th) throws Exception {
                    C4610cy.this.mo13031m(th);
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* synthetic */ void mo12516a(Integer num) throws Exception {
                    if (num.equals(Integer.valueOf(2))) {
                        ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).init();
                        C4610cy.this.mo12511o();
                    } else if (num.equals(Integer.valueOf(1))) {
                        C9049ap.m27022a((int) R.string.fbm);
                    } else {
                        C9049ap.m27022a((int) R.string.fbl);
                    }
                }

                /* renamed from: a */
                public final void mo8840a(String str) {
                    ((C3245ad) ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).loadShortVideoRes().mo19297a((C7494t<T, ? extends R>) C4610cy.this.mo13032t())).mo10183a(new C4644ea(this), new C4645eb(this));
                }
            });
        }
    }

    /* renamed from: r */
    public final void mo12514r() {
        if (mo9140c() != null && !this.f13272j && !this.f13275m) {
            if (!this.f13278p) {
                this.f13272j = true;
                ((C3247af) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).joinChannelV1(this.f13266b.getId()).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(new C4621de(this), new C4622df(this));
            } else if (!this.f13265a) {
                this.f13284v.lambda$put$1$DataCenter("cmd_interact_state_change", new C4450t(7));
                this.f13275m = true;
                ((C4614b) mo9140c()).mo12526a();
            } else {
                if (this.f13267c != null) {
                    this.f13267c.mo12520b();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo8963a() {
        if (2 == ((Integer) C3913e.m13800a().f11699b).intValue() || 1 == ((Integer) C3913e.m13800a().f11699b).intValue()) {
            ((C3247af) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).leave(this.f13266b.getId()).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(C4634dr.f13307a, new C4635ds(this));
        }
        this.f13284v.removeObserver("cmd_interact_state_change", this.f13285w);
        if (!this.f13281s) {
            m15305w();
        }
        super.mo8963a();
    }

    /* renamed from: s */
    public final void mo12515s() {
        if (mo9140c() != null && !this.f13273k && !this.f13276n && !this.f13277o) {
            if (this.f13265a) {
                this.f13276n = true;
                ((C4614b) mo9140c()).mo12529b();
            } else if (this.f13278p) {
                this.f13273k = true;
                ((C3247af) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).leave(this.f13266b.getId()).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(new C4623dg(this), new C4624dh(this));
            } else {
                this.f13277o = true;
                ((C3247af) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).finishV1(this.f13266b.getId()).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(new C4625di(this), new C4626dj(this));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12477a(C3478c cVar) throws Exception {
        this.f13268d = false;
        ((C4614b) mo9140c()).mo12527a(cVar.f10296b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo12490e(C3479d dVar) throws Exception {
        this.f13273k = false;
        this.f13278p = false;
        mo12515s();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo12492f(C3479d dVar) throws Exception {
        this.f13272j = false;
        this.f13278p = true;
        mo12514r();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo12499h(Throwable th) throws Exception {
        mo13031m(th);
        this.f13268d = false;
        ((C4614b) mo9140c()).mo12532c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ void mo12502i(Throwable th) throws Exception {
        mo13031m(th);
        this.f13269e = false;
        ((C4614b) mo9140c()).mo12530b(th);
    }

    /* renamed from: a */
    public final void mo9142a(C4614b bVar) {
        super.mo9142a(bVar);
        if (this.f14276h != null) {
            this.f14276h.addMessageListener(MessageType.LINK_MIC.getIntType(), this);
        }
        this.f13284v.observeForever("cmd_interact_state_change", this.f13285w);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12484b(C3479d dVar) throws Exception {
        this.f13280r = false;
        if (this.f13267c != null) {
            this.f13267c.mo12524d(this.f13283u);
            this.f13283u = 0;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo12486c(C3479d dVar) throws Exception {
        this.f13279q = false;
        if (this.f13267c != null) {
            this.f13267c.mo12522c(this.f13282t);
            this.f13282t = 0;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo12491e(Throwable th) throws Exception {
        mo13031m(th);
        this.f13273k = false;
        if (this.f13267c != null) {
            this.f13267c.mo12525e();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo12493f(Throwable th) throws Exception {
        mo13031m(th);
        this.f13272j = false;
        if (this.f13267c != null) {
            this.f13267c.mo12521c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo12495g(C3479d dVar) throws Exception {
        this.f13271i = false;
        C3913e.m13800a().mo11452a(Integer.valueOf(0));
        ((C4614b) mo9140c()).mo12539g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo12498h(C3479d dVar) throws Exception {
        this.f13273k = false;
        ((C4614b) mo9140c()).mo12537f();
        C3913e.m13800a().mo11459b();
        m15305w();
        ((C4614b) mo9140c()).mo12537f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final /* synthetic */ void mo12506k(Throwable th) throws Exception {
        mo13031m(th);
        this.f13272j = false;
        m15305w();
        ((C4614b) mo9140c()).mo12538f(th);
    }

    /* renamed from: a */
    private void m15300a(C4450t tVar) {
        if (mo9140c() != null) {
            int i = tVar.f12909a;
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 0:
                            mo12512p();
                            return;
                        case 1:
                            ((C4614b) mo9140c()).mo12528a(true);
                            mo12509m();
                            return;
                    }
                } else {
                    m15308z();
                }
                return;
            }
            mo12507l();
        }
    }

    /* renamed from: b */
    public final void mo12483b(long j) {
        if (!this.f13280r) {
            this.f13280r = true;
            this.f13283u = j;
            ((C3247af) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).kickOut(this.f13266b.getId(), j).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(new C4630dn(this), new C4631do(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo12487c(Throwable th) throws Exception {
        mo13031m(th);
        this.f13279q = false;
        if (this.f13267c != null) {
            this.f13267c.mo12518a(this.f13282t, th);
            this.f13282t = 0;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo12488d(C3479d dVar) throws Exception {
        this.f13277o = false;
        if (this.f13267c != null) {
            this.f13267c.mo12523d();
        }
        C3913e.m13800a().mo11452a(Integer.valueOf(0));
        this.f13284v.lambda$put$1$DataCenter("cmd_interact_state_change", new C4450t(8));
        C9097a.m27146a().mo22267a((Object) new C4447q(1));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo12496g(Throwable th) throws Exception {
        mo13031m(th);
        this.f13271i = false;
        C3913e.m13800a().mo11452a(Integer.valueOf(0));
        ((C4614b) mo9140c()).mo12536e(th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ void mo12504j(Throwable th) throws Exception {
        mo13031m(th);
        this.f13273k = false;
        if (this.f13274l) {
            ((C4614b) mo9140c()).mo12537f();
            C3913e.m13800a().mo11459b();
            m15305w();
            ((C4614b) mo9140c()).mo12537f();
            return;
        }
        ((C4614b) mo9140c()).mo12535d(th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12485b(Throwable th) throws Exception {
        mo13031m(th);
        this.f13280r = false;
        if (this.f13267c != null) {
            this.f13267c.mo12519a(th);
            this.f13283u = 0;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo12489d(Throwable th) throws Exception {
        mo13031m(th);
        this.f13277o = false;
        if (this.f13274l) {
            if (this.f13267c != null) {
                this.f13267c.mo12523d();
            }
            C3913e.m13800a().mo11452a(Integer.valueOf(0));
            this.f13284v.lambda$put$1$DataCenter("cmd_interact_state_change", new C4450t(8));
            C9097a.m27146a().mo22267a((Object) new C4447q(1));
        } else if (this.f13267c != null) {
            this.f13267c.mo12525e();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ void mo12501i(C3479d dVar) throws Exception {
        this.f13272j = false;
        ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11160e();
        C3913e.m13800a().mo11452a(Integer.valueOf(2));
        ((C4614b) mo9140c()).mo12526a();
    }

    public final void onMessage(IMessage iMessage) {
        if (mo9140c() != null) {
            C8508bd bdVar = (C8508bd) iMessage;
            switch (bdVar.f23319a) {
                case 2:
                    C3912d a = C3912d.m13795a();
                    a.mo11455a(bdVar.f23321c);
                    a.f11710e = bdVar.f23320b;
                    a.f11712g = bdVar.f23322d;
                    a.f11709d = bdVar.f23323e;
                    m15306x();
                    return;
                case 3:
                    C3913e.m13800a().mo11459b();
                    if (mo9140c() != null) {
                        ((C4614b) mo9140c()).mo12541h();
                    }
                    if (!this.f13276n) {
                        this.f13276n = true;
                        ((C4614b) mo9140c()).mo12529b();
                        return;
                    }
                    break;
                case 10:
                    if (bdVar.f23340v == TTLiveSDKContext.getHostService().mo22367h().mo22179b()) {
                        ((C4614b) mo9140c()).mo12531b(false);
                        return;
                    }
                    break;
                case 11:
                    if (bdVar.f23340v == TTLiveSDKContext.getHostService().mo22367h().mo22179b()) {
                        ((C4614b) mo9140c()).mo12531b(true);
                        break;
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo12475a(long j) {
        if (!this.f13279q) {
            this.f13282t = j;
            ((C3247af) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).permit(this.f13266b.getId(), j).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(new C4627dk(this), new C4629dm(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12476a(C3477b bVar) throws Exception {
        this.f13269e = false;
        if (bVar.extra == null) {
            ((C4614b) mo9140c()).mo12530b((Throwable) new Exception());
        } else {
            m15301a(false, ((C4849a) bVar.extra).f13846a, ((C4849a) bVar.extra).f13847b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12478a(C3479d dVar) throws Exception {
        C4848a aVar = (C4848a) dVar.data;
        this.f13270f = false;
        if (mo9140c() != null) {
            C3912d.m13795a().f11713h = aVar.f13843a;
            C3912d.m13795a().f11714i = aVar.f13845c;
            C3913e.m13800a().mo11452a(Integer.valueOf(1));
            C3913e.m13800a().f11727m = 1;
            ((C4614b) mo9140c()).mo12534d();
        }
    }

    public C4610cy(Room room, boolean z, DataCenter dataCenter) {
        this.f13266b = room;
        this.f13281s = z;
        this.f13284v = dataCenter;
    }

    /* renamed from: a */
    private void m15301a(boolean z, List<C4853d> list, String str) {
        if (!this.f13270f) {
            this.f13270f = true;
            C3913e a = C3913e.m13800a();
            a.f11724j = false;
            a.f11725k = 0;
            a.f11726l = 0;
            HashMap hashMap = new HashMap();
            hashMap.put("link_type", "1");
            hashMap.put("guest_supported_vendor", "6");
            hashMap.put("guest_supported_layout", "15");
            hashMap.put("payed_money", "0");
            hashMap.put("link_duration", "0");
            ((C3247af) ((LinkApi) C3458e.m12798a().mo10440a(LinkApi.class)).apply(this.f13266b.getId(), hashMap).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(new C4632dp(this), new C4633dq(this));
            C9036ae.m26995a(this.f13266b, false, "");
        }
    }
}
