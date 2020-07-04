package com.bytedance.android.livesdk.chatroom.interact;

import android.arch.lifecycle.C0053p;
import android.content.DialogInterface;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.livepullstream.api.C3449a;
import com.bytedance.android.live.livepullstream.api.C3450b;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.app.dataholder.C3912d;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.event.C4449s;
import com.bytedance.android.livesdk.chatroom.interact.p213a.C4465a;
import com.bytedance.android.livesdk.chatroom.interact.p215c.C4502a;
import com.bytedance.android.livesdk.chatroom.interact.p215c.C4502a.C4503a;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4651eg;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4651eg.C4653b;
import com.bytedance.android.livesdk.chatroom.interact.p217e.C4764a;
import com.bytedance.android.livesdk.chatroom.interact.p217e.C4764a.C4765a;
import com.bytedance.android.livesdk.chatroom.interact.p218f.C4788g;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4854e;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4855f;
import com.bytedance.android.livesdk.chatroom.p220ui.AbsInteractionFragment.C5066c;
import com.bytedance.android.livesdk.chatroom.p220ui.C5207ba;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5596au;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8435g;
import com.bytedance.android.livesdk.utils.C9036ae;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p280ss.avframework.livestreamv2.core.Anchor;
import com.p280ss.avframework.livestreamv2.core.Client;
import com.p280ss.avframework.livestreamv2.core.Client.Listener;
import com.p280ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p280ss.avframework.livestreamv2.interact.model.Config.Character;
import com.p280ss.avframework.livestreamv2.interact.model.Config.FrameFormat;
import com.p280ss.avframework.livestreamv2.interact.model.Config.InteractMode;
import com.p280ss.avframework.livestreamv2.interact.model.Config.Type;
import com.p280ss.avframework.livestreamv2.interact.model.Config.VideoQuality;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;

public class LinkInRoomVideoAnchorWidget extends LiveWidget implements C0053p<KVData>, C4503a, C4653b {

    /* renamed from: a */
    public Anchor f12971a;

    /* renamed from: b */
    public C4764a f12972b;

    /* renamed from: c */
    public C47562b f12973c = new C47562b();

    /* renamed from: d */
    public C5066c f12974d;

    /* renamed from: e */
    private C4651eg f12975e;

    /* renamed from: f */
    private C4788g f12976f;

    /* renamed from: g */
    private C5207ba f12977g;

    /* renamed from: h */
    private C4466aa f12978h;

    /* renamed from: i */
    private C4487am f12979i;

    /* renamed from: j */
    private C3449a f12980j;

    /* renamed from: k */
    private long f12981k;

    /* renamed from: l */
    private C4765a f12982l = new C4765a() {
        /* renamed from: a */
        public final void mo12181a(long j, int i) {
        }

        /* renamed from: a */
        public final void mo12183a(long j, long j2) {
        }

        /* renamed from: a */
        public final void mo12184a(List<C4854e> list) {
        }

        /* renamed from: a */
        public final void mo12185a(List<C4855f> list, long j) {
        }

        /* renamed from: b */
        public final void mo12186b(List<C4854e> list) {
        }

        /* renamed from: a */
        public final void mo12182a(long j, int i, boolean z) {
            if (LinkInRoomVideoAnchorWidget.this.f12971a != null) {
                LinkInRoomVideoAnchorWidget.this.f12971a.invalidateSei();
            }
        }
    };

    /* renamed from: m */
    private Listener f12983m = new Listener() {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo12187a(int i, long j, Exception exc, Integer num) throws Exception {
            switch (i) {
                case 12:
                    LinkInRoomVideoAnchorWidget.this.mo12164a((int) j, exc.getMessage());
                    return;
                case 13:
                    LinkInRoomVideoAnchorWidget.this.mo12172b((int) j, exc.getMessage());
                    return;
                case 14:
                    LinkInRoomVideoAnchorWidget.this.mo12173b(exc.getMessage());
                    break;
            }
        }

        public final void onError(Client client, int i, long j, Exception exc) {
            C47562b bVar = LinkInRoomVideoAnchorWidget.this.f12973c;
            C7492s a = C7492s.m23301b(Integer.valueOf(1)).mo19294a(C47549a.m148327a());
            C4819n nVar = new C4819n(this, i, j, exc);
            bVar.mo119661a(a.mo19280a((C7326g<? super T>) nVar, C4820o.f13735a));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo12188a(int i, long j, Object[] objArr, Integer num) throws Exception {
            switch (i) {
                case 1:
                    LinkInRoomVideoAnchorWidget.this.mo12178e((int) j);
                    return;
                case 2:
                    LinkInRoomVideoAnchorWidget.this.mo12165a(j, objArr[0].longValue());
                    return;
                case 4:
                    LinkInRoomVideoAnchorWidget.this.mo12179f();
                    return;
                case 5:
                    LinkInRoomVideoAnchorWidget.this.mo12180g();
                    return;
                case 6:
                    LinkInRoomVideoAnchorWidget.this.mo12167a(objArr[0]);
                    return;
                case 7:
                    return;
                case 8:
                    LinkInRoomVideoAnchorWidget.this.mo12177d((int) j);
                    return;
                case 11:
                    LinkInRoomVideoAnchorWidget.this.mo12163a((int) j, objArr[0]);
                    break;
            }
        }

        public final void onInfo(Client client, int i, long j, Object... objArr) {
            if (i == 7) {
                LinkInRoomVideoAnchorWidget.this.f12972b.mo12686a((int) j);
            } else if (i == 8) {
                LinkInRoomVideoAnchorWidget.this.f12972b.mo12693b((int) j);
            }
            C47562b bVar = LinkInRoomVideoAnchorWidget.this.f12973c;
            C7492s a = C7492s.m23301b(Integer.valueOf(1)).mo19294a(C47549a.m148327a());
            C4814l lVar = new C4814l(this, i, j, objArr);
            bVar.mo119661a(a.mo19280a((C7326g<? super T>) lVar, C4815m.f13717a));
        }
    };

    /* renamed from: n */
    private Room f12984n;

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

    /* renamed from: d */
    public final void mo12176d() {
        this.f12975e.mo12552b();
    }

    /* renamed from: i */
    private void m14869i() {
        if (this.f12978h != null) {
            this.f12978h.mo12224b();
            this.f12978h = null;
        }
    }

    /* renamed from: a */
    public final void mo12162a() {
        if (isViewValid()) {
            C9049ap.m27022a((int) R.string.eun);
        }
    }

    /* renamed from: b */
    public final void mo12171b() {
        this.f12971a.start();
    }

    /* renamed from: c */
    public final void mo12175c() {
        if (this.f12971a != null) {
            this.f12971a.stop();
            this.f12971a.dispose();
            return;
        }
        this.f12975e.mo12567h();
    }

    public void onPause() {
        if (this.f12975e.f13323a) {
            this.f12971a.switchAudio(false);
            this.f12972b.mo12703e();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        if (this.f12975e.f13323a) {
            this.f12971a.switchAudio(true);
            this.f12972b.mo12705f();
        }
    }

    /* renamed from: h */
    private void m14868h() {
        VideoQuality videoQuality;
        String o = this.f12975e.mo12572o();
        long id = this.f12975e.f13324b.getId();
        String lowerCase = C4651eg.m15393n().name().toLowerCase();
        if (this.f12975e.mo12571m()) {
            videoQuality = VideoQuality.ANCHOR_HIGH;
        } else {
            videoQuality = VideoQuality.ANCHOR_NORMAL;
        }
        C4466aa aaVar = new C4466aa(lowerCase, o, id, videoQuality.getWidth(), videoQuality.getHeight(), videoQuality.getBitrate(), videoQuality.getFps());
        this.f12978h = aaVar;
        this.f12978h.mo12223a();
    }

    public void onDestroy() {
        this.f12975e.mo8963a();
        this.f12976f.mo12732c();
        this.f12972b.mo12695b(this.f12982l);
        this.f12972b.mo12692b();
        if (this.f12971a != null) {
            this.f12971a.stop();
            this.f12971a.dispose();
        }
        m14869i();
        if (this.f12977g != null && this.f12977g.isShowing()) {
            this.f12977g.mo13472f();
            this.f12977g.dismiss();
        }
        if (this.f12973c != null && !this.f12973c.isDisposed()) {
            this.f12973c.dispose();
        }
        super.onDestroy();
    }

    /* renamed from: f */
    public final void mo12179f() {
        if (isViewValid()) {
            C4480af.m14982a(C4651eg.m15393n().toString(), 0, 0);
            this.f12975e.mo12570k_();
            this.dataCenter.lambda$put$1$DataCenter("data_interact_debug_info", new C4449s(true, C4651eg.m15393n().name()));
            m14868h();
            C8435g gVar = new C8435g();
            gVar.mo21594b(this.f12984n.getOwner().getId()).mo21596c(this.f12981k);
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", String.valueOf(this.f12975e.f13324b.getId()));
            hashMap.put("anchor_id", String.valueOf(this.f12975e.f13324b.getOwner().getId()));
            hashMap.put("channel_id", String.valueOf(this.f12984n.getId()));
            hashMap.put("connection_type", "audience");
            LinkCrossRoomDataHolder.m13782a().f11685w = System.currentTimeMillis();
            C8443c.m25663a().mo21606a("connection_success", hashMap, gVar);
        }
    }

    /* renamed from: g */
    public final void mo12180g() {
        if (isViewValid()) {
            this.f12975e.mo12567h();
            this.dataCenter.lambda$put$1$DataCenter("data_interact_debug_info", new C4449s(false, null));
        }
        m14869i();
        C4480af.m14978a(0, 0, null, "anchor", "normal", C4651eg.m15393n().toString(), this.f12975e.mo12573p());
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(this.f12984n.getId()));
        hashMap.put("anchor_id", String.valueOf(this.f12984n.getOwnerUserId()));
        hashMap.put("right_user_id", String.valueOf(this.f12981k));
        hashMap.put("channel_id", String.valueOf(this.f12984n.getId()));
        hashMap.put("connection_type", "audience");
        hashMap.put("connection_time", String.valueOf((System.currentTimeMillis() - LinkCrossRoomDataHolder.m13782a().f11685w) / 1000));
        C8443c.m25663a().mo21606a("connection_over", hashMap, new Object[0]);
    }

    public void onCreate() {
        VideoQuality videoQuality;
        super.onCreate();
        this.f12980j = ((C3450b) C3596c.m13172a(C3450b.class)).getLivePlayerLog();
        this.f12984n = (Room) this.dataCenter.get("data_room");
        this.dataCenter.observe("cmd_force_close_linkin", this);
        this.f12975e = new C4651eg(this.f12984n, this.dataCenter);
        this.f12972b = new C4764a(this.f12984n, this.dataCenter);
        this.f12972b.mo12689a(this.f12982l);
        this.f12972b.mo12685a();
        if (this.f12984n.getStreamUrl().f25613l != null) {
            this.f12984n.getStreamUrl();
        }
        if (this.f12975e.mo12571m()) {
            videoQuality = VideoQuality.ANCHOR_HIGH;
        } else {
            videoQuality = VideoQuality.ANCHOR_NORMAL;
        }
        InteractConfig mixStreamRtmpUrl = new InteractConfig().setStreamMixer(new C4502a(videoQuality, this)).setBackgroundColor("#161823").setMixStreamRtmpUrl(this.f12975e.mo12572o());
        C4465a.m14942a(mixStreamRtmpUrl);
        mixStreamRtmpUrl.setContext(this.context).setUserId(C4651eg.m15391k()).setInteractId(C4651eg.m15392l()).setVideoQuality(videoQuality).setVendor(C4651eg.m15393n()).setLogReportInterval(5).setProjectKey(C3358ac.m12515a((int) R.string.fdg)).setInteractMode(InteractMode.NORMAL).setChannelName(this.f12975e.mo12573p()).setCharacter(Character.ANCHOR).setFrameFormat(FrameFormat.TEXTURE_2D).setSeiVersion(1).setType(Type.VIDEO);
        this.f12971a = (Anchor) this.f12979i.mo9795a(mixStreamRtmpUrl, Boolean.valueOf(false));
        this.f12971a.setListener(this.f12983m);
        C4788g gVar = new C4788g(this.f12975e.f13324b, true, null, (FrameLayout) this.containerView, this.f12972b);
        this.f12976f = gVar;
        this.f12976f.f13574e = this.dataCenter;
        this.f12976f.mo12728a(false);
        this.f12975e.mo9142a((C4653b) this);
        C9049ap.m27023a((int) R.string.cvl, 1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12166a(DialogInterface dialogInterface) {
        this.f12977g = null;
    }

    /* renamed from: b */
    public final int mo12170b(int i) {
        return this.f12972b.mo12700d(i);
    }

    /* renamed from: c */
    public final long mo12174c(int i) {
        return this.f12972b.mo12702e(i);
    }

    /* renamed from: e */
    public final void mo12178e(int i) {
        C4480af.m14980a((long) i, "normal", C4651eg.m15393n().toString());
    }

    public LinkInRoomVideoAnchorWidget(C4487am amVar) {
        this.f12979i = amVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData != null) {
            String key = kVData.getKey();
            char c = 65535;
            if (key.hashCode() == -95319361 && key.equals("cmd_force_close_linkin")) {
                c = 0;
            }
            if (c == 0 && this.f12975e != null) {
                this.f12975e.mo12561e();
            }
        }
    }

    /* renamed from: b */
    public final void mo12173b(String str) {
        C9049ap.m27022a((int) R.string.exg);
        this.f12975e.mo12569j();
        C4480af.m14981a(this.f12975e.f13324b.getId(), this.f12975e.mo12573p(), C4651eg.m15393n().toString(), 401, str);
    }

    /* renamed from: d */
    public final void mo12177d(int i) {
        this.f12972b.mo12693b(i);
        this.f12976f.mo12181a(0, i);
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(this.f12984n.getId()));
        hashMap.put("anchor_id", String.valueOf(this.f12984n.getOwnerUserId()));
        hashMap.put("right_user_id", String.valueOf(this.f12981k));
        hashMap.put("connection_type", "audience");
        hashMap.put("channel_id", String.valueOf(this.f12984n.getId()));
        hashMap.put("connection_time", String.valueOf((System.currentTimeMillis() - LinkCrossRoomDataHolder.m13782a().f11685w) / 1000));
        C8443c.m25663a().mo21606a("connection_over", hashMap, LinkCrossRoomDataHolder.m13782a().mo11449b());
    }

    /* renamed from: a */
    public final void mo12167a(String str) {
        long id = this.f12975e.f13324b.getId();
        String p = this.f12975e.mo12573p();
        String vendor = C4651eg.m15393n().toString();
        StringBuilder sb = new StringBuilder("onWarn:");
        sb.append(str);
        C4480af.m14981a(id, p, vendor, 402, sb.toString());
    }

    /* renamed from: a */
    public final void mo12168a(List<C4854e> list) {
        if (isViewValid() && this.f12977g == null) {
            Room room = this.f12975e.f13324b;
            this.f12977g = new C5207ba(this.context, room, list, this.f12975e);
            this.f12977g.setOnDismissListener(new C4813k(this));
            this.f12977g.show();
            C9036ae.m26994a(room, "show_connection_management", "anchor_connection", false);
        }
    }

    /* renamed from: a */
    public final boolean mo12169a(int i) {
        return this.f12972b.mo12698c(i);
    }

    /* renamed from: a */
    public final void mo12165a(long j, long j2) {
        if (this.f12974d != null) {
            this.f12974d.mo13174a(j, j2);
        }
    }

    /* renamed from: b */
    public final void mo12172b(int i, String str) {
        if (isViewValid()) {
            this.f12975e.mo12568i();
        }
        StringBuilder sb = new StringBuilder("code: ");
        sb.append(i);
        sb.append(", desc: ");
        sb.append(str);
        C4480af.m14978a(1, 301, sb.toString(), "anchor", "normal", C4651eg.m15393n().toString(), this.f12975e.mo12573p());
    }

    /* renamed from: a */
    public final void mo12163a(int i, SurfaceView surfaceView) {
        this.f12976f.mo12725a(i, surfaceView);
        this.f12981k = this.f12972b.mo12702e(i);
        if (this.f12981k > 0) {
            long a = C3912d.m13795a().f11715j.mo11461a(this.f12981k, 0);
            if (a > 0) {
                C4480af.m14979a(System.currentTimeMillis() - a, 0, C4651eg.m15393n().toString());
            }
            C3912d.m13795a().f11715j.mo11462a(this.f12981k);
        }
    }

    /* renamed from: a */
    public final void mo12164a(int i, String str) {
        if (isViewValid()) {
            C4480af.m14982a(C4651eg.m15393n().toString(), 1, i);
            this.f12975e.mo12565g();
            StringBuilder sb = new StringBuilder("code: ");
            sb.append(i);
            sb.append(", desc: ");
            sb.append(str);
            C4480af.m14977a(1, 107, sb.toString(), "anchor", "normal", C4651eg.m15393n().toString());
        }
    }
}
