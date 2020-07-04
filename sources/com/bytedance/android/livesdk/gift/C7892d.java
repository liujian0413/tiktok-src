package com.bytedance.android.livesdk.gift;

import com.bytedance.android.live.gift.C3435e;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.livesdk.gift.d */
public final class C7892d {

    /* renamed from: a */
    public boolean f21294a;

    /* renamed from: b */
    private ConcurrentHashMap<Long, Integer> f21295b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private ConcurrentHashMap<Long, List<C7881c>> f21296c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private boolean f21297d;

    /* renamed from: e */
    private C3435e f21298e = new C3435e() {
        /* renamed from: a */
        public final void mo10402a() {
            super.mo10402a();
            C7892d.this.f21294a = false;
        }

        /* renamed from: b */
        public final void mo8800b(List<GiftPage> list) {
            C7892d.this.f21294a = false;
            C7892d.this.mo20698a();
        }

        /* renamed from: a */
        public final void mo8799a(List<C8149d> list) {
            C7892d.this.f21294a = false;
            C7892d.this.mo20698a();
        }
    };

    /* renamed from: com.bytedance.android.livesdk.gift.d$a */
    public interface C7894a {
        /* renamed from: a */
        void mo20700a(long j);

        /* renamed from: a */
        void mo20701a(C8149d dVar);
    }

    /* renamed from: a */
    public final void mo20698a() {
        if (!this.f21294a) {
            for (Entry entry : this.f21295b.entrySet()) {
                if (((Integer) entry.getValue()).intValue() >= 3) {
                    for (C7881c cVar : m24181a(((Long) entry.getKey()).longValue())) {
                        C8149d findGiftById = GiftManager.inst().findGiftById(cVar.f21286a);
                        if (findGiftById == null) {
                            cVar.f21288c.mo20700a(cVar.f21286a);
                        } else {
                            cVar.f21288c.mo20701a(findGiftById);
                        }
                    }
                    this.f21296c.remove(entry.getKey());
                    this.f21295b.remove(entry.getKey());
                }
            }
            for (Entry value : this.f21296c.entrySet()) {
                Iterator it = ((List) value.getValue()).iterator();
                while (it.hasNext()) {
                    C7881c cVar2 = (C7881c) it.next();
                    C8149d findGiftById2 = GiftManager.inst().findGiftById(cVar2.f21286a);
                    if (findGiftById2 != null) {
                        cVar2.f21288c.mo20701a(findGiftById2);
                        it.remove();
                    }
                }
            }
            for (Entry entry2 : this.f21295b.entrySet()) {
                int intValue = ((Integer) entry2.getValue()).intValue();
                if (intValue < 3) {
                    long longValue = ((Long) entry2.getKey()).longValue();
                    entry2.setValue(Integer.valueOf(intValue + 1));
                    GiftManager.inst().syncGiftList(this.f21298e, longValue, 4, this.f21297d);
                    this.f21294a = true;
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo20699a(C7881c cVar) {
        m24182b(cVar);
        mo20698a();
    }

    /* renamed from: a */
    private List<C7881c> m24181a(long j) {
        return (List) this.f21296c.get(Long.valueOf(j));
    }

    public C7892d(boolean z) {
        this.f21297d = z;
    }

    /* renamed from: b */
    private void m24182b(C7881c cVar) {
        List list = (List) this.f21296c.get(Long.valueOf(cVar.f21287b));
        if (list == null) {
            list = new ArrayList();
            this.f21296c.put(Long.valueOf(cVar.f21287b), list);
            this.f21295b.put(Long.valueOf(cVar.f21287b), Integer.valueOf(0));
        }
        if (!list.contains(cVar)) {
            list.add(cVar);
        }
    }
}
