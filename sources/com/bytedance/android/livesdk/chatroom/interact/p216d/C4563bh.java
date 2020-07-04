package com.bytedance.android.livesdk.chatroom.interact.p216d;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.rxutils.autodispose.C3247af;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3477b;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C3912d;
import com.bytedance.android.livesdk.app.dataholder.C3913e;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.PkState;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.api.LinkPKApi;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.event.C4447q;
import com.bytedance.android.livesdk.chatroom.event.C4449s;
import com.bytedance.android.livesdk.chatroom.interact.C4484aj;
import com.bytedance.android.livesdk.chatroom.interact.C4812j;
import com.bytedance.android.livesdk.chatroom.interact.model.ChiJiPermissionData;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4850b;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4856g;
import com.bytedance.android.livesdk.chatroom.p209bl.C4270b;
import com.bytedance.android.livesdk.chatroom.p209bl.C4275g;
import com.bytedance.android.livesdk.chatroom.presenter.C5017ci;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.log.p405b.C8435g;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.message.model.C8504ba;
import com.bytedance.android.livesdk.message.model.C8508bd;
import com.bytedance.android.livesdk.message.model.C8543ce;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.C9367j;
import com.bytedance.android.livesdkapi.depend.model.live.C9380q;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p440c.C9301a;
import com.bytedance.android.livesdkapi.depend.p440c.C9301a.C9302a;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C47555ab;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7494t;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.bh */
public final class C4563bh extends C5017ci<C4564a> implements C9302a, OnMessageListener {

    /* renamed from: a */
    private LinkCrossRoomDataHolder f13182a = LinkCrossRoomDataHolder.m13782a();

    /* renamed from: b */
    private C9301a f13183b;

    /* renamed from: c */
    private int f13184c = -1;

    /* renamed from: d */
    private Room f13185d;

    /* renamed from: e */
    private boolean f13186e;

    /* renamed from: f */
    private boolean f13187f;

    /* renamed from: i */
    private C6600e f13188i;

    /* renamed from: j */
    private LiveMode f13189j;

    /* renamed from: k */
    private C7321c f13190k;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.bh$a */
    public interface C4564a extends C5595at {
        /* renamed from: a */
        void mo12426a();

        /* renamed from: a */
        void mo12427a(int i);

        /* renamed from: a */
        void mo12428a(long j, C3479d<Room> dVar, String str, int i, RivalExtraInfo rivalExtraInfo);

        /* renamed from: a */
        void mo12429a(ChiJiPermissionData chiJiPermissionData, ApiServerException apiServerException);

        /* renamed from: a */
        void mo12430a(boolean z);

        /* renamed from: b */
        void mo12431b();

        /* renamed from: b */
        void mo12432b(Throwable th);

        /* renamed from: c */
        void mo12433c();

        /* renamed from: c */
        void mo12434c(Throwable th);

        /* renamed from: d */
        void mo12435d();

        /* renamed from: f */
        void mo12436f();

        /* renamed from: g */
        void mo12437g();

        /* renamed from: h */
        void mo12438h();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo12424h(Throwable th) {
        mo13031m(th);
    }

    /* renamed from: a */
    public final void mo9142a(C4564a aVar) {
        super.mo9142a(aVar);
        this.f13183b = new C9301a(this);
        ((C3245ad) C9097a.m27146a().mo22266a(C4447q.class).mo19297a((C7494t<T, ? extends R>) mo13032t())).mo10182a((C7326g<? super T>) new C4565bi<Object>(this));
        if (this.f14276h != null) {
            this.f14276h.addMessageListener(MessageType.LINK_MIC.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.LINK_MIC_BATTLE.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.CHIJI_NOTICE_MESSAGE.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.BEGINNER_GUIDE_MESSAGE.getIntType(), this);
        }
        C4275g.m14434a().mo11966a((Handler) this.f13183b, this.f13186e, this.f13185d.getId(), 2);
        if (this.f13186e && this.f13189j == LiveMode.VIDEO) {
            m15206e();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12408a(C8508bd bdVar, Throwable th) throws Exception {
        mo13031m(th);
        ((C3245ad) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).reply(bdVar.f23327i, this.f13185d.getId(), 6, bdVar.f23332n).mo19297a((C7494t<T, ? extends R>) mo13033u())).mo10183a(new C4584ca(bdVar), new C4585cb(this));
    }

    /* renamed from: a */
    public final void mo12403a(Message message) {
        if (mo9140c() != null && message.what == 2) {
            if (!(message.obj instanceof Room) || !Room.isValid((Room) message.obj)) {
                m15202a(this.f13185d);
            } else {
                m15202a((Room) message.obj);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12409a(Long l) throws Exception {
        m15200a(this.f13182a.f11665c);
        this.f13182a.mo11450c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12405a(C3479d dVar) throws Exception {
        this.f14275g.lambda$put$1$DataCenter("cmd_inroompk_state_change", new C4812j(2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12400a(long j, long j2, C3479d dVar) throws Exception {
        C4484aj.m14997c(SystemClock.uptimeMillis() - j);
        if (dVar != null && dVar.data != null && ((C9380q) dVar.data).f25763c != null) {
            this.f13182a.f11660B = ((C9380q) dVar.data).f25763c.f25657i;
            this.f13182a.f11681s = ((C9380q) dVar.data).f25763c.f25658j;
            Iterator it = ((C9380q) dVar.data).f25768h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                User user = (User) it.next();
                if (!TextUtils.equals(user.getIdStr(), this.f13185d.getOwner().getIdStr())) {
                    this.f13182a.f11659A = user;
                    break;
                }
            }
            ((C9380q) dVar.data).f25763c.f25649a = j2;
            if (this.f13190k != null && !this.f13190k.isDisposed()) {
                this.f13190k.dispose();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12410a(Throwable th) throws Exception {
        ((C4564a) mo9140c()).mo12430a(false);
    }

    /* renamed from: e */
    private void m15206e() {
        ((C3247af) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).checkPermissionV1(this.f13185d.getId(), 1).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(new C4576bt(this), new C4578bv(this));
    }

    /* renamed from: d */
    private void m15205d() {
        if (mo9140c() != null) {
            ((C3245ad) ((LinkPKApi) C3458e.m12798a().mo10440a(LinkPKApi.class)).openBattle(this.f13182a.f11665c, this.f13182a.f11672j, this.f13182a.f11680r, this.f13182a.f11673k).mo19297a((C7494t<T, ? extends R>) mo13033u())).mo10183a(new C4592ci(this, SystemClock.uptimeMillis()), new C4567bk(this));
        }
    }

    /* renamed from: b */
    public final void mo12411b() {
        ((C3245ad) ((LinkApi) C3458e.m12798a().mo10440a(LinkApi.class)).joinChannelV3(this.f13182a.f11665c).mo19297a((C7494t<T, ? extends R>) mo13033u())).mo10183a(new C4590cg(this), new C4591ch(this));
    }

    /* renamed from: a */
    public final void mo8963a() {
        if (this.f13186e && this.f13182a.f11667e > 0) {
            PkState pkState = (PkState) this.f13182a.get("data_pk_state");
            if (!this.f13186e || pkState != PkState.PK) {
                m15200a(this.f13182a.f11665c);
            } else {
                long j = this.f13182a.f11665c;
                C3245ad adVar = (C3245ad) ((LinkPKApi) C9178j.m27302j().mo22373b().mo10440a(LinkPKApi.class)).finish(j, this.f13182a.f11680r, 1, this.f13182a.f11681s).mo19297a((C7494t<T, ? extends R>) mo13033u());
                C4566bj bjVar = new C4566bj(this, j, SystemClock.uptimeMillis());
                adVar.mo10183a(bjVar, new C4577bu(this, j));
            }
        }
        this.f13182a.mo11450c();
        this.f13183b.removeCallbacksAndMessages(null);
        super.mo8963a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo12423g(Throwable th) throws Exception {
        mo13031m(th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo12422f(Throwable th) throws Exception {
        mo13031m(th);
        C4484aj.m14993a(th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12404a(C3477b bVar) throws Exception {
        ((C4564a) mo9140c()).mo12430a(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo12418c(Throwable th) throws Exception {
        mo13031m(th);
        C4484aj.m15000d(th);
        ((C4564a) mo9140c()).mo12434c(th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo12420d(Throwable th) throws Exception {
        mo13031m(th);
        ((C4564a) mo9140c()).mo12432b(th);
        this.f13184c = -1;
        this.f13187f = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo12421e(Throwable th) throws Exception {
        this.f13187f = false;
        mo13031m(th);
        ((C4564a) mo9140c()).mo12432b(th);
        this.f13184c = -1;
    }

    /* renamed from: a */
    private void m15200a(long j) {
        ((C3245ad) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).finishV3(j).mo19297a((C7494t<T, ? extends R>) mo13033u())).mo10183a(new C4570bn(this), new C4571bo(this));
    }

    /* renamed from: b */
    private void m15203b(long j) {
        C3245ad adVar = (C3245ad) ((LinkPKApi) C3458e.m12798a().mo10440a(LinkPKApi.class)).battleStats(j, this.f13185d.getOwner().getId()).mo19297a((C7494t<T, ? extends R>) mo13033u());
        C4574br brVar = new C4574br(this, SystemClock.uptimeMillis(), j);
        adVar.mo10183a(brVar, C4575bs.f13206a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo12417c(C3479d dVar) throws Exception {
        this.f13187f = false;
        ((C4564a) mo9140c()).mo12426a();
        C3913e.m13800a().mo11452a(Integer.valueOf(2));
        TTLiveSDKContext.getHostService().mo22367h().mo22185e().mo19137b((C47557ad<? super T>) new C8986g<Object>());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo12419d(C3479d dVar) throws Exception {
        this.f14275g.lambda$put$1$DataCenter("cmd_inroompk_state_change", new C4812j(0));
        this.f13190k = ((C3245ad) C7492s.m23295b(20, TimeUnit.SECONDS).mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) mo13032t())).mo10183a(new C4581by(this), C4582bz.f13214a);
    }

    public final void onEvent(C4447q qVar) {
        if (mo9140c() != null) {
            switch (qVar.f12903a) {
                case 1:
                    ((C4564a) mo9140c()).mo12431b();
                    return;
                case 2:
                    ((C4564a) mo9140c()).mo12435d();
                    break;
            }
        }
    }

    /* renamed from: b */
    public final void mo12412b(int i) {
        ((C3245ad) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).checkPermissionV3(this.f13185d.getId(), i).mo19297a((C7494t<T, ? extends R>) mo13033u())).mo10183a(new C4572bp(this, System.currentTimeMillis()), new C4573bq(this));
    }

    /* renamed from: a */
    private void m15202a(Room room) {
        this.f13185d = room;
        if (this.f13185d.isWithLinkMic()) {
            if (this.f13185d.getLinkMicInfo() != null) {
                LinkCrossRoomDataHolder a = LinkCrossRoomDataHolder.m13782a();
                C9380q linkMicInfo = this.f13185d.getLinkMicInfo();
                a.mo11448a(linkMicInfo, this.f13185d);
                if (!this.f13186e && linkMicInfo != null && linkMicInfo.f25763c.f25654f == 2) {
                    m15203b(linkMicInfo.f25761a);
                    return;
                }
            }
            ((C4564a) mo9140c()).mo12426a();
            return;
        }
        if (this.f13185d.getLinkMicInfo() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", this.f13185d.getIdStr());
            hashMap.put("event", "LinkControlPresenter syncRoomStats");
            hashMap.put("anchor_id", String.valueOf(this.f13185d.getOwnerUserId()));
            hashMap.put("link_mic", C2317a.m9932a().mo15979b((Object) this.f13185d.getLinkMicInfo()));
            C8444d.m25673b().mo9999a("ttlive_pk", (Map<String, ?>) hashMap);
            LinkCrossRoomDataHolder a2 = LinkCrossRoomDataHolder.m13782a();
            C9380q linkMicInfo2 = this.f13185d.getLinkMicInfo();
            a2.mo11448a(linkMicInfo2, this.f13185d);
            if (linkMicInfo2 != null) {
                C9367j jVar = linkMicInfo2.f25762b;
                if (linkMicInfo2.f25763c.f25654f == 2) {
                    if (!this.f13186e) {
                        m15203b(linkMicInfo2.f25761a);
                    }
                    return;
                } else if (a2.f11665c > 0 && jVar != null) {
                    if (jVar.f25666c == 1 && jVar.f25664a == 4) {
                        ((C4564a) mo9140c()).mo12433c();
                    }
                } else {
                    return;
                }
            }
        }
        if (this.f13186e) {
            C8946b.f24488r.mo22118a(Integer.valueOf(this.f13185d.getOwner().getLinkMicStats()));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12415b(C3479d dVar) throws Exception {
        C4850b bVar = (C4850b) dVar.data;
        C3912d a = C3912d.m13795a();
        if (TextUtils.isEmpty(bVar.f13850c) || bVar.f13851d <= 0) {
            this.f13184c = -1;
            ((C4564a) mo9140c()).mo12432b(new Exception());
            return;
        }
        a.f11709d = bVar.f13851d;
        a.mo11455a(bVar.f13849b);
        a.f11710e = bVar.f13848a;
        a.f11713h = bVar.f13851d;
        a.f11712g = bVar.f13850c;
        a.f11714i = bVar.f13852e;
        int i = 1;
        if (this.f13185d.isLiveTypeAudio()) {
            i = 8;
        }
        ((C3247af) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).turnOnV1(this.f13185d.getId(), i).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(new C4579bw(this), new C4580bx(this));
    }

    /* renamed from: a */
    public final void mo12399a(int i) {
        if (!this.f13187f) {
            int i2 = 1;
            this.f13187f = true;
            this.f13184c = 0;
            if (this.f13185d.isLiveTypeAudio()) {
                i2 = 8;
            }
            ((C3247af) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).init(this.f13185d.getId(), 6, i2).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(new C4568bl(this), new C4569bm(this));
        }
    }

    public final void onMessage(IMessage iMessage) {
        IMessage iMessage2 = iMessage;
        if (mo9140c() != null) {
            int i = 3;
            if (iMessage2 instanceof C8508bd) {
                C8508bd bdVar = (C8508bd) iMessage2;
                int i2 = bdVar.f23319a;
                if (i2 != 1) {
                    if (i2 != 4) {
                        if (i2 == 104) {
                            if (this.f13186e) {
                                if (this.f13182a.f11665c == 0) {
                                    this.f13182a.f11665c = bdVar.f23327i;
                                    ((C4564a) mo9140c()).mo12438h();
                                    this.f13182a.f11665c = 0;
                                } else {
                                    ((C4564a) mo9140c()).mo12438h();
                                }
                            }
                            if (this.f13186e && this.f13182a.f11665c != 0) {
                                ((C4564a) mo9140c()).mo12437g();
                                this.f13182a.mo11450c();
                            }
                        } else if (i2 != 106) {
                            if (i2 != 205) {
                                switch (i2) {
                                    case 100:
                                        if (bdVar.f23337s != 2 && !this.f13186e) {
                                            ((C4564a) mo9140c()).mo12433c();
                                            break;
                                        }
                                    case BaseNotice.HASHTAG /*101*/:
                                        if (this.f13186e) {
                                            if (this.f14275g == null || this.f14275g.get("data_room") == null || ((Room) this.f14275g.get("data_room")).getMosaicStatus() != 1) {
                                                if (bdVar.f23337s == 2) {
                                                    if (this.f13182a.f11667e <= 0) {
                                                        if (bdVar.f23344z != this.f13182a.f11681s) {
                                                            i = 8;
                                                        }
                                                        i = 0;
                                                    }
                                                } else if (!this.f13182a.f11664b && this.f13182a.f11670h <= 0 && this.f13182a.f11667e <= 0) {
                                                    if (bdVar.f23330l == 1 && bdVar.f23328j == 4 && (bdVar.f23329k & 6) > 0) {
                                                        if (VERSION.SDK_INT < 21) {
                                                            i = 7;
                                                        }
                                                        i = 0;
                                                    }
                                                }
                                                i = 4;
                                            } else {
                                                i = 6;
                                            }
                                            if (i <= 0) {
                                                this.f13182a.f11675m = bdVar.f23329k;
                                                this.f13182a.f11665c = bdVar.f23327i;
                                                this.f13182a.f11667e = bdVar.f23332n;
                                                this.f13182a.f11672j = bdVar.f23335q;
                                                this.f13182a.f11680r = bdVar.f23337s;
                                                this.f13182a.f11673k = bdVar.f23331m;
                                                this.f13182a.f11668f = bdVar.f23341w;
                                                this.f13182a.f11669g = (long) bdVar.f23343y;
                                                this.f13182a.f11681s = bdVar.f23344z;
                                                this.f14275g.lambda$put$1$DataCenter("data_interact_debug_info", new C4449s(true, ""));
                                                HashMap hashMap = new HashMap();
                                                hashMap.put("room_id", String.valueOf(bdVar.f23341w));
                                                ((C3245ad) ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).fetchRoom(hashMap).mo19297a((C7494t<T, ? extends R>) mo13033u())).mo10183a(new C4588ce(this, bdVar), new C4589cf(this, bdVar));
                                                break;
                                            } else {
                                                ((C3245ad) ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).reply(bdVar.f23327i, this.f13185d.getId(), i, bdVar.f23332n).mo19297a((C7494t<T, ? extends R>) mo13033u())).mo10183a(new C4586cc(i, bdVar), new C4587cd(this));
                                                return;
                                            }
                                        }
                                        break;
                                    case 102:
                                        if (this.f13186e && this.f13182a.f11667e != 0) {
                                            this.f13182a.f11676n = bdVar.f23322d;
                                            this.f13182a.f11677o = bdVar.f23323e;
                                            this.f13182a.f11671i = true;
                                            if (bdVar.f23333o == 1 && LinkCrossRoomDataHolder.m13782a().f11667e != 0) {
                                                this.f13182a.f11678p = bdVar.f23317A;
                                            }
                                            ((C4564a) mo9140c()).mo12427a(bdVar.f23333o);
                                            break;
                                        }
                                }
                            } else {
                                if (!this.f13186e) {
                                    HashMap hashMap2 = new HashMap();
                                    C8435g gVar = new C8435g();
                                    if (this.f13182a.f11672j > 0 && this.f13182a.f11680r == 0) {
                                        gVar.mo21591a(LinkCrossRoomDataHolder.m13782a().f11669g);
                                    }
                                    hashMap2.put("watch_connection_duration", String.valueOf((System.currentTimeMillis() - LinkCrossRoomDataHolder.m13782a().f11686x) / 1000));
                                    C8443c.m25663a().mo21606a("connection_watch_duration", hashMap2, new C8438j().mo21598a("live_detail").mo21599b("live").mo21603f("other"), gVar, this.f13182a.mo11449b(), Room.class);
                                }
                                C8543ce a = C4270b.m14421a(this.f13185d.getId(), bdVar.f23339u);
                                a.baseMessage = bdVar.baseMessage;
                                if (this.f14276h != null) {
                                    this.f14276h.insertMessage(a, true);
                                }
                                if (bdVar.f23338t) {
                                    C9049ap.m27022a((int) R.string.ewe);
                                } else {
                                    C9049ap.m27022a((int) R.string.evr);
                                }
                            }
                        } else if (!this.f13182a.f11671i && this.f13182a.f11665c == bdVar.f23327i && this.f13186e && this.f13182a.f11680r == 2) {
                            m15205d();
                        }
                    } else if (bdVar.f23337s != 2) {
                        ((C4564a) mo9140c()).mo12436f();
                    }
                    return;
                }
                ((C4564a) mo9140c()).mo12426a();
                HashMap hashMap3 = new HashMap();
                hashMap3.put("room_id", this.f13185d.getIdStr());
                hashMap3.put("event", "LinkControlPresenter LinkMicMessageExtra.TYPE_TURN_ON");
                hashMap3.put("anchor_id", String.valueOf(this.f13185d.getOwnerUserId()));
                C8444d.m25673b().mo9999a("ttlive_pk", (Map<String, ?>) hashMap3);
            } else if (iMessage2 instanceof C8504ba) {
                C8504ba baVar = (C8504ba) iMessage2;
                this.f13182a.f11666d = baVar.f23299a.f25653e;
                this.f13182a.f11674l = baVar.f23299a.f25652d;
                this.f13182a.f11672j = baVar.f23299a.f25650b;
                this.f13182a.f11673k = baVar.f23299a.f25651c;
                this.f13182a.f11665c = baVar.f23299a.f25649a;
                if (baVar.f23299a.f25652d == 0) {
                    C3166a.m11965d("ttlive_pk", C2317a.m9932a().mo15979b((Object) baVar));
                }
                this.f14275g.lambda$put$1$DataCenter("data_interact_debug_info", new C4449s(true, ""));
                if (baVar.f23299a.f25654f == 2) {
                    this.f13182a.f11660B = baVar.f23299a.f25657i;
                    this.f13182a.f11680r = 2;
                    m15203b(this.f13182a.f11665c);
                    this.f14275g.lambda$put$1$DataCenter("data_pk_chiji_stage", Integer.valueOf(3));
                    this.f13182a.f11686x = System.currentTimeMillis();
                    if (!this.f13186e) {
                        C8443c.m25663a().mo21607a("pk_transform", new C8438j().mo21599b("live_function").mo21598a("live_detail"), this.f13182a.mo11449b(), Room.class);
                    } else {
                        C8435g gVar2 = new C8435g();
                        if (this.f13185d.getId() == this.f13182a.f11665c) {
                            gVar2.mo21594b(this.f13185d.getOwner().getId()).mo21596c(this.f13182a.f11667e);
                        } else {
                            gVar2.mo21594b(this.f13182a.f11667e).mo21596c(this.f13185d.getOwner().getId());
                        }
                        gVar2.mo21592a(Boolean.valueOf(this.f13182a.f11687y));
                        this.f13182a.f11686x = System.currentTimeMillis();
                        C8443c.m25663a().mo21607a("connection_success", gVar2, LinkCrossRoomDataHolder.m13782a().mo11449b(), Room.class);
                    }
                }
                if (!this.f13186e && this.f13182a.f11672j == 0) {
                    LinkCrossRoomDataHolder.m13782a().f11680r = (int) baVar.f23299a.f25654f;
                    C8443c.m25663a().mo21607a("connection_transform", new C8438j().mo21599b("live").mo21603f("other").mo21598a("live_detail"), new C8435g(), LinkCrossRoomDataHolder.m13782a().mo11449b(), Room.class);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12402a(long j, Throwable th) throws Exception {
        m15200a(j);
        C4484aj.m14996b(th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12401a(long j, C3479d dVar) throws Exception {
        ((C4564a) mo9140c()).mo12429a((ChiJiPermissionData) dVar.data, null);
        C4484aj.m14999d(System.currentTimeMillis() - j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12414b(long j, C3479d dVar) throws Exception {
        C4484aj.m14986a(SystemClock.uptimeMillis() - j);
        this.f13182a.lambda$put$1$DataCenter("cmd_log_link", "OPEN_BATTLE_SUCCEED");
    }

    /* renamed from: a */
    static final /* synthetic */ void m15201a(C8508bd bdVar, C3479d dVar) throws Exception {
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "REPLY_SUCCEED");
        hashMap.put(C38347c.f99553h, Integer.valueOf(6));
        hashMap.put("accesskey", ((C4856g) dVar.data).f13886a);
        hashMap.put("link_mic_id", Integer.valueOf(((C4856g) dVar.data).f13887b));
        hashMap.put("channel_id", Long.valueOf(bdVar.f23327i));
        C8444d.m25673b().mo9999a("ttlive_pk", (Map<String, ?>) hashMap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12416b(C8508bd bdVar, C3479d dVar) throws Exception {
        if (dVar != null) {
            ((C4564a) mo9140c()).mo12428a(bdVar.f23327i, dVar, bdVar.f23342x, bdVar.f23343y, bdVar.f23318B);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12413b(long j, long j2, C3479d dVar) throws Exception {
        m15200a(j);
        C4484aj.m14995b(SystemClock.uptimeMillis() - j2);
    }

    public C4563bh(Room room, boolean z, LiveMode liveMode) {
        this.f13185d = room;
        this.f13186e = z;
        this.f13189j = liveMode;
        this.f13188i = C2317a.m9932a();
    }

    /* renamed from: a */
    static final /* synthetic */ void m15199a(int i, C8508bd bdVar, C3479d dVar) throws Exception {
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "REPLY_SUCCEED");
        hashMap.put(C38347c.f99553h, Integer.valueOf(i));
        hashMap.put("accesskey", ((C4856g) dVar.data).f13886a);
        hashMap.put("link_mic_id", Integer.valueOf(((C4856g) dVar.data).f13887b));
        hashMap.put("confluence_type", Integer.valueOf(((C4856g) dVar.data).f13889d));
        hashMap.put("channel_id", Long.valueOf(bdVar.f23327i));
        C8444d.m25673b().mo9999a("ttlive_pk", (Map<String, ?>) hashMap);
    }
}
