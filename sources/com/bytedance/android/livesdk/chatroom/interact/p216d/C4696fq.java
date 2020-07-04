package com.bytedance.android.livesdk.chatroom.interact.p216d;

import android.arch.lifecycle.C0053p;
import android.os.SystemClock;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.PkResult;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.PkState;
import com.bytedance.android.livesdk.chatroom.api.LinkPKApi;
import com.bytedance.android.livesdk.chatroom.event.C4448r;
import com.bytedance.android.livesdk.chatroom.interact.C4484aj;
import com.bytedance.android.livesdk.chatroom.interact.C4485ak;
import com.bytedance.android.livesdk.chatroom.presenter.C5017ci;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8435g;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.message.model.C8504ba;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.p426b.C9057b;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.C9360c;
import com.bytedance.android.livesdkapi.depend.model.live.C9380q;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7494t;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.fq */
public final class C4696fq extends C5017ci<C4697a> implements C0053p<KVData>, OnMessageListener {

    /* renamed from: a */
    private DataCenter f13393a;

    /* renamed from: b */
    private Room f13394b = ((Room) this.f13393a.get("data_room"));

    /* renamed from: c */
    private boolean f13395c = ((Boolean) this.f13393a.get("data_is_anchor")).booleanValue();

    /* renamed from: d */
    private LinkCrossRoomDataHolder f13396d = LinkCrossRoomDataHolder.m13782a();

    /* renamed from: e */
    private boolean f13397e;

    /* renamed from: f */
    private boolean f13398f;

    /* renamed from: i */
    private C7321c f13399i;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.fq$a */
    public interface C4697a extends C5595at {
        /* renamed from: a */
        void mo12634a();

        /* renamed from: a */
        void mo12635a(String str);

        /* renamed from: a */
        void mo12636a(boolean z);

        /* renamed from: b */
        void mo12637b();

        /* renamed from: c */
        void mo12638c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo12631c(Throwable th) {
        mo13031m(th);
    }

    /* renamed from: a */
    public final void mo9142a(C4697a aVar) {
        super.mo9142a(aVar);
        if (this.f14276h != null) {
            this.f14276h.addMessageListener(MessageType.LINK_MIC.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.LINK_MIC_BATTLE.getIntType(), this);
        }
        this.f13396d.lambda$put$1$DataCenter("data_pk_anchor_score", Integer.valueOf(0)).lambda$put$1$DataCenter("data_pk_guest_score", Integer.valueOf(0)).observeForever("cmd_pk_finish", this);
        if (!this.f13395c || this.f13396d.f11671i) {
            if (!this.f13395c && this.f13396d.f11665c > 0 && this.f13396d.f11672j > 0) {
                this.f13396d.lambda$put$1$DataCenter("cmd_log_link", "Entered_Pk_Halfway");
                m15514b(false);
            }
            return;
        }
        mo12633e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12619a(C3479d dVar) throws Exception {
        this.f13396d.lambda$put$1$DataCenter("cmd_log_link", "REJECT_ANOTHER_GAME_SUCCEED");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12622a(Throwable th) throws Exception {
        mo13031m(th);
        C4484aj.m14993a(th);
    }

    /* renamed from: a */
    public final void mo12623a(boolean z) {
        if (mo9140c() != null) {
            C8435g c = new C8435g().mo21597c("initiative");
            if (this.f13394b.getId() == this.f13396d.f11665c) {
                c.mo21594b(this.f13394b.getOwner().getId());
                c.mo21596c(this.f13396d.f11667e);
            } else {
                c.mo21594b(this.f13396d.f11667e);
                c.mo21596c(this.f13394b.getOwner().getId());
            }
            if (this.f13395c && this.f13396d.get("data_pk_state") == PkState.PK) {
                if (LinkCrossRoomDataHolder.m13782a().f11672j > 0 && LinkCrossRoomDataHolder.m13782a().f11680r == 0) {
                    c.mo21591a(LinkCrossRoomDataHolder.m13782a().f11669g);
                }
                C8443c a = C8443c.m25663a();
                String str = "livesdk_pk_end";
                Object[] objArr = new Object[3];
                objArr[0] = c.mo21597c(z ? "disconnect" : "time_out").mo21593a(z ? String.valueOf((System.currentTimeMillis() - this.f13396d.f11686x) / 1000) : "120");
                objArr[1] = this.f13396d.mo11449b();
                objArr[2] = Room.class;
                a.mo21607a(str, objArr);
            }
            ((C3245ad) ((LinkPKApi) C9178j.m27302j().mo22373b().mo10440a(LinkPKApi.class)).finish(this.f13396d.f11665c, this.f13396d.f11680r, z ? 1 : 0, this.f13396d.f11681s).mo19297a((C7494t<T, ? extends R>) mo13033u())).mo10183a(new C4714gg(this, SystemClock.uptimeMillis(), z), new C4700ft(this, z));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12630b(boolean z, Throwable th) throws Exception {
        mo13031m(th);
        C4484aj.m14996b(th);
        if (!z) {
            m15514b(true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12624a(boolean z, Throwable th) throws Exception {
        mo13031m(th);
        if (z) {
            if (PkState.PENAL.compareTo((PkState) this.f13396d.get("data_pk_state")) > 0) {
                m15513b((long) (this.f13396d.f11682t * 1000));
            }
        }
        this.f13396d.lambda$put$1$DataCenter("cmd_stop_interact", Boolean.valueOf(true));
        C4484aj.m14998c(th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12621a(Long l) throws Exception {
        if (mo9140c() != null) {
            this.f13396d.lambda$put$1$DataCenter("data_pk_time_left", Integer.valueOf(l.intValue()));
            if (l.longValue() <= 0) {
                if (this.f13395c) {
                    C8435g gVar = new C8435g();
                    if (this.f13394b.getId() == this.f13396d.f11665c) {
                        gVar.mo21594b(this.f13394b.getOwner().getId());
                        gVar.mo21596c(this.f13396d.f11667e);
                    } else {
                        gVar.mo21594b(this.f13396d.f11667e);
                        gVar.mo21596c(this.f13394b.getOwner().getId());
                    }
                    if (LinkCrossRoomDataHolder.m13782a().f11680r == 0) {
                        gVar.mo21591a(LinkCrossRoomDataHolder.m13782a().f11669g);
                    }
                    C8443c.m25663a().mo21607a("punish_end", gVar.mo21597c("time_out").mo21593a(String.valueOf((System.currentTimeMillis() - LinkCrossRoomDataHolder.m13782a().f11688z) / 1000)), LinkCrossRoomDataHolder.m13782a().mo11449b(), Room.class);
                }
                this.f13396d.lambda$put$1$DataCenter("data_pk_state", PkState.FINISHED);
            }
        }
    }

    /* renamed from: g */
    private void m15516g() {
        if (this.f13399i != null) {
            this.f13399i.dispose();
            this.f13399i = null;
        }
        if (this.f13395c) {
            mo12623a(false);
        } else {
            m15514b(true);
        }
    }

    /* renamed from: a */
    public final void mo8963a() {
        if (this.f14276h != null) {
            this.f14276h.removeMessageListener(this);
        }
        if (this.f13399i != null) {
            this.f13399i.dispose();
            this.f13399i = null;
        }
        this.f13396d.removeObserver(this);
        super.mo8963a();
    }

    /* renamed from: d */
    public final void mo12632d() {
        if (mo9140c() != null) {
            ((C3245ad) ((LinkPKApi) C9178j.m27302j().mo22373b().mo10440a(LinkPKApi.class)).battleReject(this.f13396d.f11665c).mo19297a((C7494t<T, ? extends R>) mo13033u())).mo10183a(new C4710gc(this), new C4711gd(this));
        }
    }

    /* renamed from: e */
    public final void mo12633e() {
        if (mo9140c() != null) {
            ((C3245ad) ((LinkPKApi) C9178j.m27302j().mo22373b().mo10440a(LinkPKApi.class)).openBattle(this.f13396d.f11665c, this.f13396d.f11672j, this.f13396d.f11680r, this.f13396d.f11673k).mo19297a((C7494t<T, ? extends R>) mo13033u())).mo10183a(new C4712ge(this, SystemClock.uptimeMillis()), new C4713gf(this));
        }
    }

    /* renamed from: b */
    public final void mo12625b() {
        if (mo9140c() != null) {
            PkState pkState = (PkState) LinkCrossRoomDataHolder.m13782a().get("data_pk_state");
            if (!this.f13397e && pkState == PkState.PENAL) {
                this.f13396d.f11684v = true;
                this.f13396d.f11680r = 0;
                this.f13397e = true;
                this.f13398f = true;
                ((C3245ad) ((LinkPKApi) C9178j.m27302j().mo22373b().mo10440a(LinkPKApi.class)).battleInvite(this.f13396d.f11665c).mo19297a((C7494t<T, ? extends R>) mo13033u())).mo10183a(new C4708ga(this), new C4709gb(this));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12627b(C3479d dVar) throws Exception {
        m15515d(null);
        this.f13397e = false;
        this.f13396d.lambda$put$1$DataCenter("cmd_log_link", "INVITE_ANOTHER_GAME_SUCCEED");
    }

    public C4696fq(DataCenter dataCenter) {
        this.f13393a = dataCenter;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            if (key.hashCode() == -227699054 && key.equals("cmd_pk_finish")) {
                c = 0;
            }
            if (c == 0) {
                m15516g();
            }
        }
    }

    /* renamed from: b */
    private void m15514b(boolean z) {
        if (mo9140c() != null) {
            ((C3245ad) ((LinkPKApi) C9178j.m27302j().mo22373b().mo10440a(LinkPKApi.class)).battleStats(this.f13396d.f11665c, this.f13394b.getOwner().getId()).mo19297a((C7494t<T, ? extends R>) mo13033u())).mo10183a(new C4701fu(this, SystemClock.uptimeMillis(), z), new C4702fv(this, z));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMessage(com.p280ss.ugc.live.sdk.message.data.IMessage r6) {
        /*
            r5 = this;
            com.bytedance.ies.a.a r0 = r5.mo9140c()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r0 = r6 instanceof com.bytedance.android.livesdk.message.model.C8508bd
            if (r0 == 0) goto L_0x005b
            com.bytedance.android.livesdk.message.model.bd r6 = (com.bytedance.android.livesdk.message.model.C8508bd) r6
            long r0 = r6.f23327i
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x002a
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r0 = r5.f13396d
            long r1 = r6.f23327i
            r0.f11665c = r1
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r5.f13393a
            java.lang.String r1 = "data_interact_debug_info"
            com.bytedance.android.livesdk.chatroom.event.s r2 = new com.bytedance.android.livesdk.chatroom.event.s
            r3 = 1
            java.lang.String r4 = ""
            r2.<init>(r3, r4)
            r0.lambda$put$1$DataCenter(r1, r2)
        L_0x002a:
            int r0 = r6.f23319a
            switch(r0) {
                case 202: goto L_0x0054;
                case 203: goto L_0x003a;
                case 204: goto L_0x0030;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x005a
        L_0x0030:
            com.bytedance.ies.a.a r6 = r5.mo9140c()
            com.bytedance.android.livesdk.chatroom.interact.d.fq$a r6 = (com.bytedance.android.livesdk.chatroom.interact.p216d.C4696fq.C4697a) r6
            r6.mo12637b()
            goto L_0x005a
        L_0x003a:
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r6 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.m13782a()
            java.lang.String r0 = "data_pk_state"
            java.lang.Object r6 = r6.get(r0)
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$PkState r6 = (com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.PkState) r6
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$PkState r0 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.PkState.PENAL
            if (r6 != r0) goto L_0x005a
            com.bytedance.ies.a.a r6 = r5.mo9140c()
            com.bytedance.android.livesdk.chatroom.interact.d.fq$a r6 = (com.bytedance.android.livesdk.chatroom.interact.p216d.C4696fq.C4697a) r6
            r6.mo12634a()
            goto L_0x0064
        L_0x0054:
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.c> r6 = r6.f23336r
            r5.m15511a(r6)
            goto L_0x0064
        L_0x005a:
            return
        L_0x005b:
            boolean r0 = r6 instanceof com.bytedance.android.livesdk.message.model.C8504ba
            if (r0 == 0) goto L_0x0064
            com.bytedance.android.livesdk.message.model.ba r6 = (com.bytedance.android.livesdk.message.model.C8504ba) r6
            r5.m15509a(r6)
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.interact.p216d.C4696fq.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    /* renamed from: a */
    private void m15508a(long j) {
        C4485ak.m15001a();
        if (this.f13396d.f11672j > 0 && this.f13396d.f11674l > 0 && mo9140c() != null) {
            this.f13396d.lambda$put$1$DataCenter("data_pk_state", PkState.PK);
            this.f13396d.lambda$put$1$DataCenter("data_pk_result", PkResult.UNFINISHED);
            long j2 = (this.f13396d.f11674l - j) + ((long) (this.f13396d.f11672j * 1000));
            int i = (int) j2;
            int i2 = i / 1000;
            int i3 = i % 1000;
            StringBuilder sb = new StringBuilder("startTimeDown :");
            sb.append(j2);
            this.f13396d.lambda$put$1$DataCenter("cmd_log_link", sb.toString());
            if (j2 < 0) {
                if (this.f13399i != null) {
                    this.f13399i.dispose();
                    this.f13399i = null;
                }
                if (((long) (this.f13396d.f11682t * 1000)) + j2 > 0) {
                    m15513b(((long) (this.f13396d.f11682t * 1000)) + j2);
                } else {
                    this.f13396d.lambda$put$1$DataCenter("data_pk_state", PkState.FINISHED);
                }
            } else {
                if (this.f13399i != null) {
                    this.f13399i.dispose();
                    this.f13399i = null;
                }
                ((C4697a) mo9140c()).mo12636a(this.f13395c);
                int i4 = i2 + 1;
                this.f13396d.lambda$put$1$DataCenter("data_pk_time_left", Integer.valueOf(i4));
                this.f13399i = C9057b.m27050a(0, 1, TimeUnit.SECONDS).mo19305c((long) i4).mo19320e((long) i3, TimeUnit.MILLISECONDS).mo19317d((C7327h<? super T, ? extends R>) new C4698fr<Object,Object>(i2)).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C4699fs<Object>(this), (C7326g<? super Throwable>) new C4706fz<Object>(this));
            }
        }
    }

    /* renamed from: b */
    private void m15513b(long j) {
        if (mo9140c() != null) {
            this.f13396d.f11688z = System.currentTimeMillis();
            int intValue = ((Integer) this.f13396d.get("data_pk_anchor_score")).intValue();
            int intValue2 = ((Integer) this.f13396d.get("data_pk_guest_score")).intValue();
            if (intValue > intValue2) {
                this.f13396d.lambda$put$1$DataCenter("data_pk_result", PkResult.LEFT_WON);
            } else if (intValue < intValue2) {
                this.f13396d.lambda$put$1$DataCenter("data_pk_result", PkResult.RIGHT_WON);
            } else {
                this.f13396d.lambda$put$1$DataCenter("data_pk_result", PkResult.EVEN);
            }
            this.f13396d.lambda$put$1$DataCenter("data_pk_state", PkState.PENAL);
            if (j <= 0) {
                this.f13396d.lambda$put$1$DataCenter("data_pk_state", PkState.FINISHED);
            }
            int i = (int) (j / 1000);
            int i2 = (int) (j % 1000);
            if (this.f13399i != null) {
                this.f13399i.dispose();
                this.f13399i = null;
            }
            this.f13399i = C9057b.m27050a(0, 1, TimeUnit.SECONDS).mo19305c((long) (i + 1)).mo19320e((long) i2, TimeUnit.MILLISECONDS).mo19317d((C7327h<? super T, ? extends R>) new C4703fw<Object,Object>(i)).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C4704fx<Object>(this), (C7326g<? super Throwable>) new C4705fy<Object>(this));
        }
    }

    /* renamed from: d */
    private void m15515d(Throwable th) {
        HashMap hashMap = new HashMap();
        C8435g gVar = new C8435g();
        if (th == null) {
            hashMap.put("invitee_status", "0");
        } else if (!(th instanceof ApiServerException)) {
            hashMap.put("invitee_status", "2");
        } else if (((ApiServerException) th).getErrorCode() == 31002) {
            hashMap.put("invitee_status", "1");
        } else {
            hashMap.put("invitee_status", "2");
        }
        C8443c.m25663a().mo21606a("connection_invite", hashMap, new C8438j().mo21599b("live").mo21603f("other").mo21598a("live_detail"), gVar.mo21594b(this.f13394b.getOwner().getId()).mo21596c(this.f13396d.f11667e).mo21595b((String) C8946b.f24396aU.mo22117a()).mo21590a(((Integer) C8946b.f24390aO.mo22117a()).intValue()).mo21591a(this.f13396d.f11669g), this.f13396d.mo11449b(), Room.class);
    }

    /* renamed from: a */
    private <T extends C9360c> void m15511a(List<T> list) {
        if (list != null && mo9140c() != null) {
            int i = 0;
            int i2 = 0;
            for (T t : list) {
                if (t.f25644a == this.f13394b.getOwner().getId()) {
                    i = t.f25645b;
                } else if (t.f25644a == this.f13396d.f11667e) {
                    i2 = t.f25645b;
                }
            }
            if (!((Integer) this.f13396d.get("data_pk_anchor_score", Integer.valueOf(0))).equals(Integer.valueOf(i))) {
                this.f13396d.lambda$put$1$DataCenter("data_pk_anchor_score", Integer.valueOf(i));
            }
            if (!((Integer) this.f13396d.get("data_pk_guest_score", Integer.valueOf(0))).equals(Integer.valueOf(i2))) {
                this.f13396d.lambda$put$1$DataCenter("data_pk_guest_score", Integer.valueOf(i2));
            }
        }
    }

    /* renamed from: a */
    private void m15509a(C8504ba baVar) {
        long j;
        String str;
        long j2;
        long j3;
        if (mo9140c() != null) {
            PkState pkState = (PkState) LinkCrossRoomDataHolder.m13782a().get("data_pk_state");
            this.f13396d.f11674l = baVar.f23299a.f25652d;
            this.f13396d.f11672j = baVar.f23299a.f25650b;
            this.f13396d.f11673k = baVar.f23299a.f25651c;
            this.f13396d.f11666d = baVar.f23299a.f25653e;
            this.f13396d.f11680r = (int) baVar.f23299a.f25654f;
            this.f13396d.lambda$put$1$DataCenter("cmd_log_link", "another game");
            this.f13396d.lambda$put$1$DataCenter("data_pk_anchor_score", Integer.valueOf(0));
            this.f13396d.lambda$put$1$DataCenter("data_pk_guest_score", Integer.valueOf(0));
            if (this.f13395c || pkState == PkState.PENAL) {
                ((C4697a) mo9140c()).mo12635a(baVar.f23299a.f25651c);
            }
            if (!this.f13395c && this.f13396d.f11672j != 0) {
                ((C4697a) mo9140c()).mo12638c();
            }
            this.f13393a.lambda$put$1$DataCenter("cmd_pk_state_change", new C4448r(5));
            m15508a(baVar.timestamp);
            if (this.f13395c) {
                HashMap hashMap = new HashMap();
                String str2 = "is_oncemore";
                if (pkState == PkState.PENAL) {
                    str = "oncemore";
                } else {
                    str = "not_oncemore";
                }
                hashMap.put(str2, str);
                C8443c a = C8443c.m25663a();
                String str3 = "pk_start";
                Object[] objArr = new Object[4];
                objArr[0] = new C8438j().mo21599b("live_take").mo21598a("live_detail");
                C8435g gVar = new C8435g();
                if (this.f13398f) {
                    j2 = this.f13394b.getOwner().getId();
                } else {
                    j2 = this.f13396d.f11667e;
                }
                C8435g c = gVar.mo21596c(j2);
                if (this.f13398f) {
                    j3 = this.f13396d.f11667e;
                } else {
                    j3 = this.f13394b.getOwner().getId();
                }
                objArr[1] = c.mo21594b(j3);
                objArr[2] = LinkCrossRoomDataHolder.m13782a().mo11449b();
                objArr[3] = Room.class;
                a.mo21606a(str3, hashMap, objArr);
                this.f13398f = false;
            }
            if (!this.f13395c && pkState == PkState.PENAL) {
                C8435g gVar2 = new C8435g();
                if (this.f13396d.f11680r == 0) {
                    gVar2.mo21591a(this.f13396d.f11669g);
                }
                C8443c.m25663a().mo21607a("pk_transform", new C8438j().mo21599b("live_function").mo21598a("live_detail"), gVar2, LinkCrossRoomDataHolder.m13782a().mo11449b(), Room.class);
            }
            if (this.f13395c && pkState == PkState.PENAL) {
                C8435g gVar3 = new C8435g();
                if (this.f13396d.f11680r == 0) {
                    gVar3.mo21591a(this.f13396d.f11669g);
                }
                this.f13396d.f11684v = true;
                C8443c a2 = C8443c.m25663a();
                String str4 = "connection_success";
                Object[] objArr2 = new Object[4];
                objArr2[0] = new C8438j().mo21598a("live_detail").mo21603f("other").mo21599b("live");
                if (this.f13398f) {
                    j = this.f13394b.getOwner().getId();
                } else {
                    j = this.f13396d.f11667e;
                }
                objArr2[1] = gVar3.mo21596c(j);
                objArr2[2] = LinkCrossRoomDataHolder.m13782a().mo11449b();
                objArr2[3] = Room.class;
                a2.mo21607a(str4, objArr2);
                if (this.f13394b.getId() == this.f13396d.f11665c) {
                    gVar3.mo21594b(this.f13394b.getOwner().getId());
                    gVar3.mo21596c(this.f13396d.f11667e);
                } else {
                    gVar3.mo21594b(this.f13396d.f11667e);
                    gVar3.mo21596c(this.f13394b.getOwner().getId());
                }
                C8443c.m25663a().mo21607a("punish_end", gVar3.mo21597c("disconnect").mo21593a(String.valueOf((System.currentTimeMillis() - LinkCrossRoomDataHolder.m13782a().f11688z) / 1000)), LinkCrossRoomDataHolder.m13782a().mo11449b(), Room.class);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12628b(Long l) throws Exception {
        if (mo9140c() != null) {
            this.f13396d.lambda$put$1$DataCenter("data_pk_time_left", Integer.valueOf(l.intValue()));
            if (l.longValue() <= 0) {
                m15516g();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12629b(Throwable th) throws Exception {
        m15515d(th);
        mo13031m(th);
        this.f13397e = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12617a(long j, C3479d dVar) throws Exception {
        C4484aj.m14986a(SystemClock.uptimeMillis() - j);
        this.f13396d.lambda$put$1$DataCenter("cmd_log_link", "OPEN_BATTLE_SUCCEED");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12626b(long j, boolean z, C3479d dVar) throws Exception {
        C4484aj.m14995b(SystemClock.uptimeMillis() - j);
        if (!z) {
            m15514b(true);
        } else {
            this.f13396d.lambda$put$1$DataCenter("data_pk_result", PkResult.RIGHT_WON).lambda$put$1$DataCenter("cmd_stop_interact", Boolean.valueOf(false));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12618a(long j, boolean z, C3479d dVar) throws Exception {
        C4484aj.m14997c(SystemClock.uptimeMillis() - j);
        StringBuilder sb = new StringBuilder("battle_states");
        sb.append(C2317a.m9932a().mo15979b((Object) dVar));
        this.f13396d.lambda$put$1$DataCenter("cmd_log_link", sb.toString());
        if (dVar.statusCode == 0) {
            this.f13396d.mo11448a((C9380q) dVar.data, this.f13394b).lambda$put$1$DataCenter("data_pk_current_room_interact_info", dVar);
            C9380q qVar = (C9380q) dVar.data;
            m15511a(qVar.f25764d);
            if (qVar.f25765e == null || qVar.f25765e.f25633b == null || !qVar.f25765e.f25633b.f25640g || qVar.f25765e.f25633b.f25641h == 0) {
                PkState pkState = (PkState) this.f13396d.get("data_pk_state");
                if (!z) {
                    m15508a(dVar.extra.now);
                } else if (PkState.PENAL.compareTo(pkState) > 0) {
                    m15513b((long) (this.f13396d.f11682t * 1000));
                }
                return;
            }
            m15513b((long) ((int) (((long) (this.f13396d.f11682t * 1000)) - (dVar.extra.now - qVar.f25765e.f25633b.f25635b))));
        } else if (z) {
            m15513b((long) (this.f13396d.f11682t * 1000));
        } else {
            m15508a(dVar.extra.now);
        }
    }
}
