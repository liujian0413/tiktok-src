package com.bytedance.android.livesdk.chatroom.interact;

import android.arch.lifecycle.C0053p;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.browser.jsbridge.p201c.C4052g.C4053a;
import com.bytedance.android.livesdk.browser.jsbridge.p201c.C4052g.C4054b;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4646ec;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4646ec.C4647a;
import com.bytedance.android.livesdk.chatroom.p220ui.InRoomPKAnimationView;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5596au;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5679dw;
import com.bytedance.android.livesdk.chatroom.viewmodule.LinkPkTaskWidget;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8435g;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class LinkInRoomPkWidget extends LiveWidget implements C0053p<KVData>, C4054b, C4647a {

    /* renamed from: a */
    public int f12962a;

    /* renamed from: b */
    private LinkCrossRoomDataHolder f12963b;

    /* renamed from: c */
    private InRoomPKAnimationView f12964c;

    /* renamed from: d */
    private C4646ec f12965d;

    /* renamed from: e */
    private LinkPkTaskWidget f12966e;

    /* renamed from: f */
    private boolean f12967f;

    /* renamed from: g */
    private boolean f12968g;

    /* renamed from: h */
    private Room f12969h;

    /* renamed from: i */
    private C8435g f12970i;

    /* renamed from: a */
    public final void mo9118a(Throwable th) {
        C5596au.m18013a(this, th);
    }

    /* renamed from: e */
    public final String mo9125e() {
        return C5596au.m18012a(this);
    }

    public int getLayoutId() {
        return R.layout.b04;
    }

    /* renamed from: a */
    private void m14862a() {
        this.f12964c.mo13205a();
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f12965d != null) {
            this.f12965d.mo8963a();
        }
        if (this.f12966e != null) {
            this.f12966e.mo13889b();
        }
        if (this.f12968g && this.f12962a == 3) {
            C8435g gVar = new C8435g();
            C8443c.m25663a().mo21607a("livesdk_pk_end", new C8438j().mo21598a("live_detail").mo21599b("live").mo21603f("other"), gVar.mo21597c("disconnect").mo21593a(String.valueOf((System.currentTimeMillis() - this.f12963b.f11686x) / 1000)), LinkCrossRoomDataHolder.m13782a().mo11449b(), Room.class);
            if (!(this.dataCenter == null || !(this.dataCenter.get("cmd_inroompk_state_change") instanceof C4812j) || ((C4812j) this.dataCenter.get("cmd_inroompk_state_change")).f13711a == 3)) {
                C8443c.m25663a().mo21607a("connection_over", gVar.mo21593a(String.valueOf((System.currentTimeMillis() - LinkCrossRoomDataHolder.m13782a().f11686x) / 1000)), LinkCrossRoomDataHolder.m13782a().mo11449b(), Room.class);
            }
        } else if (!this.f12968g && this.f12962a == 3) {
            C4485ak.m15002b();
        }
        this.f12963b.removeObserver(this);
        this.dataCenter.removeObserver(this);
    }

    public void onCreate() {
        super.onCreate();
        this.f12963b = LinkCrossRoomDataHolder.m13782a();
        this.f12969h = (Room) this.dataCenter.get("data_room");
        this.f12968g = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f12964c = (InRoomPKAnimationView) this.contentView.findViewById(R.id.bay);
        this.f12965d = new C4646ec();
        this.f12965d.mo9142a((C4647a) this);
        enableSubWidgetManager();
        this.f12966e = new LinkPkTaskWidget(false);
        if (((Integer) LiveConfigSettingKeys.LIVE_ENABLE_PACKUP_BANNER.mo10240a()).intValue() == 1) {
            C9097a.m27146a().mo22267a((Object) new C5679dw(this.f12966e));
        } else {
            this.subWidgetManager.load(R.id.egb, this.f12966e);
        }
        this.f12967f = true;
        this.f12962a = ((Integer) this.dataCenter.get("data_pk_chiji_stage", Integer.valueOf(0))).intValue();
        if (this.f12967f && (!this.f12968g || !((Boolean) C8946b.f24350B.mo22117a()).booleanValue())) {
            this.f12964c.mo13210a(this.f12969h.getOwner().getNickName(), this.f12969h.getOwner().getAvatarThumb());
            if (this.f12963b.f11659A != null) {
                this.f12964c.mo13211b(this.f12963b.f11659A.getNickName(), this.f12963b.f11659A.getAvatarThumb());
                m14862a();
            }
        }
        if (!this.f12968g && this.f12962a == 3) {
            C4485ak.m15001a();
        }
        this.f12970i = new C8435g();
        if (this.f12968g) {
            if (this.f12969h.getId() == this.f12963b.f11665c) {
                this.f12970i.mo21594b(this.f12969h.getOwner().getId()).mo21596c(this.f12963b.f11667e);
                return;
            }
            this.f12970i.mo21594b(this.f12963b.f11667e).mo21596c(this.f12969h.getOwner().getId());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (!(kVData == null || kVData.getData() == null || !kVData.getKey().equals("data_pk_chiji_stage"))) {
            this.f12962a = ((Integer) kVData.getData()).intValue();
            if (this.f12962a == 1 || this.f12962a == 2) {
                this.f12967f = false;
            } else if (this.f12962a == 3) {
                this.f12967f = true;
            } else {
                return;
            }
            if (this.f12967f && (!this.f12968g || !((Boolean) C8946b.f24350B.mo22117a()).booleanValue())) {
                this.f12964c.mo13210a(this.f12969h.getOwner().getNickName(), this.f12969h.getOwner().getAvatarThumb());
                if (this.f12963b.f11659A != null) {
                    this.f12964c.mo13211b(this.f12963b.f11659A.getNickName(), this.f12963b.f11659A.getAvatarThumb());
                    m14862a();
                }
            }
            if (this.f12962a == 3 && !this.f12968g) {
                C4485ak.m15001a();
            }
        }
    }

    /* renamed from: a */
    public final void mo11665a(C4053a aVar) {
        if (aVar != null && aVar.f12044a != 0) {
            if (!this.f12968g) {
                C4485ak.m15002b();
            } else if (LinkCrossRoomDataHolder.m13782a().f11680r == 2) {
                C8443c.m25663a().mo21607a("connection_over", this.f12970i.mo21593a(String.valueOf((System.currentTimeMillis() - LinkCrossRoomDataHolder.m13782a().f11686x) / 1000)), LinkCrossRoomDataHolder.m13782a().mo11449b(), Room.class);
            }
            if (aVar.f12044a == 1) {
                this.dataCenter.lambda$put$1$DataCenter("cmd_inroompk_state_change", new C4812j(2));
                if (this.f12968g) {
                    C8443c.m25663a().mo21607a("livesdk_pk_end", new C8438j().mo21598a("live_detail").mo21599b("live").mo21603f("other"), this.f12970i.mo21597c("time_out").mo21593a(String.valueOf((System.currentTimeMillis() - this.f12963b.f11686x) / 1000)), LinkCrossRoomDataHolder.m13782a().mo11449b(), Room.class);
                }
                this.f12963b.mo11450c();
                return;
            }
            if (aVar.f12044a == 2) {
                this.dataCenter.lambda$put$1$DataCenter("cmd_inroompk_state_change", new C4812j(3));
                this.f12963b.mo11450c();
            }
        }
    }
}
