package com.bytedance.android.livesdk.chatroom.interact.p216d;

import android.arch.lifecycle.C0053p;
import android.text.TextUtils;
import android.view.SurfaceView;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.performance.C3222b;
import com.bytedance.android.live.core.performance.TimeCostUtil;
import com.bytedance.android.live.core.performance.TimeCostUtil.Tag;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.rxutils.autodispose.C3247af;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.livepullstream.api.C3449a;
import com.bytedance.android.live.livepullstream.api.C3450b;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.LinkState;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.PkResult;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.PkState;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.event.C4447q;
import com.bytedance.android.livesdk.chatroom.event.C4448r;
import com.bytedance.android.livesdk.chatroom.event.C4449s;
import com.bytedance.android.livesdk.chatroom.event.C4450t;
import com.bytedance.android.livesdk.chatroom.interact.C4466aa;
import com.bytedance.android.livesdk.chatroom.interact.C4480af;
import com.bytedance.android.livesdk.chatroom.interact.C4487am;
import com.bytedance.android.livesdk.chatroom.interact.data.C4761c;
import com.bytedance.android.livesdk.chatroom.interact.data.C4762d;
import com.bytedance.android.livesdk.chatroom.interact.p215c.C4504b;
import com.bytedance.android.livesdk.chatroom.presenter.C5017ci;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8435g;
import com.bytedance.android.livesdk.message.model.C8504ba;
import com.bytedance.android.livesdk.message.model.C8508bd;
import com.bytedance.android.livesdk.message.model.C8509be;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p280ss.avframework.livestreamv2.core.Anchor;
import com.p280ss.avframework.livestreamv2.core.Client;
import com.p280ss.avframework.livestreamv2.core.Client.Listener;
import com.p280ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p280ss.avframework.livestreamv2.interact.model.Config.Character;
import com.p280ss.avframework.livestreamv2.interact.model.Config.FrameFormat;
import com.p280ss.avframework.livestreamv2.interact.model.Config.InteractMode;
import com.p280ss.avframework.livestreamv2.interact.model.Config.Type;
import com.p280ss.avframework.livestreamv2.interact.model.Config.Vendor;
import com.p280ss.avframework.livestreamv2.interact.model.Config.VideoQuality;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C47555ab;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7494t;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.cj */
public final class C4593cj extends C5017ci<C4595a> implements C0053p<KVData>, OnMessageListener {

    /* renamed from: a */
    public C47562b f13229a = new C47562b();

    /* renamed from: b */
    private Room f13230b;

    /* renamed from: c */
    private boolean f13231c;

    /* renamed from: d */
    private DataCenter f13232d;

    /* renamed from: e */
    private LinkCrossRoomDataHolder f13233e;

    /* renamed from: f */
    private C7321c f13234f;

    /* renamed from: i */
    private boolean f13235i;

    /* renamed from: j */
    private boolean f13236j;

    /* renamed from: k */
    private boolean f13237k;

    /* renamed from: l */
    private Anchor f13238l;

    /* renamed from: m */
    private C4504b f13239m;

    /* renamed from: n */
    private C4487am f13240n;

    /* renamed from: o */
    private C4466aa f13241o;

    /* renamed from: p */
    private C3449a f13242p;

    /* renamed from: q */
    private Listener f13243q = new Listener() {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo12464a(int i, long j, Exception exc, Integer num) throws Exception {
            switch (i) {
                case 12:
                    C4593cj.this.mo12441a((int) j, exc.getMessage());
                    return;
                case 13:
                    C4593cj.this.mo12452b((int) j, exc.getMessage());
                    return;
                case 14:
                    C4593cj.this.mo12454b(exc.getMessage());
                    break;
            }
        }

        public final void onError(Client client, int i, long j, Exception exc) {
            C47562b bVar = C4593cj.this.f13229a;
            C7492s a = C7492s.m23301b(Integer.valueOf(1)).mo19294a(C47549a.m148327a());
            C4608cw cwVar = new C4608cw(this, i, j, exc);
            bVar.mo119661a(a.mo19280a((C7326g<? super T>) cwVar, C4609cx.f13264a));
        }

        public final void onInfo(Client client, int i, long j, Object... objArr) {
            C47562b bVar = C4593cj.this.f13229a;
            C7492s a = C7492s.m23301b(Integer.valueOf(1)).mo19294a(C47549a.m148327a());
            C4606cu cuVar = new C4606cu(this, i, j, objArr);
            bVar.mo119661a(a.mo19280a((C7326g<? super T>) cuVar, C4607cv.f13259a));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo12465a(int i, long j, Object[] objArr, Integer num) throws Exception {
            switch (i) {
                case 1:
                    C4593cj.this.mo12456c((int) j);
                    return;
                case 2:
                    C4593cj.this.mo12442a(j, objArr[0].longValue());
                    return;
                case 4:
                    C4593cj.this.mo12463i_();
                    return;
                case 5:
                    C4593cj.this.mo12461g();
                    return;
                case 6:
                    C4593cj.this.mo12447a(objArr[0]);
                    return;
                case 7:
                    C4593cj.this.mo12439a((int) j);
                    return;
                case 8:
                    C4593cj.this.mo12451b((int) j);
                    return;
                case 11:
                    C4593cj.this.mo12440a((int) j, objArr[0]);
                    break;
            }
        }
    };

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.cj$a */
    public interface C4595a extends C5595at {
        /* renamed from: a */
        void mo12466a();

        /* renamed from: a */
        void mo12467a(long j, long j2);

        /* renamed from: a */
        void mo12468a(String str);

        /* renamed from: a */
        void mo12469a(boolean z);

        /* renamed from: b */
        void mo12470b();

        /* renamed from: c */
        void mo12471c();

        /* renamed from: d */
        void mo12472d();

        /* renamed from: f */
        void mo12473f();

        /* renamed from: g */
        void mo12474g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo12459d(Throwable th) {
        mo13031m(th);
    }

    /* renamed from: a */
    public final void mo9142a(C4595a aVar) {
        super.mo9142a(aVar);
        this.f13242p = ((C3450b) C3596c.m13172a(C3450b.class)).getLivePlayerLog();
        this.f13233e = LinkCrossRoomDataHolder.m13782a();
        this.f13233e.lambda$put$1$DataCenter("data_pk_state", PkState.DISABLED).observeForever("cmd_stop_interact", this);
        if (this.f14276h != null) {
            this.f14276h.addMessageListener(MessageType.LINK_MIC.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.LINK_MIC_SIGNAL.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.LINK_MIC_BATTLE.getIntType(), this);
        }
        if (this.f13231c) {
            m15250j();
        }
    }

    /* renamed from: a */
    public final void mo12449a(boolean z) {
        if (this.f13235i) {
            this.f13239m.f13111a = z;
            C4762d dVar = new C4762d();
            dVar.f13508g = z ? 100102 : 100101;
            dVar.f13505d = String.valueOf(TTLiveSDKContext.getHostService().mo22367h().mo22179b());
            dVar.f13506e = String.valueOf(this.f13233e.f11677o);
            dVar.f13503b = "0";
            dVar.f13504c = "0";
            ((C3245ad) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).sendSignalV3(this.f13233e.f11665c, C2317a.m9932a().mo15979b((Object) dVar), null).mo19297a((C7494t<T, ? extends R>) mo13033u())).mo10183a(C4598cm.f13247a, new C4599cn(this));
        }
        if (this.f13238l != null) {
            this.f13238l.switchAudio(z);
            this.f13238l.invalidateSei();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12446a(Long l) throws Exception {
        if (!(LinkState.CONNECTION_SUCCEED.compareTo((LinkState) this.f13233e.get("data_link_state", LinkState.DISABLED)) <= 0)) {
            ((C4595a) mo9140c()).mo12470b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12448a(Throwable th) throws Exception {
        mo13031m(th);
        if (!this.f13237k) {
            ((C4595a) mo9140c()).mo12473f();
            this.f13236j = false;
            return;
        }
        mo12460e();
    }

    /* renamed from: a */
    public final void mo12447a(String str) {
        long id = this.f13230b.getId();
        String valueOf = String.valueOf(this.f13233e.f11665c);
        String vendor = mo12462h().toString();
        StringBuilder sb = new StringBuilder("onWarn:");
        sb.append(str);
        C4480af.m14981a(id, valueOf, vendor, 402, sb.toString());
    }

    /* renamed from: o */
    private void m15255o() {
        if (this.f13241o != null) {
            this.f13241o.mo12224b();
            this.f13241o = null;
        }
    }

    /* renamed from: p */
    private boolean m15256p() {
        if (this.f13230b.getStreamUrlExtraSafely().f25788l > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private void m15253m() {
        this.f13233e.lambda$put$1$DataCenter("data_link_state", LinkState.TURN_OFF_ENGINE);
        if (this.f13238l != null) {
            this.f13238l.stop();
            this.f13238l.dispose();
            return;
        }
        mo12461g();
    }

    /* renamed from: e */
    public final void mo12460e() {
        if (mo9140c() != null) {
            this.f13237k = false;
            if (this.f13231c) {
                m15253m();
            } else {
                m15251k();
            }
        }
    }

    /* renamed from: j */
    private void m15250j() {
        this.f13233e.lambda$put$1$DataCenter("data_link_state", LinkState.SELF_JOIN);
        ((C3245ad) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).joinChannelV3(this.f13233e.f11665c).mo19297a((C7494t<T, ? extends R>) mo13033u())).mo10183a(new C4602cq(this), new C4603cr(this));
    }

    /* renamed from: q */
    private boolean m15257q() {
        int i;
        if (((Integer) LiveConfigSettingKeys.INTERACT_VENDOR.mo10240a()).intValue() == 0) {
            i = this.f13233e.f11675m;
        } else {
            i = ((Integer) LiveConfigSettingKeys.INTERACT_VENDOR.mo10240a()).intValue();
        }
        if ((i & ((Integer) LiveConfigSettingKeys.LIVE_ENABLE_CLIENT_INTERACT_VENDOR.mo10240a()).intValue()) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo12450b() {
        if (this.f13233e.f11667e != 0) {
            ((C3247af) TTLiveSDKContext.getHostService().mo22367h().mo22180b(this.f13233e.f11667e).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(new C4596ck(this), new C4597cl(this));
        }
    }

    /* renamed from: g */
    public final void mo12461g() {
        this.f13233e.lambda$put$1$DataCenter("data_link_state", LinkState.TURN_OFF_ENGINE_SUCCEED);
        this.f13235i = false;
        m15251k();
        m15255o();
        if (this.f13232d != null) {
            this.f13232d.lambda$put$1$DataCenter("data_interact_debug_info", new C4449s(false, null));
        }
        C4480af.m14978a(0, 0, null, "anchor", "pk", mo12462h().toString(), String.valueOf(this.f13233e.f11665c));
    }

    /* renamed from: h */
    public final Vendor mo12462h() {
        int i;
        if (((Integer) LiveConfigSettingKeys.INTERACT_VENDOR.mo10240a()).intValue() == 0) {
            i = this.f13233e.f11675m;
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

    /* renamed from: i */
    private void m15249i() {
        if (mo9140c() != null) {
            this.f13233e.f11679q = System.currentTimeMillis();
            this.f13232d.lambda$put$1$DataCenter("cmd_interact_state_change", new C4450t(7));
            m15252l();
            this.f13234f = ((C3245ad) C7492s.m23295b((long) ((Integer) LiveConfigSettingKeys.LIVE_INTERACT_MAX_TIMEOUT.mo10240a()).intValue(), TimeUnit.SECONDS).mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) mo13032t())).mo10183a(new C4600co(this), new C4601cp(this));
        }
    }

    /* renamed from: k */
    private void m15251k() {
        if (this.f13231c) {
            this.f13232d.lambda$put$1$DataCenter("cmd_interact_state_change", new C4450t(8));
        }
        C9097a.m27146a().mo22267a((Object) new C4447q(2));
        this.f13232d.lambda$put$1$DataCenter("cmd_pk_state_change", new C4448r(1));
        C3222b.m12218a().mo10140a(Tag.LivePk.name(), TimeCostUtil.m12198a("isAnchor", String.valueOf(this.f13231c)));
        if (((Boolean) LiveConfigSettingKeys.SHOW_LINK_CROSS_ROOM_RESET_STACKTRACE.mo10240a()).booleanValue() && !this.f13231c) {
            C3166a.m11957a("ttlive_pk", "LinkCrossRoomDataHolder.unloadModule", (Throwable) new IllegalStateException());
        }
    }

    /* renamed from: n */
    private void m15254n() {
        VideoQuality videoQuality;
        String a = this.f13230b.getStreamUrl().mo23050a();
        long id = this.f13230b.getId();
        String lowerCase = mo12462h().name().toLowerCase();
        if (m15256p()) {
            videoQuality = VideoQuality.ANCHOR_HIGH;
        } else {
            videoQuality = VideoQuality.ANCHOR_NORMAL;
        }
        C4466aa aaVar = new C4466aa(lowerCase, a, id, videoQuality.getWidth(), videoQuality.getHeight(), videoQuality.getBitrate(), videoQuality.getFps());
        this.f13241o = aaVar;
        this.f13241o.mo12223a();
    }

    /* renamed from: a */
    public final void mo8963a() {
        this.f13232d.lambda$put$1$DataCenter("cmd_pk_state_change", new C4448r(3));
        m15255o();
        if (this.f13238l != null) {
            this.f13238l.stop();
            this.f13238l.dispose();
        }
        this.f13233e.f11664b = false;
        this.f13233e.lambda$put$1$DataCenter("data_pk_state", PkState.DISABLED);
        LinkState linkState = (LinkState) this.f13233e.get("data_link_state", LinkState.DISABLED);
        if (this.f13231c && LinkState.FINISH_SUCCEED.compareTo(linkState) <= 0) {
            mo12458d();
        }
        this.f13233e.removeObserver(this);
        this.f13233e.lambda$put$1$DataCenter("data_link_state", LinkState.UNLOADED);
        if (this.f13234f != null) {
            this.f13234f.dispose();
        }
        if (this.f13229a != null && !this.f13229a.isDisposed()) {
            this.f13229a.dispose();
        }
        super.mo8963a();
    }

    /* renamed from: d */
    public final void mo12458d() {
        this.f13233e.lambda$put$1$DataCenter("data_link_state", LinkState.FINISH);
        if (!this.f13236j) {
            this.f13236j = true;
            this.f13233e.lambda$put$1$DataCenter("data_pk_state", PkState.DISABLED);
            ((C3245ad) ((LinkApi) C3458e.m12798a().mo10440a(LinkApi.class)).finishV3(this.f13233e.f11665c).mo19297a((C7494t<T, ? extends R>) mo13034v())).mo10183a(new C4604cs(this), new C4605ct(this));
        }
    }

    /* renamed from: i_ */
    public final void mo12463i_() {
        if (this.f13233e.f11672j > 0) {
            C4480af.m14977a(0, 0, null, "anchor", "pk", mo12462h().toString());
        }
        C4480af.m14982a(mo12462h().toString(), 0, 0);
        this.f13233e.lambda$put$1$DataCenter("data_link_state", LinkState.TURN_ON_ENGINE_SUCCEED);
        this.f13235i = true;
        if (this.f13232d != null) {
            this.f13232d.lambda$put$1$DataCenter("data_interact_debug_info", new C4449s(true, mo12462h().name()));
        }
        m15254n();
        if (this.f13233e.f11672j > 0 && this.f13231c && this.f13233e.f11671i) {
            ((C4595a) mo9140c()).mo12466a();
        }
    }

    /* renamed from: l */
    private void m15252l() {
        VideoQuality videoQuality;
        boolean z;
        if (this.f13233e.f11665c == 0) {
            ((C4595a) mo9140c()).mo12472d();
            m15251k();
            return;
        }
        if (m15256p()) {
            videoQuality = VideoQuality.ANCHOR_HIGH;
        } else {
            videoQuality = VideoQuality.ANCHOR_NORMAL;
        }
        this.f13239m = new C4504b(videoQuality);
        String str = null;
        if (TextUtils.equals(TTLiveSDKContext.getHostService().mo22360a().getChannel(), "local_test")) {
            File externalFilesDir = TTLiveSDKContext.getHostService().mo22360a().context().getExternalFilesDir(null);
            if (externalFilesDir != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(externalFilesDir.getAbsolutePath());
                sb.append("/interact_");
                sb.append(System.currentTimeMillis());
                sb.append(".log");
                str = sb.toString();
                new File(str).exists();
            }
        }
        if (this.f13233e.f11678p == 1) {
            z = true;
        } else {
            z = false;
        }
        if (m15257q()) {
            z = true;
        }
        InteractConfig mixStreamRtmpUrl = new InteractConfig().setStreamMixer(this.f13239m).setBackgroundColor("#303342").setMixStreamRtmpUrl(this.f13230b.getStreamUrl().mo23050a());
        mixStreamRtmpUrl.setContext(TTLiveSDKContext.getHostService().mo22360a().context()).setAgoraAppId(C4761c.m15640a()).setAgoraAppKey(this.f13233e.f11676n).setZegoAppId(4120036982L).setZegoSignature(C4761c.m15642c()).setZegoThirdPartyToken(this.f13233e.f11676n).setByteAppId(C4761c.m15641b()).setByteToken(this.f13233e.f11676n).setUserId(TTLiveSDKContext.getHostService().mo22367h().mo22179b()).setInteractId(this.f13233e.f11677o).setVideoQuality(videoQuality).setVendor(mo12462h()).setChannelName(String.valueOf(this.f13233e.f11665c)).setCharacter(Character.ANCHOR).setFrameFormat(FrameFormat.TEXTURE_2D).setTest(false).setLogReportInterval(5).setProjectKey(C3358ac.m12515a((int) R.string.fdg)).setInteractMode(InteractMode.PK).setLogFile(str).setSeiVersion(2).setType(Type.VIDEO).setClientMixStream(z);
        this.f13238l = (Anchor) this.f13240n.mo9795a(mixStreamRtmpUrl, Boolean.valueOf(false));
        this.f13238l.setListener(this.f13243q);
        this.f13238l.start();
        this.f13233e.lambda$put$1$DataCenter("data_link_state", LinkState.TURN_ON_ENGINE);
        mo12462h();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12443a(User user) throws Exception {
        this.f13233e.lambda$put$1$DataCenter("data_guest_user", User.from(user));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12453b(C3479d dVar) throws Exception {
        this.f13233e.lambda$put$1$DataCenter("data_link_state", LinkState.SELF_JOIN_SUCCEED);
        m15249i();
    }

    /* renamed from: c */
    public final void mo12456c(int i) {
        C4480af.m14980a((long) i, "pk", mo12462h().toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (!(kVData == null || kVData.getData() == null || !"cmd_stop_interact".equals(kVData.getKey()))) {
            if (((Boolean) kVData.getData()).booleanValue()) {
                ((C4595a) mo9140c()).mo12471c();
            } else if (this.f13231c) {
                mo12458d();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo12457c(Throwable th) throws Exception {
        boolean z;
        mo13031m(th);
        if (LinkState.CONNECTION_SUCCEED.compareTo((LinkState) this.f13233e.get("data_link_state", LinkState.DISABLED)) <= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ((C4595a) mo9140c()).mo12470b();
        }
    }

    /* renamed from: b */
    public final void mo12451b(int i) {
        if (this.f13231c) {
            C3517a.m12960a(TTLiveSDKContext.getHostService().mo22360a().context(), (int) R.string.euk);
        }
        mo12458d();
        if (this.f13233e.f11672j > 0) {
            this.f13233e.lambda$put$1$DataCenter("data_pk_result", PkResult.LEFT_WON);
            this.f13233e.lambda$put$1$DataCenter("data_pk_state", PkState.DISABLED);
        }
        ((C4595a) mo9140c()).mo12468a("STREAM_ON_USER_LEAVED");
    }

    /* renamed from: a */
    public final void mo12439a(int i) {
        ((C4595a) mo9140c()).mo12468a("STREAM_ON_USER_JOINED");
        if (this.f13233e.f11672j > 0 && this.f13231c && !this.f13233e.f11671i) {
            ((C4595a) mo9140c()).mo12466a();
        }
    }

    /* renamed from: b */
    public final void mo12454b(String str) {
        if (mo9140c() != null) {
            ((C4595a) mo9140c()).mo12471c();
            ((C4595a) mo9140c()).mo12468a("STREAM_ON_ERROR");
        }
        this.f13237k = true;
        C4480af.m14981a(this.f13230b.getId(), String.valueOf(this.f13233e.f11665c), mo12462h().toString(), 401, str);
    }

    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof C8508bd) {
            int i = ((C8508bd) iMessage).f23319a;
            if (i != 4) {
                if (i == 105) {
                    mo12460e();
                } else if (i == 205 && this.f13233e.get("data_pk_state") == PkState.PENAL) {
                    C8435g gVar = new C8435g();
                    if (LinkCrossRoomDataHolder.m13782a().f11672j > 0 && LinkCrossRoomDataHolder.m13782a().f11680r == 0) {
                        gVar.mo21591a(LinkCrossRoomDataHolder.m13782a().f11669g);
                    }
                    C8443c.m25663a().mo21607a("punish_end", gVar.mo21597c("disconnect").mo21593a(String.valueOf((System.currentTimeMillis() - this.f13233e.f11688z) / 1000)), this.f13233e.mo11449b(), Room.class);
                }
            } else if (this.f13231c) {
                mo12458d();
                if (this.f13233e.f11672j > 0) {
                    this.f13233e.lambda$put$1$DataCenter("data_pk_result", PkResult.LEFT_WON);
                    this.f13233e.lambda$put$1$DataCenter("data_pk_state", PkState.DISABLED);
                }
            } else {
                mo12460e();
            }
        } else if (iMessage instanceof C8509be) {
            if (this.f13231c) {
                C8509be beVar = (C8509be) iMessage;
                if (beVar.mo21655a() != null) {
                    C4762d a = beVar.mo21655a();
                    try {
                        if (Long.parseLong(a.f13505d) == this.f13233e.f11667e && this.f13239m != null) {
                            if (a.f13508g == 100102) {
                                ((C4595a) mo9140c()).mo12469a(true);
                                this.f13239m.f13112b = true;
                            } else if (a.f13508g == 100101) {
                                ((C4595a) mo9140c()).mo12469a(false);
                                this.f13239m.f13112b = false;
                            }
                            if (this.f13238l != null) {
                                this.f13238l.invalidateSei();
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        } else if ((iMessage instanceof C8504ba) && !this.f13231c) {
            C8504ba baVar = (C8504ba) iMessage;
            this.f13233e.f11665c = baVar.f23299a.f25649a;
            this.f13233e.f11672j = baVar.f23299a.f25650b;
            this.f13233e.f11673k = baVar.f23299a.f25651c;
            this.f13233e.f11674l = baVar.f23299a.f25652d;
            this.f13233e.f11666d = baVar.f23299a.f25653e;
            this.f13232d.lambda$put$1$DataCenter("data_interact_debug_info", new C4449s(true, ""));
            ((C4595a) mo9140c()).mo12466a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12455b(Throwable th) throws Exception {
        Object th2;
        mo13031m(th);
        ((C4595a) mo9140c()).mo12470b();
        if (th instanceof ApiServerException) {
            th2 = Integer.valueOf(((ApiServerException) th).getErrorCode());
        } else {
            th2 = th.toString();
        }
        C4480af.m14977a(1, 201, th2, "anchor", "pk", mo12462h().toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12444a(C3479d dVar) throws Exception {
        this.f13233e.lambda$put$1$DataCenter("data_link_state", LinkState.FINISH_SUCCEED);
        mo12460e();
    }

    /* renamed from: a */
    public final void mo12442a(long j, long j2) {
        if (mo9140c() != null) {
            ((C4595a) mo9140c()).mo12467a(j, j2);
        }
    }

    public C4593cj(DataCenter dataCenter, C4487am amVar) {
        this.f13232d = dataCenter;
        this.f13240n = amVar;
        this.f13230b = (Room) this.f13232d.get("data_room");
        this.f13231c = ((Boolean) this.f13232d.get("data_is_anchor")).booleanValue();
    }

    /* renamed from: b */
    public final void mo12452b(int i, String str) {
        m15251k();
        StringBuilder sb = new StringBuilder("code: ");
        sb.append(i);
        sb.append(", desc: ");
        sb.append(str);
        C4480af.m14978a(1, 301, sb.toString(), "anchor", "pk", mo12462h().toString(), String.valueOf(this.f13233e.f11665c));
    }

    /* renamed from: a */
    public final void mo12440a(int i, SurfaceView surfaceView) {
        int i2;
        if (this.f13234f != null) {
            this.f13234f.dispose();
        }
        if (this.f13233e.f11679q > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f13233e.f11679q;
            if (this.f13233e.f11671i) {
                i2 = 2;
            } else {
                i2 = 3;
            }
            C4480af.m14979a(currentTimeMillis, i2, mo12462h().toString());
            this.f13233e.f11679q = 0;
        }
        C4448r rVar = new C4448r(2);
        rVar.f12905b = surfaceView;
        if (this.f13232d != null) {
            this.f13232d.lambda$put$1$DataCenter("cmd_pk_state_change", rVar);
        }
        ((C4595a) mo9140c()).mo12474g();
        ((C4595a) mo9140c()).mo12468a("STREAM_ON_FIRST_REMOTE_VIDEO_FRAME");
        this.f13233e.lambda$put$1$DataCenter("data_link_state", LinkState.CONNECTION_SUCCEED);
    }

    /* renamed from: a */
    public final void mo12441a(int i, String str) {
        C4480af.m14982a(mo12462h().toString(), 1, i);
        if (mo9140c() != null) {
            ((C4595a) mo9140c()).mo12470b();
        }
        if (this.f13234f != null) {
            this.f13234f.dispose();
        }
        StringBuilder sb = new StringBuilder("code: ");
        sb.append(i);
        sb.append(", desc: ");
        sb.append(str);
        C4480af.m14977a(1, 107, sb.toString(), "anchor", "pk", mo12462h().toString());
        this.f13233e.f11679q = 0;
    }
}
