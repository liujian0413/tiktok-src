package com.bytedance.android.livesdk.chatroom.interact.p216d;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.os.Build;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.core.rxutils.autodispose.C3247af;
import com.bytedance.android.live.core.utils.C3384d;
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
import com.bytedance.android.livesdk.chatroom.event.C4450t;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4849a;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4853d;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4854e;
import com.bytedance.android.livesdk.chatroom.presenter.C5017ci;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.message.model.C8508bd;
import com.bytedance.android.livesdk.p410o.C8735f;
import com.bytedance.android.livesdk.p410o.p412b.C8721d;
import com.bytedance.android.livesdk.p428w.C9178j;
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
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.ew */
public final class C4669ew extends C5017ci<C4674b> implements OnMessageListener {

    /* renamed from: a */
    public boolean f13355a;

    /* renamed from: b */
    public Room f13356b;

    /* renamed from: c */
    public C4673a f13357c;

    /* renamed from: d */
    private boolean f13358d;

    /* renamed from: e */
    private boolean f13359e;

    /* renamed from: f */
    private boolean f13360f;

    /* renamed from: i */
    private boolean f13361i;

    /* renamed from: j */
    private boolean f13362j;

    /* renamed from: k */
    private boolean f13363k;

    /* renamed from: l */
    private boolean f13364l;

    /* renamed from: m */
    private C3913e f13365m = C3913e.m13800a();

    /* renamed from: n */
    private DataCenter f13366n;

    /* renamed from: o */
    private C0053p<KVData> f13367o = new C4675ex(this);

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.ew$a */
    public interface C4673a {
        /* renamed from: a */
        void mo12609a(Throwable th);

        /* renamed from: b */
        void mo12610b();

        /* renamed from: b */
        void mo12611b(Throwable th);

        /* renamed from: c */
        void mo12612c();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.ew$b */
    public interface C4674b extends C5595at {
        /* renamed from: a */
        void mo12198a(List<C4854e> list);

        /* renamed from: a */
        void mo12199a(List<C4853d> list, String str);

        /* renamed from: b */
        void mo12202b();

        /* renamed from: b */
        void mo12206b(Throwable th);

        /* renamed from: b */
        void mo12207b(List<C4853d> list, String str);

        /* renamed from: c */
        void mo12208c();

        /* renamed from: c */
        void mo12211c(Throwable th);

        /* renamed from: d */
        void mo12212d();

        /* renamed from: f */
        void mo12213f();

        /* renamed from: g */
        void mo12214g();

        Context getContext();

        /* renamed from: h */
        void mo12215h();
    }

    /* renamed from: s */
    private static String m15442s() {
        return Build.MODEL;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo12598f(Throwable th) {
        mo13031m(th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12586a(KVData kVData) {
        if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            m15438a((C4450t) kVData.getData());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12587a(Throwable th) throws Exception {
        mo13031m(th);
        this.f13361i = false;
        if (!(th instanceof ApiServerException) || ((ApiServerException) th).getErrorCode() != 40001) {
            ((C4674b) mo9140c()).mo12211c(th);
            return;
        }
        ((C4674b) mo9140c()).mo12214g();
        m15446z();
    }

    /* renamed from: p */
    public static int m15440p() {
        return C3912d.m13795a().f11713h;
    }

    /* renamed from: m */
    public final void mo12605m() {
        this.f13364l = true;
        mo12603k();
    }

    /* renamed from: o */
    public static long m15439o() {
        return TTLiveSDKContext.getHostService().mo22367h().mo22179b();
    }

    /* renamed from: i */
    public final void mo12601i() {
        this.f13363k = false;
        this.f13355a = false;
        m15443w();
    }

    /* renamed from: j */
    public final void mo12602j() {
        this.f13363k = false;
        this.f13355a = false;
        m15443w();
    }

    /* renamed from: n */
    public final String mo12606n() {
        return String.valueOf(this.f13356b.getId());
    }

    /* renamed from: r */
    public final boolean mo12607r() {
        if (this.f13356b.getStreamUrlExtraSafely().f25789m > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo12599g() {
        this.f13355a = true;
        this.f13366n.lambda$put$1$DataCenter("cmd_interact_state_change", new C4450t(3));
        C3913e.m13800a().mo11452a(Integer.valueOf(2));
    }

    /* renamed from: k */
    public final void mo12603k() {
        if (mo9140c() != null && !this.f13363k) {
            this.f13363k = true;
            ((C4674b) mo9140c()).mo12212d();
        }
    }

    /* renamed from: q */
    public static Vendor m15441q() {
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
    private void m15443w() {
        if (!this.f13362j) {
            this.f13362j = true;
            ((C3247af) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).leave(this.f13356b.getId()).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(new C4677ez(this), new C4679fa(this));
        }
    }

    /* renamed from: x */
    private void m15444x() {
        if (!this.f13361i) {
            this.f13361i = true;
            ((C3247af) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).joinChannelV1(this.f13356b.getId()).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(new C4682fd(this), new C4683fe(this));
            m15445y();
        }
    }

    /* renamed from: z */
    private void m15446z() {
        if (this.f13366n != null) {
            this.f13366n.lambda$put$1$DataCenter("cmd_interact_state_change", new C4450t(4));
        }
        C3913e.m13800a().mo11452a(Integer.valueOf(0));
        if (mo9140c() != null) {
            ((C4674b) mo9140c()).mo12215h();
        }
    }

    /* renamed from: b */
    public final void mo12588b() {
        if (!this.f13358d) {
            this.f13358d = true;
            ((C3247af) C4258b.m14404a((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class), this.f13356b.getId(), 1).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(new C4676ey(this), new C4684ff(this));
        }
    }

    /* renamed from: d */
    public final void mo12593d() {
        if (mo9140c() != null) {
            final Context context = ((C4674b) mo9140c()).getContext();
            Activity a = C3384d.m12589a(context);
            if (a != null) {
                C8735f.m26105a(a).mo21742a(new C4687fi(a)).mo21743a(new C8721d() {
                    /* renamed from: b */
                    public final void mo9568b(String... strArr) {
                    }

                    /* renamed from: a */
                    public final void mo9567a(String... strArr) {
                        PluginType.LiveResource.checkInstall(context, "interact", new C9430a() {
                            /* renamed from: a */
                            public final void mo8840a(String str) {
                                C4669ew.this.mo12595e();
                            }
                        });
                    }
                }, "android.permission.RECORD_AUDIO", "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE");
            }
        }
    }

    /* renamed from: f */
    public final void mo12597f() {
        if (!this.f13359e) {
            this.f13359e = true;
            ((C3247af) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).checkPermissionV1(this.f13356b.getId(), 1).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(new C4688fj(this), new C4689fk(this));
        }
    }

    /* renamed from: h */
    public final void mo12600h() {
        ((C3247af) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).leave(this.f13356b.getId()).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(C4690fl.f13387a, new C4691fm(this));
    }

    /* renamed from: y */
    private void m15445y() {
        String str;
        HashMap hashMap = new HashMap();
        if (this.f13356b != null) {
            String str2 = "room_type";
            if (this.f13356b.getStreamType() == LiveMode.AUDIO) {
                str = "radio";
            } else {
                str = "video";
            }
            hashMap.put(str2, str);
        }
        hashMap.put("audience_connection_type", "video");
        C8443c.m25663a().mo21606a("audience_connection_success", hashMap, new C8438j().mo21598a("live_detail").mo21599b("live").mo21603f("click"), C8438j.class, Room.class);
    }

    /* renamed from: a */
    public final void mo8963a() {
        if (2 == ((Integer) C3913e.m13800a().f11699b).intValue() || 1 == ((Integer) C3913e.m13800a().f11699b).intValue()) {
            ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).leave(this.f13356b.getId()).mo19129a(C4685fg.f13382a, (C7326g<? super Throwable>) new C4686fh<Object>(this));
        }
        m15446z();
        this.f13366n.removeObserver("cmd_interact_state_change", this.f13367o);
        super.mo8963a();
    }

    /* renamed from: e */
    public final void mo12595e() {
        PluginType pluginType;
        if (mo9140c() != null) {
            Context context = ((C4674b) mo9140c()).getContext();
            if (((Boolean) LiveConfigSettingKeys.LIVE_FIX_CHECK_PLUGIN_ERROR.mo10240a()).booleanValue()) {
                pluginType = PluginType.Camera;
            } else {
                pluginType = PluginType.LiveResource;
            }
            if (pluginType.isInstalled()) {
                ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).init();
                mo12597f();
                return;
            }
            pluginType.checkInstall(context, "interact", new C9430a() {
                /* renamed from: a */
                public final void mo8840a(String str) {
                    ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).loadShortVideoRes().mo19280a((C7326g<? super T>) new C4692fn<Object>(this), C4693fo.f13390a);
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* synthetic */ void mo12608a(Integer num) throws Exception {
                    if (num.equals(Integer.valueOf(2))) {
                        ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).init();
                        C4669ew.this.mo12597f();
                    } else if (num.equals(Integer.valueOf(1))) {
                        C9049ap.m27022a((int) R.string.fbm);
                    } else {
                        C9049ap.m27022a((int) R.string.fbl);
                    }
                }
            });
        }
    }

    /* renamed from: l */
    public final void mo12604l() {
        if (!this.f13360f && mo9140c() != null) {
            this.f13360f = true;
            ((C3247af) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).leave(this.f13356b.getId()).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(new C4680fb(this), new C4681fc(this));
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m15437a(Activity activity) {
        if ("SO-04J".equals(m15442s())) {
            activity.recreate();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo12596e(Throwable th) throws Exception {
        mo13031m(th);
        this.f13358d = false;
        ((C4674b) mo9140c()).mo12202b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12583a(C3478c cVar) throws Exception {
        this.f13358d = false;
        ((C4674b) mo9140c()).mo12198a(cVar.f10296b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12589b(C3479d dVar) throws Exception {
        this.f13360f = false;
        this.f13365m.mo11452a(Integer.valueOf(0));
        if (this.f13357c != null) {
            this.f13357c.mo12612c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo12591c(C3479d dVar) throws Exception {
        this.f13362j = false;
        if (this.f13357c != null) {
            this.f13357c.mo12610b();
        }
        C3913e.m13800a().mo11459b();
        m15446z();
    }

    /* renamed from: a */
    private void m15438a(C4450t tVar) {
        if (mo9140c() != null) {
            int i = tVar.f12909a;
            if (i != 5) {
                switch (i) {
                    case 0:
                        mo12588b();
                        return;
                    case 1:
                        mo12593d();
                        return;
                }
            } else {
                mo12603k();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo12592c(Throwable th) throws Exception {
        this.f13362j = false;
        mo13031m(th);
        if (this.f13364l) {
            if (this.f13357c != null) {
                this.f13357c.mo12610b();
            }
            C3913e.m13800a().mo11459b();
            m15446z();
            return;
        }
        if (this.f13357c != null) {
            this.f13357c.mo12609a(th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12590b(Throwable th) throws Exception {
        mo13031m(th);
        this.f13360f = false;
        this.f13365m.mo11452a(Integer.valueOf(0));
        if (this.f13357c != null) {
            this.f13357c.mo12611b(th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo12594d(Throwable th) throws Exception {
        mo13031m(th);
        this.f13359e = false;
        if (th instanceof ApiServerException) {
            ApiServerException apiServerException = (ApiServerException) th;
            if (apiServerException.getErrorCode() == 31002) {
                C4849a aVar = (C4849a) C2317a.m9932a().mo15974a(apiServerException.getExtra(), C4849a.class);
                if (aVar == null) {
                    ((C4674b) mo9140c()).mo12206b(apiServerException);
                } else {
                    ((C4674b) mo9140c()).mo12199a(aVar.f13846a, aVar.f13847b);
                }
            } else {
                ((C4674b) mo9140c()).mo12206b(apiServerException);
            }
            return;
        }
        ((C4674b) mo9140c()).mo12206b(th);
    }

    public final void onMessage(IMessage iMessage) {
        if (mo9140c() != null) {
            C8508bd bdVar = (C8508bd) iMessage;
            switch (bdVar.f23319a) {
                case 2:
                    C3912d a = C3912d.m13795a();
                    a.f11710e = bdVar.f23320b;
                    a.mo11455a(bdVar.f23321c);
                    a.f11712g = bdVar.f23322d;
                    a.f11709d = bdVar.f23323e;
                    m15444x();
                    break;
                case 3:
                    C3913e.m13800a().mo11459b();
                    if (mo9140c() != null) {
                        ((C4674b) mo9140c()).mo12213f();
                    }
                    if (!this.f13363k) {
                        this.f13363k = true;
                        ((C4674b) mo9140c()).mo12212d();
                        return;
                    }
                    break;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12582a(C3477b bVar) throws Exception {
        this.f13359e = false;
        if (bVar.extra == null) {
            ((C4674b) mo9140c()).mo12206b(new Exception());
        } else {
            ((C4674b) mo9140c()).mo12207b(((C4849a) bVar.extra).f13846a, ((C4849a) bVar.extra).f13847b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12584a(C3479d dVar) throws Exception {
        this.f13361i = false;
        ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11160e();
        ((C4674b) mo9140c()).mo12208c();
    }

    /* renamed from: a */
    public final void mo9142a(C4674b bVar) {
        super.mo9142a(bVar);
        if (this.f14276h != null) {
            this.f14276h.addMessageListener(MessageType.LINK_MIC.getIntType(), this);
        }
        this.f13366n.observeForever("cmd_interact_state_change", this.f13367o);
    }

    public C4669ew(Room room, DataCenter dataCenter) {
        this.f13356b = room;
        this.f13366n = dataCenter;
    }
}
