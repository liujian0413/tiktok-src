package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.p127c.C2429a;
import com.bytedance.android.live.broadcast.api.p128d.C2434c;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.livepullstream.api.C3449a;
import com.bytedance.android.live.livepullstream.api.C3450b;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C3912d;
import com.bytedance.android.livesdk.app.dataholder.C3913e;
import com.bytedance.android.livesdk.chatroom.event.C4449s;
import com.bytedance.android.livesdk.chatroom.event.C4450t;
import com.bytedance.android.livesdk.chatroom.interact.C4480af;
import com.bytedance.android.livesdk.chatroom.interact.C4486al;
import com.bytedance.android.livesdk.chatroom.interact.C4487am;
import com.bytedance.android.livesdk.chatroom.interact.C4490ao;
import com.bytedance.android.livesdk.chatroom.interact.p213a.C4465a;
import com.bytedance.android.livesdk.chatroom.interact.p215c.C4505c;
import com.bytedance.android.livesdk.chatroom.interact.p215c.C4505c.C4506a;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4527a;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4610cy;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4610cy.C4614b;
import com.bytedance.android.livesdk.chatroom.interact.p217e.C4764a;
import com.bytedance.android.livesdk.chatroom.interact.p218f.C4778a;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4854e;
import com.bytedance.android.livesdk.chatroom.p220ui.AbsInteractionFragment.C5066c;
import com.bytedance.android.livesdk.chatroom.p220ui.C5195ar;
import com.bytedance.android.livesdk.chatroom.viewmodule.p221a.p222a.C5572e;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5735a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d.C5739a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5747j;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.user.LiveInteractFunction;
import com.bytedance.android.livesdk.utils.C9036ae;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdk.widget.C9245h;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.avframework.livestreamv2.core.Client;
import com.p280ss.avframework.livestreamv2.core.Client.Listener;
import com.p280ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p280ss.avframework.livestreamv2.interact.model.Config;
import com.p280ss.avframework.livestreamv2.interact.model.Config.Character;
import com.p280ss.avframework.livestreamv2.interact.model.Config.FrameFormat;
import com.p280ss.avframework.livestreamv2.interact.model.Config.InteractMode;
import com.p280ss.avframework.livestreamv2.interact.model.Config.Type;
import com.p280ss.avframework.livestreamv2.interact.model.Config.Vendor;
import com.p280ss.avframework.livestreamv2.interact.model.Config.VideoQuality;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;

public class LinkInRoomAudioWidget extends LiveWidget implements C4506a, C4614b, C6310a {

    /* renamed from: a */
    public C4610cy f16059a;

    /* renamed from: b */
    public C4527a f16060b;

    /* renamed from: c */
    public Client f16061c;

    /* renamed from: d */
    public C4490ao f16062d;

    /* renamed from: e */
    public boolean f16063e;

    /* renamed from: f */
    public C5066c f16064f;

    /* renamed from: g */
    public C47562b f16065g = new C47562b();

    /* renamed from: h */
    private C5195ar f16066h;

    /* renamed from: i */
    private C9245h f16067i;

    /* renamed from: j */
    private C4764a f16068j;

    /* renamed from: k */
    private C4778a f16069k;

    /* renamed from: l */
    private C6309f f16070l;

    /* renamed from: m */
    private C2429a f16071m;

    /* renamed from: n */
    private C4486al f16072n;

    /* renamed from: o */
    private Runnable f16073o;

    /* renamed from: p */
    private C3449a f16074p;

    /* renamed from: q */
    private C5440a f16075q = new C5440a();

    /* renamed from: r */
    private Room f16076r;

    /* renamed from: s */
    private Listener f16077s = new Listener() {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo13857a(int i, long j, Exception exc, Integer num) throws Exception {
            switch (i) {
                case 12:
                    LinkInRoomAudioWidget.this.mo13841a((int) j, exc.getMessage());
                    return;
                case 13:
                    LinkInRoomAudioWidget.this.mo13849b((int) j, exc.getMessage());
                    return;
                case 14:
                    LinkInRoomAudioWidget.this.mo13853c(exc.getMessage());
                    break;
            }
        }

        public final void onError(Client client, int i, long j, Exception exc) {
            C47562b bVar = LinkInRoomAudioWidget.this.f16065g;
            C7492s a = C7492s.m23301b(Integer.valueOf(1)).mo19294a(C47549a.m148327a());
            C5627by byVar = new C5627by(this, i, j, exc);
            bVar.mo119661a(a.mo19280a((C7326g<? super T>) byVar, C5628bz.f16699a));
        }

        public final void onInfo(Client client, int i, long j, Object... objArr) {
            C47562b bVar = LinkInRoomAudioWidget.this.f16065g;
            C7492s a = C7492s.m23301b(Integer.valueOf(1)).mo19294a(C47549a.m148327a());
            C5625bw bwVar = new C5625bw(this, i, j, objArr);
            bVar.mo119661a(a.mo19280a((C7326g<? super T>) bwVar, C5626bx.f16694a));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo13858a(int i, long j, Object[] objArr, Integer num) throws Exception {
            switch (i) {
                case 1:
                    LinkInRoomAudioWidget.this.mo13852c((int) j);
                    return;
                case 2:
                    LinkInRoomAudioWidget.this.mo13842a(j, objArr[0].longValue());
                    return;
                case 4:
                    LinkInRoomAudioWidget.this.mo13855k();
                    return;
                case 5:
                    LinkInRoomAudioWidget.this.mo13856l();
                    return;
                case 6:
                    LinkInRoomAudioWidget.this.mo13851b(objArr[0]);
                    return;
                case 8:
                    LinkInRoomAudioWidget.this.mo13848b((int) j);
                    return;
                case 9:
                    LinkInRoomAudioWidget.this.mo13846a(objArr[0], objArr[1]);
                    break;
            }
        }
    };

    /* renamed from: t */
    private boolean f16078t;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LinkInRoomAudioWidget$a */
    class C5440a implements C5739a {

        /* renamed from: b */
        private boolean f16081b;

        /* renamed from: c */
        private View f16082c;

        /* renamed from: a */
        public final void mo8812a(C5735a aVar) {
        }

        /* renamed from: b */
        public final void mo8813b(View view, DataCenter dataCenter) {
        }

        private C5440a() {
            this.f16081b = true;
        }

        /* renamed from: a */
        public final void mo13859a(boolean z) {
            int i;
            this.f16081b = z;
            if (this.f16082c != null) {
                this.f16082c.setVisibility(0);
                View view = this.f16082c;
                if (z) {
                    i = R.drawable.c6o;
                } else {
                    i = R.drawable.c6n;
                }
                view.setBackgroundResource(i);
            }
        }

        public final void onClick(View view) {
            if (this.f16081b) {
                if (LinkInRoomAudioWidget.this.f16060b.mo12371a(false) && LinkInRoomAudioWidget.this.f16061c != null) {
                    LinkInRoomAudioWidget.this.f16061c.switchAudio(false);
                    LinkInRoomAudioWidget.this.f16060b.mo12368a(C4610cy.m15302d());
                    C9049ap.m27022a((int) R.string.f15);
                    if (LinkInRoomAudioWidget.this.f16063e) {
                        LinkInRoomAudioWidget.this.f16062d.mo12256b(C4610cy.m15302d(), true);
                    }
                    mo13859a(false);
                }
            } else if (!LinkInRoomAudioWidget.this.f16060b.mo12371a(true) || LinkInRoomAudioWidget.this.f16061c == null) {
                C9049ap.m27022a((int) R.string.ewq);
            } else {
                LinkInRoomAudioWidget.this.f16061c.switchAudio(true);
                LinkInRoomAudioWidget.this.f16060b.mo12373b(C4610cy.m15302d());
                C9049ap.m27022a((int) R.string.f18);
                if (LinkInRoomAudioWidget.this.f16063e) {
                    LinkInRoomAudioWidget.this.f16062d.mo12256b(C4610cy.m15302d(), false);
                }
                mo13859a(true);
            }
        }

        /* renamed from: a */
        public final void mo8811a(View view, DataCenter dataCenter) {
            this.f16082c = view;
        }
    }

    /* renamed from: a */
    public final void mo9118a(Throwable th) {
        C5596au.m18013a(this, th);
    }

    /* renamed from: e */
    public final String mo9125e() {
        return C5596au.m18012a(this);
    }

    public int getLayoutId() {
        return R.layout.axb;
    }

    /* renamed from: a */
    public final boolean mo13847a(Runnable runnable, boolean z) {
        if (((Integer) C3913e.m13800a().f11699b).intValue() == 0) {
            return false;
        }
        new C9249a(getContext()).mo22718b((int) R.string.ewi).mo22722b(0, (int) R.string.f96, (OnClickListener) new C5620br(this, runnable)).mo22722b(1, (int) R.string.ecm, C5621bs.f16686a).mo22729d();
        return true;
    }

    /* renamed from: a */
    public final void mo12528a(boolean z) {
        m17499c(true);
    }

    /* renamed from: a */
    public final void mo13846a(String[] strArr, boolean[] zArr) {
        if (this.f16069k != null) {
            this.f16069k.onTalkStateUpdated(strArr, zArr);
        }
    }

    /* renamed from: h */
    public final void mo12541h() {
        C9049ap.m27022a((int) R.string.f1b);
    }

    /* renamed from: c */
    public final void mo12532c() {
        if (isViewValid()) {
            C9049ap.m27022a((int) R.string.eun);
        }
    }

    /* renamed from: f */
    public final void mo12537f() {
        if (isViewValid()) {
            this.f16069k.mo12712c();
        }
    }

    /* renamed from: g */
    public final void mo12539g() {
        if (isViewValid()) {
            this.f16069k.mo12712c();
        }
    }

    /* renamed from: i */
    public final void mo12542i() {
        if (this.f16073o != null) {
            this.f16073o.run();
            this.f16073o = null;
        }
    }

    /* renamed from: d */
    public final void mo12534d() {
        if (isViewValid()) {
            m17499c(false);
            C9049ap.m27022a((int) R.string.ebh);
        }
    }

    /* renamed from: m */
    private void m17500m() {
        new C9249a(this.context).mo22718b((int) R.string.exj).mo22722b(0, (int) R.string.exi, (OnClickListener) new C5622bt(this)).mo22722b(1, (int) R.string.ecm, C5623bu.f16688a).mo22729d();
    }

    /* renamed from: b */
    public final void mo12529b() {
        if (isViewValid()) {
            if (this.f16072n != null) {
                this.f16072n.mo9799d();
            }
            if (this.f16061c != null) {
                this.f16061c.stop();
                this.f16061c.dispose();
                return;
            }
            this.f16059a.mo12503j();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final void mo13854j() {
        if (!TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
            TTLiveSDKContext.getHostService().mo22367h().mo22167a(this.context, C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.ev9)).mo22192c("interact").mo22188a(0).mo22190a()).mo19293a((C7497x<? super T, ? extends R>) getAutoUnbindTransformer()).mo19189a((C7498y<? super T>) new C8986g<Object>());
        } else if (!TTLiveSDKContext.getHostService().mo22367h().mo22178a(LiveInteractFunction.INTERACT)) {
            if (this.f16068j.mo12699d() > 0 || ((Integer) C3913e.m13800a().f11699b).intValue() != 0) {
                this.f16059a.mo12512p();
            } else {
                this.f16059a.mo12509m();
            }
        }
    }

    /* renamed from: l */
    public final void mo13856l() {
        String str;
        if (this.f16063e) {
            this.dataCenter.lambda$put$1$DataCenter("cmd_interact_state_change", new C4450t(11));
        }
        this.f16061c = null;
        C5747j.m18103a().mo14167b(ToolbarButton.AUDIO_TOGGLE, this.f16075q);
        this.f16059a.mo12503j();
        this.dataCenter.lambda$put$1$DataCenter("data_interact_debug_info", new C4449s(false, null));
        if (this.f16063e) {
            str = "anchor";
        } else {
            str = "audience";
        }
        C4480af.m14978a(0, 0, null, str, "normal", C4610cy.m15304j_().toString(), this.f16059a.mo12482b());
    }

    public void onDestroy() {
        if (this.f16063e) {
            C5747j.m18103a().mo14164a(ToolbarButton.RADIO_COVER, (C5735a) new C5572e(0));
        }
        C5747j.m18103a().mo14167b(ToolbarButton.AUDIO_TOGGLE, this.f16075q);
        C3912d.m13795a().mo11452a(Boolean.valueOf(false));
        this.f16060b.mo8963a();
        this.f16059a.mo8963a();
        this.f16069k.mo12710b();
        this.f16068j.mo12692b();
        if (this.f16072n != null) {
            this.f16072n.mo9799d();
        }
        if (this.f16061c != null) {
            this.f16061c.stop();
            this.f16061c.dispose();
        }
        if (this.f16065g != null && !this.f16065g.isDisposed()) {
            this.f16065g.dispose();
        }
        this.f16071m = null;
        super.onDestroy();
    }

    public void onPause() {
        boolean z;
        if (this.f16059a.f13265a) {
            if (this.f16060b.mo12372b() == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f16078t = z;
            this.f16061c.switchAudio(false);
            if (this.f16060b.mo12372b() == 0) {
                this.f16060b.mo12368a(C4610cy.m15302d());
            }
            if (this.f16072n != null) {
                this.f16072n.mo9796a();
            }
            this.f16068j.mo12703e();
            this.f16070l.sendEmptyMessageDelayed(140000, 180000);
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f16070l.removeCallbacksAndMessages(null);
        if (this.f16059a.f13265a) {
            if (this.f16072n != null) {
                this.f16072n.mo9797b();
            }
            this.f16068j.mo12705f();
            if (this.f16078t) {
                this.f16061c.switchAudio(true);
                this.f16060b.mo12373b(C4610cy.m15302d());
            }
            if (!this.f16063e) {
                this.dataCenter.lambda$put$1$DataCenter("cmd_interact_state_change", new C4450t(3));
            }
        }
    }

    /* renamed from: a */
    public final void mo12526a() {
        Character character;
        if (isViewValid()) {
            C3913e.m13800a().f11719e = SystemClock.currentThreadTimeMillis();
            if (this.f16076r.getStreamUrl().f25613l != null) {
                this.f16076r.getStreamUrl();
            }
            Vendor j_ = C4610cy.m15304j_();
            InteractConfig backgroundColor = new InteractConfig().setStreamMixer(new C4505c(this)).setBackgroundColor("#161823");
            C4465a.m14942a(backgroundColor);
            Config volumeCallbackInterval = backgroundColor.setContext(this.context).setUserId(C4610cy.m15302d()).setLogReportInterval(5).setInteractId(C4610cy.m15303e()).setVideoQuality(VideoQuality.GUEST_NORMAL).setVendor(j_).setProjectKey(C3358ac.m12515a((int) R.string.fdg)).setInteractMode(InteractMode.NORMAL).setVolumeCallbackInterval(C34943c.f91128x);
            if (this.f16063e) {
                character = Character.ANCHOR;
            } else {
                character = Character.GUEST;
            }
            volumeCallbackInterval.setCharacter(character).setSeiVersion(3).setChannelName(this.f16059a.mo12482b());
            if (this.f16063e) {
                ((C2434c) this.f16072n).setOutputFormat(3553);
                backgroundColor.setMixStreamRtmpUrl(this.f16059a.mo12494g()).setFrameFormat(FrameFormat.TEXTURE_2D).setAutoUpdateSeiForTalk(true).setType(Type.VIDEO);
                this.f16061c = ((C4487am) this.f16072n).mo9795a(backgroundColor, Boolean.valueOf(false));
            } else {
                backgroundColor.setType(Type.AUDIO);
                this.f16061c = ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).createGuestClient(this.context, backgroundColor);
            }
            this.f16061c.setListener(this.f16077s);
            this.f16061c.start();
        }
    }

    /* renamed from: k */
    public final void mo13855k() {
        String str;
        String str2;
        if (isViewValid()) {
            C4480af.m14982a(C4610cy.m15304j_().toString(), 0, 0);
            C5747j.m18103a().mo14165a(ToolbarButton.AUDIO_TOGGLE, (C5739a) this.f16075q);
            this.f16075q.mo13859a(true);
            this.f16059a.mo12497h();
            C4480af.m14977a(0, 0, null, "audience", "normal", C4610cy.m15304j_().toString());
            JSONObject jSONObject = new JSONObject();
            C3913e a = C3913e.m13800a();
            if (a.f11724j) {
                StringBuilder sb = new StringBuilder();
                sb.append(String.valueOf(a.f11725k));
                sb.append("-");
                sb.append(a.f11726l);
                str = sb.toString();
            } else {
                str = "";
            }
            try {
                jSONObject.put("type", str);
                String str3 = "connection_type";
                if (C3913e.m13800a().f11727m == 2) {
                    str2 = "voice_type";
                } else {
                    str2 = "live_type";
                }
                jSONObject.put(str3, str2);
                C8448g.m25682a(this.context);
                this.f16059a.f13266b.getOwner().getId();
                this.f16059a.f13266b.getId();
            } catch (JSONException unused) {
            }
            if (this.f16063e) {
                C4450t tVar = new C4450t(10);
                tVar.f12910b = this.f16072n;
                this.dataCenter.lambda$put$1$DataCenter("cmd_interact_state_change", tVar);
            }
            this.dataCenter.lambda$put$1$DataCenter("data_interact_debug_info", new C4449s(true, C4610cy.m15304j_().name()));
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f16076r = (Room) this.dataCenter.get("data_room");
        boolean booleanValue = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f16068j = new C4764a(this.f16076r, this.dataCenter);
        this.f16074p = ((C3450b) C3596c.m13172a(C3450b.class)).getLivePlayerLog();
        this.f16059a = new C4610cy(this.f16076r, booleanValue, this.dataCenter);
        this.f16060b = new C4527a(this.f16076r, booleanValue, this.f16068j);
        this.f16060b.mo9142a(null);
        this.f16070l = new C6309f(this);
        this.f16063e = booleanValue;
        this.f16068j.mo12685a();
        C4778a aVar = new C4778a(this.f16059a.f13266b, this.f16063e, (FrameLayout) this.containerView, this.f16068j, this.context, this.f16062d, this.dataCenter);
        this.f16069k = aVar;
        this.f16069k.mo12707a();
        this.f16059a.mo9142a((C4614b) this);
        if (!this.f16063e) {
            C3913e.m13800a().mo11452a(Integer.valueOf(0));
        } else {
            this.f16072n = ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).createLinkInRoomView(this.f16071m, this.context, 0);
        }
        if (this.f16063e) {
            C5747j.m18103a().mo14164a(ToolbarButton.RADIO_COVER, (C5735a) new C5572e(8));
        }
    }

    /* renamed from: a */
    public final long mo12275a(int i) {
        return this.f16068j.mo12702e(i);
    }

    /* renamed from: b */
    public final void mo13848b(int i) {
        this.f16068j.mo12693b(i);
        this.f16069k.mo12181a(0, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13843a(DialogInterface dialogInterface) {
        this.f16066h = null;
    }

    /* renamed from: c */
    public final void mo13852c(int i) {
        C4480af.m14980a((long) i, "normal", C4610cy.m15304j_().toString());
    }

    /* renamed from: e */
    public final void mo12536e(Throwable th) {
        if (isViewValid()) {
            C9076n.m27096a(getContext(), th, (int) R.string.ewk);
        }
    }

    /* renamed from: f */
    public final void mo12538f(Throwable th) {
        if (isViewValid()) {
            C9076n.m27095a(this.context, th);
        }
    }

    public void handleMsg(Message message) {
        if (isViewValid() && 140000 == message.what && this.f16059a != null) {
            this.f16059a.mo12507l();
        }
    }

    /* renamed from: c */
    private void m17499c(boolean z) {
        if (z) {
            if (this.f16067i == null) {
                this.f16067i = new C9249a(getContext(), 2).mo22718b((int) R.string.eu0).mo22720b();
            }
            if (!this.f16067i.isShowing()) {
                this.f16067i.show();
            }
        } else if (this.f16067i != null && this.f16067i.isShowing()) {
            this.f16067i.dismiss();
        }
    }

    /* renamed from: d */
    public final void mo12535d(Throwable th) {
        if (isViewValid()) {
            C9076n.m27096a(getContext(), th, (int) R.string.ewk);
        }
    }

    /* renamed from: c */
    public final void mo13853c(String str) {
        C9049ap.m27022a((int) R.string.exg);
        this.f16059a.mo12513q();
        C4480af.m14981a(this.f16059a.f13266b.getId(), this.f16059a.mo12482b(), C4610cy.m15304j_().toString(), 401, str);
    }

    /* renamed from: b */
    public final void mo13851b(String str) {
        long id = this.f16059a.f13266b.getId();
        String b = this.f16059a.mo12482b();
        String vendor = C4610cy.m15304j_().toString();
        StringBuilder sb = new StringBuilder("onWarn:");
        sb.append(str);
        C4480af.m14981a(id, b, vendor, 402, sb.toString());
    }

    /* renamed from: c */
    public final void mo12533c(Throwable th) {
        if (isViewValid()) {
            m17499c(false);
            C9076n.m27096a(getContext(), th, (int) R.string.ety);
        }
    }

    /* renamed from: a */
    public final void mo13845a(String str) {
        if (!this.f16063e && this.f16069k != null) {
            this.f16069k.mo12709a(str);
        }
    }

    /* renamed from: b */
    public final void mo12530b(Throwable th) {
        if (isViewValid()) {
            m17499c(false);
            if (th instanceof ApiServerException) {
                int errorCode = ((ApiServerException) th).getErrorCode();
                if (30010 == errorCode) {
                    m17500m();
                    return;
                } else if (31002 == errorCode) {
                    C9036ae.m26993a(this.f16059a.f13266b);
                }
            }
            C9076n.m27095a(this.context, th);
        }
    }

    /* renamed from: b */
    public final void mo12531b(boolean z) {
        if (isViewValid() && this.f16061c != null) {
            this.f16061c.switchAudio(z);
            if (z) {
                this.f16075q.mo13859a(true);
                C9049ap.m27022a((int) R.string.f1d);
                return;
            }
            this.f16075q.mo13859a(false);
            C9049ap.m27022a((int) R.string.ewq);
        }
    }

    /* renamed from: a */
    public final void mo12527a(List<C4854e> list) {
        if (isViewValid() && this.f16066h == null) {
            C5195ar arVar = new C5195ar(this.context, this.f16063e, this.f16059a.f13266b, list, this.f16059a);
            this.f16066h = arVar;
            this.f16066h.setOnDismissListener(new C5624bv(this));
            this.f16066h.show();
            C9036ae.m26994a(this.f16059a.f13266b, "show_connection_management", "guest_connection", false);
        }
    }

    /* renamed from: a */
    public final void mo13842a(long j, long j2) {
        if (this.f16064f != null) {
            this.f16064f.mo13174a(j, j2);
        }
    }

    public LinkInRoomAudioWidget(C2429a aVar, C4490ao aoVar) {
        this.f16071m = aVar;
        this.f16062d = aoVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13850b(DialogInterface dialogInterface, int i) {
        TTLiveSDKContext.getHostService().mo22370k();
        startActivity(null);
        dialogInterface.dismiss();
    }

    /* renamed from: a */
    public final void mo13841a(int i, String str) {
        C4480af.m14982a(C4610cy.m15304j_().toString(), 1, i);
        this.f16059a.mo12500i();
        C9049ap.m27022a((int) R.string.exe);
        StringBuilder sb = new StringBuilder("code: ");
        sb.append(i);
        sb.append(", desc: ");
        sb.append(str);
        C4480af.m14977a(1, 107, sb.toString(), "audience", "normal", C4610cy.m15304j_().toString());
    }

    /* renamed from: b */
    public final void mo13849b(int i, String str) {
        String str2;
        this.f16059a.mo12505k();
        StringBuilder sb = new StringBuilder("code: ");
        sb.append(i);
        sb.append(", desc: ");
        sb.append(str);
        String sb2 = sb.toString();
        if (this.f16063e) {
            str2 = "anchor";
        } else {
            str2 = "audience";
        }
        C4480af.m14978a(1, 301, sb2, str2, "normal", C4610cy.m15304j_().toString(), this.f16059a.mo12482b());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1) {
            this.f16059a.mo12509m();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13844a(Runnable runnable, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f16073o = runnable;
        this.f16059a.mo12507l();
    }
}
