package com.bytedance.android.livesdk.message.p408b;

import android.os.Handler;
import android.os.Message;
import android.support.p022v4.util.C0893e;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.gift.C7859a;
import com.bytedance.android.livesdk.gift.C7881c;
import com.bytedance.android.livesdk.gift.C7892d;
import com.bytedance.android.livesdk.gift.C7892d.C7894a;
import com.bytedance.android.livesdk.gift.C8282s;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.message.C8451a;
import com.bytedance.android.livesdk.message.model.C8473aa;
import com.bytedance.android.livesdk.message.model.C8474ab;
import com.bytedance.android.livesdk.message.model.C8483aj;
import com.bytedance.android.livesdk.message.model.C8489ao;
import com.bytedance.android.livesdk.message.model.C8623f;
import com.bytedance.android.livesdk.message.model.C8696z;
import com.bytedance.android.livesdkapi.depend.p440c.C9301a;
import com.bytedance.android.livesdkapi.depend.p440c.C9301a.C9302a;
import com.bytedance.android.livesdkapi.host.C9456c.C9458b;
import com.bytedance.common.utility.C6311g;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.message.b.d */
public final class C8460d implements C8451a, C9302a {

    /* renamed from: a */
    public boolean f23151a;

    /* renamed from: b */
    public Handler f23152b;

    /* renamed from: c */
    public IMessageManager f23153c;

    /* renamed from: d */
    private long f23154d;

    /* renamed from: e */
    private boolean f23155e;

    /* renamed from: f */
    private C7892d f23156f;

    /* renamed from: g */
    private C0893e<List<C8489ao>> f23157g = new C0893e<>();

    /* renamed from: h */
    private LinkedList<Pair<Set<Long>, C8696z>> f23158h = new LinkedList<>();

    /* renamed from: i */
    private C8462a f23159i;

    /* renamed from: j */
    private C7894a f23160j = new C7894a() {
        /* renamed from: a */
        public final void mo20700a(long j) {
            C8460d.this.mo21635b(j);
            StringBuilder sb = new StringBuilder("can't find giftId = ");
            sb.append(j);
            C3166a.m11966e("GiftInterceptor", sb.toString());
        }

        /* renamed from: a */
        public final void mo20701a(C8149d dVar) {
            List<C8489ao> a = C8460d.this.mo21633a(dVar.f22233d);
            if (!C6311g.m19573a(a)) {
                if (C8460d.this.f23153c != null) {
                    for (C8489ao insertMessage : a) {
                        C8460d.this.f23153c.insertMessage(insertMessage, true);
                    }
                }
                C8460d.this.mo21635b(dVar.f22233d);
            }
        }
    };

    /* renamed from: k */
    private long f23161k;

    /* renamed from: com.bytedance.android.livesdk.message.b.d$a */
    class C8462a implements C9458b {

        /* renamed from: a */
        public Pair<Set<Long>, C8696z> f23163a;

        /* renamed from: b */
        int f23164b;

        /* renamed from: c */
        boolean f23165c;

        /* renamed from: c */
        public final void mo21638c() {
            mo21636a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo21636a() {
            C3166a.m11966e("GiftInterceptor", "DoodleGiftMessage#download doodle image fail, drop this message");
            if (!this.f23165c) {
                this.f23165c = true;
                this.f23163a = null;
                C8460d.this.f23152b.removeMessages(1);
                C8460d.this.f23151a = false;
                C8460d.this.mo21634b();
            }
        }

        /* renamed from: b */
        public final void mo21637b() {
            if (!this.f23165c) {
                this.f23164b--;
                if (this.f23164b <= 0) {
                    C3166a.m11964c("GiftInterceptor", "DoodleGiftMessage#download doodle image done, schedule DoodleGiftMessage again");
                    C8460d.this.f23152b.removeMessages(1);
                    C8460d.this.f23151a = false;
                    C8460d.this.mo21634b();
                    C8460d.this.f23152b.post(new Runnable() {
                        public final void run() {
                            C8460d.this.f23153c.insertMessage((IMessage) C8462a.this.f23163a.second, true);
                        }
                    });
                }
            }
        }

        C8462a(Pair<Set<Long>, C8696z> pair) {
            this.f23163a = pair;
            this.f23164b = ((Set) pair.first).size();
        }
    }

    /* renamed from: a */
    public final void mo21618a() {
    }

    /* renamed from: b */
    public final void mo21634b() {
        if (!this.f23158h.isEmpty() && !this.f23151a) {
            Pair pair = (Pair) this.f23158h.poll();
            if (pair != null && pair.first != null && !((Set) pair.first).isEmpty() && pair.second != null) {
                this.f23151a = true;
                this.f23159i = new C8462a(pair);
                for (Long l : (Set) pair.first) {
                    if (l != null) {
                        C7859a.m24103a(l.longValue(), this.f23159i);
                    }
                }
                this.f23152b.sendEmptyMessageDelayed(1, 60000);
            }
        }
    }

    /* renamed from: a */
    public final void mo21619a(IMessageManager iMessageManager) {
        this.f23153c = iMessageManager;
    }

    /* renamed from: a */
    public final List<C8489ao> mo21633a(long j) {
        return (List) this.f23157g.mo3327a(j);
    }

    /* renamed from: b */
    public final void mo21635b(long j) {
        List list = (List) this.f23157g.mo3327a(j);
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: a */
    private void m25714a(C8489ao aoVar) {
        List list = (List) this.f23157g.mo3327a(aoVar.f23254c);
        if (list == null) {
            list = new ArrayList();
            this.f23157g.mo3333b(aoVar.f23254c, list);
        }
        list.add(aoVar);
    }

    /* renamed from: a */
    public final void mo12403a(Message message) {
        if (message.what == 1) {
            this.f23159i.mo21636a();
            mo21634b();
        }
    }

    public final boolean onMessage(IMessage iMessage) {
        if (this.f23161k <= 0) {
            this.f23161k = ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b();
        }
        if (iMessage instanceof C8623f) {
            iMessage = ((C8623f) iMessage).f23602a;
        }
        if (this.f23161k > 0 && (iMessage instanceof C8489ao)) {
            C8489ao aoVar = (C8489ao) iMessage;
            if (!aoVar.f23265n && aoVar.f23252a != null && this.f23161k == aoVar.f23252a.getId() && aoVar.f23258g != 1) {
                return true;
            }
        }
        if (this.f23161k > 0 && (iMessage instanceof C8483aj)) {
            C8483aj ajVar = (C8483aj) iMessage;
            if (!ajVar.f23232i && ajVar.f23229f != null && ajVar.f23229f.getId() == this.f23161k) {
                return true;
            }
        }
        if (iMessage instanceof C8489ao) {
            C8489ao aoVar2 = (C8489ao) iMessage;
            StringBuilder sb = new StringBuilder("收到 GiftMessage: ");
            sb.append(aoVar2.toString());
            C3166a.m11964c("GiftInterceptor", sb.toString());
            if (aoVar2.f23252a == null) {
                StringBuilder sb2 = new StringBuilder("giftMessage#fromUser is null! messageId = ");
                sb2.append(aoVar2.getMessageId());
                C3166a.m11966e("GiftInterceptor", sb2.toString());
                return true;
            } else if (((IGiftService) C3596c.m13172a(IGiftService.class)).findGiftById(aoVar2.f23254c) != null) {
                return false;
            } else {
                C8282s.m25326c(aoVar2.f23254c);
                m25714a(aoVar2);
                C7892d dVar = this.f23156f;
                C7881c cVar = new C7881c(aoVar2.f23254c, this.f23154d, this.f23160j);
                dVar.mo20699a(cVar);
                return true;
            }
        } else {
            if (iMessage instanceof C8696z) {
                C8696z zVar = (C8696z) iMessage;
                StringBuilder sb3 = new StringBuilder("收到 DoodleGiftMessage: ");
                sb3.append(zVar.toString());
                C3166a.m11964c("GiftInterceptor", sb3.toString());
                if (zVar.f23700a == null) {
                    StringBuilder sb4 = new StringBuilder("doodleGiftMessage#fromUser is null! messageId = ");
                    sb4.append(zVar.getMessageId());
                    C3166a.m11966e("GiftInterceptor", sb4.toString());
                    return true;
                }
                C8473aa aaVar = zVar.f23706g;
                if (aaVar == null || aaVar.f23193a == null) {
                    StringBuilder sb5 = new StringBuilder("DoodleGiftMessage#compose is null! messageId = ");
                    sb5.append(zVar.getMessageId());
                    C3166a.m11966e("GiftInterceptor", sb5.toString());
                    return true;
                }
                Set set = null;
                for (int i = 0; i < aaVar.f23193a.size(); i++) {
                    C8474ab abVar = (C8474ab) aaVar.f23193a.get(i);
                    if (TextUtils.isEmpty(C7859a.m24102a(abVar.f23198c))) {
                        if (set == null) {
                            set = new HashSet();
                        }
                        set.add(Long.valueOf(abVar.f23198c));
                    }
                }
                if (set != null && !set.isEmpty()) {
                    m25715a(zVar, set);
                    mo21634b();
                    StringBuilder sb6 = new StringBuilder("DoodleGiftMessage#intercept due to no images, ids=");
                    sb6.append(set);
                    C3166a.m11964c("GiftInterceptor", sb6.toString());
                    return true;
                }
            }
            return false;
        }
    }

    public C8460d(long j, boolean z) {
        this.f23154d = j;
        this.f23155e = z;
        this.f23156f = new C7892d(z);
        this.f23152b = new C9301a(this);
    }

    /* renamed from: a */
    private void m25715a(C8696z zVar, Set<Long> set) {
        if (zVar != null && zVar.getMessageId() > 0 && set != null && !set.isEmpty()) {
            this.f23158h.add(new Pair(set, zVar));
        }
    }
}
