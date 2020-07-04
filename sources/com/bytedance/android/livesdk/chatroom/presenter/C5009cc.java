package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.VoteApi;
import com.bytedance.android.livesdk.chatroom.model.C4889av;
import com.bytedance.android.livesdk.chatroom.model.C4890aw;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.message.model.C8491aq;
import com.bytedance.android.livesdk.message.model.C8492ar;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.p426b.C9057b;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6311g;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7494t;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.cc */
public final class C5009cc extends C5017ci<C5010a> implements OnMessageListener {

    /* renamed from: a */
    public int f14254a;

    /* renamed from: b */
    private Room f14255b;

    /* renamed from: c */
    private long f14256c;

    /* renamed from: d */
    private long f14257d;

    /* renamed from: e */
    private C4889av f14258e;

    /* renamed from: f */
    private long f14259f;

    /* renamed from: i */
    private long f14260i;

    /* renamed from: j */
    private C7321c f14261j;

    /* renamed from: k */
    private C7321c f14262k;

    /* renamed from: l */
    private boolean f14263l;

    /* renamed from: m */
    private boolean f14264m;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.cc$a */
    public interface C5010a extends C5595at {
        /* renamed from: a */
        void mo13021a();

        /* renamed from: a */
        void mo13022a(long j);

        /* renamed from: a */
        void mo13023a(long j, long j2);

        /* renamed from: a */
        void mo13024a(C4889av avVar, long j, boolean z);

        /* renamed from: a */
        void mo13025a(IMessage iMessage);

        /* renamed from: b */
        void mo13026b(long j);

        /* renamed from: b */
        void mo13027b(long j, long j2);

        /* renamed from: c */
        void mo13028c(long j);
    }

    /* renamed from: a */
    public final void mo8963a() {
        super.mo8963a();
    }

    /* renamed from: d */
    private void m16071d() {
        ((C5010a) mo9140c()).mo13024a(this.f14258e, this.f14259f, this.f14264m);
    }

    /* renamed from: b */
    public final long mo13019b() {
        if (this.f14258e != null) {
            return this.f14258e.f14001a;
        }
        return 0;
    }

    /* renamed from: g */
    private void m16073g() {
        ((C5010a) mo9140c()).mo13028c((long) ((int) (this.f14259f / 1)));
    }

    /* renamed from: e */
    private void m16072e() {
        boolean z;
        if (this.f14260i != 0) {
            this.f14259f -= (System.currentTimeMillis() - this.f14260i) / 1000;
            this.f14260i = 0;
        }
        ((C5010a) mo9140c()).mo13022a(this.f14259f);
        if (this.f14259f >= 9) {
            z = true;
        } else {
            z = false;
        }
        this.f14261j = ((C3245ad) C9057b.m27053a(1, TimeUnit.SECONDS).mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) mo13032t())).mo10182a((C7326g<? super T>) new C5013cf<Object>(this, z));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13020b(Long l) throws Exception {
        mo13014a(1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13016a(Long l) throws Exception {
        mo13014a(0);
    }

    /* renamed from: b */
    private void m16070b(long j) {
        ((C5010a) mo9140c()).mo13027b(this.f14256c, this.f14257d);
        this.f14262k = ((C3245ad) C7492s.m23295b(10, TimeUnit.SECONDS).mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) mo13032t())).mo10182a((C7326g<? super T>) new C5014cg<Object>(this));
    }

    /* renamed from: a */
    public final void mo9142a(C5010a aVar) {
        super.mo9142a(aVar);
        this.f14263l = ((Boolean) this.f14275g.get("data_is_anchor", Boolean.valueOf(false))).booleanValue();
        if (this.f14276h != null) {
            this.f14276h.addMessageListener(MessageType.GIFT_VOTE_MESSAGE.getIntType(), this);
        }
        this.f14255b = (Room) this.f14275g.get("data_room", null);
        m16069a(false);
    }

    /* renamed from: a */
    private void m16069a(boolean z) {
        String str;
        VoteApi voteApi = (VoteApi) C9178j.m27302j().mo22373b().mo10440a(VoteApi.class);
        String idStr = this.f14255b.getIdStr();
        if (this.f14258e == null) {
            str = "0";
        } else {
            str = String.valueOf(this.f14258e.f14001a);
        }
        ((C3245ad) voteApi.listVote(idStr, str).mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) mo13032t())).mo10183a(new C5011cd(this, z), C3303k.m12377b());
    }

    /* renamed from: a */
    private void m16068a(long j) {
        long j2 = this.f14258e.f14003c - (j / 1000);
        if (!this.f14263l) {
            HashMap hashMap = new HashMap();
            hashMap.put("user_id", String.valueOf(TTLiveSDKContext.getHostService().mo22367h().mo22179b()));
            C8443c.m25663a().mo21606a("livesdk_audiencepollicon_show", hashMap, Room.class, C8438j.class);
        }
        if (j2 >= 5) {
            this.f14259f = j2;
            this.f14260i = System.currentTimeMillis();
            ((C3245ad) C7492s.m23295b(500, TimeUnit.MILLISECONDS).mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) mo13032t())).mo10182a((C7326g<? super T>) new C5012ce<Object>(this));
        } else if (j2 > 0) {
            this.f14259f = j2;
            mo13014a(2);
        } else {
            if (j2 + 10 > 0) {
                if (!this.f14263l) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("remaining_time", "0");
                    hashMap2.put("is_halt", "0");
                    hashMap2.put("user_id", String.valueOf(TTLiveSDKContext.getHostService().mo22367h().mo22179b()));
                    C8443c.m25663a().mo21606a("livesdk_audienceendpoll_check", hashMap2, Room.class, C8438j.class);
                } else {
                    C8443c.m25663a().mo21607a("livesdk_anchorendpoll_check", Room.class, C8438j.class);
                }
                mo13014a(4);
            }
        }
    }

    /* renamed from: a */
    public final void mo13014a(int i) {
        this.f14254a = i;
        if (this.f14275g != null) {
            this.f14275g.lambda$put$1$DataCenter("data_vote_state", Integer.valueOf(i));
            switch (i) {
                case 0:
                    this.f14258e = null;
                    this.f14259f = 0;
                    this.f14256c = 0;
                    this.f14257d = 0;
                    if (this.f14261j != null && !this.f14261j.isDisposed()) {
                        this.f14261j.dispose();
                    }
                    if (this.f14262k != null && !this.f14262k.isDisposed()) {
                        this.f14262k.dispose();
                    }
                    ((C5010a) mo9140c()).mo13021a();
                    return;
                case 1:
                    m16071d();
                    return;
                case 2:
                    m16072e();
                    return;
                case 3:
                    m16073g();
                    return;
                case 4:
                    m16070b(10);
                    break;
            }
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (mo9140c() != null && (iMessage instanceof C8491aq)) {
            C8491aq aqVar = (C8491aq) iMessage;
            if (mo9140c() != null && aqVar.f23270c != null && aqVar.f23270c.size() >= 2) {
                ((C5010a) mo9140c()).mo13025a((IMessage) aqVar);
                switch ((int) aqVar.f23268a) {
                    case 1:
                        if (this.f14254a == 0) {
                            this.f14258e = new C4889av();
                            this.f14258e.f14001a = aqVar.f23269b;
                            this.f14258e.f14003c = aqVar.f23271d;
                            this.f14258e.f14002b = aqVar.f23270c;
                            this.f14256c = ((C8492ar) this.f14258e.f14002b.get(0)).f23273b;
                            this.f14257d = ((C8492ar) this.f14258e.f14002b.get(1)).f23273b;
                            this.f14264m = true;
                            m16068a(aqVar.timestamp);
                            return;
                        } else if (this.f14254a == 4) {
                            mo13014a(0);
                            this.f14258e = new C4889av();
                            this.f14258e.f14001a = aqVar.f23269b;
                            this.f14258e.f14003c = aqVar.f23271d;
                            this.f14258e.f14002b = aqVar.f23270c;
                            this.f14256c = ((C8492ar) this.f14258e.f14002b.get(0)).f23273b;
                            this.f14257d = ((C8492ar) this.f14258e.f14002b.get(1)).f23273b;
                            this.f14264m = true;
                            m16068a(aqVar.timestamp);
                            return;
                        } else if (this.f14258e != null && aqVar.f23269b == this.f14258e.f14001a) {
                            this.f14256c = ((C8492ar) aqVar.f23270c.get(0)).f23273b;
                            this.f14257d = ((C8492ar) aqVar.f23270c.get(1)).f23273b;
                            return;
                        }
                    case 2:
                        if (!(this.f14254a == 0 || this.f14258e == null || this.f14258e.f14001a != aqVar.f23269b)) {
                            this.f14256c = (long) ((int) ((C8492ar) aqVar.f23270c.get(0)).f23273b);
                            this.f14257d = ((C8492ar) aqVar.f23270c.get(1)).f23273b;
                            if (this.f14261j != null && !this.f14261j.isDisposed()) {
                                this.f14261j.dispose();
                            }
                            if (!this.f14263l) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("remaining_time", String.valueOf(this.f14258e.f14003c - (aqVar.timestamp / 1000)));
                                hashMap.put("is_halt", "1");
                                hashMap.put("user_id", String.valueOf(TTLiveSDKContext.getHostService().mo22367h().mo22179b()));
                                C8443c.m25663a().mo21606a("livesdk_audienceendpoll_check", hashMap, Room.class, C8438j.class);
                            }
                            mo13014a(4);
                            break;
                        }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13017a(boolean z, C3479d dVar) throws Exception {
        if (mo9140c() != null) {
            if (dVar == null || dVar.data == null || C6311g.m19573a(((C4890aw) dVar.data).f14004a)) {
                if (z && this.f14258e != null) {
                    mo13014a(4);
                }
                return;
            }
            this.f14258e = (C4889av) ((C4890aw) dVar.data).f14004a.get(0);
            if (!(this.f14258e == null || this.f14258e.f14002b == null || this.f14258e.f14002b.size() <= 1)) {
                List<C8492ar> list = this.f14258e.f14002b;
                this.f14256c = (long) ((int) ((C8492ar) list.get(0)).f23273b);
                this.f14257d = (long) ((int) ((C8492ar) list.get(1)).f23273b);
                if (z) {
                    mo13014a(4);
                } else {
                    this.f14264m = false;
                    m16068a(dVar.extra.now);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13018a(boolean z, Long l) throws Exception {
        this.f14259f--;
        if (this.f14259f <= 0) {
            if (this.f14261j != null && !this.f14261j.isDisposed()) {
                this.f14261j.dispose();
            }
            if (!this.f14263l) {
                HashMap hashMap = new HashMap();
                hashMap.put("remaining_time", "0");
                hashMap.put("is_halt", "0");
                hashMap.put("user_id", String.valueOf(TTLiveSDKContext.getHostService().mo22367h().mo22179b()));
                C8443c.m25663a().mo21606a("livesdk_audienceendpoll_check", hashMap, Room.class, C8438j.class);
            } else {
                C8443c.m25663a().mo21607a("livesdk_anchorendpoll_check", Room.class, C8438j.class);
            }
            ((C5010a) mo9140c()).mo13027b(this.f14256c, this.f14257d);
            m16069a(true);
        } else if (this.f14259f > 9 || !z) {
            ((C5010a) mo9140c()).mo13026b(this.f14259f);
            ((C5010a) mo9140c()).mo13023a(this.f14256c, this.f14257d);
        } else {
            if (this.f14254a != 3) {
                mo13014a(3);
            }
            ((C5010a) mo9140c()).mo13023a(this.f14256c, this.f14257d);
        }
    }
}
