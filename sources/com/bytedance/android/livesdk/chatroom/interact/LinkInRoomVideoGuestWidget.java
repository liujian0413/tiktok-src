package com.bytedance.android.livesdk.chatroom.interact;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import com.C1642a;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.base.model.p121b.C2336a;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.p128d.C2432b.C2433a;
import com.bytedance.android.live.broadcast.api.p128d.C2434c;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3384d;
import com.bytedance.android.live.livepullstream.api.C3449a;
import com.bytedance.android.live.livepullstream.api.C3450b;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C3912d;
import com.bytedance.android.livesdk.app.dataholder.C3913e;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.event.C4449s;
import com.bytedance.android.livesdk.chatroom.event.C4450t;
import com.bytedance.android.livesdk.chatroom.interact.p213a.C4465a;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4669ew;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4669ew.C4674b;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4736h;
import com.bytedance.android.livesdk.chatroom.interact.p217e.C4764a;
import com.bytedance.android.livesdk.chatroom.interact.p218f.C4788g;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4853d;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4854e;
import com.bytedance.android.livesdk.chatroom.p220ui.C5182ah;
import com.bytedance.android.livesdk.chatroom.p220ui.C5213bg;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5596au;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.log.p405b.C8435g;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.schema.interfaces.C8931a;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.user.LiveInteractFunction;
import com.bytedance.android.livesdk.utils.C9036ae;
import com.bytedance.android.livesdk.utils.C9048ao;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdk.verify.C9101d;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.avframework.livestreamv2.core.Client;
import com.p280ss.avframework.livestreamv2.core.Client.Listener;
import com.p280ss.avframework.livestreamv2.core.Guest;
import com.p280ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p280ss.avframework.livestreamv2.interact.model.Config;
import com.p280ss.avframework.livestreamv2.interact.model.Config.Character;
import com.p280ss.avframework.livestreamv2.interact.model.Config.FrameFormat;
import com.p280ss.avframework.livestreamv2.interact.model.Config.InteractMode;
import com.p280ss.avframework.livestreamv2.interact.model.Config.Type;
import com.p280ss.avframework.livestreamv2.interact.model.Config.VideoQuality;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;

public class LinkInRoomVideoGuestWidget extends LiveWidget implements C4674b, C6310a {

    /* renamed from: a */
    public C47562b f12987a = new C47562b();

    /* renamed from: b */
    private C5213bg f12988b;

    /* renamed from: c */
    private Dialog f12989c;

    /* renamed from: d */
    private C4669ew f12990d;

    /* renamed from: e */
    private C4764a f12991e;

    /* renamed from: f */
    private C4788g f12992f;

    /* renamed from: g */
    private Guest f12993g;

    /* renamed from: h */
    private C6309f f12994h;

    /* renamed from: i */
    private C4486al f12995i;

    /* renamed from: j */
    private Runnable f12996j;

    /* renamed from: k */
    private FrameLayout f12997k;

    /* renamed from: l */
    private C3449a f12998l;

    /* renamed from: m */
    private Room f12999m;

    /* renamed from: n */
    private long f13000n;

    /* renamed from: o */
    private Listener f13001o = new Listener() {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo12218a(int i, long j, Exception exc, Integer num) throws Exception {
            switch (i) {
                case 12:
                    LinkInRoomVideoGuestWidget.this.mo12194a((int) j, exc.getMessage());
                    return;
                case 13:
                    LinkInRoomVideoGuestWidget.this.mo12204b((int) j, exc.getMessage());
                    return;
                case 14:
                    LinkInRoomVideoGuestWidget.this.mo12210c(exc.getMessage());
                    break;
            }
        }

        public final void onError(Client client, int i, long j, Exception exc) {
            C47562b bVar = LinkInRoomVideoGuestWidget.this.f12987a;
            C7492s a = C7492s.m23301b(Integer.valueOf(1)).mo19294a(C47549a.m148327a());
            C4844x xVar = new C4844x(this, i, j, exc);
            bVar.mo119661a(a.mo19280a((C7326g<? super T>) xVar, C4845y.f13831a));
        }

        public final void onInfo(Client client, int i, long j, Object... objArr) {
            C47562b bVar = LinkInRoomVideoGuestWidget.this.f12987a;
            C7492s a = C7492s.m23301b(Integer.valueOf(1)).mo19294a(C47549a.m148327a());
            C4838v vVar = new C4838v(this, i, j, objArr);
            bVar.mo119661a(a.mo19280a((C7326g<? super T>) vVar, C4843w.f13826a));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo12219a(int i, long j, Object[] objArr, Integer num) throws Exception {
            switch (i) {
                case 1:
                    LinkInRoomVideoGuestWidget.this.mo12203b((int) j);
                    return;
                case 4:
                    LinkInRoomVideoGuestWidget.this.mo12216i();
                    return;
                case 5:
                    LinkInRoomVideoGuestWidget.this.mo12217j();
                    return;
                case 6:
                    LinkInRoomVideoGuestWidget.this.mo12205b(objArr[0]);
                    return;
                case 8:
                    LinkInRoomVideoGuestWidget.this.mo12192a((int) j);
                    return;
                case 9:
                    LinkInRoomVideoGuestWidget.this.mo12200a(objArr[0], objArr[1]);
                    break;
                case 11:
                    LinkInRoomVideoGuestWidget.this.mo12193a((int) j, objArr[0]);
                    return;
            }
        }
    };

    /* renamed from: l */
    private static String m14907l() {
        return "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast.musical.ly%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
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
        return R.layout.axa;
    }

    /* renamed from: a */
    public final boolean mo12201a(Runnable runnable, boolean z) {
        if (2 != ((Integer) C3913e.m13800a().f11699b).intValue()) {
            return false;
        }
        new C9249a(getContext()).mo22718b((int) R.string.ewi).mo22722b(0, (int) R.string.f96, (OnClickListener) new C4821p(this, runnable)).mo22722b(1, (int) R.string.ecm, C4822q.f13738a).mo22729d();
        return true;
    }

    /* renamed from: a */
    public final void mo12199a(List<C4853d> list, String str) {
        if (list == null || list.isEmpty()) {
            C9049ap.m27022a((int) R.string.eo8);
        } else {
            m14903a(true, list, str);
        }
    }

    /* renamed from: a */
    public final void mo12198a(List<C4854e> list) {
        if (isViewValid() && this.f12988b == null) {
            this.f12988b = new C5213bg(this.context, this.f12990d.f13356b, list, this.f12990d);
            this.f12988b.setOnDismissListener(new C4836t(this));
            this.f12988b.show();
            C9036ae.m26994a(this.f12990d.f13356b, "show_connection_management", "guest_connection", false);
        }
    }

    /* renamed from: a */
    public final void mo12200a(String[] strArr, boolean[] zArr) {
        int length = strArr.length;
        String valueOf = String.valueOf(C3912d.m13795a().f11713h);
        int i = 0;
        while (i < length) {
            if (!TextUtils.equals(strArr[i], valueOf) || !zArr[i]) {
                i++;
            } else {
                this.f12995i.mo9798c();
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo12202b() {
        if (isViewValid()) {
            C9049ap.m27022a((int) R.string.eun);
        }
    }

    /* renamed from: d */
    public final void mo12212d() {
        if (this.f12993g != null) {
            this.f12993g.stop();
            this.f12993g.dispose();
        } else {
            this.f12990d.mo12601i();
        }
        if (this.f12995i != null) {
            this.f12995i.mo9799d();
        }
    }

    /* renamed from: f */
    public final void mo12213f() {
        new C9249a(this.context).mo22718b((int) R.string.cvq).mo22722b(0, (int) R.string.f96, C4837u.f13784a).mo22720b().show();
    }

    /* renamed from: h */
    public final void mo12215h() {
        this.f12992f.mo12731b(true);
        if (this.f12996j != null) {
            this.f12996j.run();
            this.f12996j = null;
        }
    }

    /* renamed from: g */
    public final void mo12214g() {
        new C9249a(this.context, 0).mo22718b((int) R.string.ev_).mo22722b(0, (int) R.string.f96, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).mo22720b().show();
    }

    public void onPause() {
        if (this.f12990d.f13355a) {
            this.f12993g.switchAudio(false);
            if (this.f12995i != null) {
                this.f12995i.mo9796a();
            }
            this.f12991e.mo12703e();
            this.f12994h.sendEmptyMessageDelayed(140000, 180000);
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f12994h.removeCallbacksAndMessages(null);
        if (this.f12990d.f13355a) {
            if (this.f12995i != null) {
                this.f12995i.mo9797b();
            }
            this.f12991e.mo12705f();
            this.f12993g.switchAudio(true);
            this.dataCenter.lambda$put$1$DataCenter("cmd_interact_state_change", new C4450t(3));
        }
    }

    /* renamed from: k */
    private void m14906k() {
        new C9249a(getContext()).mo22716a(true).mo22727c((CharSequence) C1642a.m8034a(getContext().getResources().getString(R.string.cx1), new Object[]{LiveSettingKeys.LIVE_MT_LOW_AGE_USER_LIMIT.mo10240a()})).mo22722b(0, (int) R.string.ehy, (OnClickListener) new C4823r(this)).mo22722b(1, (int) R.string.ehz, C4835s.f13782a).mo22729d();
    }

    public void onCreate() {
        super.onCreate();
        this.f12998l = ((C3450b) C3596c.m13172a(C3450b.class)).getLivePlayerLog();
        this.f12999m = (Room) this.dataCenter.get("data_room");
        this.f12991e = new C4764a(this.f12999m, this.dataCenter);
        this.f12990d = new C4669ew(this.f12999m, this.dataCenter);
        this.f12994h = new C6309f(this);
        this.f12991e.mo12685a();
        C4788g gVar = new C4788g(this.f12990d.f13356b, false, this.f12997k, (FrameLayout) this.contentView, this.f12991e);
        this.f12992f = gVar;
        this.f12992f.f13574e = this.dataCenter;
        this.f12992f.mo12728a(true);
        this.f12990d.mo9142a((C4674b) this);
        C3913e.m13800a().mo11452a(Integer.valueOf(0));
    }

    public void onDestroy() {
        C3912d.m13795a().mo11452a(Boolean.valueOf(false));
        this.f12990d.mo8963a();
        this.f12992f.mo12732c();
        this.f12991e.mo12692b();
        if (this.f12995i != null) {
            this.f12995i.mo9799d();
        }
        if (this.f12993g != null) {
            this.f12993g.stop();
            this.f12993g.dispose();
        }
        if (this.f12989c != null && this.f12989c.isShowing()) {
            C4846z.m15868a(this.f12989c);
        }
        if (this.f12987a != null && !this.f12987a.isDisposed()) {
            this.f12987a.dispose();
        }
        super.onDestroy();
    }

    /* renamed from: a */
    public final void mo12191a() {
        if (!TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
            TTLiveSDKContext.getHostService().mo22367h().mo22167a(this.context, C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.ev9)).mo22192c("interact").mo22188a(0).mo22190a()).mo19293a((C7497x<? super T, ? extends R>) getAutoUnbindTransformer()).mo19189a((C7498y<? super T>) new C8986g<Object>());
        } else if (!TTLiveSDKContext.getHostService().mo22367h().mo22178a(LiveInteractFunction.INTERACT)) {
            if (this.f12991e.mo12699d() > 0 || ((Integer) C3913e.m13800a().f11699b).intValue() != 0) {
                this.f12990d.mo12588b();
            } else {
                this.f12990d.mo12593d();
            }
        }
    }

    /* renamed from: c */
    public final void mo12208c() {
        VideoQuality videoQuality;
        if (C3913e.m13800a().f11727m == 2) {
            this.f12995i = ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).createLinkInRoomView(null, this.context, 1);
        } else {
            C2433a aVar = new C2433a();
            aVar.f7965a = C3913e.m13800a().f11721g;
            aVar.f7966b = C3913e.m13800a().f11722h;
            aVar.f7967c = C3913e.m13800a().f11720f ^ true ? 1 : 0;
            this.f12995i = ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).createLinkVideoView(this.context, aVar);
        }
        C3913e.m13800a().f11719e = SystemClock.currentThreadTimeMillis();
        FrameFormat frameFormat = FrameFormat.TEXTURE_2D;
        int i = 0;
        if (C3913e.m13800a().f11727m == 2) {
            ((C2434c) this.f12995i).setOutputFormat(3553);
            i = C34943c.f91128x;
        }
        if (this.f12999m.getStreamUrl().f25613l != null) {
            this.f12999m.getStreamUrl();
        }
        InteractConfig interactConfig = new InteractConfig();
        C4465a.m14942a(interactConfig);
        Config logReportInterval = interactConfig.setContext(this.context).setUserId(C4669ew.m15439o()).setInteractId(C4669ew.m15440p()).setLogReportInterval(5);
        if (this.f12990d.mo12607r()) {
            videoQuality = VideoQuality.GUEST_HIGH;
        } else {
            videoQuality = VideoQuality.GUEST_NORMAL;
        }
        logReportInterval.setVideoQuality(videoQuality).setVendor(C4669ew.m15441q()).setProjectKey(C3358ac.m12515a((int) R.string.fdg)).setInteractMode(InteractMode.NORMAL).setChannelName(this.f12990d.mo12606n()).setCharacter(Character.GUEST).setFrameFormat(frameFormat).setVolumeCallbackInterval(i).setType(Type.VIDEO);
        this.f12993g = (Guest) ((C4487am) this.f12995i).mo9795a(interactConfig, Boolean.valueOf(true));
        this.f12993g.setListener(this.f13001o);
        this.f12993g.start();
    }

    /* renamed from: j */
    public final void mo12217j() {
        long j;
        this.f12993g = null;
        this.f12990d.mo12601i();
        this.dataCenter.lambda$put$1$DataCenter("data_interact_debug_info", new C4449s(false, null));
        C4480af.m14978a(0, 0, null, "audience", "normal", C4669ew.m15441q().toString(), this.f12990d.mo12606n());
        if (this.f13000n > 0) {
            j = SystemClock.elapsedRealtime() - this.f13000n;
        } else {
            j = 0;
        }
        this.f13000n = 0;
        C4811i.m15839a(C3913e.m13800a().f11727m, false, j);
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(this.f12999m.getId()));
        hashMap.put("anchor_id", String.valueOf(this.f12999m.getOwnerUserId()));
        hashMap.put("right_user_id", String.valueOf(C4669ew.m15439o()));
        hashMap.put("channel_id", String.valueOf(this.f12999m.getId()));
        hashMap.put("connection_type", "audience");
        hashMap.put("connection_time", String.valueOf((System.currentTimeMillis() - LinkCrossRoomDataHolder.m13782a().f11685w) / 1000));
        C8443c.m25663a().mo21606a("connection_over", hashMap, new Object[0]);
    }

    /* renamed from: i */
    public final void mo12216i() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.f12988b != null && this.f12988b.isShowing()) {
            this.f12988b.dismiss();
        }
        this.f13000n = SystemClock.elapsedRealtime();
        LinkCrossRoomDataHolder.m13782a().f11685w = System.currentTimeMillis();
        C4480af.m14982a(C4669ew.m15441q().toString(), 0, 0);
        this.f12990d.mo12599g();
        this.f12992f.mo12731b(false);
        C4480af.m14977a(0, 0, null, "audience", "normal", C4669ew.m15441q().toString());
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
            String str5 = "connection_type";
            if (C3913e.m13800a().f11727m == 2) {
                str4 = "voice_type";
            } else {
                str4 = "live_type";
            }
            jSONObject.put(str5, str4);
            C8448g.m25682a(this.context);
            this.f12990d.f13356b.getOwner().getId();
            this.f12990d.f13356b.getId();
        } catch (JSONException unused) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(this.f12990d.f13356b.getId()));
        hashMap.put("channel_id", String.valueOf(this.f12999m.getId()));
        hashMap.put("connection_type", "audience");
        String str6 = "money";
        if (a.f11724j) {
            str2 = String.valueOf(a.f11725k);
        } else {
            str2 = "0";
        }
        hashMap.put(str6, str2);
        String str7 = "time";
        if (a.f11724j) {
            str3 = String.valueOf(C9048ao.m27014a(a.f11726l));
        } else {
            str3 = "1440";
        }
        hashMap.put(str7, str3);
        hashMap.put("anchor_id", String.valueOf(this.f12990d.f13356b.getOwnerUserId()));
        C8443c.m25663a().mo21606a("guest_connection_success", hashMap, new C8438j().mo21599b("live_function").mo21598a("live_detail"));
        this.f12992f.mo12725a(C3912d.m13795a().f11713h, (SurfaceView) this.f12995i);
        this.dataCenter.lambda$put$1$DataCenter("data_interact_debug_info", new C4449s(true, C4669ew.m15441q().name()));
        C8435g gVar = new C8435g();
        gVar.mo21594b(this.f12999m.getOwner().getId()).mo21596c(C4669ew.m15439o());
        C8443c.m25663a().mo21606a("connection_success", hashMap, gVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12195a(DialogInterface dialogInterface) {
        this.f12988b = null;
    }

    /* renamed from: c */
    public final void mo12211c(Throwable th) {
        C9076n.m27095a(this.context, th);
    }

    /* renamed from: a */
    public final void mo12192a(int i) {
        this.f12991e.mo12693b(i);
        this.f12992f.mo12181a(0, i);
    }

    public LinkInRoomVideoGuestWidget(FrameLayout frameLayout) {
        this.f12997k = frameLayout;
    }

    /* renamed from: b */
    public final void mo12203b(int i) {
        C4480af.m14980a((long) i, "normal", C4669ew.m15441q().toString());
    }

    public void handleMsg(Message message) {
        if (isViewValid() && 140000 == message.what && this.f12990d != null) {
            this.f12990d.mo12603k();
        }
    }

    /* renamed from: a */
    private void m14902a(ApiServerException apiServerException) {
        C2336a aVar;
        try {
            aVar = (C2336a) C2317a.m9932a().mo15974a(apiServerException.getExtra(), C2336a.class);
        } catch (Exception e) {
            C3166a.m11963b("LinkInRoomVideoGuestWid", (Throwable) e);
            C3166a.m11961b("LinkInRoomVideoGuestWid", apiServerException.getExtra());
            aVar = null;
        }
        C9101d.m27157a(C3384d.m12589a(this.context), 111, aVar, null);
    }

    /* renamed from: c */
    public final void mo12210c(String str) {
        C9049ap.m27022a((int) R.string.exg);
        this.f12990d.mo12605m();
        C4480af.m14981a(this.f12990d.f13356b.getId(), this.f12990d.mo12606n(), C4669ew.m15441q().toString(), 401, str);
    }

    /* renamed from: b */
    public final void mo12205b(String str) {
        long id = this.f12990d.f13356b.getId();
        String n = this.f12990d.mo12606n();
        String vendor = C4669ew.m15441q().toString();
        StringBuilder sb = new StringBuilder("onWarn:");
        sb.append(str);
        C4480af.m14981a(id, n, vendor, 402, sb.toString());
    }

    /* renamed from: b */
    public final void mo12206b(Throwable th) {
        if (th instanceof ApiServerException) {
            ApiServerException apiServerException = (ApiServerException) th;
            int errorCode = apiServerException.getErrorCode();
            if (errorCode == 20048) {
                m14906k();
                return;
            } else if (30010 == errorCode) {
                m14902a(apiServerException);
                return;
            } else if (31002 == errorCode) {
                C9036ae.m26993a(this.f12990d.f13356b);
            }
        }
        C9076n.m27095a(this.context, th);
    }

    /* renamed from: a */
    public final void mo12197a(String str) {
        if (this.f12992f != null) {
            this.f12992f.mo12727a(str);
        }
    }

    /* renamed from: b */
    public final void mo12207b(List<C4853d> list, String str) {
        m14903a(false, list, str);
    }

    /* renamed from: b */
    public final void mo12204b(int i, String str) {
        this.f12990d.mo12602j();
        StringBuilder sb = new StringBuilder("code: ");
        sb.append(i);
        sb.append(", desc: ");
        sb.append(str);
        C4480af.m14978a(1, 301, sb.toString(), "audience", "normal", C4669ew.m15441q().toString(), this.f12990d.mo12606n());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo12209c(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        String str = (String) LiveSettingKeys.LIVE_MT_LOW_AGE_REPORT_URL.mo10240a();
        if (TextUtils.isEmpty(str)) {
            str = m14907l();
        }
        ((C8931a) C3596c.m13172a(C8931a.class)).handle(this.context, str);
        if (C3596c.m13172a(C3592a.class) != null && ((C3592a) C3596c.m13172a(C3592a.class)).user() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("user_id", String.valueOf(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b()));
            C8443c.m25663a().mo21606a("livesdk_user_click_contact_us", hashMap, Room.class, new C8438j());
        }
    }

    /* renamed from: a */
    public final void mo12193a(int i, SurfaceView surfaceView) {
        long j = C3913e.m13800a().f11719e;
        if (i == C3912d.m13795a().f11709d && j > 0) {
            C4480af.m14979a(SystemClock.currentThreadTimeMillis() - j, 1, C4669ew.m15441q().toString());
            C3913e.m13800a().f11719e = 0;
        }
        this.f12992f.mo12725a(i, surfaceView);
    }

    /* renamed from: a */
    public final void mo12194a(int i, String str) {
        C4480af.m14982a(C4669ew.m15441q().toString(), 1, i);
        this.f12990d.mo12600h();
        C9049ap.m27022a((int) R.string.exe);
        StringBuilder sb = new StringBuilder("code: ");
        sb.append(i);
        sb.append(", desc: ");
        sb.append(str);
        C4480af.m14977a(1, 107, sb.toString(), "audience", "normal", C4669ew.m15441q().toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12196a(Runnable runnable, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f12996j = runnable;
        this.f12990d.mo12603k();
    }

    /* renamed from: a */
    private void m14903a(boolean z, List<C4853d> list, String str) {
        if (this.f12989c == null || !this.f12989c.isShowing()) {
            this.f12989c = new C5182ah((Activity) this.context, new C4736h(this.f12990d.f13356b, z, list, str), this.dataCenter);
            this.f12989c.show();
        }
    }
}
