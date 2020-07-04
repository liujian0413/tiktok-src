package com.bytedance.android.livesdk.chatroom.interact.p216d;

import android.arch.lifecycle.C0053p;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C3908a;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.PkState;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.PkStealTowerState;
import com.bytedance.android.livesdk.chatroom.api.LinkPKApi;
import com.bytedance.android.livesdk.chatroom.interact.data.C4759a;
import com.bytedance.android.livesdk.chatroom.model.C4901d;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4851c;
import com.bytedance.android.livesdk.chatroom.p209bl.C4270b;
import com.bytedance.android.livesdk.chatroom.presenter.C5017ci;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.message.model.C8504ba;
import com.bytedance.android.livesdk.message.model.C8508bd;
import com.bytedance.android.livesdk.message.model.C8545cg;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.p426b.C9057b;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.C9358b.C9359a;
import com.bytedance.android.livesdkapi.depend.model.live.C9380q;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7497x;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.gh */
public final class C4715gh extends C5017ci<C4716a> implements C0053p<KVData>, OnMessageListener {

    /* renamed from: a */
    private static final int[][] f13424a = {new int[]{120, 10}, new int[]{C34943c.f91128x, 25}, new int[]{600, 50}, new int[]{900, 75}};

    /* renamed from: b */
    private boolean f13425b;

    /* renamed from: c */
    private Room f13426c;

    /* renamed from: d */
    private int f13427d = Integer.MAX_VALUE;

    /* renamed from: e */
    private int f13428e = Integer.MAX_VALUE;

    /* renamed from: f */
    private boolean f13429f;

    /* renamed from: i */
    private int f13430i;

    /* renamed from: j */
    private LinkCrossRoomDataHolder f13431j;

    /* renamed from: k */
    private C7321c f13432k;

    /* renamed from: l */
    private C7321c f13433l;

    /* renamed from: m */
    private C7321c f13434m;

    /* renamed from: n */
    private C7321c f13435n;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.gh$a */
    public interface C4716a extends C5595at {
        /* renamed from: a */
        void mo12648a(int i);

        /* renamed from: a */
        void mo12649a(int i, int i2);

        /* renamed from: b */
        void mo12650b(int i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12645b(Throwable th) {
        mo13031m(th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12643a(Throwable th) throws Exception {
        mo13031m(th);
        m15554d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12641a(Long l) throws Exception {
        this.f13429f = false;
        m15549b();
    }

    /* renamed from: a */
    public final void mo12642a(String str) {
        C8545cg a = C4270b.m14422a(this.f13426c.getId(), null, "", 3, str, "#FF8533", this.f13425b ? "cmd_pk_mvp_show_list" : "5", "");
        a.f23534l = R.drawable.c9i;
        if (this.f14276h != null) {
            this.f14276h.insertMessage(a, true);
        }
    }

    /* renamed from: i */
    private void m15558i() {
        if (mo9140c() != null) {
            this.f13431j.lambda$put$1$DataCenter("data_pk_steal_tower_score", Integer.valueOf(m15556g()));
            m15555e();
        }
    }

    /* renamed from: j */
    private void m15559j() {
        if (mo9140c() != null) {
            this.f13431j.lambda$put$1$DataCenter("data_pk_steal_tower_score", Integer.valueOf(m15556g()));
            m15555e();
        }
    }

    /* renamed from: k */
    private void m15560k() {
        int[][] iArr;
        for (int[] iArr2 : f13424a) {
            if (iArr2[0] == this.f13431j.f11672j) {
                this.f13428e = iArr2[1];
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo8963a() {
        super.mo8963a();
        m15557h();
        this.f13431j.removeObserver(this);
    }

    /* renamed from: e */
    private boolean m15555e() {
        if (m15556g() >= this.f13431j.f11663E.f11694e - this.f13431j.f11663E.f11693d) {
            m15549b();
        }
        if (m15556g() >= this.f13431j.f11663E.f11694e - this.f13431j.f11663E.f11693d) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private int m15556g() {
        int intValue = ((Integer) this.f13431j.get("data_pk_anchor_score", Integer.valueOf(0))).intValue();
        int intValue2 = ((Integer) this.f13431j.get("data_pk_guest_score", Integer.valueOf(0))).intValue();
        if (this.f13431j.f11663E.f11691b) {
            return (intValue - intValue2) - this.f13431j.f11663E.f11693d;
        }
        return (intValue2 - intValue) - this.f13431j.f11663E.f11693d;
    }

    /* renamed from: h */
    private void m15557h() {
        if (this.f13432k != null) {
            this.f13432k.dispose();
        }
        if (this.f13433l != null) {
            this.f13433l.dispose();
        }
        if (this.f13434m != null) {
            this.f13434m.dispose();
        }
        if (this.f13435n != null) {
            this.f13435n.dispose();
        }
    }

    /* renamed from: b */
    private void m15549b() {
        if (mo9140c() != null && !this.f13429f) {
            this.f13429f = true;
            if (this.f13434m != null) {
                this.f13434m.dispose();
                this.f13434m = null;
            }
            ((C3245ad) ((LinkPKApi) C9178j.m27302j().mo22373b().mo10440a(LinkPKApi.class)).finishMode(1, this.f13431j.f11665c).mo19297a((C7494t<T, ? extends R>) mo13033u())).mo10183a(new C4731gw(this), new C4719gk(this));
        }
    }

    /* renamed from: d */
    private void m15554d() {
        if (mo9140c() != null) {
            if (this.f13430i <= 5) {
                if (this.f13435n != null) {
                    this.f13435n.dispose();
                    this.f13435n = null;
                }
                this.f13435n = ((C3245ad) C7492s.m23295b(1, TimeUnit.SECONDS).mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) mo13032t())).mo10183a(new C4720gl(this), new C4721gm(this));
                this.f13430i++;
                return;
            }
            this.f13429f = false;
            m15544a((C4759a) null);
            if (this.f13435n != null) {
                this.f13435n.dispose();
            }
        }
    }

    /* renamed from: a */
    private void m15545a(C9359a aVar) {
        this.f13427d = aVar.f25642i;
    }

    public C4715gh(DataCenter dataCenter) {
        this.f13425b = ((Boolean) dataCenter.get("data_is_anchor")).booleanValue();
        this.f13426c = (Room) dataCenter.get("data_room");
    }

    /* renamed from: b */
    private void m15551b(C3479d<C9380q> dVar) {
        C9380q qVar = (C9380q) dVar.data;
        if (qVar.f25765e != null && qVar.f25765e.f25632a == 1 && qVar.f25765e.f25633b != null && qVar.f25765e.f25633b.f25634a > 0 && !qVar.f25765e.f25633b.f25640g) {
            m15543a(dVar.extra.now);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12639a(C3479d dVar) throws Exception {
        if (dVar.data == null || ((C4759a) dVar.data).f13495a == null || ((C4759a) dVar.data).f13495a.f25633b == null || !((C4759a) dVar.data).f13495a.f25633b.f25640g) {
            m15554d();
            return;
        }
        this.f13429f = false;
        m15544a((C4759a) dVar.data);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo12646c(Long l) throws Exception {
        if (mo9140c() != null) {
            if (l.longValue() <= 0) {
                this.f13433l.dispose();
                this.f13433l = null;
                return;
            }
            ((C4716a) mo9140c()).mo12649a(l.intValue() * 50, 5000);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo12647d(Long l) throws Exception {
        if (mo9140c() != null) {
            ((C4716a) mo9140c()).mo12648a(l.intValue());
            if (l.longValue() <= 0) {
                m15553c(this.f13431j.f11663E.f11690a);
                this.f13432k.dispose();
                this.f13432k = null;
            }
        }
    }

    /* renamed from: a */
    private boolean m15547a(int i) {
        if (((PkState) this.f13431j.get("data_pk_state")) != PkState.PK || i <= this.f13431j.f11663E.f11692c + 5 + 5) {
            return false;
        }
        ((C3245ad) ((LinkPKApi) C9178j.m27302j().mo22373b().mo10440a(LinkPKApi.class)).startMode(1, this.f13431j.f11665c).mo19297a((C7494t<T, ? extends R>) mo13033u())).mo10183a(C4722gn.f13441a, new C4723go(this));
        return true;
    }

    /* renamed from: a */
    private void m15543a(long j) {
        if (mo9140c() != null) {
            if (this.f14276h != null) {
                this.f14276h.removeMessageListener(MessageType.LINK_MIC.getIntType(), this);
            }
            this.f13427d += this.f13428e + this.f13431j.f11663E.f11692c + 5;
            if (this.f13427d + this.f13431j.f11663E.f11692c + 5 >= this.f13431j.f11672j || this.f13431j.f11663E.f11696g >= 3) {
                this.f13427d = Integer.MAX_VALUE;
            }
            this.f13431j.f11663E.f11697h = false;
            this.f13431j.lambda$put$1$DataCenter("data_pk_battle_mode", Integer.valueOf(1));
            m15550b(j);
            if (this.f13425b) {
                C8443c.m25663a().mo21607a("start_backdoor", new C8438j().mo21598a("live_detail").mo21599b("live_function"), LinkCrossRoomDataHolder.m13782a().mo11449b(), Room.class);
            }
        }
    }

    /* renamed from: b */
    private void m15550b(long j) {
        if (mo9140c() != null) {
            long j2 = this.f13431j.f11663E.f11690a - j;
            int i = ((int) j2) / 1000;
            int i2 = (int) (j2 % 1000);
            this.f13431j.lambda$put$1$DataCenter("data_pk_steal_tower_state", PkStealTowerState.READY);
            int i3 = i + 1;
            ((C4716a) mo9140c()).mo12648a(i3);
            ((C4716a) mo9140c()).mo12649a(1, 1);
            if (j2 <= 0) {
                if (this.f13432k != null) {
                    this.f13432k.dispose();
                    this.f13432k = null;
                }
                if (this.f13433l != null) {
                    this.f13433l.dispose();
                    this.f13433l = null;
                }
                m15553c(j);
                return;
            }
            if (this.f13432k != null) {
                this.f13432k.dispose();
                this.f13432k = null;
            }
            if (this.f13433l != null) {
                this.f13433l.dispose();
                this.f13433l = null;
            }
            this.f13432k = ((C3245ad) C9057b.m27050a(0, 1, TimeUnit.SECONDS).mo19305c((long) i3).mo19320e((long) i2, TimeUnit.MILLISECONDS).mo19317d((C7327h<? super T, ? extends R>) new C4717gi<Object,Object>(i)).mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) mo13032t())).mo10183a(new C4718gj(this), new C4724gp(this));
            int i4 = ((i * 1000) / 50) + 1;
            this.f13433l = C9057b.m27050a(0, 50, TimeUnit.MILLISECONDS).mo19305c((long) i4).mo19293a((C7497x<? super T, ? extends R>) ((C4716a) mo9140c()).getAutoUnbindTransformer()).mo19317d((C7327h<? super T, ? extends R>) new C4725gq<Object,Object>(i4)).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C4726gr<Object>(this), (C7326g<? super Throwable>) new C4727gs<Object>(this));
        }
    }

    /* renamed from: c */
    private void m15553c(long j) {
        if (mo9140c() != null) {
            long j2 = (this.f13431j.f11663E.f11690a - j) + ((long) (this.f13431j.f11663E.f11692c * 1000));
            int i = ((int) j2) / 1000;
            int i2 = (int) (j2 % 1000);
            this.f13431j.lambda$put$1$DataCenter("data_pk_steal_tower_state", PkStealTowerState.IN_PROCESS);
            int i3 = i + 1;
            ((C4716a) mo9140c()).mo12650b(i3);
            if (!m15555e()) {
                this.f13431j.observeForever("data_pk_anchor_score", this, true).observeForever("data_pk_guest_score", this, true);
                if (j2 < 0) {
                    if (this.f13434m != null) {
                        this.f13434m.dispose();
                        this.f13434m = null;
                    }
                    m15549b();
                    return;
                }
                if (this.f13434m != null) {
                    this.f13434m.dispose();
                    this.f13434m = null;
                }
                this.f13434m = ((C3245ad) C9057b.m27050a(0, 1, TimeUnit.SECONDS).mo19305c((long) i3).mo19320e((long) i2, TimeUnit.MILLISECONDS).mo19317d((C7327h<? super T, ? extends R>) new C4728gt<Object,Object>(i)).mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) mo13032t())).mo10183a(new C4729gu(this), new C4730gv(this));
            }
        }
    }

    public final void onMessage(IMessage iMessage) {
        boolean z = true;
        if (iMessage instanceof C4851c) {
            C4851c cVar = (C4851c) iMessage;
            if (cVar.f13853a == 1 && cVar.f13854b != null) {
                C3908a aVar = this.f13431j.f11663E;
                if (this.f13426c.getOwner().getId() != cVar.f13854b.f13861f) {
                    z = false;
                }
                aVar.f11691b = z;
                this.f13431j.f11663E.f11694e = cVar.f13854b.f13860e;
                this.f13431j.f11663E.f11693d = cVar.f13854b.f13859d;
                this.f13431j.f11663E.f11696g = cVar.f13854b.f13865j;
                this.f13431j.f11663E.f11692c = cVar.f13854b.f13858c;
                this.f13431j.f11663E.f11690a = cVar.f13854b.f13856a;
                m15543a(cVar.timestamp);
            }
        } else if (iMessage instanceof C8504ba) {
            C8504ba baVar = (C8504ba) iMessage;
            if (!(baVar.f23300b == null || baVar.f23300b.f25632a != 1 || baVar.f23300b.f25633b == null)) {
                m15545a(baVar.f23300b.f25633b);
            }
        } else {
            if ((iMessage instanceof C8508bd) && ((C8508bd) iMessage).f23319a == 202) {
                m15547a(((Integer) this.f13431j.get("data_pk_time_left")).intValue());
            }
        }
    }

    /* renamed from: a */
    private void m15544a(C4759a aVar) {
        boolean z;
        this.f13431j.lambda$put$1$DataCenter("data_pk_steal_tower_state", PkStealTowerState.ENDED).removeObserver("data_pk_anchor_score", this).removeObserver("data_pk_guest_score", this);
        m15557h();
        if (mo9140c() == null || aVar == null || aVar.f13495a == null || aVar.f13495a.f25633b == null || aVar.f13496b == null) {
            this.f13431j.f11663E.f11695f = false;
            this.f13431j.f11663E.f11697h = true;
            this.f13431j.lambda$put$1$DataCenter("data_pk_battle_mode", Integer.valueOf(0));
            return;
        }
        C3908a aVar2 = this.f13431j.f11663E;
        if (aVar.f13495a.f25633b.f25641h != 0) {
            z = true;
        } else {
            z = false;
        }
        aVar2.f11695f = z;
        this.f13431j.lambda$put$1$DataCenter("data_pk_steal_tower_score", Integer.valueOf(m15556g())).lambda$put$1$DataCenter("data_pk_battle_mode", Integer.valueOf(0));
        if (this.f13431j.f11663E.f11695f) {
            this.f13431j.lambda$put$1$DataCenter("cmd_pk_finish", new C4901d());
        }
        if (this.f13425b && this.f13431j.f11663E.f11695f) {
            C8443c.m25663a().mo21607a("backdoor_success", new C8438j().mo21598a("live_detail").mo21599b("live_function"), LinkCrossRoomDataHolder.m13782a().mo11449b(), Room.class);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12644b(Long l) throws Exception {
        if (mo9140c() != null) {
            ((C4716a) mo9140c()).mo12650b(l.intValue());
            if (l.longValue() <= 0) {
                m15549b();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            switch (key.hashCode()) {
                case -1692693464:
                    if (key.equals("data_pk_current_room_interact_info")) {
                        c = 0;
                        break;
                    }
                    break;
                case -717118025:
                    if (key.equals("data_pk_anchor_score")) {
                        c = 1;
                        break;
                    }
                    break;
                case -471511460:
                    if (key.equals("data_pk_guest_score")) {
                        c = 2;
                        break;
                    }
                    break;
                case 208701290:
                    if (key.equals("data_pk_time_left")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1505611330:
                    if (key.equals("data_pk_state")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m15551b((C3479d) kVData.getData());
                    return;
                case 1:
                    m15558i();
                    return;
                case 2:
                    m15559j();
                    return;
                case 3:
                    if (this.f13431j.f11672j - ((Integer) kVData.getData()).intValue() == this.f13427d && m15547a(((Integer) kVData.getData()).intValue()) && this.f14276h != null) {
                        this.f14276h.addMessageListener(MessageType.LINK_MIC.getIntType(), this);
                        return;
                    }
                case 4:
                    if (kVData.getData().equals(PkState.PENAL) && this.f14276h != null) {
                        this.f14276h.removeMessageListener(MessageType.LINK_MIC.getIntType(), this);
                        break;
                    }
            }
        }
    }

    /* renamed from: a */
    public final void mo9142a(C4716a aVar) {
        super.mo9142a(aVar);
        if (this.f14276h != null) {
            this.f14276h.addMessageListener(MessageType.LINK_MIC_BATTLE.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.BATTLE_MODE.getIntType(), this);
        }
        this.f13431j = LinkCrossRoomDataHolder.m13782a();
        this.f13431j.lambda$put$1$DataCenter("data_pk_steal_tower_state", PkStealTowerState.DISABLED);
        if (this.f13431j != LinkCrossRoomDataHolder.f11658a) {
            this.f13431j.observeForever("data_pk_current_room_interact_info", this).observeForever("data_pk_state", this);
        }
        if (this.f13425b) {
            this.f13431j.observeForever("data_pk_time_left", this);
        }
        m15560k();
    }
}
