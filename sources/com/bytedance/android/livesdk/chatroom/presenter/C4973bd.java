package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.network.response.C3478c;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.LuckyBoxApi;
import com.bytedance.android.livesdk.chatroom.event.C4416ah;
import com.bytedance.android.livesdk.chatroom.model.C4865aa;
import com.bytedance.android.livesdk.chatroom.model.C4930z;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.android.livesdk.config.C5864b;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.log.p405b.C8439k;
import com.bytedance.android.livesdk.message.model.C8512bh;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.user.C8976b.C8977a;
import com.bytedance.android.livesdk.user.C8976b.C8978b;
import com.bytedance.android.livesdk.user.C8985f;
import com.bytedance.android.livesdk.utils.C9074l;
import com.bytedance.android.livesdk.utils.p425a.C9023a;
import com.bytedance.android.livesdk.utils.p426b.C9057b;
import com.bytedance.android.livesdk.utils.p426b.C9058c;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C9500b;
import com.bytedance.android.livesdkapi.p437d.C9295a;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7497x;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bd */
public final class C4973bd extends C5017ci<C4976b> implements OnMessageListener {

    /* renamed from: b */
    private static final C4975a f14189b = new C4975a() {
        /* renamed from: a */
        public final void mo12987a(FollowPair followPair) {
        }

        /* renamed from: a */
        public final void mo12988a(Throwable th) {
        }
    };

    /* renamed from: a */
    public C4975a f14190a;

    /* renamed from: c */
    private final int f14191c = ((Integer) C5864b.f17247B.mo10240a()).intValue();

    /* renamed from: d */
    private Map<Long, C4977c> f14192d = new HashMap();

    /* renamed from: e */
    private List<C8512bh> f14193e = new ArrayList();

    /* renamed from: f */
    private List<C8512bh> f14194f = new ArrayList();

    /* renamed from: i */
    private Room f14195i;

    /* renamed from: j */
    private boolean f14196j;

    /* renamed from: k */
    private String f14197k;

    /* renamed from: l */
    private boolean f14198l;

    /* renamed from: m */
    private boolean f14199m;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bd$a */
    public interface C4975a {
        /* renamed from: a */
        void mo12987a(FollowPair followPair);

        /* renamed from: a */
        void mo12988a(Throwable th);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bd$b */
    public interface C4976b extends C5595at {
        /* renamed from: a */
        void mo12989a();

        /* renamed from: a */
        void mo12990a(C4977c cVar);

        /* renamed from: a */
        void mo12991a(C8512bh bhVar);

        /* renamed from: b */
        void mo12992b();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bd$c */
    public static class C4977c {

        /* renamed from: a */
        public C8512bh f14200a;

        /* renamed from: b */
        public C7492s<Integer> f14201b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l_ */
    public final String mo12985l_() {
        return "MagicBoxPresenter";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12976a(C8512bh bhVar, C4977c cVar, Integer num) throws Exception {
        if (num.intValue() == 0) {
            bhVar.f23383v = true;
            cVar.f14201b = null;
            if (bhVar.baseMessage == null) {
                bhVar.baseMessage = C9500b.m28035a(this.f14195i.getId(), true);
            }
            if (this.f14276h != null) {
                this.f14276h.insertMessage(bhVar, true);
            }
            this.f14194f.remove(bhVar);
            if (this.f14192d.get(Long.valueOf(bhVar.f23363b)) != null) {
                this.f14193e.add(0, bhVar);
                ((C4976b) mo9140c()).mo12992b();
                m16003c(bhVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12978a(FollowPair followPair) throws Exception {
        this.f14198l = false;
        m16005h().mo12987a(followPair);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12979a(Throwable th) throws Exception {
        this.f14198l = false;
        m16005h().mo12988a(th);
    }

    /* renamed from: b */
    public final void mo12982b() {
        this.f14190a = null;
        this.f14198l = false;
    }

    /* renamed from: h */
    private C4975a m16005h() {
        if (this.f14190a == null) {
            return f14189b;
        }
        return this.f14190a;
    }

    /* renamed from: d */
    public final int mo12983d() {
        return this.f14194f.size() + this.f14193e.size();
    }

    /* renamed from: g */
    private void m16004g() {
        ((C3245ad) ((LuckyBoxApi) C9178j.m27302j().mo22373b().mo10440a(LuckyBoxApi.class)).fetchCurrentList(this.f14195i.getId()).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19297a((C7494t<T, ? extends R>) mo13032t())).mo10183a(new C4982bi(this), new C4983bj(this));
    }

    /* renamed from: a */
    public final void mo8963a() {
        this.f14192d.clear();
        this.f14193e.clear();
        this.f14194f.clear();
        this.f14190a = null;
        this.f14198l = false;
        this.f14199m = false;
        super.mo8963a();
    }

    /* renamed from: e */
    public final C4977c mo12984e() {
        if (this.f14193e.size() > 0) {
            return (C4977c) this.f14192d.get(Long.valueOf(((C8512bh) this.f14193e.get(0)).f23363b));
        }
        if (this.f14194f.size() > 0) {
            return (C4977c) this.f14192d.get(Long.valueOf(((C8512bh) this.f14194f.get(0)).f23363b));
        }
        return null;
    }

    /* renamed from: a */
    public static long m16000a(C8512bh bhVar) {
        return (bhVar.f23364c + ((long) (bhVar.f23365d * 1000))) - C9023a.m26968a();
    }

    /* renamed from: b */
    private void m16002b(C8512bh bhVar) {
        this.f14192d.remove(Long.valueOf(bhVar.f23363b));
        this.f14194f.remove(bhVar);
        this.f14193e.remove(bhVar);
        ((C4976b) mo9140c()).mo12992b();
    }

    /* renamed from: c */
    private void m16003c(C8512bh bhVar) {
        ((C3245ad) C7492s.m23295b((long) this.f14191c, TimeUnit.SECONDS).mo19294a(C47549a.m148327a()).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19297a((C7494t<T, ? extends R>) mo13032t())).mo10183a(new C4980bg(this, bhVar), new C4981bh(this));
    }

    /* renamed from: a */
    public final C7492s<C3479d<C4930z>> mo12971a(C4977c cVar) {
        return ((C9057b) ((LuckyBoxApi) C9178j.m27302j().mo22373b().mo10440a(LuckyBoxApi.class)).fetchRushedList(cVar.f14200a.f23363b, this.f14195i.getId(), cVar.f14200a.f23366e).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19297a((C7494t<T, ? extends R>) C9058c.m27059a())).mo22248a();
    }

    /* renamed from: b */
    public final int mo12980b(long j) {
        if (this.f14192d.containsKey(Long.valueOf(j))) {
            return mo12983d() - 1;
        }
        return mo12983d();
    }

    /* renamed from: b */
    public final C7492s<C3479d<C4865aa>> mo12981b(C4977c cVar) {
        C7492s<C3479d<C4865aa>> a = ((C9057b) ((LuckyBoxApi) C9178j.m27302j().mo22373b().mo10440a(LuckyBoxApi.class)).rush(cVar.f14200a.f23363b, this.f14195i.getId(), cVar.f14200a.f23366e, cVar.f14200a.f23364c, cVar.f14200a.f23365d, this.f14195i.getLabels()).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19297a((C7494t<T, ? extends R>) C9058c.m27059a())).mo22248a();
        ((C3245ad) a.mo19297a((C7494t<T, ? extends R>) mo13032t())).mo10183a(new C4988bo(this, cVar), new C4989bp(this));
        return a;
    }

    public final void onEvent(C4416ah ahVar) {
        switch (ahVar.f12836a) {
            case 0:
                ((C4976b) mo9140c()).mo12989a();
                return;
            case 1:
                C8512bh bhVar = (C8512bh) ahVar.f12837b;
                C4977c cVar = (C4977c) this.f14192d.get(Long.valueOf(bhVar.f23363b));
                if (cVar == null) {
                    C4977c cVar2 = new C4977c();
                    cVar2.f14200a = bhVar;
                    ((C4976b) mo9140c()).mo12990a(cVar2);
                    break;
                } else {
                    ((C4976b) mo9140c()).mo12990a(cVar);
                    return;
                }
        }
    }

    /* renamed from: a */
    public final void mo12972a(long j) {
        if (!this.f14198l) {
            this.f14198l = true;
            ((C3245ad) TTLiveSDKContext.getHostService().mo22367h().mo22168a(((C8978b) ((C8978b) ((C8978b) ((C8978b) ((C8978b) ((C8977a) C8985f.m26861a().mo22153a(j)).mo22154a(this.f14195i.getRequestId())).mo22157b("live_detail")).mo22158c("")).mo22156b(0)).mo22159d("live")).mo22160c()).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19297a((C7494t<T, ? extends R>) mo13032t())).mo10183a(new C4986bm(this), new C4987bn(this));
            if (C9074l.m27086b(this.f14275g) && j == this.f14195i.author().getId()) {
                C3596c.m13172a(C9295a.class);
                C9074l.m27087c(this.f14275g);
            }
        }
    }

    public final void onMessage(IMessage iMessage) {
        C8512bh bhVar = (C8512bh) iMessage;
        if (!bhVar.f23383v && this.f14192d.get(Long.valueOf(bhVar.f23363b)) == null) {
            if (bhVar.f23370i && !bhVar.f23384w) {
                ((C4976b) mo9140c()).mo12991a(bhVar);
            }
            C4977c cVar = new C4977c();
            cVar.f14200a = bhVar;
            if (bhVar.f23365d <= 0 || m16000a(bhVar) <= 0) {
                if (bhVar.f23369h > 0) {
                    this.f14193e.add(0, bhVar);
                } else {
                    this.f14193e.add(bhVar);
                }
                m16003c(bhVar);
            } else {
                if (bhVar.f23369h > 0) {
                    this.f14194f.add(0, bhVar);
                } else {
                    boolean z = true;
                    int size = this.f14194f.size() - 1;
                    while (true) {
                        if (size < 0) {
                            z = false;
                            break;
                        }
                        if (m16000a(bhVar) >= m16000a((C8512bh) this.f14194f.get(size))) {
                            this.f14194f.add(size + 1, bhVar);
                            break;
                        }
                        size--;
                    }
                    if (!z) {
                        this.f14194f.add(0, bhVar);
                    }
                }
                long a = m16000a(bhVar);
                int i = (int) (a / 1000);
                cVar.f14201b = ((C9057b) C9057b.m27050a(0, 1, TimeUnit.SECONDS).mo19320e(a % 1000, TimeUnit.MILLISECONDS).mo19305c((long) (i + 1)).mo19317d((C7327h<? super T, ? extends R>) new C4979bf<Object,Object>(i)).mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) C9058c.m27059a())).mo22248a();
                ((C3245ad) cVar.f14201b.mo19297a((C7494t<T, ? extends R>) mo13032t())).mo10183a(new C4984bk(this, bhVar, cVar), new C4985bl(this));
            }
            this.f14192d.put(Long.valueOf(bhVar.f23363b), cVar);
            ((C4976b) mo9140c()).mo12992b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12973a(C3478c cVar) throws Exception {
        for (C8512bh bhVar : cVar.f10296b) {
            bhVar.timestamp = cVar.f10297c.now;
            if (bhVar.f23370i) {
                bhVar.f23384w = true;
            }
            onMessage(bhVar);
        }
    }

    /* renamed from: a */
    public final void mo9142a(C4976b bVar) {
        super.mo9142a(bVar);
        this.f14195i = (Room) this.f14275g.get("data_room");
        this.f14196j = ((Boolean) this.f14275g.get("data_is_anchor")).booleanValue();
        this.f14197k = (String) this.f14275g.get("data_enter_source");
        if (this.f14276h != null) {
            this.f14276h.addMessageListener(MessageType.LUCKY_BOX.getIntType(), this);
        }
        ((C3245ad) C9097a.m27146a().mo22266a(C4416ah.class).mo19297a((C7494t<T, ? extends R>) mo13032t())).mo10182a((C7326g<? super T>) new C4978be<Object>(this));
        if (!this.f14196j) {
            m16004g();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12977a(C8512bh bhVar, Long l) throws Exception {
        m16002b(bhVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12975a(C4977c cVar, C3479d dVar) throws Exception {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        cVar.f14200a.f23385x = (C4865aa) dVar.data;
        m16002b(cVar.f14200a);
        ((C4976b) mo9140c()).mo12992b();
        HashMap hashMap = new HashMap();
        String str6 = "is_success";
        if (((C4865aa) dVar.data).f13913a) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put(str6, str);
        hashMap.put("money", String.valueOf(((C4865aa) dVar.data).f13917e));
        String str7 = "redpackage_type";
        if (cVar.f14200a.f23365d > 0) {
            str2 = "countdown_five";
        } else {
            str2 = "immediate";
        }
        hashMap.put(str7, str2);
        if (cVar.f14200a.f23366e <= 1) {
            String str8 = "redpackage_content";
            if (cVar.f14200a.f23366e == 1) {
                str5 = "gift_redpackage";
            } else {
                str5 = "lucky_redpackage";
            }
            hashMap.put(str8, str5);
        }
        if (!(this.f14195i.getOwner() == null || cVar.f14200a.f23362a == null)) {
            String str9 = "is_anchor";
            if (this.f14195i.getOwner().getId() == cVar.f14200a.f23362a.getId()) {
                str4 = "1";
            } else {
                str4 = "0";
            }
            hashMap.put(str9, str4);
        }
        C8443c a = C8443c.m25663a();
        String str10 = "redpackage_grab";
        Object[] objArr = new Object[3];
        C8438j jVar = new C8438j();
        if (this.f14196j) {
            str3 = "live_take_detail";
        } else {
            str3 = "live_detail";
        }
        objArr[0] = jVar.mo21598a(str3).mo21602e(this.f14197k).mo21603f("other").mo21599b("live_function").mo21600c("popup");
        objArr[1] = new C8439k();
        objArr[2] = Room.class;
        a.mo21606a(str10, hashMap, objArr);
    }
}
