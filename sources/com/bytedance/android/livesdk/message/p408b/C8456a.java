package com.bytedance.android.livesdk.message.p408b;

import android.support.p022v4.util.C0893e;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.gift.C8282s;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.C7872f;
import com.bytedance.android.livesdk.gift.assets.C7874h;
import com.bytedance.android.livesdk.gift.assets.C7874h.C7875a;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.message.C8451a;
import com.bytedance.android.livesdk.message.model.C8472a;
import com.bytedance.android.livesdk.message.model.C8489ao;
import com.bytedance.android.livesdk.message.model.C8538c;
import com.bytedance.common.utility.C6311g;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.message.b.a */
public final class C8456a implements C8451a {

    /* renamed from: a */
    public C7874h f23141a = C7872f.m24128a("effects");

    /* renamed from: b */
    public List<Long> f23142b = new ArrayList();

    /* renamed from: c */
    public IMessageManager f23143c;

    /* renamed from: d */
    private final boolean f23144d;

    /* renamed from: e */
    private C0893e<List<C8538c>> f23145e = new C0893e<>();

    /* renamed from: f */
    private C7875a f23146f = new C7875a() {
        /* renamed from: a */
        public final void mo20666a(List<AssetsModel> list) {
            Iterator it = C8456a.this.f23142b.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                if (C8456a.this.f23141a.mo20662c(longValue) != null) {
                    List<C8538c> a = C8456a.this.mo21630a(longValue);
                    if (!C6311g.m19573a(a) && C8456a.this.f23143c != null) {
                        for (C8538c insertMessage : a) {
                            C8456a.this.f23143c.insertMessage(insertMessage, true);
                        }
                    }
                } else {
                    StringBuilder sb = new StringBuilder("拉不到该特效资源  assetId = ");
                    sb.append(longValue);
                    C3166a.m11966e("AssetsInterceptor", sb.toString());
                }
                C8456a.this.mo21631b(longValue);
                it.remove();
            }
        }
    };

    /* renamed from: g */
    private long f23147g;

    /* renamed from: a */
    public final void mo21618a() {
        if (this.f23141a != null) {
            this.f23141a.mo20661b(this.f23146f);
        }
        this.f23143c = null;
    }

    /* renamed from: a */
    public final void mo21619a(IMessageManager iMessageManager) {
        this.f23143c = iMessageManager;
    }

    /* renamed from: a */
    public final List<C8538c> mo21630a(long j) {
        return (List) this.f23145e.mo3327a(j);
    }

    /* renamed from: b */
    public final void mo21631b(long j) {
        List list = (List) this.f23145e.mo3327a(j);
        if (list != null) {
            list.clear();
        }
    }

    public C8456a(boolean z) {
        this.f23141a.mo20657a(this.f23146f);
        this.f23144d = z;
    }

    public final boolean onMessage(IMessage iMessage) {
        if (this.f23147g <= 0) {
            this.f23147g = ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b();
        }
        if (this.f23147g > 0 && (iMessage instanceof C8489ao)) {
            C8489ao aoVar = (C8489ao) iMessage;
            if (!aoVar.f23265n && aoVar.f23252a != null && this.f23147g == aoVar.f23252a.getId() && aoVar.f23258g != 1) {
                return true;
            }
        }
        if (iMessage instanceof C8489ao) {
            C8489ao aoVar2 = (C8489ao) iMessage;
            C8149d findGiftById = GiftManager.inst().findGiftById(aoVar2.f23254c);
            if (findGiftById == null) {
                this.f23143c.insertMessage(iMessage);
                return true;
            } else if ((findGiftById.f22234e != 2 && findGiftById.f22234e != 8) || findGiftById.f22233d == 998 || this.f23141a.mo20662c(findGiftById.f22247r) != null) {
                return false;
            } else {
                C8282s.m25311a(aoVar2.f23254c, findGiftById.f22247r);
                m25708a(aoVar2, findGiftById.f22247r);
                this.f23142b.add(Long.valueOf(findGiftById.f22247r));
                this.f23141a.mo20654a(4, this.f23144d);
                return true;
            }
        } else if (!(iMessage instanceof C8472a)) {
            return false;
        } else {
            C8472a aVar = (C8472a) iMessage;
            if (this.f23141a.mo20662c(aVar.f23186a) != null) {
                return false;
            }
            m25708a(aVar, aVar.f23186a);
            this.f23142b.add(Long.valueOf(aVar.f23186a));
            this.f23141a.mo20654a(4, this.f23144d);
            return true;
        }
    }

    /* renamed from: a */
    private void m25708a(C8538c cVar, long j) {
        List list = (List) this.f23145e.mo3327a(j);
        if (list == null) {
            list = new ArrayList();
            this.f23145e.mo3333b(j, list);
        }
        list.add(cVar);
    }
}
